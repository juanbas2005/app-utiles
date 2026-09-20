package defpackage;

/* renamed from: we5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class we5 {
    public final boolean a;
    public final boolean b;

    public we5(int i) {
        boolean z;
        boolean z2 = true;
        if ((i & 1) != 0) {
            z = false;
        } else {
            z = true;
        }
        z2 = (i & 2) != 0 ? false : z2;
        this.a = z;
        this.b = z2;
    }
}
