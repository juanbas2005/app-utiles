package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: ay5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ay5 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ay5(ay5 ay5, no6 no6) {
        this.w = 22;
        this.x = ay5;
    }

    public final Object y(Object obj) {
        u44 u44;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i = this.w;
        float f7 = 0.0f;
        boolean z = true;
        boolean z2 = false;
        lt0 lt0 = null;
        Object obj2 = this.x;
        switch (i) {
            case b85.b /*0*/:
                ((py0) obj2).h(obj);
                return vs7.a;
            case 1:
                gy5 gy5 = (gy5) obj2;
                Throwable th = (Throwable) obj;
                CancellationException b = rc9.b("Recomposer effect job completed", th);
                synchronized (gy5.c) {
                    try {
                        el3 el3 = gy5.d;
                        if (el3 != null) {
                            d37 d37 = gy5.u;
                            dy5 dy5 = dy5.x;
                            d37.getClass();
                            d37.l((Object) null, dy5);
                            el3.o(b);
                            gy5.r = null;
                            el3.v(new w34(20, gy5, th));
                        } else {
                            gy5.e = b;
                            d37 d372 = gy5.u;
                            dy5 dy52 = dy5.w;
                            d372.getClass();
                            d372.l((Object) null, dy52);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return vs7.a;
            case 2:
                ((jy5) obj2).a((h22) obj);
                return vs7.a;
            case 3:
                a06 a06 = (a06) obj2;
                ((Map) obj).getClass();
                ar7.H(u58.a(a06), (e81) null, (r81) null, new zz5(a06, (f61) null, 1), 3);
                return vs7.a;
            case 4:
                g36 g36 = (g36) obj2;
                ((Map) obj).getClass();
                g36.g.clear();
                ar7.H(u58.a(g36), g36.d, (r81) null, new f36(g36, (f61) null), 2);
                return vs7.a;
            case 5:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                ((se4) obj2).d0(strArr);
                return vs7.a;
            case 6:
                ir2 ir2 = (ir2) obj;
                ir2.getClass();
                ((dq1) obj2).i = ir2;
                return vs7.a;
            case 7:
                re6 re6 = ((pe6) obj2).y;
                if (re6 != null) {
                    z = re6.c(obj);
                }
                return Boolean.valueOf(z);
            case 8:
                ((oe6) obj2).f(obj);
                return vs7.a;
            case 9:
                ((ay6) obj2).remove(obj);
                return vs7.a;
            case 10:
                gh6 gh6 = (gh6) obj2;
                float floatValue = ((Float) obj).floatValue();
                bd5 bd5 = gh6.a;
                float d = ((float) bd5.d()) + floatValue + gh6.g;
                float o = z65.o(d, 0.0f, (float) gh6.f.d());
                if (d != o) {
                    z = false;
                }
                float d2 = o - ((float) bd5.d());
                int round = Math.round(d2);
                bd5.e(bd5.d() + round);
                gh6.g = d2 - ((float) round);
                if (!z) {
                    floatValue = d2;
                }
                return Float.valueOf(floatValue);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                zh6 zh6 = (zh6) obj2;
                return new l35(zh6.d(zh6.k, ((l35) obj).a, zh6.j));
            case 12:
                zc9 zc9 = (zc9) obj2;
                qk5 qk5 = (qk5) obj;
                long j = qk5.c;
                ze7 ze7 = (ze7) zc9.z;
                if (!ze7.k() || ze7.n().a.x.length() == 0 || (u44 = ze7.d) == null || u44.d() == null) {
                    z = false;
                } else {
                    zc9.e(ze7.n(), j, false, d63.K);
                }
                if (z) {
                    qk5.a();
                }
                return vs7.a;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                qu6 qu6 = (qu6) obj2;
                xk6 xk6 = qu6.B;
                xk6.getClass();
                if (!sg3.e(qu6.B, xk6)) {
                    vm5.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                up4 up4 = qu6.A;
                Object obj3 = qu6.y;
                if (up4 != null) {
                    if (obj3 != null) {
                        vm5.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    up4.a(obj);
                } else if (obj3 == null) {
                    qu6.y = obj;
                } else {
                    up4 up42 = cg6.a;
                    up4 up43 = new up4();
                    up43.a(obj3);
                    up43.a(obj);
                    qu6.A = up43;
                    qu6.y = null;
                }
                return vs7.a;
            case 14:
                return Integer.valueOf(((gv6) obj2).f(hj8.m(((hn4) obj).e)));
            case h75.g /*15*/:
                return Boolean.valueOf(sg3.e(((hb2) obj).a, (nw6) obj2));
            case 16:
                cy6 cy6 = (cy6) obj2;
                synchronized (cy6.h) {
                    try {
                        by6 by6 = (by6) cy6.j;
                        by6.getClass();
                        Object obj4 = by6.b;
                        obj4.getClass();
                        int i2 = by6.d;
                        hp4 hp4 = by6.c;
                        if (hp4 == null) {
                            hp4 = new hp4();
                            by6.c = hp4;
                            by6.f.m(obj4, hp4);
                        }
                        by6.b(obj, i2, obj4, hp4);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return vs7.a;
            case 17:
                y53 y53 = (y53) obj;
                y53.getClass();
                y63 y63 = new y63();
                y63.b(Long.valueOf(u02.e(((h47) obj2).c.u)));
                vs7 vs7 = vs7.a;
                y53.c(y63);
                return vs7;
            case 18:
                l76 l76 = (l76) obj;
                z57 a1 = y57.a1((y57) obj2, 4);
                float f8 = 1.0f;
                if (a1.v((byte) 21)) {
                    f = a1.H;
                } else {
                    f = 1.0f;
                }
                l76.c(f);
                if (a1.v((byte) 22)) {
                    f2 = a1.I;
                } else {
                    f2 = 1.0f;
                }
                l76.l(f2);
                if (a1.v((byte) 23)) {
                    f8 = a1.J;
                }
                l76.m(f8);
                if (a1.v((byte) 24)) {
                    f3 = a1.K;
                } else {
                    f3 = 0.0f;
                }
                l76.y(f3);
                if (a1.v((byte) 25)) {
                    f4 = a1.L;
                } else {
                    f4 = 0.0f;
                }
                l76.A(f4);
                if (a1.v((byte) 26)) {
                    f5 = a1.M;
                } else {
                    f5 = 0.0f;
                }
                l76.h(f5);
                if (a1.v((byte) 27)) {
                    f6 = a1.N;
                } else {
                    f6 = 0.0f;
                }
                l76.j(f6);
                if (a1.v((byte) 28)) {
                    f7 = a1.O;
                }
                l76.k(f7);
                if (a1.w(54)) {
                    lt0 = a1.T;
                    lt0.getClass();
                }
                l76.g(lt0);
                long j2 = ql7.b;
                if (a1.v((byte) 29) || a1.v((byte) 30)) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                    if (a1.v((byte) 29)) {
                        intBitsToFloat = a1.P;
                    }
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                    if (a1.v((byte) 30)) {
                        intBitsToFloat2 = a1.Q;
                    }
                    j2 = o55.a(intBitsToFloat, intBitsToFloat2);
                }
                l76.w(j2);
                if (a1.v((byte) 31)) {
                    z2 = a1.D;
                }
                l76.f(z2);
                pq6 pq6 = gr8.h;
                if (a1.w(53)) {
                    pq6 = a1.E;
                }
                l76.r(pq6);
                return vs7.a;
            case 19:
                ((ub4) obj).getClass();
                return (ms3) ((cf4) obj2).z;
            case 20:
                Drawable drawable = (Drawable) obj2;
                hz1 hz1 = (hz1) obj;
                qk0 D = hz1.j0().D();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (hz1.e() >> 32)), (int) Float.intBitsToFloat((int) (4294967295L & hz1.e())));
                drawable.draw(pd.a(D));
                return vs7.a;
            case 21:
                ((vr2) obj).y((wc7) obj2);
                return vs7.a;
            case 22:
                ay5 ay5 = (ay5) obj2;
                ln7 ln7 = (ln7) obj;
                if (ln7 instanceof p9) {
                    ay5.y(((p9) ln7).K);
                    return Boolean.TRUE;
                }
                h.s("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 23:
                se7 se7 = (se7) obj2;
                float floatValue2 = ((Float) obj).floatValue();
                ad5 ad5 = se7.a;
                float d3 = ad5.d() + floatValue2;
                ad5 ad52 = se7.b;
                if (d3 > ad52.d()) {
                    floatValue2 = ad52.d() - ad5.d();
                } else if (d3 < 0.0f) {
                    floatValue2 = -ad5.d();
                }
                ad5.e(ad5.d() + floatValue2);
                return Float.valueOf(floatValue2);
            case 24:
                gg7 gg7 = (gg7) obj2;
                ul ulVar = (ul) obj;
                rl rlVar = (rl) ulVar.a;
                if (rlVar instanceof a74) {
                    a74 a74 = (a74) rlVar;
                    if (a74.b == null) {
                        return ul.a(ulVar, new a74(a74.a, gg7), 0, 14);
                    }
                }
                if (!(rlVar instanceof z64)) {
                    return ulVar;
                }
                z64 z64 = (z64) rlVar;
                if (z64.b == null) {
                    return ul.a(ulVar, new z64(z64.a, gg7), 0, 14);
                }
                return ulVar;
            default:
                e61 e61 = (e61) obj2;
                nq0 nq0 = (nq0) obj;
                nq0.getClass();
                nq0.b(nq0, "first", e61.b.getDescriptor(), 12);
                nq0.b(nq0, "second", ((zr3) e61.c).getDescriptor(), 12);
                nq0.b(nq0, "third", ((zr3) e61.d).getDescriptor(), 12);
                return vs7.a;
        }
    }

    public /* synthetic */ ay5(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }
}
