package defpackage;

/* renamed from: qn7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qn7 extends i2 {
    public boolean A;
    public int y;
    public Object[] z;

    public qn7(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        boolean z2;
        this.y = i3;
        Object[] objArr2 = new Object[i3];
        this.z = objArr2;
        if (i == i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.A = z2;
        objArr2[0] = objArr;
        b(i - (z2 ? 1 : 0), 1);
    }

    public final Object a() {
        Object obj = this.z[this.y - 1];
        obj.getClass();
        return ((Object[]) obj)[this.w & 31];
    }

    public final void b(int i, int i2) {
        int i3 = (this.y - i2) * 5;
        while (i2 < this.y) {
            Object[] objArr = this.z;
            Object[] objArr2 = objArr[i2 - 1];
            objArr2.getClass();
            objArr[i2] = objArr2[t35.u(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (t35.u(this.w, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.w, ((this.y - 1) - (i2 / 5)) + 1);
        }
    }

    public final Object next() {
        if (hasNext()) {
            Object a = a();
            int i = this.w + 1;
            this.w = i;
            if (i == this.x) {
                this.A = true;
                return a;
            }
            c(0);
            return a;
        }
        rf2.c();
        return null;
    }

    public final Object previous() {
        if (hasPrevious()) {
            this.w--;
            if (this.A) {
                this.A = false;
                return a();
            }
            c(31);
            return a();
        }
        rf2.c();
        return null;
    }
}
