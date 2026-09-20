package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: cc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class cc implements ub0, ec, ko1 {
    public final /* synthetic */ dc w;

    public /* synthetic */ cc(dc dcVar) {
        this.w = dcVar;
    }

    public void e(nu5 nu5) {
        dc dcVar = this.w;
        g22 g22 = g22.D;
        g22.o("AnalyticsConnector now available.");
        ac acVar = (ac) nu5.get();
        f96 f96 = new f96(14, (Object) acVar);
        jz0 jz0 = new jz0(4, false);
        bc bcVar = (bc) acVar;
        pe2 b = bcVar.b("clx", jz0);
        if (b == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", (Throwable) null);
            }
            b = bcVar.b("crash", jz0);
            if (b != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", (Throwable) null);
            }
        }
        if (b != null) {
            g22.o("Registered Firebase Analytics listener.");
            ns8 ns8 = new ns8(7, false);
            wr0 wr0 = new wr0(f96);
            synchronized (dcVar) {
                try {
                    Iterator it = ((ArrayList) dcVar.a).iterator();
                    while (it.hasNext()) {
                        ns8.m((m91) it.next());
                    }
                    jz0.y = ns8;
                    jz0.x = wr0;
                    dcVar.c = ns8;
                    dcVar.b = wr0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        g22.v("Could not register Firebase Analytics listener; a listener is already registered.", (Exception) null);
    }

    public void j(Bundle bundle) {
        ((ec) this.w.b).j(bundle);
    }

    public void m(m91 m91) {
        dc dcVar = this.w;
        synchronized (dcVar) {
            try {
                if (((ub0) dcVar.c) instanceof lv1) {
                    ((ArrayList) dcVar.a).add(m91);
                }
                ((ub0) dcVar.c).m(m91);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
