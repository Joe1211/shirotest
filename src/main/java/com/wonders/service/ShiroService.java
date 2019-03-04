package com.wonders.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ClassName ShiroService
 * @Author 乔翰林
 * @Date 2019/3/1
 **/
@Service
public class ShiroService {

    /**
     * 权限注解:
     * https://blog.csdn.net/acmman/article/details/78765315
     */
    @RequiresRoles({"admin"})
    public void testMethod(){
        Session session = SecurityUtils.getSubject().getSession();
        Object value = session.getAttribute("key");
        System.out.println("testMethod,time:"+ new Date());
        System.out.println("key session:"+value);
    }
}
