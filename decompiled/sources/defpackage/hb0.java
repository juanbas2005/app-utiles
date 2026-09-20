package defpackage;

import android.os.Build;

/* renamed from: hb0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hb0 {
    public static final /* synthetic */ hb0 a = new Object();
    public static final String b = ib0.class.getSimpleName();

    public static ib0 a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return jb0.w;
        }
        if (i >= 29) {
            return d63.y;
        }
        if (i >= 28) {
            return hz2.y;
        }
        return pe2.y;
    }
}
