package defpackage;

import java.util.Iterator;

/* renamed from: ok8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ok8 implements Iterator {
    public final /* synthetic */ Iterator w;
    public final /* synthetic */ Iterator x;

    public ok8(rl8 rl8, Iterator it, Iterator it2) {
        this.w = it;
        this.x = it2;
    }

    public final boolean hasNext() {
        if (this.w.hasNext()) {
            return true;
        }
        return this.x.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.w;
        if (it.hasNext()) {
            return new mq8(((Integer) it.next()).toString());
        }
        Iterator it2 = this.x;
        if (it2.hasNext()) {
            return new mq8((String) it2.next());
        }
        rf2.c();
        return null;
    }
}
