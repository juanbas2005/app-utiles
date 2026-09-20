package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class o84 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ AtomicBoolean x;

    public /* synthetic */ o84(AtomicBoolean atomicBoolean, int i) {
        this.w = i;
        this.x = atomicBoolean;
    }

    public final void run() {
        int i = this.w;
        AtomicBoolean atomicBoolean = this.x;
        switch (i) {
            case b85.b:
                atomicBoolean.set(true);
                return;
            default:
                atomicBoolean.set(true);
                return;
        }
    }
}
