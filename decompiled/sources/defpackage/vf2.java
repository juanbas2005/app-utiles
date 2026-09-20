package defpackage;

import android.content.Context;

/* renamed from: vf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vf2 implements cb2 {
    public final /* synthetic */ int a = 1;
    public final ku5 b;
    public final ku5 c;
    public final ku5 d;

    public vf2(ku5 ku5, ku5 ku52, ku5 ku53) {
        this.b = ku5;
        this.c = ku52;
        this.d = ku53;
    }

    public final Object get() {
        int i = this.a;
        ku5 ku5 = this.d;
        ku5 ku52 = this.c;
        ku5 ku53 = this.b;
        switch (i) {
            case b85.b:
                Context context = (Context) ((om6) ku5).b;
                e81 e81 = (e81) ku53.get();
                nm6 nm6 = (nm6) ku52.get();
                context.getClass();
                e81.getClass();
                nm6.getClass();
                return g22.n(nm6, new br4(9, (Object) new gg0(24, (Object) nm6)), gl0.E(e81), new n20(context, 8));
            default:
                return new eo6((e81) ku53.get(), (mi7) ku52.get(), (qe1) ku5.get());
        }
    }

    public vf2(om6 om6, ku5 ku5, ku5 ku52) {
        this.d = om6;
        this.b = ku5;
        this.c = ku52;
    }
}
