package defpackage;

import java.util.List;

/* renamed from: nm5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nm5 {
    public final boolean a;
    public final List b = a42.w;

    public nm5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm5)) {
            return false;
        }
        nm5 nm5 = (nm5) obj;
        if (this.a == nm5.a && this.b.equals(nm5.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PreReleaseInfo(isInvisible=" + this.a + ", poisoningFeatures=" + this.b + ')';
    }
}
