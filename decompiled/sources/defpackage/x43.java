package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* renamed from: x43  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class x43 {
    public static final b45 a = b45.a;

    static {
        Object obj;
        try {
            Iterator it = Arrays.asList(new v43[]{new Object()}).iterator();
            it.getClass();
            Iterator it2 = ((g21) cl6.O(it)).iterator();
            if (!it2.hasNext()) {
                obj = null;
            } else {
                obj = it2.next();
            }
            if (((v43) obj) != null) {
            } else {
                h.s("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
