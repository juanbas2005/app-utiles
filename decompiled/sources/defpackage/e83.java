package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* renamed from: e83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class e83 implements Callable {
    public final /* synthetic */ ji8 a;
    public final /* synthetic */ int b;

    public /* synthetic */ e83(ji8 ji8, int i) {
        this.a = ji8;
        this.b = i;
    }

    public final Object call() {
        int i;
        int i2;
        WorkDatabase workDatabase = (WorkDatabase) this.a.x;
        Long a2 = workDatabase.s().a("next_job_scheduler_id");
        int i3 = 0;
        if (a2 != null) {
            i = (int) a2.longValue();
        } else {
            i = 0;
        }
        if (i == Integer.MAX_VALUE) {
            i2 = 0;
        } else {
            i2 = i + 1;
        }
        en5 s = workDatabase.s();
        sg3.O(s.a, false, true, new w34(18, s, new dn5("next_job_scheduler_id", Long.valueOf((long) i2))));
        if (i < 0 || i > this.b) {
            en5 s2 = workDatabase.s();
            sg3.O(s2.a, false, true, new w34(18, s2, new dn5("next_job_scheduler_id", 1L)));
        } else {
            i3 = i;
        }
        return Integer.valueOf(i3);
    }
}
