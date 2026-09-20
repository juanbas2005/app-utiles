package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: e35  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e35 {
    public final ReentrantLock a = new ReentrantLock();
    public final long[] b;
    public final boolean[] c;
    public volatile boolean d;
    public final ReentrantLock e;
    public volatile boolean f;

    public e35(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
        this.e = new ReentrantLock();
    }
}
