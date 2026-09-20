package defpackage;

import java.util.Iterator;

/* renamed from: ss  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ss implements Iterable, ar3 {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ ss(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final Iterator iterator() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return new e2(objArr);
            case 1:
                return new f02((Iterator) ((sr2) obj).b());
            case 2:
                return ((al6) obj).iterator();
            default:
                return new e2((t52) obj);
        }
    }
}
