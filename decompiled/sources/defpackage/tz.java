package defpackage;

import java.util.List;

/* renamed from: tz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tz extends fa1 {
    public final List a;
    public final ba1 b;
    public final t91 c;
    public final wz d;
    public final List e;

    public tz(List list, vz vzVar, t91 t91, wz wzVar, List list2) {
        this.a = list;
        this.b = vzVar;
        this.c = t91;
        this.d = wzVar;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fa1)) {
            return false;
        }
        fa1 fa1 = (fa1) obj;
        List list = this.a;
        if (list == null) {
            if (((tz) fa1).a != null) {
                return false;
            }
        } else if (!list.equals(((tz) fa1).a)) {
            return false;
        }
        ba1 ba1 = this.b;
        if (ba1 == null) {
            if (((tz) fa1).b != null) {
                return false;
            }
        } else if (!ba1.equals(((tz) fa1).b)) {
            return false;
        }
        t91 t91 = this.c;
        if (t91 == null) {
            if (((tz) fa1).c != null) {
                return false;
            }
        } else if (!t91.equals(((tz) fa1).c)) {
            return false;
        }
        tz tzVar = (tz) fa1;
        if (!this.d.equals(tzVar.d) || !this.e.equals(tzVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        List list = this.a;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        ba1 ba1 = this.b;
        if (ba1 == null) {
            i2 = 0;
        } else {
            i2 = ba1.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        t91 t91 = this.c;
        if (t91 != null) {
            i3 = t91.hashCode();
        }
        return this.e.hashCode() ^ ((((i3 ^ i5) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
