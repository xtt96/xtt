package com.usian.taotao.service.goods.api.impl;

import com.github.pagehelper.Page;
import com.usian.taotao.service.goods.api.ItemService;
import com.usian.taotao.service.goods.mapper.ItemMapper;
import com.usian.taotao.service.goods.pojo.Item;
import com.usian.taotao.vo.DatagridResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Nice on 2017/8/11.
 */

@Service("itemServiceImpl")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    public DatagridResultVo<Item> listItem(int page, int rows){
        DatagridResultVo datagridResultVo = new DatagridResultVo();
        Page<Item> items = itemMapper.selectItemByPageNumSize(page, rows);
        datagridResultVo.setRows(items.getResult());
        datagridResultVo.setTotal(items.getTotal());
        return datagridResultVo;
    }
}
;