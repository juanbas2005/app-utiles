package defpackage;

/* renamed from: rz  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rz extends na1 {
    public final long a;
    public final String b;
    public final ha1 c;
    public final ia1 d;
    public final ja1 e;
    public final ma1 f;

    public rz(long j, String str, ha1 ha1, ia1 ia1, ja1 ja1, ma1 ma1) {
        this.a = j;
        this.b = str;
        this.c = ha1;
        this.d = ia1;
        this.e = ja1;
        this.f = ma1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qz, java.lang.Object] */
    public final qz a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof na1) {
            rz rzVar = (rz) ((na1) obj);
            if (this.a == rzVar.a && this.b.equals(rzVar.b) && this.c.equals(rzVar.c) && this.d.equals(rzVar.d)) {
                ja1 ja1 = rzVar.e;
                ja1 ja12 = this.e;
                if (ja12 != null ? ja12.equals(ja1) : ja1 == null) {
                    ma1 ma1 = rzVar.f;
                    ma1 ma12 = this.f;
                    if (ma12 != null ? !ma12.equals(ma1) : ma1 != null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.a;
        int hashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i2 = 0;
        ja1 ja1 = this.e;
        if (ja1 == null) {
            i = 0;
        } else {
            i = ja1.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        ma1 ma1 = this.f;
        if (ma1 != null) {
            i2 = ma1.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
