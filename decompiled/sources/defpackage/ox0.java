package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* renamed from: ox0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ox0 implements ScrollCaptureCallback {
    public final fk6 a;
    public final se3 b;
    public final rg4 c;
    public final je d;
    public final ig0 e;
    public final i23 f;

    public ox0(fk6 fk6, se3 se3, ig0 ig0, rg4 rg4, je jeVar) {
        this.a = fk6;
        this.b = se3;
        this.c = rg4;
        this.d = jeVar;
        this.e = new ig0(ig0.x.X(kv1.x));
        this.f = new i23(se3.b(), new wh7(this, (f61) null));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r3 == r5) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public static final Object a(ox0 ox0, ScrollCaptureSession scrollCaptureSession, se3 se3, h61 h61) {
        nx0 nx0;
        int i;
        p81 p81;
        int i2;
        int i3;
        se3 se32;
        ScrollCaptureSession scrollCaptureSession2;
        int p;
        int p2;
        int i4;
        int i5;
        ce ceVar;
        e81 e81;
        if (h61 instanceof nx0) {
            nx0 = (nx0) h61;
            int i6 = nx0.F;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                nx0.F = i6 - Integer.MIN_VALUE;
                Object obj = nx0.D;
                i = nx0.F;
                p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    i4 = se3.b;
                    i5 = se3.d;
                    i23 i23 = ox0.f;
                    nx0.z = scrollCaptureSession;
                    nx0.A = se3;
                    nx0.B = i4;
                    nx0.C = i5;
                    nx0.F = 1;
                    if (i4 <= i5) {
                        int i7 = i5 - i4;
                        int i8 = i23.a;
                        if (i7 <= i8) {
                            Object b2 = i23.b(((float) (((i7 / 2) + i4) - (i8 / 2))) - i23.b, nx0);
                            Object obj2 = vs7.a;
                            if (b2 != p81) {
                                b2 = obj2;
                            }
                            if (b2 == p81) {
                                obj2 = b2;
                            }
                        } else {
                            h.j(b81.l(i7, i8, "Expected range (", ") to be ≤ viewportSize="));
                            return null;
                        }
                    } else {
                        i23.getClass();
                        throw new IllegalArgumentException(("Expected min=" + i4 + " ≤ max=" + i5).toString());
                    }
                } else if (i == 1) {
                    int i9 = nx0.C;
                    int i10 = nx0.B;
                    se3 se33 = nx0.A;
                    ScrollCaptureSession h = se.h(nx0.z);
                    o85.q(obj);
                    i4 = i10;
                    se3 = se33;
                    i5 = i9;
                    scrollCaptureSession = h;
                } else if (i == 2) {
                    i3 = nx0.C;
                    i2 = nx0.B;
                    se32 = nx0.A;
                    scrollCaptureSession2 = se.h(nx0.z);
                    o85.q(obj);
                    i23 i232 = ox0.f;
                    p = z65.p(i2 - dh4.C(i232.b), 0, i232.a);
                    i23 i233 = ox0.f;
                    p2 = z65.p(i3 - dh4.C(i233.b), 0, i233.a);
                    int i11 = se32.a;
                    int i12 = se32.c;
                    if (p != p2) {
                        return se3.e;
                    }
                    Canvas lockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
                    try {
                        lockHardwareCanvas.save();
                        lockHardwareCanvas.translate(-((float) i11), -((float) p));
                        se3 se34 = ox0.b;
                        lockHardwareCanvas.translate(-((float) se34.a), -((float) se34.b));
                        ox0.d.getRootView().draw(lockHardwareCanvas);
                        scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                        int C = dh4.C(ox0.f.b);
                        return new se3(i11, p + C, i12, p2 + C);
                    } catch (Throwable th) {
                        scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ceVar = ce.N;
                nx0.z = scrollCaptureSession;
                nx0.A = se3;
                nx0.B = i4;
                nx0.C = i5;
                nx0.F = 2;
                e81 = nx0.x;
                e81.getClass();
                if (pd8.s(e81).a(ceVar, nx0) != p81) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    i3 = i5;
                    se32 = se3;
                    i2 = i4;
                    i23 i2322 = ox0.f;
                    p = z65.p(i2 - dh4.C(i2322.b), 0, i2322.a);
                    i23 i2332 = ox0.f;
                    p2 = z65.p(i3 - dh4.C(i2332.b), 0, i2332.a);
                    int i112 = se32.a;
                    int i122 = se32.c;
                    if (p != p2) {
                    }
                }
                return p81;
            }
        }
        nx0 = new nx0(ox0, h61);
        Object obj3 = nx0.D;
        i = nx0.F;
        p81 = p81.w;
        if (i != 0) {
        }
        ceVar = ce.N;
        nx0.z = scrollCaptureSession;
        nx0.A = se3;
        nx0.B = i4;
        nx0.C = i5;
        nx0.F = 2;
        e81 = nx0.x;
        e81.getClass();
        if (pd8.s(e81).a(ceVar, nx0) != p81) {
        }
        return p81;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        ar7.H(this.e, d05.x, (r81) null, new n0(this, runnable, (f61) null, 18), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        h27 H = ar7.H(this.e, (e81) null, (r81) null, new ng(this, scrollCaptureSession, rect, consumer, (f61) null, 3), 3);
        H.v(new pb(8, cancellationSignal));
        cancellationSignal.setOnCancelListener(new px0(0, H));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(o85.r(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((ed5) this.c.x).setValue(Boolean.TRUE);
        runnable.run();
    }
}
