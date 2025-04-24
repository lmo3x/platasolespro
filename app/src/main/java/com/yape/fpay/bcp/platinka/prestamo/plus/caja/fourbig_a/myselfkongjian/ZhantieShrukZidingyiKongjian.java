package com.yape.fpay.bcp.platinka.prestamo.plus.caja.fourbig_a.myselfkongjian;

import android.content.Context;
import android.util.AttributeSet;

/**
 * @Date 2019/08/15 19:10
 * @describe
 */
public class ZhantieShrukZidingyiKongjian extends androidx.appcompat.widget.AppCompatEditText {
    private ZhantieHuidiaoJianting mZhantieHuidiaoJianting;

    public interface ZhantieHuidiaoJianting {
        void zhanTie();
    }

    public ZhantieShrukZidingyiKongjian(Context chiyouzhe) {
        super(chiyouzhe);
    }

    public ZhantieShrukZidingyiKongjian(Context chiyouzhe, AttributeSet attrs) {
        super(chiyouzhe, attrs);
    }

    @Override
    public boolean onTextContextMenuItem(int id) {
        switch (id) {
            case android.R.id.cut:
                // 剪切
                break;
            case android.R.id.copy:
                // 复制
                break;
            case android.R.id.paste:
                // 粘贴
                if (mZhantieHuidiaoJianting != null) {
                    mZhantieHuidiaoJianting.zhanTie();
                }
        }
        return super.onTextContextMenuItem(id);
    }

    public void setOnZhantieHuidiaoJianting(ZhantieHuidiaoJianting zhantieHuidiaoJianting) {
        mZhantieHuidiaoJianting = zhantieHuidiaoJianting;
    }
}
