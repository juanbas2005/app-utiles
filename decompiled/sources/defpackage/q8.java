package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q8 implements Parcelable {
    public static final Parcelable.Creator<q8> CREATOR = new ri8(1);
    public final int w;
    public final Intent x;

    public q8(Intent intent, int i) {
        this.w = i;
        this.x = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.w;
        if (i == -1) {
            str = "RESULT_OK";
        } else if (i != 0) {
            str = String.valueOf(i);
        } else {
            str = "RESULT_CANCELED";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.x);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.getClass();
        parcel.writeInt(this.w);
        Intent intent = this.x;
        if (intent == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
