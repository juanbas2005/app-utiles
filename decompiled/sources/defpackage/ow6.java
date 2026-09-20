package defpackage;

/* renamed from: ow6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ow6 {
    public final String a;
    public final String b;
    public final kw6 c;

    public ow6(String str, String str2, kw6 kw6) {
        this.a = str;
        this.b = str2;
        this.c = kw6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ow6.class != obj.getClass()) {
            return false;
        }
        ow6 ow6 = (ow6) obj;
        if (sg3.e(this.a, ow6.a) && sg3.e(this.b, ow6.b) && this.c == ow6.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + hl6.i((hashCode + i) * 31, 31, false);
    }
}
