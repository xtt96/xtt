package com.usian.taotao.web.controller;

import com.usian.taotao.service.user.api.UserService;
import com.usian.taotao.service.user.vo.ActiveUser;
import com.usian.taotao.util.WebConstants;
import com.usian.taotao.vo.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by 孙圣征 on 2017/8/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @return
     */
    @RequestMapping("/login")
    public String login(HttpSession session, String usercode, String password, String randomcode, Model model){

       //判断验证码是否正确
        String validateCode = (String) session.getAttribute(WebConstants.VALIDAT_ECODE);
        if (!validateCode.equalsIgnoreCase(randomcode)) {
            model.addAttribute("message", "验证码错误!!");
            return "error";
        }
        // 调用service验证用户名密码是否正确　
        TaotaoResult result = userService.authenticat(usercode, password);
        if (result.getStatus()==400) {
            model.addAttribute("message", result.getMsg());
            return "error";
        }else{
            // 登录成功
            ActiveUser users = (ActiveUser) result.getData();
            session.setAttribute(WebConstants.ACTIVE_USER, users);
            return "redirect:/main";
        }
    }

}
