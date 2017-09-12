package com.usian.taotao.web.controller;

import com.usian.taotao.service.goods.api.ItemService;
import com.usian.taotao.vo.DatagridResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by 孙圣征 on 2017/8/11.
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    /**
     * 查询商品列表
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public DatagridResultVo itemList(@RequestParam(defaultValue = "1") int page,@RequestParam(defaultValue = "20")  int rows){

        return itemService.listItem(page, rows);
    }

}
