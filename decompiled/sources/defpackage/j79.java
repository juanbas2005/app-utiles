package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;

/* renamed from: j79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j79 {
    public static final zu8 a = new zu8(r29.N("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"), 4);
    public static final zu8 b = new zu8(r29.N("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"), 5);
    public static volatile bl8 c;
    public static final Object d = new Object();
    public static Context e;

    static {
        new zu8(r29.N("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014¢fú§pxb±"), 0);
        new zu8(r29.N("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB<"), 1);
        new zu8(r29.N("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"), 2);
        new zu8(r29.N("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"), 3);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v2, types: [gg8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static void a() {
        bl8 bl8;
        if (c == null) {
            z65.k(e);
            synchronized (d) {
                try {
                    if (c == null) {
                        IBinder b2 = f12.c(e, f12.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                        int i = mk8.e;
                        if (b2 == null) {
                            bl8 = null;
                        } else {
                            ? queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                            if (queryLocalInterface instanceof bl8) {
                                bl8 = queryLocalInterface;
                            } else {
                                bl8 = new gg8(b2, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 2);
                            }
                        }
                        c = bl8;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static zc9 b(String str, u39 u39, boolean z, boolean z2) {
        try {
            a();
            z65.k(e);
            try {
                bl8 bl8 = c;
                z25 z25 = new z25(e.getPackageManager());
                tj8 tj8 = (tj8) bl8;
                Parcel I = tj8.I();
                int i = et8.a;
                boolean z3 = true;
                I.writeInt(1);
                int M = h75.M(I, 20293);
                h75.F(I, 1, str);
                h75.C(I, 2, u39);
                h75.K(I, 3, 4);
                I.writeInt(z ? 1 : 0);
                h75.K(I, 4, 4);
                I.writeInt(z2 ? 1 : 0);
                h75.O(I, M);
                et8.b(I, z25);
                Parcel e2 = tj8.e(I, 5);
                if (e2.readInt() == 0) {
                    z3 = false;
                }
                e2.recycle();
                if (z3) {
                    return zc9.A;
                }
                return new lc9(new j49(z, str, u39));
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                return zc9.j("module call", e3);
            }
        } catch (DynamiteModule$LoadingException e4) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            return zc9.j("module init: ".concat(String.valueOf(e4.getMessage())), e4);
        }
    }
}
