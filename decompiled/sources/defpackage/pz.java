package defpackage;

/* renamed from: pz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pz extends z91 {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public pz(int i2, String str, int i3, long j, long j2, boolean z, int i4, String str2, String str3) {
        this.a = i2;
        this.b = str;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i4;
        this.h = str2;
        this.i = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r8 = (defpackage.pz) ((defpackage.z91) r8);
     */
    public final boolean equals(Object obj) {
        pz pzVar;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof z91) && this.a == pzVar.a && this.b.equals(pzVar.b) && this.c == pzVar.c && this.d == pzVar.d && this.e == pzVar.e && this.f == pzVar.f && this.g == pzVar.g && this.h.equals(pzVar.h) && this.i.equals(pzVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        long j = this.d;
        long j2 = this.e;
        int hashCode = (((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return this.i.hashCode() ^ ((((((hashCode ^ i2) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", cores=");
        sb.append(this.c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", simulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return f21.l(sb, this.i, "}");
    }
}
