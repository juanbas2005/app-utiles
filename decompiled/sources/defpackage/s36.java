package defpackage;

import java.util.Arrays;

/* renamed from: s36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s36 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final ll4 g;

    public s36(long j, long j2, long j3, long j4, long j5, float[] fArr, ll4 ll4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = ll4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065 A[RETURN] */
    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && s36.class == obj.getClass()) {
                s36 s36 = (s36) obj;
                if (this.a == s36.a && this.b == s36.b && this.e == s36.e && oe3.a(this.c, s36.c) && oe3.a(this.d, s36.d)) {
                    float[] fArr = s36.f;
                    float[] fArr2 = this.f;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            z = true;
                            if (z && this.g.equals(s36.g)) {
                                return true;
                            }
                        }
                    } else if (fArr != null) {
                        z = fArr2.equals(fArr);
                        if (z && this.g.equals(s36.g)) {
                        }
                    }
                    z = false;
                    if (z && this.g.equals(s36.g)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int b2 = pb4.b(pb4.b(pb4.b(pb4.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        } else {
            i = 0;
        }
        return this.g.hashCode() + ((b2 + i) * 31);
    }
}
