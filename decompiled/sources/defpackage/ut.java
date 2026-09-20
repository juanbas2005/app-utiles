package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ut  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ut extends Thread {
    public final /* synthetic */ int w = 0;

    public /* synthetic */ ut(String str) {
        super(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|13|14|15|(4:17|18|19|20)(2:23|(2:25|31)(1:30))|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        r2.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0015 A[LOOP:1: B:12:0x0015->B:28:0x0015, LOOP_START, SYNTHETIC, Splitter:B:12:0x0015] */
    public final void run() {
        switch (this.w) {
            case b85.b:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        wait();
                    }
                }
                return;
        }
        while (true) {
            qa qaVar = vt.h;
            ReentrantLock reentrantLock = vt.j;
            reentrantLock.lock();
            vt i = kw5.i();
            if (i == vt.i) {
                vt.i = null;
                continue;
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            if (i != null) {
                i.k();
            }
        }
    }

    public /* synthetic */ ut(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
