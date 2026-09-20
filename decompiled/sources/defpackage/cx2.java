package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: cx2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cx2 {
    public boolean A;
    public RectF B;
    public final ex2 a;
    public tp1 b = tf4.b;
    public ey3 c = ey3.w;
    public vr2 d = ce.a0;
    public final pb e = new pb(12, this);
    public Outline f;
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public float j;
    public n85 k;
    public eh l;
    public eh m;
    public boolean n;
    public tk0 o;
    public kb9 p;
    public int q;
    public final ge2 r = new Object();
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;

    static {
        sg3.e(Build.FINGERPRINT, "robolectric");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [ge2, java.lang.Object] */
    public cx2(ex2 ex2) {
        this.a = ex2;
        ex2.C(false);
        this.t = 0;
        this.u = 0;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z2 = this.A;
            Outline outline2 = null;
            ex2 ex2 = this.a;
            if (z2 || ex2.K() > 0.0f) {
                eh ehVar = this.l;
                if (ehVar != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z3 = ehVar instanceof eh;
                    if (z3) {
                        Path path = ehVar.a;
                        path.computeBounds(rectF, false);
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 > 28 || path.isConvex()) {
                            outline = this.f;
                            if (outline == null) {
                                outline = new Outline();
                                this.f = outline;
                            }
                            if (i2 >= 30) {
                                if (z3) {
                                    outline.setPath(path);
                                } else {
                                    kj6.n("Unable to obtain android.graphics.Path");
                                    return;
                                }
                            } else if (z3) {
                                outline.setConvexPath(path);
                            } else {
                                kj6.n("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.offset(this.v, this.w);
                            this.n = !outline.canClip();
                        } else {
                            Outline outline3 = this.f;
                            if (outline3 != null) {
                                outline3.setEmpty();
                            }
                            this.n = true;
                            outline = null;
                        }
                        this.l = ehVar;
                        if (outline != null) {
                            outline.setAlpha(ex2.a());
                            outline2 = outline;
                        }
                        ex2.g(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                        if (!this.n || !this.A) {
                            ex2.C(this.A);
                        } else {
                            ex2.C(false);
                            ex2.i();
                        }
                    } else {
                        kj6.n("Unable to obtain android.graphics.Path");
                        return;
                    }
                } else {
                    ex2.C(this.A);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long O = pv8.O(this.u);
                    long j2 = this.h;
                    long j3 = this.i;
                    if (j3 != 9205357640488583168L) {
                        O = j3;
                    }
                    int i3 = (int) (j2 >> 32);
                    int round = Math.round(Float.intBitsToFloat(i3));
                    int i4 = (int) (j2 & 4294967295L);
                    int round2 = Math.round(Float.intBitsToFloat(i4));
                    int i5 = (int) (O >> 32);
                    int round3 = Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3));
                    int i6 = (int) (O & 4294967295L);
                    int i7 = round2;
                    int round4 = Math.round(Float.intBitsToFloat(i6) + Float.intBitsToFloat(i4));
                    outline5.setRoundRect(round, i7, round3, round4, this.j);
                    outline5.setAlpha(ex2.a());
                    ex2.g(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i6)))) | (((long) Math.round(Float.intBitsToFloat(i5))) << 32));
                }
            } else {
                ex2.C(false);
                ex2.g((Outline) null, 0);
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.s && this.q == 0) {
            ge2 ge2 = this.r;
            cx2 cx2 = (cx2) ge2.b;
            if (cx2 != null) {
                cx2.q--;
                cx2.b();
                ge2.b = null;
            }
            up4 up4 = (up4) ge2.d;
            if (up4 != null) {
                Object[] objArr = up4.b;
                long[] jArr = up4.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j2) < 128) {
                                    cx2 cx22 = (cx2) objArr[(i2 << 3) + i4];
                                    cx22.q--;
                                    cx22.b();
                                }
                                j2 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                up4.b();
            }
            this.a.i();
        }
    }

    public final void c(hz1 hz1) {
        ge2 ge2 = this.r;
        ge2.c = (cx2) ge2.b;
        up4 up4 = (up4) ge2.d;
        if (up4 != null && up4.h()) {
            up4 up42 = (up4) ge2.e;
            if (up42 == null) {
                up4 up43 = cg6.a;
                up42 = new up4();
                ge2.e = up42;
            }
            up42.j(up4);
            up4.b();
        }
        ge2.a = true;
        this.d.y(hz1);
        ge2.a = false;
        cx2 cx2 = (cx2) ge2.c;
        if (cx2 != null) {
            cx2.q--;
            cx2.b();
        }
        up4 up44 = (up4) ge2.e;
        if (up44 != null && up44.h()) {
            Object[] objArr = up44.b;
            long[] jArr = up44.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                cx2 cx22 = (cx2) objArr[(i2 << 3) + i4];
                                cx22.q--;
                                cx22.b();
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            up44.b();
        }
    }

    public final n85 d() {
        n85 n85;
        n85 n852 = this.k;
        eh ehVar = this.l;
        if (n852 != null) {
            return n852;
        }
        if (ehVar != null) {
            k85 k85 = new k85(ehVar);
            this.k = k85;
            return k85;
        }
        long O = pv8.O(this.u);
        long j2 = this.h;
        long j3 = this.i;
        if (j3 != 9205357640488583168L) {
            O = j3;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (O >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (O & 4294967295L)) + intBitsToFloat2;
        float f2 = this.j;
        if (f2 > 0.0f) {
            n85 = new m85(p25.a(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f2)))));
        } else {
            n85 = new l85(new ly5(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = n85;
        return n85;
    }

    public final void e(tp1 tp1, ey3 ey3, long j2, vr2 vr2) {
        boolean a2 = we3.a(this.u, j2);
        ex2 ex2 = this.a;
        if (!a2) {
            this.u = j2;
            long j3 = this.t;
            ex2.n((int) (j3 >> 32), (int) (j3 & 4294967295L), j2);
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = tp1;
        this.c = ey3;
        this.d = vr2;
        ex2.E(tp1, ey3, this, this.e);
    }

    public final void f(long j2, long j3, float f2) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits((float) this.v);
        long e2 = l35.e(j2, (((long) Float.floatToRawIntBits((float) this.w)) & 4294967295L) | (floatToRawIntBits << 32));
        if (!l35.b(this.h, e2) || !wu6.a(this.i, j3) || this.j != f2 || this.l != null) {
            this.k = null;
            this.l = null;
            this.g = true;
            this.n = false;
            this.h = e2;
            this.i = j3;
            this.j = f2;
            a();
        }
    }
}
