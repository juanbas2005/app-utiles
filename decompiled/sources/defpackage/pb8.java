package defpackage;

import java.util.List;

/* renamed from: pb8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pb8 {
    public final List a;

    public pb8(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !pb8.class.equals(obj.getClass())) {
            return false;
        }
        return this.a.equals(((pb8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dt0.E0(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", (vr2) null, 56);
    }
}
