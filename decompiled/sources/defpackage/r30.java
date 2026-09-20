package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: r30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r30 implements Parcelable {
    public static final Parcelable.Creator<r30> CREATOR = new ri8(3);
    public final int A;
    public final String B;
    public final int C;
    public final int D;
    public final CharSequence E;
    public final int F;
    public final CharSequence G;
    public final ArrayList H;
    public final ArrayList I;
    public final boolean J;
    public final int[] w;
    public final ArrayList x;
    public final int[] y;
    public final int[] z;

    public r30(q30 q30) {
        String str;
        int size = q30.a.size();
        this.w = new int[(size * 6)];
        if (q30.g) {
            this.x = new ArrayList(size);
            this.y = new int[size];
            this.z = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ar2 ar2 = (ar2) q30.a.get(i2);
                int i3 = i + 1;
                this.w[i] = ar2.a;
                ArrayList arrayList = this.x;
                bq2 bq2 = ar2.b;
                if (bq2 != null) {
                    str = bq2.A;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int[] iArr = this.w;
                iArr[i3] = ar2.c;
                iArr[i + 2] = ar2.d;
                iArr[i + 3] = ar2.e;
                int i4 = i + 5;
                iArr[i + 4] = ar2.f;
                i += 6;
                iArr[i4] = ar2.g;
                this.y[i2] = ar2.h.ordinal();
                this.z[i2] = ar2.i.ordinal();
            }
            this.A = q30.f;
            this.B = q30.h;
            this.C = q30.s;
            this.D = q30.i;
            this.E = q30.j;
            this.F = q30.k;
            this.G = q30.l;
            this.H = q30.m;
            this.I = q30.n;
            this.J = q30.o;
            return;
        }
        h.s("Not on back stack");
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.w);
        parcel.writeStringList(this.x);
        parcel.writeIntArray(this.y);
        parcel.writeIntArray(this.z);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        TextUtils.writeToParcel(this.E, parcel, 0);
        parcel.writeInt(this.F);
        TextUtils.writeToParcel(this.G, parcel, 0);
        parcel.writeStringList(this.H);
        parcel.writeStringList(this.I);
        parcel.writeInt(this.J ? 1 : 0);
    }

    public r30(Parcel parcel) {
        this.w = parcel.createIntArray();
        this.x = parcel.createStringArrayList();
        this.y = parcel.createIntArray();
        this.z = parcel.createIntArray();
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.E = (CharSequence) creator.createFromParcel(parcel);
        this.F = parcel.readInt();
        this.G = (CharSequence) creator.createFromParcel(parcel);
        this.H = parcel.createStringArrayList();
        this.I = parcel.createStringArrayList();
        this.J = parcel.readInt() != 0;
    }
}
