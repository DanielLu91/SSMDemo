package com.students;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yilu on 17/8/17.
 */
@Controller
public class JsonTest {
    //@RequestBody将json数据转换成java对象
    @RequestMapping("/json/{id}")
    public String requestJson(@PathVariable int id,Model model){
        model.addAttribute("id",id);
        return "uploadFile/result";
    }
}
