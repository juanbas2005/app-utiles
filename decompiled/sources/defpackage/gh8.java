package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gh8 extends a3 implements p66 {
    public static final Parcelable.Creator<gh8> CREATOR = new zc5(21);
    public final List w;
    public final String x;

    public gh8(String str, ArrayList arrayList) {
        this.w = arrayList;
        this.x = str;
    }

    public final Status d() {
        if (this.x != null) {
            return Status.A;
        }
        return Status.E;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.G(parcel, 1, this.w);
        h75.F(parcel, 2, this.x);
        h75.O(parcel, M);
    }
}
