package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bc implements ac {
    public static volatile bc c;
    public final AppMeasurementSdk a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public bc(AppMeasurementSdk appMeasurementSdk) {
        z65.k(appMeasurementSdk);
        this.a = appMeasurementSdk;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (at8.a(str) && at8.b(str2, bundle) && at8.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1);
            }
            this.a.logEvent(str, str2, bundle);
        }
    }

    public final pe2 b(String str, jz0 jz0) {
        Object obj;
        if (at8.a(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean equals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.a;
                if (equals) {
                    obj = new k68(appMeasurementSdk, jz0);
                } else if ("clx".equals(str)) {
                    obj = new br4(appMeasurementSdk, jz0);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    concurrentHashMap.put(str, obj);
                    return new pe2(19);
                }
            }
        }
        return null;
    }
}
