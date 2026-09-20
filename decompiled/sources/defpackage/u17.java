package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: u17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u17 {
    public static final z02 p = new z02(1);
    public static final z02 q = new z02(2);
    public static final z02 r = new z02(3);
    public static final z02 s = new z02(4);
    public static final z02 t = new z02(5);
    public static final z02 u = new z02(0);
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean c = false;
    public final fr6 d;
    public final pd8 e;
    public boolean f = false;
    public final float g = Float.MAX_VALUE;
    public final float h = -3.4028235E38f;
    public long i = 0;
    public final float j;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public v17 m;
    public float n;
    public boolean o;

    public u17(fr6 fr6, pd8 pd8) {
        this.d = fr6;
        this.e = pd8;
        if (pd8 == r || pd8 == s || pd8 == t) {
            this.j = 0.1f;
        } else if (pd8 == u) {
            this.j = 0.00390625f;
        } else if (pd8 == p || pd8 == q) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static dl b() {
        ThreadLocal threadLocal = dl.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new dl(new qc3(9)));
        }
        return (dl) threadLocal.get();
    }

    public final void a(float f2) {
        if (this.f) {
            this.n = f2;
            return;
        }
        if (this.m == null) {
            this.m = new v17(f2);
        }
        v17 v17 = this.m;
        double d2 = (double) f2;
        v17.i = d2;
        double d3 = (double) ((float) d2);
        float f3 = this.g;
        if (d3 <= ((double) f3)) {
            float f4 = this.h;
            if (d3 >= ((double) f4)) {
                double abs = Math.abs((double) (this.j * 0.75f));
                v17.d = abs;
                v17.e = abs * 62.5d;
                qc3 qc3 = b().e;
                qc3.getClass();
                if (Thread.currentThread() == ((Looper) qc3.y).getThread()) {
                    boolean z = this.f;
                    if (!z && !z) {
                        this.f = true;
                        if (!this.c) {
                            this.b = this.e.t(this.d);
                        }
                        float f5 = this.b;
                        if (f5 > f3 || f5 < f4) {
                            h.q("Starting value need to be in between min value and max value");
                            return;
                        }
                        dl b2 = b();
                        ArrayList arrayList = b2.b;
                        if (arrayList.size() == 0) {
                            ((Choreographer) b2.e.x).postFrameCallback(new cl(b2.d));
                            if (Build.VERSION.SDK_INT >= 33) {
                                b2.g = ValueAnimator.getDurationScale();
                                if (b2.h == null) {
                                    b2.h = new qc3(8, (Object) b2, false);
                                }
                                qc3 qc32 = b2.h;
                                if (((bl) qc32.x) == null) {
                                    bl blVar = new bl(qc32);
                                    qc32.x = blVar;
                                    boolean unused = ValueAnimator.registerDurationScaleChangeListener(blVar);
                                }
                            }
                        }
                        if (!arrayList.contains(this)) {
                            arrayList.add(this);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            kj6.n("Final position of the spring cannot be less than the min value.");
            return;
        }
        kj6.n("Final position of the spring cannot be greater than the max value.");
    }

    public final void c(float f2) {
        this.e.B(this.d, f2);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i2 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            } else if (arrayList.get(i2) == null) {
                i2++;
            } else {
                ((fm7) arrayList.get(i2)).getClass();
                throw null;
            }
        }
    }

    public final void d() {
        if (this.m.b > 0.0d) {
            qc3 qc3 = b().e;
            qc3.getClass();
            if (Thread.currentThread() != ((Looper) qc3.y).getThread()) {
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            } else if (this.f) {
                this.o = true;
            }
        } else {
            kj6.n("Spring animations can only come to an end when there is damping");
        }
    }
}
