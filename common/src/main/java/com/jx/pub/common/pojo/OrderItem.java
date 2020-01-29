package com.jx.pub.common.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * @author: Faxon
 * @data: 2020/1/27
 */
@ApiModel(value = "com-jx-pub-common-pojo-OrderItem")
@Data
public class OrderItem implements Serializable {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id")
    private String itemId;

    /**
     * 订单id
     */
    @ApiModelProperty(value = "订单id")
    private String orderId;

    /**
     * 房间id
     */
    @ApiModelProperty(value = "房间id")
    private String roomId;

    /**
     * 实际入住时间
     */
    @ApiModelProperty(value = "实际入住时间")
    private String realityComeTime;

    /**
     * 实际退房时间
     */
    @ApiModelProperty(value = "实际退房时间")
    private String realityLeaveTime;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private String itemCreatTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private String itemUpdateTime;

    private static final long serialVersionUID = -8897591827401779135L;
}