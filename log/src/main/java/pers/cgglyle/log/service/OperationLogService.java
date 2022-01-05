package pers.cgglyle.log.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pers.cgglyle.common.response.PageResult;
import pers.cgglyle.log.model.entity.OperationLogEntity;
import pers.cgglyle.log.model.query.OperationLogQuery;

/**
 * 操作日志表(OperationLog)表服务接口
 *
 * @author cgglyle
 * @since 2021-12-14 10:59:28
 */
public interface OperationLogService extends IService<OperationLogEntity> {

    /**
     * 获取分页信息
     *
     * @param operationLogQuery 分页请求
     * @return 分页模型
     */
    PageResult getPage(OperationLogQuery operationLogQuery);
}
