package defpackage;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkc7;", "Lpl4;", "Lnc7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kc7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kc7 extends pl4 {
    public final int A;
    public final boolean B;
    public final int C;
    public final int D;
    public final List E;
    public final vr2 F;
    public final vr2 G;
    public final vl w;
    public final tg7 x;
    public final dl2 y;
    public final vr2 z;

    public kc7(vl vlVar, tg7 tg7, dl2 dl2, vr2 vr2, int i, boolean z2, int i2, int i3, List list, vr2 vr22, vr2 vr23) {
        this.w = vlVar;
        this.x = tg7;
        this.y = dl2;
        this.z = vr2;
        this.A = i;
        this.B = z2;
        this.C = i2;
        this.D = i3;
        this.E = list;
        this.F = vr22;
        this.G = vr23;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc7)) {
            return false;
        }
        kc7 kc7 = (kc7) obj;
        if (sg3.e(this.w, kc7.w) && sg3.e(this.x, kc7.x) && sg3.e(this.E, kc7.E) && sg3.e(this.y, kc7.y) && this.z == kc7.z && this.G == kc7.G && this.A == kc7.A && this.B == kc7.B && this.C == kc7.C && this.D == kc7.D && this.F == kc7.F) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [nc7, ll4] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        ll4.M = this.y;
        ll4.N = this.z;
        ll4.O = this.A;
        ll4.P = this.B;
        ll4.Q = this.C;
        ll4.R = this.D;
        ll4.S = this.E;
        ll4.T = this.F;
        ll4.U = this.G;
        return ll4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    public final void h(ll4 ll4) {
        boolean z2;
        boolean e;
        boolean z3;
        List list;
        List list2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        dl2 dl2;
        dl2 dl22;
        int i5;
        int i6;
        vr2 vr2;
        vr2 vr22;
        vr2 vr23;
        vr2 vr24;
        vr2 vr25;
        vr2 vr26;
        boolean z6;
        boolean c;
        nc7 nc7 = (nc7) ll4;
        tg7 tg7 = nc7.L;
        boolean z7 = false;
        boolean z8 = true;
        tg7 tg72 = this.x;
        if (tg72 == tg7) {
            tg72.getClass();
        } else if (!tg72.a.b(tg7.a)) {
            z2 = true;
            String str = nc7.K.x;
            vl vlVar = this.w;
            e = sg3.e(str, vlVar.x);
            boolean e2 = sg3.e(nc7.K.w, vlVar.w);
            if (e || !e2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                nc7.K = vlVar;
            }
            if (!e) {
                nc7.Y = null;
            }
            boolean z9 = !nc7.L.c(tg72);
            nc7.L = tg72;
            list = nc7.S;
            list2 = this.E;
            if (!sg3.e(list, list2)) {
                nc7.S = list2;
                z9 = true;
            }
            i = nc7.R;
            i2 = this.D;
            if (i != i2) {
                nc7.R = i2;
                z9 = true;
            }
            i3 = nc7.Q;
            i4 = this.C;
            if (i3 != i4) {
                nc7.Q = i4;
                z9 = true;
            }
            z4 = nc7.P;
            z5 = this.B;
            if (z4 != z5) {
                nc7.P = z5;
                z9 = true;
            }
            dl2 = nc7.M;
            dl22 = this.y;
            if (!sg3.e(dl2, dl22)) {
                nc7.M = dl22;
                z9 = true;
            }
            i5 = nc7.O;
            i6 = this.A;
            if (i5 != i6) {
                nc7.O = i6;
                z9 = true;
            }
            vr2 = nc7.N;
            vr22 = this.z;
            if (vr2 != vr22) {
                nc7.N = vr22;
                z7 = true;
            }
            vr23 = nc7.T;
            vr24 = this.F;
            if (vr23 != vr24) {
                nc7.T = vr24;
                z7 = true;
            }
            vr25 = nc7.U;
            vr26 = this.G;
            if (vr25 == vr26) {
                nc7.U = vr26;
            } else {
                z8 = z7;
            }
            if (!z3 || z9 || z8) {
                rn4 V0 = nc7.V0();
                vl vlVar2 = nc7.K;
                tg7 tg73 = nc7.L;
                dl2 dl23 = nc7.M;
                int i7 = nc7.O;
                boolean z10 = nc7.P;
                int i8 = nc7.Q;
                int i9 = nc7.R;
                List list3 = nc7.S;
                V0.a = vlVar2;
                c = tg73.c(V0.k);
                V0.k = tg73;
                if (c) {
                    z6 = z9;
                    V0.q <<= 2;
                    V0.l = null;
                    V0.n = null;
                    V0.p = -1;
                    V0.o = -1;
                } else {
                    z6 = z9;
                }
                V0.b = dl23;
                V0.c = i7;
                V0.d = z10;
                V0.e = i8;
                V0.f = i9;
                V0.g = list3;
                V0.q = (V0.q << 2) | 2;
                V0.l = null;
                V0.n = null;
                V0.p = -1;
                V0.o = -1;
            } else {
                z6 = z9;
            }
            if (!nc7.J) {
                if (z3 || (z2 && nc7.X != null)) {
                    g75.D(nc7);
                }
                if (z3 || z6 || z8) {
                    su0.B(nc7);
                    rc9.e0(nc7);
                }
                if (z2) {
                    rc9.e0(nc7);
                    return;
                }
                return;
            }
            return;
        }
        z2 = false;
        String str2 = nc7.K.x;
        vl vlVar3 = this.w;
        e = sg3.e(str2, vlVar3.x);
        boolean e22 = sg3.e(nc7.K.w, vlVar3.w);
        if (e) {
        }
        z3 = true;
        if (z3) {
        }
        if (!e) {
        }
        boolean z92 = !nc7.L.c(tg72);
        nc7.L = tg72;
        list = nc7.S;
        list2 = this.E;
        if (!sg3.e(list, list2)) {
        }
        i = nc7.R;
        i2 = this.D;
        if (i != i2) {
        }
        i3 = nc7.Q;
        i4 = this.C;
        if (i3 != i4) {
        }
        z4 = nc7.P;
        z5 = this.B;
        if (z4 != z5) {
        }
        dl2 = nc7.M;
        dl22 = this.y;
        if (!sg3.e(dl2, dl22)) {
        }
        i5 = nc7.O;
        i6 = this.A;
        if (i5 != i6) {
        }
        vr2 = nc7.N;
        vr22 = this.z;
        if (vr2 != vr22) {
        }
        vr23 = nc7.T;
        vr24 = this.F;
        if (vr23 != vr24) {
        }
        vr25 = nc7.U;
        vr26 = this.G;
        if (vr25 == vr26) {
        }
        if (!z3) {
        }
        rn4 V02 = nc7.V0();
        vl vlVar22 = nc7.K;
        tg7 tg732 = nc7.L;
        dl2 dl232 = nc7.M;
        int i72 = nc7.O;
        boolean z102 = nc7.P;
        int i82 = nc7.Q;
        int i92 = nc7.R;
        List list32 = nc7.S;
        V02.a = vlVar22;
        c = tg732.c(V02.k);
        V02.k = tg732;
        if (c) {
        }
        V02.b = dl232;
        V02.c = i72;
        V02.d = z102;
        V02.e = i82;
        V02.f = i92;
        V02.g = list32;
        V02.q = (V02.q << 2) | 2;
        V02.l = null;
        V02.n = null;
        V02.p = -1;
        V02.o = -1;
        if (!nc7.J) {
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.y.hashCode() + pb4.c(this.x, this.w.hashCode() * 31, 31)) * 31;
        int i4 = 0;
        vr2 vr2 = this.z;
        if (vr2 != null) {
            i = vr2.hashCode();
        } else {
            i = 0;
        }
        int i5 = (((hl6.i(f21.e(this.A, (hashCode + i) * 31, 31), 31, this.B) + this.C) * 31) + this.D) * 31;
        List list = this.E;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        vr2 vr22 = this.F;
        if (vr22 != null) {
            i3 = vr22.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 29791;
        vr2 vr23 = this.G;
        if (vr23 != null) {
            i4 = vr23.hashCode();
        }
        return i7 + i4;
    }
}
