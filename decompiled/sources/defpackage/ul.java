package defpackage;

/* renamed from: ul  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ul {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public ul(int i, int i2, Object obj, String str) {
        boolean z;
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            zb3.a("Reversed range is not supported");
        }
    }

    public static ul a(ul ulVar, rl rlVar, int i, int i2) {
        Object obj = rlVar;
        if ((i2 & 1) != 0) {
            obj = ulVar.a;
        }
        int i3 = ulVar.b;
        if ((i2 & 4) != 0) {
            i = ulVar.c;
        }
        String str = ulVar.d;
        ulVar.getClass();
        return new ul(i3, i, obj, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul)) {
            return false;
        }
        ul ulVar = (ul) obj;
        if (sg3.e(this.a, ulVar.a) && this.b == ulVar.b && this.c == ulVar.c && sg3.e(this.d, ulVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return this.d.hashCode() + f21.e(this.c, f21.e(this.b, i * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public ul(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
