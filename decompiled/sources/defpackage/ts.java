package defpackage;

import java.util.Iterator;

/* renamed from: ts  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ts implements al6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ts(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                return new e2((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return t75.y((gs2) obj);
            case 3:
                return new el6(0, obj);
            default:
                return new y64((String) obj);
        }
    }
}
