package defpackage;

import android.os.Parcel;

/* renamed from: o89  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class o89 extends gg8 {
    public final y73 L(z25 z25, String str, int i) {
        Parcel I = I();
        et8.b(I, z25);
        I.writeString(str);
        I.writeInt(i);
        Parcel e = e(I, 2);
        y73 L = z25.L(e.readStrongBinder());
        e.recycle();
        return L;
    }

    public final y73 M(z25 z25, String str, int i) {
        Parcel I = I();
        et8.b(I, z25);
        I.writeString(str);
        I.writeInt(i);
        Parcel e = e(I, 4);
        y73 L = z25.L(e.readStrongBinder());
        e.recycle();
        return L;
    }

    public final y73 N(z25 z25, String str, boolean z, long j) {
        Parcel I = I();
        et8.b(I, z25);
        I.writeString(str);
        I.writeInt(z ? 1 : 0);
        I.writeLong(j);
        Parcel e = e(I, 7);
        y73 L = z25.L(e.readStrongBinder());
        e.recycle();
        return L;
    }

    public final y73 O(z25 z25, String str, int i, z25 z252) {
        Parcel I = I();
        et8.b(I, z25);
        I.writeString(str);
        I.writeInt(i);
        et8.b(I, z252);
        Parcel e = e(I, 8);
        y73 L = z25.L(e.readStrongBinder());
        e.recycle();
        return L;
    }
}
