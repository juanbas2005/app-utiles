package defpackage;

import java.util.Arrays;

/* renamed from: i93  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class i93 {
    public boolean a;
    public int b;
    public Object[] c;

    public i93(int i) {
        ie1.z(i, "initialCapacity");
        this.c = new Object[i];
        this.b = 0;
    }

    public static za0 b() {
        za0 za0 = new za0();
        za0.c = true;
        za0.b = 0;
        return za0;
    }

    public static int d(int i, int i2) {
        if (i2 >= 0) {
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public void a(Object obj) {
        obj.getClass();
        int i = this.b + 1;
        Object[] objArr = this.c;
        if (objArr.length < i) {
            this.c = Arrays.copyOf(objArr, d(objArr.length, i));
            this.a = false;
        } else if (this.a) {
            this.c = (Object[]) objArr.clone();
            this.a = false;
        }
        Object[] objArr2 = this.c;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr2[i2] = obj;
    }

    public abstract void c(iw2 iw2, xb7 xb7);

    public i93() {
        this.c = null;
        this.a = false;
        this.b = 0;
    }
}
