package defpackage;

/* renamed from: xp0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xp0 {
    public final vq4 a;
    public final tr5 b;
    public final n80 c;
    public final sy6 d;

    public xp0(vq4 vq4, tr5 tr5, n80 n80, sy6 sy6) {
        vq4.getClass();
        tr5.getClass();
        sy6.getClass();
        this.a = vq4;
        this.b = tr5;
        this.c = n80;
        this.d = sy6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp0)) {
            return false;
        }
        xp0 xp0 = (xp0) obj;
        if (sg3.e(this.a, xp0.a) && sg3.e(this.b, xp0.b) && this.c.equals(xp0.c) && sg3.e(this.d, xp0.d)) {
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
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
