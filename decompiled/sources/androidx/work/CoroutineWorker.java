package androidx.work;

import android.content.Context;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lt84;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "s81", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class CoroutineWorker extends t84 {
    public final WorkerParameters e;
    public final s81 f = s81.y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
    }

    public final bj0 a() {
        fl3 l = r16.l();
        s81 s81 = this.f;
        s81.getClass();
        return x91.E(rc9.D0(s81, l), new t81(this, (f61) null, 0));
    }

    public final bj0 b() {
        s81 s81 = s81.y;
        e81 e81 = this.f;
        if (sg3.e(e81, s81)) {
            e81 = this.e.e;
        }
        e81.getClass();
        return x91.E(e81.X(r16.l()), new t81(this, (f61) null, 1));
    }

    public abstract Object c(f61 f61);

    public Object d(f61 f61) {
        throw new IllegalStateException("Not implemented");
    }

    public final Object e(hm2 hm2, f61 f61) {
        WorkerParameters workerParameters = this.b;
        hd8 hd8 = workerParameters.h;
        UUID uuid = workerParameters.a;
        ol6 ol6 = hd8.a.a;
        mm0 mm0 = new mm0((Object) hd8, (Object) uuid, (Object) hm2, (Object) this.a, 10);
        ol6.getClass();
        Object h = ed1.h(ar7.v(new yv0(10, (Object) ol6, (Object) mm0)), f61);
        if (h == p81.w) {
            return h;
        }
        return vs7.a;
    }
}
