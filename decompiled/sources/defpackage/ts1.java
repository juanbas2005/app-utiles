package defpackage;

/* renamed from: ts1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ts1 {
    public static final /* synthetic */ int a = 0;

    static {
        uq4.e("value");
    }

    public static final boolean a(h28 h28) {
        Boolean s = dh4.s(sg3.D(h28), hz2.A, ss1.D);
        s.getClass();
        return s.booleanValue();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, h06] */
    public static ri0 b(ri0 ri0, vr2 vr2) {
        ri0.getClass();
        return (ri0) dh4.j(sg3.D(ri0), new kw5(26), new nd1(new Object(), vr2));
    }

    public static final up2 c(xj1 xj1) {
        xj1.getClass();
        vp2 f = rs1.f(xj1);
        f.getClass();
        if (!f.d()) {
            f = null;
        }
        if (f != null) {
            return f.i();
        }
        return null;
    }

    public static final ql4 d(fm fmVar) {
        fmVar.getClass();
        vq0 u = fmVar.b().L().u();
        if (u instanceof ql4) {
            return (ql4) u;
        }
        return null;
    }

    public static final fv3 e(vj1 vj1) {
        vj1.getClass();
        sl4 c = rs1.c(vj1);
        c.getClass();
        return c.g();
    }

    public static final gq0 f(vq0 vq0) {
        vj1 r;
        gq0 f;
        if (vq0 == null || (r = vq0.r()) == null) {
            return null;
        }
        if (r instanceof x95) {
            up2 up2 = ((y95) ((x95) r)).A;
            uq4 name = vq0.getName();
            name.getClass();
            return new gq0(up2, name);
        } else if (!(r instanceof wq0) || (f = f((vq0) r)) == null) {
            return null;
        } else {
            uq4 name2 = vq0.getName();
            name2.getClass();
            return f.d(name2);
        }
    }

    public static final up2 g(vj1 vj1) {
        vj1.getClass();
        up2 g = rs1.g(vj1);
        if (g != null) {
            return g;
        }
        return rs1.f(vj1.r()).a(vj1.getName()).i();
    }

    public static final void h(sl4 sl4) {
        sl4.getClass();
        if (sl4.Z(bx3.a) != null) {
            ku4.a();
        }
    }

    public static final ri0 i(ri0 ri0) {
        ri0.getClass();
        if (!(ri0 instanceof ar5)) {
            return ri0;
        }
        cr5 f1 = ((ar5) ri0).f1();
        f1.getClass();
        return f1;
    }
}
