package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: t04  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t04 implements wl5 {
    public static final /* synthetic */ yr3[] h;
    public final am6 a;
    public final n06 b;
    public final hb4 c;
    public final ib4 d;
    public final sa6 e;
    public final ib4 f;
    public final boolean g;

    static {
        Class<t04> cls = t04.class;
        h = new yr3[]{new gr5(cls, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0), new gr5(cls, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new gr5(cls, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r5v5, types: [ib4, hb4] */
    public t04(n06 n06, am6 am6, boolean z) {
        am6.getClass();
        n06.getClass();
        this.a = am6;
        this.b = n06;
        pj3 pj3 = (pj3) am6.x;
        kb4 kb4 = pj3.a;
        s04 s04 = new s04(this, 0);
        kb4.getClass();
        this.c = new hb4(kb4, s04);
        s04 s042 = new s04(this, 1);
        kb4.getClass();
        this.d = new hb4(kb4, s042);
        pj3.j.getClass();
        this.e = td0.F(n06);
        s04 s043 = new s04(this, 2);
        kb4.getClass();
        this.f = new hb4(kb4, s043);
        this.g = z;
    }

    public final e21 a(o06 o06) {
        l16 l16;
        vw3 vw3;
        if (o06 instanceof f16) {
            return g22.l((tl4) null, ((f16) o06).b);
        }
        if (o06 instanceof d16) {
            Enum enumR = ((d16) o06).b;
            Class<?> cls = enumR.getClass();
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            cls.getClass();
            return new b62(m06.a(cls), uq4.e(enumR.name()));
        }
        boolean z = o06 instanceof q06;
        am6 am6 = this.a;
        if (z) {
            q06 q06 = (q06) o06;
            uq4 uq4 = q06.a;
            if (uq4 == null) {
                uq4 = nn3.b;
            }
            uq4.getClass();
            ArrayList a2 = q06.a();
            if (!gr8.N((fu6) p25.q(this.d, h[1]))) {
                ql4 d2 = ts1.d(this);
                d2.getClass();
                h28 q = rj1.q(uq4, d2);
                if (q == null || (vw3 = q.b()) == null) {
                    vw3 = ((pj3) am6.x).o.g().h(z62.c(x62.Z, new String[0]));
                }
                ArrayList arrayList = new ArrayList(et0.e0(a2, 10));
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    e21 a3 = a((o06) it.next());
                    if (a3 == null) {
                        a3 = new e21((Object) null);
                    }
                    arrayList.add(a3);
                }
                return new lq7(arrayList, vw3);
            }
        } else if (o06 instanceof p06) {
            return new e21(new t04(new n06(((p06) o06).b), am6, false));
        } else {
            if (o06 instanceof z06) {
                Class cls2 = ((z06) o06).b;
                if (cls2.isPrimitive()) {
                    l16 = new j16(cls2);
                } else if ((cls2 instanceof GenericArrayType) || cls2.isArray()) {
                    l16 = new r06(cls2);
                } else if (cls2 instanceof WildcardType) {
                    l16 = new o16((WildcardType) cls2);
                } else {
                    l16 = new a16(cls2);
                }
                vw3 h0 = ((wr0) am6.A).h0(l16, sg3.b0(fq7.x, false, (q14) null, 7));
                if (!gr8.N(h0)) {
                    vw3 vw32 = h0;
                    int i = 0;
                    while (fv3.z(vw32)) {
                        vw32 = ((xp7) dt0.Q0(vw32.G())).b();
                        vw32.getClass();
                        i++;
                    }
                    vq0 u = vw32.L().u();
                    if (u instanceof ql4) {
                        gq0 f2 = ts1.f(u);
                        if (f2 == null) {
                            return new e21(new pq3(h0));
                        }
                        return new sq3(f2, i);
                    } else if (u instanceof qp7) {
                        up2 i2 = m27.a.i();
                        return new sq3(new gq0(i2.b(), i2.a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    public final vw3 b() {
        return (fu6) p25.q(this.d, h[1]);
    }

    public final sy6 e() {
        return this.e;
    }

    public final up2 f() {
        yr3 yr3 = h[0];
        hb4 hb4 = this.c;
        hb4.getClass();
        yr3.getClass();
        return (up2) hb4.b();
    }

    public final Map g() {
        return (Map) p25.q(this.f, h[2]);
    }

    public final String toString() {
        return ms1.c.p(this, (mm) null);
    }
}
