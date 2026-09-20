package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: ll1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ll1 {
    public final List a;
    public final float[] b;
    public final int c;

    public ll1(List list, float[] fArr) {
        this.a = list;
        this.b = fArr;
        if (list.size() != fArr.length) {
            List m1 = qs.m1(fArr);
            bc3.a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + m1);
        }
        this.c = fArr.length;
    }

    public final Object a(float f) {
        float[] fArr = this.b;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float abs = Math.abs(f - fArr[i]);
            if (abs <= f2) {
                i2 = i3;
                f2 = abs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    public final Object b(float f, boolean z) {
        float f2;
        float[] fArr = this.b;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f3 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f4 = fArr[i];
            int i4 = i3 + 1;
            if (z) {
                f2 = f4 - f;
            } else {
                f2 = f - f4;
            }
            if (f2 < 0.0f) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if (f2 <= f3) {
                i2 = i3;
                f3 = f2;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    public final float c(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.b;
        if (indexOf < fArr.length) {
            return fArr[indexOf];
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll1)) {
            return false;
        }
        ll1 ll1 = (ll1) obj;
        if (sg3.e(this.a, ll1.a) && Arrays.equals(this.b, ll1.b) && this.c == ll1.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + this.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e A[SYNTHETIC] */
    public final String toString() {
        float f;
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.c;
            if (i < i2) {
                Object z0 = dt0.z0(i, this.a);
                if (i >= 0) {
                    float[] fArr = this.b;
                    if (i < fArr.length) {
                        f = fArr[i];
                        sb.append(z0 + "=" + f);
                        if (i >= i2 - 1) {
                            sb.append(", ");
                        }
                        i++;
                    }
                }
                f = Float.NaN;
                sb.append(z0 + "=" + f);
                if (i >= i2 - 1) {
                }
                i++;
            } else {
                sb.append("})");
                return sb.toString();
            }
        }
    }
}
