package com.jx.pub.common.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Bruce
 * @version 1.0
 * @date 2020-01-30 18:39
 **/
@ApiModel(value = "com-jx-pub-common-pojo-Room")
@Data
public class Room implements Serializable {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id")
    private String roomId;

    /**
     * 类型id
     */
    @ApiModelProperty(value = "类型id")
    private String typeId;

    /**
     * 房间号
     */
    @ApiModelProperty(value = "房间号")
    private String roomNumber;

    /**
     * 房间状态 ( 0:未入住；1:已入住； )
     */
    @ApiModelProperty(value = "房间状态 ( 0:未入住；1:已入住； )")
    private String roomStatus;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private String roomCreatTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private String roomUpdateTime;

    /**
     * 房型名称
     */
    @ApiModelProperty(value = "房型名称")
    private String typeName;

    private static final long serialVersionUID = 5078352916793394196L;
}
