package defpackage;

import java.util.Iterator;

/* renamed from: rp1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rp1 implements al6 {
    public final CharSequence a;
    public final int b;
    public final gs2 c;

    public rp1(CharSequence charSequence, int i, gs2 gs2) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = gs2;
    }

    public final Iterator iterator() {
        return new qp1(this);
    }
}
