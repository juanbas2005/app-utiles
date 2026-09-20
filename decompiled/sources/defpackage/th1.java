package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: th1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class th1 implements vr2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ok2 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ vr2 D;
    public final /* synthetic */ kg1 E;
    public final /* synthetic */ ig1 F;
    public final /* synthetic */ re3 w;
    public final /* synthetic */ vh0 x;
    public final /* synthetic */ sr2 y;
    public final /* synthetic */ sr2 z;

    public /* synthetic */ th1(re3 re3, vh0 vh0, sr2 sr2, sr2 sr22, int i, ok2 ok2, int i2, vr2 vr2, kg1 kg1, ig1 ig1) {
        this.w = re3;
        this.x = vh0;
        this.y = sr2;
        this.z = sr22;
        this.A = i;
        this.B = ok2;
        this.C = i2;
        this.D = vr2;
        this.E = kg1;
        this.F = ig1;
    }

    public final Object y(Object obj) {
        int i;
        vz3 vz3 = (vz3) obj;
        re3 re3 = this.w;
        re3.getClass();
        if (re3 instanceof Collection) {
            i = ((Collection) re3).size();
        } else {
            Iterator it = re3.iterator();
            int i2 = 0;
            while (((qe3) it).y) {
                ((je3) it).next();
                i2++;
                if (i2 < 0) {
                    sg3.Y();
                    throw null;
                }
            }
            i = i2;
        }
        fw0 fw0 = new fw0(-1895584772, new vh1(re3, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F), true);
        vz3.q.a(i, new uz3((vr2) null, vz3.s, jo3.I, fw0));
        return vs7.a;
    }
}
