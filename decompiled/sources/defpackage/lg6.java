package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: lg6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class lg6 implements b82 {
    public final /* synthetic */ Executor w;
    public final /* synthetic */ List x;
    public final /* synthetic */ f01 y;
    public final /* synthetic */ WorkDatabase z;

    public /* synthetic */ lg6(Executor executor, List list, f01 f01, WorkDatabase workDatabase) {
        this.w = executor;
        this.x = list;
        this.y = f01;
        this.z = workDatabase;
    }

    public final void b(id8 id8, boolean z2) {
        this.w.execute(new lm0(this.x, id8, this.y, this.z, 2));
    }
}
