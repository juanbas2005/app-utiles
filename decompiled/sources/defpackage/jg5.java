package defpackage;

import java.util.ConcurrentModificationException;

/* renamed from: jg5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jg5 extends i2 {
    public qn7 A;
    public int B = -1;
    public final hg5 y;
    public int z;

    public jg5(hg5 hg5, int i) {
        super(i, hg5.D);
        this.y = hg5;
        this.z = hg5.n();
        b();
    }

    public final void a() {
        if (this.z != this.y.n()) {
            throw new ConcurrentModificationException();
        }
    }

    public final void add(Object obj) {
        a();
        int i = this.w;
        hg5 hg5 = this.y;
        hg5.add(i, obj);
        this.w++;
        this.x = hg5.f();
        this.z = hg5.n();
        this.B = -1;
        b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void b() {
        hg5 hg5 = this.y;
        Object[] objArr = hg5.B;
        if (objArr == null) {
            this.A = null;
            return;
        }
        int i = (hg5.D - 1) & -32;
        int i2 = this.w;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (hg5.z / 5) + 1;
        qn7 qn7 = this.A;
        if (qn7 == null) {
            this.A = new qn7(objArr, i2, i, i3);
            return;
        }
        qn7.w = i2;
        qn7.x = i;
        qn7.y = i3;
        if (qn7.z.length < i3) {
            qn7.z = new Object[i3];
        }
        boolean z2 = false;
        qn7.z[0] = objArr;
        if (i2 == i) {
            z2 = true;
        }
        qn7.A = z2;
        qn7.b(i2 - z2, 1);
    }

    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.w;
            this.B = i;
            qn7 qn7 = this.A;
            hg5 hg5 = this.y;
            if (qn7 == null) {
                Object[] objArr = hg5.C;
                this.w = i + 1;
                return objArr[i];
            } else if (qn7.hasNext()) {
                this.w++;
                return qn7.next();
            } else {
                Object[] objArr2 = hg5.C;
                int i2 = this.w;
                this.w = i2 + 1;
                return objArr2[i2 - qn7.x];
            }
        } else {
            rf2.c();
            return null;
        }
    }

    public final Object previous() {
        a();
        if (hasPrevious()) {
            int i = this.w;
            this.B = i - 1;
            qn7 qn7 = this.A;
            hg5 hg5 = this.y;
            if (qn7 == null) {
                Object[] objArr = hg5.C;
                int i2 = i - 1;
                this.w = i2;
                return objArr[i2];
            }
            int i3 = qn7.x;
            if (i > i3) {
                Object[] objArr2 = hg5.C;
                int i4 = i - 1;
                this.w = i4;
                return objArr2[i4 - i3];
            }
            this.w = i - 1;
            return qn7.previous();
        }
        rf2.c();
        return null;
    }

    public final void remove() {
        a();
        int i = this.B;
        if (i != -1) {
            hg5 hg5 = this.y;
            hg5.g(i);
            int i2 = this.B;
            if (i2 < this.w) {
                this.w = i2;
            }
            this.x = hg5.f();
            this.z = hg5.n();
            this.B = -1;
            b();
            return;
        }
        throw new IllegalStateException();
    }

    public final void set(Object obj) {
        a();
        int i = this.B;
        if (i != -1) {
            hg5 hg5 = this.y;
            hg5.set(i, obj);
            this.z = hg5.n();
            b();
            return;
        }
        throw new IllegalStateException();
    }
}
