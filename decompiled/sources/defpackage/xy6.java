package defpackage;

/* renamed from: xy6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xy6 extends hc2 {
    public final u83 a;
    public final String b;
    public final pe1 c;

    public xy6(u83 u83, String str, pe1 pe1) {
        this.a = u83;
        this.b = str;
        this.c = pe1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy6)) {
            return false;
        }
        xy6 xy6 = (xy6) obj;
        if (!this.a.equals(xy6.a) || !sg3.e(this.b, xy6.b) || this.c != xy6.c) {
            return false;
        }
        return true;
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
        return this.c.hashCode() + ((hashCode + i) * 31);
    }
}
