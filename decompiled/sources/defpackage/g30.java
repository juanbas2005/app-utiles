package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* renamed from: g30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g30 {
    public final ArrayList a;
    public boolean b;
    public final CopyOnWriteArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public g30(boolean z) {
        this.a = new ArrayList();
        this.b = z;
        this.c = new CopyOnWriteArrayList();
    }

    public final void d() {
        boolean isTerminated;
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else {
                ku4.v();
                return;
            }
        }
        copyOnWriteArrayList.clear();
        ArrayList arrayList = this.a;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((q45) it2.next()).h();
        }
        arrayList.clear();
    }

    public final void e(boolean z) {
        boolean z2;
        this.b = z;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            q45 q45 = (q45) it.next();
            if (!q45.i || !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            q45.i(z2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g30(int i, Object obj) {
        this(false);
        this.d = i;
        this.e = obj;
    }

    public final void a() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public g30(lf lfVar) {
        this(true);
        this.d = 3;
        this.e = lfVar;
    }

    public final void b(e30 e30) {
    }

    public final void c(e30 e30) {
    }
}
