package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* renamed from: ka2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ka2 {
    public static final List a;

    /* JADX WARNING: type inference failed for: r0v1, types: [kx3, java.lang.Object] */
    static {
        try {
            Iterator it = Arrays.asList(new kx3[]{new Object()}).iterator();
            it.getClass();
            a = cl6.V(cl6.O(it));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
