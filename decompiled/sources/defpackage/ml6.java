package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: ml6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ml6 implements ll6, nh0 {
    public final ll6 a;
    public final String b;
    public final Set c;

    public ml6(ll6 ll6) {
        ll6.getClass();
        this.a = ll6;
        this.b = ll6.a() + '?';
        this.c = uq3.k(ll6);
    }

    public final String a() {
        return this.b;
    }

    public final Set b() {
        return this.c;
    }

    public final boolean c() {
        return true;
    }

    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml6)) {
            return false;
        }
        if (!sg3.e(this.a, ((ml6) obj).a)) {
            return false;
        }
        return true;
    }

    public final String f(int i) {
        return this.a.f(i);
    }

    public final List g(int i) {
        return this.a.g(i);
    }

    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    public final ll6 h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final boolean i(int i) {
        return this.a.i(i);
    }

    public final boolean j() {
        return this.a.j();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }

    public final n85 u() {
        return this.a.u();
    }
}
