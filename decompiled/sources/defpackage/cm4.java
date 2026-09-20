package defpackage;

/* renamed from: cm4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cm4 extends xt7 {
    public final ia5 e;

    /* JADX WARNING: Illegal instructions before constructor call */
    public cm4(ia5 ia5) {
        super(r0, r1, r2);
        int i;
        int i2;
        vt7 vt7 = pf8.b;
        if (ia5 == ia5.x) {
            i = 2;
        } else {
            i = 1;
        }
        if (ia5 == ia5.y) {
            i2 = 2;
        } else {
            i2 = null;
        }
        this.e = ia5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cm4) || this.e != ((cm4) obj).e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
