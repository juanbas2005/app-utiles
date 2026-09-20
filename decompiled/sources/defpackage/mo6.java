package defpackage;

import android.content.Context;

/* renamed from: mo6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class mo6 implements sr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ Context x;
    public final /* synthetic */ se4 y;
    public final /* synthetic */ aq4 z;

    public /* synthetic */ mo6(vr2 vr2, Context context, se4 se4, String[] strArr, se4 se42, aq4 aq4, aq4 aq42) {
        this.A = vr2;
        this.x = context;
        this.y = se4;
        this.C = strArr;
        this.B = se42;
        this.z = aq4;
        this.D = aq42;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj = this.D;
        Object obj2 = this.C;
        Object obj3 = this.B;
        Object obj4 = this.A;
        switch (i) {
            case b85.b:
                Context context = this.x;
                se4 se4 = this.y;
                aq4 aq4 = this.z;
                bb0.P(context, se4, (String[]) obj2, (se4) obj3, aq4, (aq4) obj, (vr2) obj4, true);
                return vs7;
            default:
                o81 o81 = (o81) obj3;
                is2 is2 = (is2) obj2;
                String str = (String) obj;
                String g = ((hw6) obj4).g();
                if (g != null) {
                    this.z.setValue(g);
                } else if (!sg3.A(this.x, "android.permission.READ_PHONE_STATE")) {
                    this.y.d0("android.permission.READ_PHONE_STATE");
                } else {
                    ar7.H(o81, (e81) null, (r81) null, new ep2(is2, str, (f61) null, 5), 3);
                }
                return vs7;
        }
    }

    public /* synthetic */ mo6(hw6 hw6, Context context, se4 se4, o81 o81, aq4 aq4, is2 is2, String str) {
        this.A = hw6;
        this.x = context;
        this.y = se4;
        this.B = o81;
        this.z = aq4;
        this.C = is2;
        this.D = str;
    }
}
