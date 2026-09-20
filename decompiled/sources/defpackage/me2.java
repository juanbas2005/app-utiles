package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: me2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class me2 implements u30 {
    public static final AtomicReference a = new AtomicReference();

    public final void a(boolean z) {
        synchronized (oe2.k) {
            try {
                Iterator it = new ArrayList(oe2.l.values()).iterator();
                while (it.hasNext()) {
                    oe2 oe2 = (oe2) it.next();
                    if (oe2.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = oe2.i.iterator();
                        while (it2.hasNext()) {
                            oe2 oe22 = ((le2) it2.next()).a;
                            if (!z) {
                                ((wl1) oe22.h.get()).b();
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
