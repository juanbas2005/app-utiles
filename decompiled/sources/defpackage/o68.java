package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: o68  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class o68 {
    public static boolean a;
    public static Method b;
    public static final boolean c;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 27) {
            z = true;
        } else {
            z = false;
        }
        c = z;
    }
}
