package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class Scope extends a3 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new ki8(20);
    public final int w;
    public final String x;

    public Scope(int i, String str) {
        z65.i(str, "scopeUri must not be null or empty");
        this.w = i;
        this.x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.x.equals(((Scope) obj).x);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return this.x;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.F(parcel, 2, this.x);
        h75.O(parcel, M);
    }
}
