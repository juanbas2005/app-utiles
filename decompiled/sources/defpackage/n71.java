package defpackage;

/* renamed from: n71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class n71 implements vr2 {
    public final /* synthetic */ hf7 A;
    public final /* synthetic */ v35 B;
    public final /* synthetic */ u44 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ w98 y;
    public final /* synthetic */ ze7 z;

    public /* synthetic */ n71(u44 u44, boolean z2, w98 w98, ze7 ze7, hf7 hf7, v35 v35) {
        this.w = u44;
        this.x = z2;
        this.y = w98;
        this.z = ze7;
        this.A = hf7;
        this.B = v35;
    }

    public final Object y(Object obj) {
        vf7 vf7;
        dy3 dy3;
        dy3 dy32;
        u44 u44 = this.w;
        ed5 ed5 = u44.o;
        dy3 dy33 = (dy3) obj;
        u44.h = dy33;
        cg7 d = u44.d();
        if (d != null) {
            d.b = dy33;
        }
        if (this.x) {
            ey2 a = u44.a();
            ey2 ey2 = ey2.x;
            ze7 ze7 = this.z;
            hf7 hf7 = this.A;
            if (a == ey2) {
                if (!((Boolean) u44.l.getValue()).booleanValue() || !((k44) this.y).b()) {
                    ze7.o();
                } else {
                    ze7.r();
                }
                u44.m.setValue(Boolean.valueOf(k75.m(ze7, true)));
                u44.n.setValue(Boolean.valueOf(k75.m(ze7, false)));
                ed5.setValue(Boolean.valueOf(lg7.c(hf7.b)));
            } else if (u44.a() == ey2.y) {
                ed5.setValue(Boolean.valueOf(k75.m(ze7, true)));
            }
            v35 v35 = this.B;
            pv8.M(u44, hf7, v35);
            cg7 d2 = u44.d();
            if (!(d2 == null || (vf7 = u44.e) == null || !u44.b() || (dy3 = d2.b) == null || !dy3.n() || (dy32 = d2.c) == null)) {
                bg7 bg7 = d2.a;
                st6 st6 = new st6(1, dy3);
                ly5 y2 = u55.y(dy3);
                ly5 Q = dy3.Q(dy32, false);
                if (sg3.e((vf7) vf7.a.b.get(), vf7)) {
                    vf7.b.d(hf7, v35, bg7, st6, y2, Q);
                }
            }
        }
        return vs7.a;
    }
}
