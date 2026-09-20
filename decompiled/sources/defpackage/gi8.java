package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: gi8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gi8 extends lg8 implements IInterface {
    public final /* synthetic */ int e;
    public final /* synthetic */ hi8 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gi8(hi8 hi8, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 1);
        this.e = i;
        this.f = hi8;
    }

    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        hi8 hi8 = this.f;
        int i2 = this.e;
        switch (i) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) bi8.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) bi8.a(parcel, Status.CREATOR);
                bi8.b(parcel);
                ku4.p();
                return false;
            case 102:
                Status status2 = (Status) bi8.a(parcel, Status.CREATOR);
                bi8.b(parcel);
                switch (i2) {
                    case b85.b:
                        hi8.e(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case 103:
                Status status3 = (Status) bi8.a(parcel, Status.CREATOR);
                bi8.b(parcel);
                switch (i2) {
                    case 1:
                        hi8.e(status3);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
