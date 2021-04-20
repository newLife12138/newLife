package test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("/ajax/test")
public class TestController {
    @RequestMapping(value = "/first",method = RequestMethod.GET)
    @ResponseBody
    public String test(@Valid String str){
        return "hello world " + str;
    }
}
