package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: lv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class lv8 {
    public static final nv8 a;

    static {
        nv8 nv8;
        try {
            nv8 = rv8.a;
        } catch (NoClassDefFoundError unused) {
            nv8 = null;
        }
        if (nv8 == null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < 3) {
                String str = nv8.a[i];
                try {
                    nv8 = (nv8) Class.forName(str).getConstructor((Class[]) null).newInstance((Object[]) null);
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
        a = nv8;
    }
}
