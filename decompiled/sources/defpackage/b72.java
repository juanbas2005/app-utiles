package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: b72  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b72 implements w67, tu5 {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final hs7 c;

    public b72() {
        hs7 hs7 = hs7.w;
        this.c = hs7;
    }

    public final synchronized void a(Executor executor, e72 e72) {
        Class<ie1> cls = ie1.class;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(cls)) {
                    this.a.put(cls, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(cls)).put(e72, executor);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
