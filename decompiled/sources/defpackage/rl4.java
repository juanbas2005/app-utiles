package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: rl4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rl4 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARNING: type inference failed for: r26v0, types: [kt1, java.lang.Object] */
    public static final ra6 a(Class cls) {
        x46 x46;
        x46 x462;
        un3 un3;
        u9 u9Var;
        gj5 gj5;
        cls.getClass();
        ClassLoader d = m06.d(cls);
        m88 m88 = new m88(d);
        ConcurrentHashMap concurrentHashMap = a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(m88);
        if (weakReference != null) {
            ra6 ra6 = (ra6) weakReference.get();
            if (ra6 != null) {
                return ra6;
            }
            concurrentHashMap.remove(m88, weakReference);
        }
        d63 d63 = d63.E;
        rg4 rg4 = new rg4(5, (Object) d);
        ClassLoader classLoader = vs7.class.getClassLoader();
        classLoader.getClass();
        rg4 rg42 = new rg4(5, (Object) classLoader);
        y06 y06 = new y06(d);
        me6 me6 = me6.K;
        td0 td0 = td0.L;
        kb4 kb4 = new kb4("DeserializationComponentsForJava.ModuleData");
        un3 un32 = new un3(kb4);
        tl4 tl4 = new tl4(uq4.g("<" + ("runtime module for " + d) + '>'), kb4, un32, 56);
        du6 du6 = kb4.a;
        du6.lock();
        try {
            if (un32.a == null) {
                un32.a = tl4;
                du6.unlock();
                un32.f = new sn3(tl4, 0);
                ? obj = new Object();
                rg4 rg43 = new rg4(8, false);
                am6 am6 = new am6(kb4, (sl4) tl4);
                hz2 hz2 = hz2.H;
                cx3 cx3 = new cx3(1, 9, 0);
                nj3 nj3 = mj3.d;
                cx3 cx32 = nj3.b;
                if (cx32 == null || cx32.y - cx3.y > 0) {
                    x46 = nj3.a;
                } else {
                    x46 = nj3.c;
                }
                x46.getClass();
                if (x46 == x46.WARN) {
                    x462 = null;
                } else {
                    x462 = x46;
                }
                zc9 zc9 = new zc9(new ln3(x46, x462), new b0(17, cx3));
                pe2 pe2 = pe2.N;
                hz2 hz22 = hz2.D;
                n63 n63 = new n63(kb4);
                pe2 pe22 = pe2.O;
                pe2 pe23 = pe2.H;
                f26 f26 = new f26(tl4, am6);
                lm lmVar = new lm(zc9);
                rg4 rg44 = rg43;
                xb4 xb4 = xb4.T;
                rg4 rg45 = rg4;
                hr2 hr2 = new hr2(new s63(1));
                g22 g22 = g22.B;
                kz4.b.getClass();
                lz4 lz4 = jz4.b;
                tl4 tl42 = tl4;
                un3 un33 = un32;
                rg4 rg46 = rg45;
                kt1 kt1 = obj;
                tl4 tl43 = tl42;
                ba5 d14 = new d14(new pj3(kb4, y06, rg45, obj, pe2, me6, hz22, n63, td0, rg44, hz2, pe22, pe23, tl42, f26, lmVar, hr2, g22, xb4, lz4, zc9, new pe2(27)));
                rk4 rk4 = rk4.g;
                rk4.getClass();
                hv2 hv2 = new hv2(6, (Object) rg46, (Object) kt1);
                kd6 kd6 = new kd6(tl43, am6, kb4, rg46);
                kd6.C = rk4;
                List D = sg3.D(go1.a);
                fv3 fv3 = tl43.z;
                if (fv3 instanceof un3) {
                    un3 = (un3) fv3;
                } else {
                    un3 = null;
                }
                rg4 rg47 = rg42;
                hv2 hv22 = hv2;
                pe2 pe24 = pe2.F;
                if (un3 == null || (u9Var = un3.K()) == null) {
                    u9Var = pe2.x;
                }
                if (un3 == null || (gj5 = un3.K()) == null) {
                    gj5 = td0.J;
                }
                un3 un34 = un33;
                m88 m882 = m88;
                gj5 gj52 = gj5;
                ws1 ws1 = new ws1(kb4, tl43, hv22, kd6, d14, me6, pe24, a42.w, am6, u9Var, gj52, rp3.a, lz4, new n63(kb4), D, d63);
                kt1.a = ws1;
                rg44.x = new ns8(24, (Object) d14);
                xn3 K = un34.K();
                xn3 K2 = un34.K();
                n63 n632 = new n63(kb4);
                K.getClass();
                K2.getClass();
                zn3 zn3 = new zn3(kb4, rg47, tl43);
                wv2 wv2 = new wv2(15, zn3);
                md0 md0 = md0.m;
                zn3 zn32 = zn3;
                kb4 kb42 = kb4;
                tl4 tl44 = tl43;
                zn3 zn33 = zn32;
                zn33.c = new ws1(kb42, tl44, wv2, new qc3((sl4) tl43, am6, md0), zn32, sg3.E(new kd0(kb4, tl43), new rn3(kb4, tl43)), am6, K, K2, md0.a, lz4, n632, 262144);
                tl43.C = new wv1(qs.p1(new tl4[]{tl43}));
                tl43.D = new iy0(sg3.E(d14, zn33), "CompositeProvider@RuntimeModuleData for " + tl43);
                ra6 ra62 = new ra6(ws1, new cf4(kt1, rg46));
                while (true) {
                    m88 m883 = m882;
                    WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(m883, new WeakReference(ra62));
                    if (weakReference2 == null) {
                        return ra62;
                    }
                    ra6 ra63 = (ra6) weakReference2.get();
                    if (ra63 != null) {
                        return ra63;
                    }
                    concurrentHashMap.remove(m883, weakReference2);
                    m882 = m883;
                }
            } else {
                un3 un35 = un32;
                throw new AssertionError("Built-ins module is already set: " + un35.a + " (attempting to reset to " + tl4 + ")");
            }
        } catch (Throwable th) {
            du6.unlock();
            throw th;
        }
    }
}
