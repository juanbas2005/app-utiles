package defpackage;

/* renamed from: tu2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tu2 implements nd5 {
    static {
        if (x92.a == null) {
            synchronized (x92.class) {
                try {
                    if (x92.a == null) {
                        Class cls = u92.a;
                        x92 x92 = null;
                        if (cls != null) {
                            try {
                                x92 = (x92) cls.getDeclaredMethod("getEmptyRegistry", (Class[]) null).invoke((Object) null, (Object[]) null);
                            } catch (Exception unused) {
                            }
                        }
                        if (x92 == null) {
                            x92 = x92.b;
                        }
                        x92.a = x92;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
