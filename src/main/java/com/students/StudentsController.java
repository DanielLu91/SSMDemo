package com.students;

import com.students.pojos.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by yilu on 15/8/17.
 */
@Controller
@RequestMapping("/students")
public class StudentsController {
    @RequestMapping(value ="/showAllStudents" ,method = {RequestMethod.GET})
    public String showAllStudent(HttpServletRequest request, Model model,User user){
        model.addAttribute("message",user.getNumber());
        return "students";
    }

    //重定向，因为发生在客户端，url会变
    //因为在同一个类中，不需要添加根路径
    @RequestMapping("/submit")
    public String submit(@RequestParam(required = false) String number, @RequestParam(required = false) MultipartFile file, HttpServletRequest request,Model model) throws IOException {
        String originalPath=request.getSession().getServletContext().getRealPath("");
        File dir=new File(originalPath+"/imgs");
        //检查目录是否存在
        if(!dir.exists())
            dir.mkdirs();
        String type=file.getContentType();
        String typeName=type.substring(type.indexOf("/")+1);
        //上传的图片一般用过UUID处理，保证图片不重复
        String fileName= UUID.randomUUID().toString().replace("-","")+"."+typeName;
        String path=originalPath+"/imgs/"+fileName;
        file.transferTo(new File(path));
        model.addAttribute("imgPath","/imgs/"+fileName);
        return "uploadFile/result";
    }

    //url不变，注意冒号之间没有空格
    @RequestMapping("/submitForward")
    public String submitForward(){
        return "forward:showAllStudents";
    }
}
