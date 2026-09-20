package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: r29  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class r29 extends lg8 implements IInterface {
    public final int e;

    public r29(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 2);
        boolean z;
        if (bArr.length == 25) {
            z = true;
        } else {
            z = false;
        }
        z65.f(z);
        this.e = Arrays.hashCode(bArr);
    }

    public static byte[] N(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean K(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            y73 M = M();
            parcel2.writeNoException();
            et8.b(parcel2, M);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(this.e);
            return true;
        }
    }

    public abstract byte[] L();

    public final y73 M() {
        return new z25(L());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r29) {
            try {
                r29 r29 = (r29) obj;
                if (r29.e == this.e) {
                    y73 M = r29.M();
                    if (M != null) {
                        return Arrays.equals(L(), (byte[]) z25.M(M));
                    }
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }
}
