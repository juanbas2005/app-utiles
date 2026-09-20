package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/* renamed from: lf3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lf3 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final hv2 f;
    public final Optional g;
    public final Optional h;

    public lf3(wz0 wz0) {
        this.a = Collections.unmodifiableSet(new LinkedHashSet((LinkedHashSet) wz0.a));
        this.b = Collections.unmodifiableSet(new LinkedHashSet((LinkedHashSet) wz0.b));
        this.c = Collections.unmodifiableSet(new LinkedHashSet((LinkedHashSet) wz0.c));
        this.d = Collections.unmodifiableSet(new LinkedHashSet((LinkedHashSet) wz0.d));
        this.e = Collections.unmodifiableSet(new LinkedHashSet((LinkedHashSet) wz0.e));
        hv2 hv2 = (hv2) wz0.f;
        Objects.requireNonNull(hv2, "Interfaces must have a private key");
        this.f = hv2;
        this.g = (Optional) wz0.g;
        this.h = (Optional) wz0.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lf3)) {
            return false;
        }
        lf3 lf3 = (lf3) obj;
        if (!this.a.equals(lf3.a) || !this.b.equals(lf3.b) || !this.c.equals(lf3.c) || !this.d.equals(lf3.d) || !this.e.equals(lf3.e) || !this.f.equals(lf3.f) || !this.g.equals(lf3.g) || !this.h.equals(lf3.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.f.hashCode();
        int hashCode5 = this.g.hashCode();
        return this.h.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 31) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(Interface ");
        sb.append(((ns3) this.f.x).d());
        this.g.ifPresent(new kf3(0, sb));
        sb.append(')');
        return sb.toString();
    }
}
