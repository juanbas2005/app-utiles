package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: o99  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o99 implements q99 {
    public static boolean d;
    public final x77 a;
    public final int b = Math.max(5, 10);
    public final rx8 c;

    public o99(x77 x77) {
        rx8 rx8 = rx8.z;
        this.a = x77;
        this.c = rx8;
    }

    public final void a() {
        synchronized (o99.class) {
            try {
                if (!d) {
                    m89 m89 = new m89(4, (Object) this);
                    long j = (long) this.b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    jm4 jm4 = (jm4) this.a.get();
                    w97 w97 = new w97(this, m89, jm4, j);
                    jm4.getClass();
                    ho7 ho7 = new ho7(Executors.callable(w97, (Object) null));
                    hm4 hm4 = new hm4(ho7, jm4.x.schedule(ho7, j, timeUnit));
                    hm4.a(new m89(2, (Object) hm4), fv1.w);
                    d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
