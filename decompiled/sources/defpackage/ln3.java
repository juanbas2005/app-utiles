package defpackage;

import java.util.Map;

/* renamed from: ln3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ln3 {
    public final x46 a;
    public final x46 b;
    public final Map c = b42.w;
    public final boolean d;

    public ln3(x46 x46, x46 x462) {
        boolean z;
        this.a = x46;
        this.b = x462;
        new z97(new k3(28, this));
        x46 x463 = x46.IGNORE;
        if (x46 == x463 && x462 == x463) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln3)) {
            return false;
        }
        ln3 ln3 = (ln3) obj;
        if (this.a == ln3.a && this.b == ln3.b && this.c.equals(ln3.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        x46 x46 = this.b;
        if (x46 == null) {
            i = 0;
        } else {
            i = x46.hashCode();
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}
