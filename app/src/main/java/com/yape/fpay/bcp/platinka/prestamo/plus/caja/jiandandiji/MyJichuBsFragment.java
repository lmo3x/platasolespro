package com.yape.fpay.bcp.platinka.prestamo.plus.caja.jiandandiji;

import static com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol.ZhuajiPingmuTols.huoquPingmuKuandu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.R;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.ChanpinMoxingPPWindows;
import com.yape.fpay.bcp.platinka.prestamo.plus.caja.paopaoorwindows.JiazaizhongWindows;

import androidx.fragment.app.Fragment;

public class MyJichuBsFragment extends Fragment {

    //等待框
    public JiazaizhongWindows jiazaizhongWindows = null;
    public ChanpinMoxingPPWindows basefNonet = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //初始化等待窗
        jiazaizhongWindows = new JiazaizhongWindows(getActivity(), R.style.DialogTheme, R.layout.wndw_jiazai_ing);
        chaungjianPPw();
    }

    //无网络
    private void chaungjianPPw() {
        basefNonet = new ChanpinMoxingPPWindows(getActivity());

        LayoutInflater popInflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = popInflater.inflate(R.layout.wndw_xuancxxh_chanpin2, null);
        TextView jythgrsdtfygukyjh = popupView.findViewById(R.id.jythgrsdtfygukyjh);
        TextView quxiaoquxiao_fjdoj_buyaoquan = popupView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan);
        TextView gaoding_sure_djdj_yaogeiwo = popupView.findViewById(R.id.gaoding_sure_djdj_yaogeiwo);

        jythgrsdtfygukyjh.setText(getString(R.string.tusitishi_dizih_00));
        quxiaoquxiao_fjdoj_buyaoquan.setText(getString(R.string.shangpins_foryo_can2));
        gaoding_sure_djdj_yaogeiwo.setText(getString(R.string.shangpins_foryo_abr));

        popupView.findViewById(R.id.quxiaoquxiao_fjdoj_buyaoquan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                basefNonet.xiaohuiPPw();
            }
        });
        popupView.findViewById(R.id.gaoding_sure_djdj_yaogeiwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                basefNonet.xiaohuiPPw();

                Intent intent = new Intent();
                intent.setAction("android.net.wifi.PICK_WIFI_NETWORK");
                startActivity(intent);
            }
        });

        basefNonet.chushihuaPPW(popupView, false, (int) (huoquPingmuKuandu(getActivity()) * 0.8), ViewGroup.LayoutParams.WRAP_CONTENT, null, true);

    }


}