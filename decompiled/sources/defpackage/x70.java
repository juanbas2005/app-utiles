package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: x70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x70 extends a3 {
    public static final Parcelable.Creator<x70> CREATOR = new zc5(29);
    public final String A;
    public final ArrayList B;
    public final boolean C;
    public final boolean w;
    public final String x;
    public final String y;
    public final boolean z;

    public x70(boolean z2, String str, String str2, boolean z3, String str3, ArrayList arrayList, boolean z4) {
        boolean z5 = true;
        if (z3 && z4) {
            z5 = false;
        }
        z65.e("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z5);
        this.w = z2;
        if (z2) {
            z65.l("serverClientId must be provided if Google ID tokens are requested", str);
        }
        this.x = str;
        this.y = str2;
        this.z = z3;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.B = arrayList2;
        this.A = str3;
        this.C = z4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [w70, java.lang.Object] */
    public static w70 f() {
        ? obj = new Object();
        obj.a = false;
        obj.c = null;
        obj.d = null;
        obj.b = true;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x70)) {
            return false;
        }
        x70 x70 = (x70) obj;
        if (this.w != x70.w || !b35.j(this.x, x70.x) || !b35.j(this.y, x70.y) || this.z != x70.z || !b35.j(this.A, x70.A) || !b35.j(this.B, x70.B) || this.C != x70.C) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.w), this.x, this.y, Boolean.valueOf(this.z), this.A, this.B, Boolean.valueOf(this.C)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w ? 1 : 0);
        h75.F(parcel, 2, this.x);
        h75.F(parcel, 3, this.y);
        h75.K(parcel, 4, 4);
        parcel.writeInt(this.z ? 1 : 0);
        h75.F(parcel, 5, this.A);
        h75.G(parcel, 6, this.B);
        h75.K(parcel, 7, 4);
        parcel.writeInt(this.C ? 1 : 0);
        h75.O(parcel, M);
    }
}
