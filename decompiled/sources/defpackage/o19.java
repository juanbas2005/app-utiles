package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: o19  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o19 extends FutureTask implements Comparable {
    public final long w;
    public final boolean x;
    public final String y;
    public final /* synthetic */ r19 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o19(r19 r19, Callable callable, boolean z2) {
        super(callable);
        this.z = r19;
        long andIncrement = r19.G.getAndIncrement();
        this.w = andIncrement;
        this.y = "Task exception on worker thread";
        this.x = z2;
        if (andIncrement == Long.MAX_VALUE) {
            pz8 pz8 = ((y19) r19.w).B;
            y19.g(pz8);
            pz8.B.a("Tasks index overflow");
        }
    }

    public final int compareTo(Object obj) {
        o19 o19 = (o19) obj;
        boolean z2 = o19.x;
        boolean z3 = this.x;
        if (z3 == z2) {
            long j = o19.w;
            long j2 = this.w;
            int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            if (i > 0) {
                return 1;
            }
            pz8 pz8 = ((y19) this.z.w).B;
            y19.g(pz8);
            pz8.C.b("Two tasks share the same index. index", Long.valueOf(j2));
            return 0;
        } else if (!z3) {
            return 1;
        } else {
            return -1;
        }
    }

    public final void setException(Throwable th) {
        pz8 pz8 = ((y19) this.z.w).B;
        y19.g(pz8);
        pz8.B.b(this.y, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o19(r19 r19, Runnable runnable, boolean z2, String str) {
        super(runnable, (Object) null);
        this.z = r19;
        long andIncrement = r19.G.getAndIncrement();
        this.w = andIncrement;
        this.y = str;
        this.x = z2;
        if (andIncrement == Long.MAX_VALUE) {
            pz8 pz8 = ((y19) r19.w).B;
            y19.g(pz8);
            pz8.B.a("Tasks index overflow");
        }
    }
}
