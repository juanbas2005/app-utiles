package defpackage;

import android.util.SparseArray;

/* renamed from: cz5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cz5 {
    public SparseArray a;
    public int b;

    public final bz5 a(int i) {
        SparseArray sparseArray = this.a;
        bz5 bz5 = (bz5) sparseArray.get(i);
        if (bz5 != null) {
            return bz5;
        }
        bz5 bz52 = new bz5();
        sparseArray.put(i, bz52);
        return bz52;
    }
}
