package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bc8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bc8 {
    public static final /* synthetic */ int c = 0;
    public final int a;
    public final int b;

    static {
        hr2 hr2 = new hr2(15);
        List E = sg3.E(0, 600, 840);
        ArrayList M0 = dt0.M0(E, sg3.E(1200, 1600));
        List E2 = sg3.E(0, 480, 900);
        hr2.j(hr2, E, E2);
        hr2.j(hr2, M0, E2);
    }

    public bc8(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0) {
            ta1.k(i, 46, "Expected minWidthDp to be at least 0, minWidthDp: ");
            throw null;
        } else if (i2 < 0) {
            ta1.k(i2, 46, "Expected minHeightDp to be at least 0, minHeightDp: ");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bc8.class != obj.getClass()) {
            return false;
        }
        bc8 bc8 = (bc8) obj;
        if (this.a == bc8.a && this.b == bc8.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb.append(this.a);
        sb.append(", minHeightDp=");
        return f21.j(sb, this.b, ')');
    }
}
