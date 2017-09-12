package com.usian.taotao.service.user.mapper;


import com.usian.taotao.service.user.pojo.Permission;
import com.usian.taotao.service.user.pojo.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 根据usercode查询用户
     * @param usercode
     * @return
     */
    User selectByUsercode(String usercode);

    /**
     * 获取用户权限范围URL
     * @param userId
     * @return
     */
    List<Permission> findUrlPermissionByUserId(String userId);

    /**
     * 获取用户权限范围菜单
     * @param userId
     * @return
     */
    List<Permission> findMenuPermissionByUserId(String userId);
}