package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: ya0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ya0 extends x {
    public static final Parcelable.Creator<ya0> CREATOR = new xx6(1);
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final int y;
    public final int z;

    public ya0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z2;
        boolean z3;
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        boolean z4 = false;
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.A = z2;
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.B = z3;
        this.C = parcel.readInt() == 1 ? true : z4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
    }

    public ya0(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.y = bottomSheetBehavior.N;
        this.z = bottomSheetBehavior.e;
        this.A = bottomSheetBehavior.b;
        this.B = bottomSheetBehavior.I;
        this.C = bottomSheetBehavior.J;
    }
}
