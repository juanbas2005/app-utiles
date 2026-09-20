package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: fq3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fq3 {
    public static final fq3 j = new fq3((is3) null, (el4) null, (Boolean) null, (yq3) null, a42.w, false, false, false, false);
    public final is3 a;
    public final el4 b;
    public final Boolean c;
    public final yq3 d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public fq3(is3 is3, el4 el4, Boolean bool, yq3 yq3, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = is3;
        this.b = el4;
        this.c = bool;
        this.d = yq3;
        this.e = list;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public static fq3 a(fq3 fq3, is3 is3, el4 el4, Boolean bool, yq3 yq3, List list, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i3 = i2;
        if ((i3 & 1) != 0) {
            is3 = fq3.a;
        }
        is3 is32 = is3;
        if ((i3 & 2) != 0) {
            el4 = fq3.b;
        }
        el4 el42 = el4;
        if ((i3 & 4) != 0) {
            bool = fq3.c;
        }
        Boolean bool2 = bool;
        if ((i3 & 8) != 0) {
            yq3 = fq3.d;
        }
        yq3 yq32 = yq3;
        if ((i3 & 16) != 0) {
            list = fq3.e;
        }
        List list2 = list;
        if ((i3 & 32) != 0) {
            z5 = fq3.f;
        } else {
            z5 = z;
        }
        if ((i3 & 64) != 0) {
            z6 = fq3.g;
        } else {
            z6 = z2;
        }
        if ((i3 & 128) != 0) {
            z7 = fq3.h;
        } else {
            z7 = z3;
        }
        if ((i3 & 256) != 0) {
            z8 = fq3.i;
        } else {
            z8 = z4;
        }
        fq3.getClass();
        list2.getClass();
        return new fq3(is32, el42, bool2, yq32, list2, z5, z6, z7, z8);
    }

    public final is3 b(String str, List list) {
        is3 is3;
        boolean z;
        is3 is32;
        str.getClass();
        is3 g2 = mb2.g(this.e, list);
        is3 is33 = this.a;
        if (g2 != null) {
            if (is33 == null) {
                is3 = is3.c;
            } else {
                is3 = is33;
            }
            Map map = g2.a;
            is3.getClass();
            Map map2 = is3.a;
            if (g2.b || is3.b) {
                z = true;
            } else {
                z = false;
            }
            if (map.isEmpty()) {
                is32 = is3.a(z);
            } else if (map2.isEmpty()) {
                is32 = g2.a(z);
            } else {
                LinkedHashSet B0 = dt0.B0(map.keySet(), map2.keySet());
                if (B0.isEmpty()) {
                    is32 = new is3(sf4.X(map, map2), z);
                } else {
                    ku4.g(f21.m(new StringBuilder("Substitutors must not have intersecting keys: "), dt0.E0(B0, (String) null, (String) null, (String) null, (vr2) null, 63), ". Member: ", str));
                    return null;
                }
            }
            if (is32 != null) {
                return is32;
            }
        }
        if (is33 == null) {
            return is3.c;
        }
        return is33;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq3)) {
            return false;
        }
        fq3 fq3 = (fq3) obj;
        if (sg3.e(this.a, fq3.a) && this.b == fq3.b && sg3.e(this.c, fq3.c) && sg3.e(this.d, fq3.d) && this.e.equals(fq3.e) && this.f == fq3.f && this.g == fq3.g && this.h == fq3.h && this.i == fq3.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        is3 is3 = this.a;
        if (is3 == null) {
            i2 = 0;
        } else {
            i2 = is3.hashCode();
        }
        int i6 = i2 * 31;
        el4 el4 = this.b;
        if (el4 == null) {
            i3 = 0;
        } else {
            i3 = el4.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        Boolean bool = this.c;
        if (bool == null) {
            i4 = 0;
        } else {
            i4 = bool.hashCode();
        }
        int i8 = (i7 + i4) * 31;
        yq3 yq3 = this.d;
        if (yq3 != null) {
            i5 = yq3.hashCode();
        }
        return Boolean.hashCode(this.i) + hl6.i(hl6.i(hl6.i(hl6.j(this.e, (i8 + i5) * 31, 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        return "KCallableOverriddenStorage(classTypeParametersSubstitutor=" + this.a + ", modality=" + this.b + ", isStatic=" + this.c + ", originalContainerIfFakeOverride=" + this.d + ", originalCallableTypeParameters=" + this.e + ", forceIsExternal=" + this.f + ", forceIsOperator=" + this.g + ", forceIsInfix=" + this.h + ", forceIsInline=" + this.i + ')';
    }
}
