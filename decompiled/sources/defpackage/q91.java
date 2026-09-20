package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: q91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q91 {
    public static final hz2 c = new hz2(25);
    public final s75 a;
    public final AtomicReference b = new AtomicReference((Object) null);

    public q91(s75 s75) {
        this.a = s75;
        s75.a(new c9(3, this));
    }

    public final hz2 a() {
        q91 q91 = (q91) this.b.get();
        if (q91 == null) {
            return c;
        }
        return q91.a();
    }

    public final boolean b() {
        q91 q91 = (q91) this.b.get();
        if (q91 == null || !q91.b()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        q91 q91 = (q91) this.b.get();
        if (q91 == null || !q91.c()) {
            return false;
        }
        return true;
    }

    public final void d(String str, long j, p10 p10) {
        String y = b81.y("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", y, (Throwable) null);
        }
        this.a.a(new tz0((Object) str, j, (Object) p10));
    }
}
