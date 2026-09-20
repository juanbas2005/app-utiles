package cu.lestebang.utiletecsa.sync.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB7\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lh81;", "ioDispatcher", "Lk40;", "balanceRepository", "Ldv7;", "userPreferencesDataSource", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh81;Lk40;Ldv7;)V", "lh5", "sync"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class PlanExpiryWorker extends CoroutineWorker {
    public static final k26 k = new k26("(\\d{2})-(\\d{2})-(\\d{2})");
    public final Context g;
    public final h81 h;
    public final k40 i;
    public final dv7 j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlanExpiryWorker(Context context, WorkerParameters workerParameters, h81 h81, k40 k40, dv7 dv7) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        h81.getClass();
        k40.getClass();
        dv7.getClass();
        this.g = context;
        this.h = h81;
        this.i = k40;
        this.j = dv7;
    }

    public static final Integer f(PlanExpiryWorker planExpiryWorker, String str, long j2) {
        Object obj;
        planExpiryWorker.getClass();
        xf4 a = k26.a(k, str);
        Object obj2 = null;
        if (a == null) {
            return null;
        }
        String str2 = (String) ((vf4) a.a()).get(1);
        String str3 = (String) ((vf4) a.a()).get(2);
        String str4 = (String) ((vf4) a.a()).get(3);
        try {
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance.clear();
            instance.setLenient(false);
            instance.set(Integer.parseInt(str4) + 2000, Integer.parseInt(str3) - 1, Integer.parseInt(str2));
            obj = Integer.valueOf((int) ((instance.getTimeInMillis() / 86400000) - j2));
        } catch (Throwable th) {
            obj = new m66(th);
        }
        if (!(obj instanceof m66)) {
            obj2 = obj;
        }
        return (Integer) obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object c(f61 f61) {
        mh5 mh5;
        int i2;
        if (f61 instanceof mh5) {
            mh5 = (mh5) f61;
            int i3 = mh5.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mh5.B = i3 - Integer.MIN_VALUE;
                Object obj = mh5.z;
                i2 = mh5.B;
                if (i2 != 0) {
                    o85.q(obj);
                    nh5 nh5 = new nh5(this, (f61) null);
                    mh5.B = 1;
                    obj = ar7.e0(this.h, nh5, mh5);
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
        mh5 = new mh5(this, (h61) f61);
        Object obj2 = mh5.z;
        i2 = mh5.B;
        if (i2 != 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
