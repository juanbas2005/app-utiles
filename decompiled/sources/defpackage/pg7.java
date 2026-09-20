package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpg7;", "Lpl4;", "Lsg7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pg7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pg7 extends pl4 {
    public final boolean A;
    public final int B;
    public final int C;
    public final String w;
    public final tg7 x;
    public final dl2 y;
    public final int z;

    public pg7(String str, tg7 tg7, dl2 dl2, int i, boolean z2, int i2, int i3) {
        this.w = str;
        this.x = tg7;
        this.y = dl2;
        this.z = i;
        this.A = z2;
        this.B = i2;
        this.C = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg7)) {
            return false;
        }
        pg7 pg7 = (pg7) obj;
        if (sg3.e(this.w, pg7.w) && sg3.e(this.x, pg7.x) && sg3.e(this.y, pg7.y) && this.z == pg7.z && this.A == pg7.A && this.B == pg7.B && this.C == pg7.C) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [sg7, ll4] */
    public final ll4 g() {
        ? ll4 = new ll4();
        ll4.K = this.w;
        ll4.L = this.x;
        ll4.M = this.y;
        ll4.N = this.z;
        ll4.O = this.A;
        ll4.P = this.B;
        ll4.Q = this.C;
        return ll4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    public final void h(ll4 ll4) {
        boolean z2;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        dl2 dl2;
        dl2 dl22;
        int i5;
        int i6;
        sg7 sg7 = (sg7) ll4;
        sg7.getClass();
        tg7 tg7 = sg7.L;
        boolean z5 = false;
        boolean z6 = true;
        tg7 tg72 = this.x;
        if (tg72 == tg7) {
            tg72.getClass();
        } else if (!tg72.a.b(tg7.a)) {
            z2 = true;
            str = sg7.K;
            str2 = this.w;
            if (!sg3.e(str, str2)) {
                sg7.K = str2;
                sg7.U = null;
                z5 = true;
            }
            boolean z7 = !sg7.L.c(tg72);
            sg7.L = tg72;
            i = sg7.Q;
            i2 = this.C;
            if (i != i2) {
                sg7.Q = i2;
                z7 = true;
            }
            i3 = sg7.P;
            i4 = this.B;
            if (i3 != i4) {
                sg7.P = i4;
                z7 = true;
            }
            z3 = sg7.O;
            z4 = this.A;
            if (z3 != z4) {
                sg7.O = z4;
                z7 = true;
            }
            dl2 = sg7.M;
            dl22 = this.y;
            if (!sg3.e(dl2, dl22)) {
                sg7.M = dl22;
                z7 = true;
            }
            i5 = sg7.N;
            i6 = this.z;
            if (i5 != i6) {
                z6 = z7;
            } else {
                sg7.N = i6;
            }
            if (z5 || z6) {
                mc5 V0 = sg7.V0();
                String str3 = sg7.K;
                tg7 tg73 = sg7.L;
                dl2 dl23 = sg7.M;
                int i7 = sg7.N;
                boolean z8 = sg7.O;
                int i8 = sg7.P;
                int i9 = sg7.Q;
                V0.a = str3;
                V0.b = tg73;
                V0.c = dl23;
                V0.d = i7;
                V0.e = z8;
                V0.f = i8;
                V0.g = i9;
                V0.s = (V0.s << 2) | 2;
                V0.c();
            }
            if (!sg7.J) {
                if (z5 || (z2 && sg7.T != null)) {
                    g75.D(sg7);
                }
                if (z5 || z6) {
                    su0.B(sg7);
                    rc9.e0(sg7);
                }
                if (z2) {
                    rc9.e0(sg7);
                    return;
                }
                return;
            }
            return;
        }
        z2 = false;
        str = sg7.K;
        str2 = this.w;
        if (!sg3.e(str, str2)) {
        }
        boolean z72 = !sg7.L.c(tg72);
        sg7.L = tg72;
        i = sg7.Q;
        i2 = this.C;
        if (i != i2) {
        }
        i3 = sg7.P;
        i4 = this.B;
        if (i3 != i4) {
        }
        z3 = sg7.O;
        z4 = this.A;
        if (z3 != z4) {
        }
        dl2 = sg7.M;
        dl22 = this.y;
        if (!sg3.e(dl2, dl22)) {
        }
        i5 = sg7.N;
        i6 = this.z;
        if (i5 != i6) {
        }
        mc5 V02 = sg7.V0();
        String str32 = sg7.K;
        tg7 tg732 = sg7.L;
        dl2 dl232 = sg7.M;
        int i72 = sg7.N;
        boolean z82 = sg7.O;
        int i82 = sg7.P;
        int i92 = sg7.Q;
        V02.a = str32;
        V02.b = tg732;
        V02.c = dl232;
        V02.d = i72;
        V02.e = z82;
        V02.f = i82;
        V02.g = i92;
        V02.s = (V02.s << 2) | 2;
        V02.c();
        if (!sg7.J) {
        }
    }

    public final int hashCode() {
        int c = pb4.c(this.x, this.w.hashCode() * 31, 31);
        return (((hl6.i(f21.e(this.z, (this.y.hashCode() + c) * 31, 31), 31, this.A) + this.B) * 31) + this.C) * 31;
    }
}
