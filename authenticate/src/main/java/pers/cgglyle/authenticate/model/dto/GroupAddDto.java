package pers.cgglyle.authenticate.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import pers.cgglyle.common.base.model.BaseAddDto;

/**
 * 用户组添加模型
 *
 * @author cgglyle
 * @date 2021-12-10 11:40
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GroupAddDto extends BaseAddDto {
    @ApiModelProperty("用户组名称")
    private String groupName;

    @ApiModelProperty("用户组描述")
    private String groupDescription;
}