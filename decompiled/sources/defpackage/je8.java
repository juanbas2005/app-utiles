package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;

/* renamed from: je8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class je8 implements Runnable {
    public final /* synthetic */ String A;
    public final /* synthetic */ Set B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ WorkDatabase w;
    public final /* synthetic */ be8 x;
    public final /* synthetic */ be8 y;
    public final /* synthetic */ List z;

    public /* synthetic */ je8(WorkDatabase workDatabase, be8 be8, be8 be82, List list, String str, Set set, boolean z2) {
        this.w = workDatabase;
        this.x = be8;
        this.y = be82;
        this.z = list;
        this.A = str;
        this.B = set;
        this.C = z2;
    }

    public final void run() {
        WorkDatabase workDatabase = this.w;
        fe8 w2 = workDatabase.w();
        he8 x2 = workDatabase.x();
        be8 be8 = this.x;
        int i = be8.s;
        long j = be8.u;
        int i2 = be8.v;
        be8 be82 = this.y;
        be8 b = be8.b(be82, (String) null, be8.b, (String) null, (ce1) null, be8.k, be8.n, i, be8.t + 1, j, i2, 29613053);
        if (be82.v == 1) {
            b.u = be82.u;
            b.v++;
        }
        be8 o0 = mp7.o0(this.z, b);
        w2.getClass();
        sg3.O(w2.a, false, true, new de8(w2, o0, 1));
        x2.getClass();
        String str = this.A;
        str.getClass();
        sg3.O(x2.a, false, true, new sd8(str, 13));
        x2.a(str, this.B);
        if (!this.C) {
            w2.g(-1, str);
            ud8 v = workDatabase.v();
            v.getClass();
            sg3.O(v.a, false, true, new sd8(str, 1));
        }
    }
}
