//package com.example.demo.service;
//
//import cn.stylefeng.roses.core.reqres.response.ErrorResponseData;
//import cn.stylefeng.roses.kernel.model.exception.ServiceException;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import static cn.stylefeng.roses.core.util.HttpContext.getRequest;
//
///**
// * @Author xiaodi.gou
// * @create 2021/10/27 8:53 下午
// */
//@Slf4j
//@ControllerAdvice
//public class GlobalException {
//
//
//    @ExceptionHandler
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ResponseBody
//    public ErrorResponseData buziness(ServiceException e, HttpServletRequest request, HttpServletResponse response) {
//        getRequest().setAttribute("tip", e.getMessage());
//
//        pushWechat(String.format("url:%s\nmessage:%s\nexception:%s\n", request.getRequestURI(), response.getStatus(), e));
//        return new ErrorResponseData(e.getCode(), e.getMessage());
//    }
//
//    private void pushWechat(String content) {
//        System.out.println(content);
//
//    }
//
//
//}
