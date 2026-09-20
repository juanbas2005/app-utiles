package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* renamed from: p64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p64 extends iq6 implements dg3 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;

    public p64(List list, List list2, long j, long j2) {
        this.c = list;
        this.d = list2;
        this.e = j;
        this.f = j2;
    }

    public final Object b(p64 p64, float f2) {
        if (p64 == null) {
            p64 = new ky6(jt0.f);
        }
        boolean z = p64 instanceof ky6;
        List list = this.c;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((jt0) list.get(i)).getClass();
                arrayList.add(new jt0(((ky6) p64).a));
            }
            p64 = new p64(arrayList, this.d, this.e, this.f);
        }
        if (!(p64 instanceof p64)) {
            return null;
        }
        p64 p642 = (p64) p64;
        return new p64(mp7.c0(list, p642.c, f2), mp7.d0(this.d, p642.d, f2), mp7.e0(this.e, p642.e, f2), mp7.e0(this.f, p642.f, f2));
    }

    public final Shader c(long j) {
        float[] fArr;
        long j2 = this.e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i4);
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat2)) & 4294967295L);
        long floatToRawIntBits2 = (((long) Float.floatToRawIntBits(intBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat4)) & 4294967295L);
        List list = this.c;
        List list2 = this.d;
        b96.S(list, list2);
        if (Build.VERSION.SDK_INT >= 29) {
            int size = list.size();
            long[] jArr = new long[size];
            for (int i5 = 0; i5 < size; i5++) {
                jArr[i5] = gl0.i0(((jt0) list.get(i5)).a);
            }
            if (list2 != null) {
                fArr = dt0.Z0(list2);
            } else {
                fArr = null;
            }
            return ww2.a.a(floatToRawIntBits, floatToRawIntBits2, jArr, fArr, 0);
        }
        int l = b96.l(list);
        return new LinearGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L)), b96.F(l, list), b96.G(list2, list, l), pd8.G(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p64)) {
            return false;
        }
        p64 p64 = (p64) obj;
        if (this.c.equals(p64.c) && sg3.e(this.d, p64.d) && l35.b(this.e, p64.e) && l35.b(this.f, p64.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.c.hashCode() * 31;
        List list = this.d;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return Integer.hashCode(0) + pb4.b(pb4.b((hashCode + i) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        String str;
        long j = this.e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & -9223372034707292160L) == 0) {
            str = f21.h("start=", l35.g(j), ", ");
        } else {
            str = str2;
        }
        long j2 = this.f;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & -9223372034707292160L) == 0) {
            str2 = f21.h("end=", l35.g(j2), ", ");
        }
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        sb.append(this.d);
        sb.append(", ");
        f21.v(sb, str, str2, "tileMode=", "Clamp");
        sb.append(")");
        return sb.toString();
    }
}
