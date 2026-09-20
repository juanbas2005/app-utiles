package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* renamed from: t62  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class t62 implements ji4 {
    public final String b;

    public t62(u62 u62, String... strArr) {
        String str = u62.w;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.b = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public Collection a(is1 is1, vr2 vr2) {
        is1.getClass();
        return a42.w;
    }

    public Set c() {
        return g42.w;
    }

    public Set d() {
        return g42.w;
    }

    public vq0 e(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        oz4.getClass();
        return new j62(uq4.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{uq4}, 1))));
    }

    public Set g() {
        return g42.w;
    }

    /* renamed from: h */
    public Set b(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        j62 j62 = z62.c;
        j62.getClass();
        au6 au6 = new au6(j62, (au6) null, me6.x, uq4.g("<Error function>"), 1, sy6.j);
        v62 c = z62.c(x62.A, new String[0]);
        fl4 fl4 = fl4.z;
        us1 us1 = vs1.e;
        a42 a42 = a42.w;
        au6.k1((qz3) null, (qz3) null, a42, a42, a42, c, fl4, us1);
        return wn6.w(au6);
    }

    /* renamed from: i */
    public Set f(uq4 uq4, oz4 oz4) {
        uq4.getClass();
        return z62.f;
    }

    public String toString() {
        return hl6.o(new StringBuilder("ErrorScope{"), this.b, '}');
    }
}
