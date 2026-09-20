package defpackage;

import android.content.Context;
import cu.lestebang.utiletecsa.R;

/* renamed from: o22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o22 {
    public static final int f = ((int) Math.round(5.1000000000000005d));
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public o22(Context context) {
        boolean J = gw8.J(context, R.attr.elevationOverlayEnabled, false);
        int y = h49.y(context, R.attr.elevationOverlayColor, 0);
        int y2 = h49.y(context, R.attr.elevationOverlayAccentColor, 0);
        int y3 = h49.y(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = J;
        this.b = y;
        this.c = y2;
        this.d = y3;
        this.e = f2;
    }
}
