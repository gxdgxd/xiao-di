package com.xiaodi.qa.job;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by xiaodi.gou on 2022/4/6
 */

@Controller
@RequestMapping("/test")
public class Test {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public ResultData helloWorld(Model model) {

        ResultData resultData = new ResultData();
        model.addAttribute("name","xiaodi");

        resultData.setCode(200);
        return resultData;
    }

}
