package com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.HuankDanliebModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;

import java.util.List;

/**
 * Created by Administrator on 2020/6/26.
 * 设备列表页面
 */
public class OrderListAdapter extends BaseQuickAdapter<HuankDanliebModel.HuankuanDanModel, BaseViewHolder> {

    private Context context;

    public OrderListAdapter(Context context, List<HuankDanliebModel.HuankuanDanModel> data) {
        super(R.layout.item_order_adapter, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, HuankDanliebModel.HuankuanDanModel rudeTownBean) {
        String type = rudeTownBean.getUpsetBayUnfortunateFamousStair();
        Glide.with(context)
                .load(rudeTownBean.getExcellentLawyerExamFierceCellar())
                .error(R.mipmap.useimg_desklogo)
                .apply(RequestOptions.circleCropTransform())
                .into((ImageView) helper.getView(R.id.duoChanPinItemIv));
        helper.setText(R.id.duoChanPinItemAppTv, rudeTownBean.getSeveralHillCompressedSlaveryFreshBasin());

        helper.setGone(R.id.jflsdjlhint,false);

        //typeUnderReview: '0',//审核中
        //typeReject: '1',//拒绝中
        //typeFinish: '2',//已完成
        //typeoverdue: '3',//逾期中
        //typePendingRepayment: '4',//还款中
        //typeloanfaild: '5',//放款失败
        //typeloaning: '6',//放款进行中

        switch (type) {
            case "0"://审核中
            case "6"://放款进行中
                //zhuangtai ming
                if (type.equals("0")) {
                    helper.setText(R.id.duoChanPinItemStateTv, context.getResources().getString(R.string.zhuyetab_waitchek_baj));
                } else {
                    helper.setText(R.id.duoChanPinItemStateTv, context.getResources().getString(R.string.zhuyetab_doingwork_enp));
                }
//                helper.setText(R.id.duoChanPinItemStateTv, context.getResources().getString(R.string.zhuyetab_waitchek_baj));
                helper.setTextColor(R.id.duoChanPinItemStateTv, context.getResources().getColor(R.color.sezhi_argb_56A7C4));
                helper.setBackgroundRes(R.id.duoChanPinItemRectangleView, R.drawable.bj_hgfafesrlanlvlanlv);

                helper.setGone(R.id.layout1, true);
                helper.setGone(R.id.layout2, true);
                helper.setGone(R.id.huandandanxinxi, true);
                helper.setGone(R.id.layout3, false);

                helper.setText(R.id.devolucion002Tv, context.getResources().getString(R.string.shangpins_foryo_mon2));
                helper.setText(R.id.aplicacionTv, context.getResources().getString(R.string.zhuyetab_waitchek_fec2));
                helper.setText(R.id.devolucion002Tv_content, "S/" + HuobigeshiTols.FormatNumberWithXiaoshudian(HuobigeshiTols.tianjia0houzhui(String.valueOf(rudeTownBean.getFunnySoldierNewBoot()))));
                helper.setText(R.id.aplicacionTv_content, rudeTownBean.getDustyLuckyTheirBrownSuffering().substring(0, 10));

                helper.setGone(R.id.btn_first, true);
                helper.setGone(R.id.btn_second, false);
                helper.setText(R.id.btn_first, context.getResources().getString(R.string.jingogojian_xixicheck_esp));
                helper.setTextColor(R.id.btn_first, context.getResources().getColor(R.color.sezhi_argb_baise));
                helper.setBackgroundRes(R.id.btn_first, R.drawable.bj_hgjhgfddfg);
                break;
            case "1"://拒绝中
            case "5"://放款失败
            case "2"://已完成
                if (type.equals("1")) {
                    helper.setText(R.id.duoChanPinItemStateTv, context.getResources().getString(R.string.zhuyetab_waitchek_jujuetitle));
                } else if (type.equals("5")) {
                    helper.setText(R.id.duoChanPinItemStateTv, context.getResources().getString(R.string.zhuyetab_waitchek_kacuotitle));
                } else {
                    helper.setText(R.id.duoChanPinItemStateTv, context.getResources().getString(R.string.dandanzhuangtai_term));
                }
                if (type.equals("2")) {

                    helper.setGone(R.id.huandandanxinxi, false);
                    helper.setTextColor(R.id.duoChanPinItemStateTv, context.getResources().getColor(R.color.sezhi_argb_19C04C));
                    helper.setBackgroundRes(R.id.duoChanPinItemRectangleView, R.drawable.bj_hgfafesrlvlv);
                } else {
                    helper.setGone(R.id.huandandanxinxi, true);
                    helper.setTextColor(R.id.duoChanPinItemStateTv, context.getResources().getColor(R.color.sezhi_argb_F74545));
                    helper.setBackgroundRes(R.id.duoChanPinItemRectangleView, R.drawable.bj_hgfafesrgjuju);
                }

                helper.setGone(R.id.layout1, false);
                helper.setGone(R.id.layout2, false);
                helper.setGone(R.id.huandandanxinxi, false);
                helper.setGone(R.id.layout3, true);

                if (type.equals("1")) {
                    helper.setText(R.id.layout3_content, context.getResources().getString(R.string.zhuyetab_fangfail_sup));
                } else if (type.equals("5")) {
                    helper.setText(R.id.layout3_content, context.getResources().getString(R.string.zhuyetab_fangfail_els));
                } else {
                    helper.setText(R.id.layout3_content, context.getResources().getString(R.string.zhuyetab_waitchek_este));
                }
                if (type.equals("2")) {
                    helper.setTextColor(R.id.layout3_content, context.getResources().getColor(R.color.sezhi_argb_19C04C));
                    helper.setTextColor(R.id.layout3_content, context.getResources().getColor(R.color.sezhi_argb_19C04C));
                    Glide.with(context)
                            .load(R.mipmap.dandan_wancheng)
                            .into((ImageView) helper.getView(R.id.tipWaringIv));
                } else {
                    helper.setTextColor(R.id.layout3_content, context.getResources().getColor(R.color.sezhi_argb_999999));
                    Glide.with(context)
                            .load(R.mipmap.useimg_asrdthgref)
                            .into((ImageView) helper.getView(R.id.tipWaringIv));
                }

                helper.setGone(R.id.btn_first, true);
                helper.setTextColor(R.id.btn_first, context.getResources().getColor(R.color.sezhi_argb_baise));
                helper.setGone(R.id.btn_second, false);
                if (type.equals("1")) {
                    helper.setText(R.id.btn_first, context.getResources().getString(R.string.zhuyetab_tudai_des_apl));
                    helper.setBackgroundRes(R.id.btn_first, R.drawable.bj_hgjhgfddfg);
                } else {
                    if (type.equals("5")) {
                        helper.setText(R.id.btn_first, context.getResources().getString(R.string.zhuyetab_fangfail_act));
                    } else {
                        helper.setText(R.id.btn_first, context.getResources().getString(R.string.zhuyetab_tudai_des_apl));
                    }
                    helper.setBackgroundRes(R.id.btn_first, R.drawable.bj_userallow_yes);
                }
                break;
            case "4"://还款中
            case "3"://逾期中

                if (type.equals("4")) {
                    helper.setText(R.id.duoChanPinItemStateTv, context.getResources().getString(R.string.zhuyetab_ryingzhong_dev));
                    helper.setTextColor(R.id.duoChanPinItemStateTv, context.getResources().getColor(R.color.sezhi_argb_3E8FFF));
                    helper.setBackgroundRes(R.id.duoChanPinItemRectangleView, R.drawable.bj_hgfafesrglanlan);
                } else {
                    helper.setText(R.id.duoChanPinItemStateTv, "Atrasado " + rudeTownBean.getRadioactiveAtmosphereBacterium() + " Días");
                    helper.setTextColor(R.id.duoChanPinItemStateTv, context.getResources().getColor(R.color.sezhi_argb_FF7B28));
                    helper.setBackgroundRes(R.id.duoChanPinItemRectangleView, R.drawable.bj_thgfesrgef);
                }

                helper.setGone(R.id.layout1, true);
                helper.setGone(R.id.layout2, false);
                helper.setGone(R.id.huandandanxinxi, true);

                helper.setGone(R.id.layout3, false);
//                if (type.equals("4")) {
//                    helper.setGone(R.id.layout3, false);
//                } else {
//                    helper.setGone(R.id.layout3, true);
//
//                    helper.setBackgroundRes(R.id.layout3,R.drawable.kongbeijing);
//                    helper.setText(R.id.layout3_content, context.getResources().getString(R.string.zhuyetab_sihay));
//                    helper.setTextColor(R.id.layout3_content, context.getResources().getColor(R.color.sezhi_argb_FF7B28));
//                    Glide.with(context)
//                            .load(R.mipmap.wudandan_tishilogon)
//                            .into((ImageView) helper.getView(R.id.tipWaringIv));
//                }

                helper.setText(R.id.devolucion002Tv, context.getResources().getString(R.string.shangpins_foryo_mon2));
//                helper.setText(R.id.aplicacionTv, context.getResources().getString(R.string.zhuyetab_ryingzhong_fecing));
                helper.setText(R.id.devolucion002Tv_content, "S/" + HuobigeshiTols.FormatNumberWithXiaoshudian(HuobigeshiTols.tianjia0houzhui(String.valueOf(rudeTownBean.getFunnySoldierNewBoot()))));
//                helper.setText(R.id.aplicacionTv_content, rudeTownBean.getDueMinorityGeneration());

                //允许展期
                if (rudeTownBean.getThickCopContinent().equals("1")) {
                    helper.setGone(R.id.btn_first, true);
                    helper.setGone(R.id.btn_second, true);

                    helper.setBackgroundRes(R.id.btn_second, R.drawable.bj_userallow_yes);
                } else {//不允许展期
                    helper.setGone(R.id.btn_first, false);
                    helper.setGone(R.id.btn_second, true);
                }

                helper.setText(R.id.btn_second, context.getResources().getString(R.string.zhuyetab_ryingzhong_lty));
                helper.setText(R.id.btn_first, "Prolonga " + rudeTownBean.getAfraidUndividedRestaurant() + " días más");
                helper.setBackgroundRes(R.id.btn_first, R.drawable.bj_jjhgggggg);
                helper.setTextColor(R.id.btn_first, context.getResources().getColor(R.color.sezhi_argb_FF7B28));

                if(rudeTownBean.getPersonalReligiousPill() == 1){
                    helper.setGone(R.id.jflsdjlhint,false);
                }else{
                    helper.setGone(R.id.jflsdjlhint,true);
                    String content = "Debe pagar en total "+" <font color='#E20C2B'>"+rudeTownBean.getPersonalReligiousPill()+"</font> "+" cuotas y falta "+" <font color='#E20C2B'>"+rudeTownBean.getIncorrectLuckyDatabase()+"</font> "+" cuotas pendientes de pago";
                    helper.setText(R.id.jflsdjlhint, Html.fromHtml(content));
                }

                break;
        }
        helper.addOnClickListener(R.id.btn_first);
        helper.addOnClickListener(R.id.btn_second);



    }

    public interface onItemExtendClick {
        void onClick(View view, int position);
    }
}
