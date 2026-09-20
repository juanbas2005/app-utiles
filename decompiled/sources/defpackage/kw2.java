package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* renamed from: kw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class kw2 {
    public final Context a;
    public final String b;
    public final ns8 c;
    public final qc3 d;
    public final ym e;
    public final ln f;
    public final Looper g;
    public final int h;
    public final pg8 i;
    public final g22 j;
    public final pw2 k;

    public kw2(Context context, qc3 qc3, ym ymVar, jw2 jw2) {
        String str;
        z65.l("Null context is not permitted.", context);
        z65.l("Api must not be null.", qc3);
        z65.l("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.", jw2);
        Context applicationContext = context.getApplicationContext();
        z65.l("The provided context did not have an application context.", applicationContext);
        this.a = applicationContext;
        int i2 = Build.VERSION.SDK_INT;
        ns8 ns8 = null;
        if (i2 < 30 || i2 < 30) {
            str = null;
        } else {
            str = x4.b(context);
        }
        this.b = str;
        this.c = i2 >= 31 ? new ns8(6, (Object) context.getAttributionSource()) : ns8;
        this.d = qc3;
        this.e = ymVar;
        this.g = jw2.b;
        this.f = new ln(qc3, ymVar, str);
        this.i = new pg8(this);
        pw2 e2 = pw2.e(applicationContext);
        this.k = e2;
        this.h = e2.D.getAndIncrement();
        this.j = jw2.a;
        ph8 ph8 = e2.I;
        ph8.sendMessage(ph8.obtainMessage(7, this));
    }

    public final wr0 a() {
        wr0 wr0 = new wr0(15, false);
        Set set = Collections.EMPTY_SET;
        if (((os) wr0.x) == null) {
            wr0.x = new os(0);
        }
        ((os) wr0.x).addAll(set);
        Context context = this.a;
        wr0.z = context.getClass().getName();
        wr0.y = context.getPackageName();
        return wr0;
    }

    public final yb9 b(int i2, i93 i93) {
        xb7 xb7 = new xb7();
        pw2 pw2 = this.k;
        pw2.getClass();
        pw2.c(xb7, i93.b, this);
        ug8 ug8 = new ug8(new hh8(i2, i93, xb7, this.j), pw2.E.get(), this);
        ph8 ph8 = pw2.I;
        ph8.sendMessage(ph8.obtainMessage(4, ug8));
        return xb7.a;
    }
}
