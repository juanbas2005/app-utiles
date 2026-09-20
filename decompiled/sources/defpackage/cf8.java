package defpackage;

import android.content.Context;

/* renamed from: cf8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cf8 {
    public static final cf8 b;
    public tb1 a;

    /* JADX WARNING: type inference failed for: r0v0, types: [cf8, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.a = null;
        b = obj;
    }

    public static tb1 a(Context context) {
        tb1 tb1;
        cf8 cf8 = b;
        synchronized (cf8) {
            try {
                if (cf8.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cf8.a = new tb1(context, (byte) 0);
                }
                tb1 = cf8.a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return tb1;
    }
}
