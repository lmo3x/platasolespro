package com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.FenqiJihuaListModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;

import java.util.List;
import java.util.Map;

public class FenqiHuankuanAdapter extends BaseQuickAdapter<FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO, BaseViewHolder> {

    private Context context;
    private int personalReligiousPill = 0;

    public void setPersonalReligiousPill(int personalReligiousPill) {
        this.personalReligiousPill = personalReligiousPill;
    }

    public FenqiHuankuanAdapter(Context context, List<FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO> data) {
        super(R.layout.item_fenqijihua_huankuan, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, FenqiJihuaListModel.BigAncientTastyHeadteacherDTO.HonestHelpfulSteamInlandSummaryDTO bean) {

        helper.setText(R.id.jklsjfldskjTv, bean.getAboveAshFieldPreciousNetwork()+"/"+personalReligiousPill);

        if(personalReligiousPill>1){
            helper.getView(R.id.jklsjfldskjLayout).setVisibility(View.VISIBLE);
            helper.getView(R.id.dfdsg_xz).setVisibility(View.VISIBLE);
        }else {
            helper.getView(R.id.jklsjfldskjLayout).setVisibility(View.GONE);
            helper.getView(R.id.dfdsg_xz).setVisibility(View.GONE);
        }
        String title =  bean.getMuchLaughterCafe();
        String title2 =  bean.getHotPotHopelessPaperworkLadder();
        String title3 =  bean.getSuccessfulDiamondUsualJaw();

        Map<String,String> popularSquirrelDozenPunctuation =    bean.getPopularSquirrelDozenPunctuation();
        Map<String,String> scottishPocketSadKingdom =    bean.getScottishPocketSadKingdom();
        Map<String,String> deafInitialThursdayMonitor = bean.getDeafInitialThursdayMonitor();

        if(popularSquirrelDozenPunctuation != null){
            for (Map.Entry<String, String> entry : popularSquirrelDozenPunctuation.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                title = title.replace(key,"<font color='#E20C2B'>"+value+"</font>");
            }
        }

        if(scottishPocketSadKingdom != null){
            for (Map.Entry<String, String> entry : scottishPocketSadKingdom.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                title2 = title2.replace(key,"<font color='#E20C2B'>"+value+"</font>");
            }
        }

        if(deafInitialThursdayMonitor != null){
            for (Map.Entry<String, String> entry : deafInitialThursdayMonitor.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                title3 = title3.replace(key,"<font color='#E20C2B'>"+value+"</font>");
            }
        }

        helper.setText(R.id.devolucion005Tv, Html.fromHtml(title));
        helper.setText(R.id.devolucion001Tv, Html.fromHtml(title2));
        helper.setText(R.id.devolucion002Tv,Html.fromHtml(title3));

        helper.setText(R.id.devolucion001Tv_content, bean.getDueMinorityGeneration());
        helper.setText(R.id.devolucion002Tv_content, "S/" + HuobigeshiTols.FormatNumberWithXiaoshudian(HuobigeshiTols.tianjia0houzhui(String.valueOf(bean.getAncientDueInterpreter()))));


        helper.addOnClickListener(R.id.dfdsg_xz);
        ImageView dfdsg_xz = helper.getView(R.id.dfdsg_xz);
        dfdsg_xz.setImageResource(bean.getChecked() == 1 ? R.mipmap.cbccck1 :R.mipmap.cbccck0);

//        if(bean.getIndependentVastChapterCivilHydrogen() > 0){
//            helper.setGone(R.id.dsfsdfsdflayout1,true);
//            helper.setText(R.id.dsfsdfsdflayout001Tv_content, "S/" + HuobigeshiTols.FormatNumberWithXiaoshudian(HuobigeshiTols.tianjia0houzhui(String.valueOf(bean.getSuccessfulMinuteBrunchFairMonth()))));
//            if(bean.getPopVolleyballEarlyDelight() > 0){
//                helper.setGone(R.id.dsfsdfsdflayout3,true);
//                helper.setText(R.id.dsfsdfsdflayout002Tv_content, "-S/" + HuobigeshiTols.FormatNumberWithXiaoshudian(HuobigeshiTols.tianjia0houzhui(String.valueOf(bean.getPopVolleyballEarlyDelight()))));
//            }else{
//                helper.setGone(R.id.dsfsdfsdflayout3,false);
//            }
//        }else{
//            helper.setGone(R.id.dsfsdfsdflayout1,false);
//        }

    }

}
