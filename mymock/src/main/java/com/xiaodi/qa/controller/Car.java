package com.xiaodi.qa.controller;

import com.xiaodi.qa.util.FreeMarkerUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Car {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World";
    }


    @GetMapping("/freeMarker/html")
    public String freeMarkerHtml() {

        List<PermissionMenu> list = permissionMenuService.list();

        Map<String, Object> root = new HashMap<>();
        root.put("list", list);
        //根据模板生成静态html页面
        FreeMarkerUtil.processTemplate("/html/index2.ftl", root, "index2.html");

        return "forward:/static/index2.html";
    }
}
