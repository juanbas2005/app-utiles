package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: od8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class od8 extends ct2 implements ks2 {
    public static final od8 D = new ct2(6, pd8.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    public final Object F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        f01 f01 = (f01) obj2;
        qd8 qd8 = (qd8) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        zk7 zk7 = (zk7) obj5;
        context.getClass();
        f01.getClass();
        qd8.getClass();
        workDatabase.getClass();
        zk7.getClass();
        String str = mg6.a;
        na7 na7 = new na7(context, workDatabase, f01);
        ca5.a(context, SystemJobService.class, true);
        bc4.k().e(mg6.a, "Created SystemJobScheduler and enabled SystemJobService");
        lp5 lp5 = (lp5) obj6;
        qd8 qd82 = qd8;
        return sg3.E(na7, new nx2(context, f01, zk7, lp5, new k68(lp5, qd82), qd82));
    }
}
