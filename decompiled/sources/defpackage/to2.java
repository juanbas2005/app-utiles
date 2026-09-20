package defpackage;

import java.util.List;

/* renamed from: to2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class to2 implements vr2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ gs2 B;
    public final /* synthetic */ vr2 C;
    public final /* synthetic */ vr2 D;
    public final /* synthetic */ aq4 E;
    public final /* synthetic */ aq4 F;
    public final /* synthetic */ mo2 w;
    public final /* synthetic */ aq4 x;
    public final /* synthetic */ o81 y;
    public final /* synthetic */ is2 z;

    public /* synthetic */ to2(mo2 mo2, aq4 aq4, o81 o81, is2 is2, String str, gs2 gs2, vr2 vr2, vr2 vr22, aq4 aq42, aq4 aq43) {
        this.w = mo2;
        this.x = aq4;
        this.y = o81;
        this.z = is2;
        this.A = str;
        this.B = gs2;
        this.C = vr2;
        this.D = vr22;
        this.E = aq42;
        this.F = aq43;
    }

    public final Object y(Object obj) {
        h34 h34 = (h34) obj;
        h34.getClass();
        mo2 mo2 = this.w;
        List list = mo2.a;
        vd2 vd2 = new vd2(4);
        int size = list.size();
        e3 e3Var = new e3(11, (Object) vd2, (Object) list);
        y20 y20 = new y20(4, list);
        y20 y202 = y20;
        y20 y203 = y202;
        y20 y204 = y203;
        y20 y205 = y204;
        y20 y206 = y205;
        y20 y207 = y206;
        y20 y208 = y207;
        y20 y209 = y208;
        h34.P(size, e3Var, y209, new fw0(802480018, new fp2(list, this.x, mo2, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F), true));
        if (mo2.m) {
            h34.O(h34, "forum_loading_more", ie1.c);
        }
        return vs7.a;
    }
}
