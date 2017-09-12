package com.usian.taotao.service.user.api.impl;

import com.usian.taotao.service.user.api.UserService;
import com.usian.taotao.service.user.mapper.UserMapper;
import com.usian.taotao.service.user.pojo.Permission;
import com.usian.taotao.service.user.pojo.User;
import com.usian.taotao.service.user.vo.ActiveUser;
import com.usian.taotao.vo.TaotaoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

/**
 * Created by Nice on 2017/8/14.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public TaotaoResult authenticat(String usercode, String password) {
        // 根据用户名查询用户
        User user = userMapper.selectByUsercode(usercode);
        if (null == user){
            return TaotaoResult.build(400, "用户不存在！");
        }
        // 验证用户密码是否正确　
        String pwd = password + user.getSalt();
        String md5edPwd = DigestUtils.md5DigestAsHex(pwd.getBytes());
        if (!md5edPwd.equalsIgnoreCase(user.getPassword())){
            return TaotaoResult.build(400, "用户名或密码不正确！");
        }

        // 登录成功进行授权
        String  userid = user.getId();
        //获取用户权限范围菜单
        List<Permission> menus = this.findMenuPermissionByUserId(userid);
        //获取用户权限范围URL
        List<Permission>  permissions = this.findUrlPermissionByUserId(userid);

        // 把登录信息存放到session
        ActiveUser activeUser = new ActiveUser();
        activeUser.setUserid(user.getId());
        activeUser.setUsercode(user.getUsercode());
        activeUser.setUsername(user.getUsername());
        activeUser.setMenus(menus);//用户权限菜单
        activeUser.setPermissions(permissions);//用户权限url
        return TaotaoResult.ok(activeUser);
    }
    private List<Permission> findUrlPermissionByUserId(String userid) {
        return userMapper.findUrlPermissionByUserId(userid);

    }
    private List<Permission> findMenuPermissionByUserId(String userid) {
        return userMapper.findMenuPermissionByUserId(userid);
    }
}
