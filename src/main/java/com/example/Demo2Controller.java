package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sunwenju on 3/3/2016.
 */

//@Controller
public class Demo2Controller {

    //@RequestMapping("/")
    //@ResponseBody
    public String hello(@RequestParam(defaultValue = "World") String name, Model model) {
        model.addAttribute("message", "Hello ," + name);
        return "resultPage";
    }
}
