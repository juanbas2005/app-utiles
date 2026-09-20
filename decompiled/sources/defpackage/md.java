package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* renamed from: md  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class md extends b20 implements hk2 {
    public final String A;
    public final Rect B = new Rect();
    public final AutofillId C;
    public final zo4 D;
    public boolean E;
    public final kg5 w;
    public final ik6 x;
    public final je y;
    public final ny5 z;

    public md(kg5 kg5, ik6 ik6, je jeVar, ny5 ny5, String str) {
        AutofillId autofillId;
        this.w = kg5;
        this.x = ik6;
        this.y = jeVar;
        this.z = ny5;
        this.A = str;
        jeVar.setImportantForAutofill(1);
        a20 e = i75.e(jeVar);
        if (e != null) {
            autofillId = z10.c(e.w);
        } else {
            autofillId = null;
        }
        if (autofillId != null) {
            this.C = autofillId;
            this.D = new zo4();
            return;
        }
        throw b81.t("Required value was null.");
    }

    public final void b(vk2 vk2, vk2 vk22) {
        uy3 O0;
        ak6 x2;
        uy3 O02;
        ak6 x3;
        je jeVar = this.y;
        kg5 kg5 = this.w;
        if (!(vk2 == null || (O02 = rc9.O0(vk2)) == null || (x3 = O02.x()) == null || !we.c(x3))) {
            kg5.w().notifyViewExited(jeVar, O02.x);
        }
        if (vk22 != null && (O0 = rc9.O0(vk22)) != null && (x2 = O0.x()) != null && we.c(x2)) {
            int i = O0.x;
            ny5 ny5 = this.z;
            uy3 uy3 = (uy3) ny5.a.b(i);
            if (uy3 != null && uy3.C != -4) {
                ig igVar = ny5.c;
                int e = ny5.e(uy3);
                long[] jArr = (long[]) igVar.c;
                long j = jArr[e];
                long j2 = jArr[e + 1];
                kg5.w().notifyViewEntered(jeVar, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
            }
        }
    }
}
