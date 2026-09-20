package defpackage;

import android.text.Layout;
import java.io.Serializable;

/* renamed from: ra0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ra0 implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ long x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Serializable z;

    public /* synthetic */ ra0(long j, float[] fArr, f06 f06, e06 e06) {
        this.x = j;
        this.y = fArr;
        this.z = f06;
        this.A = e06;
    }

    public final Object y(Object obj) {
        int i;
        long j;
        float[] fArr;
        vs7 vs7;
        boolean z2;
        int i2;
        float f;
        float f2;
        int i3 = this.w;
        vs7 vs72 = vs7.a;
        Object obj2 = this.A;
        Serializable serializable = this.z;
        Object obj3 = this.y;
        switch (i3) {
            case b85.b:
                vs7 vs73 = vs72;
                ly5 ly5 = (ly5) obj3;
                h06 h06 = (h06) serializable;
                long j2 = this.x;
                lt0 lt0 = (lt0) obj2;
                wy3 wy3 = (wy3) obj;
                wy3.a();
                float f3 = ly5.a;
                float f4 = ly5.b;
                tk0 tk0 = wy3.w;
                ((ji8) tk0.x.x).F(f3, f4);
                try {
                    hz1.G(wy3, (hg) h06.w, j2, 0, 0.0f, lt0, 0, 890);
                    return vs73;
                } finally {
                    ((ji8) tk0.x.x).F(-f3, -f4);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                f06 f06 = (f06) serializable;
                e06 e06 = (e06) obj2;
                jc5 jc5 = (jc5) obj;
                int i4 = jc5.b;
                zg zgVar = jc5.a;
                int i5 = jc5.c;
                long j3 = this.x;
                if (i4 > lg7.f(j3)) {
                    i = jc5.b;
                } else {
                    i = lg7.f(j3);
                }
                if (i5 >= lg7.e(j3)) {
                    i5 = lg7.e(j3);
                }
                long a = i95.a(jc5.d(i), jc5.d(i5));
                int i6 = f06.w;
                zf7 zf7 = zgVar.d;
                int f5 = lg7.f(a);
                int e = lg7.e(a);
                Layout layout = zf7.f;
                int length = layout.getText().length();
                if (f5 < 0) {
                    zb3.a("startOffset must be > 0");
                }
                if (f5 >= length) {
                    zb3.a("startOffset must be less than text length");
                }
                if (e <= f5) {
                    zb3.a("endOffset must be greater than startOffset");
                }
                if (e > length) {
                    zb3.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i6 < (e - f5) * 4) {
                    zb3.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int g = zf7.g(f5);
                int g2 = zf7.g(e - 1);
                i23 i23 = new i23(zf7);
                if (g <= g2) {
                    while (true) {
                        int lineStart = layout.getLineStart(g);
                        j = a;
                        int f6 = zf7.f(g);
                        int max = Math.max(f5, lineStart);
                        int min = Math.min(e, f6);
                        float i7 = zf7.i(g);
                        float e2 = zf7.e(g);
                        int i8 = max;
                        vs7 = vs72;
                        fArr = fArr2;
                        boolean z3 = false;
                        if (layout.getParagraphDirection(g) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i9 = i8;
                        int i10 = i6;
                        int i11 = i9;
                        while (i11 < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(i11);
                            if (z2 && !isRtlCharAt) {
                                f = i23.a(i11, z3, z3, true);
                                i2 = min;
                                f2 = i23.a(i11 + 1, true, true, true);
                            } else if (!z2 || !isRtlCharAt) {
                                i2 = min;
                                z3 = false;
                                if (z2 || !isRtlCharAt) {
                                    f = i23.a(i11, false, false, false);
                                    f2 = i23.a(i11 + 1, true, true, false);
                                    fArr[i10] = f;
                                    fArr[i10 + 1] = i7;
                                    fArr[i10 + 2] = f2;
                                    fArr[i10 + 3] = e2;
                                    i10 += 4;
                                    i11++;
                                    min = i2;
                                } else {
                                    f2 = i23.a(i11, false, false, true);
                                    f = i23.a(i11 + 1, true, true, true);
                                }
                            } else {
                                z3 = false;
                                i2 = min;
                                float a2 = i23.a(i11, false, false, false);
                                f = i23.a(i11 + 1, true, true, false);
                                f2 = a2;
                                fArr[i10] = f;
                                fArr[i10 + 1] = i7;
                                fArr[i10 + 2] = f2;
                                fArr[i10 + 3] = e2;
                                i10 += 4;
                                i11++;
                                min = i2;
                            }
                            z3 = false;
                            fArr[i10] = f;
                            fArr[i10 + 1] = i7;
                            fArr[i10 + 2] = f2;
                            fArr[i10 + 3] = e2;
                            i10 += 4;
                            i11++;
                            min = i2;
                        }
                        if (g != g2) {
                            g++;
                            a = j;
                            i6 = i10;
                            vs72 = vs7;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = a;
                    vs7 = vs72;
                    fArr = fArr2;
                }
                int d = (lg7.d(j) * 4) + f06.w;
                for (int i12 = f06.w; i12 < d; i12 += 4) {
                    int i13 = i12 + 1;
                    float f7 = fArr[i13];
                    float f8 = e06.w;
                    fArr[i13] = f7 + f8;
                    int i14 = i12 + 3;
                    fArr[i14] = fArr[i14] + f8;
                }
                f06.w = d;
                e06.w = zgVar.b() + e06.w;
                return vs7;
        }
    }

    public /* synthetic */ ra0(ly5 ly5, h06 h06, long j, u90 u90) {
        this.y = ly5;
        this.z = h06;
        this.x = j;
        this.A = u90;
    }
}
