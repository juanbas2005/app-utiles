package defpackage;

import java.util.ArrayList;

/* renamed from: ol2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ol2 implements v31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ol2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r3 >= r2.size()) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        ((defpackage.v31) r2.get(r3)).accept(r4);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    public final void accept(Object obj) {
        switch (this.a) {
            case b85.b:
                pl2 pl2 = (pl2) obj;
                if (pl2 == null) {
                    pl2 = new pl2(-3);
                }
                ((qc3) this.b).I(pl2);
                return;
            default:
                pl2 pl22 = (pl2) obj;
                synchronized (ql2.c) {
                    try {
                        zt6 zt6 = ql2.d;
                        ArrayList arrayList = (ArrayList) zt6.get((String) this.b);
                        if (arrayList != null) {
                            zt6.remove((String) this.b);
                            break;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
        }
    }
}
