package com.usian.taotao.service.user.vo;

import com.usian.taotao.service.user.pojo.Permission;

import java.io.Serializable;
import java.util.List;

/**
 * 登录后存放在session中的用户信息
 * Created by Nice on 2017/8/14.
 */
public class ActiveUser implements Serializable {

    private String userid;//用户id（主键）
    private String usercode;// 用户账号
    private String username;// 用户名称

    private List<Permission> menus;// 菜单
    private List<Permission> permissions;// 权限

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Permission> getMenus() {
        return menus;
    }

    public void setMenus(List<Permission> menus) {
        this.menus = menus;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
