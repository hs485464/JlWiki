package pers.cgglyle.service.acconut.service;

import pers.cgglyle.base.service.IBaseService;
import pers.cgglyle.service.acconut.model.dto.RoleAddDto;
import pers.cgglyle.service.acconut.model.dto.RoleUpdateDto;
import pers.cgglyle.service.acconut.model.entity.RoleEntity;

/**
 * 角色服务层接口
 *
 * @author cgglyle
 * @date 2021-12-08 13:08
 */
public interface RoleService extends IBaseService<RoleEntity> {
    /**
     * 添加角色
     *
     * @param roleAddDto 添加角色模型
     * @return true-成功,false-失败
     */
    boolean addRole(RoleAddDto roleAddDto);

    /**
     * 更新角色
     *
     * @param roleUpdateDto 更新角色模型
     * @return true-成功,false-失败
     */
    boolean updateRole(RoleUpdateDto roleUpdateDto);
}