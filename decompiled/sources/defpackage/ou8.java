package defpackage;

import java.util.Iterator;

/* renamed from: ou8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ou8 extends rt8 {
    public static final Object[] H;
    public static final ou8 I;
    public final transient Object[] C;
    public final transient int D;
    public final transient Object[] E;
    public final transient int F;
    public final transient int G;

    static {
        Object[] objArr = new Object[0];
        H = objArr;
        I = new ou8(0, 0, 0, objArr, objArr);
    }

    public ou8(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(2);
        this.C = objArr;
        this.D = i;
        this.E = objArr2;
        this.F = i2;
        this.G = i3;
    }

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.E;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * -862048943), 15)) * 461845907);
        while (true) {
            int i = rotateLeft & this.F;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i + 1;
        }
    }

    public final int d(Object[] objArr) {
        Object[] objArr2 = this.C;
        int i = this.G;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    public final int f() {
        return this.G;
    }

    public final int hashCode() {
        return this.D;
    }

    public final /* synthetic */ Iterator iterator() {
        return v().listIterator(0);
    }

    public final int k() {
        return 0;
    }

    public final at7 n() {
        return v().listIterator(0);
    }

    public final Object[] p() {
        return this.C;
    }

    public final int size() {
        return this.G;
    }

    public final mt8 w() {
        return mt8.x(this.G, this.C);
    }
}
