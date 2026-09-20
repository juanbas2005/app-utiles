package cu.lestebang.utiletecsa.sync.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB7\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lh81;", "ioDispatcher", "Lk40;", "balanceRepository", "Ldv7;", "userPreferencesDataSource", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh81;Lk40;Ldv7;)V", "lh5", "sync"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class PlanExpiryWorker extends CoroutineWorker {
    public static final k26 k = new k26("(\\d{2})-(\\d{2})-(\\d{2})");
    public final Context g;
    public final h81 h;
    public final k40 i;
    public final dv7 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanExpiryWorker(Context context, WorkerParameters workerParameters, h81 h81Var, k40 k40Var, dv7 dv7Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        h81Var.getClass();
        k40Var.getClass();
        dv7Var.getClass();
        this.g = context;
        this.h = h81Var;
        this.i = k40Var;
        this.j = dv7Var;
    }

    public static final Integer f(PlanExpiryWorker planExpiryWorker, String str, long j) {
        Object m66Var;
        planExpiryWorker.getClass();
        xf4 a = k26.a(k, str);
        Object obj = null;
        if (a == null) {
            return null;
        }
        String str2 = (String) ((vf4) a.a()).get(1);
        String str3 = (String) ((vf4) a.a()).get(2);
        String str4 = (String) ((vf4) a.a()).get(3);
        try {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.clear();
            calendar.setLenient(false);
            calendar.set(Integer.parseInt(str4) + 2000, Integer.parseInt(str3) - 1, Integer.parseInt(str2));
            m66Var = Integer.valueOf((int) ((calendar.getTimeInMillis() / 86400000) - j));
        } catch (Throwable th) {
            m66Var = new m66(th);
        }
        if (!(m66Var instanceof m66)) {
            obj = m66Var;
        }
        return (Integer) obj;
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
            boolean r0 = r5 instanceof defpackage.mh5
            if (r0 == 0) goto L13
            r0 = r5
            mh5 r0 = (defpackage.mh5) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L1a
        L13:
            mh5 r0 = new mh5
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
            goto L43
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h.s(r4)
            return r2
        L2e:
            defpackage.o85.q(r5)
            nh5 r5 = new nh5
            r5.<init>(r4, r2)
            r0.B = r3
            h81 r4 = r4.h
            java.lang.Object r5 = defpackage.ar7.e0(r4, r5, r0)
            p81 r4 = defpackage.p81.w
            if (r5 != r4) goto L43
            return r4
        L43:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.lestebang.utiletecsa.sync.worker.PlanExpiryWorker.c(f61):java.lang.Object");
    }
}
