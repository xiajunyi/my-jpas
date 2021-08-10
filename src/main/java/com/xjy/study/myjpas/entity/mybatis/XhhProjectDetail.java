package com.xjy.study.myjpas.entity.mybatis;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
 * 项目详情表
 * </p>
 *
 * @author author
 * @since 2021-08-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("xhh_project_detail")
@ApiModel(value="XhhProjectDetail对象", description="项目详情表")
public class XhhProjectDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "PK")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "项目id")
    private Long projectId;

    @ApiModelProperty(value = "详情描述")
    private String detailDescribe;

    @ApiModelProperty(value = "创建人id")
    private String creatorId;

    @ApiModelProperty(value = "修改人id")
    private String updaterId;

    @ApiModelProperty(value = "插入时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除状态位,1删除0保留")
    private Boolean isDelete;

    @ApiModelProperty(value = "发布时间")
    private LocalDate publishDate;

    @ApiModelProperty(value = "地址id")
    private Long addressId;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "工时")
    private Double times;


}
