package defpackage;

import java.util.ArrayList;

/* renamed from: km5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class km5 {
    public final boolean a;
    public final ArrayList b;

    public km5(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (defpackage.km5) r3;
     */
    public final boolean equals(Object obj) {
        km5 km5;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof km5) && this.a == km5.a && this.b.equals(km5.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Posture(isTabletop=");
        sb.append(this.a);
        sb.append(", hinges=[");
        return f21.l(sb, dt0.E0(this.b, ", ", (String) null, (String) null, (vr2) null, 62), "])");
    }
}
