package defpackage;

/* renamed from: zg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zg4 {
    public final qt0 a;
    public final br7 b;
    public final gr6 c;
    public final um4 d;

    public zg4(qt0 qt0, br7 br7, gr6 gr6, um4 um4) {
        this.a = qt0;
        this.b = br7;
        this.c = gr6;
        this.d = um4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zg4.class != obj.getClass()) {
            return false;
        }
        zg4 zg4 = (zg4) obj;
        if (sg3.e(this.a, zg4.a) && sg3.e(this.b, zg4.b) && sg3.e(this.c, zg4.c) && sg3.e(this.d, zg4.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Values(colorScheme=" + this.a + ", typography=" + this.b + ", shapes=" + this.c + ", motionScheme=" + this.d + ")";
    }
}
