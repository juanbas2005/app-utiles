package defpackage;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: hg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hg {
    public final Bitmap a;

    public hg(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.a.getConfig();
        config.getClass();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        if (i < 26 || config != Bitmap.Config.HARDWARE) {
            return 0;
        }
        return 4;
    }
}
