package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a82 {
    public static final kw5 c = new kw5(28);
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final jz0 b;

    public a82(String str, boolean z) {
        ReentrantLock reentrantLock;
        jz0 jz0;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        if (z) {
            jz0 = new jz0(str);
        } else {
            jz0 = null;
        }
        this.b = jz0;
    }
}
