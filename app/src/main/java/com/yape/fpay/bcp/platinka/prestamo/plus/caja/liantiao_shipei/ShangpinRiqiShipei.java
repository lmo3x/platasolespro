package com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ShijianTols.huoquDangqianShijianChuo;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.ShangpinGoodHaModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ShijianTols;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2020/6/26.
 * 设备列表页面
 */
public class ShangpinRiqiShipei extends BaseQuickAdapter<ShangpinGoodHaModel.FanhuiBeanData.ChanpinBean, BaseViewHolder> {

    String jffjosddd = "";
    boolean shiCEshibu = false;  //真分期不用区分受否测试账号

    //记录日期修正
    private long recordDateFix = 0;

    public ShangpinRiqiShipei(List<ShangpinGoodHaModel.FanhuiBeanData.ChanpinBean> shujuju, String jffjosddd) {
        super(R.layout.lst_xuancxxh_time, shujuju);
        this.jffjosddd = jffjosddd;
    }

    public ShangpinRiqiShipei(List<ShangpinGoodHaModel.FanhuiBeanData.ChanpinBean> shujuju, String jffjosddd, boolean shiCEshibu) {
        super(R.layout.lst_xuancxxh_time, shujuju);
        this.jffjosddd = jffjosddd;
        this.shiCEshibu = shiCEshibu;
    }

    @Override
    protected void convert(BaseViewHolder chiuouItem, ShangpinGoodHaModel.FanhuiBeanData.ChanpinBean item) {
        RelativeLayout hrgef_jgRRs_fFCfijs223 = chiuouItem.getView(R.id.hrgef_jgRRs_fFCfijs223);
        TextView jirm_tiaomu_ccxxTShiajin = chiuouItem.getView(R.id.jirm_tiaomu_ccxxTShiajin);
        TextView jirm_tiaomu_ccxxTShiajin1 = chiuouItem.getView(R.id.jirm_tiaomu_ccxxTShiajin1);
        ImageView jirm_tiaomu_ccSuosusolockiajin = chiuouItem.getView(R.id.jirm_tiaomu_ccSuosusolockiajin);
        ImageView jirm_tiaomu_checkedn = chiuouItem.getView(R.id.jirm_tiaomu_checkedn);

        jirm_tiaomu_ccxxTShiajin.setText(item.carefulDifferentChiefMeal + " "+(item.carefulDifferentChiefMeal == 1 ? "cuota":"cuotas"));
        jirm_tiaomu_ccxxTShiajin1.setText("（"+ item.carefulDifferentChiefMeal*item.commonUselessMinority +" días）");
        jirm_tiaomu_ccxxTShiajin1.setTextColor(Color.parseColor("#FF7B28"));

        if (item.isAvailable) {
            jirm_tiaomu_ccSuosusolockiajin.setVisibility(View.VISIBLE);
            jirm_tiaomu_checkedn.setVisibility(View.GONE);
            hrgef_jgRRs_fFCfijs223.setBackgroundResource(R.drawable.bj_wwefrgfesr8);
            jirm_tiaomu_ccxxTShiajin1.setTextColor(Color.parseColor("#141414"));
        } else if (item.isSelect) {
            jirm_tiaomu_ccSuosusolockiajin.setVisibility(View.GONE);
            jirm_tiaomu_checkedn.setVisibility(View.VISIBLE);
            hrgef_jgRRs_fFCfijs223.setBackgroundResource(R.drawable.bj_wwefrgfesrdthg);
        } else {
            jirm_tiaomu_ccSuosusolockiajin.setVisibility(View.GONE);
            jirm_tiaomu_checkedn.setVisibility(View.GONE);
            hrgef_jgRRs_fFCfijs223.setBackgroundResource(R.drawable.bj_wwefrgfesrdthg);
        }

    }

    public void setRecordDateFix(long recordDateFix) {
        this.recordDateFix = recordDateFix;
        notifyDataSetChanged();
    }

    interface DKdjjdsk {

        void onclickItem(BaseQuickAdapter adapter, View view, int position, String datestr);
    }
}
