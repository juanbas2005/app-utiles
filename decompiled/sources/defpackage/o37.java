package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o37  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class o37 implements n37 {
    public final yt w = new AtomicInteger(0);

    public final boolean b(int i) {
        if ((this.w.get() & i) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    public final void c(int i) {
        yt ytVar;
        int i2;
        do {
            ytVar = this.w;
            i2 = ytVar.get();
            if ((i2 & i) != 0 || ytVar.compareAndSet(i2, i2 | i)) {
            }
        } while (ytVar.compareAndSet(i2, i2 | i));
    }
}
