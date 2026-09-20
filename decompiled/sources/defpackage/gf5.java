package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/* renamed from: gf5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gf5 {
    public final Set a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final ns3 e;

    public gf5(o9 o9Var) {
        this.a = Collections.unmodifiableSet(new LinkedHashSet((LinkedHashSet) o9Var.x));
        this.b = (Optional) o9Var.y;
        this.c = (Optional) o9Var.z;
        this.d = (Optional) o9Var.A;
        ns3 ns3 = (ns3) o9Var.B;
        Objects.requireNonNull(ns3, "Peers must have a public key");
        this.e = ns3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gf5)) {
            return false;
        }
        gf5 gf5 = (gf5) obj;
        if (!this.a.equals(gf5.a) || !this.b.equals(gf5.b) || !this.c.equals(gf5.c) || !this.d.equals(gf5.d) || !this.e.equals(gf5.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        return this.e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 31) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(Peer ");
        sb.append(this.e.d());
        this.b.ifPresent(new kf3(2, sb));
        sb.append(')');
        return sb.toString();
    }
}
