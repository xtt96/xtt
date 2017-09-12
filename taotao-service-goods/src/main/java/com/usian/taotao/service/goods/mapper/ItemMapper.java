package com.usian.taotao.service.goods.mapper;


import com.github.pagehelper.Page;
import com.usian.taotao.service.goods.pojo.Item;
import org.apache.ibatis.annotations.Param;

public interface ItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);


    // 注意： 分页查询方法命名：xxxxxxByPageNumSize(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize)
    Page<Item> selectItemByPageNumSize(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);

}