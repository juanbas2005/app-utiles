package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: n3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class n3 implements wo7 {
    public int w;
    public final eb4 x;

    public n3(kb4 kb4) {
        kb4.getClass();
        this.x = new eb4(kb4, new k3(1, this), new b0(5, this));
    }

    public abstract Collection a();

    public abstract vw3 b();

    public abstract pe2 c();

    /* renamed from: d */
    public final List e() {
        return ((m3) this.x.b()).b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof wo7) && obj.hashCode() == hashCode()) {
            wo7 wo7 = (wo7) obj;
            if (wo7.getParameters().size() == getParameters().size()) {
                vq0 u = u();
                vq0 u2 = wo7.u();
                if (u2 != null && !z62.f(u) && !rs1.m(u) && !z62.f(u2) && !rs1.m(u2)) {
                    return f(u2);
                }
                return false;
            }
        }
        return false;
    }

    public abstract boolean f(vq0 vq0);

    public final int hashCode() {
        int i;
        int i2 = this.w;
        if (i2 != 0) {
            return i2;
        }
        vq0 u = u();
        if (z62.f(u) || rs1.m(u)) {
            i = System.identityHashCode(this);
        } else {
            i = rs1.f(u).a.hashCode();
        }
        this.w = i;
        return i;
    }

    public List h(List list) {
        return list;
    }
}
