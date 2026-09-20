package defpackage;

import java.util.List;

/* renamed from: w51  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w51 implements ll6 {
    public final nl6 a;
    public final gq3 b;
    public final String c;

    public w51(nl6 nl6, gq3 gq3) {
        gq3.getClass();
        this.a = nl6;
        this.b = gq3;
        this.c = nl6.a + '<' + gq3.A() + '>';
    }

    public final String a() {
        return this.c;
    }

    public final boolean c() {
        return false;
    }

    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    public final int e() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        w51 w51;
        if (obj instanceof w51) {
            w51 = (w51) obj;
        } else {
            w51 = null;
        }
        if (w51 != null && this.a.equals(w51.a) && sg3.e(w51.b, this.b)) {
            return true;
        }
        return false;
    }

    public final String f(int i) {
        return this.a.f[i];
    }

    public final List g(int i) {
        return this.a.h[i];
    }

    public final List getAnnotations() {
        return this.a.d;
    }

    public final ll6 h(int i) {
        return this.a.g[i];
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final boolean i(int i) {
        return this.a.i[i];
    }

    public final boolean j() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }

    public final n85 u() {
        return this.a.b;
    }
}
