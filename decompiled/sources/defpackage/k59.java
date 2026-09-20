package defpackage;

import java.util.Iterator;

/* renamed from: k59  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class k59 {
    public static final js a = new zt6(0);

    public static synchronized void a() {
        synchronized (k59.class) {
            js jsVar = a;
            Iterator it = ((hs) jsVar.values()).iterator();
            if (!it.hasNext()) {
                jsVar.clear();
            } else if (it.next() == null) {
                throw null;
            } else {
                throw new ClassCastException();
            }
        }
    }
}
