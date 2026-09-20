package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: dj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dj implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ ej w;

    public dj(ej ejVar) {
        this.w = ejVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r4 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r1 >= r4) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        ((android.view.Choreographer.FrameCallback) r2.get(r1)).doFrame(r5);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return;
     */
    public final void doFrame(long j) {
        this.w.z.removeCallbacks(this);
        ej.o0(this.w);
        ej ejVar = this.w;
        synchronized (ejVar.A) {
            if (ejVar.F) {
                int i = 0;
                ejVar.F = false;
                ArrayList arrayList = ejVar.C;
                ejVar.C = ejVar.D;
                ejVar.D = arrayList;
            }
        }
    }

    public final void run() {
        ej.o0(this.w);
        ej ejVar = this.w;
        synchronized (ejVar.A) {
            if (ejVar.C.isEmpty()) {
                ejVar.y.removeFrameCallback(this);
                ejVar.F = false;
            }
        }
    }
}
