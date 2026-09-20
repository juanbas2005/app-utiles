package defpackage;

import java.util.Iterator;

/* renamed from: ae2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ae2 implements al6 {
    public final al6 a;
    public final boolean b;
    public final vr2 c;

    public ae2(al6 al6, boolean z, vr2 vr2) {
        this.a = al6;
        this.b = z;
        this.c = vr2;
    }

    public final Iterator iterator() {
        return new zd2(this);
    }
}
