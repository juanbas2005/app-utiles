package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: cy4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cy4 extends View.BaseSavedState {
    public static final Parcelable.Creator<cy4> CREATOR = new ri8(28);
    public int w;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return hl6.n(sb, this.w, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.w);
    }
}
