package cu.lestebang.utiletecsa.sync.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcu/lestebang/utiletecsa/sync/worker/DelegatingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "sync"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class DelegatingWorker extends CoroutineWorker {
    public final CoroutineWorker g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DelegatingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        String str;
        CoroutineWorker coroutineWorker;
        context.getClass();
        workerParameters.getClass();
        Object obj = workerParameters.b.a.get("JetpackWorkerClassName");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        str = str == null ? "" : str;
        vd1 vd1 = (vd1) ((yz2) ag8.q(b96.v(context.getApplicationContext()), yz2.class));
        lu5 lu5 = vd1.z;
        lu5 lu52 = vd1.D;
        lu5 lu53 = vd1.E;
        lu5 lu54 = vd1.J;
        lu5 lu55 = vd1.K;
        ie1.y("cu.lestebang.utiletecsa.sync.worker.AppUpdateWorker", lu5);
        ie1.y("cu.lestebang.utiletecsa.sync.worker.NautaLogoutWorker", lu52);
        ie1.y("cu.lestebang.utiletecsa.sync.worker.PlanExpiryWorker", lu53);
        ie1.y("cu.lestebang.utiletecsa.sync.worker.SyncWorker", lu54);
        ie1.y("cu.lestebang.utiletecsa.sync.worker.UssdRefreshWorker", lu55);
        mu5 mu5 = (mu5) n36.a(5, new Object[]{"cu.lestebang.utiletecsa.sync.worker.AppUpdateWorker", lu5, "cu.lestebang.utiletecsa.sync.worker.NautaLogoutWorker", lu52, "cu.lestebang.utiletecsa.sync.worker.PlanExpiryWorker", lu53, "cu.lestebang.utiletecsa.sync.worker.SyncWorker", lu54, "cu.lestebang.utiletecsa.sync.worker.UssdRefreshWorker", lu55}, (ig) null).get(str);
        if (mu5 != null) {
            td1 td1 = (td1) mu5.get();
            switch (td1.a) {
                case b85.b:
                    coroutineWorker = new AppUpdateWorker(context, workerParameters, zv1.a(), (dv7) td1.b.a.l.get());
                    break;
                case 1:
                    coroutineWorker = new NautaLogoutWorker(context, workerParameters, zv1.a(), (ur4) td1.b.a.C.get());
                    break;
                case 2:
                    h81 a = zv1.a();
                    vd1 vd12 = td1.b.a;
                    coroutineWorker = new PlanExpiryWorker(context, workerParameters, a, (k40) vd12.s.get(), (dv7) vd12.l.get());
                    break;
                case 3:
                    coroutineWorker = new SyncWorker(context, workerParameters, zv1.a(), (i03) td1.b.a.I.get());
                    break;
                default:
                    coroutineWorker = new UssdRefreshWorker(context, workerParameters, zv1.a(), (k40) td1.b.a.s.get());
                    break;
            }
        } else {
            coroutineWorker = null;
        }
        coroutineWorker = !(coroutineWorker instanceof CoroutineWorker) ? null : coroutineWorker;
        if (coroutineWorker != null) {
            this.g = coroutineWorker;
        } else {
            h.q("Unable to find appropriate worker");
            throw null;
        }
    }

    public final Object c(f61 f61) {
        return this.g.c(f61);
    }

    public final Object d(f61 f61) {
        return this.g.d(f61);
    }
}
