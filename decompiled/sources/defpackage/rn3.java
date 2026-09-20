package defpackage;

import java.util.Collection;

/* renamed from: rn3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rn3 implements bq0 {
    public static final hr2 d = new hr2(2);
    public static final /* synthetic */ yr3[] e = {new gr5(rn3.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0)};
    public static final up2 f = n27.k;
    public static final uq4 g;
    public static final gq0 h;
    public final tl4 a;
    public final vr2 b;
    public final ib4 c;

    static {
        vp2 vp2 = m27.c;
        g = vp2.g();
        up2 i = vp2.i();
        h = new gq0(i.b(), i.a.g());
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [ib4, hb4] */
    public rn3(kb4 kb4, tl4 tl4) {
        v61 v61 = v61.a0;
        this.a = tl4;
        this.b = v61;
        this.c = new hb4(kb4, new p3(this, false, kb4, 13));
    }

    public final ql4 a(gq0 gq0) {
        gq0.getClass();
        if (!gq0.equals(h)) {
            return null;
        }
        return (cq0) p25.q(this.c, e[0]);
    }

    public final Collection b(up2 up2) {
        up2.getClass();
        if (!up2.equals(f)) {
            return g42.w;
        }
        return wn6.w((cq0) p25.q(this.c, e[0]));
    }

    public final boolean c(up2 up2, uq4 uq4) {
        up2.getClass();
        uq4.getClass();
        if (!uq4.equals(g) || !up2.equals(f)) {
            return false;
        }
        return true;
    }
}
