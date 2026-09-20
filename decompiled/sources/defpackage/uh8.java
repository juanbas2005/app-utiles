package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;

/* renamed from: uh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uh8 extends lg8 {
    public final /* synthetic */ int e = 1;
    public final Object f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uh8(xb7 xb7) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 1);
        this.f = xb7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: hi8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: hi8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: x37} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: zg8} */
    /* JADX WARNING: type inference failed for: r6v5, types: [kw2, yf3] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        BasePendingResult basePendingResult;
        zg8 zg8;
        String e2;
        int i2 = this.e;
        Object obj = this.f;
        boolean z2 = false;
        switch (i2) {
            case b85.b:
                if (i != 1) {
                    return false;
                }
                bi8.b(parcel);
                a35.m((Status) bi8.a(parcel, Status.CREATOR), (c80) bi8.a(parcel, c80.CREATOR), (xb7) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i == 1) {
                    L();
                    d47 a = d47.a(revocationBoundService);
                    GoogleSignInAccount b = a.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.G;
                    if (b != null) {
                        String e3 = a.e("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(e3) && (e2 = a.e(d47.f("googleSignInOptions", e3))) != null) {
                            try {
                                googleSignInOptions = GoogleSignInOptions.f(e2);
                            } catch (JSONException unused) {
                            }
                        }
                        googleSignInOptions = null;
                    }
                    z65.k(googleSignInOptions);
                    ? kw2 = new kw2(revocationBoundService, vu.a, googleSignInOptions, new jw2(new g22(20), Looper.getMainLooper()));
                    Context context = kw2.a;
                    pg8 pg8 = kw2.i;
                    if (b != null) {
                        if (kw2.d() == 3) {
                            z2 = true;
                        }
                        ig igVar = ii8.a;
                        if (igVar.b <= 3) {
                            Log.d((String) igVar.c, ((String) igVar.d).concat("Revoking access"));
                        }
                        String e4 = d47.a(context).e("refreshToken");
                        ii8.a(context);
                        if (!z2) {
                            hi8 hi8 = new hi8(pg8, 1);
                            pg8.a(hi8);
                            zg8 = hi8;
                        } else if (e4 == null) {
                            ig igVar2 = zh8.y;
                            Status status = new Status(4, (String) null, (PendingIntent) null, (m11) null);
                            z65.e("Status code must not be SUCCESS", !status.f());
                            zg8 zg82 = new zg8(status);
                            zg82.e(status);
                            zg8 = zg82;
                        } else {
                            zh8 zh8 = new zh8(e4);
                            new Thread(zh8).start();
                            zg8 = zh8.x;
                        }
                        zg8.a(new qh8(zg8, new xb7(), new tz2(15)));
                        return true;
                    }
                    if (kw2.d() == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ig igVar3 = ii8.a;
                    if (igVar3.b <= 3) {
                        Log.d((String) igVar3.c, ((String) igVar3.d).concat("Signing out"));
                    }
                    ii8.a(context);
                    if (z) {
                        BasePendingResult basePendingResult2 = new BasePendingResult(pg8);
                        basePendingResult2.e(Status.A);
                        basePendingResult = basePendingResult2;
                    } else {
                        hi8 hi82 = new hi8(pg8, 0);
                        pg8.a(hi82);
                        basePendingResult = hi82;
                    }
                    basePendingResult.a(new qh8(basePendingResult, new xb7(), new tz2(15)));
                    return true;
                } else if (i != 2) {
                    return false;
                } else {
                    L();
                    ji8.I(revocationBoundService).J();
                    return true;
                }
        }
    }

    public void L() {
        if (!l55.p((RevocationBoundService) this.f, Binder.getCallingUid())) {
            throw new SecurityException(pb4.i(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    public uh8(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 1);
        this.f = revocationBoundService;
    }
}
