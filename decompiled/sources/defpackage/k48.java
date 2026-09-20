package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: k48  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k48 extends j48 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    /* JADX WARNING: type inference failed for: r5v0, types: [js, zt6] */
    /* JADX WARNING: type inference failed for: r6v0, types: [js, zt6] */
    /* JADX WARNING: type inference failed for: r7v0, types: [js, zt6] */
    public k48(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new zt6(0), new zt6(0), new zt6(0));
    }

    public final k48 a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f) {
            i2 = this.g;
        }
        return new k48(parcel, dataPosition, i2, f21.l(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    public final boolean e(int i2) {
        while (true) {
            int i3 = this.j;
            int i4 = this.k;
            if (i3 < this.g) {
                if (i4 == i2) {
                    return true;
                }
                if (String.valueOf(i4).compareTo(String.valueOf(i2)) > 0) {
                    return false;
                }
                int i5 = this.j;
                Parcel parcel = this.e;
                parcel.setDataPosition(i5);
                int readInt = parcel.readInt();
                this.k = parcel.readInt();
                this.j += readInt;
            } else if (i4 == i2) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final void h(int i2) {
        int i3 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public k48(Parcel parcel, int i2, int i3, String str, js jsVar, js jsVar2, js jsVar3) {
        super(jsVar, jsVar2, jsVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i2;
        this.g = i3;
        this.j = i2;
        this.h = str;
    }
}
