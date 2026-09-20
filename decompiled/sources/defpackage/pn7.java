package defpackage;

import android.os.Build;
import android.view.autofill.AutofillValue;

/* renamed from: pn7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pn7 extends or0 {
    public ij7 i0;

    public final void Y0(ok6 ok6) {
        boolean z;
        ag agVar;
        mk6.h(ok6, this.i0);
        cf cfVar = pe2.B;
        nk6 nk6 = jk6.s;
        yr3[] yr3Arr = mk6.a;
        yr3 yr3 = yr3Arr[9];
        ok6.f(nk6, cfVar);
        if (this.i0 != ij7.y) {
            z = true;
        } else {
            z = false;
        }
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
        mk6.b(ok6, new dp0(ok6, 2));
    }
}
