package defpackage;

/* renamed from: hd7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hd7 extends xc7 {
    public final String b;
    public final int c;
    public final vr2 d;

    public hd7(Object obj, String str, int i, vr2 vr2) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = vr2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return hl6.n(sb, this.c, ")");
    }
}
