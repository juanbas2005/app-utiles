package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: jv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jv8 extends a3 {
    public static final Parcelable.Creator<jv8> CREATOR = new ki8(22);
    public final int w;
    public final String x;
    public final Intent y;

    public jv8(int i, String str, Intent intent) {
        this.w = i;
        this.x = str;
        this.y = intent;
    }

    public static jv8 f(Activity activity) {
        return new jv8(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv8)) {
            return false;
        }
        jv8 jv8 = (jv8) obj;
        if (this.w != jv8.w || !Objects.equals(this.x, jv8.x) || !Objects.equals(this.y, jv8.y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.w;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.F(parcel, 2, this.x);
        h75.E(parcel, 3, this.y, i);
        h75.O(parcel, M);
    }
}
