package defpackage;

/* renamed from: h4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h4 {
    public final String a;
    public final ds2 b;

    public h4(String str, ds2 ds2) {
        this.a = str;
        this.b = ds2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        if (sg3.e(this.a, h4Var.a) && sg3.e(this.b, h4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        ds2 ds2 = this.b;
        if (ds2 != null) {
            i2 = ds2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ")";
    }
}
