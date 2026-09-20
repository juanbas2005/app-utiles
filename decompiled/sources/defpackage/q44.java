package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* renamed from: q44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q44 {
    public final mg a;
    public final qc3 b;
    public final Object c = new Object();
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public hf7 j;
    public bg7 k;
    public v35 l;
    public ly5 m;
    public ly5 n;
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = eh4.a();
    public final Matrix q = new Matrix();

    public q44(mg mgVar, qc3 qc3) {
        this.a = mgVar;
        this.b = qc3;
    }

    public final void a() {
        float f2;
        float f3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        qc3 qc3 = this.b;
        InputMethodManager A = qc3.A();
        View view = (View) qc3.x;
        if (A.isActive(view) && this.j != null && this.l != null && this.k != null && this.m != null && this.n != null) {
            float[] fArr = this.p;
            eh4.d(fArr);
            dy3 dy3 = (dy3) this.a.D.N.getValue();
            if (dy3 != null) {
                if (!dy3.n()) {
                    dy3 = null;
                }
                if (dy3 != null) {
                    dy3.h(fArr);
                }
            }
            ly5 ly5 = this.n;
            ly5.getClass();
            ly5 ly52 = this.n;
            ly52.getClass();
            eh4.h(fArr, -ly5.a, -ly52.b);
            Matrix matrix = this.q;
            sg3.T(matrix, fArr);
            hf7 hf7 = this.j;
            hf7.getClass();
            long j2 = hf7.b;
            v35 v35 = this.l;
            v35.getClass();
            bg7 bg7 = this.k;
            bg7.getClass();
            pn4 pn4 = bg7.b;
            ly5 ly53 = this.m;
            ly53.getClass();
            float f4 = ly53.d;
            float f5 = ly53.b;
            ly5 ly54 = this.n;
            ly54.getClass();
            boolean z2 = this.f;
            boolean z3 = this.g;
            qc3 qc32 = qc3;
            boolean z4 = this.h;
            boolean z5 = this.i;
            CursorAnchorInfo.Builder builder = this.o;
            builder.reset();
            builder.setMatrix(matrix);
            lg7 lg7 = hf7.c;
            long j3 = j2;
            int f6 = lg7.f(j3);
            builder.setSelectionRange(f6, lg7.e(j3));
            p56 p56 = p56.x;
            CursorAnchorInfo.Builder builder2 = builder;
            if (!z2 || f6 < 0) {
                f3 = f4;
                f2 = f5;
            } else {
                int p2 = v35.p(f6);
                ly5 c2 = bg7.c(p2);
                f3 = f4;
                f2 = f5;
                float o2 = z65.o(c2.a, 0.0f, (float) ((int) (bg7.c >> 32)));
                boolean l2 = tf4.l(ly53, o2, c2.b);
                boolean l3 = tf4.l(ly53, o2, c2.d);
                if (bg7.a(p2) == p56) {
                    z = true;
                } else {
                    z = false;
                }
                if (l2 || l3) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if (!l2 || !l3) {
                    i7 |= 2;
                }
                if (z) {
                    i7 |= 4;
                }
                float f7 = c2.b;
                float f8 = c2.d;
                builder2.setInsertionMarkerLocation(o2, f7, f8, f8, i7);
            }
            CursorAnchorInfo.Builder builder3 = builder2;
            if (z3) {
                int i8 = -1;
                if (lg7 != null) {
                    i2 = lg7.f(lg7.a);
                } else {
                    i2 = -1;
                }
                if (lg7 != null) {
                    i8 = lg7.e(lg7.a);
                }
                if (i2 >= 0 && i2 < i8) {
                    builder3.setComposingText(i2, hf7.a.x.subSequence(i2, i8));
                    int p3 = v35.p(i2);
                    int p4 = v35.p(i8);
                    float[] fArr2 = new float[((p4 - p3) * 4)];
                    pn4.a(i95.a(p3, p4), fArr2);
                    while (i2 < i8) {
                        int p5 = v35.p(i2);
                        int i9 = (p5 - p3) * 4;
                        float f9 = fArr2[i9];
                        CursorAnchorInfo.Builder builder4 = builder3;
                        float f10 = fArr2[i9 + 1];
                        int i10 = p3;
                        float f11 = fArr2[i9 + 2];
                        float f12 = fArr2[i9 + 3];
                        int i11 = i8;
                        if (ly53.a < f11) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        if (f9 < ly53.c) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        int i12 = i3 & i4;
                        if (f2 < f12) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        int i13 = i12 & i5;
                        if (f10 < f3) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        int i14 = i13 & i6;
                        if (!tf4.l(ly53, f9, f10) || !tf4.l(ly53, f11, f12)) {
                            i14 |= 2;
                        }
                        if (bg7.a(p5) == p56) {
                            i14 |= 4;
                        }
                        CursorAnchorInfo.Builder builder5 = builder4;
                        int i15 = i2;
                        builder5.addCharacterBounds(i15, f9, f10, f11, f12, i14);
                        builder3 = builder5;
                        i2 = i15 + 1;
                        p3 = i10;
                        i8 = i11;
                    }
                }
            }
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 33 && z4) {
                CursorAnchorInfo.Builder unused = builder3.setEditorBoundsInfo(v4.j().setEditorBounds(o85.s(ly54)).setHandwritingBounds(o85.s(ly54)).build());
            }
            if (i16 >= 34 && z5 && !ly53.f()) {
                int i17 = pn4.f - 1;
                if (i17 < 0) {
                    i17 = 0;
                }
                int p6 = z65.p(pn4.e(f2), 0, i17);
                int p7 = z65.p(pn4.e(f3), 0, i17);
                if (p6 <= p7) {
                    while (true) {
                        builder3.addVisibleLineBounds(bg7.e(p6), pn4.f(p6), bg7.f(p6), pn4.b(p6));
                        if (p6 == p7) {
                            break;
                        }
                        p6++;
                    }
                }
            }
            qc32.A().updateCursorAnchorInfo(view, builder3.build());
            this.e = false;
        }
    }
}
