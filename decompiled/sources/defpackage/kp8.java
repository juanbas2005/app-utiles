package defpackage;

import java.util.Iterator;

/* renamed from: kp8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kp8 implements Iterator {
    public final /* synthetic */ Iterator w;

    public kp8(Iterator it) {
        this.w = it;
    }

    public final boolean hasNext() {
        return this.w.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new mq8((String) this.w.next());
    }
}
