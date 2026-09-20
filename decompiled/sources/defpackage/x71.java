package defpackage;

import android.os.Build;
import android.view.autofill.AutofillValue;

/* renamed from: x71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x71 extends wo1 implements dk6 {
    public tl7 M;
    public hf7 N;
    public u44 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public v35 S;
    public ze7 T;
    public c93 U;
    public ok2 V;

    public static void Y0(u44 u44, String str, boolean z, boolean z2) {
        if (!z && z2) {
            vf7 vf7 = u44.e;
            j71 j71 = u44.v;
            if (vf7 != null) {
                hf7 h = u44.d.h(sg3.E(new Object(), new ou0(str, 1)));
                vf7.a((hf7) null, h);
                j71.y(h);
                return;
            }
            int length = str.length();
            j71.y(new hf7(4, i95.a(length, length), str));
        }
    }

    public final void D0(ok6 ok6) {
        ag agVar;
        boolean z = this.R;
        vl vlVar = this.N.a;
        yr3[] yr3Arr = mk6.a;
        nk6 nk6 = jk6.F;
        yr3[] yr3Arr2 = mk6.a;
        yr3 yr3 = yr3Arr2[18];
        ok6.f(nk6, vlVar);
        vl vlVar2 = this.M.a;
        nk6 nk62 = jk6.G;
        yr3 yr32 = yr3Arr2[19];
        ok6.f(nk62, vlVar2);
        long j = this.N.b;
        nk6 nk63 = jk6.H;
        yr3 yr33 = yr3Arr2[20];
        ok6.f(nk63, new lg7(j));
        cf cfVar = pe2.A;
        nk6 nk64 = jk6.s;
        yr3 yr34 = yr3Arr2[9];
        ok6.f(nk64, cfVar);
        vl vlVar3 = this.N.a;
        if (Build.VERSION.SDK_INT >= 26) {
            agVar = new ag(AutofillValue.forText(r16.i0(vlVar3)));
        } else {
            agVar = null;
        }
        if (agVar != null) {
            nk6 nk65 = jk6.t;
            yr3 yr35 = yr3Arr2[10];
            ok6.f(nk65, agVar);
        }
        boolean z2 = false;
        mk6.b(ok6, new w71(this, 0));
        int i = this.U.d;
        if (i == 6) {
            r51.a.getClass();
            df dfVar = m51.c;
            nk6 nk66 = jk6.r;
            yr3 yr36 = yr3Arr2[8];
            ok6.f(nk66, dfVar);
        } else if (i == 7 || i == 8) {
            r51.a.getClass();
            df dfVar2 = m51.b;
            nk6 nk67 = jk6.r;
            yr3 yr37 = yr3Arr2[8];
            ok6.f(nk67, dfVar2);
        } else if (i == 4) {
            r51.a.getClass();
            df dfVar3 = m51.d;
            nk6 nk68 = jk6.r;
            yr3 yr38 = yr3Arr2[8];
            ok6.f(nk68, dfVar3);
        }
        boolean z3 = this.Q;
        vs7 vs7 = vs7.a;
        if (!z3) {
            ok6.f(jk6.j, vs7);
        }
        if (z) {
            ok6.f(jk6.L, vs7);
        }
        if (this.Q && !this.P) {
            z2 = true;
        }
        nk6 nk69 = jk6.O;
        yr3 yr39 = yr3Arr2[28];
        ok6.f(nk69, Boolean.valueOf(z2));
        mk6.a(ok6, new w71(this, 1));
        if (z2) {
            ok6.f(zj6.k, new h4((String) null, new w71(this, 2)));
            ok6.f(zj6.o, new h4((String) null, new w71(this, ok6)));
        }
        ok6.f(zj6.j, new h4((String) null, new xa7(2, (Object) this)));
        int i2 = this.U.e;
        v71 v71 = new v71(this, 6);
        ok6.f(jk6.I, new b93(i2));
        ok6.f(zj6.p, new h4((String) null, v71));
        ok6.f(zj6.b, new h4((String) null, new v71(this, 7)));
        ok6.f(zj6.c, new h4((String) null, new v71(this, 1)));
        if (!lg7.c(this.N.b) && !z) {
            ok6.f(zj6.q, new h4((String) null, new v71(this, 2)));
            if (this.Q && !this.P) {
                ok6.f(zj6.r, new h4((String) null, new v71(this, 3)));
            }
        }
        if (this.Q && !this.P) {
            ok6.f(zj6.s, new h4((String) null, new v71(this, 5)));
        }
    }

    public final boolean G0() {
        return true;
    }
}
