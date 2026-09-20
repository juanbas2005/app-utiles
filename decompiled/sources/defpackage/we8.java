package defpackage;

import java.util.List;

/* renamed from: we8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class we8 implements ll6 {
    public final String a;
    public final ll6 b;

    public we8(String str, ll6 ll6) {
        ll6.getClass();
        this.a = str;
        this.b = ll6;
    }

    public final String a() {
        return this.a;
    }

    public final boolean c() {
        return this.b.c();
    }

    public final int d(String str) {
        str.getClass();
        return this.b.d(str);
    }

    public final int e() {
        return this.b.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we8)) {
            return false;
        }
        we8 we8 = (we8) obj;
        if (!this.a.equals(we8.a) || !sg3.e(this.b, we8.b)) {
            return false;
        }
        return true;
    }

    public final String f(int i) {
        return this.b.f(i);
    }

    public final List g(int i) {
        return this.b.g(i);
    }

    public final List getAnnotations() {
        return this.b.getAnnotations();
    }

    public final ll6 h(int i) {
        return this.b.h(i);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final boolean i(int i) {
        return this.b.i(i);
    }

    public final boolean j() {
        return this.b.j();
    }

    public final String toString() {
        return fb5.v(this);
    }

    public final n85 u() {
        return this.b.u();
    }
}
