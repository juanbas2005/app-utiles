package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: iy2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class iy2 implements Executor {
    public final /* synthetic */ int w;
    public final Object x;

    public iy2() {
        this.w = 4;
        this.x = new ph8(Looper.getMainLooper(), 1);
    }

    public final void execute(Runnable runnable) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                ((ph8) obj).post(runnable);
                return;
            case 1:
                ((Executor) obj).execute(new ee6(runnable, 0));
                return;
            case 2:
                ((qd8) obj).c.post(runnable);
                return;
            case 3:
                r19 r19 = ((y19) ((v49) obj).w).C;
                y19.g(r19);
                r19.l1(runnable);
                return;
            default:
                ((ph8) obj).post(runnable);
                return;
        }
    }

    public /* synthetic */ iy2(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public iy2(Looper looper) {
        this.w = 0;
        this.x = new ph8(looper, 3);
    }
}
