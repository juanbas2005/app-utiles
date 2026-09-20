package defpackage;

/* renamed from: k13  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class k13 implements gs2 {
    public final /* synthetic */ sr2 A;
    public final /* synthetic */ sr2 B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ x83 w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;
    public final /* synthetic */ hl7 z;

    public /* synthetic */ k13(x83 x83, long j, long j2, hl7 hl7, sr2 sr2, sr2 sr22, String str, String str2) {
        this.w = x83;
        this.x = j;
        this.y = j2;
        this.z = hl7;
        this.A = sr2;
        this.B = sr22;
        this.C = str;
        this.D = str2;
    }

    public final Object H(Object obj, Object obj2) {
        boolean z2;
        yt2 yt2 = (yt2) obj;
        int intValue = ((Integer) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt2.V(intValue & 1, z2)) {
            jl4 jl4 = jl4.w;
            ml4 L = x91.L(jl4, 14.0f, 10.0f);
            ea6 a = ca6.a(wr.a, xb4.I, yt2, 48);
            int hashCode = Long.hashCode(yt2.T);
            vf5 m = yt2.m();
            ml4 E = gw8.E(yt2, L);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt2, a);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt2, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt2, valueOf);
            ce ceVar = tx0.h;
            g75.O(yt2, ceVar);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt2, E);
            ck ckVar5 = ckVar3;
            ck ckVar6 = ckVar4;
            ce ceVar2 = ceVar;
            t13.q(this.w, this.x, this.y, 40, yt2, 3072, 0);
            k75.a(yt2, yu6.p(jl4, 12.0f));
            lz3 lz3 = new lz3(1.0f, true);
            au0 a2 = zt0.a(wr.c, xb4.K, yt2, 0);
            int hashCode2 = Long.hashCode(yt2.T);
            vf5 m2 = yt2.m();
            ml4 E2 = gw8.E(yt2, lz3);
            yt2.i0();
            if (yt2.S) {
                yt2.l(vy0);
            } else {
                yt2.r0();
            }
            g75.Q(ckVar, yt2, a2);
            g75.Q(ckVar2, yt2, m2);
            f21.s(hashCode2, yt2, ckVar5, yt2, ceVar2);
            g75.Q(ckVar6, yt2, E2);
            yt2 yt22 = yt2;
            jl4 jl42 = jl4;
            yf7.b(this.C, (ml4) null, z08.k(), ya5.k(14), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 1597440, 0, 262058);
            yf7.b(this.D, (ml4) null, z08.e(), ya5.k(12), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt22, 24576, 0, 262122);
            yt2 yt23 = yt22;
            yt23.r(true);
            hl7 hl7 = this.z;
            boolean z3 = hl7 instanceof gl7;
            sr2 sr2 = this.A;
            if (z3) {
                yt23.e0(-1433411656);
                t13.w(((gl7) hl7).a, sr2, yt23, 0);
                yt23.r(false);
            } else if (hl7.equals(el7.a)) {
                yt23.e0(-1485983377);
                t13.v(gl0.V(), this.B, yt23, 0);
                k75.a(yt23, yu6.p(jl42, 6.0f));
                t13.w(b96.z(), sr2, yt23, 0);
                yt23.r(false);
            } else if (hl7.equals(fl7.a)) {
                yt23.e0(-1433399317);
                t13.l(sr2, yt23, 0);
                yt23.r(false);
            } else {
                yt23.e0(-1433413067);
                yt23.r(false);
                h.c();
                return null;
            }
            yt23.r(true);
        } else {
            yt2.Y();
        }
        return vs7.a;
    }
}
