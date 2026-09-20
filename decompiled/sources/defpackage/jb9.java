package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jb9 implements Comparable, Parcelable {
    public static final Parcelable.Creator<jb9> CREATOR = new g39(18);
    public final String w;
    public final long x;
    public final int y;

    public /* synthetic */ jb9(Parcel parcel) {
        this.w = parcel.readString();
        this.x = parcel.readLong();
        this.y = parcel.readInt();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.w.compareTo(((jb9) obj).w);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jb9)) {
            return false;
        }
        return this.w.equals(((jb9) obj).w);
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return this.w;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.w);
        parcel.writeLong(this.x);
        parcel.writeInt(this.y);
    }

    public jb9(int i, long j, String str) {
        this.w = str;
        this.x = j;
        this.y = i;
    }
}
