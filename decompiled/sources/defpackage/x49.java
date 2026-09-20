package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: x49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x49 {
    public static final Object j = new Object();
    public static final AtomicReference k = new AtomicReference();
    public static volatile x49 l = null;
    public static final x77 m = n85.k(jx8.A);
    public final fm8 a = new fm8(8);
    public final Context b;
    public final x77 c;
    public final x77 d;
    public final x77 e;
    public final x77 f;
    public final ca9 g;
    public final x77 h;
    public final n99 i;

    public x49(Context context, x77 x77, x77 x772, x77 x773, x77 x774, x77 x775) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        x77.getClass();
        x772.getClass();
        x773.getClass();
        x774.getClass();
        x775.getClass();
        x77 k2 = n85.k(x77);
        x77 k3 = n85.k(x772);
        x77 k4 = n85.k(new rg4(24, (Object) x773));
        x77 k5 = n85.k(x774);
        x77 k6 = n85.k(x775);
        this.b = applicationContext;
        this.c = k2;
        this.d = k3;
        this.e = k4;
        this.f = k5;
        this.g = new ca9(applicationContext, k2, k5, k3);
        this.h = k6;
        this.i = new n99(applicationContext, k2, k4, k3);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [bn8, java.lang.Exception] */
    public static void b() {
        synchronized (pd8.x) {
        }
        if (k.get() == null && pd8.y == null) {
            pd8.y = new Exception();
        }
    }

    public final jm4 a() {
        return (jm4) this.c.get();
    }
}
