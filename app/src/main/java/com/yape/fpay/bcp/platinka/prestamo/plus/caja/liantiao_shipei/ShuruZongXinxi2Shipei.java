package com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei;

import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ConfigDianModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2020/6/26.
 * 设备列表页面
 */
public class ShuruZongXinxi2Shipei extends BaseQuickAdapter<ConfigDianModel.RoughNaturalProBean, BaseViewHolder> {
    public ShuruZongXinxi2Shipei(List<ConfigDianModel.RoughNaturalProBean> shujuju) {
        super(R.layout.lst_gogoarrow_two, shujuju);
    }

    @Override
    protected void convert(BaseViewHolder helper, ConfigDianModel.RoughNaturalProBean item) {
        TextView ShuruzongXinxi1tttxxtt = helper.getView(R.id.ShuruzongXinxi1tttxxtt);
        ShuruzongXinxi1tttxxtt.setText(item.sunnyJuniorDowntown);

        if(item.isSelect!=null&&item.isSelect){

            ShuruzongXinxi1tttxxtt.setBackgroundResource(R.drawable.bj_gthgrfegthth12ok);
        }else {
            ShuruzongXinxi1tttxxtt.setBackgroundResource(R.drawable.bj_gthgrfegthth12);
        }
    }
}
