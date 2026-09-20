package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: kb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kb9 implements qk1, ct {
    public static kb9 B;
    public static kb9 C;
    public static HandlerThread D;
    public static Handler E;
    public Object A;
    public final /* synthetic */ int w;
    public int x;
    public Object y;
    public Object z;

    public kb9(int i) {
        this.w = i;
        switch (i) {
            case 5:
                this.y = new SparseIntArray[9];
                this.z = new ArrayList();
                this.A = new dr2(this);
                this.x = 1;
                return;
            default:
                this.x = 0;
                this.A = new Object();
                return;
        }
    }

    public static synchronized kb9 s(Context context) {
        kb9 kb9;
        synchronized (kb9.class) {
            try {
                if (B == null) {
                    B = new kb9(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ar4("MessengerIpcClient"))));
                }
                kb9 = B;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return kb9;
    }

    public void a(jz0 jz0) {
        r66 r66;
        r66 r662;
        boolean z2;
        boolean z3;
        if (jz0 != null) {
            wt1 wt1 = (wt1) jz0;
            e50 e50 = (e50) this.y;
            e50[] e50Arr = (e50[]) wt1.y;
            for (e50 e502 : e50Arr) {
                if (e502 != null) {
                    e502.c();
                }
            }
            wt1.d0(e50Arr, e50);
            fb0 fb0 = (fb0) wt1.x;
            boolean z4 = wt1.z;
            if (z4) {
                r66 = fb0.b;
            } else {
                r66 = fb0.d;
            }
            if (z4) {
                r662 = fb0.c;
            } else {
                r662 = fb0.e;
            }
            int J = wt1.J((int) r662.b);
            int i = -1;
            int i2 = 1;
            int i3 = 0;
            for (int J2 = wt1.J((int) r66.b); J2 < J; J2++) {
                e50 e503 = e50Arr[J2];
                if (e503 != null) {
                    int i4 = e503.f;
                    int i5 = i4 - i;
                    if (i5 == 0) {
                        i3++;
                    } else {
                        if (i5 == 1) {
                            i2 = Math.max(i2, i3);
                            i = e503.f;
                        } else if (i5 < 0 || i4 >= e50.f || i5 > J2) {
                            e50Arr[J2] = null;
                        } else {
                            if (i2 > 2) {
                                i5 *= i2 - 2;
                            }
                            if (i5 >= J2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            for (int i6 = 1; i6 <= i5 && !z2; i6++) {
                                if (e50Arr[J2 - i6] != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                            if (z2) {
                                e50Arr[J2] = null;
                            } else {
                                i = e503.f;
                            }
                        }
                        i3 = 1;
                    }
                }
            }
        }
    }

    public void b() {
        synchronized (this.A) {
            try {
                if (((Handler) this.y) == null) {
                    if (this.x > 0) {
                        HandlerThread handlerThread = new HandlerThread("CameraThread");
                        this.z = handlerThread;
                        handlerThread.start();
                        this.y = new Handler(((HandlerThread) this.z).getLooper());
                    } else {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(Runnable runnable) {
        synchronized (this.A) {
            b();
            ((Handler) this.y).post(runnable);
        }
    }

    public ListenableFuture call() {
        l99 l99 = (l99) this.y;
        int i = this.x;
        ArrayList arrayList = (ArrayList) this.A;
        ListenableFuture d = pt2.d((pk8) this.z);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) pt2.b((Future) arrayList.get(i2))).booleanValue()) {
                if (((List) l99.b).get(i2) == null) {
                    y59 y59 = new y59(1);
                    int i3 = mc9.a;
                    d = pt2.g(d, new l99(4, vb9.a(), y59), fv1.w);
                } else {
                    ku4.a();
                    return null;
                }
            }
        }
        return d;
    }

    public long d() {
        Paint paint = (Paint) this.y;
        if (Build.VERSION.SDK_INT >= 29) {
            return ze8.a.a(paint);
        }
        return uq3.c(paint.getColor());
    }

    public String e() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.x + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.z)[i2];
            if (obj instanceof ll6) {
                ll6 ll6 = (ll6) obj;
                boolean e = sg3.e(ll6.u(), n57.m);
                int[] iArr = (int[]) this.A;
                if (!e) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(ll6.f(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.A)[i2]);
                    sb.append("]");
                }
            } else if (obj == g22.C) {
                sb.append("[<debug info disabled>]");
            } else if (obj != pe2.G) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public int f() {
        int i;
        Paint.Cap strokeCap = ((Paint) this.y).getStrokeCap();
        if (strokeCap == null) {
            i = -1;
        } else {
            i = xg.a[strokeCap.ordinal()];
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return 0;
        }
        return 2;
    }

    public int g() {
        int i;
        Paint.Join strokeJoin = ((Paint) this.y).getStrokeJoin();
        if (strokeJoin == null) {
            i = -1;
        } else {
            i = xg.b[strokeJoin.ordinal()];
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return 0;
        }
        return 1;
    }

    public void h() {
        int i = this.x * 2;
        this.z = Arrays.copyOf((Object[]) this.z, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        qs.M0(0, 0, 14, (int[]) this.A, iArr);
        this.A = iArr;
    }

    public void i(float f) {
        ((Paint) this.y).setAlpha((int) ((float) Math.rint((double) (f * 255.0f))));
    }

    public void j(int i) {
        if (this.x != i) {
            this.x = i;
            Paint paint = (Paint) this.y;
            if (Build.VERSION.SDK_INT >= 29) {
                ze8.a.b(paint, i);
            } else {
                paint.setXfermode(new PorterDuffXfermode(bb0.C0(i)));
            }
        }
    }

    public void k(long j) {
        Paint paint = (Paint) this.y;
        if (Build.VERSION.SDK_INT >= 29) {
            ze8.a.c(paint, j);
        } else {
            paint.setColor(uq3.M(j));
        }
    }

    public void l(lt0 lt0) {
        ColorFilter colorFilter;
        this.A = lt0;
        Paint paint = (Paint) this.y;
        if (lt0 != null) {
            colorFilter = lt0.a;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    public void m(int i) {
        boolean z2;
        Paint paint = (Paint) this.y;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        paint.setFilterBitmap(!z2);
    }

    public void n(Shader shader) {
        this.z = shader;
        ((Paint) this.y).setShader(shader);
    }

    public void o(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.y;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void p(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.y;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else if (i == 1) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void q(float f) {
        ((Paint) this.y).setStrokeWidth(f);
    }

    public void r(int i) {
        Paint.Style style;
        Paint paint = (Paint) this.y;
        if (i == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }

    public synchronized yb9 t(ba9 ba9) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(ba9.toString()));
            }
            if (!((r89) this.A).a(ba9)) {
                r89 r89 = new r89(this);
                this.A = r89;
                r89.a(ba9);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return ba9.b.a;
    }

    public String toString() {
        switch (this.w) {
            case 4:
                int i = this.x;
                jz0[] jz0Arr = (jz0[]) this.z;
                jz0 jz0 = jz0Arr[0];
                if (jz0 == null) {
                    jz0 = jz0Arr[i + 1];
                }
                Formatter formatter = new Formatter();
                int i2 = 0;
                while (i2 < ((e50[]) jz0.y).length) {
                    try {
                        formatter.format("CW %3d:", new Object[]{Integer.valueOf(i2)});
                        for (int i3 = 0; i3 < i + 2; i3++) {
                            jz0 jz02 = jz0Arr[i3];
                            if (jz02 == null) {
                                formatter.format("    |   ", new Object[0]);
                            } else {
                                e50 e50 = ((e50[]) jz02.y)[i2];
                                if (e50 == null) {
                                    formatter.format("    |   ", new Object[0]);
                                } else {
                                    formatter.format(" %3d|%3d", new Object[]{Integer.valueOf(e50.f), Integer.valueOf(e50.e)});
                                }
                            }
                        }
                        formatter.format("%n", new Object[0]);
                        i2++;
                    } catch (Throwable th) {
                        try {
                            formatter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                String formatter2 = formatter.toString();
                formatter.close();
                return formatter2;
            case 6:
                return e();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kb9(l99 l99, pk8 pk8, int i, ArrayList arrayList) {
        this.w = 9;
        this.y = l99;
        this.z = pk8;
        this.x = i;
        this.A = arrayList;
    }

    public kb9(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.w = 0;
        this.A = new r89(this);
        this.x = 1;
        this.z = scheduledExecutorService;
        this.y = context.getApplicationContext();
    }

    public kb9(wl3 wl3) {
        this.w = 6;
        wl3.getClass();
        this.y = wl3;
        this.z = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.A = iArr;
        this.x = -1;
    }

    public /* synthetic */ kb9(int i, boolean z2) {
        this.w = i;
    }

    public kb9(zs4 zs4, int i) {
        this.w = 7;
        this.y = zs4.B;
        this.x = i;
        bt4 bt4 = zs4.D;
        this.z = bt4.a();
        Bundle j = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
        this.A = j;
        bt4.h.H(j);
    }

    public kb9(e50 e50, fb0 fb0) {
        this.w = 4;
        this.y = e50;
        int i = e50.b;
        this.x = i;
        this.A = fb0;
        this.z = new jz0[(i + 2)];
    }

    public kb9(Bundle bundle) {
        this.w = 7;
        bundle.getClass();
        this.y = z85.o("nav-entry-state:id", bundle);
        this.x = z85.j("nav-entry-state:destination-id", bundle);
        this.z = z85.l("nav-entry-state:args", bundle);
        this.A = z85.l("nav-entry-state:saved-state", bundle);
    }

    public kb9(Paint paint) {
        this.w = 1;
        this.y = paint;
        this.x = 3;
    }
}
