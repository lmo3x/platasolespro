package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fengzhuangtoltol;

import android.os.Handler;

import android.os.Message;

/**

 * Jack Tony

 * 自定义的倒计时类，没有用官方提供的CountDownTimer来实现

 * 有暂停等方法，灵活性强。在activity退出后还会持续计时，所以结束时需要判断当前activity是否在前台

 * @date 2015/4/24

 */

public abstract class DaojishiTols {

    private final long daojishiIntJiange;

    private long zongShijian;

    private long tixingShijian;

    /**

     *

     * @param zongshijian

     *      表示以毫秒为单位 倒计时的总数

     *

     *      例如 millisInFuture=1000 表示1秒

     *

     * @param daojishiIntJiange

     *      表示 间隔 多少微秒 调用一次 onTick 方法

     *

     *      例如: countDownInterval =1000 ; 表示每1000毫秒调用一次onTick()

     *

     */

    public DaojishiTols(long zongshijian, long daojishiIntJiange) {

        zongShijian = zongshijian;

        this.daojishiIntJiange = daojishiIntJiange;

        tixingShijian = zongshijian;

    }

    //当前时间占比
    public final void bili(int value) {

        synchronized (DaojishiTols.this) {

            tixingShijian = ((100 - value) * zongShijian) / 100;

        }

    }
    //取消
    public final void quxiao() {

        kuaxianchengCaozuo.removeMessages(XINXI_ZOUQILAI);

        kuaxianchengCaozuo.removeMessages(XINXI_ZANTING);

    }
    //resume
    public final void xainshi() {

        kuaxianchengCaozuo.removeMessages(XINXI_ZANTING);

        kuaxianchengCaozuo.sendMessageAtFrontOfQueue(kuaxianchengCaozuo.obtainMessage(XINXI_ZOUQILAI));

    }
    //pause
    public final void zanting() {

        kuaxianchengCaozuo.removeMessages(XINXI_ZOUQILAI);

        kuaxianchengCaozuo.sendMessageAtFrontOfQueue(kuaxianchengCaozuo.obtainMessage(XINXI_ZANTING));

    }

    public synchronized final DaojishiTols letsGo() {

        if (tixingShijian <= 0) {

            onOver();

            return this;

        }

        kuaxianchengCaozuo.sendMessageDelayed(kuaxianchengCaozuo.obtainMessage(XINXI_ZOUQILAI),

                daojishiIntJiange);

        return this;

    }

    public abstract void onTtTitck(long millisUntilFinished, int percent);

    public abstract void onOver();

    private static final int XINXI_ZOUQILAI = 1;

    private static final int XINXI_ZANTING = 2;

    private Handler kuaxianchengCaozuo = new Handler() {

        @Override

        public void handleMessage(Message msg) {

            synchronized (DaojishiTols.this) {

                if (msg.what == XINXI_ZOUQILAI) {

                    tixingShijian = tixingShijian - daojishiIntJiange;

                    if (tixingShijian <= 0) {

                        onOver();

                    } else if (tixingShijian < daojishiIntJiange) {

                        sendMessageDelayed(obtainMessage(XINXI_ZOUQILAI), tixingShijian);

                    } else {

                        onTtTitck(tixingShijian, new Long(100

                                * (zongShijian - tixingShijian) / zongShijian)

                                .intValue());

                        sendMessageDelayed(obtainMessage(XINXI_ZOUQILAI),

                                daojishiIntJiange);

                    }

                } else if (msg.what == XINXI_ZANTING) {

                }

            }

        }

    };

}  