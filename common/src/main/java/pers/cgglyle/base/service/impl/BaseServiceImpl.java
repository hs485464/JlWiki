package pers.cgglyle.base.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import pers.cgglyle.base.model.BaseEntity;
import pers.cgglyle.base.model.BaseQuery;
import pers.cgglyle.base.service.IBaseService;
import pers.cgglyle.response.PageResult;

/**
 * 服务成基础实现
 *
 * @author cgglyle
 * @date 2021/12/6
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T extends BaseEntity> extends ServiceImpl<M, T> implements IBaseService<T> {
    @Override
    public PageResult getPage(BaseQuery baseQuery) {
        // 创建查询条件
        QueryWrapper<T> wrapper = new QueryWrapper<>();
        // 检查是否删除
        wrapper.eq("is_delete",true);
        // 按id倒叙排列
        wrapper.orderByDesc("id");
        // 创建分页条件
        Page<T> page = new Page<>(baseQuery.getPageNum(),baseQuery.getPageSize());
        // 获取分页查询信息
        Page<T> data = baseMapper.selectPage(page,wrapper);
        // 返回分页结构
        return new PageResult(baseQuery.getPageNum(),baseQuery.getPageSize(),data.getTotal(),data.getRecords());
    }
}
