package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pn4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pn4 {
    public final o9 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public pn4(o9 o9Var, long j, int i, int i2) {
        int i3;
        boolean z;
        ly5 ly5;
        int i4;
        int i5;
        int i6;
        float b2;
        int i7;
        o9 o9Var2 = o9Var;
        this.a = o9Var2;
        this.b = i;
        if (!(k31.j(j) == 0 && k31.i(j) == 0)) {
            zb3.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) o9Var2.y;
        int size = arrayList2.size();
        float f2 = 0.0f;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= size) {
                i3 = 0;
                z = false;
                break;
            }
            kc5 kc5 = (kc5) arrayList2.get(i8);
            dh dhVar = kc5.a;
            int h2 = k31.h(j);
            if (k31.c(j)) {
                i4 = i8;
                i5 = k31.g(j) - ((int) ((float) Math.ceil((double) f2)));
                if (i5 < 0) {
                    i5 = 0;
                }
            } else {
                i4 = i8;
                i5 = k31.g(j);
            }
            i3 = 0;
            zg zgVar = new zg(dhVar, this.b - i9, i2, m31.b(0, h2, 0, i5, 5));
            zf7 zf7 = zgVar.d;
            i6 = i9 + zf7.g;
            zg zgVar2 = zgVar;
            b2 = zgVar.b() + f2;
            arrayList.add(new jc5(zgVar2, kc5.b, kc5.c, i9, i6, f2, b2));
            if (zf7.d) {
                break;
            }
            if (i6 == this.b) {
                i7 = i4;
                if (i7 != sg3.x((ArrayList) this.a.y)) {
                    break;
                }
            } else {
                i7 = i4;
            }
            i8 = i7 + 1;
            i9 = i6;
            f2 = b2;
        }
        z = true;
        i9 = i6;
        f2 = b2;
        this.e = f2;
        this.f = i9;
        this.c = z;
        this.h = arrayList;
        this.d = (float) k31.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = i3; i10 < size2; i10++) {
            jc5 jc5 = (jc5) arrayList.get(i10);
            List list = jc5.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i11 = i3; i11 < size3; i11++) {
                ly5 ly52 = (ly5) list.get(i11);
                if (ly52 != null) {
                    ly5 = jc5.a(ly52);
                } else {
                    ly5 = null;
                }
                arrayList4.add(ly5);
            }
            it0.h0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.z).size()) {
            int size4 = ((List) this.a.z).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i12 = i3; i12 < size4; i12++) {
                arrayList5.add((Object) null);
            }
            arrayList3 = dt0.M0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, f06] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, e06] */
    public final void a(long j, float[] fArr) {
        k(lg7.f(j));
        l(lg7.e(j));
        ? obj = new Object();
        obj.w = 0;
        long j2 = j;
        tf4.s(this.h, j2, new ra0(j2, fArr, (f06) obj, (e06) new Object()));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        jc5 jc5 = (jc5) arrayList.get(tf4.q(i, arrayList));
        return jc5.a.d.e(i - jc5.d) + jc5.f;
    }

    public final int c(int i, boolean z) {
        int i2;
        m(i);
        ArrayList arrayList = this.h;
        jc5 jc5 = (jc5) arrayList.get(tf4.q(i, arrayList));
        zg zgVar = jc5.a;
        int i3 = i - jc5.d;
        zf7 zf7 = zgVar.d;
        if (z) {
            Layout layout = zf7.f;
            ThreadLocal threadLocal = dg7.a;
            if (layout.getEllipsisCount(i3) <= 0 || zf7.b != TextUtils.TruncateAt.END) {
                o9 c2 = zf7.c();
                Layout layout2 = (Layout) c2.x;
                i2 = c2.F(layout2.getLineEnd(i3), layout2.getLineStart(i3));
            } else {
                i2 = layout.getEllipsisStart(i3) + layout.getLineStart(i3);
            }
        } else {
            i2 = zf7.f(i3);
        }
        return i2 + jc5.b;
    }

    public final int d(int i) {
        int i2;
        int length = ((vl) this.a.x).x.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            i2 = sg3.x(arrayList);
        } else if (i < 0) {
            i2 = 0;
        } else {
            i2 = tf4.p(i, arrayList);
        }
        jc5 jc5 = (jc5) arrayList.get(i2);
        zg zgVar = jc5.a;
        return zgVar.d.g(jc5.d(i)) + jc5.d;
    }

    public final int e(float f2) {
        int i;
        ArrayList arrayList = this.h;
        jc5 jc5 = (jc5) arrayList.get(tf4.r(arrayList, f2));
        int i2 = jc5.c - jc5.b;
        int i3 = jc5.d;
        if (i2 == 0) {
            return i3;
        }
        zg zgVar = jc5.a;
        float f3 = f2 - jc5.f;
        zf7 zf7 = zgVar.d;
        int i4 = (int) f3;
        int i5 = zf7.g;
        if (i5 <= 0) {
            i = 0;
        } else {
            i = zf7.f.getLineForVertical(i4 - zf7.h);
            int i6 = i5 - 1;
            if (i > i6) {
                i = i6;
            }
        }
        return i + i3;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        jc5 jc5 = (jc5) arrayList.get(tf4.q(i, arrayList));
        return jc5.a.d.i(i - jc5.d) + jc5.f;
    }

    public final int g(long j) {
        int i;
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i2);
        ArrayList arrayList = this.h;
        jc5 jc5 = (jc5) arrayList.get(tf4.r(arrayList, intBitsToFloat));
        int i3 = jc5.c;
        int i4 = jc5.b;
        if (i3 - i4 == 0) {
            return i4;
        }
        zg zgVar = jc5.a;
        long floatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) - jc5.f)) & 4294967295L);
        zf7 zf7 = zgVar.d;
        Layout layout = zf7.f;
        int lineForVertical = layout.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits))) - zf7.h);
        if (lineForVertical >= zf7.g) {
            i = layout.getText().length();
        } else {
            i = layout.getOffsetForHorizontal(lineForVertical, (zf7.b(lineForVertical) * -1.0f) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32)));
        }
        return i + i4;
    }

    public final long h(ly5 ly5, int i, kj6 kj6) {
        long j;
        long j2;
        float f2 = ly5.b;
        ArrayList arrayList = this.h;
        int r = tf4.r(arrayList, f2);
        float f3 = ((jc5) arrayList.get(r)).g;
        float f4 = ly5.d;
        if (f3 >= f4 || r == sg3.x(arrayList)) {
            jc5 jc5 = (jc5) arrayList.get(r);
            return jc5.b(true, jc5.a.c(jc5.c(ly5), i, kj6));
        }
        int r2 = tf4.r(arrayList, f4);
        long j3 = lg7.b;
        while (true) {
            j = lg7.b;
            if (lg7.b(j3, j) && r <= r2) {
                jc5 jc52 = (jc5) arrayList.get(r);
                j3 = jc52.b(true, jc52.a.c(jc52.c(ly5), i, kj6));
                r++;
            }
        }
        if (lg7.b(j3, j)) {
            return j;
        }
        while (true) {
            j2 = lg7.b;
            if (lg7.b(j, j2) && r <= r2) {
                jc5 jc53 = (jc5) arrayList.get(r2);
                j = jc53.b(true, jc53.a.c(jc53.c(ly5), i, kj6));
                r2--;
            }
        }
        if (lg7.b(j, j2)) {
            return j3;
        }
        return i95.a((int) (j3 >> 32), (int) (4294967295L & j));
    }

    public final void i(qk0 qk0, long j, lq6 lq6, rd7 rd7, iz1 iz1) {
        qk0.h();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jc5 jc5 = (jc5) arrayList.get(i);
            jc5.a.f(qk0, j, lq6, rd7, iz1);
            qk0.o(0.0f, jc5.a.b());
        }
        qk0.p();
    }

    public final void j(qk0 qk0, kc0 kc0, float f2, lq6 lq6, rd7 rd7, iz1 iz1) {
        qk0.h();
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 1) {
            uq3.r(this, qk0, kc0, f2, lq6, rd7, iz1);
        } else if (kc0 instanceof ky6) {
            uq3.r(this, qk0, kc0, f2, lq6, rd7, iz1);
        } else if (kc0 instanceof iq6) {
            int size = arrayList.size();
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i = 0; i < size; i++) {
                jc5 jc5 = (jc5) arrayList.get(i);
                f4 += jc5.a.b();
                f3 = Math.max(f3, jc5.a.d());
            }
            Shader c2 = ((iq6) kc0).c((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
            Matrix matrix = new Matrix();
            c2.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                zg zgVar = ((jc5) arrayList.get(i2)).a;
                zgVar.g(qk0, new lc0(c2), f2, lq6, rd7, iz1);
                qk0.o(0.0f, zgVar.b());
                matrix.setTranslate(0.0f, -zgVar.b());
                c2.setLocalMatrix(matrix);
            }
        } else {
            h.c();
            return;
        }
        qk0.p();
    }

    public final void k(int i) {
        vl vlVar = (vl) this.a.x;
        if (i < 0 || i >= vlVar.x.length()) {
            int length = vlVar.x.length();
            zb3.a("offset(" + i + ") is out of bounds [0, " + length + ")");
        }
    }

    public final void l(int i) {
        vl vlVar = (vl) this.a.x;
        if (i < 0 || i > vlVar.x.length()) {
            int length = vlVar.x.length();
            zb3.a("offset(" + i + ") is out of bounds [0, " + length + "]");
        }
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (!z) {
            zb3.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
        }
    }
}
