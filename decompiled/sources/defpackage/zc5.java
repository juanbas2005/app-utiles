package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.firebase.perf.metrics.Trace;
import java.util.ArrayList;

/* renamed from: zc5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zc5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ zc5(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: android.app.PendingIntent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: android.app.PendingIntent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: m11} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v32, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v37, resolved type: com.google.android.gms.auth.api.signin.GoogleSignInAccount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v41, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r0v20, types: [java.lang.Object, e27] */
    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, f27] */
    /* JADX WARNING: type inference failed for: r10v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r10v18, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r10v22, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v67, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r10v25, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v41, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v100, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v101, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v102, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v103, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r10v47 */
    /* JADX WARNING: type inference failed for: r10v50 */
    /* JADX WARNING: type inference failed for: r10v53 */
    /* JADX WARNING: type inference failed for: r10v57 */
    /* JADX WARNING: type inference failed for: r10v61 */
    /* JADX WARNING: type inference failed for: r10v66 */
    /* JADX WARNING: type inference failed for: r10v78 */
    /* JADX WARNING: type inference failed for: r10v82 */
    /* JADX WARNING: type inference failed for: r10v87 */
    /* JADX WARNING: type inference failed for: r10v93 */
    /* JADX WARNING: type inference failed for: r10v98 */
    /* JADX WARNING: type inference failed for: r10v101 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        Bundle bundle;
        boolean z;
        boolean z2;
        Bundle bundle2;
        ArrayList arrayList;
        Intent intent;
        ArrayList arrayList2;
        ArrayList arrayList3;
        m11 m11;
        Account account;
        GoogleSignInAccount googleSignInAccount;
        PendingIntent pendingIntent3;
        Parcel parcel2 = parcel;
        boolean z3 = true;
        int i = 0;
        ? r10 = 0;
        switch (this.a) {
            case b85.b:
                return new ad5(parcel2.readFloat());
            case 1:
                return new bd5(parcel2.readInt());
            case 2:
                return new cd5(parcel2.readLong());
            case 3:
                int U = g75.U(parcel2);
                while (parcel2.dataPosition() < U) {
                    int readInt = parcel2.readInt();
                    if (((char) readInt) != 1) {
                        g75.T(parcel2, readInt);
                        pendingIntent = r10;
                    } else {
                        pendingIntent = (PendingIntent) g75.t(parcel2, readInt, PendingIntent.CREATOR);
                    }
                    r10 = pendingIntent;
                }
                g75.z(parcel2, U);
                return new if5(r10);
            case 4:
                int U2 = g75.U(parcel2);
                while (parcel2.dataPosition() < U2) {
                    int readInt2 = parcel2.readInt();
                    if (((char) readInt2) != 1) {
                        g75.T(parcel2, readInt2);
                        pendingIntent2 = r10;
                    } else {
                        pendingIntent2 = (PendingIntent) g75.t(parcel2, readInt2, PendingIntent.CREATOR);
                    }
                    r10 = pendingIntent2;
                }
                g75.z(parcel2, U2);
                return new jf5(r10);
            case 5:
                return new sf5(parcel2);
            case 6:
                int U3 = g75.U(parcel2);
                while (parcel2.dataPosition() < U3) {
                    g75.T(parcel2, parcel2.readInt());
                }
                g75.z(parcel2, U3);
                return new Object();
            case 7:
                int U4 = g75.U(parcel2);
                while (parcel2.dataPosition() < U4) {
                    g75.T(parcel2, parcel2.readInt());
                }
                g75.z(parcel2, U4);
                return new Object();
            case 8:
                int U5 = g75.U(parcel2);
                while (parcel2.dataPosition() < U5) {
                    g75.T(parcel2, parcel2.readInt());
                }
                g75.z(parcel2, U5);
                return new Object();
            case 9:
                int U6 = g75.U(parcel2);
                while (parcel2.dataPosition() < U6) {
                    int readInt3 = parcel2.readInt();
                    if (((char) readInt3) != 2) {
                        g75.T(parcel2, readInt3);
                        bundle = r10;
                    } else {
                        bundle = g75.p(parcel2, readInt3);
                    }
                    r10 = bundle;
                }
                g75.z(parcel2, U6);
                return new d46(r10);
            case 10:
                int U7 = g75.U(parcel2);
                while (parcel2.dataPosition() < U7) {
                    g75.T(parcel2, parcel2.readInt());
                }
                g75.z(parcel2, U7);
                return new Object();
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                ? obj = new Object();
                obj.w = parcel2.readInt();
                obj.x = parcel2.readInt();
                if (parcel2.readInt() != 1) {
                    z3 = false;
                }
                obj.z = z3;
                int readInt4 = parcel2.readInt();
                if (readInt4 > 0) {
                    int[] iArr = new int[readInt4];
                    obj.y = iArr;
                    parcel2.readIntArray(iArr);
                }
                return obj;
            case 12:
                ? obj2 = new Object();
                obj2.w = parcel2.readInt();
                obj2.x = parcel2.readInt();
                int readInt5 = parcel2.readInt();
                obj2.y = readInt5;
                if (readInt5 > 0) {
                    int[] iArr2 = new int[readInt5];
                    obj2.z = iArr2;
                    parcel2.readIntArray(iArr2);
                }
                int readInt6 = parcel2.readInt();
                obj2.A = readInt6;
                if (readInt6 > 0) {
                    int[] iArr3 = new int[readInt6];
                    obj2.B = iArr3;
                    parcel2.readIntArray(iArr3);
                }
                if (parcel2.readInt() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                obj2.D = z;
                if (parcel2.readInt() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                obj2.E = z2;
                if (parcel2.readInt() != 1) {
                    z3 = false;
                }
                obj2.F = z3;
                obj2.C = parcel2.readArrayList(e27.class.getClassLoader());
                return obj2;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                return new ui7(parcel2.readLong(), parcel2.readLong());
            case 14:
                return new Trace(parcel2, false);
            case h75.g:
                int U8 = g75.U(parcel2);
                int i2 = 0;
                while (parcel2.dataPosition() < U8) {
                    int readInt7 = parcel2.readInt();
                    char c = (char) readInt7;
                    if (c == 1) {
                        i = g75.L(parcel2, readInt7);
                        bundle2 = r10;
                    } else if (c == 2) {
                        i2 = g75.L(parcel2, readInt7);
                        bundle2 = r10;
                    } else if (c != 3) {
                        g75.T(parcel2, readInt7);
                        bundle2 = r10;
                    } else {
                        bundle2 = g75.p(parcel2, readInt7);
                    }
                    r10 = bundle2;
                }
                g75.z(parcel2, U8);
                return new tw2(i, i2, r10);
            case 16:
                int U9 = g75.U(parcel2);
                while (parcel2.dataPosition() < U9) {
                    int readInt8 = parcel2.readInt();
                    char c2 = (char) readInt8;
                    if (c2 == 1) {
                        i = g75.L(parcel2, readInt8);
                        arrayList = r10;
                    } else if (c2 != 2) {
                        g75.T(parcel2, readInt8);
                        arrayList = r10;
                    } else {
                        arrayList = g75.x(parcel2, readInt8, sk4.CREATOR);
                    }
                    r10 = arrayList;
                }
                g75.z(parcel2, U9);
                return new dc7(i, r10);
            case 17:
                int U10 = g75.U(parcel2);
                int i3 = 0;
                while (parcel2.dataPosition() < U10) {
                    int readInt9 = parcel2.readInt();
                    char c3 = (char) readInt9;
                    if (c3 == 1) {
                        i = g75.L(parcel2, readInt9);
                        intent = r10;
                    } else if (c3 == 2) {
                        i3 = g75.L(parcel2, readInt9);
                        intent = r10;
                    } else if (c3 != 3) {
                        g75.T(parcel2, readInt9);
                        intent = r10;
                    } else {
                        intent = (Intent) g75.t(parcel2, readInt9, Intent.CREATOR);
                    }
                    r10 = intent;
                }
                g75.z(parcel2, U10);
                return new hg8(i, i3, r10);
            case 18:
                int U11 = g75.U(parcel2);
                long j = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList4 = null;
                String str7 = null;
                String str8 = null;
                while (parcel2.dataPosition() < U11) {
                    int readInt10 = parcel2.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str = g75.u(parcel2, readInt10);
                            break;
                        case 3:
                            str2 = g75.u(parcel2, readInt10);
                            break;
                        case 4:
                            str3 = g75.u(parcel2, readInt10);
                            break;
                        case 5:
                            str4 = g75.u(parcel2, readInt10);
                            break;
                        case 6:
                            uri = (Uri) g75.t(parcel2, readInt10, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = g75.u(parcel2, readInt10);
                            break;
                        case 8:
                            j = g75.M(parcel2, readInt10);
                            break;
                        case 9:
                            str6 = g75.u(parcel2, readInt10);
                            break;
                        case 10:
                            arrayList4 = g75.x(parcel2, readInt10, Scope.CREATOR);
                            break;
                        case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                            str7 = g75.u(parcel2, readInt10);
                            break;
                        case 12:
                            str8 = g75.u(parcel2, readInt10);
                            break;
                        default:
                            g75.T(parcel2, readInt10);
                            break;
                    }
                }
                g75.z(parcel2, U11);
                return new GoogleSignInAccount(str, str2, str3, str4, uri, str5, j, str6, arrayList4, str7, str8);
            case 19:
                int U12 = g75.U(parcel2);
                long j2 = 0;
                int i4 = 0;
                int i5 = 0;
                boolean z4 = false;
                String str9 = null;
                while (parcel2.dataPosition() < U12) {
                    int readInt11 = parcel2.readInt();
                    char c4 = (char) readInt11;
                    if (c4 == 1) {
                        i4 = g75.L(parcel2, readInt11);
                    } else if (c4 == 2) {
                        str9 = g75.u(parcel2, readInt11);
                    } else if (c4 == 3) {
                        j2 = g75.M(parcel2, readInt11);
                    } else if (c4 == 4) {
                        i5 = g75.L(parcel2, readInt11);
                    } else if (c4 != 5) {
                        g75.T(parcel2, readInt11);
                    } else {
                        z4 = g75.J(parcel2, readInt11);
                    }
                }
                g75.z(parcel2, U12);
                return new jg8(i4, i5, j2, str9, z4);
            case 20:
                int U13 = g75.U(parcel2);
                int i6 = 0;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                ArrayList arrayList5 = null;
                Account account2 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                while (parcel2.dataPosition() < U13) {
                    int readInt12 = parcel2.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            i6 = g75.L(parcel2, readInt12);
                            arrayList2 = r10;
                            break;
                        case 2:
                            arrayList5 = g75.x(parcel2, readInt12, Scope.CREATOR);
                            arrayList2 = r10;
                            break;
                        case 3:
                            account2 = g75.t(parcel2, readInt12, Account.CREATOR);
                            arrayList2 = r10;
                            break;
                        case 4:
                            z5 = g75.J(parcel2, readInt12);
                            arrayList2 = r10;
                            break;
                        case 5:
                            z6 = g75.J(parcel2, readInt12);
                            arrayList2 = r10;
                            break;
                        case 6:
                            z7 = g75.J(parcel2, readInt12);
                            arrayList2 = r10;
                            break;
                        case 7:
                            str10 = g75.u(parcel2, readInt12);
                            arrayList2 = r10;
                            break;
                        case 8:
                            str11 = g75.u(parcel2, readInt12);
                            arrayList2 = r10;
                            break;
                        case 9:
                            arrayList2 = g75.x(parcel2, readInt12, tw2.CREATOR);
                            break;
                        case 10:
                            str12 = g75.u(parcel2, readInt12);
                            arrayList2 = r10;
                            break;
                        default:
                            g75.T(parcel2, readInt12);
                            arrayList2 = r10;
                            break;
                    }
                    r10 = arrayList2;
                }
                g75.z(parcel2, U13);
                return new GoogleSignInOptions(i6, arrayList5, account2, z5, z6, z7, str10, str11, GoogleSignInOptions.g(r10), str12);
            case 21:
                int U14 = g75.U(parcel2);
                String str13 = null;
                while (parcel2.dataPosition() < U14) {
                    int readInt13 = parcel2.readInt();
                    char c5 = (char) readInt13;
                    if (c5 == 1) {
                        arrayList3 = g75.v(parcel2, readInt13);
                    } else if (c5 != 2) {
                        g75.T(parcel2, readInt13);
                        arrayList3 = r10;
                    } else {
                        str13 = g75.u(parcel2, readInt13);
                        arrayList3 = r10;
                    }
                    r10 = arrayList3;
                }
                g75.z(parcel2, U14);
                return new gh8(str13, r10);
            case 22:
                int U15 = g75.U(parcel2);
                th8 th8 = null;
                while (parcel2.dataPosition() < U15) {
                    int readInt14 = parcel2.readInt();
                    char c6 = (char) readInt14;
                    if (c6 == 1) {
                        i = g75.L(parcel2, readInt14);
                        m11 = r10;
                    } else if (c6 == 2) {
                        m11 = (m11) g75.t(parcel2, readInt14, m11.CREATOR);
                    } else if (c6 != 3) {
                        g75.T(parcel2, readInt14);
                        m11 = r10;
                    } else {
                        th8 = (th8) g75.t(parcel2, readInt14, th8.CREATOR);
                        m11 = r10;
                    }
                    r10 = m11;
                }
                g75.z(parcel2, U15);
                return new oh8(i, r10, th8);
            case 23:
                int U16 = g75.U(parcel2);
                int i7 = -1;
                long j3 = 0;
                long j4 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                String str14 = null;
                String str15 = null;
                while (parcel2.dataPosition() < U16) {
                    int readInt15 = parcel2.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            i8 = g75.L(parcel2, readInt15);
                            break;
                        case 2:
                            i9 = g75.L(parcel2, readInt15);
                            break;
                        case 3:
                            i10 = g75.L(parcel2, readInt15);
                            break;
                        case 4:
                            j3 = g75.M(parcel2, readInt15);
                            break;
                        case 5:
                            j4 = g75.M(parcel2, readInt15);
                            break;
                        case 6:
                            str14 = g75.u(parcel2, readInt15);
                            break;
                        case 7:
                            str15 = g75.u(parcel2, readInt15);
                            break;
                        case 8:
                            i11 = g75.L(parcel2, readInt15);
                            break;
                        case 9:
                            i7 = g75.L(parcel2, readInt15);
                            break;
                        default:
                            g75.T(parcel2, readInt15);
                            break;
                    }
                }
                g75.z(parcel2, U16);
                return new sk4(i8, i9, i10, j3, j4, str14, str15, i11, i7);
            case 24:
                int U17 = g75.U(parcel2);
                int i12 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel2.dataPosition() < U17) {
                    int readInt16 = parcel2.readInt();
                    char c7 = (char) readInt16;
                    if (c7 == 1) {
                        i = g75.L(parcel2, readInt16);
                        account = r10;
                    } else if (c7 == 2) {
                        account = (Account) g75.t(parcel2, readInt16, Account.CREATOR);
                    } else if (c7 == 3) {
                        i12 = g75.L(parcel2, readInt16);
                        account = r10;
                    } else if (c7 != 4) {
                        g75.T(parcel2, readInt16);
                        account = r10;
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) g75.t(parcel2, readInt16, GoogleSignInAccount.CREATOR);
                        account = r10;
                    }
                    r10 = account;
                }
                g75.z(parcel2, U17);
                return new sh8(i, r10, i12, googleSignInAccount2);
            case 25:
                int U18 = g75.U(parcel2);
                int i13 = 0;
                boolean z8 = false;
                boolean z9 = false;
                IBinder iBinder = null;
                m11 m112 = null;
                while (parcel2.dataPosition() < U18) {
                    int readInt17 = parcel2.readInt();
                    char c8 = (char) readInt17;
                    if (c8 == 1) {
                        i13 = g75.L(parcel2, readInt17);
                    } else if (c8 == 2) {
                        iBinder = g75.K(parcel2, readInt17);
                    } else if (c8 == 3) {
                        m112 = g75.t(parcel2, readInt17, m11.CREATOR);
                    } else if (c8 == 4) {
                        z8 = g75.J(parcel2, readInt17);
                    } else if (c8 != 5) {
                        g75.T(parcel2, readInt17);
                    } else {
                        z9 = g75.J(parcel2, readInt17);
                    }
                }
                g75.z(parcel2, U18);
                return new th8(i13, iBinder, m112, z8, z9);
            case 26:
                int U19 = g75.U(parcel2);
                String str16 = "";
                String str17 = str16;
                while (parcel2.dataPosition() < U19) {
                    int readInt18 = parcel2.readInt();
                    char c9 = (char) readInt18;
                    if (c9 == 4) {
                        str16 = g75.u(parcel2, readInt18);
                        googleSignInAccount = r10;
                    } else if (c9 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) g75.t(parcel2, readInt18, GoogleSignInAccount.CREATOR);
                    } else if (c9 != 8) {
                        g75.T(parcel2, readInt18);
                        googleSignInAccount = r10;
                    } else {
                        str17 = g75.u(parcel2, readInt18);
                        googleSignInAccount = r10;
                    }
                    r10 = googleSignInAccount;
                }
                g75.z(parcel2, U19);
                return new SignInAccount(str16, r10, str17);
            case 27:
                int U20 = g75.U(parcel2);
                boolean z10 = false;
                int i14 = 0;
                boolean z11 = false;
                a80 a80 = null;
                x70 x70 = null;
                String str18 = null;
                z70 z70 = null;
                y70 y70 = null;
                while (parcel2.dataPosition() < U20) {
                    int readInt19 = parcel2.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            a80 = g75.t(parcel2, readInt19, a80.CREATOR);
                            break;
                        case 2:
                            x70 = g75.t(parcel2, readInt19, x70.CREATOR);
                            break;
                        case 3:
                            str18 = g75.u(parcel2, readInt19);
                            break;
                        case 4:
                            z10 = g75.J(parcel2, readInt19);
                            break;
                        case 5:
                            i14 = g75.L(parcel2, readInt19);
                            break;
                        case 6:
                            z70 = g75.t(parcel2, readInt19, z70.CREATOR);
                            break;
                        case 7:
                            y70 = g75.t(parcel2, readInt19, y70.CREATOR);
                            break;
                        case 8:
                            z11 = g75.J(parcel2, readInt19);
                            break;
                        default:
                            g75.T(parcel2, readInt19);
                            break;
                    }
                }
                g75.z(parcel2, U20);
                return new b80(a80, x70, str18, z10, i14, z70, y70, z11);
            case 28:
                int U21 = g75.U(parcel2);
                while (parcel2.dataPosition() < U21) {
                    int readInt20 = parcel2.readInt();
                    if (((char) readInt20) != 1) {
                        g75.T(parcel2, readInt20);
                        pendingIntent3 = r10;
                    } else {
                        pendingIntent3 = (PendingIntent) g75.t(parcel2, readInt20, PendingIntent.CREATOR);
                    }
                    r10 = pendingIntent3;
                }
                g75.z(parcel2, U21);
                return new c80(r10);
            default:
                int U22 = g75.U(parcel2);
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                ArrayList arrayList6 = null;
                while (parcel2.dataPosition() < U22) {
                    int readInt21 = parcel2.readInt();
                    switch ((char) readInt21) {
                        case 1:
                            z12 = g75.J(parcel2, readInt21);
                            break;
                        case 2:
                            str19 = g75.u(parcel2, readInt21);
                            break;
                        case 3:
                            str20 = g75.u(parcel2, readInt21);
                            break;
                        case 4:
                            z13 = g75.J(parcel2, readInt21);
                            break;
                        case 5:
                            str21 = g75.u(parcel2, readInt21);
                            break;
                        case 6:
                            arrayList6 = g75.v(parcel2, readInt21);
                            break;
                        case 7:
                            z14 = g75.J(parcel2, readInt21);
                            break;
                        default:
                            g75.T(parcel2, readInt21);
                            break;
                    }
                }
                g75.z(parcel2, U22);
                return new x70(z12, str19, str20, z13, str21, arrayList6, z14);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case b85.b:
                return new ad5[i];
            case 1:
                return new bd5[i];
            case 2:
                return new cd5[i];
            case 3:
                return new if5[i];
            case 4:
                return new jf5[i];
            case 5:
                return new sf5[i];
            case 6:
                return new m26[i];
            case 7:
                return new n26[i];
            case 8:
                return new p26[i];
            case 9:
                return new d46[i];
            case 10:
                return new qt6[i];
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                return new e27[i];
            case 12:
                return new f27[i];
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                return new ui7[i];
            case 14:
                return new Trace[i];
            case h75.g:
                return new tw2[i];
            case 16:
                return new dc7[i];
            case 17:
                return new hg8[i];
            case 18:
                return new GoogleSignInAccount[i];
            case 19:
                return new jg8[i];
            case 20:
                return new GoogleSignInOptions[i];
            case 21:
                return new gh8[i];
            case 22:
                return new oh8[i];
            case 23:
                return new sk4[i];
            case 24:
                return new sh8[i];
            case 25:
                return new th8[i];
            case 26:
                return new SignInAccount[i];
            case 27:
                return new b80[i];
            case 28:
                return new c80[i];
            default:
                return new x70[i];
        }
    }
}
