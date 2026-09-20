package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: mi4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mi4 implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<mi4> CREATOR = new ri8(26);
    public final String w;
    public final Map x;

    public mi4(String str, Map map) {
        this.w = str;
        this.x = map;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi4)) {
            return false;
        }
        mi4 mi4 = (mi4) obj;
        if (!sg3.e(this.w, mi4.w) || !sg3.e(this.x, mi4.x)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.x.hashCode() + (this.w.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.w + ", extras=" + this.x + ')';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.w);
        Map map = this.x;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
