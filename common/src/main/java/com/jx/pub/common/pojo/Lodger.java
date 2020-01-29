package com.jx.pub.common.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * @author: Faxon
 * @data: 2020/1/27
 */
@ApiModel(value = "com-jx-pub-common-pojo-Lodger")
@Data
public class Lodger implements Serializable {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id")
    private String lodgerId;

    /**
     * 入住人名称
     */
    @ApiModelProperty(value = "入住人名称")
    private String lodgerName;

    /**
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String lodgerIdNumber;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private String lodgerIdSex;

    /**
     * 订单项id
     */
    @ApiModelProperty(value = "订单项id")
    private String orderItemId;

    /**
     * 创建时间（即入住时间）
     */
    @ApiModelProperty(value = "创建时间（即入住时间）")
    private String lodgerCreatTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private String lodgerUpdateTime;

    private static final long serialVersionUID = -5858166733322294952L;
}