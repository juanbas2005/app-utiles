package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* renamed from: wg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wg8 extends lg8 implements nw2, ow2 {
    public static final wf3 l = ah8.a;
    public final Context e;
    public final Handler f;
    public final wf3 g = l;
    public final Set h;
    public final kd6 i;
    public ft6 j;
    public ge1 k;

    public wg8(Context context, ph8 ph8, kd6 kd6) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.e = context;
        this.f = ph8;
        this.i = kd6;
        this.h = (Set) kd6.x;
    }

    public final boolean I(int i2, Parcel parcel, Parcel parcel2) {
        switch (i2) {
            case 3:
                m11 m11 = (m11) tg8.a(parcel, m11.CREATOR);
                hg8 hg8 = (hg8) tg8.a(parcel, hg8.CREATOR);
                tg8.b(parcel);
                break;
            case 4:
                Status status = (Status) tg8.a(parcel, Status.CREATOR);
                tg8.b(parcel);
                break;
            case 6:
                Status status2 = (Status) tg8.a(parcel, Status.CREATOR);
                tg8.b(parcel);
                break;
            case 7:
                Status status3 = (Status) tg8.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) tg8.a(parcel, GoogleSignInAccount.CREATOR);
                tg8.b(parcel);
                break;
            case 8:
                tg8.b(parcel);
                this.f.post(new nt2(this, false, (oh8) tg8.a(parcel, oh8.CREATOR), 18));
                break;
            case 9:
                gh8 gh8 = (gh8) tg8.a(parcel, gh8.CREATOR);
                tg8.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public final void a(int i2) {
        ge1 ge1 = this.k;
        ng8 ng8 = (ng8) ((pw2) ge1.B).F.get((ln) ge1.x);
        if (ng8 == null) {
            return;
        }
        if (ng8.l) {
            ng8.n(new m11(17, (PendingIntent) null, (String) null));
        } else {
            ng8.a(i2);
        }
    }

    public final void b(m11 m11) {
        this.k.c(m11);
    }

    public final void e() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        ft6 ft6 = this.j;
        ft6.getClass();
        try {
            ft6.B.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = d47.a(ft6.c).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = ft6.D;
            z65.k(num);
            sh8 sh8 = new sh8(2, account, num.intValue(), googleSignInAccount);
            dh8 dh8 = (dh8) ft6.l();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(dh8.f);
            int i2 = tg8.a;
            obtain.writeInt(1);
            int M = h75.M(obtain, 20293);
            h75.K(obtain, 1, 4);
            obtain.writeInt(1);
            h75.E(obtain, 2, sh8, 0);
            h75.O(obtain, M);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
            dh8.e.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f.post(new nt2(this, false, new oh8(1, new m11(8, (PendingIntent) null, (String) null), (th8) null), 18));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            throw th;
        }
    }
}
