package cu.lestebang.utiletecsa.sync.worker;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import cu.lestebang.utiletecsa.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcu/lestebang/utiletecsa/sync/worker/SyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lh81;", "ioDispatcher", "Li03;", "homeRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh81;Li03;)V", "sync"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class SyncWorker extends CoroutineWorker {
    public final Context g;
    public final h81 h;
    public final i03 i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SyncWorker(Context context, WorkerParameters workerParameters, h81 h81, i03 i03) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        h81.getClass();
        i03.getClass();
        this.g = context;
        this.h = h81;
        this.i = i03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object c(f61 f61) {
        x97 x97;
        int i2;
        if (f61 instanceof x97) {
            x97 = (x97) f61;
            int i3 = x97.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x97.B = i3 - Integer.MIN_VALUE;
                Object obj = x97.z;
                i2 = x97.B;
                if (i2 != 0) {
                    o85.q(obj);
                    k05 k05 = new k05((Object) this, (f61) null, 26);
                    x97.B = 1;
                    obj = ar7.e0(this.h, k05, x97);
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
        x97 = new x97(this, (h61) f61);
        Object obj2 = x97.z;
        i2 = x97.B;
        if (i2 != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    public final Object d(f61 f61) {
        return f(0, 0);
    }

    public final hm2 f(int i2, int i3) {
        Context context = this.g;
        context.getClass();
        sg3.p(context, "SyncNotificationChannel", R.string.sync_work_notification_channel_name, R.string.sync_work_notification_channel_description, 2);
        Intent intent = new Intent();
        String packageName = context.getPackageName();
        String packageName2 = context.getPackageName();
        intent.setClassName(packageName, packageName2 + ".MainActivity");
        intent.addFlags(268435456);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 67108864);
        d15 d15 = new d15(context, "SyncNotificationChannel");
        d15.y.icon = R.drawable.ic_sync;
        d15.e = d15.b(context.getString(R.string.sync_work_notification_title, new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}));
        d15.k = 0;
        d15.c(2, true);
        d15.c(8, true);
        d15.n = i2;
        d15.o = i3;
        d15.g = activity;
        Notification a = d15.a();
        a.getClass();
        return new hm2(0, a, 1);
    }
}
