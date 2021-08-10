package com.xjy.study.myjpas.entity.mybatis;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author author
 * @since 2021-08-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("puppeteer_create_info")
@ApiModel(value="PuppeteerCreateInfo对象", description="")
public class PuppeteerCreateInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "pdf唯一编号")
    private String puppeteerId;

    @ApiModelProperty(value = "url")
    private String url;

    @ApiModelProperty(value = "oss地址")
    private String ossUrl;

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除标记")
    private String delFlag;

    @ApiModelProperty(value = "信息")
    private String message;

    @ApiModelProperty(value = "url的md5值")
    private String md5;

    @ApiModelProperty(value = "重试次数")
    private Integer retry;

    @ApiModelProperty(value = "url全地址")
    private String fullUrl;

    @ApiModelProperty(value = "备注")
    private String remark;


}
