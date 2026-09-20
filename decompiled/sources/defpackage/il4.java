package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: il4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class il4 extends FutureTask {
    public final /* synthetic */ tt w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public il4(tt ttVar, hl4 hl4) {
        super(hl4);
        this.w = ttVar;
    }

    public final void done() {
        tt ttVar = this.w;
        AtomicBoolean atomicBoolean = ttVar.z;
        try {
            Object obj = get();
            if (!atomicBoolean.get()) {
                ttVar.a(obj);
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            ku4.o("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException unused) {
            if (!atomicBoolean.get()) {
                ttVar.a((Object) null);
            }
        } catch (Throwable th) {
            ku4.o("An error occurred while executing doInBackground()", th);
        }
    }
}
