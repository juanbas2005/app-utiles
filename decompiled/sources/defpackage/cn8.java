package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: cn8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cn8 implements bq8 {
    public final bq8 w;
    public final String x;

    public cn8(String str) {
        this.w = bq8.o;
        this.x = str;
    }

    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cn8)) {
            return false;
        }
        cn8 cn8 = (cn8) obj;
        if (!this.x.equals(cn8.x) || !this.w.equals(cn8.w)) {
            return false;
        }
        return true;
    }

    public final Boolean f() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return this.w.hashCode() + (this.x.hashCode() * 31);
    }

    public final bq8 k(String str, no7 no7, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final Double p() {
        throw new IllegalStateException("Control is not a double");
    }

    public final bq8 v() {
        return new cn8(this.x, this.w.v());
    }

    public cn8(String str, bq8 bq8) {
        this.w = bq8;
        this.x = str;
    }
}
