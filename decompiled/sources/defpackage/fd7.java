package defpackage;

import android.app.RemoteAction;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import com.wireguard.android.backend.GoBackend;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fd7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class fd7 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ fd7(d98 d98, je2 je2) {
        this.w = 9;
        this.x = d98;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                j45.p(((RemoteAction) obj).getActionIntent());
                return vs7;
            case 1:
                qd7 qd7 = (qd7) obj;
                if (qd7.J) {
                    return f55.g(qd7);
                }
                return yc7.b;
            case 2:
                return new lx1(we.E(24.0f, 16.0f, ((ge7) obj).b()));
            case 3:
                return new oe3(((se3) obj).c());
            case 4:
                sg7 sg7 = (sg7) obj;
                sg7.U = null;
                g75.D(sg7);
                su0.B(sg7);
                rc9.e0(sg7);
                return Boolean.TRUE;
            case 5:
                hj7 hj7 = (hj7) obj;
                hj7.j0.y(Boolean.valueOf(!hj7.i0));
                return vs7;
            case 6:
                g48 g48 = (g48) obj;
                return BigInteger.valueOf((long) g48.w).shiftLeft(32).or(BigInteger.valueOf((long) g48.x)).shiftLeft(32).or(BigInteger.valueOf((long) g48.y));
            case 7:
                return new GoBackend(((v78) obj).a);
            case 8:
                if (((Number) ((c98) obj).a.d()).floatValue() == 1.0f) {
                    return d98.x;
                }
                return d98.w;
            case 9:
                return new c98((d98) obj);
            case 10:
                z42.a((cd8) obj);
                return vs7;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                nd8 nd8 = (nd8) obj;
                WorkDatabase workDatabase = nd8.c;
                Context context = nd8.a;
                String str = na7.B;
                if (Build.VERSION.SDK_INT >= 34) {
                    hl3.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList b = na7.b(context, jobScheduler);
                if (b != null && !b.isEmpty()) {
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        na7.a(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ((Number) sg3.O(workDatabase.w().a, false, true, new rb8(9))).intValue();
                mg6.b(nd8.b, workDatabase, nd8.e);
                return vs7;
            default:
                return ((Worker) obj).c();
        }
    }

    public /* synthetic */ fd7(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }
}
