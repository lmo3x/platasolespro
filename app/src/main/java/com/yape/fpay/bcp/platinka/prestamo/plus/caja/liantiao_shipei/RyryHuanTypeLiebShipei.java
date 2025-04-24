package com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei;

import android.content.Context;
import android.text.TextUtils;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.RyryHuantypeListModel;

import java.util.List;

/**
 * Created by Administrator on 2020/6/26.
 * 设备列表页面
 */
public class RyryHuanTypeLiebShipei extends BaseQuickAdapter<RyryHuantypeListModel.RyryHuantype, BaseViewHolder> {

    private Context context;
    private String huankuanorzhanqi;
    private List<RyryHuantypeListModel.RyryHuantype> shuju;

    public RyryHuanTypeLiebShipei(Context context, List<RyryHuantypeListModel.RyryHuantype> shuju,String huankuanorzhanqi) {
        super(R.layout.lst_ryry_huantype, shuju);
        this.context = context;
        this.huankuanorzhanqi = huankuanorzhanqi;
        this.shuju = shuju;
    }

    @Override
    protected void convert(BaseViewHolder helper, RyryHuantypeListModel.RyryHuantype data) {
        helper.setImageResource(R.id.lstryry_icon, R.mipmap.useimg_hgfsrgfaef);
//        Glide.with(context).load(data.getPlasticDoll()).into((ImageView) helper.getView(R.id.lstryry_icon));
        helper.setText(R.id.lstryry_name, data.getProperFatDigestPolitics());
        if("0".equals(huankuanorzhanqi)){

            helper.setTextColor(R.id.lstryry_name, context.getColor(R.color.sezhi_argb_baise));
        }else {
            helper.setTextColor(R.id.lstryry_name, context.getColor(R.color.sezhi_argb_333333));
        }
        helper.addOnClickListener(R.id.lstryry_rybtn);

        if(!TextUtils.isEmpty(data.getAnniuXianshiQian())){
            helper.setText(R.id.lstryry_rybtn,data.getAnniuXianshiQian());
        }else{
            helper.setText(R.id.lstryry_rybtn, context.getResources().getString(R.string.zhuyetab_ryingzhong_pag2));
        }


    }


}
