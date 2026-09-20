package defpackage;

import androidx.work.impl.WorkDatabase;

/* renamed from: hd8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hd8 {
    public final qd8 a;
    public final lp5 b;
    public final fe8 c;

    static {
        bc4.p("WMFgUpdater");
    }

    public hd8(WorkDatabase workDatabase, lp5 lp5, qd8 qd8) {
        this.b = lp5;
        this.a = qd8;
        this.c = workDatabase.w();
    }
}
