package com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2020/6/26.
 * 设备列表页面
 */
public class HaodeShangpinLiebShipei extends BaseQuickAdapter<String, BaseViewHolder> {
    public HaodeShangpinLiebShipei(List<String> shuju) {
        super(R.layout.lst_xuancxxh_chanpin, shuju);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
//        TextView itemJinJianZiLiao01Tv = helper.getView(R.id.itemJinJianZiLiao01Tv);
    }
}
