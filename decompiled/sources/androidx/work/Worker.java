package androidx.work;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "Lt84;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class Worker extends t84 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public final bj0 a() {
        ExecutorService executorService = this.b.d;
        executorService.getClass();
        return ar7.v(new yv0(18, (Object) executorService, (Object) new wi7(27, this)));
    }

    public final bj0 b() {
        ExecutorService executorService = this.b.d;
        executorService.getClass();
        return ar7.v(new yv0(18, (Object) executorService, (Object) new fd7(12, (Object) this)));
    }

    public abstract r84 c();
}
