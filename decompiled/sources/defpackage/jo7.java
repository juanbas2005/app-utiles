package defpackage;

/* renamed from: jo7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jo7 implements v02 {
    public final int a;
    public final int b;
    public final i12 c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public jo7(int i, i12 i12, int i2) {
        this(i, 0, (i2 & 4) != 0 ? j12.a : i12);
    }

    public final m38 a(lo7 lo7) {
        return new o21(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jo7) {
            jo7 jo7 = (jo7) obj;
            if (jo7.a == this.a && jo7.b == this.b && sg3.e(jo7.c, this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    public jo7(int i, int i2, i12 i12) {
        this.a = i;
        this.b = i2;
        this.c = i12;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final o38 m51a(lo7 lo7) {
        return new o21(this.a, this.b, this.c);
    }
}
