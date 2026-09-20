package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: dz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class dz0 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
