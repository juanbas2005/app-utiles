package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: gq8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gq8 implements bq8 {
    public final String w;
    public final ArrayList x;

    public gq8(String str, ArrayList arrayList) {
        this.w = str;
        ArrayList arrayList2 = new ArrayList();
        this.x = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq8)) {
            return false;
        }
        gq8 gq8 = (gq8) obj;
        String str = gq8.w;
        String str2 = this.w;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.x.equals(gq8.x);
        }
        return false;
    }

    public final Boolean f() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        int i;
        String str = this.w;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.x.hashCode() + (i * 31);
    }

    public final bq8 k(String str, no7 no7, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final Double p() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final bq8 v() {
        return this;
    }
}
