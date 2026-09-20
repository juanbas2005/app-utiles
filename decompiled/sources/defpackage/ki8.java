package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: ki8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ki8 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ki8(int i) {
        this.a = i;
    }

    public static void a(zr8 zr8, Parcel parcel, int i) {
        String str = zr8.w;
        int M = h75.M(parcel, 20293);
        h75.F(parcel, 2, str);
        h75.E(parcel, 3, zr8.x, i);
        h75.F(parcel, 4, zr8.y);
        long j = zr8.z;
        h75.K(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = zr8.A;
        h75.K(parcel, 6, 8);
        parcel.writeLong(j2);
        h75.O(parcel, M);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v56, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v57, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v58, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v60, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v61, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v62, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v63, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v64, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v66, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v67, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v68, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v70, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v71, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v72, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v73, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v75, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v76, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v77, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v78, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v79, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v81, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v89, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v90, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v91, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v92, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v94, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v12, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r2v24, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r11v22, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v80, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v81, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v82, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v83, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r11v38, types: [qz8] */
    /* JADX WARNING: type inference failed for: r11v40, types: [qz8] */
    /* JADX WARNING: type inference failed for: r11v44 */
    /* JADX WARNING: type inference failed for: r11v49 */
    /* JADX WARNING: type inference failed for: r11v53 */
    /* JADX WARNING: type inference failed for: r11v56 */
    /* JADX WARNING: type inference failed for: r11v59 */
    /* JADX WARNING: type inference failed for: r11v62 */
    /* JADX WARNING: type inference failed for: r11v65 */
    /* JADX WARNING: type inference failed for: r11v69 */
    /* JADX WARNING: type inference failed for: r11v74 */
    /* JADX WARNING: type inference failed for: r11v80 */
    /* JADX WARNING: type inference failed for: r11v82 */
    /* JADX WARNING: type inference failed for: r11v83 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object createFromParcel(Parcel parcel) {
        String str;
        boolean z;
        byte[] bArr;
        boolean z2;
        boolean z3;
        String str2;
        Intent intent;
        Bundle bundle;
        ArrayList arrayList;
        boolean z4;
        Bundle bundle2;
        boolean z5;
        String str3;
        boolean z6;
        String str4;
        boolean z7;
        String str5;
        boolean z8;
        boolean z9;
        qz8 qz8;
        boolean z10;
        boolean z11;
        Parcel parcel2 = parcel;
        boolean z12 = false;
        ? r11 = 0;
        switch (this.a) {
            case b85.b:
                int U = g75.U(parcel2);
                while (parcel2.dataPosition() < U) {
                    int readInt = parcel2.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        str = r11;
                        z = g75.J(parcel2, readInt);
                    } else if (c != 2) {
                        g75.T(parcel2, readInt);
                        str = r11;
                        z = z12;
                    } else {
                        z = z12;
                        str = g75.u(parcel2, readInt);
                    }
                    r11 = str;
                    z12 = z;
                }
                g75.z(parcel2, U);
                return new y70(r11, z12);
            case 1:
                int U2 = g75.U(parcel2);
                String str6 = null;
                while (parcel2.dataPosition() < U2) {
                    int readInt2 = parcel2.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        bArr = r11;
                        z2 = g75.J(parcel2, readInt2);
                    } else if (c2 == 2) {
                        z2 = z12;
                        bArr = g75.q(parcel2, readInt2);
                    } else if (c2 != 3) {
                        g75.T(parcel2, readInt2);
                        bArr = r11;
                        z2 = z12;
                    } else {
                        str6 = g75.u(parcel2, readInt2);
                        bArr = r11;
                        z2 = z12;
                    }
                    r11 = bArr;
                    z12 = z2;
                }
                g75.z(parcel2, U2);
                return new z70(z12, r11, str6);
            case 2:
                int U3 = g75.U(parcel2);
                while (parcel2.dataPosition() < U3) {
                    int readInt3 = parcel2.readInt();
                    if (((char) readInt3) != 1) {
                        g75.T(parcel2, readInt3);
                        z3 = z12;
                    } else {
                        z3 = g75.J(parcel2, readInt3);
                    }
                    z12 = z3;
                }
                g75.z(parcel2, U3);
                return new a80(z12);
            case 3:
                int U4 = g75.U(parcel2);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel2.dataPosition() < U4) {
                    int readInt4 = parcel2.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 2) {
                        str2 = g75.u(parcel2, readInt4);
                    } else if (c3 != 5) {
                        g75.T(parcel2, readInt4);
                        str2 = r11;
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) g75.t(parcel2, readInt4, GoogleSignInOptions.CREATOR);
                        str2 = r11;
                    }
                    r11 = str2;
                }
                g75.z(parcel2, U4);
                return new SignInConfiguration(r11, googleSignInOptions);
            case 4:
                int U5 = g75.U(parcel2);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                Uri uri = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                qu5 qu5 = null;
                while (parcel2.dataPosition() < U5) {
                    int readInt5 = parcel2.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str7 = g75.u(parcel2, readInt5);
                            break;
                        case 2:
                            str8 = g75.u(parcel2, readInt5);
                            break;
                        case 3:
                            str9 = g75.u(parcel2, readInt5);
                            break;
                        case 4:
                            str10 = g75.u(parcel2, readInt5);
                            break;
                        case 5:
                            uri = (Uri) g75.t(parcel2, readInt5, Uri.CREATOR);
                            break;
                        case 6:
                            str11 = g75.u(parcel2, readInt5);
                            break;
                        case 7:
                            str12 = g75.u(parcel2, readInt5);
                            break;
                        case 8:
                            str13 = g75.u(parcel2, readInt5);
                            break;
                        case 9:
                            qu5 = (qu5) g75.t(parcel2, readInt5, qu5.CREATOR);
                            break;
                        default:
                            g75.T(parcel2, readInt5);
                            break;
                    }
                }
                g75.z(parcel2, U5);
                return new gt6(str7, str8, str9, str10, uri, str11, str12, str13, qu5);
            case 5:
                int U6 = g75.U(parcel2);
                while (parcel2.dataPosition() < U6) {
                    int readInt6 = parcel2.readInt();
                    if (((char) readInt6) != 1) {
                        g75.T(parcel2, readInt6);
                        intent = r11;
                    } else {
                        intent = (Intent) g75.t(parcel2, readInt6, Intent.CREATOR);
                    }
                    r11 = intent;
                }
                g75.z(parcel2, U6);
                return new ns0(r11);
            case 6:
                int U7 = g75.U(parcel2);
                int i = 0;
                int i2 = 0;
                PendingIntent pendingIntent = null;
                String str14 = null;
                Integer num = null;
                while (parcel2.dataPosition() < U7) {
                    int readInt7 = parcel2.readInt();
                    char c4 = (char) readInt7;
                    if (c4 == 1) {
                        i = g75.L(parcel2, readInt7);
                    } else if (c4 == 2) {
                        i2 = g75.L(parcel2, readInt7);
                    } else if (c4 == 3) {
                        pendingIntent = g75.t(parcel2, readInt7, PendingIntent.CREATOR);
                    } else if (c4 == 4) {
                        str14 = g75.u(parcel2, readInt7);
                    } else if (c4 != 5) {
                        g75.T(parcel2, readInt7);
                    } else {
                        int N = g75.N(parcel2, readInt7);
                        if (N == 0) {
                            num = null;
                        } else {
                            g75.X(parcel2, N, 4);
                            num = Integer.valueOf(parcel2.readInt());
                        }
                    }
                }
                g75.z(parcel2, U7);
                return new m11(i, i2, pendingIntent, str14, num);
            case 7:
                int U8 = g75.U(parcel2);
                long j = 0;
                long j2 = 0;
                int i3 = 0;
                while (parcel2.dataPosition() < U8) {
                    int readInt8 = parcel2.readInt();
                    char c5 = (char) readInt8;
                    if (c5 == 1) {
                        j = g75.M(parcel2, readInt8);
                    } else if (c5 == 2) {
                        i3 = g75.L(parcel2, readInt8);
                    } else if (c5 != 3) {
                        g75.T(parcel2, readInt8);
                    } else {
                        j2 = g75.M(parcel2, readInt8);
                    }
                }
                g75.z(parcel2, U8);
                return new lm8(i3, j, j2);
            case 8:
                int U9 = g75.U(parcel2);
                int i4 = 0;
                boolean z13 = false;
                boolean z14 = false;
                int i5 = 0;
                int i6 = 0;
                while (parcel2.dataPosition() < U9) {
                    int readInt9 = parcel2.readInt();
                    char c6 = (char) readInt9;
                    if (c6 == 1) {
                        i4 = g75.L(parcel2, readInt9);
                    } else if (c6 == 2) {
                        z13 = g75.J(parcel2, readInt9);
                    } else if (c6 == 3) {
                        z14 = g75.J(parcel2, readInt9);
                    } else if (c6 == 4) {
                        i5 = g75.L(parcel2, readInt9);
                    } else if (c6 != 5) {
                        g75.T(parcel2, readInt9);
                    } else {
                        i6 = g75.L(parcel2, readInt9);
                    }
                }
                g75.z(parcel2, U9);
                return new g96(i4, z13, z14, i5, i6);
            case 9:
                int U10 = g75.U(parcel2);
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                boolean z15 = false;
                String str15 = null;
                String str16 = null;
                z89 z89 = null;
                String str17 = null;
                zr8 zr8 = null;
                zr8 zr82 = null;
                zr8 zr83 = null;
                while (parcel2.dataPosition() < U10) {
                    int readInt10 = parcel2.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str15 = g75.u(parcel2, readInt10);
                            break;
                        case 3:
                            str16 = g75.u(parcel2, readInt10);
                            break;
                        case 4:
                            z89 = (z89) g75.t(parcel2, readInt10, z89.CREATOR);
                            break;
                        case 5:
                            j3 = g75.M(parcel2, readInt10);
                            break;
                        case 6:
                            z15 = g75.J(parcel2, readInt10);
                            break;
                        case 7:
                            str17 = g75.u(parcel2, readInt10);
                            break;
                        case 8:
                            zr8 = (zr8) g75.t(parcel2, readInt10, zr8.CREATOR);
                            break;
                        case 9:
                            j4 = g75.M(parcel2, readInt10);
                            break;
                        case 10:
                            zr82 = (zr8) g75.t(parcel2, readInt10, zr8.CREATOR);
                            break;
                        case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                            j5 = g75.M(parcel2, readInt10);
                            break;
                        case 12:
                            zr83 = (zr8) g75.t(parcel2, readInt10, zr8.CREATOR);
                            break;
                        default:
                            g75.T(parcel2, readInt10);
                            break;
                    }
                }
                g75.z(parcel2, U10);
                return new xn8(str15, str16, z89, j3, z15, str17, zr8, j4, zr82, j5, zr83);
            case 10:
                int U11 = g75.U(parcel2);
                String str18 = null;
                String str19 = null;
                byte[] bArr2 = null;
                jw jwVar = null;
                hw hwVar = null;
                kw kwVar = null;
                fw fwVar = null;
                String str20 = null;
                while (parcel2.dataPosition() < U11) {
                    int readInt11 = parcel2.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            str18 = g75.u(parcel2, readInt11);
                            break;
                        case 2:
                            str19 = g75.u(parcel2, readInt11);
                            break;
                        case 3:
                            bArr2 = g75.q(parcel2, readInt11);
                            break;
                        case 4:
                            jwVar = (jw) g75.t(parcel2, readInt11, jw.CREATOR);
                            break;
                        case 5:
                            hwVar = (hw) g75.t(parcel2, readInt11, hw.CREATOR);
                            break;
                        case 6:
                            kwVar = (kw) g75.t(parcel2, readInt11, kw.CREATOR);
                            break;
                        case 7:
                            fwVar = (fw) g75.t(parcel2, readInt11, fw.CREATOR);
                            break;
                        case 8:
                            str20 = g75.u(parcel2, readInt11);
                            break;
                        case 9:
                            g75.u(parcel2, readInt11);
                            break;
                        default:
                            g75.T(parcel2, readInt11);
                            break;
                    }
                }
                g75.z(parcel2, U11);
                return new qu5(str18, str19, bArr2, jwVar, hwVar, kwVar, fwVar, str20);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                int U12 = g75.U(parcel2);
                while (parcel2.dataPosition() < U12) {
                    int readInt12 = parcel2.readInt();
                    if (((char) readInt12) != 1) {
                        g75.T(parcel2, readInt12);
                        bundle = r11;
                    } else {
                        bundle = g75.p(parcel2, readInt12);
                    }
                    r11 = bundle;
                }
                g75.z(parcel2, U12);
                return new dq8(r11);
            case 12:
                return new gv8(parcel2.readStrongBinder());
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                int U13 = g75.U(parcel2);
                long j6 = -1;
                int i7 = 0;
                boolean z16 = false;
                String str21 = null;
                while (parcel2.dataPosition() < U13) {
                    int readInt13 = parcel2.readInt();
                    char c7 = (char) readInt13;
                    if (c7 == 1) {
                        str21 = g75.u(parcel2, readInt13);
                    } else if (c7 == 2) {
                        i7 = g75.L(parcel2, readInt13);
                    } else if (c7 == 3) {
                        j6 = g75.M(parcel2, readInt13);
                    } else if (c7 != 4) {
                        g75.T(parcel2, readInt13);
                    } else {
                        z16 = g75.J(parcel2, readInt13);
                    }
                }
                g75.z(parcel2, U13);
                return new cc2(str21, i7, j6, z16);
            case 14:
                int U14 = g75.U(parcel2);
                while (parcel2.dataPosition() < U14) {
                    int readInt14 = parcel2.readInt();
                    if (((char) readInt14) != 1) {
                        g75.T(parcel2, readInt14);
                        arrayList = r11;
                    } else {
                        arrayList = g75.x(parcel2, readInt14, t18.CREATOR);
                    }
                    r11 = arrayList;
                }
                g75.z(parcel2, U14);
                return new s18(r11);
            case h75.g:
                int U15 = g75.U(parcel2);
                short s = 0;
                short s2 = 0;
                while (parcel2.dataPosition() < U15) {
                    int readInt15 = parcel2.readInt();
                    char c8 = (char) readInt15;
                    if (c8 == 1) {
                        z4 = g75.L(parcel2, readInt15);
                    } else if (c8 == 2) {
                        g75.W(parcel2, readInt15, 4);
                        s = (short) parcel2.readInt();
                        z4 = z12;
                    } else if (c8 != 3) {
                        g75.T(parcel2, readInt15);
                        z4 = z12;
                    } else {
                        g75.W(parcel2, readInt15, 4);
                        s2 = (short) parcel2.readInt();
                        z4 = z12;
                    }
                    z12 = z4;
                }
                g75.z(parcel2, U15);
                return new t18(z12, s, s2);
            case 16:
                int U16 = g75.U(parcel2);
                while (parcel2.dataPosition() < U16) {
                    int readInt16 = parcel2.readInt();
                    if (((char) readInt16) != 2) {
                        g75.T(parcel2, readInt16);
                        bundle2 = r11;
                    } else {
                        bundle2 = g75.p(parcel2, readInt16);
                    }
                    r11 = bundle2;
                }
                g75.z(parcel2, U16);
                return new ur8(r11);
            case 17:
                int U17 = g75.U(parcel2);
                long j7 = 0;
                long j8 = 0;
                String str22 = null;
                ur8 ur8 = null;
                String str23 = null;
                while (parcel2.dataPosition() < U17) {
                    int readInt17 = parcel2.readInt();
                    char c9 = (char) readInt17;
                    if (c9 == 2) {
                        str22 = g75.u(parcel2, readInt17);
                    } else if (c9 == 3) {
                        ur8 = (ur8) g75.t(parcel2, readInt17, ur8.CREATOR);
                    } else if (c9 == 4) {
                        str23 = g75.u(parcel2, readInt17);
                    } else if (c9 == 5) {
                        j7 = g75.M(parcel2, readInt17);
                    } else if (c9 != 6) {
                        g75.T(parcel2, readInt17);
                    } else {
                        j8 = g75.M(parcel2, readInt17);
                    }
                }
                g75.z(parcel2, U17);
                return new zr8(str22, ur8, str23, j7, j8);
            case 18:
                int U18 = g75.U(parcel2);
                int i8 = 0;
                int i9 = 0;
                boolean z17 = true;
                while (parcel2.dataPosition() < U18) {
                    int readInt18 = parcel2.readInt();
                    char c10 = (char) readInt18;
                    if (c10 == 1) {
                        z5 = g75.L(parcel2, readInt18);
                    } else if (c10 == 2) {
                        i8 = g75.L(parcel2, readInt18);
                        z5 = z12;
                    } else if (c10 == 3) {
                        i9 = g75.L(parcel2, readInt18);
                        z5 = z12;
                    } else if (c10 != 4) {
                        g75.T(parcel2, readInt18);
                        z5 = z12;
                    } else {
                        z17 = g75.J(parcel2, readInt18);
                        z5 = z12;
                    }
                    z12 = z5;
                }
                g75.z(parcel2, U18);
                return new dv0(z12, i8, i9, z17);
            case 19:
                int U19 = g75.U(parcel2);
                s18 s18 = null;
                ax8 ax8 = null;
                gw gwVar = null;
                b09 b09 = null;
                String str24 = null;
                while (parcel2.dataPosition() < U19) {
                    int readInt19 = parcel2.readInt();
                    char c11 = (char) readInt19;
                    if (c11 == 1) {
                        s18 = g75.t(parcel2, readInt19, s18.CREATOR);
                    } else if (c11 == 2) {
                        ax8 = g75.t(parcel2, readInt19, ax8.CREATOR);
                    } else if (c11 == 3) {
                        gwVar = g75.t(parcel2, readInt19, gw.CREATOR);
                    } else if (c11 == 4) {
                        b09 = g75.t(parcel2, readInt19, b09.CREATOR);
                    } else if (c11 != 5) {
                        g75.T(parcel2, readInt19);
                    } else {
                        str24 = g75.u(parcel2, readInt19);
                    }
                }
                g75.z(parcel2, U19);
                return new fw(s18, ax8, gwVar, b09, str24);
            case 20:
                int U20 = g75.U(parcel2);
                while (parcel2.dataPosition() < U20) {
                    int readInt20 = parcel2.readInt();
                    char c12 = (char) readInt20;
                    if (c12 == 1) {
                        str3 = r11;
                        z6 = g75.L(parcel2, readInt20);
                    } else if (c12 != 2) {
                        g75.T(parcel2, readInt20);
                        str3 = r11;
                        z6 = z12;
                    } else {
                        z6 = z12;
                        str3 = g75.u(parcel2, readInt20);
                    }
                    r11 = str3;
                    z12 = z6;
                }
                g75.z(parcel2, U20);
                return new Scope(z12, r11);
            case 21:
                int U21 = g75.U(parcel2);
                long j9 = 0;
                long j10 = 0;
                boolean z18 = false;
                Bundle bundle3 = null;
                String str25 = null;
                while (parcel2.dataPosition() < U21) {
                    int readInt21 = parcel2.readInt();
                    char c13 = (char) readInt21;
                    if (c13 == 1) {
                        j9 = g75.M(parcel2, readInt21);
                    } else if (c13 == 2) {
                        j10 = g75.M(parcel2, readInt21);
                    } else if (c13 == 3) {
                        z18 = g75.J(parcel2, readInt21);
                    } else if (c13 == 7) {
                        bundle3 = g75.p(parcel2, readInt21);
                    } else if (c13 != 8) {
                        g75.T(parcel2, readInt21);
                    } else {
                        str25 = g75.u(parcel2, readInt21);
                    }
                }
                g75.z(parcel2, U21);
                return new iv8(j9, j10, z18, bundle3, str25);
            case 22:
                int U22 = g75.U(parcel2);
                Intent intent2 = null;
                while (parcel2.dataPosition() < U22) {
                    int readInt22 = parcel2.readInt();
                    char c14 = (char) readInt22;
                    if (c14 == 1) {
                        str4 = r11;
                        z7 = g75.L(parcel2, readInt22);
                    } else if (c14 == 2) {
                        z7 = z12;
                        str4 = g75.u(parcel2, readInt22);
                    } else if (c14 != 3) {
                        g75.T(parcel2, readInt22);
                        str4 = r11;
                        z7 = z12;
                    } else {
                        intent2 = (Intent) g75.t(parcel2, readInt22, Intent.CREATOR);
                        str4 = r11;
                        z7 = z12;
                    }
                    r11 = str4;
                    z12 = z7;
                }
                g75.z(parcel2, U22);
                return new jv8(z12, r11, intent2);
            case 23:
                int U23 = g75.U(parcel2);
                PendingIntent pendingIntent2 = null;
                m11 m11 = null;
                while (parcel2.dataPosition() < U23) {
                    int readInt23 = parcel2.readInt();
                    char c15 = (char) readInt23;
                    if (c15 == 1) {
                        str5 = r11;
                        z8 = g75.L(parcel2, readInt23);
                    } else if (c15 == 2) {
                        z8 = z12;
                        str5 = g75.u(parcel2, readInt23);
                    } else if (c15 == 3) {
                        pendingIntent2 = (PendingIntent) g75.t(parcel2, readInt23, PendingIntent.CREATOR);
                        str5 = r11;
                        z8 = z12;
                    } else if (c15 != 4) {
                        g75.T(parcel2, readInt23);
                        str5 = r11;
                        z8 = z12;
                    } else {
                        m11 = (m11) g75.t(parcel2, readInt23, m11.CREATOR);
                        str5 = r11;
                        z8 = z12;
                    }
                    r11 = str5;
                    z12 = z8;
                }
                g75.z(parcel2, U23);
                return new Status(z12, r11, pendingIntent2, m11);
            case 24:
                int U24 = g75.U(parcel2);
                while (parcel2.dataPosition() < U24) {
                    int readInt24 = parcel2.readInt();
                    if (((char) readInt24) != 1) {
                        g75.T(parcel2, readInt24);
                        z9 = z12;
                    } else {
                        z9 = g75.J(parcel2, readInt24);
                    }
                    z12 = z9;
                }
                g75.z(parcel2, U24);
                return new gw(z12);
            case 25:
                int U25 = g75.U(parcel2);
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (parcel2.dataPosition() < U25) {
                    int readInt25 = parcel2.readInt();
                    char c16 = (char) readInt25;
                    if (c16 == 1) {
                        bArr3 = g75.q(parcel2, readInt25);
                    } else if (c16 != 2) {
                        g75.T(parcel2, readInt25);
                    } else {
                        bArr4 = g75.q(parcel2, readInt25);
                    }
                }
                g75.z(parcel2, U25);
                if (bArr3 == null) {
                    qz8 = null;
                } else {
                    qz8 = qz8.p(bArr3.length, bArr3);
                }
                if (bArr4 != null) {
                    r11 = qz8.p(bArr4.length, bArr4);
                }
                return new ax8(qz8, r11);
            case 26:
                int U26 = g75.U(parcel2);
                byte[] bArr5 = null;
                while (parcel2.dataPosition() < U26) {
                    int readInt26 = parcel2.readInt();
                    char c17 = (char) readInt26;
                    if (c17 == 1) {
                        z10 = g75.J(parcel2, readInt26);
                    } else if (c17 != 2) {
                        g75.T(parcel2, readInt26);
                        z10 = z12;
                    } else {
                        bArr5 = g75.q(parcel2, readInt26);
                        z10 = z12;
                    }
                    z12 = z10;
                }
                g75.z(parcel2, U26);
                if (bArr5 != null) {
                    r11 = qz8.p(bArr5.length, bArr5);
                }
                return new b09(z12, r11);
            case 27:
                int U27 = g75.U(parcel2);
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                while (parcel2.dataPosition() < U27) {
                    int readInt27 = parcel2.readInt();
                    char c18 = (char) readInt27;
                    if (c18 == 2) {
                        bArr6 = g75.q(parcel2, readInt27);
                    } else if (c18 == 3) {
                        bArr7 = g75.q(parcel2, readInt27);
                    } else if (c18 == 4) {
                        bArr8 = g75.q(parcel2, readInt27);
                    } else if (c18 == 5) {
                        bArr9 = g75.q(parcel2, readInt27);
                    } else if (c18 != 6) {
                        g75.T(parcel2, readInt27);
                    } else {
                        bArr10 = g75.q(parcel2, readInt27);
                    }
                }
                g75.z(parcel2, U27);
                return new hw(bArr6, bArr7, bArr8, bArr9, bArr10);
            case 28:
                int U28 = g75.U(parcel2);
                j39[] j39Arr = null;
                String[] strArr = null;
                while (parcel2.dataPosition() < U28) {
                    int readInt28 = parcel2.readInt();
                    char c19 = (char) readInt28;
                    if (c19 == 2) {
                        z11 = g75.L(parcel2, readInt28);
                    } else if (c19 == 3) {
                        j39Arr = (j39[]) g75.w(parcel2, readInt28, j39.CREATOR);
                        z11 = z12;
                    } else if (c19 != 4) {
                        g75.T(parcel2, readInt28);
                        z11 = z12;
                    } else {
                        int N2 = g75.N(parcel2, readInt28);
                        int dataPosition = parcel2.dataPosition();
                        if (N2 == 0) {
                            strArr = null;
                            z11 = z12;
                        } else {
                            String[] createStringArray = parcel2.createStringArray();
                            parcel2.setDataPosition(dataPosition + N2);
                            strArr = createStringArray;
                            z11 = z12;
                        }
                    }
                    z12 = z11;
                }
                g75.z(parcel2, U28);
                return new z29(z12, j39Arr, strArr);
            default:
                int U29 = g75.U(parcel2);
                long j11 = 0;
                boolean z19 = false;
                String str26 = null;
                String str27 = null;
                z29[] z29Arr = null;
                byte[] bArr11 = null;
                while (parcel2.dataPosition() < U29) {
                    int readInt29 = parcel2.readInt();
                    switch ((char) readInt29) {
                        case 2:
                            str26 = g75.u(parcel2, readInt29);
                            break;
                        case 3:
                            str27 = g75.u(parcel2, readInt29);
                            break;
                        case 4:
                            z29Arr = (z29[]) g75.w(parcel2, readInt29, z29.CREATOR);
                            break;
                        case 5:
                            z19 = g75.J(parcel2, readInt29);
                            break;
                        case 6:
                            bArr11 = g75.q(parcel2, readInt29);
                            break;
                        case 7:
                            j11 = g75.M(parcel2, readInt29);
                            break;
                        default:
                            g75.T(parcel2, readInt29);
                            break;
                    }
                }
                g75.z(parcel2, U29);
                return new b39(str26, str27, z29Arr, z19, bArr11, j11);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case b85.b:
                return new y70[i];
            case 1:
                return new z70[i];
            case 2:
                return new a80[i];
            case 3:
                return new SignInConfiguration[i];
            case 4:
                return new gt6[i];
            case 5:
                return new ns0[i];
            case 6:
                return new m11[i];
            case 7:
                return new lm8[i];
            case 8:
                return new g96[i];
            case 9:
                return new xn8[i];
            case 10:
                return new qu5[i];
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new dq8[i];
            case 12:
                return new gv8[i];
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new cc2[i];
            case 14:
                return new s18[i];
            case h75.g:
                return new t18[i];
            case 16:
                return new ur8[i];
            case 17:
                return new zr8[i];
            case 18:
                return new dv0[i];
            case 19:
                return new fw[i];
            case 20:
                return new Scope[i];
            case 21:
                return new iv8[i];
            case 22:
                return new jv8[i];
            case 23:
                return new Status[i];
            case 24:
                return new gw[i];
            case 25:
                return new ax8[i];
            case 26:
                return new b09[i];
            case 27:
                return new hw[i];
            case 28:
                return new z29[i];
            default:
                return new b39[i];
        }
    }
}
