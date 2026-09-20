package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: n68  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class n68 {
    public static final t68 a;
    public static final wm0 b = new wm0(5, Float.class, "translationAlpha");

    /* JADX WARNING: type inference failed for: r0v3, types: [t68, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [t68, java.lang.Object] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new Object();
        } else {
            a = new Object();
        }
        new wm0(6, Rect.class, "clipBounds");
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.G(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.H(view, i);
    }
}
