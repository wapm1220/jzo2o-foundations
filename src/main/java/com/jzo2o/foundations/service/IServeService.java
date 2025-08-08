package com.jzo2o.foundations.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jzo2o.common.model.PageResult;
import com.jzo2o.foundations.model.domain.Serve;
import com.jzo2o.foundations.model.dto.request.ServePageQueryReqDTO;
import com.jzo2o.foundations.model.dto.request.ServeUpsertReqDTO;
import com.jzo2o.foundations.model.dto.response.ServeResDTO;
import com.jzo2o.foundations.model.dto.response.ServeTypeResDTO;

import java.math.BigDecimal;
import java.util.List;

public interface IServeService  extends IService<Serve> {
    /**
     * 分页查询服务列表
     * @param servePageQueryReqDTO 查询条件
     * @return 分页结果
     */
    PageResult<ServeResDTO> page(ServePageQueryReqDTO servePageQueryReqDTO);

    /**
     * 批量新增
     * @param serveUpsertReqDTOList
     */
    void batchAdd(List<ServeUpsertReqDTO> serveUpsertReqDTOList);

    /**
     * 服务价格修改
     * @param id
     * @param price
     */
    Serve update(Long id, BigDecimal price);

    /**
     * 上架
     * @param id
     */
    Serve onSale(Long id);

    /**
     * 删除服务区
     * @param id
     * @return
     */
    /**
     * 删除服务区
     * @param id
     * @return
     */
    Serve delete(Long id);

    /**
     * 下架服务区
     * @param id
     * @return
     */
    Serve discontinue(Long id);

    /**
     * 设置热门
     * @param id
     */


    Serve OnHot(Long id);

    /**
     * 取消热门
     * @param id
     */
    Serve offHot(Long id);
}
