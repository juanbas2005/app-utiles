package defpackage;

import android.os.Build;
import android.view.autofill.AutofillValue;

/* renamed from: hj7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hj7 extends or0 {
    public boolean i0;
    public vr2 j0;
    public final fd7 k0 = new fd7(5, (Object) this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hj7(boolean z, ap4 ap4, boolean z2, s86 s86, vr2 vr2) {
        super(ap4, (oa3) null, false, z2, (String) null, s86, new to0(4, vr2, z));
        this.i0 = z;
        this.j0 = vr2;
    }

    public final void Y0(ok6 ok6) {
        ij7 ij7;
        ag agVar;
        if (this.i0) {
            ij7 = ij7.w;
        } else {
            ij7 = ij7.x;
        }
        mk6.h(ok6, ij7);
        cf cfVar = pe2.B;
        nk6 nk6 = jk6.s;
        yr3[] yr3Arr = mk6.a;
        yr3 yr3 = yr3Arr[9];
        ok6.f(nk6, cfVar);
        boolean z = this.i0;
        if (Build.VERSION.SDK_INT >= 26) {
            agVar = new ag(AutofillValue.forToggle(z));
        } else {
            agVar = null;
        }
        if (agVar != null) {
            nk6 nk62 = jk6.t;
            yr3 yr32 = yr3Arr[10];
            ok6.f(nk62, agVar);
        }
        mk6.b(ok6, new dp0(ok6, 1));
    }
}
