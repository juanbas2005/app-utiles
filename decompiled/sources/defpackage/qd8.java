package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* renamed from: qd8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qd8 {
    public final ol6 a;
    public final h81 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final iy2 d = new iy2(2, this);

    public qd8(ExecutorService executorService) {
        ol6 ol6 = new ol6(executorService, 0);
        this.a = ol6;
        this.b = we.l(ol6);
    }
}
