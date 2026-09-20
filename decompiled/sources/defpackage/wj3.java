package defpackage;

import java.util.Set;

/* renamed from: wj3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wj3 {
    public final fq7 a;
    public final xj3 b;
    public final boolean c;
    public final boolean d;
    public final Set e;
    public final fu6 f;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ wj3(fq7 fq7, boolean z, boolean z2, Set set, int i) {
        this(fq7, xj3.w, r5, r6, (i & 16) != 0 ? null : set, (fu6) null);
        boolean z3;
        boolean z4;
        if ((i & 4) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 8) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
    }

    public static wj3 a(wj3 wj3, xj3 xj3, boolean z, Set set, fu6 fu6, int i) {
        fq7 fq7 = wj3.a;
        if ((i & 2) != 0) {
            xj3 = wj3.b;
        }
        xj3 xj32 = xj3;
        if ((i & 4) != 0) {
            z = wj3.c;
        }
        boolean z2 = z;
        boolean z3 = wj3.d;
        if ((i & 16) != 0) {
            set = wj3.e;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            fu6 = wj3.f;
        }
        wj3.getClass();
        fq7.getClass();
        xj32.getClass();
        return new wj3(fq7, xj32, z2, z3, set2, fu6);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wj3)) {
            return false;
        }
        wj3 wj3 = (wj3) obj;
        if (sg3.e(wj3.f, this.f) && wj3.a == this.a && wj3.b == this.b && wj3.c == this.c && wj3.d == this.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        fu6 fu6 = this.f;
        if (fu6 != null) {
            i = fu6.hashCode();
        } else {
            i = 0;
        }
        int hashCode = this.a.hashCode() + (i * 31) + i;
        int hashCode2 = this.b.hashCode() + (hashCode * 31) + hashCode;
        int i2 = (hashCode2 * 31) + (this.c ? 1 : 0) + hashCode2;
        return (i2 * 31) + (this.d ? 1 : 0) + i2;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.a + ", flexibility=" + this.b + ", isRaw=" + this.c + ", isForAnnotationParameter=" + this.d + ", visitedTypeParameters=" + this.e + ", defaultType=" + this.f + ')';
    }

    public wj3(fq7 fq7, xj3 xj3, boolean z, boolean z2, Set set, fu6 fu6) {
        this.a = fq7;
        this.b = xj3;
        this.c = z;
        this.d = z2;
        this.e = set;
        this.f = fu6;
    }
}
