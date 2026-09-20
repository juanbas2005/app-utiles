package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;

/* renamed from: yc8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yc8 extends Binder {
    public final wv2 d;

    public yc8(wv2 wv2) {
        this.d = wv2;
    }

    public final void a(zc8 zc8) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = zc8.a;
            FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.d.x;
            xb7 xb7 = new xb7();
            firebaseMessagingService.w.execute(new ti(firebaseMessagingService, intent, xb7, 6));
            xb7.a.c(new or(1), new c9(22, zc8));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
