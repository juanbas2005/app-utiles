package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: z92  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z92 {
    public static volatile z92 a;
    public static final z92 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [z92, java.lang.Object] */
    static {
        ? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static z92 a() {
        z92 z92;
        bu5 bu5 = bu5.c;
        z92 z922 = a;
        if (z922 != null) {
            return z922;
        }
        synchronized (z92.class) {
            try {
                z92 = a;
                if (z92 == null) {
                    Class cls = v92.a;
                    z92 z923 = null;
                    if (cls != null) {
                        try {
                            z923 = (z92) cls.getDeclaredMethod("getEmptyRegistry", (Class[]) null).invoke((Object) null, (Object[]) null);
                        } catch (Exception unused) {
                        }
                    }
                    if (z923 != null) {
                        z92 = z923;
                    } else {
                        z92 = b;
                    }
                    a = z92;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z92;
    }
}
