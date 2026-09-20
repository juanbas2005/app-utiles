package defpackage;

import android.util.Log;
import java.util.logging.Level;

/* renamed from: f76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class f76 {
    public final String a;

    public /* synthetic */ f76(String str) {
        this.a = str;
    }

    public abstract boolean a(Level level);

    public abstract void b(uc9 uc9);

    public void c(RuntimeException runtimeException, uc9 uc9) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
