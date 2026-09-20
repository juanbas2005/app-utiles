package defpackage;

import java.util.ArrayList;

/* renamed from: rr8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rr8 implements vr8 {
    public final ArrayList a;

    public rr8(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rr8) && this.a.equals(((rr8) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(arrayList).length() + 17);
        sb.append("Loaded(licenses=");
        sb.append(arrayList);
        sb.append(")");
        return sb.toString();
    }
}
