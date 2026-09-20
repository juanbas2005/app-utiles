package defpackage;

import java.util.Iterator;

/* renamed from: lt8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lt8 extends os8 {
    public static final Object[] G;
    public static final lt8 H;
    public final transient Object[] B;
    public final transient int C;
    public final transient Object[] D;
    public final transient int E;
    public final transient int F;

    static {
        Object[] objArr = new Object[0];
        G = objArr;
        H = new lt8(0, 0, 0, objArr, objArr);
    }

    public lt8(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(1);
        this.B = objArr;
        this.C = i;
        this.D = objArr2;
        this.E = i2;
        this.F = i3;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.D;
            if (objArr.length != 0) {
                int X = z65.X(obj.hashCode());
                while (true) {
                    int i = X & this.E;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    X = i + 1;
                }
            }
        }
        return false;
    }

    public final Object[] g() {
        return this.B;
    }

    public final int hashCode() {
        return this.C;
    }

    public final /* synthetic */ Iterator iterator() {
        return x().listIterator(0);
    }

    public final int k() {
        return 0;
    }

    public final int l() {
        return this.F;
    }

    public final int o(Object[] objArr) {
        Object[] objArr2 = this.B;
        int i = this.F;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    public final int size() {
        return this.F;
    }

    public final at7 v() {
        return x().listIterator(0);
    }

    public final hs8 y() {
        es8 es8 = hs8.A;
        int i = this.F;
        if (i == 0) {
            return qs8.D;
        }
        return new qs8(i, this.B);
    }
}
