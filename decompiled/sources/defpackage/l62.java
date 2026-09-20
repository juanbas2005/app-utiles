package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* renamed from: l62  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public enum l62 implements Parcelable {
    x("NOT_SUPPORTED_ERR"),
    y("INVALID_STATE_ERR"),
    z("SECURITY_ERR"),
    A("NETWORK_ERR"),
    B("ABORT_ERR"),
    C("TIMEOUT_ERR"),
    D("ENCODING_ERR"),
    E("UNKNOWN_ERR"),
    F("CONSTRAINT_ERR"),
    G("DATA_ERR"),
    H("NOT_ALLOWED_ERR"),
    I("ATTESTATION_NOT_PRIVATE_ERR");
    
    public static final Parcelable.Creator<l62> CREATOR = null;
    public final int w;

    static {
        CREATOR = new g39(19);
    }

    /* access modifiers changed from: public */
    l62(String str) {
        this.w = r2;
    }

    public static l62 a(int i) {
        for (l62 l62 : values()) {
            if (i == l62.w) {
                return l62;
            }
        }
        Locale locale = Locale.US;
        throw new Exception(pb4.i(i, "Error code ", " is not supported"));
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.w);
    }
}
