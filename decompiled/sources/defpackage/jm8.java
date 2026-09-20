package defpackage;

/* renamed from: jm8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jm8 extends vn8 {
    public final transient vn8 B;

    public jm8(vn8 vn8) {
        super(0);
        this.B = vn8;
    }

    public final boolean contains(Object obj) {
        return this.B.contains(obj);
    }

    public final Object get(int i) {
        vn8 vn8 = this.B;
        t35.E(i, vn8.size());
        return vn8.get((vn8.size() - 1) - i);
    }

    public final int indexOf(Object obj) {
        vn8 vn8 = this.B;
        int lastIndexOf = vn8.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (vn8.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        vn8 vn8 = this.B;
        int indexOf = vn8.indexOf(obj);
        if (indexOf >= 0) {
            return (vn8.size() - 1) - indexOf;
        }
        return -1;
    }

    public final int size() {
        return this.B.size();
    }

    public final vn8 v() {
        return this.B;
    }

    /* renamed from: w */
    public final vn8 subList(int i, int i2) {
        vn8 vn8 = this.B;
        t35.G(i, i2, vn8.size());
        return vn8.subList(vn8.size() - i2, vn8.size() - i).v();
    }
}
