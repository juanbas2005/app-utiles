package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: mg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mg4 extends View.BaseSavedState {
    public static final Parcelable.Creator<mg4> CREATOR = new ri8(25);
    public int w;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.w;
        if (i == 1) {
            str = "checked";
        } else if (i != 2) {
            str = "unchecked";
        } else {
            str = "indeterminate";
        }
        return f21.l(sb, str, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.w));
    }
}
