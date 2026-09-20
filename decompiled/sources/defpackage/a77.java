package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: a77  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a77 implements r73 {
    public volatile boolean w = false;
    public final ConcurrentHashMap x = new ConcurrentHashMap();
    public final LinkedBlockingQueue y = new LinkedBlockingQueue();

    public final synchronized cc4 f(String str) {
        z67 z67;
        z67 = (z67) this.x.get(str);
        if (z67 == null) {
            z67 = new z67(str, this.y, this.w);
            this.x.put(str, z67);
        }
        return z67;
    }
}
