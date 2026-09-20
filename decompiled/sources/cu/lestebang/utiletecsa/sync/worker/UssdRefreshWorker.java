package cu.lestebang.utiletecsa.sync.worker;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import cu.lestebang.utiletecsa.R;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcu/lestebang/utiletecsa/sync/worker/UssdRefreshWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lh81;", "ioDispatcher", "Lk40;", "balanceRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh81;Lk40;)V", "sync"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class UssdRefreshWorker extends CoroutineWorker {
    public final Context g;
    public final h81 h;
    public final k40 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UssdRefreshWorker(Context context, WorkerParameters workerParameters, h81 h81Var, k40 k40Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        h81Var.getClass();
        k40Var.getClass();
        this.g = context;
        this.h = h81Var;
        this.i = k40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.f61 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dz7
            if (r0 == 0) goto L13
            r0 = r5
            dz7 r0 = (defpackage.dz7) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L1a
        L13:
            dz7 r0 = new dz7
            h61 r5 = (defpackage.h61) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.z
            int r1 = r0.B
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.o85.q(r5)
            goto L44
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r4)
            return r2
        L2e:
            defpackage.o85.q(r5)
            zw7 r5 = new zw7
            r1 = 5
            r5.<init>(r4, r2, r1)
            r0.B = r3
            h81 r4 = r4.h
            java.lang.Object r5 = defpackage.ar7.e0(r4, r5, r0)
            p81 r4 = defpackage.p81.w
            if (r5 != r4) goto L44
            return r4
        L44:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.lestebang.utiletecsa.sync.worker.UssdRefreshWorker.c(f61):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object d(f61 f61Var) {
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
