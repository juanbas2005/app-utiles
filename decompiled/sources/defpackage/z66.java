package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: z66  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z66 {
    public final HashSet a = new HashSet();

    public final void a() {
        if (fb5.a == null) {
            fb5.a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == fb5.a) {
            Iterator it = this.a.iterator();
            if (it.hasNext()) {
                throw pb4.g(it);
            }
            return;
        }
        h.s("Must be called on the Main thread.");
    }
}
