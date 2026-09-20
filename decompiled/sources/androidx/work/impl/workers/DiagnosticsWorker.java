package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public final r84 c() {
        nd8 c = nd8.c(this.a);
        WorkDatabase workDatabase = c.c;
        workDatabase.getClass();
        fe8 w = workDatabase.w();
        td8 u = workDatabase.u();
        he8 x = workDatabase.x();
        ja7 t = workDatabase.t();
        c.b.d.getClass();
        List list = (List) sg3.O(w.a, true, false, new hf(System.currentTimeMillis() - 86400000, 6));
        a96 a96 = w.a;
        List list2 = (List) sg3.O(a96, true, false, new rb8(4));
        List list3 = (List) sg3.O(a96, true, false, new rb8(8));
        if (!list.isEmpty()) {
            bc4 k = bc4.k();
            String str = fu1.a;
            k.m(str, "Recently completed work:\n\n");
            bc4.k().m(str, fu1.a(u, x, t, list));
        }
        if (!list2.isEmpty()) {
            bc4 k2 = bc4.k();
            String str2 = fu1.a;
            k2.m(str2, "Running work:\n\n");
            bc4.k().m(str2, fu1.a(u, x, t, list2));
        }
        if (!list3.isEmpty()) {
            bc4 k3 = bc4.k();
            String str3 = fu1.a;
            k3.m(str3, "Enqueued work:\n\n");
            bc4.k().m(str3, fu1.a(u, x, t, list3));
        }
        return new r84();
    }
}
