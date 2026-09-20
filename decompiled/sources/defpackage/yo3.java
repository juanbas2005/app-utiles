package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: yo3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yo3 implements ji4 {
    public static final /* synthetic */ yr3[] f = {new gr5(yo3.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};
    public final am6 b;
    public final c14 c;
    public final i14 d;
    public final ib4 e;

    /* JADX WARNING: type inference failed for: r4v2, types: [ib4, hb4] */
    public yo3(am6 am6, i16 i16, c14 c14) {
        this.b = am6;
        this.c = c14;
        this.d = new i14(am6, i16, c14);
        kb4 kb4 = ((pj3) am6.x).a;
        xo3 xo3 = new xo3(0, this);
        kb4.getClass();
        this.e = new hb4(kb4, xo3);
    }

    public final Collection a(is1 is1, vr2 vr2) {
        is1.getClass();
        ji4[] h = h();
        Collection a = this.d.a(is1, vr2);
        for (ji4 a2 : h) {
            a = jb5.b(a, a2.a(is1, vr2));
        }
        if (a == null) {
            return g42.w;
        }
        return a;
    }

    public final Collection b(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        i(uq4, oz4);
        ji4[] h = h();
        Collection b2 = this.d.b(uq4, oz4);
        for (ji4 b3 : h) {
            b2 = jb5.b(b2, b3.b(uq4, oz4));
        }
        if (b2 == null) {
            return g42.w;
        }
        return b2;
    }

    public final Set c() {
        ji4[] h = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ji4 c2 : h) {
            it0.h0(linkedHashSet, c2.c());
        }
        linkedHashSet.addAll(this.d.c());
        return linkedHashSet;
    }

    public final Set d() {
        Iterable iterable;
        ji4[] h = h();
        h.getClass();
        if (h.length == 0) {
            iterable = a42.w;
        } else {
            iterable = new ss(0, h);
        }
        HashSet k = h03.k(iterable);
        if (k == null) {
            return null;
        }
        k.addAll(this.d.d());
        return k;
    }

    public final vq0 e(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        i(uq4, oz4);
        i14 i14 = this.d;
        i14.getClass();
        vq0 vq0 = null;
        ql4 v = i14.v(uq4, (x06) null);
        if (v != null) {
            return v;
        }
        for (ji4 e2 : h()) {
            vq0 e3 = e2.e(uq4, oz4);
            if (e3 != null) {
                if (!(e3 instanceof wq0) || !((zh4) e3).H()) {
                    return e3;
                }
                if (vq0 == null) {
                    vq0 = e3;
                }
            }
        }
        return vq0;
    }

    public final Collection f(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        i(uq4, oz4);
        ji4[] h = h();
        this.d.getClass();
        Collection collection = a42.w;
        for (ji4 f2 : h) {
            collection = jb5.b(collection, f2.f(uq4, oz4));
        }
        if (collection == null) {
            return g42.w;
        }
        return collection;
    }

    public final Set g() {
        ji4[] h = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ji4 g : h) {
            it0.h0(linkedHashSet, g.g());
        }
        linkedHashSet.addAll(this.d.g());
        return linkedHashSet;
    }

    public final ji4[] h() {
        return (ji4[]) p25.q(this.e, f[0]);
    }

    public final void i(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        c35.o(((pj3) this.b.x).n, oz4, this.c, uq4);
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
