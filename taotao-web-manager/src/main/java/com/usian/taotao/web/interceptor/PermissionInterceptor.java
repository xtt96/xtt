package com.usian.taotao.web.interceptor;

import com.usian.taotao.service.user.pojo.Permission;
import com.usian.taotao.service.user.vo.ActiveUser;
import com.usian.taotao.util.WebConstants;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 权限拦截器
 * Created by 孙圣征 on 2017/8/14.
 */
public class PermissionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       // 获取请求url
        String uri = request.getRequestURI();
        // 请求url进行和properties配置文件中的url进行对比，如果properites文件中有这些url，则放行

        if (uri.contains("/main") || uri.contains("/user/login")  || uri.contains("/error")){
            return true;
        }

        // 进行权限验证
        // 从session中获取登录后用户信息
        ActiveUser activeUser = (ActiveUser) request.getSession().getAttribute(WebConstants.ACTIVE_USER);
        List<Permission> menus = activeUser.getMenus();
        List<Permission> permissions = activeUser.getPermissions();
        for (Permission permission : permissions){
            if (uri.indexOf(permission.getUrl()) >=0){
                return true;
            }
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
