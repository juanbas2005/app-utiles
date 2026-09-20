package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* renamed from: sc1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sc1 {
    public final je a;
    public final wr0 b;
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
    public vr2 m = ce.S;
    public ly5 n;
    public ly5 o;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = eh4.a();
    public final Matrix r = new Matrix();

    public sc1(je jeVar, wr0 wr0) {
        this.a = jeVar;
        this.b = wr0;
    }

    public final void a() {
        View view;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        wr0 wr0 = this.b;
        nz3 nz3 = (nz3) wr0.y;
        View view2 = (View) wr0.x;
        if (((InputMethodManager) nz3.getValue()).isActive(view2)) {
            vr2 vr2 = this.m;
            float[] fArr = this.q;
            vr2.y(new eh4(fArr));
            this.a.p(fArr);
            Matrix matrix = this.r;
            sg3.T(matrix, fArr);
            hf7 hf7 = this.j;
            hf7.getClass();
            long j2 = hf7.b;
            v35 v35 = this.l;
            v35.getClass();
            bg7 bg7 = this.k;
            bg7.getClass();
            pn4 pn4 = bg7.b;
            ly5 ly5 = this.n;
            ly5.getClass();
            float f2 = ly5.d;
            float f3 = ly5.b;
            ly5 ly52 = this.o;
            ly52.getClass();
            boolean z2 = this.f;
            boolean z3 = this.g;
            nz3 nz32 = nz3;
            boolean z4 = this.h;
            boolean z5 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            lg7 lg7 = hf7.c;
            long j3 = j2;
            int f4 = lg7.f(j3);
            builder.setSelectionRange(f4, lg7.e(j3));
            p56 p56 = p56.x;
            CursorAnchorInfo.Builder builder2 = builder;
            if (!z2 || f4 < 0) {
                view = view2;
            } else {
                int p2 = v35.p(f4);
                ly5 c2 = bg7.c(p2);
                view = view2;
                float o2 = z65.o(c2.a, 0.0f, (float) ((int) (bg7.c >> 32)));
                boolean l2 = rd3.l(ly5, o2, c2.b);
                boolean l3 = rd3.l(ly5, o2, c2.d);
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
                float f5 = c2.b;
                float f6 = c2.d;
                builder2.setInsertionMarkerLocation(o2, f5, f6, f6, i7);
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
                        float f7 = fArr2[i9];
                        CursorAnchorInfo.Builder builder4 = builder3;
                        float f8 = fArr2[i9 + 1];
                        int i10 = i8;
                        float f9 = fArr2[i9 + 2];
                        float f10 = fArr2[i9 + 3];
                        int i11 = i2;
                        if (ly5.a < f9) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        if (f7 < ly5.c) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        int i12 = i3 & i4;
                        if (f3 < f10) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        int i13 = i12 & i5;
                        if (f8 < f2) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        int i14 = i13 & i6;
                        if (!rd3.l(ly5, f7, f8) || !rd3.l(ly5, f9, f10)) {
                            i14 |= 2;
                        }
                        if (bg7.a(p5) == p56) {
                            i14 |= 4;
                        }
                        CursorAnchorInfo.Builder builder5 = builder4;
                        int i15 = i11;
                        CursorAnchorInfo.Builder builder6 = builder5;
                        builder6.addCharacterBounds(i15, f7, f8, f9, f10, i14);
                        builder3 = builder6;
                        i2 = i15 + 1;
                        i8 = i10;
                    }
                }
            }
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 33 && z4) {
                CursorAnchorInfo.Builder unused = builder3.setEditorBoundsInfo(v4.j().setEditorBounds(o85.s(ly52)).setHandwritingBounds(o85.s(ly52)).build());
            }
            if (i16 >= 34 && z5 && !ly5.f()) {
                int i17 = pn4.f - 1;
                if (i17 < 0) {
                    i17 = 0;
                }
                int p6 = z65.p(pn4.e(f3), 0, i17);
                int p7 = z65.p(pn4.e(f2), 0, i17);
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
            ((InputMethodManager) nz32.getValue()).updateCursorAnchorInfo(view, builder3.build());
            this.e = false;
        }
    }
}
