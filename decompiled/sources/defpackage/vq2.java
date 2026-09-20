package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vq2 implements Parcelable {
    public static final Parcelable.Creator<vq2> CREATOR = new ri8(20);
    public final int A;
    public final int B;
    public final String C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final int H;
    public final String I;
    public final int J;
    public final boolean K;
    public final String w;
    public final String x;
    public final boolean y;
    public final boolean z;

    public vq2(Parcel parcel) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        this.w = parcel.readString();
        this.x = parcel.readString();
        boolean z8 = false;
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.y = z2;
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.z = z3;
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readString();
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.D = z4;
        if (parcel.readInt() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.E = z5;
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.F = z6;
        if (parcel.readInt() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.G = z7;
        this.H = parcel.readInt();
        this.I = parcel.readString();
        this.J = parcel.readInt();
        this.K = parcel.readInt() != 0 ? true : z8;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.w);
        sb.append(" (");
        sb.append(this.x);
        sb.append(")}:");
        if (this.y) {
            sb.append(" fromLayout");
        }
        if (this.z) {
            sb.append(" dynamicContainer");
        }
        int i = this.B;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.C;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.D) {
            sb.append(" retainInstance");
        }
        if (this.E) {
            sb.append(" removing");
        }
        if (this.F) {
            sb.append(" detached");
        }
        if (this.G) {
            sb.append(" hidden");
        }
        String str2 = this.I;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.J);
        }
        if (this.K) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeString(this.C);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H);
        parcel.writeString(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K ? 1 : 0);
    }

    public vq2(bq2 bq2) {
        this.w = bq2.getClass().getName();
        this.x = bq2.A;
        this.y = bq2.J;
        this.z = bq2.L;
        this.A = bq2.T;
        this.B = bq2.U;
        this.C = bq2.V;
        this.D = bq2.Y;
        this.E = bq2.H;
        this.F = bq2.X;
        this.G = bq2.W;
        this.H = bq2.k0.ordinal();
        this.I = bq2.D;
        this.J = bq2.E;
        this.K = bq2.e0;
    }
}
