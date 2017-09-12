package com.usian.taotao.service.user.api.impl;

import org.junit.Test;
import org.springframework.util.DigestUtils;

/**
 * Created by Nice on 2017/8/14.
 */
public class UserServiceImplTest {


    @Test
    public void testAuthenticat(){
        String pwd = "123456" + "eteokues";
        String md5Pwd = DigestUtils.md5DigestAsHex(pwd.getBytes());
        System.out.println(md5Pwd);
    }
}
