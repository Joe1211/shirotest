package com.wonders.controller;

/**
 * @ClassName shiro
 * @Author 乔翰林
 * @Date 2019/2/28
 **/
import com.wonders.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class hello {

    @Autowired
    private UserService userService;

    private static final Log logger = LogFactory.getLog(hello.class);
    @RequestMapping("/hello")
    public String sayHi(){
        logger.info("sayHi are called!");
        return "hello";
    }

    @RequestMapping("/spring_hello")
    public String springSayHi(){
        logger.info("sayHi are called by springSayHi");
        return userService.test();
    }

}
