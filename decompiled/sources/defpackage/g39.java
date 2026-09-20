package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import java.util.ArrayList;

/* renamed from: g39  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g39 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ g39(int i) {
        this.a = i;
    }

    public static void a(rv2 rv2, Parcel parcel, int i) {
        int M = h75.M(parcel, 20293);
        int i2 = rv2.w;
        h75.K(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = rv2.x;
        h75.K(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = rv2.y;
        h75.K(parcel, 3, 4);
        parcel.writeInt(i4);
        h75.F(parcel, 4, rv2.z);
        h75.C(parcel, 5, rv2.A);
        h75.H(parcel, 6, rv2.B, i);
        h75.z(parcel, 7, rv2.C);
        h75.E(parcel, 8, rv2.D, i);
        h75.H(parcel, 10, rv2.E, i);
        h75.H(parcel, 11, rv2.F, i);
        boolean z = rv2.G;
        h75.K(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = rv2.H;
        h75.K(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = rv2.I;
        h75.K(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        h75.F(parcel, 15, rv2.J);
        h75.O(parcel, M);
    }

    public static void b(z89 z89, Parcel parcel) {
        int i = z89.w;
        int M = h75.M(parcel, 20293);
        h75.K(parcel, 1, 4);
        parcel.writeInt(i);
        h75.F(parcel, 2, z89.x);
        long j = z89.y;
        h75.K(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = z89.z;
        if (l != null) {
            h75.K(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        h75.F(parcel, 6, z89.A);
        h75.F(parcel, 7, z89.B);
        Double d = z89.C;
        if (d != null) {
            h75.K(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        h75.O(parcel, M);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v33, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v36, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v38, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v39, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v41, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v7, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, s29] */
    /* JADX WARNING: type inference failed for: r2v38, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v39, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v40, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v41, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v46, types: [int] */
    /* JADX WARNING: type inference failed for: r11v19, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r11v23 */
    /* JADX WARNING: type inference failed for: r11v29 */
    /* JADX WARNING: type inference failed for: r11v32 */
    /* JADX WARNING: type inference failed for: r11v38 */
    /* JADX WARNING: type inference failed for: r11v43 */
    /* JADX WARNING: type inference failed for: r11v48 */
    /* JADX WARNING: type inference failed for: r11v50 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object createFromParcel(Parcel parcel) {
        byte[] bArr;
        String str;
        boolean z;
        ArrayList arrayList;
        boolean z2;
        Bundle bundle;
        boolean z3;
        String str2;
        boolean z4;
        String str3;
        boolean z5;
        ArrayList arrayList2;
        boolean z6;
        Parcel parcel2 = parcel;
        long j = 0;
        boolean z7 = false;
        ? r11 = 0;
        switch (this.a) {
            case b85.b:
                int U = g75.U(parcel2);
                while (parcel2.dataPosition() < U) {
                    int readInt = parcel2.readInt();
                    if (((char) readInt) != 2) {
                        g75.T(parcel2, readInt);
                        bArr = r11;
                    } else {
                        bArr = g75.q(parcel2, readInt);
                    }
                    r11 = bArr;
                }
                g75.z(parcel2, U);
                return new e39(r11);
            case 1:
                int U2 = g75.U(parcel2);
                String str4 = null;
                byte[] bArr2 = null;
                byte[][] bArr3 = null;
                byte[][] bArr4 = null;
                byte[][] bArr5 = null;
                byte[][] bArr6 = null;
                int[] iArr = null;
                byte[][] bArr7 = null;
                int[] iArr2 = null;
                byte[][] bArr8 = null;
                while (parcel2.dataPosition() < U2) {
                    int readInt2 = parcel2.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            str4 = g75.u(parcel2, readInt2);
                            break;
                        case 3:
                            bArr2 = g75.q(parcel2, readInt2);
                            break;
                        case 4:
                            bArr3 = g75.r(parcel2, readInt2);
                            break;
                        case 5:
                            bArr4 = g75.r(parcel2, readInt2);
                            break;
                        case 6:
                            bArr5 = g75.r(parcel2, readInt2);
                            break;
                        case 7:
                            bArr6 = g75.r(parcel2, readInt2);
                            break;
                        case 8:
                            iArr = g75.s(parcel2, readInt2);
                            break;
                        case 9:
                            bArr7 = g75.r(parcel2, readInt2);
                            break;
                        case 10:
                            iArr2 = g75.s(parcel2, readInt2);
                            break;
                        case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                            bArr8 = g75.r(parcel2, readInt2);
                            break;
                        default:
                            g75.T(parcel2, readInt2);
                            break;
                    }
                }
                g75.z(parcel2, U2);
                return new i39(str4, bArr2, bArr3, bArr4, bArr5, bArr6, iArr, bArr7, iArr2, bArr8);
            case 2:
                int U3 = g75.U(parcel2);
                long j2 = 0;
                double d = 0.0d;
                boolean z8 = false;
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                String str5 = null;
                String str6 = null;
                byte[] bArr9 = null;
                while (parcel2.dataPosition() < U3) {
                    int readInt3 = parcel2.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            str5 = g75.u(parcel2, readInt3);
                            break;
                        case 3:
                            j2 = g75.M(parcel2, readInt3);
                            break;
                        case 4:
                            z8 = g75.J(parcel2, readInt3);
                            break;
                        case 5:
                            g75.W(parcel2, readInt3, 8);
                            d = parcel2.readDouble();
                            break;
                        case 6:
                            str6 = g75.u(parcel2, readInt3);
                            break;
                        case 7:
                            bArr9 = g75.q(parcel2, readInt3);
                            break;
                        case 8:
                            i = g75.L(parcel2, readInt3);
                            break;
                        case 9:
                            i2 = g75.L(parcel2, readInt3);
                            break;
                        case 10:
                            i3 = g75.L(parcel2, readInt3);
                            break;
                        default:
                            g75.T(parcel2, readInt3);
                            break;
                    }
                }
                g75.z(parcel2, U3);
                return new j39(str5, j2, z8, d, str6, bArr9, i, i2, i3);
            case 3:
                int U4 = g75.U(parcel2);
                String str7 = null;
                j39 j39 = null;
                while (parcel2.dataPosition() < U4) {
                    int readInt4 = parcel2.readInt();
                    char c = (char) readInt4;
                    if (c == 2) {
                        z = z7;
                        str = g75.u(parcel2, readInt4);
                    } else if (c == 3) {
                        str7 = g75.u(parcel2, readInt4);
                        str = r11;
                        z = z7;
                    } else if (c == 4) {
                        j39 = (j39) g75.t(parcel2, readInt4, j39.CREATOR);
                        str = r11;
                        z = z7;
                    } else if (c != 5) {
                        g75.T(parcel2, readInt4);
                        str = r11;
                        z = z7;
                    } else {
                        str = r11;
                        z = g75.J(parcel2, readInt4);
                    }
                    r11 = str;
                    z7 = z;
                }
                g75.z(parcel2, U4);
                return new l39(r11, str7, j39, z7);
            case 4:
                int U5 = g75.U(parcel2);
                while (parcel2.dataPosition() < U5) {
                    int readInt5 = parcel2.readInt();
                    if (((char) readInt5) != 2) {
                        g75.T(parcel2, readInt5);
                        arrayList = r11;
                    } else {
                        arrayList = g75.x(parcel2, readInt5, l39.CREATOR);
                    }
                    r11 = arrayList;
                }
                g75.z(parcel2, U5);
                return new n39(r11);
            case 5:
                int U6 = g75.U(parcel2);
                int i4 = 0;
                while (parcel2.dataPosition() < U6) {
                    int readInt6 = parcel2.readInt();
                    char c2 = (char) readInt6;
                    if (c2 == 1) {
                        z2 = g75.L(parcel2, readInt6);
                    } else if (c2 != 2) {
                        g75.T(parcel2, readInt6);
                        z2 = z7;
                    } else {
                        i4 = g75.L(parcel2, readInt6);
                        z2 = z7;
                    }
                    z7 = z2;
                }
                g75.z(parcel2, U6);
                return new q39(z7, i4);
            case 6:
                int U7 = g75.U(parcel2);
                cc2[] cc2Arr = null;
                p11 p11 = null;
                while (parcel2.dataPosition() < U7) {
                    int readInt7 = parcel2.readInt();
                    char c3 = (char) readInt7;
                    if (c3 == 1) {
                        z3 = z7;
                        bundle = g75.p(parcel2, readInt7);
                    } else if (c3 == 2) {
                        cc2Arr = (cc2[]) g75.w(parcel2, readInt7, cc2.CREATOR);
                        bundle = r11;
                        z3 = z7;
                    } else if (c3 == 3) {
                        bundle = r11;
                        z3 = g75.L(parcel2, readInt7);
                    } else if (c3 != 4) {
                        g75.T(parcel2, readInt7);
                        bundle = r11;
                        z3 = z7;
                    } else {
                        p11 = (p11) g75.t(parcel2, readInt7, p11.CREATOR);
                        bundle = r11;
                        z3 = z7;
                    }
                    r11 = bundle;
                    z7 = z3;
                }
                g75.z(parcel2, U7);
                ? obj = new Object();
                obj.w = r11;
                obj.x = cc2Arr;
                obj.y = z7;
                obj.z = p11;
                return obj;
            case 7:
                int U8 = g75.U(parcel2);
                byte[] bArr10 = null;
                byte[] bArr11 = null;
                byte[] bArr12 = null;
                String[] strArr = null;
                while (parcel2.dataPosition() < U8) {
                    int readInt8 = parcel2.readInt();
                    char c4 = (char) readInt8;
                    if (c4 == 2) {
                        bArr10 = g75.q(parcel2, readInt8);
                    } else if (c4 == 3) {
                        bArr11 = g75.q(parcel2, readInt8);
                    } else if (c4 == 4) {
                        bArr12 = g75.q(parcel2, readInt8);
                    } else if (c4 != 5) {
                        g75.T(parcel2, readInt8);
                    } else {
                        int N = g75.N(parcel2, readInt8);
                        int dataPosition = parcel2.dataPosition();
                        if (N == 0) {
                            strArr = null;
                        } else {
                            String[] createStringArray = parcel2.createStringArray();
                            parcel2.setDataPosition(dataPosition + N);
                            strArr = createStringArray;
                        }
                    }
                }
                g75.z(parcel2, U8);
                return new jw(bArr10, bArr11, bArr12, strArr);
            case 8:
                int U9 = g75.U(parcel2);
                boolean z9 = false;
                boolean z10 = false;
                int i5 = 0;
                g96 g96 = null;
                int[] iArr3 = null;
                int[] iArr4 = null;
                while (parcel2.dataPosition() < U9) {
                    int readInt9 = parcel2.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            g96 = (g96) g75.t(parcel2, readInt9, g96.CREATOR);
                            break;
                        case 2:
                            z9 = g75.J(parcel2, readInt9);
                            break;
                        case 3:
                            z10 = g75.J(parcel2, readInt9);
                            break;
                        case 4:
                            iArr3 = g75.s(parcel2, readInt9);
                            break;
                        case 5:
                            i5 = g75.L(parcel2, readInt9);
                            break;
                        case 6:
                            iArr4 = g75.s(parcel2, readInt9);
                            break;
                        default:
                            g75.T(parcel2, readInt9);
                            break;
                    }
                }
                g75.z(parcel2, U9);
                return new p11(g96, z9, z10, iArr3, i5, iArr4);
            case 9:
                int U10 = g75.U(parcel2);
                int i6 = 0;
                while (parcel2.dataPosition() < U10) {
                    int readInt10 = parcel2.readInt();
                    char c5 = (char) readInt10;
                    if (c5 == 2) {
                        str2 = r11;
                        z4 = g75.L(parcel2, readInt10);
                    } else if (c5 == 3) {
                        z4 = z7;
                        str2 = g75.u(parcel2, readInt10);
                    } else if (c5 != 4) {
                        g75.T(parcel2, readInt10);
                        str2 = r11;
                        z4 = z7;
                    } else {
                        i6 = g75.L(parcel2, readInt10);
                        str2 = r11;
                        z4 = z7;
                    }
                    r11 = str2;
                    z7 = z4;
                }
                g75.z(parcel2, U10);
                return new kw(z7, i6, r11);
            case 10:
                int U11 = g75.U(parcel2);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = rv2.K;
                cc2[] cc2Arr2 = rv2.L;
                cc2[] cc2Arr3 = cc2Arr2;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                boolean z11 = false;
                int i10 = 0;
                boolean z12 = false;
                String str8 = null;
                IBinder iBinder = null;
                Account account = null;
                String str9 = null;
                while (parcel2.dataPosition() < U11) {
                    int readInt11 = parcel2.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i7 = g75.L(parcel2, readInt11);
                            break;
                        case 2:
                            i8 = g75.L(parcel2, readInt11);
                            break;
                        case 3:
                            i9 = g75.L(parcel2, readInt11);
                            break;
                        case 4:
                            str8 = g75.u(parcel2, readInt11);
                            break;
                        case 5:
                            iBinder = g75.K(parcel2, readInt11);
                            break;
                        case 6:
                            scopeArr = g75.w(parcel2, readInt11, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = g75.p(parcel2, readInt11);
                            break;
                        case 8:
                            account = g75.t(parcel2, readInt11, Account.CREATOR);
                            break;
                        case 10:
                            cc2Arr2 = g75.w(parcel2, readInt11, cc2.CREATOR);
                            break;
                        case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                            cc2Arr3 = g75.w(parcel2, readInt11, cc2.CREATOR);
                            break;
                        case 12:
                            z11 = g75.J(parcel2, readInt11);
                            break;
                        case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                            i10 = g75.L(parcel2, readInt11);
                            break;
                        case 14:
                            z12 = g75.J(parcel2, readInt11);
                            break;
                        case h75.g /*15*/:
                            str9 = g75.u(parcel2, readInt11);
                            break;
                        default:
                            g75.T(parcel2, readInt11);
                            break;
                    }
                }
                g75.z(parcel2, U11);
                return new rv2(i7, i8, i9, str8, iBinder, scopeArr, bundle2, account, cc2Arr2, cc2Arr3, z11, i10, z12, str9);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                int U12 = g75.U(parcel2);
                while (parcel2.dataPosition() < U12) {
                    int readInt12 = parcel2.readInt();
                    char c6 = (char) readInt12;
                    if (c6 == 1) {
                        str3 = g75.u(parcel2, readInt12);
                        z5 = z7;
                    } else if (c6 == 2) {
                        j = g75.M(parcel2, readInt12);
                        str3 = r11;
                        z5 = z7;
                    } else if (c6 != 3) {
                        g75.T(parcel2, readInt12);
                        str3 = r11;
                        z5 = z7;
                    } else {
                        z5 = g75.L(parcel2, readInt12);
                        str3 = r11;
                    }
                    r11 = str3;
                    z7 = z5;
                }
                g75.z(parcel2, U12);
                return new u79(z7, j, r11);
            case 12:
                int U13 = g75.U(parcel2);
                long j3 = 0;
                long j4 = 0;
                int i11 = 0;
                byte[] bArr13 = null;
                String str10 = null;
                Bundle bundle3 = null;
                String str11 = null;
                while (parcel2.dataPosition() < U13) {
                    int readInt13 = parcel2.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            j3 = g75.M(parcel2, readInt13);
                            break;
                        case 2:
                            bArr13 = g75.q(parcel2, readInt13);
                            break;
                        case 3:
                            str10 = g75.u(parcel2, readInt13);
                            break;
                        case 4:
                            bundle3 = g75.p(parcel2, readInt13);
                            break;
                        case 5:
                            i11 = g75.L(parcel2, readInt13);
                            break;
                        case 6:
                            j4 = g75.M(parcel2, readInt13);
                            break;
                        case 7:
                            str11 = g75.u(parcel2, readInt13);
                            break;
                        default:
                            g75.T(parcel2, readInt13);
                            break;
                    }
                }
                g75.z(parcel2, U13);
                return new a89(j3, bArr13, str10, bundle3, i11, j4, str11);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                int U14 = g75.U(parcel2);
                while (true) {
                    ArrayList arrayList3 = null;
                    while (true) {
                        if (parcel2.dataPosition() < U14) {
                            int readInt14 = parcel2.readInt();
                            if (((char) readInt14) != 1) {
                                g75.T(parcel2, readInt14);
                            } else {
                                int N2 = g75.N(parcel2, readInt14);
                                int dataPosition2 = parcel2.dataPosition();
                                if (N2 != 0) {
                                    ArrayList arrayList4 = new ArrayList();
                                    int readInt15 = parcel2.readInt();
                                    for (int i12 = 0; i12 < readInt15; i12++) {
                                        arrayList4.add(Integer.valueOf(parcel2.readInt()));
                                    }
                                    parcel2.setDataPosition(dataPosition2 + N2);
                                    arrayList3 = arrayList4;
                                }
                            }
                        } else {
                            g75.z(parcel2, U14);
                            return new c89(arrayList3);
                        }
                    }
                }
            case 14:
                int U15 = g75.U(parcel2);
                while (parcel2.dataPosition() < U15) {
                    int readInt16 = parcel2.readInt();
                    if (((char) readInt16) != 1) {
                        g75.T(parcel2, readInt16);
                        arrayList2 = r11;
                    } else {
                        arrayList2 = g75.x(parcel2, readInt16, a89.CREATOR);
                    }
                    r11 = arrayList2;
                }
                g75.z(parcel2, U15);
                return new f89(r11);
            case h75.g /*15*/:
                int U16 = g75.U(parcel2);
                long j5 = 0;
                int i13 = 0;
                String str12 = null;
                Long l = null;
                Float f = null;
                String str13 = null;
                String str14 = null;
                Double d2 = null;
                while (parcel2.dataPosition() < U16) {
                    int readInt17 = parcel2.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            i13 = g75.L(parcel2, readInt17);
                            break;
                        case 2:
                            str12 = g75.u(parcel2, readInt17);
                            break;
                        case 3:
                            j5 = g75.M(parcel2, readInt17);
                            break;
                        case 4:
                            int N3 = g75.N(parcel2, readInt17);
                            if (N3 != 0) {
                                g75.X(parcel2, N3, 8);
                                l = Long.valueOf(parcel2.readLong());
                                break;
                            } else {
                                l = null;
                                break;
                            }
                        case 5:
                            int N4 = g75.N(parcel2, readInt17);
                            if (N4 != 0) {
                                g75.X(parcel2, N4, 4);
                                f = Float.valueOf(parcel2.readFloat());
                                break;
                            } else {
                                f = null;
                                break;
                            }
                        case 6:
                            str13 = g75.u(parcel2, readInt17);
                            break;
                        case 7:
                            str14 = g75.u(parcel2, readInt17);
                            break;
                        case 8:
                            int N5 = g75.N(parcel2, readInt17);
                            if (N5 != 0) {
                                g75.X(parcel2, N5, 8);
                                d2 = Double.valueOf(parcel2.readDouble());
                                break;
                            } else {
                                d2 = null;
                                break;
                            }
                        default:
                            g75.T(parcel2, readInt17);
                            break;
                    }
                }
                g75.z(parcel2, U16);
                return new z89(i13, str12, j5, l, f, str13, str14, d2);
            case 16:
                int U17 = g75.U(parcel2);
                long j6 = -1;
                int i14 = 0;
                int i15 = 0;
                boolean z13 = false;
                String str15 = null;
                while (parcel2.dataPosition() < U17) {
                    int readInt18 = parcel2.readInt();
                    char c7 = (char) readInt18;
                    if (c7 == 1) {
                        z13 = g75.J(parcel2, readInt18);
                    } else if (c7 == 2) {
                        str15 = g75.u(parcel2, readInt18);
                    } else if (c7 == 3) {
                        i14 = g75.L(parcel2, readInt18);
                    } else if (c7 == 4) {
                        i15 = g75.L(parcel2, readInt18);
                    } else if (c7 != 5) {
                        g75.T(parcel2, readInt18);
                    } else {
                        j6 = g75.M(parcel2, readInt18);
                    }
                }
                g75.z(parcel2, U17);
                return new w99(i14, i15, j6, str15, z13);
            case 17:
                int U18 = g75.U(parcel2);
                String str16 = "";
                String str17 = str16;
                String str18 = str17;
                String str19 = str18;
                int i16 = 100;
                long j7 = 0;
                long j8 = 0;
                long j9 = 0;
                long j10 = 0;
                long j11 = 0;
                long j12 = 0;
                long j13 = 0;
                long j14 = 0;
                boolean z14 = true;
                boolean z15 = true;
                boolean z16 = false;
                int i17 = 0;
                boolean z17 = false;
                boolean z18 = false;
                int i18 = 0;
                int i19 = 0;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                Boolean bool = null;
                ArrayList arrayList5 = null;
                String str26 = null;
                String str27 = null;
                long j15 = -2147483648L;
                while (parcel2.dataPosition() < U18) {
                    int readInt19 = parcel2.readInt();
                    switch ((char) readInt19) {
                        case 2:
                            str20 = g75.u(parcel2, readInt19);
                            break;
                        case 3:
                            str21 = g75.u(parcel2, readInt19);
                            break;
                        case 4:
                            str22 = g75.u(parcel2, readInt19);
                            break;
                        case 5:
                            str23 = g75.u(parcel2, readInt19);
                            break;
                        case 6:
                            j7 = g75.M(parcel2, readInt19);
                            break;
                        case 7:
                            j8 = g75.M(parcel2, readInt19);
                            break;
                        case 8:
                            str24 = g75.u(parcel2, readInt19);
                            break;
                        case 9:
                            z14 = g75.J(parcel2, readInt19);
                            break;
                        case 10:
                            z16 = g75.J(parcel2, readInt19);
                            break;
                        case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                            j15 = g75.M(parcel2, readInt19);
                            break;
                        case 12:
                            str25 = g75.u(parcel2, readInt19);
                            break;
                        case 14:
                            j9 = g75.M(parcel2, readInt19);
                            break;
                        case h75.g /*15*/:
                            i17 = g75.L(parcel2, readInt19);
                            break;
                        case 16:
                            z15 = g75.J(parcel2, readInt19);
                            break;
                        case 18:
                            z17 = g75.J(parcel2, readInt19);
                            break;
                        case 21:
                            int N6 = g75.N(parcel2, readInt19);
                            if (N6 != 0) {
                                g75.X(parcel2, N6, 4);
                                if (parcel2.readInt() != 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                bool = Boolean.valueOf(z6);
                                break;
                            } else {
                                bool = null;
                                break;
                            }
                        case 22:
                            j10 = g75.M(parcel2, readInt19);
                            break;
                        case 23:
                            arrayList5 = g75.v(parcel2, readInt19);
                            break;
                        case 25:
                            str16 = g75.u(parcel2, readInt19);
                            break;
                        case 26:
                            str17 = g75.u(parcel2, readInt19);
                            break;
                        case 27:
                            str26 = g75.u(parcel2, readInt19);
                            break;
                        case 28:
                            z18 = g75.J(parcel2, readInt19);
                            break;
                        case 29:
                            j11 = g75.M(parcel2, readInt19);
                            break;
                        case 30:
                            i16 = g75.L(parcel2, readInt19);
                            break;
                        case 31:
                            str18 = g75.u(parcel2, readInt19);
                            break;
                        case ' ':
                            i18 = g75.L(parcel2, readInt19);
                            break;
                        case '\"':
                            j12 = g75.M(parcel2, readInt19);
                            break;
                        case '#':
                            str27 = g75.u(parcel2, readInt19);
                            break;
                        case '$':
                            str19 = g75.u(parcel2, readInt19);
                            break;
                        case '%':
                            j13 = g75.M(parcel2, readInt19);
                            break;
                        case '&':
                            i19 = g75.L(parcel2, readInt19);
                            break;
                        case '\'':
                            j14 = g75.M(parcel2, readInt19);
                            break;
                        default:
                            g75.T(parcel2, readInt19);
                            break;
                    }
                }
                g75.z(parcel2, U18);
                return new z99(str20, str21, str22, str23, j7, j8, str24, z14, z16, j15, str25, j9, i17, z15, z17, bool, j10, arrayList5, str16, str17, str26, z18, j11, i16, str18, i18, j12, str27, str19, j13, i19, j14);
            case 18:
                return new jb9(parcel2);
            case 19:
                try {
                    return l62.a(parcel2.readInt());
                } catch (ErrorCode$UnsupportedErrorCodeException e) {
                    throw new IllegalArgumentException(e);
                }
            default:
                int U19 = g75.U(parcel2);
                int i20 = 0;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                while (parcel2.dataPosition() < U19) {
                    int readInt20 = parcel2.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            str28 = g75.u(parcel2, readInt20);
                            break;
                        case 2:
                            str29 = g75.u(parcel2, readInt20);
                            break;
                        case 3:
                            str30 = g75.u(parcel2, readInt20);
                            break;
                        case 4:
                            str31 = g75.u(parcel2, readInt20);
                            break;
                        case 5:
                            str32 = g75.u(parcel2, readInt20);
                            break;
                        case 6:
                            i20 = g75.L(parcel2, readInt20);
                            break;
                        case 7:
                            str33 = g75.u(parcel2, readInt20);
                            break;
                        default:
                            g75.T(parcel2, readInt20);
                            break;
                    }
                }
                g75.z(parcel2, U19);
                return new o26(str28, str29, str30, str31, str32, i20, str33);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case b85.b:
                return new e39[i];
            case 1:
                return new i39[i];
            case 2:
                return new j39[i];
            case 3:
                return new l39[i];
            case 4:
                return new n39[i];
            case 5:
                return new q39[i];
            case 6:
                return new s29[i];
            case 7:
                return new jw[i];
            case 8:
                return new p11[i];
            case 9:
                return new kw[i];
            case 10:
                return new rv2[i];
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new u79[i];
            case 12:
                return new a89[i];
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new c89[i];
            case 14:
                return new f89[i];
            case h75.g /*15*/:
                return new z89[i];
            case 16:
                return new w99[i];
            case 17:
                return new z99[i];
            case 18:
                return new jb9[i];
            case 19:
                return new l62[i];
            default:
                return new o26[i];
        }
    }
}
