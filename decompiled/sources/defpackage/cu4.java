package defpackage;

import java.util.Map;

/* renamed from: cu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cu4 {
    public final Object a;
    public final Object b;
    public final Map c;
    public final fw0 d;

    public cu4(Object obj, Object obj2, Map map, fw0 fw0) {
        this.a = obj;
        this.b = obj2;
        this.c = map;
        this.d = fw0;
    }

    public final void a(int i, yt2 yt2) {
        int i2;
        boolean z;
        int i3;
        yt2.g0(295512821);
        if ((i & 6) == 0) {
            if (yt2.g(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i2 & 1, z)) {
            this.d.u(this.a, yt2, 0);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ob3(i, 3, (Object) this);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cu4.class != obj.getClass()) {
            return false;
        }
        cu4 cu4 = (cu4) obj;
        if (!sg3.e(this.a, cu4.a) || !sg3.e(this.b, cu4.b) || !sg3.e(this.c, cu4.c) || this.d != cu4.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + hashCode;
    }

    public final String toString() {
        return "NavEntry(key=" + this.a + ", contentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + ')';
    }

    public cu4(cu4 cu4, fw0 fw0) {
        this(cu4.a, cu4.b, cu4.c, fw0);
    }
}
