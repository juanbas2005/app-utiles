package defpackage;

/* renamed from: jt8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jt8 extends mt8 {
    public final transient mt8 B;

    public jt8(mt8 mt8) {
        super(2);
        this.B = mt8;
    }

    public final boolean contains(Object obj) {
        return this.B.contains(obj);
    }

    public final Object get(int i) {
        mt8 mt8 = this.B;
        g75.V(i, mt8.size());
        return mt8.get((mt8.size() - 1) - i);
    }

    public final int indexOf(Object obj) {
        mt8 mt8 = this.B;
        int lastIndexOf = mt8.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (mt8.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        mt8 mt8 = this.B;
        int indexOf = mt8.indexOf(obj);
        if (indexOf >= 0) {
            return (mt8.size() - 1) - indexOf;
        }
        return -1;
    }

    public final int size() {
        return this.B.size();
    }

    public final mt8 v() {
        return this.B;
    }

    /* renamed from: w */
    public final mt8 subList(int i, int i2) {
        mt8 mt8 = this.B;
        g75.b0(i, i2, mt8.size());
        return mt8.subList(mt8.size() - i2, mt8.size() - i).v();
    }
}
