package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: py0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class py0 implements zx5, jy0 {
    public final wp4 A;
    public final gv6 B;
    public final tp4 C;
    public final up4 D;
    public final up4 E;
    public final tp4 F;
    public final bn0 G;
    public final bn0 H;
    public final tp4 I;
    public tp4 J;
    public boolean K;
    public ps6 L;
    public ze5 M;
    public py0 N;
    public int O;
    public final f96 P;
    public final u36 Q;
    public final yt2 R;
    public int S;
    public final ky0 w;
    public final gs7 x;
    public final AtomicReference y = new AtomicReference((Object) null);
    public final Object z = new Object();

    public py0(ky0 ky0, gs7 gs7) {
        this.w = ky0;
        this.x = gs7;
        wp4 wp4 = new wp4(new up4());
        this.A = wp4;
        gv6 gv6 = new gv6();
        if (ky0.e()) {
            gv6.G = new yo4();
        }
        if (ky0.g()) {
            gv6.g();
        }
        this.B = gv6;
        this.C = fb5.d();
        this.D = new up4();
        this.E = new up4();
        this.F = fb5.d();
        bn0 bn0 = new bn0();
        this.G = bn0;
        bn0 bn02 = new bn0();
        this.H = bn02;
        this.I = fb5.d();
        this.J = fb5.d();
        f96 f96 = new f96(11, (Object) ky0);
        this.P = f96;
        this.Q = new u36();
        ky0 ky02 = ky0;
        yt2 yt2 = new yt2(gs7, ky02, iv6.d(gv6), wp4, bn0, bn02, f96, this);
        ky02.s(yt2);
        this.R = yt2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: dg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: dg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: dg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: dg6} */
    /* JADX WARNING: type inference failed for: r1v10, types: [java.util.Set[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void A(dg6 dg6) {
        dg6 dg62;
        while (true) {
            Object obj = this.y.get();
            if (obj == null || obj.equals(ed1.G)) {
                dg62 = dg6;
            } else if (obj instanceof Set) {
                dg62 = new Set[]{obj, dg6};
            } else if (obj instanceof Object[]) {
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                Object[] copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = dg6;
                dg62 = copyOf;
            } else {
                ku4.x("corrupt pendingModifications: ", this.y);
                return;
            }
            AtomicReference atomicReference = this.y;
            while (true) {
                if (atomicReference.compareAndSet(obj, dg62)) {
                    if (obj == null) {
                        synchronized (this.z) {
                            r();
                        }
                        return;
                    }
                    return;
                } else if (atomicReference.get() != obj) {
                }
            }
        }
    }

    public final void B(Object obj) {
        synchronized (this.z) {
            try {
                w(obj);
                Object g = this.F.g(obj);
                if (g != null) {
                    if (g instanceof up4) {
                        up4 up4 = (up4) g;
                        Object[] objArr = up4.b;
                        long[] jArr = up4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            w((oq1) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                }
                                i++;
                            }
                        }
                    } else {
                        w((oq1) g);
                    }
                }
            } finally {
            }
        }
    }

    public final void C(gs2 gs2) {
        boolean k = k();
        t();
        ky0 ky0 = this.w;
        if (k) {
            yt2 yt2 = this.R;
            yt2.z = 0;
            yt2.y = true;
            ky0.a(this, gs2);
            if (yt2.F || yt2.z != 0) {
                vm5.a("Cannot disable reuse from root if it was caused by other groups");
            }
            yt2.z = -1;
            yt2.y = false;
            return;
        }
        ky0.a(this, gs2);
    }

    public final void a() {
        this.y.set((Object) null);
        this.G.u.p();
        this.H.u.p();
        wp4 wp4 = this.A;
        if (!wp4.w.g()) {
            u36 u36 = this.Q;
            try {
                u36.g(wp4, this.R.D());
                u36.b();
            } finally {
                u36.a();
            }
        }
    }

    public final void b(Object obj, boolean z2) {
        Object obj2 = obj;
        Object g = this.C.g(obj2);
        if (g != null) {
            boolean z3 = g instanceof up4;
            dh3 dh3 = dh3.w;
            up4 up4 = this.D;
            up4 up42 = this.E;
            tp4 tp4 = this.I;
            if (z3) {
                up4 up43 = (up4) g;
                Object[] objArr = up43.b;
                long[] jArr = up43.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    yx5 yx5 = (yx5) objArr[(i << 3) + i3];
                                    if (!fb5.r(tp4, obj2, yx5) && yx5.b(obj2) != dh3) {
                                        if (yx5.g == null || z2) {
                                            up4.a(yx5);
                                        } else {
                                            up42.a(yx5);
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return;
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                yx5 yx52 = (yx5) g;
                if (!fb5.r(tp4, obj2, yx52) && yx52.b(obj2) != dh3) {
                    if (yx52.g == null || z2) {
                        up4.a(yx52);
                    } else {
                        up42.a(yx52);
                    }
                }
            }
        }
    }

    public final void c(Set set, boolean z2) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean z3;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean z4;
        long[] jArr6;
        long j7;
        long[] jArr7;
        int i;
        long[] jArr8;
        long j8;
        char c2;
        int i2;
        long[] jArr9;
        Set set2 = set;
        boolean z5 = z2;
        boolean z6 = set2 instanceof dg6;
        tp4 tp4 = this.F;
        Object obj = null;
        int i3 = 8;
        if (z6) {
            up4 up4 = ((dg6) set2).w;
            Object[] objArr = up4.b;
            long[] jArr10 = up4.a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j3 = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i4];
                    char c3 = 7;
                    j = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & -9187201950435737472L) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof yx5) {
                                    ((yx5) obj2).b(obj);
                                } else {
                                    b(obj2, z5);
                                    Object g = tp4.g(obj2);
                                    if (g != null) {
                                        if (g instanceof up4) {
                                            up4 up42 = (up4) g;
                                            Object[] objArr2 = up42.b;
                                            long[] jArr11 = up42.a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i8];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c2) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                b((oq1) objArr2[(i8 << 3) + i10], z5);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i = length;
                                            b((oq1) g, z5);
                                        }
                                        i2 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr10;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        }
                        length = i11;
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr10 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j3 = 128;
                j2 = 255;
                j = -9187201950435737472L;
                c = 7;
            }
        } else {
            j3 = 128;
            j2 = 255;
            j = -9187201950435737472L;
            c = 7;
            for (Object next : set2) {
                if (next instanceof yx5) {
                    ((yx5) next).b((Object) null);
                } else {
                    b(next, z5);
                    Object g2 = tp4.g(next);
                    if (g2 != null) {
                        if (g2 instanceof up4) {
                            up4 up43 = (up4) g2;
                            Object[] objArr3 = up43.b;
                            long[] jArr13 = up43.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr13[i12];
                                    if ((((~j11) << 7) & j11 & -9187201950435737472L) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                b((oq1) objArr3[(i12 << 3) + i14], z5);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    if (i12 == length3) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                        } else {
                            b((oq1) g2, z5);
                        }
                    }
                }
            }
        }
        tp4 tp42 = this.C;
        up4 up44 = this.D;
        if (z5) {
            up4 up45 = this.E;
            if (up45.h()) {
                long[] jArr14 = tp42.a;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j) != j) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j3) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj3 = tp42.b[i18];
                                    Object obj4 = tp42.c[i18];
                                    if (obj4 instanceof up4) {
                                        up4 up46 = (up4) obj4;
                                        Object[] objArr4 = up46.b;
                                        long[] jArr15 = up46.a;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j) != j) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j3) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            yx5 yx5 = (yx5) objArr5[i22];
                                                            if (up45.c(yx5) || up44.c(yx5)) {
                                                                up46.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        z4 = up46.g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj4.getClass();
                                        yx5 yx52 = (yx5) obj4;
                                        if (up45.c(yx52) || up44.c(yx52)) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                    if (z4) {
                                        tp42.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                up45.b();
                j();
                return;
            }
        }
        if (up44.h()) {
            long[] jArr17 = tp42.a;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j) != j) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j3) {
                                int i26 = (i23 << 3) + i25;
                                Object obj5 = tp42.b[i26];
                                Object obj6 = tp42.c[i26];
                                if (obj6 instanceof up4) {
                                    up4 up47 = (up4) obj6;
                                    Object[] objArr6 = up47.b;
                                    long[] jArr18 = up47.a;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j) != j) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j3) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (up44.c((yx5) objArr7[i30])) {
                                                            up47.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    z3 = up47.g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj6.getClass();
                                    z3 = up44.c((yx5) obj6);
                                }
                                if (z3) {
                                    tp42.l(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            j();
            up44.b();
        }
    }

    public final void d() {
        this.K = true;
        this.P.o();
    }

    public final void e() {
        u36 u36;
        synchronized (this.z) {
            try {
                f(this.G);
                r();
            } catch (Throwable th) {
                u36.a();
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008e A[Catch:{ all -> 0x003e }] */
    public final void f(bn0 bn0) {
        u36 u36;
        kr krVar;
        hy5 hy5;
        String str;
        u36 u362;
        u36 u363;
        jv6 o;
        long[] jArr;
        long j;
        long[] jArr2;
        u36 u364;
        int i;
        long j2;
        char c;
        int i2;
        boolean z2;
        long j3;
        bn0 bn02 = bn0;
        bn0 bn03 = this.H;
        yt2 yt2 = this.R;
        ny0 D2 = yt2.D();
        u36 u365 = this.Q;
        u365.g(this.A, D2);
        try {
            if (bn02.u.r()) {
                try {
                    if (bn03.u.r() && this.M == null) {
                        u365.b();
                    }
                } finally {
                    u365.a();
                }
            } else {
                ze5 ze5 = this.M;
                if (ze5 == null || (krVar = ze5.l) == null) {
                    krVar = this.x;
                }
                if (ze5 != null) {
                    hy5 = ze5.l;
                } else {
                    hy5 = null;
                }
                if (krVar.equals(hy5)) {
                    str = "Compose:recordChanges";
                } else {
                    str = "Compose:applyChanges";
                }
                Trace.beginSection(str);
                try {
                    ze5 ze52 = this.M;
                    if (ze52 != null) {
                        u363 = ze52.k;
                        if (u363 == null) {
                        }
                        gv6 gv6 = this.B;
                        ny0 D3 = yt2.D();
                        o = iv6.d(gv6).o();
                        int i3 = 0;
                        bn02.J(krVar, o, u363, D3);
                        o.e(true);
                        krVar.l();
                        Trace.endSection();
                        u365.c();
                        u365.d();
                        if (!this.K) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.K = false;
                                tp4 tp4 = this.C;
                                long[] jArr3 = tp4.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = tp4.b[i8];
                                                    Object obj2 = tp4.c[i8];
                                                    if (obj2 instanceof up4) {
                                                        up4 up4 = (up4) obj2;
                                                        Object[] objArr = up4.b;
                                                        long[] jArr4 = up4.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        u364 = u365;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                long j6 = jArr4[i10];
                                                                j = j4;
                                                                long[] jArr5 = jArr4;
                                                                if ((((~j6) << c) & j6 & j2) != j2) {
                                                                    int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                    for (int i12 = 0; i12 < i11; i12++) {
                                                                        if ((j6 & 255) < 128) {
                                                                            j3 = j6;
                                                                            int i13 = (i10 << 3) + i12;
                                                                            if (!((yx5) objArr[i13]).a()) {
                                                                                up4.m(i13);
                                                                            }
                                                                        } else {
                                                                            j3 = j6;
                                                                        }
                                                                        j6 = j3 >> i9;
                                                                    }
                                                                    if (i11 != i9) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i10 == length2) {
                                                                    break;
                                                                }
                                                                i10++;
                                                                jArr4 = jArr5;
                                                                j4 = j;
                                                                i9 = 8;
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        z2 = up4.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        u364 = u365;
                                                        j = j4;
                                                        obj2.getClass();
                                                        if (!((yx5) obj2).a()) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                    }
                                                    if (z2) {
                                                        tp4.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    u364 = u365;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                u365 = u364;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            u36 = u365;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            u36 = u365;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        u365 = u36;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    u36 = u365;
                                }
                                j();
                                try {
                                    Trace.endSection();
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        if (bn03.u.r() && this.M == null) {
                                            u36.b();
                                        }
                                        throw th;
                                    } finally {
                                        u36.a();
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                Trace.endSection();
                                throw th;
                            }
                        } else {
                            u36 = u365;
                        }
                        try {
                            if (bn03.u.r() && this.M == null) {
                                u36.b();
                            }
                        } finally {
                            u36.a();
                        }
                    }
                    u363 = u365;
                    gv6 gv62 = this.B;
                    ny0 D32 = yt2.D();
                    o = iv6.d(gv62).o();
                    int i32 = 0;
                    try {
                        bn02.J(krVar, o, u363, D32);
                        o.e(true);
                        krVar.l();
                        Trace.endSection();
                        u365.c();
                        u365.d();
                        if (!this.K) {
                        }
                        u36.b();
                    } catch (Throwable th3) {
                        th = th3;
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    u362 = u365;
                    Trace.endSection();
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            u36 = u365;
            u36.b();
            throw th;
        }
    }

    public final void g() {
        u36 u36;
        synchronized (this.z) {
            try {
                bn0 bn0 = this.H;
                bn0.getClass();
                if (!bn0.u.r()) {
                    f(this.H);
                }
            } catch (Throwable th) {
                u36.a();
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    public final void h(Object obj) {
        yx5 B2;
        boolean z2;
        int i;
        int i2;
        Object obj2 = obj;
        yt2 yt2 = this.R;
        if (yt2.A <= 0 && (B2 = yt2.B()) != null) {
            int i3 = B2.b | 1;
            B2.b = i3;
            if ((i3 & 32) == 0) {
                hp4 hp4 = B2.f;
                if (hp4 == null) {
                    hp4 = new hp4();
                    B2.f = hp4;
                }
                int i4 = B2.e;
                int c = hp4.c(obj2);
                if (c < 0) {
                    c = ~c;
                    i2 = -1;
                } else {
                    i2 = hp4.c[c];
                }
                hp4.b[c] = obj2;
                hp4.c[c] = i4;
                if (i2 == B2.e) {
                    z2 = true;
                    this.P.o();
                    if (z2) {
                        if (obj2 instanceof o37) {
                            ((o37) obj2).c(1);
                        }
                        fb5.b(this.C, obj2, B2);
                        if (obj2 instanceof oq1) {
                            oq1 oq1 = (oq1) obj2;
                            nq1 e = oq1.e();
                            tp4 tp4 = this.F;
                            fb5.t(tp4, obj2);
                            hp4 hp42 = e.e;
                            Object[] objArr = hp42.b;
                            long[] jArr = hp42.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                        int i6 = 8;
                                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j & 255) < 128) {
                                                n37 n37 = (n37) objArr[(i5 << 3) + i8];
                                                i = i6;
                                                if (n37 instanceof o37) {
                                                    ((o37) n37).c(1);
                                                }
                                                fb5.b(tp4, n37, obj2);
                                            } else {
                                                i = i6;
                                            }
                                            j >>= i;
                                            i8++;
                                            i6 = i;
                                        }
                                        if (i7 != i6) {
                                            break;
                                        }
                                    }
                                    if (i5 == length) {
                                        break;
                                    }
                                    i5++;
                                }
                            }
                            Object obj3 = e.f;
                            tp4 tp42 = B2.g;
                            if (tp42 == null) {
                                tp42 = new tp4();
                                B2.g = tp42;
                            }
                            tp42.m(oq1, obj3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            z2 = false;
            this.P.o();
            if (z2) {
            }
        }
    }

    public final void i() {
        u36 u36;
        u36 u362;
        synchronized (this.z) {
            try {
                this.R.v = null;
                if (!this.A.w.g()) {
                    u362 = this.Q;
                    u362.g(this.A, this.R.D());
                    u362.b();
                    u362.a();
                }
            } catch (Throwable th) {
                u36.a();
                throw th;
            }
        }
    }

    public final void j() {
        long j;
        long j2;
        char c;
        long j3;
        long[] jArr;
        int i;
        int i2;
        long[] jArr2;
        long j4;
        long j5;
        long j6;
        char c2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        tp4 tp4 = this.F;
        long[] jArr3 = tp4.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j6 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = tp4.b[i10];
                            Object obj2 = tp4.c[i10];
                            c2 = c3;
                            boolean z3 = obj2 instanceof up4;
                            j5 = j8;
                            tp4 tp42 = this.C;
                            if (z3) {
                                up4 up4 = (up4) obj2;
                                Object[] objArr = up4.b;
                                long[] jArr4 = up4.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j4 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i2 = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j6) < 128) {
                                                    i5 = i14;
                                                    int i15 = (i12 << 3) + i5;
                                                    i4 = i9;
                                                    if (!tp42.c((oq1) objArr[i15])) {
                                                        up4.m(i15);
                                                    }
                                                } else {
                                                    i5 = i14;
                                                    i4 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i5 + 1;
                                                i9 = i4;
                                            }
                                            i = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i2;
                                        i9 = i;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i2 = length;
                                    i = i9;
                                    j4 = j9;
                                }
                                z2 = up4.g();
                            } else {
                                jArr2 = jArr3;
                                i2 = length;
                                i = i9;
                                j4 = j9;
                                obj2.getClass();
                                if (!tp42.c((oq1) obj2)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                            if (z2) {
                                tp4.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i2 = length;
                            i = i9;
                            j6 = j7;
                            c2 = c3;
                            j5 = j8;
                            j4 = j9;
                            i3 = i6;
                        }
                        j9 = j4 >> i3;
                        i9 = i + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j6;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i2;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j2 = j7;
                    c = c3;
                    j = j8;
                    if (i8 != i6) {
                        break;
                    }
                    length = i16;
                } else {
                    jArr = jArr3;
                    j2 = j7;
                    c = c3;
                    j = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j2;
                j8 = j;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j2 = 255;
            c = 7;
            j = -9187201950435737472L;
            j3 = 128;
        }
        up4 up42 = this.E;
        if (up42.h()) {
            Object[] objArr2 = up42.b;
            long[] jArr5 = up42.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i17 = 0;
                while (true) {
                    long j11 = jArr5[i17];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i18 = 8 - ((~(i17 - length3)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if ((j11 & j2) < j3) {
                                int i20 = (i17 << 3) + i19;
                                if (((yx5) objArr2[i20]).g == null) {
                                    up42.m(i20);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i18 != 8) {
                            return;
                        }
                    }
                    if (i17 != length3) {
                        i17++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean k() {
        boolean z2;
        synchronized (this.z) {
            z2 = true;
            if (this.S != 1) {
                z2 = false;
            }
            if (z2) {
                this.S = 0;
            }
        }
        return z2;
    }

    public final void l(gs2 gs2) {
        u36 u36;
        yt2 yt2;
        try {
            synchronized (this.z) {
                q();
                tp4 tp4 = this.J;
                this.J = fb5.d();
                try {
                    yt2 = this.R;
                    ps6 ps6 = this.L;
                    if (!yt2.e.u.r()) {
                        ey0.a("Expected applyChanges() to have been called");
                    }
                    yt2.P = ps6;
                    yt2.p(tp4, gs2);
                    yt2.P = null;
                } catch (Throwable th) {
                    this.J = tp4;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            u36.a();
            throw th2;
        }
    }

    public final ze5 m(boolean z2, gs2 gs2) {
        if (this.M != null) {
            vm5.b("A pausable composition is in progress");
        }
        gs2 gs22 = gs2;
        ze5 ze5 = new ze5(this, this.w, this.R, this.A, gs22, z2, this.x, this.z);
        this.M = ze5;
        return ze5;
    }

    public final void n() {
        boolean z2;
        u36 u36;
        jv6 o;
        synchronized (this.z) {
            try {
                if (this.M != null) {
                    vm5.b("Deactivate is not supported while pausable composition is in progress");
                }
                if (this.B.x == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (!this.A.w.g()) {
                    }
                    this.C.a();
                    this.F.a();
                    this.J.a();
                    this.G.u.p();
                    this.H.u.p();
                    yt2 yt2 = this.R;
                    yt2.E.clear();
                    yt2.s.clear();
                    yt2.e.u.p();
                    yt2.v = null;
                    this.S = 1;
                }
                Trace.beginSection("Compose:deactivate");
                try {
                    u36 = this.Q;
                    u36.g(this.A, this.R.D());
                    if (!z2) {
                        gv6 gv6 = this.B;
                        u36 u362 = this.Q;
                        o = gv6.o();
                        o.n(o.t, new p13(17, (Object) u362, (Object) o));
                        o.e(true);
                        this.x.l();
                        u36.c();
                    }
                    u36.b();
                    u36.a();
                    Trace.endSection();
                    this.C.a();
                    this.F.a();
                    this.J.a();
                    this.G.u.p();
                    this.H.u.p();
                    yt2 yt22 = this.R;
                    yt22.E.clear();
                    yt22.s.clear();
                    yt22.e.u.p();
                    yt22.v = null;
                    this.S = 1;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
            }
        }
    }

    public final void o() {
        boolean z2;
        u36 u36;
        jv6 o;
        synchronized (this.z) {
            try {
                if (this.R.F) {
                    vm5.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.S != 3) {
                    this.S = 3;
                    bn0 bn0 = this.R.L;
                    if (bn0 != null) {
                        f(bn0);
                    }
                    if (this.B.x == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 || !this.A.w.g()) {
                        u36 = this.Q;
                        u36.g(this.A, this.R.D());
                        if (!z2) {
                            gv6 gv6 = this.B;
                            u36 u362 = this.Q;
                            o = gv6.o();
                            o.n(o.t, new yg(2, u362));
                            o.J();
                            o.e(true);
                            this.x.a();
                            this.x.l();
                            u36.c();
                        }
                        u36.b();
                        u36.a();
                    }
                    yt2 yt2 = this.R;
                    yt2.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    yt2.b.x(yt2);
                    yt2.E.clear();
                    yt2.s.clear();
                    yt2.e.u.p();
                    yt2.v = null;
                    yt2.a.a();
                    Trace.endSection();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.w.y(this);
    }

    public final dh3 p(yx5 yx5, Object obj) {
        py0 py0;
        int i = yx5.b;
        if ((i & 2) != 0) {
            yx5.b = i | 4;
        }
        st2 st2 = yx5.c;
        if (st2 == null || !st2.a()) {
            return dh3.w;
        }
        gv6 gv6 = this.B;
        gv6.getClass();
        st2 st22 = yx5.c;
        if (st22 == null || !gv6.p(hj8.m(st22))) {
            synchronized (this.z) {
                py0 = this.N;
            }
            if (py0 != null) {
                yt2 yt2 = py0.R;
                if (yt2.F && yt2.k0(yx5, obj)) {
                    return dh3.z;
                }
            }
            return dh3.w;
        } else if (yx5.d == null) {
            return dh3.w;
        } else {
            dh3 v = v(yx5, st2, obj);
            if (v != dh3.w) {
                this.P.o();
            }
            return v;
        }
    }

    public final void q() {
        Object obj = ed1.G;
        AtomicReference atomicReference = this.y;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet == null) {
            return;
        }
        if (andSet.equals(obj)) {
            ey0.b("pending composition has not been applied");
            ta1.e();
        } else if (andSet instanceof Set) {
            c((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set c : (Set[]) andSet) {
                c(c, true);
            }
        } else {
            ey0.b("corrupt pendingModifications drain: " + atomicReference);
            ta1.e();
        }
    }

    public final void r() {
        AtomicReference atomicReference = this.y;
        Object andSet = atomicReference.getAndSet((Object) null);
        if (sg3.e(andSet, ed1.G)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set c : (Set[]) andSet) {
                c(c, false);
            }
        } else if (andSet != null) {
            ey0.b("corrupt pendingModifications drain: " + atomicReference);
            ta1.e();
        } else if (this.M == null) {
            ey0.a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void s() {
        g42 g42 = g42.w;
        AtomicReference atomicReference = this.y;
        Object andSet = atomicReference.getAndSet(g42);
        if (!sg3.e(andSet, ed1.G) && andSet != null) {
            if (andSet instanceof Set) {
                c((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set c : (Set[]) andSet) {
                    c(c, false);
                }
            } else {
                ey0.b("corrupt pendingModifications drain: " + atomicReference);
                ta1.e();
            }
        }
    }

    public final void t() {
        String str;
        int i = this.S;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i == 2) {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            } else if (i != 3) {
                str = "";
            } else {
                str = "The composition is disposed";
            }
            vm5.b(str);
        }
        if (this.M != null) {
            vm5.b("A pausable composition is in progress");
        }
    }

    public final void u(ArrayList arrayList) {
        u36 u36;
        wp4 wp4 = this.A;
        yt2 yt2 = this.R;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (((hn4) ((yb5) arrayList.get(i)).w).c != this) {
                    ey0.a("Check failed");
                    break;
                }
                i++;
            }
        }
        try {
            yt2.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            yt2.G(arrayList);
            yt2.j();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                if (!wp4.w.g()) {
                    u36 = this.Q;
                    u36.g(wp4, yt2.D());
                    u36.b();
                    u36.a();
                }
                throw th;
            } catch (Throwable th2) {
                u36.a();
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00cf, code lost:
        if (r5 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d7, code lost:
        return r5.v(r1, r21, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00d8, code lost:
        r0.w.n(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e1, code lost:
        if (r0.R.F == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00e5, code lost:
        return defpackage.dh3.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00e8, code lost:
        return defpackage.dh3.x;
     */
    public final dh3 v(yx5 yx5, st2 st2, Object obj) {
        boolean z2;
        yx5 yx52 = yx5;
        Object obj2 = obj;
        synchronized (this.z) {
            try {
                py0 py0 = this.N;
                py0 py02 = null;
                if (py0 != null) {
                    gv6 gv6 = this.B;
                    int i = this.O;
                    if (gv6.C) {
                        ey0.a("Writer is active");
                    }
                    if (i < 0 || i >= gv6.x) {
                        ey0.a("Invalid group index");
                    }
                    st2 m = hj8.m(st2);
                    if (gv6.p(m)) {
                        int i2 = gv6.w[(i * 5) + 3] + i;
                        int i3 = m.a;
                        if (i <= i3 && i3 < i2) {
                            py02 = py0;
                        }
                    }
                    py0 = null;
                    py02 = py0;
                }
                if (py02 == null) {
                    yt2 yt2 = this.R;
                    if (!yt2.F || !yt2.k0(yx52, obj2)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        dh3 dh3 = dh3.z;
                        return dh3;
                    } else if (obj2 == null) {
                        this.J.m(yx52, g22.J);
                    } else {
                        boolean z3 = obj2 instanceof oq1;
                        tp4 tp4 = this.J;
                        if (!z3) {
                            tp4.m(yx52, g22.J);
                        } else {
                            Object g = tp4.g(yx52);
                            if (g != null) {
                                if (g instanceof up4) {
                                    up4 up4 = (up4) g;
                                    Object[] objArr = up4.b;
                                    long[] jArr = up4.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        loop0:
                                        while (true) {
                                            long j = jArr[i4];
                                            if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == g22.J) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i5 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                } else if (g == g22.J) {
                                }
                            }
                            fb5.b(this.J, yx52, obj2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(Object obj) {
        Object obj2 = obj;
        Object g = this.C.g(obj2);
        if (g != null) {
            boolean z2 = g instanceof up4;
            dh3 dh3 = dh3.z;
            tp4 tp4 = this.I;
            if (z2) {
                up4 up4 = (up4) g;
                Object[] objArr = up4.b;
                long[] jArr = up4.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    yx5 yx5 = (yx5) objArr[(i << 3) + i3];
                                    if (yx5.b(obj2) == dh3) {
                                        fb5.b(tp4, obj2, yx5);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                return;
                            }
                        }
                        if (i != length) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                yx5 yx52 = (yx5) g;
                if (yx52.b(obj2) == dh3) {
                    fb5.b(tp4, obj2, yx52);
                }
            }
        }
    }

    public final boolean x() {
        if (this.S == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    public final boolean y(Set set) {
        Set set2 = set;
        boolean z2 = set2 instanceof dg6;
        tp4 tp4 = this.F;
        tp4 tp42 = this.C;
        if (z2) {
            up4 up4 = ((dg6) set2).w;
            Object[] objArr = up4.b;
            long[] jArr = up4.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0:
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (tp42.c(obj) || tp4.c(obj)) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (Object next : set2) {
                if (tp42.c(next) || tp4.c(next)) {
                    return true;
                }
                while (r1.hasNext()) {
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0080, code lost:
        return r2;
     */
    public final boolean z() {
        u36 u36;
        tp4 tp4;
        yt2 yt2;
        synchronized (this.z) {
            ze5 ze5 = this.M;
            boolean z2 = false;
            if (ze5 != null) {
                if (ze5.h.get() != bf5.A || ze5.i != jb5.f()) {
                    AtomicReference atomicReference = ze5.h;
                    bf5 bf5 = bf5.B;
                    bf5 bf52 = bf5.z;
                    while (true) {
                        if (!atomicReference.compareAndSet(bf5, bf52)) {
                            if (atomicReference.get() != bf5) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    ze5.l.w.a(9);
                    return false;
                }
            }
            q();
            try {
                tp4 = this.J;
                this.J = fb5.d();
                yt2 = this.R;
                ps6 ps6 = this.L;
                j75 j75 = yt2.e.u;
                if (!j75.r()) {
                    ey0.a("Expected applyChanges() to have been called");
                }
                if (tp4.e > 0 || !yt2.s.isEmpty()) {
                    yt2.P = ps6;
                    yt2.p(tp4, (gs2) null);
                    yt2.P = null;
                    z2 = !j75.r();
                }
                if (!z2) {
                    r();
                }
            } catch (Throwable th) {
                try {
                    if (!this.A.w.g()) {
                        u36 = this.Q;
                        u36.g(this.A, this.R.D());
                        u36.b();
                        u36.a();
                    }
                    throw th;
                } catch (Throwable th2) {
                    u36.a();
                    throw th2;
                }
            }
        }
    }
}
