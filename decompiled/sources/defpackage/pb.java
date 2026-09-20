package defpackage;

import android.content.res.Resources;
import android.os.CancellationSignal;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Map;

/* renamed from: pb  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pb extends wx3 implements vr2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb(int i, Object obj) {
        super(1);
        this.x = i;
        this.y = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:160:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0341  */
    public final Object y(Object obj) {
        boolean z;
        boolean z2;
        lb8 lb8;
        boolean z3;
        boolean z4;
        ic3 ic3;
        ic3 ic32;
        Object obj2 = obj;
        int i = this.x;
        int i2 = -1;
        float f = 0.0f;
        int i3 = 0;
        vs7 vs7 = vs7.a;
        Object obj3 = this.y;
        switch (i) {
            case b85.b:
                qb qbVar = (qb) obj2;
                vy3 vy3 = (vy3) obj3;
                if (qbVar.m() != Integer.MAX_VALUE) {
                    if (qbVar.a().b) {
                        qbVar.J();
                    }
                    for (Map.Entry entry : qbVar.a().i.entrySet()) {
                        vy3.a(vy3, (kb) entry.getKey(), ((Number) entry.getValue()).intValue(), qbVar.f());
                    }
                    xz4 xz4 = qbVar.f().Q;
                    xz4.getClass();
                    while (!xz4.equals(vy3.a.f())) {
                        for (kb kbVar : vy3.b(xz4).keySet()) {
                            vy3.a(vy3, kbVar, vy3.c(xz4, kbVar), xz4);
                        }
                        xz4 = xz4.Q;
                        xz4.getClass();
                    }
                }
                return vs7;
            case 1:
                k23 k23 = (k23) obj2;
                xd xdVar = (xd) obj3;
                if (xdVar.K == null) {
                    xdVar.K = new mb8(xdVar.N.getInsetsWatcher());
                }
                yo4 yo4 = mb8.e;
                int[] iArr = yo4.b;
                Object[] objArr = yo4.c;
                long[] jArr = yo4.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    z2 = false;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            int i6 = i3;
                            while (true) {
                                if (i6 < i5) {
                                    if ((255 & j) < 128) {
                                        int i7 = (i4 << 3) + i6;
                                        int i8 = iArr[i7];
                                        kb8 kb8 = (kb8) objArr[i7];
                                        if (!mb8.a(k23, ((lb8) kb8).c) && !mb8.a(k23, ((lb8) kb8).d) && (i8 == -1 || (ic3 = (ic3) mb8.c.b(i8)) == null || (!mb8.a(k23, ic3) && ((ic32 = (ic3) mb8.d.b(i8)) == null || !mb8.a(k23, ic32))))) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                            z2 = true;
                                        }
                                        if (z4) {
                                        }
                                    }
                                    j >>= 8;
                                    i6++;
                                } else if (i5 != 8) {
                                }
                            }
                        }
                        if (i4 != length) {
                            i4++;
                            i3 = 0;
                        }
                    }
                    kb8.a.getClass();
                    lb8 = jb8.j;
                    if (!mb8.a(k23, lb8.c) && !mb8.a(k23, lb8.d)) {
                        z3 = false;
                    } else {
                        z3 = true;
                        z2 = true;
                    }
                    if (!z3) {
                        ic3[] ic3Arr = mb8.b;
                        int length2 = ic3Arr.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length2) {
                                if (mb8.a(k23, ic3Arr[i9])) {
                                    z = true;
                                } else {
                                    i9++;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                } else {
                    z2 = false;
                    kb8.a.getClass();
                    lb8 = jb8.j;
                    if (!mb8.a(k23, lb8.c) && !mb8.a(k23, lb8.d)) {
                    }
                    if (!z3) {
                    }
                }
                z = z2;
                return Boolean.valueOf(z);
            case 2:
                return Boolean.valueOf(((vk2) obj2).c1(((bk2) obj3).a));
            case 3:
                return Boolean.valueOf(((me3) obj3).a(((fk6) obj2).f));
            case 4:
                return Boolean.valueOf(fd1.p((fk6) obj2, (Resources) obj3));
            case 5:
                return Boolean.valueOf(sg3.e(obj2, obj3));
            case 6:
                wy3 wy3 = (wy3) obj2;
                ((m0) obj3).y(wy3);
                wy3.a();
                return vs7;
            case 7:
                nl nlVar = (nl) obj2;
                float f2 = nlVar.b;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                float f3 = 1.0f;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                float f4 = nlVar.c;
                float f5 = -0.5f;
                if (f4 < -0.5f) {
                    f4 = -0.5f;
                }
                float f6 = 0.5f;
                if (f4 > 0.5f) {
                    f4 = 0.5f;
                }
                float f7 = nlVar.d;
                if (f7 >= -0.5f) {
                    f5 = f7;
                }
                if (f5 <= 0.5f) {
                    f6 = f5;
                }
                float f8 = nlVar.a;
                if (f8 >= 0.0f) {
                    f = f8;
                }
                if (f <= 1.0f) {
                    f3 = f;
                }
                return new jt0(jt0.a(uq3.b(f2, f4, f6, f3, vt0.x), (tt0) obj3));
            case 8:
                if (((Throwable) obj2) != null) {
                    ((CancellationSignal) obj3).cancel();
                }
                return vs7;
            case 9:
                kw1 kw1 = (kw1) obj2;
                return new d9(6, (nw1) obj3);
            case 10:
                ux1 ux1 = (ux1) obj2;
                if (!ux1.w.J) {
                    return kn7.x;
                }
                ux1 ux12 = ux1.L;
                kn7 kn7 = kn7.w;
                if (ux12 != null) {
                    pb pbVar = new pb(10, (f96) obj3);
                    if (pbVar.y(ux12) == kn7) {
                        h75.w(ux12, pbVar);
                    }
                }
                ux1.L = null;
                ux1.K = null;
                return kn7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                if (fw2.b.compareAndSet(false, true)) {
                    ((ad0) obj3).c(vs7);
                }
                return vs7;
            case 12:
                hz1 hz1 = (hz1) obj2;
                cx2 cx2 = (cx2) obj3;
                eh ehVar = cx2.l;
                if (!cx2.n || !cx2.A || ehVar == null) {
                    cx2.c(hz1);
                } else {
                    wr0 j0 = hz1.j0();
                    long L = j0.L();
                    j0.D().h();
                    try {
                        ((wr0) ((ji8) j0.x).x).D().k(ehVar);
                        cx2.c(hz1);
                    } finally {
                        b81.u(j0, L);
                    }
                }
                return vs7;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                hz1 hz12 = (hz1) obj2;
                qk0 D = hz12.j0().D();
                gs2 gs2 = ((fx2) obj3).z;
                if (gs2 != null) {
                    gs2.H(D, (cx2) hz12.j0().y);
                }
                return vs7;
            case 14:
                u18 u18 = (u18) obj2;
                sx2 sx2 = (sx2) obj3;
                sx2.g(u18);
                vr2 vr2 = sx2.i;
                if (vr2 != null) {
                    vr2.y(u18);
                }
                return vs7;
            case h75.g:
                t15 t15 = (t15) obj2;
                jy5 jy5 = t15.b;
                if (jy5 != null) {
                    jy5.closeConnection();
                    t15.b = null;
                }
                rc3 rc3 = (rc3) obj3;
                eq4 eq4 = rc3.d;
                Object[] objArr2 = eq4.w;
                int i10 = eq4.y;
                while (true) {
                    if (i3 < i10) {
                        if (sg3.e((n88) objArr2[i3], t15)) {
                            i2 = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                if (i2 >= 0) {
                    eq4.l(i2);
                }
                if (eq4.y == 0) {
                    rc3.b.b();
                }
                return vs7;
            case 16:
                Throwable th = (Throwable) obj2;
                ((ListenableFuture) obj3).cancel(false);
                return vs7;
            case 17:
                ((eq4) obj3).b((kl4) obj2);
                return Boolean.TRUE;
            case 18:
                mk6.f((ok6) obj2, ((s86) obj3).a);
                return vs7;
            case 19:
                mk6.c((ok6) obj2, (String) obj3);
                return vs7;
            case 20:
                ((List) obj2).add((Float) ((c34) obj3).b());
                return true;
            case 21:
                l76 l76 = (l76) obj2;
                mq6 mq6 = (mq6) obj3;
                l76.n(l76.P.b() * 3.0f);
                l76.r(mq6.w);
                l76.f(mq6.x);
                l76.d(mq6.y);
                l76.v(mq6.z);
                return vs7;
            case 22:
                l76 l762 = (l76) obj2;
                bu6 bu6 = (bu6) obj3;
                l762.l(bu6.K);
                l762.m(bu6.L);
                l762.c(bu6.M);
                l762.y(0.0f);
                l762.A(0.0f);
                l762.n(bu6.N);
                l762.h(0.0f);
                l762.j(0.0f);
                l762.k(bu6.O);
                float f9 = bu6.P;
                if (l762.I != f9) {
                    l762.w |= 2048;
                    l762.I = f9;
                }
                l762.w(bu6.Q);
                l762.r(bu6.R);
                l762.f(bu6.S);
                l762.d(bu6.T);
                l762.v(bu6.U);
                if (l762.M != 0) {
                    l762.w |= 32768;
                    l762.M = 0;
                }
                int i11 = bu6.V;
                if (l762.S != i11) {
                    l762.w |= 524288;
                    l762.S = i11;
                }
                l762.g((lt0) null);
                zx3 zx3 = bu6.W;
                if (!sg3.e(l762.O, zx3)) {
                    l762.w |= 1048576;
                    l762.O = zx3;
                }
                return vs7;
            default:
                Throwable th2 = (Throwable) obj2;
                g97 g97 = (g97) obj3;
                kk0 kk0 = g97.y;
                if (kk0 != null) {
                    kk0.a(th2);
                }
                g97.y = null;
                return vs7;
        }
    }
}
