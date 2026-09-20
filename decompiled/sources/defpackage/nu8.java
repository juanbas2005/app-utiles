package defpackage;

import java.util.Objects;

/* renamed from: nu8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nu8 extends mt8 {
    public static final nu8 D = new nu8(0, new Object[0]);
    public final transient Object[] B;
    public final transient int C;

    public nu8(int i, Object[] objArr) {
        super(2);
        this.B = objArr;
        this.C = i;
    }

    public final int d(Object[] objArr) {
        Object[] objArr2 = this.B;
        int i = this.C;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    public final int f() {
        return this.C;
    }

    public final Object get(int i) {
        g75.V(i, this.C);
        Object obj = this.B[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int k() {
        return 0;
    }

    public final Object[] p() {
        return this.B;
    }

    public final int size() {
        return this.C;
    }
}
