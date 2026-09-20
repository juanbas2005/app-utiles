package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* renamed from: rv2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rv2 extends a3 {
    public static final Parcelable.Creator<rv2> CREATOR = new g39(10);
    public static final Scope[] K = new Scope[0];
    public static final cc2[] L = new cc2[0];
    public IBinder A;
    public Scope[] B;
    public Bundle C;
    public Account D;
    public cc2[] E;
    public cc2[] F;
    public final boolean G;
    public final int H;
    public boolean I;
    public final String J;
    public final int w;
    public final int x;
    public final int y;
    public String z;

    public rv2(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, cc2[] cc2Arr, cc2[] cc2Arr2, boolean z2, int i4, boolean z3, String str2) {
        Scope[] scopeArr2;
        Bundle bundle2;
        cc2[] cc2Arr3;
        Account account2;
        Object obj;
        if (scopeArr == null) {
            scopeArr2 = K;
        } else {
            scopeArr2 = scopeArr;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        cc2[] cc2Arr4 = L;
        if (cc2Arr == null) {
            cc2Arr3 = cc2Arr4;
        } else {
            cc2Arr3 = cc2Arr;
        }
        cc2Arr4 = cc2Arr2 != null ? cc2Arr2 : cc2Arr4;
        this.w = i;
        this.x = i2;
        this.y = i3;
        if ("com.google.android.gms".equals(str)) {
            this.z = "com.google.android.gms";
        } else {
            this.z = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = v5.e;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof j73) {
                    obj = (j73) queryLocalInterface;
                } else {
                    obj = new gg8(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    bb9 bb9 = (bb9) obj;
                    Parcel e = bb9.e(bb9.I(), 2);
                    Account account3 = (Account) et8.a(e, Account.CREATOR);
                    e.recycle();
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    account2 = account3;
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } catch (Throwable th) {
                    Throwable th2 = th;
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th2;
                }
            }
        } else {
            this.A = iBinder;
            account2 = account;
        }
        this.D = account2;
        this.B = scopeArr2;
        this.C = bundle2;
        this.E = cc2Arr3;
        this.F = cc2Arr4;
        this.G = z2;
        this.H = i4;
        this.I = z3;
        this.J = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        g39.a(this, parcel, i);
    }
}
