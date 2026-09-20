package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ab7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ab7 implements gs2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ fw0 x;
    public final /* synthetic */ gs2 y;
    public final /* synthetic */ fw0 z;

    public /* synthetic */ ab7(fw0 fw0, gs2 gs2, fw0 fw02, int i) {
        this.w = i;
        this.x = fw0;
        this.y = gs2;
        this.z = fw02;
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [java.lang.Object, f06] */
    public final Object H(Object obj, Object obj2) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.w;
        vs7 vs7 = vs7.a;
        fw0 fw0 = this.x;
        switch (i) {
            case b85.b /*0*/:
                vs7 vs72 = vs7;
                yt2 yt2 = (yt2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt2.V(intValue & 1, z2)) {
                    sd2 sd2 = yu6.a;
                    boolean g = yt2.g(fw0);
                    gs2 gs2 = this.y;
                    fw0 fw02 = this.z;
                    boolean g2 = g | yt2.g(gs2) | yt2.g(fw02);
                    Object Q = yt2.Q();
                    if (g2 || Q == ay0.a) {
                        Q = new ab7(fw0, gs2, fw02, 2);
                        yt2.o0(Q);
                    }
                    m67.a(sd2, (gs2) Q, yt2, 6, 0);
                } else {
                    yt2.Y();
                }
                return vs72;
            case 1:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt22.V(intValue2 & 1, z3)) {
                    au0 a = zt0.a(wr.g, xb4.K, yt22, 6);
                    int hashCode = Long.hashCode(yt22.T);
                    vf5 m = yt22.m();
                    jl4 jl4 = jl4.w;
                    ml4 E = gw8.E(yt22, jl4);
                    ux0.d.getClass();
                    vy0 vy0 = tx0.b;
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    ck ckVar = tx0.f;
                    g75.Q(ckVar, yt22, a);
                    ck ckVar2 = tx0.e;
                    g75.Q(ckVar2, yt22, m);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ck ckVar3 = tx0.g;
                    g75.Q(ckVar3, yt22, valueOf);
                    ce ceVar = tx0.h;
                    g75.O(yt22, ceVar);
                    ck ckVar4 = tx0.d;
                    g75.Q(ckVar4, yt22, E);
                    ik2 ik2 = (ik2) yt22.k(xy0.i);
                    if (yt22.k(xy0.n) == ey3.x) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    bu0 bu0 = bu0.a;
                    ml4 a2 = bu0.a(false);
                    i80 i80 = xb4.y;
                    lh4 d = mb0.d(i80, false);
                    int hashCode2 = Long.hashCode(yt22.T);
                    vf5 m2 = yt22.m();
                    ml4 E2 = gw8.E(yt22, a2);
                    yt22.i0();
                    vs7 vs73 = vs7;
                    if (yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    g75.Q(ckVar, yt22, d);
                    g75.Q(ckVar2, yt22, m2);
                    f21.s(hashCode2, yt22, ckVar3, yt22, ceVar);
                    g75.Q(ckVar4, yt22, E2);
                    fw0.u(bu0, yt22, 6);
                    yt22.r(true);
                    f23 f23 = new f23(xb4.M);
                    jl4.d(f23);
                    ml4 J = x91.J(f23, qg1.a);
                    lh4 d2 = mb0.d(i80, false);
                    int hashCode3 = Long.hashCode(yt22.T);
                    vf5 m3 = yt22.m();
                    ml4 E3 = gw8.E(yt22, J);
                    yt22.i0();
                    if (yt22.S) {
                        yt22.l(vy0);
                    } else {
                        yt22.r0();
                    }
                    g75.Q(ckVar, yt22, d2);
                    g75.Q(ckVar2, yt22, m3);
                    f21.s(hashCode3, yt22, ckVar3, yt22, ceVar);
                    g75.Q(ckVar4, yt22, E3);
                    a35.a(st0.e(ar7.f0, yt22), dr7.a(ar7.g0, yt22), su0.J(-1103927529, new ng1(ik2, this.y, z4, this.z, 0), yt22), yt22, 384);
                    yt22.r(true);
                    yt22.r(true);
                    return vs73;
                }
                vs7 vs74 = vs7;
                yt22.Y();
                return vs74;
            default:
                q67 q67 = (q67) obj;
                k31 k31 = (k31) obj2;
                int h = k31.h(k31.a);
                List x2 = q67.x(fw0, cb7.w);
                int size = x2.size();
                ? obj3 = new Object();
                if (size > 0) {
                    obj3.w = h / size;
                }
                Integer num = 0;
                int size2 = x2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    num = Integer.valueOf(Math.max(((gh4) x2.get(i2)).c(obj3.w), num.intValue()));
                }
                int intValue3 = num.intValue();
                ArrayList arrayList = new ArrayList(x2.size());
                int size3 = x2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    gh4 gh4 = (gh4) x2.get(i3);
                    int i4 = obj3.w;
                    if (i4 < 0 || intValue3 < 0) {
                        ac3.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
                    }
                    arrayList.add(gh4.y(m31.h(i4, i4, intValue3, intValue3)));
                }
                ArrayList arrayList2 = new ArrayList(size);
                for (int i5 = 0; i5 < size; i5++) {
                    lx1 lx1 = new lx1(q67.P(Math.min(((gh4) x2.get(i5)).v(intValue3), obj3.w)) - (va7.c * 2.0f));
                    lx1 lx12 = new lx1(24.0f);
                    if (lx1.compareTo(lx12) < 0) {
                        lx1 = lx12;
                    }
                    arrayList2.add(new wa7(q67.P(obj3.w) * ((float) i5), q67.P(obj3.w), lx1.w));
                }
                return q67.d0(h, intValue3, b42.w, new bb7(arrayList, q67, this.y, obj3, k31, intValue3, this.z, arrayList2, h));
        }
    }
}
