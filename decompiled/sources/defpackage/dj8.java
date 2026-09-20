package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: dj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class dj8 {
    public static final ej8 a;

    static {
        ej8 ej8;
        try {
            ej8 = jj8.a;
        } catch (NoClassDefFoundError unused) {
            ej8 = null;
        }
        if (ej8 == null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < 3) {
                String str = ej8.a[i];
                try {
                    ej8 = (ej8) Class.forName(str).getConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (Throwable th) {
                    th = th;
                    sb.append(10);
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                    i++;
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        a = ej8;
    }
}
