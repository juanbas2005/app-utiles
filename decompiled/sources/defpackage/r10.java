package defpackage;

import android.os.Build;

/* renamed from: r10  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r10 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;

    public r10(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.a = i;
        if (str != null) {
            this.b = i2;
            this.c = j;
            this.d = j2;
            this.e = z;
            this.f = i3;
            if (str2 == null) {
                ku4.j("Null manufacturer");
                throw null;
            } else if (str3 == null) {
                ku4.j("Null modelClass");
                throw null;
            }
        } else {
            ku4.j("Null model");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r10)) {
            return false;
        }
        r10 r10 = (r10) obj;
        if (this.a != r10.a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.b != r10.b || this.c != r10.c || this.d != r10.d || this.e != r10.e || this.f != r10.f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        if (str3.equals(str3)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.c;
        long j2 = this.d;
        int hashCode = (((((((((this.a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.b) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.e) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((this.f ^ ((hashCode ^ i) * 1000003)) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.b);
        sb.append(", totalRam=");
        sb.append(this.c);
        sb.append(", diskSpace=");
        sb.append(this.d);
        sb.append(", isEmulator=");
        sb.append(this.e);
        sb.append(", state=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return f21.l(sb, Build.PRODUCT, "}");
    }
}
