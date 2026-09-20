package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: w29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w29 extends cs8 implements iy8 {
    public final v89 d;
    public Boolean e;
    public String f = null;

    public w29(v89 v89) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        z65.k(v89);
        this.d = v89;
    }

    public final void A(z99 z99) {
        e(z99);
        I(new c29(this, z99, 1));
    }

    public final void C(z99 z99) {
        e(z99);
        I(new c29(this, z99, 2));
    }

    public final void D(z99 z99) {
        z65.h(z99.w);
        z65.k(z99.O);
        b(new c29(this, z99, 5));
    }

    public final void E(z99 z99, c89 c89, uy8 uy8) {
        e(z99);
        String str = z99.w;
        z65.k(str);
        this.d.n0().l1(new yl0(this, str, c89, uy8, 2, false));
    }

    public final void H(String str, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(str);
        v89 v89 = this.d;
        if (!isEmpty) {
            if (z) {
                try {
                    if (this.e == null) {
                        boolean z2 = true;
                        if (!"com.google.android.gms".equals(this.f) && !l55.p(v89.H.w, Binder.getCallingUid())) {
                            if (!uw2.a(v89.H.w).b(Binder.getCallingUid())) {
                                z2 = false;
                            }
                        }
                        this.e = Boolean.valueOf(z2);
                    }
                    if (this.e.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e2) {
                    v89.G().B.b("Measurement Service called with invalid calling package. appId", pz8.k1(str));
                    throw e2;
                }
            }
            if (this.f == null) {
                Context context = v89.H.w;
                int callingUid = Binder.getCallingUid();
                int i = rw2.e;
                if (l55.z(context, str, callingUid)) {
                    this.f = str;
                }
            }
            if (!str.equals(this.f)) {
                throw new SecurityException("Unknown calling package name '" + str + "'.");
            }
            return;
        }
        v89.G().B.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void I(Runnable runnable) {
        v89 v89 = this.d;
        if (v89.n0().i1()) {
            runnable.run();
        } else {
            v89.n0().l1(runnable);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v9, types: [uy8] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v14, types: [oy8] */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        List list;
        v89 v89 = this.d;
        ? r2 = 0;
        boolean z2 = false;
        switch (i) {
            case 1:
                ds8.d(parcel);
                r((zr8) ds8.a(parcel, zr8.CREATOR), (z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                ds8.d(parcel);
                o((z89) ds8.a(parcel, z89.CREATOR), (z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                ds8.d(parcel);
                h((z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                zr8 zr8 = (zr8) ds8.a(parcel, zr8.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                ds8.d(parcel);
                z65.k(zr8);
                z65.h(readString);
                H(readString, true);
                I(new z46(this, zr8, readString, 6));
                parcel2.writeNoException();
                return true;
            case 6:
                ds8.d(parcel);
                C((z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                z99 z99 = (z99) ds8.a(parcel, z99.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                ds8.d(parcel);
                e(z99);
                String str = z99.w;
                z65.k(str);
                try {
                    List<b99> list2 = (List) v89.n0().j1(new a29(this, str, 0)).get();
                    ArrayList arrayList = new ArrayList(list2.size());
                    for (b99 b99 : list2) {
                        if (!z) {
                            if (!d99.G1(b99.c)) {
                            }
                        }
                        arrayList.add(new z89(b99));
                    }
                    r2 = arrayList;
                } catch (InterruptedException e2) {
                    e = e2;
                    v89.G().B.c(pz8.k1(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(r2);
                    return true;
                } catch (ExecutionException e3) {
                    e = e3;
                    v89.G().B.c(pz8.k1(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(r2);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(r2);
            case 9:
                String readString2 = parcel.readString();
                ds8.d(parcel);
                byte[] v = v(readString2, (zr8) ds8.a(parcel, zr8.CREATOR));
                parcel2.writeNoException();
                parcel2.writeByteArray(v);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                ds8.d(parcel);
                m(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                ds8.d(parcel);
                String s = s((z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(s);
                return true;
            case 12:
                ds8.d(parcel);
                y((xn8) ds8.a(parcel, xn8.CREATOR), (z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                return true;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                xn8 xn8 = (xn8) ds8.a(parcel, xn8.CREATOR);
                ds8.d(parcel);
                z65.k(xn8);
                z65.k(xn8.y);
                z65.h(xn8.w);
                H(xn8.w, true);
                I(new nt2(this, false, new xn8(xn8), 25));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = ds8.a;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                ds8.d(parcel);
                List i2 = i(readString6, readString7, z2, (z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(i2);
                return true;
            case h75.g:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = ds8.a;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                ds8.d(parcel);
                List c = c(readString8, readString9, readString10, z2);
                parcel2.writeNoException();
                parcel2.writeTypedList(c);
                return true;
            case 16:
                ds8.d(parcel);
                List t = t(parcel.readString(), parcel.readString(), (z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(t);
                return true;
            case 17:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                ds8.d(parcel);
                List p = p(readString11, readString12, readString13);
                parcel2.writeNoException();
                parcel2.writeTypedList(p);
                return true;
            case 18:
                ds8.d(parcel);
                x((z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                ds8.d(parcel);
                j((Bundle) ds8.a(parcel, Bundle.CREATOR), (z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                ds8.d(parcel);
                q((z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                return true;
            case 21:
                ds8.d(parcel);
                dq8 u = u((z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                if (u == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                u.writeToParcel(parcel2, 1);
                return true;
            case 24:
                z99 z992 = (z99) ds8.a(parcel, z99.CREATOR);
                Bundle bundle = (Bundle) ds8.a(parcel, Bundle.CREATOR);
                ds8.d(parcel);
                e(z992);
                String str2 = z992.w;
                z65.k(str2);
                if (v89.c0().n1((String) null, by8.T0)) {
                    try {
                        list = (List) v89.n0().k1(new n29(this, z992, bundle, 0)).get(10000, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                        v89.G().B.c(pz8.k1(str2), e4, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) v89.n0().j1(new n29(this, z992, bundle, 1)).get();
                    } catch (InterruptedException | ExecutionException e5) {
                        v89.G().B.c(pz8.k1(str2), e5, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                break;
            case 25:
                ds8.d(parcel);
                l((z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                ds8.d(parcel);
                D((z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                ds8.d(parcel);
                A((z99) ds8.a(parcel, z99.CREATOR));
                parcel2.writeNoException();
                return true;
            case 29:
                z99 z993 = (z99) ds8.a(parcel, z99.CREATOR);
                c89 c89 = (c89) ds8.a(parcel, c89.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    if (queryLocalInterface instanceof uy8) {
                        r2 = (uy8) queryLocalInterface;
                    } else {
                        r2 = new gg8(readStrongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 3);
                    }
                }
                ds8.d(parcel);
                E(z993, c89, r2);
                parcel2.writeNoException();
                return true;
            case 30:
                ds8.d(parcel);
                w((z99) ds8.a(parcel, z99.CREATOR), (lm8) ds8.a(parcel, lm8.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                z99 z994 = (z99) ds8.a(parcel, z99.CREATOR);
                Bundle bundle2 = (Bundle) ds8.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    if (queryLocalInterface2 instanceof oy8) {
                        r2 = (oy8) queryLocalInterface2;
                    } else {
                        r2 = new gg8(readStrongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 3);
                    }
                }
                ds8.d(parcel);
                n(z994, bundle2, r2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
        return true;
    }

    public final void b(Runnable runnable) {
        v89 v89 = this.d;
        if (v89.n0().i1()) {
            runnable.run();
        } else {
            v89.n0().n1(runnable);
        }
    }

    public final List c(String str, String str2, String str3, boolean z) {
        H(str, true);
        v89 v89 = this.d;
        String str4 = str;
        try {
            List<b99> list = (List) v89.n0().j1(new g29(this, str4, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b99 b99 : list) {
                if (!z) {
                    if (!d99.G1(b99.c)) {
                    }
                }
                arrayList.add(new z89(b99));
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            v89.G().B.c(pz8.k1(str4), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e3) {
            e = e3;
            v89.G().B.c(pz8.k1(str4), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void e(z99 z99) {
        z65.k(z99);
        String str = z99.w;
        z65.h(str);
        H(str, false);
        this.d.i0().i1(z99.x);
    }

    public final void h(z99 z99) {
        e(z99);
        I(new c29(this, z99, 0));
    }

    public final List i(String str, String str2, boolean z, z99 z99) {
        e(z99);
        String str3 = z99.w;
        z65.k(str3);
        v89 v89 = this.d;
        try {
            List<b99> list = (List) v89.n0().j1(new g29(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (b99 b99 : list) {
                if (!z) {
                    if (!d99.G1(b99.c)) {
                    }
                }
                arrayList.add(new z89(b99));
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            v89.G().B.c(pz8.k1(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e3) {
            e = e3;
            v89.G().B.c(pz8.k1(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void j(Bundle bundle, z99 z99) {
        e(z99);
        String str = z99.w;
        z65.k(str);
        I(new yl0(this, bundle, str, z99, 4, false));
    }

    public final void l(z99 z99) {
        z65.h(z99.w);
        z65.k(z99.O);
        b(new c29(this, z99, 6));
    }

    public final void m(long j, String str, String str2, String str3) {
        String str4 = str2;
        String str5 = str3;
        I(new rk7(this, str4, str5, str, j, 1));
    }

    public final void n(z99 z99, Bundle bundle, oy8 oy8) {
        e(z99);
        String str = z99.w;
        z65.k(str);
        this.d.n0().l1(new p29(this, z99, bundle, oy8, str));
    }

    public final void o(z89 z89, z99 z99) {
        z65.k(z89);
        e(z99);
        I(new z46(this, z89, z99, 7));
    }

    public final List p(String str, String str2, String str3) {
        H(str, true);
        v89 v89 = this.d;
        try {
            return (List) v89.n0().j1(new g29(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            v89.G().B.b("Failed to get conditional user properties as", e2);
            return Collections.EMPTY_LIST;
        }
    }

    public final void q(z99 z99) {
        z65.h(z99.w);
        z65.k(z99.O);
        b(new c29(this, z99, 4));
    }

    public final void r(zr8 zr8, z99 z99) {
        z65.k(zr8);
        e(z99);
        I(new z46(this, zr8, z99, 5));
    }

    public final String s(z99 z99) {
        e(z99);
        v89 v89 = this.d;
        try {
            return (String) v89.n0().j1(new a29(v89, z99)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            v89.G().B.c(pz8.k1(z99.w), e2, "Failed to get app instance id. appId");
            return null;
        }
    }

    public final List t(String str, String str2, z99 z99) {
        e(z99);
        String str3 = z99.w;
        z65.k(str3);
        v89 v89 = this.d;
        try {
            return (List) v89.n0().j1(new g29(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            v89.G().B.b("Failed to get conditional user properties", e2);
            return Collections.EMPTY_LIST;
        }
    }

    public final dq8 u(z99 z99) {
        e(z99);
        String str = z99.w;
        z65.h(str);
        v89 v89 = this.d;
        try {
            return (dq8) v89.n0().k1(new a29(this, z99, 1)).get(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            v89.G().B.c(pz8.k1(str), e2, "Failed to get consent. appId");
            return new dq8((Bundle) null);
        }
    }

    public final byte[] v(String str, zr8 zr8) {
        z65.h(str);
        z65.k(zr8);
        H(str, true);
        v89 v89 = this.d;
        mz8 mz8 = v89.G().I;
        y19 y19 = v89.H;
        fz8 fz8 = y19.F;
        String str2 = zr8.w;
        mz8.b("Log and bundle. event", fz8.a(str2));
        v89.Q().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) v89.n0().k1(new hl4(this, zr8, str)).get();
            if (bArr == null) {
                v89.G().B.b("Log and bundle returned null. appId", pz8.k1(str));
                bArr = new byte[0];
            }
            v89.Q().getClass();
            v89.G().I.d("Log and bundle processed. event, size, time_ms", y19.F.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e2) {
            e = e2;
            v89.G().B.d("Failed to log and bundle. appId, event, error", pz8.k1(str), y19.F.a(str2), e);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            v89.G().B.d("Failed to log and bundle. appId, event, error", pz8.k1(str), y19.F.a(str2), e);
            return null;
        }
    }

    public final void w(z99 z99, lm8 lm8) {
        e(z99);
        I(new z46(this, z99, false, lm8, 8));
    }

    public final void x(z99 z99) {
        String str = z99.w;
        z65.h(str);
        H(str, false);
        I(new c29(this, z99, 3));
    }

    public final void y(xn8 xn8, z99 z99) {
        z65.k(xn8);
        z65.k(xn8.y);
        e(z99);
        xn8 xn82 = new xn8(xn8);
        xn82.w = z99.w;
        I(new z46(this, xn82, z99, 4));
    }
}
