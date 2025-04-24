package com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei;

import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.DizhiDiquModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2020/6/26.
 * 设备列表页面
 */
public class ShuruZongXinxi3Shipei extends BaseQuickAdapter<DizhiDiquModel.RoughNaturalProBean, BaseViewHolder> {
    public ShuruZongXinxi3Shipei(List<DizhiDiquModel.RoughNaturalProBean> shujuju) {
        super(R.layout.lst_gogoarrow_two, shujuju);
    }

    @Override
    protected void convert(BaseViewHolder helper, DizhiDiquModel.RoughNaturalProBean item) {
        TextView ShuruzongXinxi1tttxxtt = helper.getView(R.id.ShuruzongXinxi1tttxxtt);
        ShuruzongXinxi1tttxxtt.setText(item.challengingSwimmingDeepAdvertisement);
    }
}
