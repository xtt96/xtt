package com.usian.taotao.web.interceptor;

import com.usian.taotao.service.user.vo.ActiveUser;
import com.usian.taotao.util.ResourcesUtil;
import com.usian.taotao.util.WebConstants;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/** 定义登录拦截器
 * Created by 孙圣征 on 2017/8/14.
 */
public class LoginInterceptor  implements HandlerInterceptor{
    // 在调用Controller中的请求处理方法之前进行执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        System.out.println(request.getRequestURI());
        System.out.println(request.getRequestURL().toString());
       if (uri.contains("/user/login") || uri.contains("/error")){
            return true;
        }
        //判断是否是公开的url
        //实际开发中需要公开 地址配置在配置文件中
      /*  List<String> openUrls = ResourcesUtil.gekeyList("anonymousURL");
        for (String openUrl : openUrls) {
            //从配置中取逆名访问url
            if(uri.indexOf(openUrl)>=0){
                return true;
            }
        }*/


        // 从session中获取登录后用户信息
        ActiveUser activeUser = (ActiveUser) request.getSession().getAttribute(WebConstants.ACTIVE_USER);
        if (null != activeUser){
            // 放荆
            return true;
        }else{
            // 跳到登录页面
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
            return false;
        }

    }
    // 在调用Controller中的请求处理方法之后进行执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }
    // 在调用Controller中的视图完成之后进行执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
