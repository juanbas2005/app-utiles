package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: hw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hw2 extends wo1 implements gz1 {
    public final /* synthetic */ int M = 1;
    public final xf N;
    public final w12 O;
    public Object P;

    public hw2(h97 h97, xf xfVar, w12 w12, la5 la5) {
        this.N = xfVar;
        this.O = w12;
        this.P = la5;
        V0(h97);
    }

    public static boolean Y0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean Z0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode a1() {
        RenderNode renderNode = (RenderNode) this.P;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode c = g07.c();
        this.P = c;
        return c;
    }

    public final void p0(wy3 wy3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        char c;
        long j;
        boolean z5;
        boolean z6;
        float f;
        float f2;
        boolean z7;
        float f3;
        float f4;
        boolean z8;
        float f5;
        boolean z9;
        float f6;
        wy3 wy32 = wy3;
        int i = this.M;
        xf xfVar = this.N;
        w12 w12 = this.O;
        switch (i) {
            case b85.b:
                la5 la5 = (la5) this.P;
                tk0 tk0 = wy32.w;
                xfVar.j(tk0.e());
                if (wu6.e(tk0.e())) {
                    wy32.a();
                    return;
                }
                wy32.a();
                xfVar.d.getValue();
                Canvas a = pd.a(tk0.x.D());
                if (w12.f(w12.f)) {
                    EdgeEffect c2 = w12.c();
                    float e0 = wy32.e0(la5.b(wy32.getLayoutDirection()));
                    z = Z0(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (tk0.e() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(e0)) & 4294967295L), c2, a);
                } else {
                    z = false;
                }
                if (w12.f(w12.d)) {
                    if (Z0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(wy32.e0(la5.d()))) & 4294967295L), w12.e(), a) || z) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (w12.f(w12.g)) {
                    EdgeEffect d = w12.d();
                    int C = dh4.C(Float.intBitsToFloat((int) (tk0.e() >> 32)));
                    float e02 = wy32.e0(la5.c(wy32.getLayoutDirection())) + (-((float) C));
                    if (Z0(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(e02)) & 4294967295L), d, a) || z) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (w12.f(w12.e)) {
                    if (Z0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (tk0.e() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (tk0.e() & 4294967295L))) + wy32.e0(la5.a()))) & 4294967295L), w12.b(), a) || z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = z2;
                }
                if (z) {
                    xfVar.d();
                    return;
                }
                return;
            default:
                tk0 tk02 = wy32.w;
                xfVar.j(tk02.e());
                Canvas a2 = pd.a(tk02.x.D());
                xfVar.d.getValue();
                if (wu6.e(tk02.e())) {
                    wy32.a();
                    return;
                } else if (!a2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = w12.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = w12.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = w12.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = w12.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = w12.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = w12.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = w12.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = w12.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    wy32.a();
                    return;
                } else {
                    float e03 = wy32.e0(30.0f);
                    if (w12.f(w12.d) || w12.g(w12.h) || w12.f(w12.e) || w12.g(w12.i)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (w12.f(w12.f) || w12.g(w12.j) || w12.f(w12.g) || w12.g(w12.k)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 || !z4) {
                        j = 4294967295L;
                        c = ' ';
                        if (z3) {
                            a1().setPosition(0, 0, (dh4.C(e03) * 2) + a2.getWidth(), a2.getHeight());
                        } else if (z4) {
                            a1().setPosition(0, 0, a2.getWidth(), (dh4.C(e03) * 2) + a2.getHeight());
                        } else {
                            wy32.a();
                            return;
                        }
                    } else {
                        j = 4294967295L;
                        c = ' ';
                        a1().setPosition(0, 0, a2.getWidth(), a2.getHeight());
                    }
                    RecordingCanvas b = a1().beginRecording();
                    boolean g = w12.g(w12.j);
                    z75 z75 = z75.x;
                    if (g) {
                        EdgeEffect edgeEffect9 = w12.j;
                        if (edgeEffect9 == null) {
                            edgeEffect9 = w12.a(z75);
                            w12.j = edgeEffect9;
                        }
                        Y0(90.0f, edgeEffect9, b);
                        edgeEffect9.finish();
                    }
                    if (w12.f(w12.f)) {
                        EdgeEffect c3 = w12.c();
                        z6 = Y0(270.0f, c3, b);
                        if (w12.g(w12.f)) {
                            z5 = z4;
                            float intBitsToFloat = Float.intBitsToFloat((int) (xfVar.c() & j));
                            EdgeEffect edgeEffect10 = w12.j;
                            if (edgeEffect10 == null) {
                                edgeEffect10 = w12.a(z75);
                                w12.j = edgeEffect10;
                            }
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 31) {
                                f6 = hn.c(c3);
                            } else {
                                f6 = 0.0f;
                            }
                            float f7 = 1.0f - intBitsToFloat;
                            if (i2 >= 31) {
                                hn.e(edgeEffect10, f6, f7);
                            } else {
                                edgeEffect10.onPull(f6, f7);
                            }
                        } else {
                            z5 = z4;
                        }
                    } else {
                        z5 = z4;
                        z6 = false;
                    }
                    boolean g2 = w12.g(w12.h);
                    z75 z752 = z75.w;
                    if (g2) {
                        EdgeEffect edgeEffect11 = w12.h;
                        if (edgeEffect11 == null) {
                            edgeEffect11 = w12.a(z752);
                            w12.h = edgeEffect11;
                        }
                        Y0(180.0f, edgeEffect11, b);
                        edgeEffect11.finish();
                    }
                    if (w12.f(w12.d)) {
                        EdgeEffect e = w12.e();
                        if (Y0(0.0f, e, b) || z6) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (w12.g(w12.d)) {
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (xfVar.c() >> c));
                            EdgeEffect edgeEffect12 = w12.h;
                            if (edgeEffect12 == null) {
                                edgeEffect12 = w12.a(z752);
                                w12.h = edgeEffect12;
                            }
                            int i3 = Build.VERSION.SDK_INT;
                            if (i3 >= 31) {
                                f5 = hn.c(e);
                            } else {
                                f5 = 0.0f;
                            }
                            if (i3 >= 31) {
                                hn.e(edgeEffect12, f5, intBitsToFloat2);
                            } else {
                                edgeEffect12.onPull(f5, intBitsToFloat2);
                            }
                        }
                    }
                    if (w12.g(w12.k)) {
                        EdgeEffect edgeEffect13 = w12.k;
                        if (edgeEffect13 == null) {
                            edgeEffect13 = w12.a(z75);
                            w12.k = edgeEffect13;
                        }
                        Y0(270.0f, edgeEffect13, b);
                        edgeEffect13.finish();
                    }
                    if (w12.f(w12.g)) {
                        EdgeEffect d2 = w12.d();
                        if (Y0(90.0f, d2, b) || z6) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (w12.g(w12.g)) {
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (xfVar.c() & j));
                            EdgeEffect edgeEffect14 = w12.k;
                            if (edgeEffect14 == null) {
                                edgeEffect14 = w12.a(z75);
                                w12.k = edgeEffect14;
                            }
                            int i4 = Build.VERSION.SDK_INT;
                            if (i4 >= 31) {
                                f4 = hn.c(d2);
                            } else {
                                f4 = 0.0f;
                            }
                            if (i4 >= 31) {
                                hn.e(edgeEffect14, f4, intBitsToFloat3);
                            } else {
                                edgeEffect14.onPull(f4, intBitsToFloat3);
                            }
                        }
                    }
                    if (w12.g(w12.i)) {
                        EdgeEffect edgeEffect15 = w12.i;
                        if (edgeEffect15 == null) {
                            edgeEffect15 = w12.a(z752);
                            w12.i = edgeEffect15;
                        }
                        Y0(0.0f, edgeEffect15, b);
                        edgeEffect15.finish();
                    }
                    if (w12.f(w12.e)) {
                        EdgeEffect b2 = w12.b();
                        if (Y0(180.0f, b2, b) || z6) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (w12.g(w12.e)) {
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (xfVar.c() >> c));
                            EdgeEffect edgeEffect16 = w12.i;
                            if (edgeEffect16 == null) {
                                edgeEffect16 = w12.a(z752);
                                w12.i = edgeEffect16;
                            }
                            int i5 = Build.VERSION.SDK_INT;
                            if (i5 >= 31) {
                                f3 = hn.c(b2);
                            } else {
                                f3 = 0.0f;
                            }
                            float f8 = 1.0f - intBitsToFloat4;
                            if (i5 >= 31) {
                                hn.e(edgeEffect16, f3, f8);
                            } else {
                                edgeEffect16.onPull(f3, f8);
                            }
                        }
                        z6 = z7;
                    }
                    if (z6) {
                        xfVar.d();
                    }
                    if (z5) {
                        f = 0.0f;
                    } else {
                        f = e03;
                    }
                    if (z3) {
                        f2 = 0.0f;
                    } else {
                        f2 = e03;
                    }
                    ey3 layoutDirection = wy32.getLayoutDirection();
                    od odVar = new od();
                    odVar.a = b;
                    long e2 = tk02.e();
                    tp1 H = tk02.x.H();
                    ey3 J = tk02.x.J();
                    qk0 D = tk02.x.D();
                    long L = tk02.x.L();
                    wr0 wr0 = tk02.x;
                    Canvas canvas = a2;
                    cx2 cx2 = (cx2) wr0.y;
                    wr0.c0(wy32);
                    wr0.d0(layoutDirection);
                    wr0.b0(odVar);
                    wr0.e0(e2);
                    wr0.y = null;
                    odVar.h();
                    try {
                        ((ji8) tk02.x.x).F(f, f2);
                        wy32.a();
                        float f9 = -f;
                        float f10 = -f2;
                        ((ji8) tk02.x.x).F(f9, f10);
                        odVar.p();
                        wr0 wr02 = tk02.x;
                        wr02.c0(H);
                        wr02.d0(J);
                        wr02.b0(D);
                        wr02.e0(L);
                        wr02.y = cx2;
                        a1().endRecording();
                        int save = canvas.save();
                        Canvas canvas2 = canvas;
                        canvas2.translate(f9, f10);
                        canvas2.drawRenderNode(a1());
                        canvas2.restoreToCount(save);
                        return;
                    } catch (Throwable th) {
                        odVar.p();
                        wr0 wr03 = tk02.x;
                        wr03.c0(H);
                        wr03.d0(J);
                        wr03.b0(D);
                        wr03.e0(L);
                        wr03.y = cx2;
                        throw th;
                    }
                }
        }
    }

    public hw2(h97 h97, xf xfVar, w12 w12) {
        this.N = xfVar;
        this.O = w12;
        V0(h97);
    }
}
