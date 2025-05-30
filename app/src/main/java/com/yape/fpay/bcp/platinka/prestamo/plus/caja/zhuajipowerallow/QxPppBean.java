package com.yape.fpay.bcp.platinka.prestamo.plus.caja.zhuajipowerallow;

/**
 * author：luck
 * project：PictureSelector
 * package：com.luck.picture.lib.permissions
 * email：893855882@qq.com
 * data：2017/5/31
 */

public class QxPppBean {
    public final String name;
    public final boolean granted;
    public final boolean shouldShowRequestPermissionRationale;

    QxPppBean(String name, boolean granted) {
        this(name, granted, false);
    }

    QxPppBean(String name, boolean granted, boolean shouldShowRequestPermissionRationale) {
        this.name = name;
        this.granted = granted;
        this.shouldShowRequestPermissionRationale = shouldShowRequestPermissionRationale;
    }

    @Override
    @SuppressWarnings("SimplifiableIfStatement")
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final QxPppBean that = (QxPppBean) o;

        if (granted != that.granted) return false;
        if (shouldShowRequestPermissionRationale != that.shouldShowRequestPermissionRationale)
            return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (granted ? 1 : 0);
        result = 31 * result + (shouldShowRequestPermissionRationale ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ppp{" +
                "name='" + name + '\'' +
                ", granted=" + granted +
                ", shouldShowRequestPermissionRationale=" + shouldShowRequestPermissionRationale +
                '}';
    }
}
