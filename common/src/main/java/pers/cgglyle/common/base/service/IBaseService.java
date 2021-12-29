package pers.cgglyle.common.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.cgglyle.common.base.model.BaseQuery;
import pers.cgglyle.common.response.PageResult;

import java.util.List;

/**
 * 基础服务层接口。
 *
 * @author cgglyle
 * @date 2021/12/6
 */
public interface IBaseService<T> extends IService<T> {
    /**
     * 根据查询体分页查询。
     *
     * @param baseQuery 查询体
     * @return 分页模型
     */
    PageResult getPage(BaseQuery baseQuery);

    /**
     * 存储实体信息
     *
     * @param entity 实体信息
     * @return true-成功，false-失败
     */
    boolean add(T entity);

    /**
     * 根据id删除实体
     *
     * @param id 主键id
     * @return true-成功，false-失败
     */
    boolean delete(Integer id);

    /**
     * 根据id更新数据
     *
     * @param entity 实体信息
     * @return true-成功，false-失败
     */
    boolean update(T entity);

    /**
     * 根据id列表删除
     *
     * @param idList id列表
     * @return true-成功，false-失败
     */
    boolean batchDelete(List<Integer> idList);

}