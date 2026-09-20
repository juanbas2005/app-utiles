package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;

/* renamed from: cj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cj extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ cj(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [gk8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.lang.Object, vq8] */
    /* JADX WARNING: type inference failed for: r3v11, types: [java.lang.Object, ic9] */
    public final Object initialValue() {
        switch (this.a) {
            case b85.b:
                Choreographer instance = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    ej ejVar = new ej(instance, x91.u(myLooper));
                    return rc9.D0(ejVar, ejVar.H);
                }
                h.s("no Looper on this thread");
                return null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(fg8.a);
                return simpleDateFormat;
            case 2:
                return new Random();
            case 3:
                return Boolean.FALSE;
            case 4:
                ? obj = new Object();
                obj.w = 0;
                return obj;
            case 5:
                Thread.currentThread();
                if (p25.d == null) {
                    p25.d = Looper.getMainLooper().getThread();
                }
                ? obj2 = new Object();
                obj2.a = false;
                obj2.b = null;
                obj2.c = null;
                obj2.d = null;
                Thread currentThread = Thread.currentThread();
                WeakHashMap weakHashMap = sp8.d;
                synchronized (weakHashMap) {
                    weakHashMap.put(currentThread, obj2);
                }
                return obj2;
            case 6:
                return 0L;
            case 7:
                ag8.M(Thread.currentThread());
                ? obj3 = new Object();
                obj3.a = false;
                obj3.b = null;
                Thread currentThread2 = Thread.currentThread();
                WeakHashMap weakHashMap2 = vb9.c;
                synchronized (weakHashMap2) {
                    weakHashMap2.put(currentThread2, obj3);
                }
                return obj3;
            default:
                return new Random();
        }
    }
}
