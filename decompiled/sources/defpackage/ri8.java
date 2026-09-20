package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: ri8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ri8 implements Parcelable.Creator {
    public static final ri8 b = new ri8(0);
    public final /* synthetic */ int a;

    public /* synthetic */ ri8(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: dv0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: android.app.PendingIntent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r10v8, types: [android.view.View$BaseSavedState, java.lang.Object, tp] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r10v37, types: [java.lang.Object, nq2] */
    /* JADX WARNING: type inference failed for: r10v38, types: [sq2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v28, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r10v45, types: [v64, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r10v46, types: [android.view.View$BaseSavedState, java.lang.Object, mg4] */
    /* JADX WARNING: type inference failed for: r1v42, types: [int] */
    /* JADX WARNING: type inference failed for: r10v50, types: [android.view.View$BaseSavedState, java.lang.Object, cy4] */
    /* JADX WARNING: type inference failed for: r2v39 */
    /* JADX WARNING: type inference failed for: r1v46 */
    /* JADX WARNING: type inference failed for: r2v41 */
    /* JADX WARNING: type inference failed for: r1v49 */
    /* JADX WARNING: type inference failed for: r1v52 */
    /* JADX WARNING: type inference failed for: r1v55 */
    /* JADX WARNING: type inference failed for: r2v44 */
    /* JADX WARNING: type inference failed for: r2v48 */
    /* JADX WARNING: type inference failed for: r2v51 */
    /* JADX WARNING: type inference failed for: r2v54 */
    /* JADX WARNING: type inference failed for: r2v60 */
    /* JADX WARNING: type inference failed for: r2v63 */
    /* JADX WARNING: type inference failed for: r1v57 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object createFromParcel(Parcel parcel) {
        dv0 dv0;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        PendingIntent pendingIntent;
        String str;
        Bundle bundle;
        Bundle bundle2;
        ArrayList arrayList;
        Bundle bundle3;
        ? r1 = 0;
        ? r2 = 0;
        switch (this.a) {
            case b85.b:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() == -204102970) {
                    int U = g75.U(parcel);
                    while (parcel.dataPosition() < U) {
                        int readInt = parcel.readInt();
                        char c = (char) readInt;
                        if (c == 1) {
                            z = r1;
                            dv0 = (dv0) g75.t(parcel, readInt, dv0.CREATOR);
                        } else if (c != 2) {
                            g75.T(parcel, readInt);
                            dv0 = r2;
                            z = r1;
                        } else {
                            dv0 = r2;
                            z = g75.J(parcel, readInt);
                        }
                        r2 = dv0;
                        r1 = z;
                    }
                    g75.z(parcel, U);
                    return new mn(r2, r1);
                }
                parcel.setDataPosition(dataPosition - 4);
                return mn.z;
            case 1:
                parcel.getClass();
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    r2 = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                return new q8(r2, readInt2);
            case 2:
                ? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    r1 = 1;
                }
                baseSavedState.w = r1;
                return baseSavedState;
            case 3:
                return new r30(parcel);
            case 4:
                return new s30(parcel);
            case 5:
                Class<zl4> cls = zl4.class;
                return new sh0((zl4) parcel.readParcelable(cls.getClassLoader()), (zl4) parcel.readParcelable(cls.getClassLoader()), (bj1) parcel.readParcelable(bj1.class.getClassLoader()), (zl4) parcel.readParcelable(cls.getClassLoader()), parcel.readInt());
            case 6:
                int U2 = g75.U(parcel);
                while (parcel.dataPosition() < U2) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        g75.T(parcel, readInt3);
                        z2 = r1;
                    } else {
                        z2 = g75.J(parcel, readInt3);
                    }
                    r1 = z2;
                }
                g75.z(parcel, U2);
                return new ar0(r1);
            case 7:
                int U3 = g75.U(parcel);
                while (parcel.dataPosition() < U3) {
                    g75.T(parcel, parcel.readInt());
                }
                g75.z(parcel, U3);
                return new Object();
            case 8:
                int U4 = g75.U(parcel);
                while (parcel.dataPosition() < U4) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        g75.T(parcel, readInt4);
                        z3 = r1;
                    } else {
                        z3 = g75.J(parcel, readInt4);
                    }
                    r1 = z3;
                }
                g75.z(parcel, U4);
                return new dr0(r1);
            case 9:
                int U5 = g75.U(parcel);
                while (parcel.dataPosition() < U5) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        g75.T(parcel, readInt5);
                        z4 = r1;
                    } else {
                        z4 = g75.J(parcel, readInt5);
                    }
                    r1 = z4;
                }
                g75.z(parcel, U5);
                return new er0(r1);
            case 10:
                return new z81(parcel);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                int U6 = g75.U(parcel);
                bb1 bb1 = null;
                while (parcel.dataPosition() < U6) {
                    int readInt6 = parcel.readInt();
                    char c2 = (char) readInt6;
                    if (c2 == 1) {
                        pendingIntent = (PendingIntent) g75.t(parcel, readInt6, PendingIntent.CREATOR);
                    } else if (c2 != 2) {
                        g75.T(parcel, readInt6);
                        pendingIntent = r2;
                    } else {
                        bb1 = (bb1) g75.t(parcel, readInt6, bb1.CREATOR);
                        pendingIntent = r2;
                    }
                    r2 = pendingIntent;
                }
                g75.z(parcel, U6);
                return new za1(r2, bb1);
            case 12:
                int U7 = g75.U(parcel);
                Bundle bundle4 = null;
                while (parcel.dataPosition() < U7) {
                    int readInt7 = parcel.readInt();
                    char c3 = (char) readInt7;
                    if (c3 == 1) {
                        str = g75.u(parcel, readInt7);
                    } else if (c3 != 2) {
                        g75.T(parcel, readInt7);
                        str = r2;
                    } else {
                        bundle4 = g75.p(parcel, readInt7);
                        str = r2;
                    }
                    r2 = str;
                }
                g75.z(parcel, U7);
                return new bb1(r2, bundle4);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                int U8 = g75.U(parcel);
                String str2 = "";
                String str3 = str2;
                String str4 = str3;
                Bundle bundle5 = null;
                Bundle bundle6 = null;
                String str5 = null;
                while (parcel.dataPosition() < U8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            str2 = g75.u(parcel, readInt8);
                            break;
                        case 2:
                            bundle5 = g75.p(parcel, readInt8);
                            break;
                        case 3:
                            bundle6 = g75.p(parcel, readInt8);
                            break;
                        case 4:
                            str5 = g75.u(parcel, readInt8);
                            break;
                        case 5:
                            str3 = g75.u(parcel, readInt8);
                            break;
                        case 6:
                            str4 = g75.u(parcel, readInt8);
                            break;
                        default:
                            g75.T(parcel, readInt8);
                            break;
                    }
                }
                g75.z(parcel, U8);
                return new nb1(str2, bundle5, bundle6, str5, str3, str4);
            case 14:
                int U9 = g75.U(parcel);
                while (parcel.dataPosition() < U9) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        g75.T(parcel, readInt9);
                        bundle = r2;
                    } else {
                        bundle = g75.p(parcel, readInt9);
                    }
                    r2 = bundle;
                }
                g75.z(parcel, U9);
                return new bc1(r2);
            case h75.g:
                return new bj1(parcel.readLong());
            case 16:
                return new mm1(parcel.readInt());
            case 17:
                int U10 = g75.U(parcel);
                while (parcel.dataPosition() < U10) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        g75.T(parcel, readInt10);
                        bundle2 = r2;
                    } else {
                        bundle2 = g75.p(parcel, readInt10);
                    }
                    r2 = bundle2;
                }
                g75.z(parcel, U10);
                return new d92(r2);
            case 18:
                ? obj = new Object();
                obj.w = parcel.readString();
                obj.x = parcel.readInt();
                return obj;
            case 19:
                ? obj2 = new Object();
                obj2.A = null;
                obj2.B = new ArrayList();
                obj2.C = new ArrayList();
                obj2.w = parcel.createStringArrayList();
                obj2.x = parcel.createStringArrayList();
                obj2.y = (r30[]) parcel.createTypedArray(r30.CREATOR);
                obj2.z = parcel.readInt();
                obj2.A = parcel.readString();
                obj2.B = parcel.createStringArrayList();
                obj2.C = parcel.createTypedArrayList(s30.CREATOR);
                obj2.D = parcel.createTypedArrayList(nq2.CREATOR);
                return obj2;
            case 20:
                return new vq2(parcel);
            case 21:
                int U11 = g75.U(parcel);
                Bundle bundle7 = null;
                String str6 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < U11) {
                    int readInt11 = parcel.readInt();
                    char c4 = (char) readInt11;
                    if (c4 == 1) {
                        arrayList = g75.x(parcel, readInt11, nb1.CREATOR);
                    } else if (c4 == 2) {
                        bundle7 = g75.p(parcel, readInt11);
                        arrayList = r2;
                    } else if (c4 == 3) {
                        str6 = g75.u(parcel, readInt11);
                        arrayList = r2;
                    } else if (c4 != 4) {
                        g75.T(parcel, readInt11);
                        arrayList = r2;
                    } else {
                        resultReceiver = (ResultReceiver) g75.t(parcel, readInt11, ResultReceiver.CREATOR);
                        arrayList = r2;
                    }
                    r2 = arrayList;
                }
                g75.z(parcel, U11);
                return new GetCredentialRequest(r2, bundle7, str6, resultReceiver);
            case 22:
                int U12 = g75.U(parcel);
                while (parcel.dataPosition() < U12) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        g75.T(parcel, readInt12);
                        bundle3 = r2;
                    } else {
                        bundle3 = g75.p(parcel, readInt12);
                    }
                    r2 = bundle3;
                }
                g75.z(parcel, U12);
                return new x93(r2);
            case 23:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new bf3((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 24:
                ? obj3 = new Object();
                obj3.w = parcel.readInt();
                obj3.x = parcel.readInt();
                if (parcel.readInt() == 1) {
                    r1 = 1;
                }
                obj3.y = r1;
                return obj3;
            case 25:
                ? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.w = ((Integer) parcel.readValue(mg4.class.getClassLoader())).intValue();
                return baseSavedState2;
            case 26:
                String readString = parcel.readString();
                readString.getClass();
                int readInt13 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt13);
                while (r1 < readInt13) {
                    String readString2 = parcel.readString();
                    readString2.getClass();
                    String readString3 = parcel.readString();
                    readString3.getClass();
                    linkedHashMap.put(readString2, readString3);
                    r1++;
                }
                return new mi4(readString, linkedHashMap);
            case 27:
                return zl4.a(parcel.readInt(), parcel.readInt());
            case 28:
                ? baseSavedState3 = new View.BaseSavedState(parcel);
                baseSavedState3.w = parcel.readInt();
                return baseSavedState3;
            default:
                return new ParcelImpl(parcel);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case b85.b:
                return new mn[i];
            case 1:
                return new q8[i];
            case 2:
                return new tp[i];
            case 3:
                return new r30[i];
            case 4:
                return new s30[i];
            case 5:
                return new sh0[i];
            case 6:
                return new ar0[i];
            case 7:
                return new cr0[i];
            case 8:
                return new dr0[i];
            case 9:
                return new er0[i];
            case 10:
                return new z81[i];
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new za1[i];
            case 12:
                return new bb1[i];
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new nb1[i];
            case 14:
                return new bc1[i];
            case h75.g:
                return new bj1[i];
            case 16:
                return new mm1[i];
            case 17:
                return new d92[i];
            case 18:
                return new nq2[i];
            case 19:
                return new sq2[i];
            case 20:
                return new vq2[i];
            case 21:
                return new GetCredentialRequest[i];
            case 22:
                return new x93[i];
            case 23:
                return new bf3[i];
            case 24:
                return new v64[i];
            case 25:
                return new mg4[i];
            case 26:
                return new mi4[i];
            case 27:
                return new zl4[i];
            case 28:
                return new cy4[i];
            default:
                return new ParcelImpl[i];
        }
    }
}
