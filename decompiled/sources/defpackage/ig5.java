package defpackage;

/* renamed from: ig5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ig5 extends i2 {
    public final Object[] y;
    public final qn7 z;

    public ig5(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.y = objArr2;
        int i4 = (i2 - 1) & -32;
        this.z = new qn7(objArr, i > i4 ? i4 : i, i4, i3);
    }

    public final Object next() {
        if (hasNext()) {
            qn7 qn7 = this.z;
            if (qn7.hasNext()) {
                this.w++;
                return qn7.next();
            }
            int i = this.w;
            this.w = i + 1;
            return this.y[i - qn7.x];
        }
        rf2.c();
        return null;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.w;
            qn7 qn7 = this.z;
            int i2 = qn7.x;
            if (i > i2) {
                int i3 = i - 1;
                this.w = i3;
                return this.y[i3 - i2];
            }
            this.w = i - 1;
            return qn7.previous();
        }
        rf2.c();
        return null;
    }
}
