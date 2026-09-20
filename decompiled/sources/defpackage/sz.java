package defpackage;

import java.util.List;

/* renamed from: sz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sz extends ha1 {
    public final tz a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final ga1 e;
    public final List f;
    public final int g;

    public sz(tz tzVar, List list, List list2, Boolean bool, ga1 ga1, List list3, int i) {
        this.a = tzVar;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = ga1;
        this.f = list3;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ha1)) {
            return false;
        }
        sz szVar = (sz) ((ha1) obj);
        if (!this.a.equals(szVar.a)) {
            return false;
        }
        List list = szVar.b;
        List list2 = this.b;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        List list3 = szVar.c;
        List list4 = this.c;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        Boolean bool = szVar.d;
        Boolean bool2 = this.d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        ga1 ga1 = szVar.e;
        ga1 ga12 = this.e;
        if (ga12 == null) {
            if (ga1 != null) {
                return false;
            }
        } else if (!ga12.equals(ga1)) {
            return false;
        }
        List list5 = szVar.f;
        List list6 = this.f;
        if (list6 == null) {
            if (list5 != null) {
                return false;
            }
        } else if (!list6.equals(list5)) {
            return false;
        }
        if (this.g == szVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i5 = 0;
        List list = this.b;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        List list2 = this.c;
        if (list2 == null) {
            i2 = 0;
        } else {
            i2 = list2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        Boolean bool = this.d;
        if (bool == null) {
            i3 = 0;
        } else {
            i3 = bool.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        ga1 ga1 = this.e;
        if (ga1 == null) {
            i4 = 0;
        } else {
            i4 = ga1.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        List list3 = this.f;
        if (list3 != null) {
            i5 = list3.hashCode();
        }
        return this.g ^ ((i9 ^ i5) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return hl6.n(sb, this.g, "}");
    }
}
