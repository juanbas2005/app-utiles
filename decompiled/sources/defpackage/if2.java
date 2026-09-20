package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: if2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class if2 {
    public static final rg b = rg.d();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public if2(oe2 oe2, nu5 nu5, we2 we2, nu5 nu52, RemoteConfigManager remoteConfigManager, b01 b01, SessionManager sessionManager) {
        Bundle bundle;
        h93 h93;
        boolean z;
        if (oe2 == null) {
            new h93(new Bundle());
            return;
        }
        cf2 cf2 = oe2.c;
        hn7 hn7 = hn7.O;
        hn7.z = oe2;
        oe2.a();
        hn7.L = cf2.h;
        hn7.B = we2;
        hn7.C = nu52;
        hn7.E.execute(new gn7(hn7, 1));
        oe2.a();
        Context context = oe2.a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d("isEnabled", "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        if (bundle == null) {
            h93 = new h93();
        }
        remoteConfigManager.setFirebaseRemoteConfigProvider(nu5);
        b01.b = h93;
        b01.d.b = jb5.u(context);
        b01.c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean f = b01.f();
        rg rgVar = b;
        if (rgVar.b) {
            if (f != null) {
                z = f.booleanValue();
            } else {
                z = oe2.c().h();
            }
            if (z) {
                oe2.a();
                String concat = "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(gl0.W(cf2.h, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (rgVar.b) {
                    rgVar.a.getClass();
                    Log.i("FirebasePerformance", concat);
                }
            }
        }
    }
}
