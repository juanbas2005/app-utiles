package defpackage;

import java.util.Arrays;

/* renamed from: f9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f9 implements w58 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final r58 b(Class cls, to4 to4) {
        r58 r58;
        t58 t58;
        r58 r582;
        vr2 vr2;
        r58 r583 = null;
        switch (this.a) {
            case b85.b:
                return new h9(new rd1(((vd1) ((g9) ag8.q(b96.v(((rv0) this.b).getApplicationContext()), g9.class))).b), new v70(8, (Object) to4));
            case 1:
                z66 z66 = new z66();
                jz0 jz0 = (jz0) this.b;
                xd1 xd1 = new xd1((vd1) jz0.x, (rd1) jz0.y, cf6.a(to4));
                Class<wz2> cls2 = wz2.class;
                xd1 xd12 = (xd1) ((wz2) ag8.q(xd1, cls2));
                xd12.getClass();
                ie1.z(23, "expectedSize");
                ig igVar = new ig(23);
                igVar.k("c30", xd12.b);
                igVar.k("e41", xd12.c);
                igVar.k("ku1", xd12.d);
                igVar.k("np2", xd12.e);
                igVar.k("c23", xd12.f);
                igVar.k("qb3", xd12.g);
                igVar.k("rh3", xd12.h);
                igVar.k("ne4", xd12.i);
                igVar.k("vs4", xd12.j);
                igVar.k("ic5", xd12.k);
                igVar.k("dj5", xd12.l);
                igVar.k("pm5", xd12.m);
                igVar.k("lq5", xd12.n);
                igVar.k("a06", xd12.o);
                igVar.k("g36", xd12.p);
                igVar.k("c56", xd12.q);
                igVar.k("gm6", xd12.r);
                igVar.k("fq6", xd12.s);
                igVar.k("jt6", xd12.t);
                igVar.k("ot6", xd12.u);
                igVar.k("hw6", xd12.v);
                igVar.k("t17", xd12.w);
                igVar.k("e88", xd12.x);
                mu5 mu5 = (mu5) igVar.c(true).get(cls.getName());
                vr2 vr22 = (vr2) to4.a.get(xz2.d);
                ((wz2) ag8.q(xd1, cls2)).getClass();
                Object obj = n36.D.get(cls);
                if (obj == null) {
                    if (vr22 != null) {
                        h.k(cls.getName(), " does not have an assisted factory specified in @HiltViewModel.", "Found creation callback but class ");
                    } else if (mu5 != null) {
                        r58 = (r58) mu5.get();
                    } else {
                        h.k(cls.getName(), " to be available in the multi-binding of @HiltViewModelMap but none was found.", "Expected the @HiltViewModel-annotated class ");
                    }
                    return r583;
                }
                if (mu5 != null) {
                    rf2.v(cls.getName(), " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.", "Found the @HiltViewModel-annotated class ");
                } else if (vr22 != null) {
                    r58 = (r58) vr22.y(obj);
                } else {
                    h.k(cls.getName(), " using @AssistedInject but no creation callback was provided in CreationExtras.", "Found @HiltViewModel-annotated class ");
                }
                return r583;
                r583 = r58;
                uz2 uz2 = new uz2(z66);
                r583.getClass();
                s58 s58 = r583.a;
                if (s58 != null) {
                    if (s58.d) {
                        s58.a(uz2);
                    } else {
                        synchronized (s58.a) {
                            s58.c.add(uz2);
                        }
                    }
                }
                return r583;
            default:
                gq3 b2 = b26.a.b(cls);
                t58[] t58Arr = (t58[]) this.b;
                t58[] t58Arr2 = (t58[]) Arrays.copyOf(t58Arr, t58Arr.length);
                int length = t58Arr2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        t58 = t58Arr2[i];
                        if (!sg3.e(t58.a, b2)) {
                            i++;
                        }
                    } else {
                        t58 = null;
                    }
                }
                if (t58 == null || (vr2 = t58.b) == null) {
                    r582 = null;
                } else {
                    r582 = (r58) vr2.y(to4);
                }
                if (r582 != null) {
                    return r582;
                }
                h.j(b81.y("No initializer set for given class ", b2.l()));
                return null;
        }
    }
}
