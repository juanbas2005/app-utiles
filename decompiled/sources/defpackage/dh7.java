package defpackage;

/* renamed from: dh7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dh7 {
    public final boolean a;
    public final boolean b;

    public dh7(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh7)) {
            return false;
        }
        dh7 dh7 = (dh7) obj;
        if (this.a == dh7.a && this.b == dh7.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + hl6.i(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ThemeSettings(darkTheme=" + this.a + ", amoledTheme=" + this.b + ", disableDynamicTheming=true)";
    }
}
