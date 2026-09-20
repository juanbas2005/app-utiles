package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* renamed from: pe4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class pe4 {
    public static final gy2 a;

    /* JADX WARNING: type inference failed for: r0v3, types: [rf, java.lang.Object] */
    static {
        String str;
        int i = pa7.a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = cl6.V(cl6.O(Arrays.asList(new rf[]{new Object()}).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((rf) obj).getClass();
                    do {
                        ((rf) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((rf) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    a = new gy2(hy2.a(mainLooper));
                } else {
                    h.s("The main looper is not available");
                }
            } else {
                h.s("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
