package defpackage;

import java.util.Arrays;

/* renamed from: qc1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class qc1 {
    public final float[] a;

    public qc1(float[] fArr) {
        this.a = fArr;
        if (fArr.length != 8) {
            h.q("Points array size should be 8");
            throw null;
        }
    }

    public final float a() {
        return this.a[6];
    }

    public final float b() {
        return this.a[7];
    }

    public final long c(float f) {
        float f2 = 1.0f - f;
        float[] fArr = this.a;
        float f3 = f2 * f2 * f2;
        float f4 = 3.0f * f;
        float f5 = f4 * f2 * f2;
        float f6 = f4 * f * f2;
        float f7 = (fArr[4] * f6) + (fArr[2] * f5) + (fArr[0] * f3);
        float f8 = f * f * f;
        float a2 = (a() * f8) + f7;
        float f9 = (fArr[3] * f5) + (fArr[1] * f3);
        return mh2.a(a2, (b() * f8) + (fArr[5] * f6) + f9);
    }

    public final yb5 d(float f) {
        float f2 = 1.0f - f;
        long c = c(f);
        float[] fArr = this.a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = f2 * f2;
        float f8 = 2.0f * f2 * f;
        float f9 = f * f;
        float f10 = (fArr[4] * f9) + (f5 * f8) + (f3 * f7);
        float f11 = (f6 * f) + (f4 * f2);
        float f12 = (fArr[5] * f9) + (f6 * f8) + (f4 * f7);
        return new yb5(h03.b(f3, f4, (f5 * f) + (f3 * f2), f11, f10, f12, jb5.r(c), jb5.s(c)), h03.b(jb5.r(c), jb5.s(c), (a() * f9) + (fArr[4] * f8) + (fArr[2] * f7), (b() * f9) + (fArr[5] * f8) + (fArr[3] * f7), (a() * f) + (fArr[4] * f2), (b() * f) + (fArr[5] * f2), a(), b()));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [uo4, qc1] */
    public final uo4 e(jk5 jk5) {
        float[] fArr = new float[8];
        ? qc1 = new qc1(fArr);
        float[] fArr2 = this.a;
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        qc1.g(jk5, 0);
        qc1.g(jk5, 2);
        qc1.g(jk5, 4);
        qc1.g(jk5, 6);
        return qc1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc1)) {
            return false;
        }
        return Arrays.equals(this.a, ((qc1) obj).a);
    }

    public final boolean f() {
        float[] fArr = this.a;
        if (Math.abs(fArr[0] - a()) >= 1.0E-4f || Math.abs(fArr[1] - b()) >= 1.0E-4f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("anchor0: (");
        float[] fArr = this.a;
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(") control0: (");
        sb.append(fArr[2]);
        sb.append(", ");
        sb.append(fArr[3]);
        sb.append("), control1: (");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("), anchor1: (");
        sb.append(a());
        sb.append(", ");
        sb.append(b());
        sb.append(')');
        return sb.toString();
    }
}
