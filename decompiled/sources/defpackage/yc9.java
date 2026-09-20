package defpackage;

import java.util.Arrays;

/* renamed from: yc9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yc9 extends b85 {
    public Object[] d;
    public int e;

    public final Object A(id9 id9) {
        int C = C(id9);
        if (C == -1) {
            return null;
        }
        return id9.b.cast(this.d[C + C + 1]);
    }

    public final void B(id9 id9, Object obj) {
        int C;
        if (id9.c || (C = C(id9)) == -1) {
            int i = this.e + 1;
            Object[] objArr = this.d;
            int length = objArr.length;
            if (i + i > length) {
                this.d = Arrays.copyOf(objArr, length + length);
            }
            Object[] objArr2 = this.d;
            int i2 = this.e;
            int i3 = i2 + i2;
            objArr2[i3] = id9;
            jb5.K("metadata value", obj);
            objArr2[i3 + 1] = obj;
            this.e++;
            return;
        }
        jb5.K("metadata value", obj);
        this.d[C + C + 1] = obj;
    }

    public final int C(id9 id9) {
        for (int i = 0; i < this.e; i++) {
            if (this.d[i + i].equals(id9)) {
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.e; i++) {
            sb.append(" '");
            sb.append(y(i));
            sb.append("': ");
            sb.append(z(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    public final int w() {
        return this.e;
    }

    public final id9 y(int i) {
        if (i < this.e) {
            return (id9) this.d[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    public final Object z(int i) {
        if (i < this.e) {
            return this.d[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }
}
