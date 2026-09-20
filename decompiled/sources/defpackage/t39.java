package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.zzaeh;

/* renamed from: t39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class t39 extends cs8 {
    public final /* synthetic */ int d = 2;
    public final Object e;

    public t39(xb7 xb7) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.e = xb7;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (this.d) {
            case b85.b:
                if (i != 2) {
                    return false;
                }
                Status status = (Status) ds8.a(parcel, Status.CREATOR);
                byte[] createByteArray = parcel.createByteArray();
                ds8.d(parcel);
                xb7 xb7 = (xb7) this.e;
                if (status.f()) {
                    try {
                        gl8 gl8 = gl8.a;
                        int i2 = rk8.a;
                        a35.m(status, w69.v(createByteArray, gl8.b), xb7);
                    } catch (zzaeh e2) {
                        xb7.a(e2);
                    }
                } else {
                    a35.m(status, (Object) null, xb7);
                }
                return true;
            case 1:
                xb7 xb72 = (xb7) this.e;
                switch (i) {
                    case 1:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (Object) null, xb72);
                        break;
                    case 2:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (Object) null, xb72);
                        break;
                    case 3:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (Object) null, xb72);
                        break;
                    case 4:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (b39) ds8.a(parcel, b39.CREATOR), xb72);
                        break;
                    case 5:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (Object) null, xb72);
                        break;
                    case 6:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (i39) ds8.a(parcel, i39.CREATOR), xb72);
                        break;
                    case 7:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (e39) ds8.a(parcel, e39.CREATOR), xb72);
                        break;
                    case 8:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (Object) null, xb72);
                        break;
                    case 9:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (j39) ds8.a(parcel, j39.CREATOR), xb72);
                        break;
                    case 10:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (b39) ds8.a(parcel, b39.CREATOR), xb72);
                        break;
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                        parcel.readLong();
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (Object) null, xb72);
                        break;
                    case 12:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (Object) null, xb72);
                        break;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (n39) ds8.a(parcel, n39.CREATOR), xb72);
                        break;
                    case 14:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (Object) null, xb72);
                        break;
                    case h75.g:
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), (Object) null, xb72);
                        break;
                    case 16:
                        long readLong = parcel.readLong();
                        ds8.d(parcel);
                        a35.m((Status) ds8.a(parcel, Status.CREATOR), Long.valueOf(readLong), xb72);
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                byte[] createByteArray2 = parcel.createByteArray();
                ds8.d(parcel);
                uy5 uy5 = new uy5(this, createByteArray2);
                uw2 uw2 = (uw2) this.e;
                ((iy2) uw2.a).execute(new nt2(17, (Object) uw2, (Object) uy5));
                return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t39(b49 b49, uw2 uw2) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.e = uw2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t39(b49 b49, xb7 xb7) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.e = xb7;
    }
}
