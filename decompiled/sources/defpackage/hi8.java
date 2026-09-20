package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: hi8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hi8 extends BasePendingResult {
    public final /* synthetic */ int k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hi8(pg8 pg8, int i) {
        super(pg8);
        this.k = i;
        z65.l("GoogleApiClient must not be null", pg8);
        z65.l("Api must not be null", vu.a);
    }

    public final /* bridge */ /* synthetic */ p66 b(Status status) {
        int i = this.k;
        return status;
    }

    public final void f(iw2 iw2) {
        switch (this.k) {
            case b85.b:
                ei8 ei8 = (ei8) iw2;
                li8 li8 = (li8) ei8.l();
                gi8 gi8 = new gi8(this, 0);
                GoogleSignInOptions googleSignInOptions = ei8.A;
                Parcel a = li8.a();
                int i = bi8.a;
                a.writeStrongBinder(gi8);
                bi8.c(a, googleSignInOptions);
                li8.b(a, 102);
                return;
            default:
                ei8 ei82 = (ei8) iw2;
                li8 li82 = (li8) ei82.l();
                gi8 gi82 = new gi8(this, 1);
                GoogleSignInOptions googleSignInOptions2 = ei82.A;
                Parcel a2 = li82.a();
                int i2 = bi8.a;
                a2.writeStrongBinder(gi82);
                bi8.c(a2, googleSignInOptions2);
                li82.b(a2, 103);
                return;
        }
    }

    public final void g(Status status) {
        z65.e("Failed result must not be success", !status.f());
        e(b(status));
    }
}
