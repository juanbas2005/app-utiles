package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.work.impl.WorkerStoppedException;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: e3  reason: default package */
public final class e3 implements vr2, vi0 {
    public final /* synthetic */ int w;
    public final Object x;
    public final Object y;

    public e3(m92 m92, boolean z, aq4 aq4) {
        this.w = 8;
        this.x = m92;
        this.y = aq4;
    }

    public void M(zh0 zh0, IOException iOException) {
        if (!((dx5) zh0).N) {
            ((kk0) this.y).f(new m66(iOException));
        }
    }

    /* JADX WARNING: type inference failed for: r15v2, types: [ib4, hb4] */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0664, code lost:
        if (((defpackage.jm) r1.e) != defpackage.jm.B) goto L_0x0666;
     */
    public final Object y(Object obj) {
        zj3 zj3;
        long j;
        Class<?> cls;
        x06 x06;
        ji8 ji8;
        v16 v16;
        gq0 gq0;
        up2 up2;
        Class<?> cls2;
        ql4 ql4;
        String str;
        boolean z = false;
        switch (this.w) {
            case b85.b:
                u72 u72 = (u72) this.x;
                am6 am6 = (am6) u72.d;
                obj.getClass();
                zw3 zw3 = ((g3) this.y).a;
                fm fmVar = (fm) obj;
                if (fmVar instanceof t04) {
                    ((pj3) am6.x).t.getClass();
                    if (!((t04) fmVar).g) {
                        break;
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
                if (zw3 != null) {
                    uq4 uq4 = fv3.e;
                    vq0 u = ((vw3) zw3).L().u();
                    if (!(u == null || fv3.s(u) == null)) {
                        ((pj3) am6.x).q.getClass();
                        Object c = lm.c(fmVar, m27.t);
                        if (c != null) {
                            ArrayList a = lm.a(c, false);
                            if (!a.isEmpty()) {
                                Iterator it = a.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (sg3.e((String) it.next(), "TYPE")) {
                                            ((pj3) am6.x).t.getClass();
                                        }
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                cp7 cp7 = (cp7) this.x;
                zj3[] zj3Arr = (zj3[]) this.y;
                int intValue = ((Number) obj).intValue();
                if (cp7 != null && (zj3 = (zj3) cp7.a.get(Integer.valueOf(intValue))) != null) {
                    return zj3;
                }
                if (intValue < 0 || intValue >= zj3Arr.length) {
                    return zj3.f;
                }
                return zj3Arr[intValue];
            case 2:
                return ((j5) this.x).y(((List) this.y).get(((Number) obj).intValue()));
            case 3:
                Throwable th = (Throwable) obj;
                try {
                    ((dx5) this.x).d();
                } catch (Throwable unused) {
                }
                return vs7.a;
            case 4:
                KeyEvent keyEvent = ((qs3) obj).a;
                if (((u44) this.x).a() == ey2.x && keyEvent.getKeyCode() == 4 && rd3.A(keyEvent) == 1) {
                    ((ze7) this.y).g((l35) null);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                KeyEvent keyEvent2 = ((qs3) obj).a;
                ik2 ik2 = (ik2) this.x;
                if (os3.a(rd3.x(keyEvent2), os3.d) || os3.a(uq3.f(keyEvent2.getKeyCode()), os3.F)) {
                    ((lk2) ik2).h(2, true);
                    return Boolean.TRUE;
                } else if (keyEvent2.isShiftPressed() && os3.a(uq3.f(keyEvent2.getKeyCode()), os3.p)) {
                    ok2.a((ok2) this.y);
                    return Boolean.TRUE;
                } else if (!os3.a(uq3.f(keyEvent2.getKeyCode()), os3.e) && !os3.a(uq3.f(keyEvent2.getKeyCode()), os3.G) && !os3.a(uq3.f(keyEvent2.getKeyCode()), os3.p)) {
                    return Boolean.FALSE;
                } else {
                    ((lk2) ik2).h(1, true);
                    return Boolean.TRUE;
                }
            case 6:
                KeyEvent keyEvent3 = ((qs3) obj).a;
                if (dh4.v(keyEvent3)) {
                    ((sr2) this.x).b();
                    return Boolean.TRUE;
                } else if (!dh4.w(keyEvent3)) {
                    return Boolean.FALSE;
                } else {
                    ((sr2) this.y).b();
                    return Boolean.TRUE;
                }
            case 7:
                am6 am62 = (am6) this.x;
                gt1 gt1 = (gt1) this.y;
                z00 z00 = gt1.H;
                uq4 uq42 = (uq4) obj;
                uq42.getClass();
                es5 es5 = (es5) ((LinkedHashMap) am62.x).get(uq42);
                if (es5 == null) {
                    return null;
                }
                return z52.C0(((ws1) z00.a).a, gt1, uq42, (ib4) am62.z, new xs1(((ws1) z00.a).a, new p3(gt1, false, es5, 6)), sy6.j);
            case 8:
                KeyEvent keyEvent4 = ((qs3) obj).a;
                aq4 aq4 = (aq4) this.y;
                m92 m92 = (m92) this.x;
                if (rd3.A(keyEvent4) == 1 && (fd1.Q(keyEvent4) || os3.a(uq3.f(keyEvent4.getKeyCode()), os3.q))) {
                    m92.b();
                }
                Boolean bool = Boolean.FALSE;
                aq4.setValue(bool);
                return bool;
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((gs2) this.x).H(((tm2) this.y).a, bool2);
                return vs7.a;
            case 10:
                return ((vd2) this.x).y(((List) this.y).get(((Number) obj).intValue()));
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return ((vd2) this.x).y(((List) this.y).get(((Number) obj).intValue()));
            case 12:
                mx6 mx6 = (mx6) obj;
                synchronized (nx6.c) {
                    j = nx6.e;
                    nx6.e = 1 + j;
                }
                return new yp4(j, mx6, (vr2) this.x, (vr2) this.y);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return ((vd2) this.x).y(((List) this.y).get(((Number) obj).intValue()));
            case 14:
                Throwable th2 = (Throwable) obj;
                l90 l90 = (l90) this.x;
                Object obj2 = l90.b;
                kk0 kk0 = (kk0) this.y;
                synchronized (obj2) {
                    ((ArrayList) l90.c).remove(kk0);
                }
                return vs7.a;
            case h75.g /*15*/:
                a14 a14 = (a14) this.x;
                am6 am63 = (am6) this.y;
                uq4 uq43 = (uq4) obj;
                uq43.getClass();
                ib4 ib4 = a14.r;
                ql4 ql42 = a14.n;
                if (((Set) ib4.b()).contains(uq43)) {
                    y06 y06 = ((pj3) am63.x).b;
                    gq0 f = ts1.f(ql42);
                    f.getClass();
                    gq0 d = f.d(uq43);
                    y06.getClass();
                    up2 up22 = d.a;
                    String r0 = k57.r0(d.b.a.a, '.', '$');
                    if (!up22.a.c()) {
                        r0 = up22.a.a + '.' + r0;
                    }
                    try {
                        cls = Class.forName(r0, false, y06.a);
                    } catch (ClassNotFoundException unused2) {
                        cls = null;
                    }
                    if (cls != null) {
                        x06 = new x06(cls);
                    } else {
                        x06 = null;
                    }
                    if (x06 == null) {
                        return null;
                    }
                    w04 w04 = new w04(am63, ql42, x06, (ql4) null);
                    ((pj3) am63.x).s.getClass();
                    return w04;
                } else if (((Set) a14.s.b()).contains(uq43)) {
                    n74 m = sg3.m();
                    ((xb4) ((pj3) am63.x).x).getClass();
                    ql42.getClass();
                    uq43.getClass();
                    am63.getClass();
                    n74 i = sg3.i(m);
                    int f2 = i.f();
                    if (f2 == 0) {
                        return null;
                    }
                    if (f2 == 1) {
                        return (ql4) dt0.Q0(i);
                    }
                    ku4.k("Multiple classes with same name are generated: ", i);
                    return null;
                } else {
                    e16 e16 = (e16) ((Map) a14.t.b()).get(uq43);
                    if (e16 == null) {
                        return null;
                    }
                    pj3 pj3 = (pj3) am63.x;
                    kb4 kb4 = pj3.a;
                    y04 y04 = new y04(a14, 2);
                    kb4.getClass();
                    ? hb4 = new hb4(kb4, y04);
                    kb4 kb42 = pj3.a;
                    ql4 ql43 = a14.n;
                    u04 s = h03.s(am63, e16);
                    pj3.j.getClass();
                    return z52.C0(kb42, ql43, uq43, hb4, s, td0.F(e16));
                }
            case 16:
                au6 au6 = (au6) this.x;
                a14 a142 = (a14) this.y;
                uq4 uq44 = (uq4) obj;
                uq44.getClass();
                if (sg3.e(au6.getName(), uq44)) {
                    return sg3.D(au6);
                }
                return dt0.M0(a142.N(uq44), a142.O(uq44));
            case 17:
                i14 i14 = (i14) this.x;
                am6 am64 = i14.b;
                am6 am65 = (am6) this.y;
                e14 e14 = (e14) obj;
                e14.getClass();
                c14 c14 = i14.o;
                up2 up23 = c14.A;
                uq4 uq45 = e14.a;
                up23.getClass();
                vp2 vp2 = up23.a;
                uq45.getClass();
                up2 up24 = up2.c;
                vp2 vp22 = dh4.I(uq45).a;
                vp22.c();
                String str2 = vp22.a;
                x06 x062 = e14.b;
                pj3 pj32 = (pj3) am65.x;
                if (x062 != null) {
                    rg4 rg4 = pj32.c;
                    ((pj3) am64.x).d.c().c.getClass();
                    rk4 rk4 = rk4.g;
                    rg4.getClass();
                    rk4.getClass();
                    up2 c2 = x062.c();
                    if (c2 == null || (str = c2.a.a) == null) {
                        ji8 = null;
                    } else {
                        ji8 = rg4.l(str);
                    }
                } else {
                    rg4 rg42 = pj32.c;
                    ((pj3) am64.x).d.c().c.getClass();
                    rk4 rk42 = rk4.g;
                    rg42.getClass();
                    rk42.getClass();
                    String r02 = k57.r0(str2, '.', '$');
                    if (!vp2.c()) {
                        r02 = up23 + '.' + r02;
                    }
                    ji8 = rg42.l(r02);
                }
                if (ji8 != null) {
                    v16 = (v16) ji8.x;
                } else {
                    v16 = null;
                }
                if (v16 != null) {
                    gq0 = m06.a(v16.a);
                } else {
                    gq0 = null;
                }
                if (gq0 != null && (gq0.g() || gq0.c)) {
                    return null;
                }
                Object obj3 = g14.s;
                if (v16 != null) {
                    if (v16.b.a == gv3.A) {
                        kt1 kt1 = ((pj3) am64.x).d;
                        kt1.getClass();
                        xp0 g = kt1.g(v16);
                        if (g == null) {
                            ql4 = null;
                        } else {
                            ql4 = kt1.c().t.a(m06.a(v16.a), g);
                        }
                        if (ql4 != null) {
                            obj3 = new f14(ql4);
                        }
                    } else {
                        obj3 = h14.s;
                    }
                }
                if (obj3 instanceof f14) {
                    return ((f14) obj3).s;
                }
                if (obj3 instanceof h14) {
                    return null;
                }
                if (obj3 instanceof g14) {
                    if (x062 == null) {
                        y06 y062 = pj32.b;
                        y062.getClass();
                        String r03 = k57.r0(str2, '.', '$');
                        if (!vp2.c()) {
                            r03 = vp2.a + '.' + r03;
                        }
                        try {
                            cls2 = Class.forName(r03, false, y062.a);
                        } catch (ClassNotFoundException unused3) {
                            cls2 = null;
                        }
                        if (cls2 != null) {
                            x062 = new x06(cls2);
                        } else {
                            x062 = null;
                        }
                    }
                    if (x062 != null) {
                        up2 = x062.c();
                    } else {
                        up2 = null;
                    }
                    if (up2 == null || up2.a.c() || !up2.b().equals(c14.A)) {
                        return null;
                    }
                    w04 w042 = new w04(am65, c14, x062, (ql4) null);
                    pj32.s.getClass();
                    return w042;
                }
                h.c();
                return null;
            case 18:
                KeyEvent keyEvent5 = ((qs3) obj).a;
                xz1 xz1 = (xz1) this.x;
                if (!xz1.c() || rd3.A(keyEvent5) != 1 || !os3.a(uq3.f(keyEvent5.getKeyCode()), os3.u)) {
                    return Boolean.FALSE;
                }
                ar7.H((o81) this.y, (e81) null, (r81) null, new mk3(xz1, (f61) null, 5), 3);
                return Boolean.TRUE;
            case 19:
                ri0 ri0 = (ri0) obj;
                ri0.getClass();
                ((t49) this.x).z((ri0) this.y, ri0);
                return vs7.a;
            case 20:
                return ((nf6) this.x).y(((List) this.y).get(((Number) obj).intValue()));
            case 21:
                KeyEvent keyEvent6 = ((qs3) obj).a;
                ik2 ik22 = (ik2) this.x;
                InputDevice device = keyEvent6.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent6.getSource() == 33554433) && rd3.A(keyEvent6) == 2 && keyEvent6.getSource() != 257)) {
                    if (z65.a(19, keyEvent6)) {
                        z = ((lk2) ik22).h(5, true);
                    } else if (z65.a(20, keyEvent6)) {
                        z = ((lk2) ik22).h(6, true);
                    } else if (z65.a(21, keyEvent6)) {
                        z = ((lk2) ik22).h(3, true);
                    } else if (z65.a(22, keyEvent6)) {
                        z = ((lk2) ik22).h(4, true);
                    } else if (z65.a(23, keyEvent6)) {
                        gy6 gy6 = ((u44) this.y).c;
                        if (gy6 != null) {
                            ((ip1) gy6).b();
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 22:
                Throwable th3 = (Throwable) obj;
                if (th3 instanceof WorkerStoppedException) {
                    ((t84) this.x).c.compareAndSet(-256, ((WorkerStoppedException) th3).w);
                }
                ((ListenableFuture) this.y).cancel(false);
                return vs7.a;
            default:
                h34 h34 = (h34) obj;
                h34.getClass();
                rr8 rr8 = (rr8) this.x;
                ArrayList arrayList = rr8.a;
                h34.P(arrayList.size(), (vr2) null, new st6(7, arrayList), new fw0(2039820996, new aa9(arrayList, (vr2) this.y, rr8, 0), true));
                return vs7.a;
        }
    }

    public void z(zh0 zh0, a66 a66) {
        ((kk0) this.y).f(a66);
    }

    public /* synthetic */ e3(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }
}
