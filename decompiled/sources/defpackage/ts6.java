package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: ts6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ts6 extends x {
    public static final Parcelable.Creator<ts6> CREATOR = new dd5(4);
    public final int y;

    public ts6(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.y = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.y);
    }

    public ts6(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.y = sideSheetBehavior.h;
    }
}
