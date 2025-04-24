package com.yape.fpay.bcp.platinka.prestamo.plus.caja.datamodel;

//选择金额 shitilei
public class XuanQianModel {

        private String qianshu;//金额
        private boolean ischecked ;//是否选择 ture选择 false未选择
        private boolean islock ;//是否锁住  ture锁住 false未锁住

        public String getQianshu() {
                return qianshu;
        }

        public void setQianshu(String qianshu) {
                this.qianshu = qianshu;
        }

        public boolean isIschecked() {
                return ischecked;
        }

        public void setIschecked(boolean ischecked) {
                this.ischecked = ischecked;
        }

        public boolean isIslock() {
                return islock;
        }

        public void setIslock(boolean islock) {
                this.islock = islock;
        }
}
