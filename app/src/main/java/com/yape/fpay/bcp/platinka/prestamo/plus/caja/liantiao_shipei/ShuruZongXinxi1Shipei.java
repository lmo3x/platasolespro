package com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei;

import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2020/6/26.
 * 设备列表页面
 */
public class ShuruZongXinxi1Shipei extends BaseQuickAdapter<String, BaseViewHolder> {

    public ShuruZongXinxi1Shipei(List<String> shujuju) {
        super(R.layout.lst_gogoarrow_fileone, shujuju);
    }

    public void setData(List<String> shujuju) {
      replaceData(shujuju);
    }

    @Override
    protected void convert(BaseViewHolder helper,String item) {
        TextView ShuruzongXinxi1tttxxtt = helper.getView(R.id.ShuruzongXinxi1tttxxtt);
        ShuruzongXinxi1tttxxtt.setText(item);
    }
}
