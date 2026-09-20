package defpackage;

import java.util.List;

/* renamed from: xz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xz extends ea1 {
    public final String a;
    public final int b;
    public final List c;

    public xz(String str, int i, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ea1) {
            xz xzVar = (xz) ((ea1) obj);
            if (!this.a.equals(xzVar.a) || this.b != xzVar.b || !this.c.equals(xzVar.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}
