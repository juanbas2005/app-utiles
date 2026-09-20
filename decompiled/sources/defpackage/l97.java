package defpackage;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l97  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l97 extends iq6 implements dg3 {
    public final long c;
    public final ArrayList d;
    public final List e;

    public l97(long j, ArrayList arrayList, List list) {
        this.c = j;
        this.d = arrayList;
        this.e = list;
    }

    public final Object b(Object obj, float f) {
        if (obj == null) {
            obj = new ky6(jt0.f);
        }
        boolean z = obj instanceof ky6;
        List list = this.e;
        long j = this.c;
        ArrayList arrayList = this.d;
        if (z) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((jt0) arrayList.get(i)).getClass();
                arrayList2.add(new jt0(((ky6) obj).a));
            }
            obj = new l97(j, arrayList2, list);
        }
        if (!(obj instanceof l97)) {
            return null;
        }
        l97 l97 = (l97) obj;
        return new l97(t35.x(j, l97.c, f), mp7.c0(arrayList, l97.d, f), mp7.d0(list, l97.e, f));
    }

    public final Shader c(long j) {
        long j2;
        float[] fArr;
        float f;
        long j3 = this.c;
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            j2 = fb5.k(j);
        } else {
            int i = (int) (j3 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float intBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j3 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                f = Float.intBitsToFloat((int) (j & 4294967295L));
            } else {
                f = Float.intBitsToFloat(i2);
            }
            j2 = (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(intBitsToFloat)) << 32);
        }
        ArrayList arrayList = this.d;
        List list = this.e;
        b96.S(arrayList, list);
        if (Build.VERSION.SDK_INT >= 29) {
            int size = arrayList.size();
            long[] jArr = new long[size];
            for (int i3 = 0; i3 < size; i3++) {
                jArr[i3] = gl0.i0(((jt0) arrayList.get(i3)).a);
            }
            if (list != null) {
                fArr = dt0.Z0(list);
            } else {
                fArr = null;
            }
            return ww2.a.c(j2, jArr, fArr);
        }
        int l = b96.l(arrayList);
        return new SweepGradient(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), b96.F(l, arrayList), b96.G(list, arrayList, l));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l97)) {
            return false;
        }
        l97 l97 = (l97) obj;
        if (l35.b(this.c, l97.c) && this.d.equals(l97.d) && sg3.e(this.e, l97.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31;
        List list = this.e;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        String str;
        long j = this.c;
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = f21.h("center=", l35.g(j), ", ");
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.d + ", stops=" + this.e + ")";
    }
}
