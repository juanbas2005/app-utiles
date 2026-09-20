package defpackage;

import io.ktor.http.BadContentTypeFormatException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: kw5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kw5 implements hd0, xv0, od1, s67, rr0, gx6, d81, cl2 {
    public static final kw5 A = new kw5(4);
    public static final ey3 B = ey3.w;
    public static final wp1 C = new wp1(1.0f, 1.0f);
    public static final kw5 D = new kw5(5);
    public static final /* synthetic */ kw5 E = new kw5(6);
    public static final kw5 F = new kw5(8);
    public static final kw5 G = new kw5(9);
    public static final kw5 H = new kw5(10);
    public static final kw5 I = new kw5(11);
    public static final kw5 J = new kw5(13);
    public static final kw5 K = new kw5(14);
    public static final kw5 L = new kw5(15);
    public static final kw5 M = new kw5(16);
    public static final kw5 N = new kw5(17);
    public static final kw5 O = new kw5(18);
    public static final kw5 x = new kw5(1);
    public static final h y = new h(12);
    public static final kw5 z = new kw5(3);
    public final /* synthetic */ int w;

    public /* synthetic */ kw5(int i) {
        this.w = i;
    }

    public static final void g(vt vtVar) {
        qa qaVar = vt.h;
        if (vt.i == null) {
            vt.i = new vt();
            ut utVar = new ut("Okio Watchdog");
            utVar.setDaemon(true);
            utVar.start();
        }
        long nanoTime = System.nanoTime();
        long j = vtVar.c;
        boolean z2 = vtVar.a;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i != 0 && z2) {
            vtVar.g = Math.min(j, vtVar.c() - nanoTime) + nanoTime;
        } else if (i != 0) {
            vtVar.g = nanoTime + j;
        } else if (z2) {
            vtVar.g = vtVar.c();
        } else {
            throw new AssertionError();
        }
        qa qaVar2 = vt.h;
        int i2 = qaVar2.x + 1;
        qaVar2.x = i2;
        vt[] vtVarArr = (vt[]) qaVar2.y;
        if (i2 == vtVarArr.length) {
            vt[] vtVarArr2 = new vt[(i2 * 2)];
            qs.N0(0, 0, 14, vtVarArr, vtVarArr2);
            qaVar2.y = vtVarArr2;
        }
        qaVar2.h(i2, vtVar);
        if (vtVar.f == 1) {
            vt.k.signal();
        }
    }

    public static final float h(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f7 = fArr[fArr.length - 1];
            float f8 = fArr2[fArr.length - 1];
            if (f7 == 0.0f) {
                return 0.0f;
            }
            return (f8 / f7) * f;
        }
        if (i2 == -1) {
            float f9 = fArr[0];
            f4 = fArr2[0];
            f2 = f9;
            f3 = 0.0f;
            f5 = 0.0f;
        } else {
            float f10 = fArr[i2];
            float f11 = fArr[i];
            f5 = fArr2[i2];
            float f12 = f11;
            f3 = f10;
            f4 = fArr2[i];
            f2 = f12;
        }
        if (f3 == f2) {
            f6 = 0.0f;
        } else {
            f6 = (abs - f3) / (f2 - f3);
        }
        return (((f4 - f5) * Math.max(0.0f, Math.min(1.0f, f6))) + f5) * signum;
    }

    public static vt i() {
        qa qaVar = vt.h;
        vt vtVar = ((vt[]) qaVar.y)[1];
        if (vtVar == null) {
            long nanoTime = System.nanoTime();
            vt.k.await(vt.l, TimeUnit.MILLISECONDS);
            if (((vt[]) qaVar.y)[1] != null || System.nanoTime() - nanoTime < vt.m) {
                return null;
            }
            return vt.i;
        }
        long nanoTime2 = vtVar.g - System.nanoTime();
        if (nanoTime2 > 0) {
            vt.k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        qaVar.l(vtVar);
        vtVar.e = 2;
        return vtVar;
    }

    public static ql4 j(ql4 ql4) {
        vp2 f = rs1.f(ql4);
        String str = tj3.a;
        up2 i = tj3.i(f);
        if (i != null) {
            return ts1.e(ql4).j(i);
        }
        rf2.q(ql4, " is not a read-only collection", "Given class ");
        return null;
    }

    public static p64 k(yb5[] yb5Arr, long j, long j2, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = 9187343241974906880L;
        }
        long j4 = j2;
        ArrayList arrayList = new ArrayList(r8);
        for (yb5 yb5 : yb5Arr) {
            arrayList.add(new jt0(((jt0) yb5.x).a));
        }
        ArrayList arrayList2 = new ArrayList(r8);
        for (yb5 yb52 : yb5Arr) {
            arrayList2.add(Float.valueOf(((Number) yb52.w).floatValue()));
        }
        return new p64(arrayList, arrayList2, j3, j4);
    }

    public static fl4 l(ls5 ls5) {
        int i;
        if (ls5 == null) {
            i = -1;
        } else {
            i = wt5.a[ls5.ordinal()];
        }
        fl4 fl4 = fl4.x;
        if (i == 1) {
            return fl4;
        }
        if (i == 2) {
            return fl4.z;
        }
        if (i == 3) {
            return fl4.A;
        }
        if (i != 4) {
            return fl4;
        }
        return fl4.y;
    }

    public static q51 m(String str) {
        str.getClass();
        if (d57.I0(str)) {
            return q51.e;
        }
        wy2 wy2 = (wy2) dt0.G0(tf4.H(str));
        String str2 = wy2.a;
        List list = wy2.b;
        int F0 = d57.F0(str2, '/', 0, 6);
        if (F0 != -1) {
            String obj = d57.k1(d57.i1(F0, str2)).toString();
            if (obj.length() != 0) {
                String obj2 = d57.k1(str2.substring(F0 + 1)).toString();
                if (d57.y0(obj, ' ') || d57.y0(obj2, ' ')) {
                    throw new BadContentTypeFormatException(str);
                } else if (obj2.length() != 0 && !d57.y0(obj2, '/')) {
                    return new q51(obj, obj2, list);
                } else {
                    throw new BadContentTypeFormatException(str);
                }
            } else {
                throw new BadContentTypeFormatException(str);
            }
        } else if (sg3.e(d57.k1(str2).toString(), "*")) {
            return q51.e;
        } else {
            throw new BadContentTypeFormatException(str);
        }
    }

    public void D0(j43 j43, a97 a97) {
        j43.getClass();
        j43.z.f(s53.j, new wx5((hs2) a97, (f61) null, 1));
    }

    public void a(r67 r67) {
        r67.clear();
    }

    public tp1 b() {
        return C;
    }

    public boolean c(Object obj, Object obj2) {
        return false;
    }

    public Object d(kd6 kd6) {
        Object s = kd6.s(new av5(d64.class, Executor.class));
        s.getClass();
        return we.l((Executor) s);
    }

    public long e() {
        return 9205357640488583168L;
    }

    public int f(int i, int i2, int i3, int i4) {
        return 0;
    }

    public ey3 getLayoutDirection() {
        return B;
    }

    public Iterable n(Object obj) {
        Collection s;
        switch (this.w) {
            case 8:
                int i = o14.p;
                Collection e = ((ql4) obj).n().e();
                e.getClass();
                return new ss(2, new ae2(new wl7(new ts(1, e), jo3.N), false, new nf6(18)));
            default:
                ri0 ri0 = (ri0) obj;
                if (ri0 == null || (s = ri0.s()) == null) {
                    return a42.w;
                }
                return s;
        }
    }

    public String toString() {
        switch (this.w) {
            case h75.g:
                return "Start";
            case 23:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
}
