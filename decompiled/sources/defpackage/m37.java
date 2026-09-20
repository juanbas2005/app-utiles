package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: m37  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m37 extends z1 implements Iterator, ar3 {
    public final /* synthetic */ int C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m37(ay6 ay6, Iterator it, int i) {
        super(ay6, it);
        this.C = i;
    }

    public final Object next() {
        switch (this.C) {
            case b85.b:
                a();
                if (((Map.Entry) this.A) != null) {
                    return new dm0(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = (Map.Entry) this.B;
                if (entry != null) {
                    a();
                    return entry.getKey();
                }
                throw new IllegalStateException();
            default:
                Map.Entry entry2 = (Map.Entry) this.B;
                if (entry2 != null) {
                    a();
                    return entry2.getValue();
                }
                throw new IllegalStateException();
        }
    }
}
