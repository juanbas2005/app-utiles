package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: km8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class km8 implements bq8 {
    public final boolean w;

    public km8(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.w = booleanValue;
    }

    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof km8) && this.w == ((km8) obj).w) {
            return true;
        }
        return false;
    }

    public final Boolean f() {
        return Boolean.valueOf(this.w);
    }

    public final String g() {
        return Boolean.toString(this.w);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.w).hashCode();
    }

    public final bq8 k(String str, no7 no7, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z = this.w;
        if (equals) {
            return new mq8(Boolean.toString(z));
        }
        String bool = Boolean.toString(z);
        throw new IllegalArgumentException(bool + "." + str + " is not a function.");
    }

    public final Double p() {
        double d;
        if (true != this.w) {
            d = 0.0d;
        } else {
            d = 1.0d;
        }
        return Double.valueOf(d);
    }

    public final String toString() {
        return String.valueOf(this.w);
    }

    public final bq8 v() {
        return new km8(Boolean.valueOf(this.w));
    }
}
