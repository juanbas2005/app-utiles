package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: s96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s96 {
    public final List a;
    public final float b;
    public final float c;
    public final n74 d;

    public s96(AbstractList abstractList, float f, float f2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        char c2;
        qc1 qc1;
        qc1 qc12;
        List list;
        char c3;
        AbstractList abstractList2 = abstractList;
        abstractList2.getClass();
        this.a = abstractList2;
        this.b = f;
        this.c = f2;
        n74 m = sg3.m();
        char c4 = 3;
        if (abstractList2.size() <= 0 || ((dc2) abstractList2.get(0)).a.size() != 3) {
            arrayList2 = null;
            arrayList = null;
        } else {
            yb5 d2 = ((qc1) ((dc2) abstractList2.get(0)).a.get(1)).d(0.5f);
            arrayList = sg3.I(((dc2) abstractList2.get(0)).a.get(0), (qc1) d2.w);
            arrayList2 = sg3.I((qc1) d2.x, ((dc2) abstractList2.get(0)).a.get(2));
        }
        int size = abstractList2.size();
        if (size >= 0) {
            int i = 0;
            qc12 = null;
            qc1 = null;
            while (true) {
                if (i == 0 && arrayList2 != null) {
                    list = arrayList2;
                } else if (i != this.a.size()) {
                    list = ((dc2) this.a.get(i)).a;
                } else if (arrayList == null) {
                    c2 = c4;
                    break;
                } else {
                    list = arrayList;
                }
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    qc1 qc13 = (qc1) list.get(i2);
                    if (!qc13.f()) {
                        if (qc1 != null) {
                            m.add(qc1);
                        }
                        c3 = c4;
                        if (qc12 == null) {
                            qc12 = qc13;
                            qc1 = qc12;
                        } else {
                            qc1 = qc13;
                        }
                    } else {
                        c3 = c4;
                        if (qc1 != null) {
                            float[] fArr = qc1.a;
                            fArr[6] = qc13.a();
                            fArr[7] = qc13.b();
                        }
                    }
                    i2++;
                    c4 = c3;
                }
                c2 = c4;
                if (i == size) {
                    break;
                }
                i++;
                c4 = c2;
            }
        } else {
            c2 = 3;
            qc12 = null;
            qc1 = null;
        }
        if (!(qc1 == null || qc12 == null)) {
            float[] fArr2 = qc1.a;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            float f5 = fArr2[2];
            float f6 = fArr2[c2];
            float f7 = fArr2[4];
            float f8 = fArr2[5];
            float[] fArr3 = qc12.a;
            m.add(h03.b(f3, f4, f5, f6, f7, f8, fArr3[0], fArr3[1]));
        }
        n74 i3 = sg3.i(m);
        this.d = i3;
        Object obj = i3.get(i3.f() - 1);
        int f9 = i3.f();
        int i4 = 0;
        while (i4 < f9) {
            qc1 qc14 = (qc1) this.d.get(i4);
            qc1 qc15 = (qc1) obj;
            if (Math.abs(qc14.a[0] - qc15.a()) > 1.0E-4f || Math.abs(qc14.a[1] - qc15.b()) > 1.0E-4f) {
                h.q("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            } else {
                i4++;
                obj = qc14;
            }
        }
    }

    public static float[] a(s96 s96, float[] fArr, int i) {
        float[] fArr2;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6 = 1;
        char c7 = 4;
        if ((i & 1) != 0) {
            fArr2 = new float[4];
        } else {
            fArr2 = fArr;
        }
        n74 n74 = s96.d;
        if (fArr2.length >= 4) {
            int f = n74.f();
            float f2 = Float.MIN_VALUE;
            char c8 = 0;
            float f3 = Float.MAX_VALUE;
            float f4 = Float.MAX_VALUE;
            int i2 = 0;
            float f5 = Float.MIN_VALUE;
            while (i2 < f) {
                qc1 qc1 = (qc1) n74.get(i2);
                qc1.getClass();
                boolean f6 = qc1.f();
                float[] fArr3 = qc1.a;
                if (f6) {
                    fArr2[c8] = fArr3[c8];
                    fArr2[c6] = fArr3[c6];
                    fArr2[2] = fArr3[c8];
                    fArr2[3] = fArr3[c6];
                    c5 = c6;
                    c2 = c7;
                    c4 = c8;
                    c3 = 2;
                } else {
                    c5 = c6;
                    float min = Math.min(fArr3[c8], qc1.a());
                    c2 = c7;
                    float min2 = Math.min(fArr3[c5], qc1.b());
                    c4 = c8;
                    float max = Math.max(fArr3[c8], qc1.a());
                    float max2 = Math.max(fArr3[c5], qc1.b());
                    c3 = 2;
                    fArr2[c4] = Math.min(min, Math.min(fArr3[2], fArr3[c2]));
                    fArr2[c5] = Math.min(min2, Math.min(fArr3[3], fArr3[5]));
                    fArr2[2] = Math.max(max, Math.max(fArr3[2], fArr3[c2]));
                    fArr2[3] = Math.max(max2, Math.max(fArr3[3], fArr3[5]));
                }
                f3 = Math.min(f3, fArr2[c4]);
                f4 = Math.min(f4, fArr2[c5]);
                f2 = Math.max(f2, fArr2[c3]);
                f5 = Math.max(f5, fArr2[3]);
                i2++;
                c8 = c4;
                c7 = c2;
                c6 = c5;
            }
            fArr2[c8] = f3;
            fArr2[c6] = f4;
            fArr2[2] = f2;
            fArr2[3] = f5;
            return fArr2;
        }
        h.q("Required bounds size of 4");
        return null;
    }

    public final s96 b() {
        float[] a2 = a(this, (float[]) null, 3);
        float f = a2[2] - a2[0];
        float f2 = a2[3] - a2[1];
        float max = Math.max(f, f2);
        return c(new kp0(((max - f) / 2.0f) - a2[0], max, ((max - f2) / 2.0f) - a2[1]));
    }

    public final s96 c(jk5 jk5) {
        long I = jb5.I(mh2.a(this.b, this.c), jk5);
        n74 m = sg3.m();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m.add(((dc2) list.get(i)).a(jk5));
        }
        return new s96(sg3.i(m), jb5.r(I), jb5.s(I));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s96)) {
            return false;
        }
        return sg3.e(this.a, ((s96) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "[RoundedPolygon. Cubics = " + dt0.E0(this.d, (String) null, (String) null, (String) null, (vr2) null, 63) + " || Features = " + dt0.E0(this.a, (String) null, (String) null, (String) null, (vr2) null, 63) + " || Center = (" + this.b + ", " + this.c + ")]";
    }
}
