package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: vm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vm0 implements ji4 {
    public final String b;
    public final ji4[] c;

    public vm0(String str, ji4[] ji4Arr) {
        this.b = str;
        this.c = ji4Arr;
    }

    public final Collection a(is1 is1, vr2 vr2) {
        is1.getClass();
        ji4[] ji4Arr = this.c;
        int length = ji4Arr.length;
        if (length == 0) {
            return a42.w;
        }
        if (length == 1) {
            return ji4Arr[0].a(is1, vr2);
        }
        Collection collection = null;
        for (ji4 a : ji4Arr) {
            collection = jb5.b(collection, a.a(is1, vr2));
        }
        if (collection == null) {
            return g42.w;
        }
        return collection;
    }

    public final Collection b(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        ji4[] ji4Arr = this.c;
        int length = ji4Arr.length;
        if (length == 0) {
            return a42.w;
        }
        if (length == 1) {
            return ji4Arr[0].b(uq4, oz4);
        }
        Collection collection = null;
        for (ji4 b2 : ji4Arr) {
            collection = jb5.b(collection, b2.b(uq4, oz4));
        }
        if (collection == null) {
            return g42.w;
        }
        return collection;
    }

    public final Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ji4 c2 : this.c) {
            it0.h0(linkedHashSet, c2.c());
        }
        return linkedHashSet;
    }

    public final Set d() {
        Iterable iterable;
        ji4[] ji4Arr = this.c;
        ji4Arr.getClass();
        if (ji4Arr.length == 0) {
            iterable = a42.w;
        } else {
            iterable = new ss(0, ji4Arr);
        }
        return h03.k(iterable);
    }

    public final vq0 e(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        vq0 vq0 = null;
        for (ji4 e : this.c) {
            vq0 e2 = e.e(uq4, oz4);
            if (e2 != null) {
                if (!(e2 instanceof wq0) || !((zh4) e2).H()) {
                    return e2;
                }
                if (vq0 == null) {
                    vq0 = e2;
                }
            }
        }
        return vq0;
    }

    public final Collection f(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        ji4[] ji4Arr = this.c;
        int length = ji4Arr.length;
        if (length == 0) {
            return a42.w;
        }
        if (length == 1) {
            return ji4Arr[0].f(uq4, oz4);
        }
        Collection collection = null;
        for (ji4 f : ji4Arr) {
            collection = jb5.b(collection, f.f(uq4, oz4));
        }
        if (collection == null) {
            return g42.w;
        }
        return collection;
    }

    public final Set g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ji4 g : this.c) {
            it0.h0(linkedHashSet, g.g());
        }
        return linkedHashSet;
    }

    public final String toString() {
        return this.b;
    }
}
