package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: qf7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qf7 extends x {
    public static final Parcelable.Creator<qf7> CREATOR = new xx6(4);
    public CharSequence y;
    public boolean z;

    public qf7(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.z = parcel.readInt() != 1 ? false : true;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.y + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.y, parcel, i);
        parcel.writeInt(this.z ? 1 : 0);
    }
}
