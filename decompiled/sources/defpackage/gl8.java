package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: gl8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gl8 {
    public static volatile gl8 a;
    public static final gl8 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [gl8, java.lang.Object] */
    static {
        ? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static gl8 a() {
        gl8 gl8 = a;
        if (gl8 != null) {
            return gl8;
        }
        synchronized (gl8.class) {
            try {
                gl8 gl82 = a;
                if (gl82 != null) {
                    return gl82;
                }
                int i = rk8.a;
                gl8 Q = kl8.Q();
                a = Q;
                return Q;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
