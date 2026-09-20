package defpackage;

import java.util.Objects;

/* renamed from: qs8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qs8 extends hs8 {
    public static final qs8 D = new qs8(0, new Object[0]);
    public final transient Object[] B;
    public final transient int C;

    public qs8(int i, Object[] objArr) {
        super(1);
        this.B = objArr;
        this.C = i;
    }

    public final Object[] g() {
        return this.B;
    }

    public final Object get(int i) {
        l55.B(i, this.C);
        Object obj = this.B[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int k() {
        return 0;
    }

    public final int l() {
        return this.C;
    }

    public final int o(Object[] objArr) {
        Object[] objArr2 = this.B;
        int i = this.C;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    public final int size() {
        return this.C;
    }
}
