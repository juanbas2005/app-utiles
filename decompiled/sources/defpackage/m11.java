package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: m11  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m11 extends a3 {
    public static final m11 B = new m11(0, (PendingIntent) null, (String) null);
    public static final Parcelable.Creator<m11> CREATOR = new ki8(6);
    public final Integer A;
    public final int w;
    public final int x;
    public final PendingIntent y;
    public final String z;

    public m11(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.w = i;
        this.x = i2;
        this.y = pendingIntent;
        this.z = str;
        this.A = num;
    }

    public static String f(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case b85.b:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case h75.g:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m11)) {
            return false;
        }
        m11 m11 = (m11) obj;
        if (this.x != m11.x || !b35.j(this.y, m11.y) || !b35.j(this.z, m11.z) || !b35.j(this.A, m11.A)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.x), this.y, this.z, this.A});
    }

    public final String toString() {
        hv2 hv2 = new hv2(20, (Object) this);
        hv2.k0("statusCode", f(this.x));
        hv2.k0("resolution", this.y);
        hv2.k0("message", this.z);
        hv2.k0("clientMethodKey", this.A);
        return hv2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.K(parcel, 2, 4);
        parcel.writeInt(this.x);
        h75.E(parcel, 3, this.y, i);
        h75.F(parcel, 4, this.z);
        Integer num = this.A;
        if (num != null) {
            h75.K(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        h75.O(parcel, M);
    }

    public m11(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, (Integer) null);
    }
}
