package defpackage;

import java.util.List;

/* renamed from: sg0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sg0 implements og0 {
    public List a;

    public final boolean a(jc6 jc6) {
        for (xg0 n : this.a) {
            if (v.n(n, jc6)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "not(" + this.a + ")";
    }
}
