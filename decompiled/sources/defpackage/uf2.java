package defpackage;

import android.content.Context;

/* renamed from: uf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uf2 implements cb2 {
    public final /* synthetic */ int a;
    public final om6 b;
    public final ku5 c;

    public uf2(ku5 ku5, om6 om6) {
        this.a = 2;
        this.c = ku5;
        this.b = om6;
    }

    public final Object get() {
        int i = this.a;
        om6 om6 = this.b;
        ku5 ku5 = this.c;
        switch (i) {
            case b85.b:
                Context context = (Context) om6.b;
                e81 e81 = (e81) ku5.get();
                context.getClass();
                e81.getClass();
                return g22.n(km6.w, new br4(9, (Object) new vd2(1)), gl0.E(e81), new n20(context, 7));
            case 1:
                return new dp5((Context) om6.b, (q18) ku5.get());
            default:
                return new g46((hr) ku5.get(), (e81) om6.b);
        }
    }

    public /* synthetic */ uf2(om6 om6, ku5 ku5, int i) {
        this.a = i;
        this.b = om6;
        this.c = ku5;
    }
}
