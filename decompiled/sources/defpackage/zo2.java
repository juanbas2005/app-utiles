package defpackage;

import android.content.Context;

/* renamed from: zo2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zo2 implements sr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ zo2(vr2 vr2, Context context, se4 se4, se4 se42, aq4 aq4, aq4 aq42) {
        this.A = vr2;
        this.z = context;
        this.B = se4;
        this.C = se42;
        this.x = aq4;
        this.y = aq42;
    }

    public final Object b() {
        boolean z2;
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj = this.y;
        Object obj2 = this.x;
        Object obj3 = this.C;
        Object obj4 = this.B;
        Object obj5 = this.z;
        Object obj6 = this.A;
        switch (i) {
            case b85.b:
                vr2 vr2 = (vr2) obj6;
                String str = (String) obj5;
                aq4 aq4 = (aq4) obj4;
                aq4 aq42 = (aq4) obj3;
                String obj7 = d57.k1((String) ((aq4) obj2).getValue()).toString();
                String obj8 = d57.k1((String) ((aq4) obj).getValue()).toString();
                if (str != null) {
                    vr2.y(new ez4(obj7, obj8, str, (byte[]) aq4.getValue(), ((Boolean) aq42.getValue()).booleanValue()));
                }
                return vs7;
            case 1:
                c23 c23 = (c23) obj6;
                aq4 aq43 = (aq4) obj;
                o81 o81 = (o81) obj4;
                is2 is2 = (is2) obj3;
                String str2 = (String) obj5;
                if (!((is7) ((aq4) obj2).getValue()).b) {
                    aq43.setValue(Boolean.TRUE);
                    qj qjVar = new qj((Object) o81, (Object) aq43, (Object) is2, (Object) str2, 7);
                    if (!((is7) c23.j.getValue()).b) {
                        ar7.H(u58.a(c23), (e81) null, (r81) null, new p0((Object) c23, (Object) qjVar, (f61) null, 26), 3);
                    }
                }
                return vs7;
            case 2:
                ne6 ne6 = (ne6) obj6;
                lf6 lf6 = (lf6) obj2;
                re6 re6 = (re6) obj;
                String str3 = (String) obj5;
                Object[] objArr = (Object[]) obj3;
                boolean z3 = true;
                if (ne6.x != re6) {
                    ne6.x = re6;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!sg3.e(ne6.y, str3)) {
                    ne6.y = str3;
                } else {
                    z3 = z2;
                }
                ne6.w = lf6;
                ne6.z = obj4;
                ne6.A = objArr;
                cf4 cf4 = ne6.B;
                if (cf4 != null && z3) {
                    cf4.E();
                    ne6.B = null;
                    ne6.d();
                }
                return vs7;
            default:
                bb0.O((Context) obj5, (se4) obj4, (se4) obj3, (aq4) obj2, (aq4) obj, (vr2) obj6, true);
                return vs7;
        }
    }

    public /* synthetic */ zo2(vr2 vr2, String str, aq4 aq4, aq4 aq42, aq4 aq43, aq4 aq44) {
        this.A = vr2;
        this.z = str;
        this.x = aq4;
        this.y = aq42;
        this.B = aq43;
        this.C = aq44;
    }

    public /* synthetic */ zo2(c23 c23, aq4 aq4, aq4 aq42, o81 o81, is2 is2, String str) {
        this.A = c23;
        this.x = aq4;
        this.y = aq42;
        this.B = o81;
        this.C = is2;
        this.z = str;
    }

    public /* synthetic */ zo2(ne6 ne6, lf6 lf6, re6 re6, String str, Object obj, Object[] objArr) {
        this.A = ne6;
        this.x = lf6;
        this.y = re6;
        this.z = str;
        this.B = obj;
        this.C = objArr;
    }
}
