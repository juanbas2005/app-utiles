package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: jc1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jc1 implements lm7 {
    public final rt a;
    public final t83 b;
    public final int c;

    public jc1(rt rtVar, t83 t83, int i) {
        this.a = rtVar;
        this.b = t83;
        this.c = i;
        if (i <= 0) {
            h.q("durationMillis must be > 0.");
            throw null;
        }
    }

    public final void a() {
        boolean z;
        this.a.getClass();
        t83 t83 = this.b;
        Drawable a2 = t83.a();
        wf6 wf6 = t83.b().x;
        boolean z2 = t83 instanceof f77;
        if (!z2 || !((f77) t83).g) {
            z = true;
        } else {
            z = false;
        }
        new gc1(a2, wf6, this.c, z);
        if (!z2 && !(t83 instanceof s62)) {
            h.c();
        }
    }
}
