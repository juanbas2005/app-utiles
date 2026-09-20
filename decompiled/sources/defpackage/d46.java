package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: d46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d46 extends a3 {
    public static final Parcelable.Creator<d46> CREATOR = new zc5(9);
    public final Bundle w;
    public js x;
    public yt1 y;

    public d46(Bundle bundle) {
        this.w = bundle;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [js, zt6] */
    public final HashMap f() {
        if (this.x == null) {
            ? zt6 = new zt6(0);
            Bundle bundle = this.w;
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals("message_type") && !next.equals("collapse_key")) {
                        zt6.put(next, str);
                    }
                }
            }
            this.x = zt6;
        }
        return new HashMap(this.x);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.z(parcel, 2, this.w);
        h75.O(parcel, M);
    }
}
