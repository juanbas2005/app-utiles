package cu.lestebang.utiletecsa.sync.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcu/lestebang/utiletecsa/sync/worker/DelegatingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "sync"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class DelegatingWorker extends CoroutineWorker {
    public final CoroutineWorker g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegatingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        String str;
        CoroutineWorker appUpdateWorker;
        context.getClass();
        workerParameters.getClass();
        Object obj = workerParameters.b.a.get("JetpackWorkerClassName");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        str = str == null ? "" : str;
        vd1 vd1Var = (vd1) ((yz2) ag8.q(b96.v(context.getApplicationContext()), yz2.class));
        lu5 lu5Var = vd1Var.z;
        lu5 lu5Var2 = vd1Var.D;
        lu5 lu5Var3 = vd1Var.E;
        lu5 lu5Var4 = vd1Var.J;
        lu5 lu5Var5 = vd1Var.K;
        ie1.y("cu.lestebang.utiletecsa.sync.worker.AppUpdateWorker", lu5Var);
        ie1.y("cu.lestebang.utiletecsa.sync.worker.NautaLogoutWorker", lu5Var2);
        ie1.y("cu.lestebang.utiletecsa.sync.worker.PlanExpiryWorker", lu5Var3);
        ie1.y("cu.lestebang.utiletecsa.sync.worker.SyncWorker", lu5Var4);
        ie1.y("cu.lestebang.utiletecsa.sync.worker.UssdRefreshWorker", lu5Var5);
        mu5 mu5Var = (mu5) n36.a(5, new Object[]{"cu.lestebang.utiletecsa.sync.worker.AppUpdateWorker", lu5Var, "cu.lestebang.utiletecsa.sync.worker.NautaLogoutWorker", lu5Var2, "cu.lestebang.utiletecsa.sync.worker.PlanExpiryWorker", lu5Var3, "cu.lestebang.utiletecsa.sync.worker.SyncWorker", lu5Var4, "cu.lestebang.utiletecsa.sync.worker.UssdRefreshWorker", lu5Var5}, null).get(str);
        if (mu5Var == null) {
            appUpdateWorker = null;
        } else {
            td1 td1Var = (td1) mu5Var.get();
            switch (td1Var.a) {
                case b85.b /* 0 */:
                    appUpdateWorker = new AppUpdateWorker(context, workerParameters, zv1.a(), (dv7) td1Var.b.a.l.get());
                    break;
                case 1:
                    appUpdateWorker = new NautaLogoutWorker(context, workerParameters, zv1.a(), (ur4) td1Var.b.a.C.get());
                    break;
                case 2:
                    h81 a = zv1.a();
                    vd1 vd1Var2 = td1Var.b.a;
                    appUpdateWorker = new PlanExpiryWorker(context, workerParameters, a, (k40) vd1Var2.s.get(), (dv7) vd1Var2.l.get());
                    break;
                case 3:
                    appUpdateWorker = new SyncWorker(context, workerParameters, zv1.a(), (i03) td1Var.b.a.I.get());
                    break;
                default:
                    appUpdateWorker = new UssdRefreshWorker(context, workerParameters, zv1.a(), (k40) td1Var.b.a.s.get());
                    break;
            }
        }
        appUpdateWorker = appUpdateWorker instanceof CoroutineWorker ? appUpdateWorker : null;
        if (appUpdateWorker != null) {
            this.g = appUpdateWorker;
        } else {
            h.q("Unable to find appropriate worker");
            throw null;
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(f61 f61Var) {
        return this.g.c(f61Var);
    }

    @Override // androidx.work.CoroutineWorker
    public final Object d(f61 f61Var) {
        return this.g.d(f61Var);
    }
}
