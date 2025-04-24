package com.yape.fpay.bcp.platinka.prestamo.plus.caja.liantiao_shipei;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel.DuoproChapinModel;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.HuobigeshiTols;

import java.util.List;

/**
 * Created by Administrator on 2020/6/26.
 * 设备列表页面
 */
public class DuoChanPinListAdapterForRyOK extends BaseQuickAdapter<DuoproChapinModel.RoughNaturalProDTO, BaseViewHolder> {

    private Context context;

    public DuoChanPinListAdapterForRyOK(Context context, List<DuoproChapinModel.RoughNaturalProDTO> data) {
        super(R.layout.item_duo_chan_pin_adapter, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, DuoproChapinModel.RoughNaturalProDTO redChairDTO) {
        String type = redChairDTO.getUpsetBayUnfortunateFamousStair();
        switch (type) {
            case "0":
                    helper.setGone(R.id.itemType01Rl, true);
                    helper.setGone(R.id.itemType02Rl, false);
                    Glide.with(context).asBitmap()
                            .load(R.mipmap.useimg_desklogo)
                            .apply(RequestOptions.circleCropTransform())
                            .into((ImageView) helper.getView(R.id.duoChanPinItemIv));
                    helper.setText(R.id.duoChanPinItemTv, redChairDTO.getSeveralHillCompressedSlaveryFreshBasin());
                    helper.setText(R.id.amountOfMoneyTv, context.getResources().getString(R.string.geshizhuanyi_jsl_form4)+HuobigeshiTols.FormatNumber(redChairDTO.getEachThemeSecondSalesman()));
                    switch (redChairDTO.getCurrentIndex()) {
                        case 0:
//                            helper.setText(R.id.rankingTv, "1");
//                            helper.setTextColor(R.id.rankingTv, context.getResources().getColor(R.color.sezhi_argb_A80000));
                            helper.setImageResource(R.id.rankingIv, R.mipmap.duochanpinunstatus1);
                            break;
                        case 1:
//                            helper.setText(R.id.rankingTv, "2");
//                            helper.setTextColor(R.id.rankingTv, context.getResources().getColor(R.color.sezhi_argb_A80000));
                            helper.setImageResource(R.id.rankingIv, R.mipmap.duochanpinunstatus2);
                            break;
                        case 2:
//                            helper.setText(R.id.rankingTv, "3");
//                            helper.setTextColor(R.id.rankingTv, context.getResources().getColor(R.color.sezhi_argb_A80000));
                            helper.setImageResource(R.id.rankingIv, R.mipmap.duochanpinunstatus3);
                            break;
                        default:
                            helper.setImageResource(R.id.rankingIv, R.mipmap.duochanpinunstatuscommon);
                            break;
                }

//
//            case "1"://已放款(待还款)
//                //buju
//                helper.setGone(R.id.itemType01Rl, false);
//                helper.setGone(R.id.itemType02Rl, true);
//                //tu biao
//                Glide.with(context).asBitmap()
//                        .load(R.mipmap.useimg_desklogo)
//                        .apply(RequestOptions.circleCropTransform())
//                        .into((ImageView) helper.getView(R.id.duoChanPinItem01Iv));
//                //app mingzi
//                helper.setText(R.id.duoChanPinItem01Tv, redChairDTO.getSeveralHillCompressedSlaveryFreshBasin());
//                //zhuangtai ming
//                helper.setText(R.id.duoChanPinItemStateTv, context.getResources().getString(R.string.zhuyetab_ryingzhong_dev));
//                //zhuangtai ming yanse
//                helper.setTextColor(R.id.duoChanPinItemStateTv, context.getResources().getColor(R.color.sezhi_argb_3E8FFF));
//                //zhuangtai view yanse
//                helper.setBackgroundRes(R.id.duoChanPinItemRectangleView, R.drawable.bj_hgfafesrglanlan);
//
//                //anniu beijing
//                helper.setBackgroundRes(R.id.duoChanPinItemBtn2, R.drawable.bj_userallow_yes);
//                //anniu wenan
//                helper.setText(R.id.duoChanPinItemBtn2, context.getResources().getString(R.string.zhuyetab_ryingzhong_pag));
//                break;
//
//            case "2"://逾期
//                //buju
//                helper.setGone(R.id.itemType01Rl, false);
//                helper.setGone(R.id.itemType02Rl, true);
//                //tu biao
//                Glide.with(context).asBitmap()
//                        .load(R.mipmap.useimg_desklogo)
//                        .apply(RequestOptions.circleCropTransform())
//                        .into((ImageView) helper.getView(R.id.duoChanPinItem01Iv));
//                //app mingzi
//                helper.setText(R.id.duoChanPinItem01Tv, redChairDTO.getSeveralHillCompressedSlaveryFreshBasin());
//                //zhuangtai ming
//                helper.setText(R.id.duoChanPinItemStateTv, context.getResources().getString(R.string.duochanpinzhuangtai_yuqi));
//                //zhuangtai ming yanse
//                helper.setTextColor(R.id.duoChanPinItemStateTv, context.getResources().getColor(R.color.sezhi_argb_FF7B28));
//                //zhuangtai view yanse
//                helper.setBackgroundRes(R.id.duoChanPinItemRectangleView, R.drawable.bj_thgfesrgef);
//
//                //anniu beijing
//                helper.setBackgroundRes(R.id.duoChanPinItemBtn2, R.drawable.bj_userallow_yes);
//                //anniu wenan
//                helper.setText(R.id.duoChanPinItemBtn2, context.getResources().getString(R.string.zhuyetab_ryingzhong_pag));
//                break;
//            case "3"://审核中
//            case "6"://放款中
//                //buju
//                helper.setGone(R.id.itemType01Rl, false);
//                helper.setGone(R.id.itemType02Rl, true);
//                //tu biao
//                Glide.with(context).asBitmap()
//                        .load(R.mipmap.useimg_desklogo)
//                        .apply(RequestOptions.circleCropTransform())
//                        .into((ImageView) helper.getView(R.id.duoChanPinItem01Iv));
//                //app mingzi
//                helper.setText(R.id.duoChanPinItem01Tv, redChairDTO.getSeveralHillCompressedSlaveryFreshBasin());
//                //zhuangtai ming
//                helper.setText(R.id.duoChanPinItemStateTv, context.getResources().getString(R.string.zhuyetab_waitchek_baj));
//                //zhuangtai ming yanse
//                helper.setTextColor(R.id.duoChanPinItemStateTv, context.getResources().getColor(R.color.sezhi_argb_56A7C4));
//                //zhuangtai view yanse
//                helper.setBackgroundRes(R.id.duoChanPinItemRectangleView, R.drawable.bj_hgfafesrlanlvlanlv);
//
//                //anniu beijing
//                helper.setBackgroundRes(R.id.duoChanPinItemBtn2, R.drawable.bj_userallow_yes);
//                //anniu wenan
//                helper.setText(R.id.duoChanPinItemBtn2, context.getResources().getString(R.string.zhuyetab_ryingzhong_pag));
//                break;
//
//            case "4":
//            case "5":
//                helper.setGone(R.id.itemType01Rl, false);
//                helper.setGone(R.id.itemType02Rl, true);
//                Glide.with(context).asBitmap()
//                        .load(R.mipmap.useimg_desklogo)
//                        .apply(RequestOptions.circleCropTransform())
//                        .into((ImageView) helper.getView(R.id.duoChanPinItem01Iv));
//                helper.setText(R.id.duoChanPinItem01Tv, redChairDTO.getSeveralHillCompressedSlaveryFreshBasin());
//                if (type.equals("4")) {
//                    helper.setText(R.id.duoChanPinItemStateTv, context.getResources().getString(R.string.zhuyetab_waitchek_jujuetitle));
//                } else {
//                    helper.setText(R.id.duoChanPinItemStateTv, context.getResources().getString(R.string.zhuyetab_waitchek_kacuotitle));
//                }
//                helper.setTextColor(R.id.duoChanPinItemStateTv, context.getResources().getColor(R.color.sezhi_argb_F74545));
//                helper.setBackgroundRes(R.id.duoChanPinItemRectangleView, R.drawable.bj_hgfafesrgjuju);
//
//                if (type.equals("4")) {
//                    helper.setBackgroundRes(R.id.duoChanPinItemBtn2, R.drawable.bj_hgfafesrgfeasrg);
//                    helper.setText(R.id.duoChanPinItemBtn2, context.getResources().getString(R.string.shangpins_foryo_can2));
//                } else {
//                    helper.setBackgroundRes(R.id.duoChanPinItemBtn2, R.drawable.bj_userallow_yes);
//                    helper.setText(R.id.duoChanPinItemBtn2, "Actualizar datos");
//                }
//                break;
        }
        helper.addOnClickListener(R.id.duoChanPinItemBtn);
        helper.addOnClickListener(R.id.duoChanPinItemBtn2);
    }
}
