package defpackage;

import android.util.Log;
import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gy5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gy5 extends ky0 {
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);
    public static final d37 z = e37.a(fg5.z);
    public final gj a;
    public final cf4 b = new cf4(new by5(this, 1));
    public final Object c = new Object();
    public el3 d;
    public Throwable e;
    public final ArrayList f = new ArrayList();
    public List g;
    public up4 h = new up4();
    public final eq4 i = new eq4(new py0[16]);
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final tp4 l = new tp4();
    public final hv2 m = new hv2(18);
    public final tp4 n = new tp4();
    public final tp4 o = new tp4();
    public ArrayList p;
    public up4 q;
    public kk0 r;
    public final d37 s = e37.a((Object) null);
    public boolean t;
    public final d37 u = e37.a(dy5.y);
    public final cf4 v = new cf4(18);
    public final fl3 w;
    public final e81 x;
    public final tz2 y;

    public gy5(e81 e81) {
        gj gjVar = new gj(new by5(this, 0));
        this.a = gjVar;
        fl3 fl3 = new fl3((el3) e81.a0(me6.E));
        fl3.v(new ay5(1, (Object) this));
        this.w = fl3;
        this.x = e81.X(gjVar).X(fl3);
        this.y = new tz2(7);
    }

    public static final void B(gy5 gy5, hn4 hn4, hn4 hn42) {
        List list = hn42.h;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                hn4 hn43 = (hn4) list.get(i2);
                hv2 hv2 = gy5.m;
                fn4 fn4 = hn43.a;
                co4.a((tp4) hv2.y, fn4, new qx4(hn43, hn4));
                co4.a((tp4) hv2.x, hn4, fn4);
                B(gy5, hn4, hn43);
            }
        }
    }

    public static final void K(ArrayList arrayList, gy5 gy5, py0 py0) {
        arrayList.clear();
        synchronized (gy5.c) {
            Iterator it = gy5.k.iterator();
            while (it.hasNext()) {
                hn4 hn4 = (hn4) it.next();
                if (hn4.c.equals(py0)) {
                    arrayList.add(hn4);
                    it.remove();
                }
            }
        }
    }

    public static void z(yp4 yp4) {
        try {
            if (yp4.w() instanceof jx6) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            yp4.c();
        }
    }

    public final void A() {
        synchronized (this.c) {
            if (((dy5) this.u.getValue()).compareTo(dy5.A) >= 0) {
                d37 d37 = this.u;
                dy5 dy5 = dy5.x;
                d37.getClass();
                d37.l((Object) null, dy5);
            }
        }
        this.w.o((CancellationException) null);
    }

    public final ik0 C() {
        d37 d37 = this.u;
        int compareTo = ((dy5) d37.getValue()).compareTo(dy5.x);
        d37 d372 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        eq4 eq4 = this.i;
        if (compareTo <= 0) {
            List H = H();
            int size = H.size();
            for (int i2 = 0; i2 < size; i2++) {
                py0 py0 = (py0) H.get(i2);
            }
            this.f.clear();
            this.g = a42.w;
            this.h = new up4();
            eq4.g();
            arrayList2.clear();
            arrayList.clear();
            this.p = null;
            kk0 kk0 = this.r;
            if (kk0 != null) {
                kk0.a((Throwable) null);
            }
            this.r = null;
            d372.j((Object) null);
            return null;
        }
        Object value = d372.getValue();
        dy5 dy5 = dy5.B;
        dy5 dy52 = dy5.y;
        if (value == null) {
            if (this.d == null) {
                this.h = new up4();
                eq4.g();
                if (D() || F()) {
                    dy52 = dy5.z;
                }
            } else {
                dy52 = (eq4.y == 0 && !this.h.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !D() && !F() && !this.l.j()) ? dy5.A : dy5;
            }
        }
        d37.l((Object) null, dy52);
        if (dy52 != dy5) {
            return null;
        }
        kk0 kk02 = this.r;
        this.r = null;
        return kk02;
    }

    public final boolean D() {
        if (this.t || (((yt) ((o9) this.a.y).z).get() & 134217727) <= 0) {
            return false;
        }
        return true;
    }

    public final boolean E() {
        if (this.i.y == 0 && !D() && !F() && !this.l.j()) {
            return false;
        }
        return true;
    }

    public final boolean F() {
        if (this.t || (((yt) ((o9) this.b.y).z).get() & 134217727) <= 0) {
            return false;
        }
        return true;
    }

    public final boolean G() {
        boolean z2;
        synchronized (this.c) {
            if (!this.h.h()) {
                if (this.i.y == 0) {
                    if (!D() && !F()) {
                        z2 = false;
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    public final List H() {
        List list;
        List list2 = this.g;
        if (list2 != null) {
            return list2;
        }
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            list = a42.w;
        } else {
            list = new ArrayList(arrayList);
        }
        this.g = list;
        return list;
    }

    public final void I() {
        ik0 C;
        synchronized (this.c) {
            C = C();
            if (((dy5) this.u.getValue()).compareTo(dy5.x) <= 0) {
                throw rc9.b("Recomposer shutdown; frame clock awaiter will never resume", this.e);
            }
        }
        if (C != null) {
            ((kk0) C).f(vs7.a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r0.isEmpty() != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        L(r0, (defpackage.up4) null);
        K(r0, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = new java.util.ArrayList();
        K(r0, r5, r6);
     */
    public final void J(py0 py0) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                if (!((hn4) arrayList.get(i2)).c.equals(py0)) {
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0156, code lost:
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015b, code lost:
        if (r4 >= r3) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0165, code lost:
        if (((defpackage.yb5) r10.get(r4)).x == null) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0167, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016a, code lost:
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0178, code lost:
        if (r8 >= r4) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017a, code lost:
        r11 = (defpackage.yb5) r10.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0182, code lost:
        if (r11.x != null) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0184, code lost:
        r11 = (defpackage.hn4) r11.w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018b, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018d, code lost:
        if (r11 == null) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018f, code lost:
        r3.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0192, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0195, code lost:
        r4 = r0.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0197, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        defpackage.it0.h0(r0.k, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019e, code lost:
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ac, code lost:
        if (r8 >= r4) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ae, code lost:
        r11 = r10.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b7, code lost:
        if (((defpackage.yb5) r11).x == null) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b9, code lost:
        r3.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01bc, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01bf, code lost:
        r10 = r3;
     */
    public final List L(List list, up4 up4) {
        yp4 yp4;
        yp4 C;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            py0 py0 = ((hn4) obj).c;
            Object obj2 = hashMap.get(py0);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(py0, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            py0 py02 = (py0) entry.getKey();
            List list2 = (List) entry.getValue();
            if (py02.R.F) {
                ey0.a("Check failed");
            }
            ay5 ay5 = new ay5(i2, (Object) py02);
            w34 w34 = new w34(19, py02, up4);
            ix6 j2 = nx6.j();
            if (j2 instanceof yp4) {
                yp4 = (yp4) j2;
            } else {
                yp4 = null;
            }
            if (yp4 == null || (C = yp4.C(ay5, w34)) == null) {
                h.s("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                ix6 j3 = C.j();
                synchronized (this.c) {
                    try {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i4 = i2; i4 < size2; i4++) {
                            hn4 hn4 = (hn4) list2.get(i4);
                            Object b2 = co4.b(this.l, hn4.a);
                            hn4 hn42 = (hn4) b2;
                            if (hn42 != null) {
                                this.m.c1(hn42);
                            }
                            arrayList.add(new yb5(hn4, b2));
                        }
                        int size3 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 < size3) {
                                yb5 yb5 = (yb5) arrayList.get(i5);
                                if (yb5.x == null) {
                                    if (((tp4) this.m.y).b(((hn4) yb5.w).a)) {
                                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i6 = 0; i6 < size4; i6++) {
                                            yb5 yb52 = (yb5) arrayList.get(i6);
                                            if (yb52.x == null) {
                                                hv2 hv2 = this.m;
                                                fn4 fn4 = ((hn4) yb52.w).a;
                                                tp4 tp4 = (tp4) hv2.y;
                                                qx4 qx4 = (qx4) co4.b(tp4, fn4);
                                                if (tp4.i()) {
                                                    ((tp4) hv2.x).a();
                                                }
                                                if (qx4 != null) {
                                                    hn4 hn43 = qx4.a;
                                                    co4.a(this.o, qx4.b, hn43);
                                                    yb52 = new yb5(yb52.w, hn43);
                                                }
                                            }
                                            arrayList2.add(yb52);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i5++;
                            }
                        }
                    } catch (Throwable th) {
                        ix6.q(j3);
                        throw th;
                    }
                }
                int size5 = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size5) {
                        if (((yb5) arrayList.get(i7)).x != null) {
                            break;
                        }
                        i7++;
                    } else {
                        break;
                    }
                }
                py02.u(arrayList);
                ix6.q(j3);
                z(C);
                i2 = 0;
            } catch (Throwable th2) {
                z(C);
                throw th2;
            }
        }
        return dt0.b1(hashMap.keySet());
    }

    public final py0 M(py0 py0, up4 up4) {
        up4 up42;
        yp4 yp4;
        yp4 C;
        yt2 yt2;
        if (!py0.R.F && !py0.x() && ((up42 = this.q) == null || !up42.c(py0))) {
            ay5 ay5 = new ay5(0, (Object) py0);
            w34 w34 = new w34(19, py0, up4);
            ix6 j2 = nx6.j();
            if (j2 instanceof yp4) {
                yp4 = (yp4) j2;
            } else {
                yp4 = null;
            }
            if (yp4 == null || (C = yp4.C(ay5, w34)) == null) {
                h.s("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    ix6 j3 = C.j();
                    if (up4 != null) {
                        try {
                            if (up4.h()) {
                                qm3 qm3 = new qm3(19, (Object) up4, (Object) py0);
                                yt2 = py0.R;
                                if (yt2.F) {
                                    ey0.a("Preparing a composition while composing is not supported");
                                }
                                yt2.F = true;
                                qm3.b();
                                yt2.F = false;
                            }
                        } catch (Throwable th) {
                            ix6.q(j3);
                            throw th;
                        }
                    }
                    boolean z2 = py0.z();
                    ix6.q(j3);
                    if (z2) {
                        return py0;
                    }
                } finally {
                    z(C);
                }
            }
        }
        return null;
    }

    public final void N(Throwable th, py0 py0) {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                cy5 cy5 = (cy5) this.s.getValue();
                if (cy5 == null) {
                    d37 d37 = this.s;
                    cy5 cy52 = new cy5(th);
                    d37.getClass();
                    d37.l((Object) null, cy52);
                } else {
                    throw cy5.a;
                }
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new up4();
                this.k.clear();
                this.l.a();
                this.n.a();
                d37 d372 = this.s;
                cy5 cy53 = new cy5(th);
                d372.getClass();
                d372.l((Object) null, cy53);
                if (py0 != null) {
                    P(py0);
                }
                if (C() != null) {
                    ey0.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r1.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2 >= r0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        ((defpackage.py0) r1.get(r2)).A(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (((defpackage.dy5) r6.u.getValue()).compareTo(defpackage.dy5.x) <= 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r0 = r6.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (C() != null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        r6 = E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        monitor-enter(r6.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r6 = r6.h;
        r6.getClass();
        r2 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0077, code lost:
        if (r2.hasNext() != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
        r6.k(r2.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
        throw r0;
     */
    public final boolean O() {
        synchronized (this.c) {
            if (this.h.g()) {
                boolean E = E();
                return E;
            }
            List H = H();
            dg6 dg6 = new dg6(this.h);
            this.h = new up4();
        }
    }

    public final void P(py0 py0) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(py0)) {
            arrayList.add(py0);
        }
        if (this.f.remove(py0)) {
            this.g = null;
        }
    }

    public final void a(py0 py0, gs2 gs2) {
        dy5 dy5;
        boolean z2;
        yp4 yp4;
        yp4 C;
        ix6 j2;
        boolean z3 = py0.R.F;
        synchronized (this.c) {
            dy5 = dy5.x;
            z2 = true;
            if (((dy5) this.u.getValue()).compareTo(dy5) > 0) {
                z2 = true ^ H().contains(py0);
            }
        }
        try {
            ay5 ay5 = new ay5(0, (Object) py0);
            w34 w34 = new w34(19, py0, (Object) null);
            ix6 j3 = nx6.j();
            if (j3 instanceof yp4) {
                yp4 = (yp4) j3;
            } else {
                yp4 = null;
            }
            if (yp4 == null || (C = yp4.C(ay5, w34)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            j2 = C.j();
            py0.l(gs2);
            ix6.q(j2);
            z(C);
            synchronized (this.c) {
                if (((dy5) this.u.getValue()).compareTo(dy5) > 0 && !H().contains(py0)) {
                    this.f.add(py0);
                    this.g = null;
                }
            }
            if (!z3) {
                nx6.j().m();
            }
            try {
                J(py0);
                try {
                    py0.e();
                    py0.g();
                    if (!z3) {
                        nx6.j().m();
                    }
                } catch (Throwable th) {
                    N(th, (py0) null);
                }
            } catch (Throwable th2) {
                N(th2, py0);
            }
        } catch (Throwable th3) {
            if (z2) {
                synchronized (this.c) {
                }
            }
            N(th3, py0);
        }
    }

    public final up4 b(py0 py0, ps6 ps6, gs2 gs2) {
        ps6 ps62;
        cf4 cf4 = this.v;
        try {
            ps62 = py0.L;
            py0.L = ps6;
            a(py0, gs2);
            up4 up4 = (up4) cf4.f();
            if (up4 == null) {
                up4 = cg6.a;
                up4.getClass();
            }
            py0.L = ps62;
            cf4.D((Object) null);
            return up4;
        } catch (Throwable th) {
            cf4.D((Object) null);
            throw th;
        }
    }

    public final void c(hn4 hn4) {
        ik0 C;
        synchronized (this.c) {
            try {
                co4.a(this.l, hn4.a, hn4);
                if (hn4.h != null) {
                    B(this, hn4, hn4);
                }
                C = C();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C != null) {
            ((kk0) C).f(vs7.a);
        }
    }

    public final boolean e() {
        return ((Boolean) A.get()).booleanValue();
    }

    public final boolean f() {
        return false;
    }

    public final boolean g() {
        return false;
    }

    public final long h() {
        return 1000;
    }

    public final jy0 i() {
        return null;
    }

    public final e81 k() {
        return this.x;
    }

    public final boolean l() {
        return false;
    }

    public final void m(hn4 hn4) {
        ik0 C;
        synchronized (this.c) {
            this.k.add(hn4);
            C = C();
        }
        if (C != null) {
            ((kk0) C).f(vs7.a);
        }
    }

    public final void n(py0 py0) {
        ik0 ik0;
        synchronized (this.c) {
            if (!this.i.h(py0)) {
                this.i.b(py0);
                ik0 = C();
            } else {
                ik0 = null;
            }
        }
        if (ik0 != null) {
            ((kk0) ik0).f(vs7.a);
        }
    }

    public final void o(hn4 hn4, gn4 gn4, kr krVar) {
        lp4 lp4;
        hn4 hn42 = hn4;
        gn4 gn42 = gn4;
        synchronized (this.c) {
            this.n.m(hn42, gn42);
            Object g2 = this.o.g(hn42);
            if (g2 == null) {
                lp4 = w25.b;
                lp4.getClass();
            } else if (g2 instanceof lp4) {
                lp4 = (lp4) g2;
            } else {
                Object[] objArr = w25.a;
                lp4 lp42 = new lp4(1);
                lp42.a(g2);
                lp4 = lp42;
            }
            if (lp4.i()) {
                tp4 k2 = gn42.a.k(krVar, lp4);
                Object[] objArr2 = k2.b;
                Object[] objArr3 = k2.c;
                long[] jArr = k2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j2) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    this.n.m((hn4) objArr2[i5], (gn4) objArr3[i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public final gn4 p(hn4 hn4) {
        gn4 gn4;
        synchronized (this.c) {
            gn4 = (gn4) this.n.k(hn4);
        }
        return gn4;
    }

    public final up4 q(py0 py0, ps6 ps6, up4 up4) {
        ps6 ps62;
        cf4 cf4 = this.v;
        try {
            O();
            py0.A(new dg6(up4));
            ps62 = py0.L;
            py0.L = ps6;
            py0 M = M(py0, (up4) null);
            if (M != null) {
                J(py0);
                M.e();
                M.g();
            }
            up4 up42 = (up4) cf4.f();
            if (up42 == null) {
                up42 = cg6.a;
                up42.getClass();
            }
            py0.L = ps62;
            cf4.D((Object) null);
            return up42;
        } catch (Throwable th) {
            cf4.D((Object) null);
            throw th;
        }
    }

    public final void t(yx5 yx5) {
        cf4 cf4 = this.v;
        up4 up4 = (up4) cf4.f();
        if (up4 == null) {
            up4 up42 = cg6.a;
            up4 = new up4();
            cf4.D(up4);
        }
        up4.a(yx5);
    }

    public final void u(py0 py0) {
        synchronized (this.c) {
            try {
                up4 up4 = this.q;
                if (up4 == null) {
                    up4 up42 = cg6.a;
                    up4 = new up4();
                    this.q = up4;
                }
                up4.a(py0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [mz4, h20, java.lang.Object] */
    public final mk0 v(kh khVar) {
        cf4 cf4 = this.b;
        ? obj = new Object();
        obj.a = khVar;
        return ((o9) cf4.y).h(obj, (qm3) cf4.z);
    }

    public final void y(py0 py0) {
        synchronized (this.c) {
            if (this.f.remove(py0)) {
                this.g = null;
            }
            this.i.k(py0);
            this.j.remove(py0);
        }
    }

    public final void r(Set set) {
    }
}
