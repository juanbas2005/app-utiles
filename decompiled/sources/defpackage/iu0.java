package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: iu0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iu0 extends v0 {
    public final dp4 g0 = new dp4(6);
    public final dp4 h0 = new dp4(6);
    public qk5 i0;
    public h27 j0;
    public h27 k0;
    public boolean l0;
    public boolean m0;
    public long n0 = -1;
    public boolean o0;
    public ta3 p0;
    public h27 q0;
    public h27 r0;
    public boolean s0;
    public boolean t0;
    public long u0 = -1;
    public boolean v0;

    public iu0(sr2 sr2, ap4 ap4) {
        super(ap4, (oa3) null, false, true, (String) null, (s86) null, sr2);
        int i = ic4.a;
    }

    public final void I() {
        r23 r23;
        ap4 ap4 = this.M;
        if (!(ap4 == null || (r23 = this.Z) == null)) {
            ap4.c(new s23(r23));
        }
        this.Z = null;
        m1(false);
    }

    public final void P0() {
        p1();
    }

    public final void h0() {
        m1(true);
    }

    public final void h1() {
        p1();
    }

    public final boolean i1(KeyEvent keyEvent) {
        hu0 hu0 = (hu0) this.h0.d(rd3.x(keyEvent));
        return false;
    }

    public final void j1(KeyEvent keyEvent) {
        long x = rd3.x(keyEvent);
        dp4 dp4 = this.g0;
        boolean z = false;
        if (dp4.d(x) != null) {
            el3 el3 = (el3) dp4.d(x);
            if (el3 != null) {
                if (el3.l()) {
                    el3.o((CancellationException) null);
                } else {
                    z = true;
                }
            }
            dp4.f(x);
        }
        if (!z) {
            k1();
        }
    }

    public final void m1(boolean z) {
        if (z) {
            this.p0 = null;
            h27 h27 = this.q0;
            if (h27 != null) {
                h27.o((CancellationException) null);
            }
            this.q0 = null;
            h27 h272 = this.r0;
            if (h272 != null) {
                h272.o((CancellationException) null);
            }
            this.r0 = null;
            this.s0 = false;
            this.t0 = false;
            this.u0 = -1;
            this.v0 = false;
        } else {
            this.i0 = null;
            h27 h273 = this.j0;
            if (h273 != null) {
                h273.o((CancellationException) null);
            }
            this.j0 = null;
            h27 h274 = this.k0;
            if (h274 != null) {
                h274.o((CancellationException) null);
            }
            this.k0 = null;
            this.l0 = false;
            this.m0 = false;
            this.n0 = -1;
            this.o0 = false;
        }
        c1(z);
    }

    public final void n1(long j, ta3 ta3) {
        if (this.R && !this.v0) {
            d1(true, ta3.c);
            this.u0 = j;
            if (!this.t0 && !this.s0) {
                k1();
            }
        }
        this.p0 = null;
        this.v0 = false;
        this.s0 = false;
        h27 h27 = this.q0;
        if (h27 != null) {
            h27.o((CancellationException) null);
        }
        this.q0 = null;
        this.t0 = false;
    }

    public final void o1(long j, qk5 qk5) {
        if (this.R && !this.o0) {
            d1(false, qk5.c);
            this.n0 = j;
            if (!this.m0 && !this.l0) {
                k1();
            }
        }
        this.i0 = null;
        this.o0 = false;
        this.l0 = false;
        h27 h27 = this.j0;
        if (h27 != null) {
            h27.o((CancellationException) null);
        }
        this.j0 = null;
        this.m0 = false;
    }

    public final void p1() {
        char c;
        long j;
        long j2;
        char c2;
        dp4 dp4 = this.g0;
        Object[] objArr = dp4.c;
        long[] jArr = dp4.a;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j2 = 128;
            while (true) {
                long j3 = jArr[i];
                j = 255;
                if ((((~j3) << c3) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((el3) objArr[(i << 3) + i3]).o((CancellationException) null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j2 = 128;
            j = 255;
        }
        dp4.a();
        dp4 dp42 = this.h0;
        Object[] objArr2 = dp42.c;
        long[] jArr2 = dp42.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j4 & j) >= j2) {
                            j4 >>= 8;
                            i6++;
                        } else {
                            ((hu0) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                }
                i4++;
            }
        }
        dp42.a();
    }

    public final void w(ig igVar, lk5 lk5) {
        boolean z;
        ArrayList arrayList = (ArrayList) igVar.c;
        g1();
        if (this.R && this.V == null) {
            kv2 kv2 = new kv2(this);
            V0(kv2);
            this.V = kv2;
        }
        int i = 0;
        if (lk5 == lk5.x) {
            if (this.p0 == null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (rd3.h((ta3) arrayList.get(i2))) {
                        ta3 ta3 = (ta3) arrayList.get(0);
                        ta3.i = true;
                        this.p0 = ta3;
                        if (this.R) {
                            h27 h27 = this.r0;
                            if (h27 != null && h27.l()) {
                                ((g58) h49.w(this, xy0.u)).getClass();
                                if (ta3.b - this.u0 < 40) {
                                    this.v0 = true;
                                    return;
                                }
                                this.s0 = true;
                                h27 h272 = this.r0;
                                if (h272 != null) {
                                    h272.o((CancellationException) null);
                                }
                                this.r0 = null;
                            }
                            this.t0 = false;
                            e1(ta3);
                            return;
                        }
                        return;
                    }
                }
            } else if (this.t0) {
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ta3 ta32 = (ta3) arrayList.get(i3);
                    if (!ta32.h || ta32.d) {
                        int size3 = arrayList.size();
                        while (i < size3) {
                            ((ta3) arrayList.get(i)).i = true;
                            i++;
                        }
                        return;
                    }
                }
                ta3 ta33 = (ta3) arrayList.get(0);
                ta33.i = true;
                long j = ta33.b;
                ta3 ta34 = this.p0;
                ta34.getClass();
                n1(j, ta34);
            } else {
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ta3 ta35 = (ta3) arrayList.get(i4);
                    if (ta35.i || !ta35.h || ta35.d) {
                        float f = ((g58) h49.w(this, xy0.u)).f();
                        int size5 = arrayList.size();
                        for (int i5 = 0; i5 < size5; i5++) {
                            ta3 ta36 = (ta3) arrayList.get(i5);
                            long j2 = ta36.c;
                            ta3 ta37 = this.p0;
                            ta37.getClass();
                            if (Math.abs(l35.c(l35.d(j2, ta37.c))) > f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (ta36.i || z) {
                                m1(true);
                                return;
                            }
                        }
                        return;
                    }
                }
                ta3 ta38 = (ta3) arrayList.get(0);
                ta38.i = true;
                long j3 = ta38.b;
                ta3 ta39 = this.p0;
                ta39.getClass();
                n1(j3, ta39);
            }
        } else if (lk5 == lk5.y && this.p0 != null && !this.t0) {
            int size6 = arrayList.size();
            while (i < size6) {
                ta3 ta310 = (ta3) arrayList.get(i);
                if (!ta310.i || ta310 == this.p0) {
                    i++;
                } else {
                    m1(true);
                    return;
                }
            }
        }
    }

    public final void y(kk5 kk5, lk5 lk5, long j) {
        super.y(kk5, lk5, j);
        if (lk5 == lk5.x) {
            if (this.i0 != null) {
                int i = kk5.c;
                List list = kk5.a;
                if (this.m0) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!ub5.d((qk5) list.get(i2))) {
                            int size2 = list.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                ((qk5) list.get(i3)).a();
                            }
                            return;
                        }
                    }
                    qk5 qk5 = (qk5) list.get(0);
                    qk5.a();
                    long j2 = qk5.b;
                    qk5 qk52 = this.i0;
                    qk52.getClass();
                    o1(j2, qk52);
                    return;
                }
                int size3 = list.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    if (!ub5.c((qk5) list.get(i4))) {
                        long b1 = b1(j);
                        int size4 = list.size();
                        for (int i5 = 0; i5 < size4; i5++) {
                            qk5 qk53 = (qk5) list.get(i5);
                            if (qk53.c() || ub5.n(qk53, j, b1)) {
                                m1(false);
                                return;
                            }
                        }
                        return;
                    }
                }
                qk5 qk54 = (qk5) list.get(0);
                qk54.a();
                long j3 = qk54.b;
                qk5 qk55 = this.i0;
                qk55.getClass();
                o1(j3, qk55);
            } else if (sb7.e(kk5, true)) {
                qk5 qk56 = (qk5) kk5.a.get(0);
                qk56.a();
                this.i0 = qk56;
                if (this.R) {
                    h27 h27 = this.k0;
                    if (h27 != null && h27.l()) {
                        ((g58) h49.w(this, xy0.u)).getClass();
                        if (qk56.b - this.n0 < 40) {
                            this.o0 = true;
                            return;
                        }
                        this.l0 = true;
                        h27 h272 = this.k0;
                        if (h272 != null) {
                            h272.o((CancellationException) null);
                        }
                        this.k0 = null;
                    }
                    this.m0 = false;
                    f1(qk56);
                }
            }
        } else if (lk5 == lk5.y && this.i0 != null && !this.m0) {
            List list2 = kk5.a;
            int size5 = list2.size();
            int i6 = 0;
            while (i6 < size5) {
                qk5 qk57 = (qk5) list2.get(i6);
                if (!qk57.c() || qk57 == this.i0) {
                    i6++;
                } else {
                    m1(false);
                    return;
                }
            }
        }
    }

    public final void Y0(ok6 ok6) {
    }
}
