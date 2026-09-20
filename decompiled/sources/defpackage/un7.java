package defpackage;

/* renamed from: un7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class un7 extends sn7 {
    public final bg5 z;

    public un7(bg5 bg5) {
        this.z = bg5;
    }

    public final Object next() {
        int i = this.y;
        this.y = i + 2;
        Object[] objArr = this.w;
        return new fp4(this.z, objArr[i], objArr[i + 1]);
    }
}
