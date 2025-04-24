package com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei;

import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;
import java.util.Locale;

/**
 * Created by Administrator on 2020/6/26.
 * 设备列表页面
 */
public class ShangpinQianLiebShipei extends BaseQuickAdapter<Double, BaseViewHolder> {
    public ShangpinQianLiebShipei(List<Double> shuju) {
        super(R.layout.lst_gogoarrow_two, shuju);
    }

    @Override
    protected void convert(BaseViewHolder helper, Double redChairDTO) {
        TextView ShuruzongXinxi1tttxxtt = helper.getView(R.id.ShuruzongXinxi1tttxxtt);
        ShuruzongXinxi1tttxxtt.setText(String.format(Locale.ENGLISH,mContext.getString(R.string.geshizhuanyi_jsl_form),redChairDTO));
    }
}
