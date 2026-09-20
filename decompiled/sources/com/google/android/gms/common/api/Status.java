package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class Status extends a3 implements p66, ReflectedParcelable {
    public static final Status A = new Status(0, (String) null, (PendingIntent) null, (m11) null);
    public static final Status B = new Status(14, (String) null, (PendingIntent) null, (m11) null);
    public static final Status C = new Status(8, (String) null, (PendingIntent) null, (m11) null);
    public static final Parcelable.Creator<Status> CREATOR = new ki8(23);
    public static final Status D = new Status(15, (String) null, (PendingIntent) null, (m11) null);
    public static final Status E = new Status(16, (String) null, (PendingIntent) null, (m11) null);
    public final int w;
    public final String x;
    public final PendingIntent y;
    public final m11 z;

    public Status(int i, String str, PendingIntent pendingIntent, m11 m11) {
        this.w = i;
        this.x = str;
        this.y = pendingIntent;
        this.z = m11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.w != status.w || !b35.j(this.x, status.x) || !b35.j(this.y, status.y) || !b35.j(this.z, status.z)) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.w <= 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.w), this.x, this.y, this.z});
    }

    public final String toString() {
        hv2 hv2 = new hv2(20, (Object) this);
        String str = this.x;
        if (str == null) {
            int i = this.w;
            switch (i) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case b85.b:
                    str = "SUCCESS";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case h75.g /*15*/:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
                default:
                    str = hl6.p(new StringBuilder(String.valueOf(i).length() + 21), "unknown status code: ", i);
                    break;
            }
        }
        hv2.k0("statusCode", str);
        hv2.k0("resolution", this.y);
        return hv2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.F(parcel, 2, this.x);
        h75.E(parcel, 3, this.y, i);
        h75.E(parcel, 4, this.z, i);
        h75.O(parcel, M);
    }

    public final Status d() {
        return this;
    }
}
