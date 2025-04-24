package com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei;

import android.content.Context;
import android.text.Html;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.FenqiShisuanModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;

import java.util.List;
import java.util.Map;

public class FenqijihuaListAdapter extends BaseQuickAdapter<FenqiShisuanModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO, BaseViewHolder> {

    private Context context;
    private int personalReligiousPill = 0;

    public void setPersonalReligiousPill(int personalReligiousPill) {
        this.personalReligiousPill = personalReligiousPill;
    }

    public FenqijihuaListAdapter(Context context, List<FenqiShisuanModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO> data) {
        super(R.layout.item_fenqijihua_shisuan, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, FenqiShisuanModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO bean) {
        if(personalReligiousPill==1){
            helper.getView(R.id.jklsjfldskjLayout).setVisibility(View.GONE);
        }else {
            helper.getView(R.id.jklsjfldskjLayout).setVisibility(View.VISIBLE);
            helper.setText(R.id.jklsjfldskjTv, bean.getAboveAshFieldPreciousNetwork()+"/"+personalReligiousPill);
        }

        String swissJobPea = bean.getSwissJobPea();
        String asianMatchTechnicalGoldenAeroplane = bean.getAsianMatchTechnicalGoldenAeroplane();
        Map<String,String> nervousRunningVaseLikelyUser = bean.getNervousRunningVaseLikelyUser();
        Map<String,String> youngAmericanCountryHeroine = bean.getYoungAmericanCountryHeroine();

        if(youngAmericanCountryHeroine != null){
            for (Map.Entry<String, String> entry : youngAmericanCountryHeroine.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                swissJobPea = swissJobPea.replace(key,"<font color='#E20C2B'>"+value+"</font>");
            }
        }

        if(nervousRunningVaseLikelyUser != null){
            for (Map.Entry<String, String> entry : nervousRunningVaseLikelyUser.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                asianMatchTechnicalGoldenAeroplane = asianMatchTechnicalGoldenAeroplane.replace(key,"<font color='#E20C2B'>"+value+"</font>");
            }
        }

        helper.setText(R.id.devolucion001Tv, Html.fromHtml(swissJobPea));
        helper.setText(R.id.devolucion002Tv,Html.fromHtml(asianMatchTechnicalGoldenAeroplane));

        helper.setText(R.id.devolucion001Tv_content, "S/" + HuobigeshiTols.FormatNumberWithXiaoshudian(HuobigeshiTols.tianjia0houzhui(String.valueOf(bean.getAncientDueInterpreter()))));
        helper.setText(R.id.devolucion002Tv_content, bean.getDueMinorityGeneration());

    }

}
