package pers.cgglyle.service.acconut.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import pers.cgglyle.response.ApiException;
import pers.cgglyle.response.PageResult;
import pers.cgglyle.service.acconut.model.dto.GroupAddDto;
import pers.cgglyle.service.acconut.model.dto.GroupUpdateDto;
import pers.cgglyle.service.acconut.model.query.GroupQuery;
import pers.cgglyle.service.acconut.service.GroupService;

import java.util.List;

/**
 * 用户组控制层
 *
 * @author cgglyle
 * @date 2021-12-10 10:01
 */
@Api(tags = "用户组控制")
@CrossOrigin
@RestController
@RequestMapping("/group")
public class GroupController {

    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @ApiOperation("获取分页")
    @GetMapping("getPage")
    public PageResult getPage(GroupQuery groupQuery) {
        return groupService.getPage(groupQuery);
    }

    @PostMapping("addGroup")
    @ApiOperation("添加用户组")
    public boolean addRole(@RequestBody GroupAddDto groupAddDto) {
        boolean b = groupService.addGroup(groupAddDto);
        if (!b) {
            throw new ApiException("用户组添加失败");
        }
        return true;
    }

    /**
     * 删除用户组
     * <p>
     * TODO 删除角色会同时删除所有拥有这个角色的用户的这个角色（笑）。
     *
     * @param id 用户组id
     * @return true
     */
    @DeleteMapping("deleteGroup")
    @ApiOperation("删除用户组")
    public boolean deleteRole(Integer id) {
        boolean delete = groupService.delete(id);
        if (!delete) {
            throw new ApiException("角色删除失败");
        }
        return true;
    }

    @PutMapping("updateGroup")
    @ApiOperation("更新用户组")
    public boolean updateGroup(@RequestBody GroupUpdateDto groupUpdateDto) {
        boolean b = groupService.updateGroup(groupUpdateDto);
        if (!b) {
            throw new ApiException("更新用户组失败");
        }
        return true;
    }

    /**
     * 批量删除用户组
     * <p>
     * TODO 删除角色会同时删除所有拥有这个角色的用户的这个角色（笑）。
     *
     * @param idList 用户组idList
     * @return true
     */
    @DeleteMapping("batchDeleteGroup")
    @ApiOperation("批量删除用户组")
    public boolean batchDeleteGroup(List<Integer> idList) {
        boolean b = groupService.batchDelete(idList);
        if (!b) {
            throw new ApiException("批量删除失败");
        }
        return true;
    }
}