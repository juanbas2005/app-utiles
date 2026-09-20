package defpackage;

import java.util.List;
import java.util.Objects;

/* renamed from: r99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r99 {
    public final boolean a;
    public final List b;
    public final vk8 c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final n69 k;

    public r99(boolean z, q93 q93, vk8 vk8, String str, String str2, q93 q932, q93 q933, boolean z2, boolean z3, boolean z4, n69 n69) {
        q93.getClass();
        vk8.getClass();
        str.getClass();
        str2.getClass();
        q932.getClass();
        q933.getClass();
        n69.getClass();
        this.a = z;
        this.b = q93;
        this.c = vk8;
        this.d = str;
        this.e = str2;
        this.f = q932;
        this.g = q933;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = n69;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r99)) {
            return false;
        }
        r99 r99 = (r99) obj;
        if (this.a == r99.a && sg3.e(this.b, r99.b) && sg3.e(this.c, r99.c) && sg3.e(this.d, r99.d) && sg3.e(this.e, r99.e) && sg3.e(this.f, r99.f) && sg3.e(this.g, r99.g) && this.h == r99.h && this.i == r99.i && this.j == r99.j && sg3.e(this.k, r99.k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    public final String toString() {
        boolean z = this.a;
        int length = String.valueOf(z).length();
        List list = this.b;
        int length2 = String.valueOf(list).length();
        vk8 vk8 = this.c;
        int length3 = String.valueOf(vk8).length();
        String str = this.d;
        int length4 = String.valueOf(str).length();
        String str2 = this.e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.g;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.h;
        int length8 = String.valueOf(z2).length();
        int i2 = length;
        boolean z3 = this.i;
        int length9 = String.valueOf(z3).length();
        int i3 = length2;
        boolean z4 = this.j;
        int length10 = String.valueOf(z4).length();
        n69 n69 = this.k;
        StringBuilder sb = new StringBuilder(i2 + 59 + i3 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(n69).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(vk8);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(n69);
        sb.append(")");
        return sb.toString();
    }
}
