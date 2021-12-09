package pers.cgglyle.service.acconut.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pers.cgglyle.base.model.BaseDto;

import java.util.Objects;

/**
 * 用户添加角色模型
 *
 * @author cgglyle
 * @date 2021-12-09 09:28
 */
@ApiModel("用户添加角色模型")
public class UserRoleRelationDto extends BaseDto {
    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("角色id")
    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserRoleRelationDto that = (UserRoleRelationDto) o;
        return Objects.equals(userId, that.userId) && Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userId, roleId);
    }
}
