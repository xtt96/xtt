package com.usian.taotao.service.goods.api;

import com.usian.taotao.service.goods.pojo.Item;
import com.usian.taotao.vo.DatagridResultVo;

/**
 * Created by Nice on 2017/8/11.
 */
public interface ItemService {
    /**
     * 分页查询商品
     * @param page
     * @param rows
     * @return
     */
    DatagridResultVo<Item> listItem(int page, int rows);
}
