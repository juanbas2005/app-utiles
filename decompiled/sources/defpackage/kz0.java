package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: kz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kz0 {
    public final lf3 a;
    public final List b;

    public kz0(jz0 jz0) {
        lf3 lf3 = (lf3) jz0.y;
        Objects.requireNonNull(lf3, "An [Interface] section is required");
        this.a = lf3;
        this.b = Collections.unmodifiableList(new ArrayList((ArrayList) jz0.x));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kz0)) {
            return false;
        }
        kz0 kz0 = (kz0) obj;
        if (!this.a.equals(kz0.a) || !this.b.equals(kz0.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(Config " + this.a + " (" + this.b.size() + " peers))";
    }
}
