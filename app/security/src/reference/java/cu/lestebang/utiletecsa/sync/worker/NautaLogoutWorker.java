package cu.lestebang.utiletecsa.sync.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcu/lestebang/utiletecsa/sync/worker/NautaLogoutWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lh81;", "ioDispatcher", "Lur4;", "nautaRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh81;Lur4;)V", "sync"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class NautaLogoutWorker extends CoroutineWorker {
    public final h81 g;
    public final ur4 h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NautaLogoutWorker(Context context, WorkerParameters workerParameters, h81 h81, ur4 ur4) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        h81.getClass();
        ur4.getClass();
        this.g = h81;
        this.h = ur4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object c(f61 f61) {
        lr4 lr4;
        int i;
        if (f61 instanceof lr4) {
            lr4 = (lr4) f61;
            int i2 = lr4.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lr4.B = i2 - Integer.MIN_VALUE;
                Object obj = lr4.z;
                i = lr4.B;
                if (i != 0) {
                    o85.q(obj);
                    ot otVar = new ot(this, (f61) null, 19);
                    lr4.B = 1;
                    obj = ar7.e0(this.g, otVar, lr4);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj.getClass();
                return obj;
            }
        }
        lr4 = new lr4(this, (h61) f61);
        Object obj2 = lr4.z;
        i = lr4.B;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
