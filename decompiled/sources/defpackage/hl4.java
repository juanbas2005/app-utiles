package defpackage;

import android.os.Binder;
import android.os.Process;
import androidx.core.os.OperationCanceledException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hl4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hl4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public hl4(w29 w29, zr8 zr8, String str) {
        this.a = 2;
        this.b = w29;
    }

    public final Object call() {
        Object obj = null;
        switch (this.a) {
            case b85.b:
                tt ttVar = (tt) this.b;
                AtomicBoolean atomicBoolean = ttVar.y;
                ttVar.z.set(true);
                try {
                    Process.setThreadPriority(10);
                    obj = ttVar.A.e();
                } catch (OperationCanceledException e) {
                    if (!atomicBoolean.get()) {
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        atomicBoolean.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        ttVar.a((Object) null);
                        throw th2;
                    }
                }
                Binder.flushPendingCommands();
                ttVar.a(obj);
                return obj;
            case 1:
                return new v39(((j19) this.b).H);
            case 2:
                w29 w29 = (w29) this.b;
                w29.d.T();
                xz8 xz8 = w29.d.D;
                v89.R(xz8);
                xz8.b1();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                k68 k68 = (k68) this.b;
                synchronized (((eb9) k68.y).g) {
                    k68.x = null;
                }
                return null;
        }
    }

    public /* synthetic */ hl4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
