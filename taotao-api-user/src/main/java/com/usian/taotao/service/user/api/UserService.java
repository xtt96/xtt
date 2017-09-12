package com.usian.taotao.service.user.api;

import com.usian.taotao.vo.TaotaoResult;

/**
 * Created by Nice on 2017/8/14.
 */
public interface UserService {

    /**
     * 根据用户名和密码验证用户是否存在
     * @param usercode
     * @param password
     * @return
     */
    TaotaoResult authenticat(String usercode, String password);
}
