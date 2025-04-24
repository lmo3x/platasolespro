package com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.XuanQianModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;

import java.util.List;

/**
 * Created by Administrator on 2020/6/26.
 * xuanqian shipei页面
 */
public class ShangpinXuanqianiShipei extends BaseQuickAdapter<XuanQianModel, BaseViewHolder> {

    boolean shiCEshibu = false;
    List<XuanQianModel> datalist ;

    //记录日期修正
    private long recordDateFix = 0;

    public ShangpinXuanqianiShipei(List<XuanQianModel> shujuju) {
        super(R.layout.lst_xuancxxh_qian, shujuju);
        datalist = shujuju;
    }

    @Override
    protected void convert(BaseViewHolder chiuouItem, XuanQianModel item) {
        LinearLayout jirm_tiaomu_ccxxTShiajinlll = chiuouItem.getView(R.id.jirm_tiaomu_ccxxTShiajinlll);
        TextView jirm_tiaomu_ccxxTShiajin = chiuouItem.getView(R.id.jirm_tiaomu_ccxxTShiajin);
        ImageView jirm_tiaomu_ccSuosusolockiajin = chiuouItem.getView(R.id.jirm_tiaomu_ccSuosusolockiajin);
        ImageView jirm_tiaomu_checkedn = chiuouItem.getView(R.id.jirm_tiaomu_checkedn);
//

            jirm_tiaomu_ccxxTShiajin.setText(HuobigeshiTols.FormatNumberQianfenZhijie(item.getQianshu()));

            if (item.isIslock()) {
                jirm_tiaomu_ccSuosusolockiajin.setVisibility(View.VISIBLE);
                jirm_tiaomu_checkedn.setVisibility(View.GONE);
                jirm_tiaomu_ccxxTShiajinlll.setBackgroundResource(R.drawable.bj_grerrrrrrr);

            } else {
                if (item.isIschecked()) {
                    jirm_tiaomu_ccSuosusolockiajin.setVisibility(View.GONE);
                    jirm_tiaomu_checkedn.setVisibility(View.VISIBLE);
                    jirm_tiaomu_ccxxTShiajinlll.setBackgroundResource(R.drawable.bj_wwefrgfesrdthg);
                }else {
                    jirm_tiaomu_ccSuosusolockiajin.setVisibility(View.GONE);
                    jirm_tiaomu_checkedn.setVisibility(View.GONE);
                    jirm_tiaomu_ccxxTShiajinlll.setBackgroundResource(R.drawable.bj_wwefrgfesrdthg);
                }
            }
    }

    public void refreshaData(List<XuanQianModel> newdataList) {
        this.datalist = newdataList;
        notifyDataSetChanged();
    }
    int selectPosition = 0 ;
    public void setPosition(int p) {

        selectPosition = p ;
        notifyDataSetChanged();
    }
}
