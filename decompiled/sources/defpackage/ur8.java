package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* renamed from: ur8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ur8 extends a3 implements Iterable {
    public static final Parcelable.Creator<ur8> CREATOR = new ki8(16);
    public final Bundle w;

    public ur8(Bundle bundle) {
        this.w = bundle;
    }

    public final Object f(String str) {
        return this.w.get(str);
    }

    public final Double g() {
        return Double.valueOf(this.w.getDouble("value"));
    }

    public final Iterator iterator() {
        return new ct7(this);
    }

    public final String k() {
        return this.w.getString("currency");
    }

    public final Bundle l() {
        return new Bundle(this.w);
    }

    public final String toString() {
        return this.w.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.z(parcel, 2, l());
        h75.O(parcel, M);
    }
}
