package defpackage;

import android.graphics.Typeface;

/* renamed from: qc7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qc7 extends b85 {
    public final /* synthetic */ t35 d;
    public final /* synthetic */ sc7 e;

    public qc7(sc7 sc7, t35 t35) {
        this.e = sc7;
        this.d = t35;
    }

    public final void o(int i) {
        this.e.n = true;
        this.d.y(i);
    }

    public final void p(Typeface typeface) {
        sc7 sc7 = this.e;
        Typeface create = Typeface.create(typeface, sc7.d);
        sc7.p = create;
        sc7.n = true;
        this.d.z(create, false);
    }
}
