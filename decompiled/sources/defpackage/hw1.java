package defpackage;

import java.util.ArrayList;

/* renamed from: hw1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hw1 extends ll4 implements gz1 {
    public wz0 K;

    public final void N0() {
        this.K.getClass();
    }

    public final void O0() {
        wz0 wz0 = this.K;
        wz0.h();
        wz0.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hw1) && sg3.e(this.K, ((hw1) obj).K)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.K.hashCode();
    }

    public final void p0(wy3 wy3) {
        ArrayList arrayList = (ArrayList) this.K.h;
        if (arrayList.size() <= 0) {
            wy3.a();
        } else {
            f21.u(arrayList.get(0));
            throw null;
        }
    }

    public final String toString() {
        wz0 wz0 = this.K;
        return "DisplayingDisappearingItemsNode(animator=" + wz0 + ")";
    }
}
