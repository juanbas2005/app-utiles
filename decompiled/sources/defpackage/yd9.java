package defpackage;

import java.util.Iterator;

/* renamed from: yd9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yd9 {
    public final /* synthetic */ int a;

    public /* synthetic */ yd9(int i) {
        this.a = i;
    }

    public final void a(id9 id9, Iterator it, ud9 ud9) {
        switch (this.a) {
            case b85.b:
                return;
            default:
                if (!id9.c) {
                    h.s("non repeating key");
                    return;
                } else if (!id9.d || ((gk8) gk8.x.get()).w <= 20) {
                    id9.a(it, ud9);
                    return;
                } else {
                    while (it.hasNext()) {
                        ud9.a(id9.a, it.next());
                    }
                    return;
                }
        }
    }

    private final void b(id9 id9, Iterator it, ud9 ud9) {
    }
}
