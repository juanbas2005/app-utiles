package defpackage;

import android.util.SparseArray;

/* renamed from: qk4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qk4 {
    public final SparseArray a;
    public tq7 b;

    public qk4(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(tq7 tq7, int i, int i2) {
        qk4 qk4;
        int a2 = tq7.a(i);
        SparseArray sparseArray = this.a;
        if (sparseArray == null) {
            qk4 = null;
        } else {
            qk4 = (qk4) sparseArray.get(a2);
        }
        if (qk4 == null) {
            qk4 = new qk4(1);
            sparseArray.put(tq7.a(i), qk4);
        }
        if (i2 > i) {
            qk4.a(tq7, i + 1, i2);
        } else {
            qk4.b = tq7;
        }
    }
}
