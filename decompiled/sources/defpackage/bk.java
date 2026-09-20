package defpackage;

/* renamed from: bk  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bk extends wx3 implements gs2 {
    public final /* synthetic */ vr2 A;
    public final /* synthetic */ mk B;
    public final /* synthetic */ yx6 C;
    public final /* synthetic */ fw0 D;
    public final /* synthetic */ Object x;
    public final /* synthetic */ mm7 y;
    public final /* synthetic */ hf5 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bk(Object obj, mm7 mm7, hf5 hf5, vr2 vr2, mk mkVar, yx6 yx6, fw0 fw0) {
        super(2);
        this.x = obj;
        this.y = mm7;
        this.z = hf5;
        this.A = vr2;
        this.B = mkVar;
        this.C = yx6;
        this.D = fw0;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        x82 x82;
        k51 k51;
        hf5 hf5;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Number) obj2).intValue();
        boolean z3 = false;
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            mm7 mm7 = this.y;
            ed5 ed5 = mm7.e;
            ed5 ed52 = mm7.d;
            Object value = ed5.getValue();
            Object obj3 = this.x;
            boolean h = yt2.h(sg3.e(obj3, value));
            Object Q = yt2.Q();
            vr2 vr2 = this.A;
            d63 d63 = ay0.a;
            mk mkVar = this.B;
            if (h || Q == d63) {
                if (!sg3.e(obj3, ed5.getValue()) || (hf5 = this.z) == null) {
                    k51 = (k51) vr2.y(mkVar);
                } else {
                    k51 = (k51) vr2.y(hf5);
                }
                Q = k51;
                yt2.o0(Q);
            }
            k51 k512 = (k51) Q;
            boolean h2 = yt2.h(sg3.e(mm7.f().d(), obj3));
            Object Q2 = yt2.Q();
            if (h2 || Q2 == d63) {
                if (sg3.e(mm7.f().d(), obj3)) {
                    x82 = x82.b;
                } else {
                    x82 = ((k51) vr2.y(mkVar)).b;
                }
                Q2 = x82;
                yt2.o0(Q2);
            }
            x82 x822 = (x82) Q2;
            Object Q3 = yt2.Q();
            if (Q3 == d63) {
                Q3 = new hk(sg3.e(obj3, ed52.getValue()));
                yt2.o0(Q3);
            }
            hk hkVar = (hk) Q3;
            n52 n52 = k512.a;
            boolean i = yt2.i(k512);
            Object Q4 = yt2.Q();
            if (i || Q4 == d63) {
                Q4 = new yj(0, k512);
                yt2.o0(Q4);
            }
            ml4 D2 = we.D(jl4.w, (hs2) Q4);
            hkVar.w.setValue(Boolean.valueOf(sg3.e(obj3, ed52.getValue())));
            if (sg3.e(obj3, ed5.getValue()) && !sg3.e(obj3, ed52.getValue()) && !sg3.e(obj3, mm7.a.H0())) {
                z3 = true;
            }
            hkVar.x.setValue(Boolean.valueOf(z3));
            ml4 d = D2.d(hkVar);
            boolean i2 = yt2.i(obj3);
            Object Q5 = yt2.Q();
            if (i2 || Q5 == d63) {
                Q5 = new pb(5, obj3);
                yt2.o0(Q5);
            }
            vr2 vr22 = (vr2) Q5;
            boolean g = yt2.g(x822);
            Object Q6 = yt2.Q();
            if (g || Q6 == d63) {
                Q6 = new z0(3, x822);
                yt2.o0(Q6);
            }
            ie1.a(this.y, vr22, d, n52, x822, (gs2) Q6, su0.J(1831990167, new ak(this.C, obj3, mkVar, this.D), yt2), yt2, 100663296);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
