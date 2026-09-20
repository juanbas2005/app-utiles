package defpackage;

import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: xg8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xg8 extends i93 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;

    public xg8(za0 za0, cc2[] cc2Arr, boolean z, int i) {
        boolean z2 = false;
        this.e = za0;
        this.c = cc2Arr;
        if (cc2Arr != null && z) {
            z2 = true;
        }
        this.a = z2;
        this.b = i;
    }

    public final void c(iw2 iw2, xb7 xb7) {
        String readString;
        String readString2;
        ArrayList readArrayList;
        br8 br8 = null;
        switch (this.d) {
            case b85.b:
                ((y36) ((za0) this.e).d).accept(iw2, xb7);
                return;
            case 1:
                l49 l49 = (l49) iw2;
                String str = (String) this.e;
                synchronized (l49) {
                    try {
                        br8 = (br8) l49.l();
                    } catch (DeadObjectException | IllegalStateException unused) {
                    }
                    if (br8 != null) {
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
                        obtain.writeString(str);
                        Parcel a = br8.a(obtain, 2);
                        readString = a.readString();
                        a.recycle();
                    } else {
                        throw new RemoteException("no service for getLicenseDetail call");
                    }
                }
                xb7.b(readString);
                return;
            case 2:
                l49 l492 = (l49) iw2;
                jb9 jb9 = (jb9) this.e;
                synchronized (l492) {
                    try {
                        br8 = (br8) l492.l();
                    } catch (DeadObjectException | IllegalStateException unused2) {
                    }
                    if (br8 != null) {
                        String str2 = jb9.w;
                        Parcel obtain2 = Parcel.obtain();
                        obtain2.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
                        obtain2.writeString(str2);
                        Parcel a2 = br8.a(obtain2, 4);
                        readString2 = a2.readString();
                        a2.recycle();
                    } else {
                        throw new RemoteException("no service for getLicenseDetail call");
                    }
                }
                xb7.b(readString2);
                return;
            default:
                l49 l493 = (l49) iw2;
                ArrayList arrayList = (ArrayList) this.e;
                synchronized (l493) {
                    try {
                        br8 = (br8) l493.l();
                    } catch (DeadObjectException | IllegalStateException unused3) {
                    }
                    if (br8 != null) {
                        Parcel obtain3 = Parcel.obtain();
                        obtain3.writeInterfaceToken("com.google.android.gms.oss.licenses.IOSSLicenseService");
                        obtain3.writeList(arrayList);
                        Parcel a3 = br8.a(obtain3, 5);
                        readArrayList = a3.readArrayList(yq8.a);
                        a3.recycle();
                    } else {
                        throw new RemoteException("no service for getLicenseDetail call");
                    }
                }
                xb7.b(readArrayList);
                return;
        }
    }

    public xg8(yf3 yf3, String str) {
        this.e = str;
        Objects.requireNonNull(yf3);
    }

    public xg8(yf3 yf3, ArrayList arrayList) {
        this.e = arrayList;
        Objects.requireNonNull(yf3);
    }

    public xg8(yf3 yf3, jb9 jb9) {
        this.e = jb9;
        Objects.requireNonNull(yf3);
    }
}
