package defpackage;

import cu.lestebang.utiletecsa.sync.worker.DelegatingWorker;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: r55  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r55 extends st5 {
    public final /* synthetic */ int e = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r55(long j) {
        super(DelegatingWorker.class);
        long j2;
        long j3;
        TimeUnit timeUnit = TimeUnit.HOURS;
        timeUnit.getClass();
        be8 be8 = (be8) this.c;
        long millis = timeUnit.toMillis(j);
        be8.getClass();
        String str = be8.z;
        long j4 = 900000;
        int i = (millis > 900000 ? 1 : (millis == 900000 ? 0 : -1));
        if (i < 0) {
            bc4.k().q(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        if (i < 0) {
            j2 = 900000;
        } else {
            j2 = millis;
        }
        if (i < 0) {
            j3 = 900000;
        } else {
            j3 = millis;
        }
        int i2 = (j2 > 900000 ? 1 : (j2 == 900000 ? 0 : -1));
        if (i2 < 0) {
            bc4.k().q(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        be8.h = i2 >= 0 ? j2 : j4;
        if (j3 < 300000) {
            bc4.k().q(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j3 > be8.h) {
            bc4.k().q(str, "Flex duration greater than interval duration; Changed to " + j2);
        }
        be8.i = z65.q(j3, 300000, be8.h);
    }

    public final xd8 b() {
        int i = this.e;
        Object obj = this.d;
        switch (i) {
            case b85.b:
                return new xd8((UUID) this.b, (be8) this.c, (Set) obj);
            default:
                be8 be8 = (be8) this.c;
                if (!be8.q) {
                    return new xd8((UUID) this.b, be8, (Set) obj);
                }
                h.q("PeriodicWorkRequests cannot be expedited");
                return null;
        }
    }

    public /* synthetic */ r55(Class cls) {
        super(cls);
    }
}
