package com.wyb.rms.service.goods.service.async;

import com.wyb.rms.service.sdk.goods.GoodsInfo;

import java.util.List;

/**
 * <h1>异步服务接口定义</h1>
 * */
public interface IAsyncService {

    /**
     * <h2>异步将商品信息保存下来</h2>
     * */
    void asyncImportGoods(List<GoodsInfo> goodsInfos, String taskId);
}
