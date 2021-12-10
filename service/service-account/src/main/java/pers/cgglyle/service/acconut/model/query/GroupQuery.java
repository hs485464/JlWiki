package pers.cgglyle.service.acconut.model.query;

import io.swagger.annotations.ApiModelProperty;
import pers.cgglyle.base.model.BaseQuery;

import java.util.Objects;

/**
 * 用户组请求
 *
 * @author cgglyle
 * @date 2021-12-10 10:05
 */
public class GroupQuery extends BaseQuery {
    @ApiModelProperty("用户组名称")
    private String groupName;

    @ApiModelProperty("用户组描述")
    private String groupDescription;

    @ApiModelProperty("修改者")
    private String updateUser;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupQuery that = (GroupQuery) o;
        return Objects.equals(groupName, that.groupName) && Objects.equals(groupDescription, that.groupDescription) && Objects.equals(updateUser, that.updateUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, groupDescription, updateUser);
    }
}
