package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: j43  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j43 implements o81, Closeable {
    public static final /* synthetic */ AtomicIntegerFieldUpdater G = AtomicIntegerFieldUpdater.newUpdater(j43.class, "closed");
    public final s53 A;
    public final s53 B;
    public final s53 C;
    public final iz0 D;
    public final f96 E;
    public final n43 F;
    private volatile /* synthetic */ int closed = 0;
    public final q43 w;
    public final fl3 x;
    public final e81 y;
    public final s53 z;

    public j43(q43 q43, n43 n43, boolean z2) {
        q43.getClass();
        this.w = q43;
        e81 k = q43.k();
        me6 me6 = me6.E;
        fl3 fl3 = new fl3((el3) k.a0(me6));
        this.x = fl3;
        this.y = q43.k().X(fl3);
        this.z = new s53(1);
        this.A = new s53(2);
        s53 s53 = new s53(3);
        this.B = s53;
        this.C = new s53(0);
        this.D = new iz0();
        this.E = new f96(21);
        n43 n432 = new n43();
        this.F = n432;
        s53.f(s53.w, new p43(this, q43, (f61) null));
        s53.f(s53.x, new ea((Object) this, (f61) null, 3));
        n432.b(b63.b, new vd2(15));
        n432.b(ea0.c, new vd2(15));
        n432.b(hx1.d, new vd2(15));
        if (n43.b) {
            ((LinkedHashMap) n432.e).put("DefaultTransformers", new vd2(13));
        }
        n432.b(t63.b, new vd2(15));
        wr0 wr0 = g43.b;
        n432.b(wr0, new vd2(15));
        if (n43.a) {
            n432.b(w53.d, new vd2(15));
        }
        n432.a = n43.a;
        n432.b = n43.b;
        ((LinkedHashMap) n432.c).putAll((LinkedHashMap) n43.c);
        ((LinkedHashMap) n432.d).putAll((LinkedHashMap) n43.d);
        ((LinkedHashMap) n432.e).putAll((LinkedHashMap) n43.e);
        if (n43.b) {
            n432.b(q53.b, new vd2(15));
        }
        au auVar = cn1.a;
        n432.b(wr0, new f81(n432));
        for (vr2 y2 : ((LinkedHashMap) n432.c).values()) {
            y2.y(this);
        }
        for (vr2 y3 : ((LinkedHashMap) n432.e).values()) {
            y3.y(this);
        }
        this.A.f(s53.o, new do1((Object) this, (f61) null, 2));
        if (z2) {
            if (q43 instanceof s43) {
                s43.z.incrementAndGet((s43) q43);
            }
            c81 a0 = this.y.a0(me6);
            a0.getClass();
            ((el3) a0).v(new h43(0, q43));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object a(y53 y53, h61 h61) {
        i43 i43;
        int i;
        if (h61 instanceof i43) {
            i43 = (i43) h61;
            int i2 = i43.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i43.B = i2 - Integer.MIN_VALUE;
                Object obj = i43.z;
                i = i43.B;
                if (i != 0) {
                    o85.q(obj);
                    this.E.D(qr0.a);
                    Object obj2 = y53.d;
                    i43.B = 1;
                    obj = this.z.a(y53, obj2, i43);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj.getClass();
                return (l43) obj;
            }
        }
        i43 = new i43(this, h61);
        Object obj3 = i43.z;
        i = i43.B;
        if (i != 0) {
        }
        obj3.getClass();
        return (l43) obj3;
    }

    public final void close() {
        boolean isTerminated;
        if (G.compareAndSet(this, 0, 1)) {
            iz0 iz0 = (iz0) this.D.b(z43.a);
            for (au auVar : dt0.b1(iz0.c().keySet())) {
                auVar.getClass();
                Object b = iz0.b(auVar);
                if (b instanceof AutoCloseable) {
                    AutoCloseable autoCloseable = (AutoCloseable) b;
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z2 = false;
                            while (!isTerminated) {
                                try {
                                    isTerminated = executorService.awaitTermination(1, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z2) {
                                        executorService.shutdownNow();
                                        z2 = true;
                                    }
                                }
                            }
                            if (z2) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                    } else {
                        ku4.v();
                        return;
                    }
                }
            }
            this.x.v0();
        }
    }

    public final e81 k() {
        return this.y;
    }

    public final String toString() {
        return "HttpClient[" + this.w + ']';
    }
}
