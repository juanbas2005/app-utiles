package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tt  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tt implements Runnable {
    public static Handler B;
    public final /* synthetic */ ai8 A;
    public final il4 w = new il4(this, new hl4(0, this));
    public volatile int x = 1;
    public final AtomicBoolean y = new AtomicBoolean();
    public final AtomicBoolean z = new AtomicBoolean();

    public tt(ai8 ai8) {
        this.A = ai8;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (tt.class) {
            try {
                if (B == null) {
                    B = new Handler(Looper.getMainLooper());
                }
                handler = B;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        handler.post(new nt2(this, false, obj, 8));
    }

    public final void run() {
        this.A.c();
    }
}
