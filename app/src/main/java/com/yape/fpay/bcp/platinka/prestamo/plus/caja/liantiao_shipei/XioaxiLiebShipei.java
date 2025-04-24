package com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2020/6/26.
 * 设备列表页面
 */
public class XioaxiLiebShipei extends BaseQuickAdapter<String, BaseViewHolder> {
    public XioaxiLiebShipei(List<String> shujuju) {
        super(R.layout.lst_xiaoxi_msg, shujuju);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
//        TextView itemJinJianZiLiao01Tv = helper.getView(R.id.itemMessageTv);
    }
}
