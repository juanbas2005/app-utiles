package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* renamed from: sf2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sf2 {
    public final oe2 a;
    public final rn6 b;

    public sf2(oe2 oe2, rn6 rn6, e81 e81, pn6 pn6) {
        oe2.getClass();
        rn6.getClass();
        e81.getClass();
        pn6.getClass();
        this.a = oe2;
        this.b = rn6;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.6.");
        oe2.a();
        Context applicationContext = oe2.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(pn6);
            ar7.H(gl0.E(e81), (e81) null, (r81) null, new ju1(this, pn6, (f61) null, 1), 3);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
