package com.jx.pub.manage.mapper;

import com.jx.pub.common.pojo.OrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Faxon
 * @version 1.0
 * @date 2020-02-03 18:04
 **/
@Mapper
public interface OrderItemMapper {

    /**
     * 批量添加订单项
     *
     * @param orderItems
     * @return
     */
    int addOrderItems(@Param("orderItems") List<OrderItem> orderItems);

}