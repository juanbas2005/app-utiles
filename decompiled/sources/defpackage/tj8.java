package defpackage;

import android.os.Parcel;

/* renamed from: tj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tj8 extends gg8 implements bl8 {
    public final boolean L() {
        boolean z;
        Parcel e = e(I(), 7);
        int i = et8.a;
        if (e.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        e.recycle();
        return z;
    }
}
