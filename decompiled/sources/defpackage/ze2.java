package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;

/* renamed from: ze2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ze2 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ FirebaseMessaging x;

    public /* synthetic */ ze2(FirebaseMessaging firebaseMessaging, int i) {
        this.w = i;
        this.x = firebaseMessaging;
    }

    public final void run() {
        yb9 yb9;
        int i;
        int i2 = this.w;
        FirebaseMessaging firebaseMessaging = this.x;
        switch (i2) {
            case b85.b:
                if (firebaseMessaging.f.e() && firebaseMessaging.h(firebaseMessaging.d())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.k) {
                            firebaseMessaging.g(0);
                        }
                    }
                    return;
                }
                return;
            default:
                Context context = firebaseMessaging.b;
                b35.u(context);
                kd6 kd6 = firebaseMessaging.c;
                boolean f = firebaseMessaging.f();
                if (Build.VERSION.SDK_INT >= 29) {
                    SharedPreferences h = c35.h(context);
                    if (!h.contains("proxy_retention") || h.getBoolean("proxy_retention", false) != f) {
                        ha6 ha6 = (ha6) kd6.z;
                        if (ha6.c.s() >= 241100000) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("proxy_retention", f);
                            kb9 s = kb9.s(ha6.b);
                            synchronized (s) {
                                i = s.x;
                                s.x = i + 1;
                            }
                            yb9 = s.t(new ba9(i, 4, bundle, 0));
                        } else {
                            yb9 = b35.k(new IOException("SERVICE_NOT_AVAILABLE"));
                        }
                        yb9.e(new or(1), new pu5(context, f));
                    }
                }
                if (firebaseMessaging.f()) {
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
