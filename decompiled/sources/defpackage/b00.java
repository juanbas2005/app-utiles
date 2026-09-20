package defpackage;

/* renamed from: b00  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b00 extends ga1 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public b00(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ga1) {
            b00 b00 = (b00) ((ga1) obj);
            if (this.a.equals(b00.a) && this.b == b00.b && this.c == b00.c && this.d == b00.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ hashCode;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", defaultProcess=" + this.d + "}";
    }
}
