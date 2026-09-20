package cu.lestebang.utiletecsa.sync.worker;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import cu.lestebang.utiletecsa.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcu/lestebang/utiletecsa/sync/worker/UssdRefreshWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lh81;", "ioDispatcher", "Lk40;", "balanceRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh81;Lk40;)V", "sync"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class UssdRefreshWorker extends CoroutineWorker {
    public final Context g;
    public final h81 h;
    public final k40 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UssdRefreshWorker(Context context, WorkerParameters workerParameters, h81 h81, k40 k40) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        h81.getClass();
        k40.getClass();
        this.g = context;
        this.h = h81;
        this.i = k40;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object c(f61 f61) {
        dz7 dz7;
        int i2;
        if (f61 instanceof dz7) {
            dz7 = (dz7) f61;
            int i3 = dz7.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dz7.B = i3 - Integer.MIN_VALUE;
                Object obj = dz7.z;
                i2 = dz7.B;
                if (i2 != 0) {
                    o85.q(obj);
                    zw7 zw7 = new zw7((Object) this, (f61) null, 5);
                    dz7.B = 1;
                    obj = ar7.e0(this.h, zw7, dz7);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj.getClass();
                return obj;
            }
        }
        dz7 = new dz7(this, (h61) f61);
        Object obj2 = dz7.z;
        i2 = dz7.B;
        if (i2 != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    public final Object d(f61 f61) {
        PendingIntent pendingIntent;
        Context context = this.g;
        sg3.p(context, "UssdRefreshChannel", R.string.ussd_refresh_channel_name, R.string.ussd_refresh_channel_description, 2);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            pendingIntent = PendingIntent.getActivity(context, 0, launchIntentForPackage, 201326592);
        } else {
            pendingIntent = null;
        }
        return new hm2(202611, sg3.n(context, "UssdRefreshChannel", R.string.ussd_refresh_notification_title, R.string.ussd_refresh_notification_text, context.getApplicationInfo().icon, pendingIntent), 1);
    }
}
