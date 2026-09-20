package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: sh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sh8 extends a3 {
    public static final Parcelable.Creator<sh8> CREATOR = new zc5(24);
    public final int w;
    public final Account x;
    public final int y;
    public final GoogleSignInAccount z;

    public sh8(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.w = i;
        this.x = account;
        this.y = i2;
        this.z = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(this.w);
        h75.E(parcel, 2, this.x, i);
        h75.K(parcel, 3, 4);
        parcel.writeInt(this.y);
        h75.E(parcel, 4, this.z, i);
        h75.O(parcel, M);
    }
}
