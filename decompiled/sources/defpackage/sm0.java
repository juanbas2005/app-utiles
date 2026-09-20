package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: sm0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sm0 {
    public static final sm0 c = new sm0(dt0.g1(new ArrayList()), (x91) null);
    public final Set a;
    public final x91 b;

    public sm0(Set set, x91 x91) {
        this.a = set;
        this.b = x91;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sm0)) {
            return false;
        }
        sm0 sm0 = (sm0) obj;
        if (!sm0.a.equals(this.a) || !sg3.e(sm0.b, this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() + 1517) * 41;
        x91 x91 = this.b;
        if (x91 != null) {
            i = x91.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
