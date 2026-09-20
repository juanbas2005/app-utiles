package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: g75  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class g75 {
    public static x83 a;
    public static x83 b;
    public static x83 c;

    public static final String A(vq4 vq4, int i) {
        vq4.getClass();
        String a2 = vq4.a(i);
        if (vq4.b(i)) {
            return ".".concat(a2);
        }
        return a2;
    }

    public static final x83 B() {
        x83 x83 = b;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Shield", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 f = pb4.f(11.3f, 2.26f, -6.0f, 2.25f);
        f.d(4.52f, 4.81f, 4.0f, 5.55f, 4.0f, 6.39f);
        f.n(4.7f);
        f.e(0.0f, 4.83f, 3.13f, 9.37f, 7.43f, 10.75f);
        f.e(0.37f, 0.12f, 0.77f, 0.12f, 1.14f, 0.0f);
        f.e(4.3f, -1.38f, 7.43f, -5.91f, 7.43f, -10.75f);
        f.n(-4.7f);
        f.e(0.0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f);
        f.i(-6.0f, -2.25f);
        f.d(12.25f, 2.09f, 11.75f, 2.09f, 11.3f, 2.26f);
        f.c();
        w83.a(w83, f.a, ky6, 14336);
        x83 b2 = w83.b();
        b = b2;
        return b2;
    }

    public static final void C(yt2 yt2, Integer num, gs2 gs2) {
        if (yt2.S) {
            yt2.b(gs2, num);
        }
    }

    public static final void D(dk6 dk6) {
        rc9.O0(dk6).H();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [yi0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, m56] */
    public static final g22 E(td0 td0, String str, Executor executor, sr2 sr2) {
        vs7 vs7 = vs7.a;
        td0.getClass();
        executor.getClass();
        bp4 bp4 = new bp4(0);
        ? obj = new Object();
        obj.c = new Object();
        bj0 bj0 = new bj0(obj);
        obj.b = bj0;
        obj.a = b81.class;
        try {
            executor.execute(new a70(td0, str, sr2, bp4, obj));
            obj.a = vs7;
        } catch (Exception e) {
            bj0.x.k(e);
        }
        return new g22(11);
    }

    public static final float F(yt2 yt2) {
        long j = ((zg4) yt2.k(ch4.b)).b.l.b.c;
        long j2 = zp7.l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((tp1) yt2.k(xy0.h)).z(j) / 2.0f;
    }

    public static g48 G(String str) {
        String group;
        String str2;
        if (str == null || d57.I0(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return null;
        }
        int parseInt = Integer.parseInt(group);
        String group2 = matcher.group(2);
        if (group2 == null) {
            return null;
        }
        int parseInt2 = Integer.parseInt(group2);
        String group3 = matcher.group(3);
        if (group3 == null) {
            return null;
        }
        int parseInt3 = Integer.parseInt(group3);
        if (matcher.group(4) != null) {
            str2 = matcher.group(4);
        } else {
            str2 = "";
        }
        str2.getClass();
        return new g48(parseInt, parseInt2, parseInt3, str2);
    }

    public static final lt3 H(qr5 qr5, vq4 vq4) {
        yb5 yb5;
        qr5.getClass();
        vq4.getClass();
        String A = A(vq4, qr5.y);
        List<or5> list = qr5.z;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (or5 or5 : list) {
            nr5 nr5 = or5.z;
            nr5.getClass();
            fu3 I = I(nr5, vq4);
            if (I != null) {
                yb5 = new yb5(vq4.getString(or5.y), I);
            } else {
                yb5 = null;
            }
            if (yb5 != null) {
                arrayList.add(yb5);
            }
        }
        return new lt3(A, sf4.a0(arrayList));
    }

    public static final fu3 I(nr5 nr5, vq4 vq4) {
        nr5.getClass();
        vq4.getClass();
        boolean booleanValue = wg2.S.e(nr5.I).booleanValue();
        mr5 mr5 = nr5.y;
        boolean z = true;
        int i = -1;
        if (booleanValue) {
            if (mr5 != null) {
                i = qw5.a[mr5.ordinal()];
            }
            if (i == 1) {
                return new bu3((byte) ((int) nr5.z));
            }
            if (i == 2) {
                return new eu3((short) ((int) nr5.z));
            }
            if (i == 3) {
                return new cu3((int) nr5.z);
            }
            if (i == 4) {
                return new du3(nr5.z);
            }
            ku4.x("Cannot read value of unsigned type: ", nr5.y);
            return null;
        }
        if (mr5 != null) {
            i = qw5.a[mr5.ordinal()];
        }
        switch (i) {
            case -1:
                return null;
            case 1:
                return new qt3((byte) ((int) nr5.z));
            case 2:
                return new zt3((short) ((int) nr5.z));
            case 3:
                return new vt3((int) nr5.z);
            case 4:
                return new yt3(nr5.z);
            case 5:
                return new rt3((char) ((int) nr5.z));
            case 6:
                return new ut3(nr5.A);
            case 7:
                return new st3(nr5.B);
            case 8:
                if (nr5.z == 0) {
                    z = false;
                }
                return new pt3(z);
            case 9:
                return new au3(vq4.getString(nr5.C));
            case 10:
                String A = A(vq4, nr5.D);
                int i2 = nr5.H;
                if (i2 == 0) {
                    return new wt3(A);
                }
                return new nt3(A, i2);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new tt3(A(vq4, nr5.D), vq4.getString(nr5.E));
            case 12:
                qr5 qr5 = nr5.F;
                qr5.getClass();
                return new mt3(H(qr5, vq4));
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                List<nr5> list = nr5.G;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (nr5 nr52 : list) {
                    nr52.getClass();
                    fu3 I = I(nr52, vq4);
                    if (I != null) {
                        arrayList.add(I);
                    }
                }
                return new ot3(arrayList);
            default:
                h.c();
                return null;
        }
    }

    public static boolean J(Parcel parcel, int i) {
        W(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static IBinder K(Parcel parcel, int i) {
        int N = N(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + N);
        return readStrongBinder;
    }

    public static int L(Parcel parcel, int i) {
        W(parcel, i, 4);
        return parcel.readInt();
    }

    public static long M(Parcel parcel, int i) {
        W(parcel, i, 8);
        return parcel.readLong();
    }

    public static int N(Parcel parcel, int i) {
        if ((i & -65536) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static final void O(yt2 yt2, vr2 vr2) {
        yt2.b(new l20(3, vr2), vs7.a);
    }

    public static final Object P(in8 in8, k54 k54, gs2 gs2, a97 a97) {
        Object L;
        if (k54 == k54.x) {
            h.q("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            return null;
        } else if (in8.G0() != k54.w && (L = gl0.L(new ng((Object) in8, (Object) k54, (Object) gs2, (f61) null, 16), a97)) == p81.w) {
            return L;
        } else {
            return vs7.a;
        }
    }

    public static final void Q(gs2 gs2, yt2 yt2, Object obj) {
        if (yt2.S || !sg3.e(yt2.Q(), obj)) {
            yt2.o0(obj);
            yt2.b(gs2, obj);
        }
    }

    public static void T(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + N(parcel, i));
    }

    public static int U(Parcel parcel) {
        int readInt = parcel.readInt();
        int N = N(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 == 20293) {
            int i = N + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
            sb.append("Size read is invalid start=");
            sb.append(dataPosition);
            sb.append(" end=");
            sb.append(i);
            throw new SafeParcelReader$ParseException(sb.toString(), parcel);
        }
        throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void V(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = h75.J("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                h.q(hl6.k(i2, "negative size: "));
                return;
            } else {
                str = h75.J("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void W(Parcel parcel, int i, int i2) {
        int N = N(parcel, i);
        if (N != i2) {
            String hexString = Integer.toHexString(N);
            int length = String.valueOf(i2).length();
            int length2 = String.valueOf(N).length();
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + length2 + 4 + 1);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(N);
            throw new SafeParcelReader$ParseException(f21.m(sb, " (0x", hexString, ")"), parcel);
        }
    }

    public static void X(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            int length = String.valueOf(i2).length();
            int length2 = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + length2 + 4 + 1);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(i);
            throw new SafeParcelReader$ParseException(f21.m(sb, " (0x", hexString, ")"), parcel);
        }
    }

    public static void Y(jc9 jc9) {
        if (a0(jc9) || ((qb9) jc9).w == null) {
            Trace.beginSection(((qb9) jc9).y);
            c0(jc9);
            return;
        }
        Y(((qb9) jc9).w);
        c0(jc9);
    }

    public static void Z(jc9 jc9) {
        if (a0(jc9) || ((qb9) jc9).w == null) {
            Trace.endSection();
            Trace.endSection();
            return;
        }
        Trace.endSection();
        Z(((qb9) jc9).w);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03d2, code lost:
        if (r39 != false) goto L_0x03ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0419, code lost:
        if (r39 != false) goto L_0x0410;
     */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02f6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0465  */
    public static final void a(CharSequence charSequence, gs2 gs2, me7 me7, hs2 hs2, gs2 gs22, gs2 gs23, gs2 gs24, gs2 gs25, boolean z, boolean z2, boolean z3, ef3 ef3, la5 la5, yd7 yd7, fw0 fw0, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        vc3 vc3;
        boolean z4;
        in8 in8;
        boolean z5;
        mm7 mm7;
        im7 im7;
        im7 im72;
        mm7 mm72;
        boolean z6;
        yt2 yt22;
        im7 im73;
        d63 d63;
        fw0 fw02;
        im7 im74;
        yd7 yd72;
        g22 g22;
        boolean z7;
        long j;
        fw0 fw03;
        long j2;
        fw0 fw04;
        long j3;
        fw0 fw05;
        long j4;
        fw0 fw06;
        fw0 fw07;
        je2 je2;
        je2 je22;
        Object obj;
        float f;
        Object Q;
        int ordinal;
        Object Q2;
        Object obj2;
        float f2;
        boolean g;
        a37 a37;
        int ordinal2;
        float f3;
        boolean g2;
        a37 a372;
        me7 me72 = me7;
        hs2 hs22 = hs2;
        gs2 gs26 = gs22;
        gs2 gs27 = gs23;
        gs2 gs28 = gs24;
        gs2 gs29 = gs25;
        boolean z8 = z2;
        boolean z9 = z3;
        ef3 ef32 = ef3;
        la5 la52 = la5;
        yd7 yd73 = yd7;
        fw0 fw08 = fw0;
        yt2 yt23 = yt2;
        int i5 = i;
        int i6 = i2;
        g22 g222 = g22.K;
        lo7 lo7 = we.v;
        g22 g223 = g222;
        yt23.g0(-1478429597);
        int i7 = 4;
        CharSequence charSequence2 = charSequence;
        if ((i5 & 6) == 0) {
            i3 = i5 | (yt23.i(charSequence2) ? 4 : 2);
        } else {
            i3 = i5;
        }
        int i8 = 32;
        gs2 gs210 = gs2;
        if ((i5 & 48) == 0) {
            i3 |= yt23.i(gs210) ? 32 : 16;
        }
        int i9 = 128;
        if ((i5 & 384) == 0) {
            i3 |= yt23.g(me72) ? 256 : 128;
        }
        int i10 = 1024;
        if ((i5 & 3072) == 0) {
            i3 |= yt23.i(hs22) ? 2048 : 1024;
        }
        int i11 = 8192;
        if ((i5 & 24576) == 0) {
            i3 |= yt23.i(gs26) ? 16384 : 8192;
        }
        int i12 = 65536;
        if ((i5 & 196608) == 0) {
            i3 |= yt23.i(gs27) ? 131072 : 65536;
        }
        int i13 = 524288;
        if ((i5 & 1572864) == 0) {
            i3 |= yt23.i(gs28) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i3 |= yt23.i((Object) null) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i3 |= yt23.i((Object) null) ? 67108864 : 33554432;
        }
        if ((805306368 & i5) == 0) {
            i3 |= yt23.i(gs29) ? 536870912 : 268435456;
        }
        int i14 = i3;
        if ((i6 & 6) == 0) {
            if (!yt23.h(z)) {
                i7 = 2;
            }
            i4 = i6 | i7;
        } else {
            boolean z10 = z;
            i4 = i6;
        }
        if ((i6 & 48) == 0) {
            if (!yt23.h(z8)) {
                i8 = 16;
            }
            i4 |= i8;
        }
        if ((i6 & 384) == 0) {
            if (yt23.h(z9)) {
                i9 = 256;
            }
            i4 |= i9;
        }
        if ((i6 & 3072) == 0) {
            if (yt23.g(ef32)) {
                i10 = 2048;
            }
            i4 |= i10;
        }
        if ((i6 & 24576) == 0) {
            if (yt23.g(la52)) {
                i11 = 16384;
            }
            i4 |= i11;
        }
        if ((i6 & 196608) == 0) {
            if (yt23.g(yd73)) {
                i12 = 131072;
            }
            i4 |= i12;
        }
        if ((i6 & 1572864) == 0) {
            if (yt23.i(fw08)) {
                i13 = 1048576;
            }
            i4 |= i13;
        }
        int i15 = i4;
        if (yt23.V(i14 & 1, ((i14 & 306783379) == 306783378 && (i15 & 599187) == 599186) ? false : true)) {
            boolean booleanValue = ((Boolean) rc9.z(ef32, yt23, (i15 >> 9) & 14).getValue()).booleanValue();
            vc3 vc32 = vc3.y;
            vc3 vc33 = vc3.x;
            boolean z11 = booleanValue;
            vc3 vc34 = vc3.w;
            if (z11) {
                vc3 = vc34;
            } else {
                vc3 = charSequence.length() == 0 ? vc33 : vc32;
            }
            br7 br7 = ((zg4) yt23.k(ch4.b)).b;
            tg7 tg7 = br7.j;
            tg7 tg72 = br7.l;
            long b2 = tg7.b();
            long j5 = jt0.g;
            boolean z12 = (jt0.c(b2, j5) && !jt0.c(tg72.b(), j5)) || (!jt0.c(tg7.b(), j5) && jt0.c(tg72.b(), j5));
            mm7 d1 = rc9.d1(vc3, "TextFieldInputState", yt23, 48, 0);
            in8 in82 = d1.a;
            boolean z13 = hs22 != null;
            float f4 = 1.0f;
            d63 d632 = ay0.a;
            if (hs22 != null) {
                yt23.e0(994993276);
                je2 H = hj8.H(vm4.x, yt23);
                if (!d1.h()) {
                    yt23.e0(1666573488);
                    boolean g3 = yt23.g(d1);
                    z5 = z12;
                    obj2 = yt23.Q();
                    if (g3 || obj2 == d632) {
                        ix6 h = j45.h();
                        vr2 e = h != null ? h.e() : null;
                        in8 = in82;
                        ix6 j6 = j45.j(h);
                        z4 = z13;
                        try {
                            Object H0 = in8.H0();
                            j45.m(h, j6, e);
                            yt23.o0(H0);
                            obj2 = H0;
                        } catch (Throwable th) {
                            j45.m(h, j6, e);
                            throw th;
                        }
                    } else {
                        in8 = in82;
                        z4 = z13;
                    }
                    yt23.r(false);
                } else {
                    z5 = z12;
                    in8 = in82;
                    z4 = z13;
                    yt23.e0(1666827533);
                    yt23.r(false);
                    obj2 = in8.H0();
                }
                yt23.e0(1071902915);
                int ordinal3 = ((vc3) obj2).ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 != 1) {
                        if (ordinal3 != 2) {
                            h.c();
                            return;
                        }
                    } else if (z4) {
                        f2 = 0.0f;
                        yt23.r(false);
                        Float valueOf = Float.valueOf(f2);
                        g = yt23.g(d1);
                        Object Q3 = yt23.Q();
                        if (!g || Q3 == d632) {
                            a37 = u55.i(new wo0(d1, 12));
                            yt23.o0(a37);
                        } else {
                            a37 = Q3;
                        }
                        yt23.e0(1071902915);
                        ordinal2 = ((vc3) a37.getValue()).ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    h.c();
                                    return;
                                }
                            } else if (z4) {
                                f3 = 0.0f;
                                yt23.r(false);
                                Float valueOf2 = Float.valueOf(f3);
                                g2 = yt23.g(d1);
                                Object Q4 = yt23.Q();
                                if (!g2 || Q4 == d632) {
                                    a372 = u55.i(new wo0(d1, 13));
                                    yt23.o0(a372);
                                } else {
                                    a372 = Q4;
                                }
                                gm7 gm7 = (gm7) a372.getValue();
                                yt23.e0(1806589607);
                                yt23.r(false);
                                mm7 mm73 = d1;
                                im7 = rc9.F(mm73, valueOf, valueOf2, H, lo7, yt23, 196608);
                                mm7 = mm73;
                                yt23.r(false);
                            }
                        }
                        f3 = 1.0f;
                        yt23.r(false);
                        Float valueOf22 = Float.valueOf(f3);
                        g2 = yt23.g(d1);
                        Object Q42 = yt23.Q();
                        if (!g2) {
                        }
                        a372 = u55.i(new wo0(d1, 13));
                        yt23.o0(a372);
                        gm7 gm72 = (gm7) a372.getValue();
                        yt23.e0(1806589607);
                        yt23.r(false);
                        mm7 mm732 = d1;
                        im7 = rc9.F(mm732, valueOf, valueOf22, H, lo7, yt23, 196608);
                        mm7 = mm732;
                        yt23.r(false);
                    }
                }
                f2 = 1.0f;
                yt23.r(false);
                Float valueOf3 = Float.valueOf(f2);
                g = yt23.g(d1);
                Object Q32 = yt23.Q();
                if (!g) {
                }
                a37 = u55.i(new wo0(d1, 12));
                yt23.o0(a37);
                yt23.e0(1071902915);
                ordinal2 = ((vc3) a37.getValue()).ordinal();
                if (ordinal2 != 0) {
                }
                f3 = 1.0f;
                yt23.r(false);
                Float valueOf222 = Float.valueOf(f3);
                g2 = yt23.g(d1);
                Object Q422 = yt23.Q();
                if (!g2) {
                }
                a372 = u55.i(new wo0(d1, 13));
                yt23.o0(a372);
                gm7 gm722 = (gm7) a372.getValue();
                yt23.e0(1806589607);
                yt23.r(false);
                mm7 mm7322 = d1;
                im7 = rc9.F(mm7322, valueOf3, valueOf222, H, lo7, yt23, 196608);
                mm7 = mm7322;
                yt23.r(false);
            } else {
                mm7 = d1;
                z5 = z12;
                in8 = in82;
                z4 = z13;
                yt23.e0(995064483);
                yt23.r(false);
                im7 = null;
            }
            if (gs26 != null) {
                yt23.e0(995155127);
                je2 H2 = hj8.H(vm4.z, yt23);
                je2 H3 = hj8.H(vm4.A, yt23);
                if (!mm7.h()) {
                    yt23.e0(1666573488);
                    boolean g4 = yt23.g(mm7);
                    im72 = im7;
                    obj = yt23.Q();
                    if (g4 || obj == d632) {
                        ix6 h2 = j45.h();
                        vr2 e2 = h2 != null ? h2.e() : null;
                        je22 = H2;
                        ix6 j7 = j45.j(h2);
                        je2 = H3;
                        try {
                            Object H02 = in8.H0();
                            j45.m(h2, j7, e2);
                            yt23.o0(H02);
                            obj = H02;
                        } catch (Throwable th2) {
                            j45.m(h2, j7, e2);
                            throw th2;
                        }
                    } else {
                        je22 = H2;
                        je2 = H3;
                    }
                    yt23.r(false);
                } else {
                    im72 = im7;
                    je22 = H2;
                    je2 = H3;
                    yt23.e0(1666827533);
                    yt23.r(false);
                    obj = in8.H0();
                }
                yt23.e0(-2037958114);
                int ordinal4 = ((vc3) obj).ordinal();
                if (ordinal4 != 0) {
                    if (ordinal4 != 1) {
                        if (ordinal4 != 2) {
                            h.c();
                            return;
                        }
                    }
                    f = 0.0f;
                    yt23.r(false);
                    Float valueOf4 = Float.valueOf(f);
                    boolean g5 = yt23.g(mm7);
                    Q = yt23.Q();
                    if (g5 || Q == d632) {
                        Q = u55.i(new wo0(mm7, 16));
                        yt23.o0(Q);
                    }
                    yt23.e0(-2037958114);
                    ordinal = ((vc3) ((a37) Q).getValue()).ordinal();
                    if (ordinal == 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                h.c();
                                return;
                            }
                        }
                        f4 = 0.0f;
                    }
                    yt23.r(false);
                    Float valueOf5 = Float.valueOf(f4);
                    boolean g6 = yt23.g(mm7);
                    Q2 = yt23.Q();
                    if (g6 || Q2 == d632) {
                        Q2 = u55.i(new wo0(mm7, 17));
                        yt23.o0(Q2);
                    }
                    gm7 gm73 = (gm7) ((a37) Q2).getValue();
                    yt23.e0(-1370891590);
                    je2 je23 = (!gm73.c(vc34, vc33) && (gm73.c(vc33, vc34) || gm73.c(vc32, vc33))) ? je2 : je22;
                    z6 = false;
                    yt23.r(false);
                    yt2 yt24 = yt23;
                    mm72 = mm7;
                    im73 = rc9.F(mm72, valueOf4, valueOf5, je23, lo7, yt24, 196608);
                    yt22 = yt24;
                    yt22.r(false);
                }
                f = 1.0f;
                yt23.r(false);
                Float valueOf42 = Float.valueOf(f);
                boolean g52 = yt23.g(mm7);
                Q = yt23.Q();
                Q = u55.i(new wo0(mm7, 16));
                yt23.o0(Q);
                yt23.e0(-2037958114);
                ordinal = ((vc3) ((a37) Q).getValue()).ordinal();
                if (ordinal == 0) {
                }
                yt23.r(false);
                Float valueOf52 = Float.valueOf(f4);
                boolean g62 = yt23.g(mm7);
                Q2 = yt23.Q();
                Q2 = u55.i(new wo0(mm7, 17));
                yt23.o0(Q2);
                gm7 gm732 = (gm7) ((a37) Q2).getValue();
                yt23.e0(-1370891590);
                if (!gm732.c(vc34, vc33) && (gm732.c(vc33, vc34) || gm732.c(vc32, vc33))) {
                }
                z6 = false;
                yt23.r(false);
                yt2 yt242 = yt23;
                mm72 = mm7;
                im73 = rc9.F(mm72, valueOf42, valueOf52, je23, lo7, yt242, 196608);
                yt22 = yt242;
                yt22.r(false);
            } else {
                im72 = im7;
                yt22 = yt23;
                mm72 = mm7;
                z6 = false;
                yt22.e0(995231139);
                yt22.r(false);
                im73 = null;
            }
            yt22.e0(995398787);
            yt22.r(z6);
            if (hs22 == null) {
                yt22.e0(995485028);
                yt22.r(z6);
                yd72 = yd7;
                z7 = z6;
                d63 = d632;
                g22 = g223;
                im74 = im72;
                fw02 = null;
            } else {
                yt22.e0(995485029);
                yd7 yd74 = yd7;
                z7 = z6;
                d63 = d632;
                g22 = g223;
                im7 im75 = im72;
                im74 = im75;
                yd72 = yd74;
                fw0 J = su0.J(-568812970, new ae7(im75, yd74, z2, z3, z11, z5, mm72, tg72, tg7, hs22), yt22);
                yt22.r(z7);
                fw02 = J;
            }
            if (!z2) {
                j = yd72.D;
            } else if (z3) {
                j = yd72.E;
            } else if (z11) {
                j = yd72.B;
            } else {
                j = yd72.C;
            }
            Object Q5 = yt22.Q();
            if (Q5 == d63) {
                Q5 = u55.j(new mu4(13, im73), g22);
                yt22.o0(Q5);
            }
            a37 a373 = (a37) Q5;
            if (gs22 == null || charSequence.length() != 0 || !((Boolean) a373.getValue()).booleanValue()) {
                gs2 gs211 = gs22;
                yt22.e0(996868186);
                yt22.r(z7);
                fw03 = null;
            } else {
                yt22.e0(996556513);
                fw0 J2 = su0.J(1789869489, new de7(j, tg7, gs22), yt22);
                yt22.r(z7);
                fw03 = J2;
            }
            Object Q6 = yt22.Q();
            if (Q6 == d63) {
                Q6 = u55.j(new mu4(14, (a37) null), g22);
                yt22.o0(Q6);
            }
            a37 a374 = (a37) Q6;
            yt22.e0(997311610);
            yt22.r(z7);
            yt22.e0(997632026);
            yt22.r(z7);
            if (!z2) {
                j2 = yd72.r;
            } else if (z3) {
                j2 = yd72.s;
            } else if (z11) {
                j2 = yd72.p;
            } else {
                j2 = yd72.q;
            }
            long j8 = j2;
            if (gs23 == null) {
                yt22.e0(997794745);
                yt22.r(z7);
                fw04 = null;
            } else {
                yt22.e0(997794746);
                fw04 = su0.J(-341635739, new rp0(j8, gs23, 1, (byte) 0), yt22);
                yt22.r(z7);
            }
            if (!z2) {
                j3 = yd72.v;
            } else if (z3) {
                j3 = yd72.w;
            } else if (z11) {
                j3 = yd72.t;
            } else {
                j3 = yd72.u;
            }
            long j9 = j3;
            if (gs24 == null) {
                yt22.e0(998054680);
                yt22.r(z7);
                fw05 = null;
            } else {
                yt22.e0(998054681);
                fw0 J3 = su0.J(-1014805251, new rp0(j9, gs24, 2, (byte) 0), yt22);
                yt22.r(z7);
                fw05 = J3;
            }
            if (!z2) {
                j4 = yd72.H;
            } else if (z3) {
                j4 = yd72.I;
            } else if (z11) {
                j4 = yd72.F;
            } else {
                j4 = yd72.G;
            }
            long j10 = j4;
            if (gs25 == null) {
                yt22.e0(998325155);
                yt22.r(z7);
                fw06 = null;
            } else {
                yt22.e0(998325156);
                fw0 J4 = su0.J(-1718586554, new ff(j10, (Object) tg72, (Object) gs25, 3), yt22);
                yt22.r(z7);
                fw06 = J4;
            }
            boolean g7 = yt22.g(im74);
            Object Q7 = yt22.Q();
            if (g7 || Q7 == d63) {
                Q7 = new mu4(10, im74);
                yt22.o0(Q7);
            }
            sr2 sr2 = (sr2) Q7;
            boolean g8 = yt22.g(im73);
            Object Q8 = yt22.Q();
            if (g8 || Q8 == d63) {
                Q8 = new mu4(11, im73);
                yt22.o0(Q8);
            }
            sr2 sr22 = (sr2) Q8;
            boolean g9 = yt22.g((Object) null);
            Object Q9 = yt22.Q();
            if (g9 || Q9 == d63) {
                Q9 = new mu4(12, (a37) null);
                yt22.o0(Q9);
            }
            sr2 sr23 = (sr2) Q9;
            yt22.e0(998773354);
            Object Q10 = yt22.Q();
            if (Q10 == d63) {
                fw07 = fw04;
                Q10 = u55.p(new wu6(0));
                yt22.o0(Q10);
            } else {
                fw07 = fw04;
            }
            aq4 aq4 = (aq4) Q10;
            me7 me73 = me7;
            fw0 fw09 = fw06;
            fw0 J5 = su0.J(-852893942, new q60(aq4, me73, la5, fw0), yt22);
            fw0 fw010 = fw07;
            ge7 ge7 = new ge7(sr2);
            ge7 ge72 = new ge7(sr22);
            ge7 ge73 = new ge7(sr23);
            boolean g10 = yt22.g(sr2);
            Object Q11 = yt22.Q();
            if (g10 || Q11 == d63) {
                Q11 = new k77(2, (Object) sr2, (Object) aq4);
                yt22.o0(Q11);
            }
            fw0 fw011 = fw05;
            yt2 yt25 = yt22;
            b(gs2, fw03, fw02, fw010, fw011, (gs2) null, (gs2) null, z, me73, ge7, ge72, ge73, (vr2) Q11, J5, fw09, la5, yt25, (i14 & 112) | 6 | ((i15 << 24) & 234881024) | ((i14 << 21) & 1879048192), (3670016 & (i15 << 6)) | 24576);
            yt23 = yt25;
            yt23.r(false);
        } else {
            yt23.Y();
        }
        yx5 v = yt23.v();
        if (v != null) {
            v.d = new ce7(charSequence, gs2, me7, hs2, gs22, gs23, gs24, gs25, z, z2, z3, ef3, la5, yd7, fw0, i, i2);
        }
    }

    public static boolean a0(jc9 jc9) {
        if (((qb9) jc9).A != Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:266:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x05aa  */
    public static final void b(gs2 gs2, hs2 hs2, gs2 gs22, gs2 gs23, gs2 gs24, gs2 gs25, gs2 gs26, boolean z, me7 me7, ge7 ge7, ge7 ge72, ge7 ge73, vr2 vr2, fw0 fw0, gs2 gs27, la5 la5, yt2 yt2, int i, int i2) {
        int i3;
        int i4;
        la5 la52;
        hs2 hs22;
        gs2 gs28;
        yt2 yt22;
        gs2 gs29;
        int i5;
        int i6;
        d63 d63;
        float f;
        c95 c95;
        jl4 jl4;
        i80 i80;
        i80 i802;
        i80 i803;
        ey3 ey3;
        i80 i804;
        boolean z2;
        float f2;
        i80 i805;
        gs2 gs210;
        ck ckVar;
        i80 i806;
        boolean z3;
        ge7 ge74;
        boolean z4;
        Object Q;
        gs2 gs211 = gs2;
        hs2 hs23 = hs2;
        gs2 gs212 = gs22;
        gs2 gs213 = gs23;
        gs2 gs214 = gs24;
        gs2 gs215 = gs25;
        gs2 gs216 = gs26;
        ge7 ge75 = ge7;
        ge7 ge76 = ge72;
        ge7 ge77 = ge73;
        fw0 fw02 = fw0;
        yt2 yt23 = yt2;
        int i7 = i;
        int i8 = i2;
        i80 i807 = xb4.C;
        i80 i808 = xb4.y;
        yt23.g0(-1572199315);
        int i9 = i7 & 6;
        jl4 jl42 = jl4.w;
        if (i9 == 0) {
            i3 = i7 | (yt23.g(jl42) ? 4 : 2);
        } else {
            i3 = i7;
        }
        int i10 = 16;
        if ((i7 & 48) == 0) {
            i3 |= yt23.i(gs211) ? 32 : 16;
        }
        int i11 = 128;
        if ((i7 & 384) == 0) {
            i3 |= yt23.i(hs23) ? 256 : 128;
        }
        int i12 = 1024;
        if ((i7 & 3072) == 0) {
            i3 |= yt23.i(gs212) ? 2048 : 1024;
        }
        int i13 = 8192;
        if ((i7 & 24576) == 0) {
            i3 |= yt23.i(gs213) ? 16384 : 8192;
        }
        int i14 = 65536;
        if ((i7 & 196608) == 0) {
            i3 |= yt23.i(gs214) ? 131072 : 65536;
        }
        int i15 = 524288;
        if ((i7 & 1572864) == 0) {
            i3 |= yt23.i(gs215) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i3 |= yt23.i(gs216) ? 8388608 : 4194304;
        }
        boolean z5 = z;
        if ((i7 & 100663296) == 0) {
            i3 |= yt23.h(z5) ? 67108864 : 33554432;
        }
        me7 me72 = me7;
        if ((i7 & 805306368) == 0) {
            i3 |= yt23.g(me72) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i4 = i8 | ((i8 & 8) == 0 ? yt23.g(ge75) : yt23.i(ge75) ? 4 : 2);
        } else {
            i4 = i8;
        }
        if ((i8 & 48) == 0) {
            if ((i8 & 64) == 0 ? yt23.g(ge76) : yt23.i(ge76)) {
                i10 = 32;
            }
            i4 |= i10;
        }
        if ((i8 & 384) == 0) {
            if ((i8 & 512) == 0 ? yt23.g(ge77) : yt23.i(ge77)) {
                i11 = 256;
            }
            i4 |= i11;
        }
        if ((i8 & 3072) == 0) {
            if (yt23.i(vr2)) {
                i12 = 2048;
            }
            i4 |= i12;
        } else {
            vr2 vr22 = vr2;
        }
        if ((i8 & 24576) == 0) {
            if (yt23.i(fw02)) {
                i13 = 16384;
            }
            i4 |= i13;
        }
        if ((i8 & 196608) == 0) {
            if (yt23.i(gs27)) {
                i14 = 131072;
            }
            i4 |= i14;
        } else {
            gs2 gs217 = gs27;
        }
        la5 la53 = la5;
        if ((i8 & 1572864) == 0) {
            if (yt23.g(la53)) {
                i15 = 1048576;
            }
            i4 |= i15;
        }
        int i16 = i4;
        if (yt23.V(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i16) == 599186) ? false : true)) {
            float f3 = ((lx1) yt23.k(hf3.c)).w;
            if (Float.isNaN(f3)) {
                f3 = 0.0f;
            }
            float f4 = (f3 - x91.m) / 2.0f;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            int i17 = i16 & 14;
            boolean d = ((i16 & 7168) == 2048) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | (i17 == 4 || ((i16 & 8) != 0 && yt23.g(ge75))) | ((i16 & 112) == 32 || ((i16 & 64) != 0 && yt23.g(ge76))) | ((i16 & 896) == 256 || ((i16 & 512) != 0 && yt23.g(ge77))) | ((3670016 & i16) == 1048576) | yt23.d(f4);
            Object Q2 = yt23.Q();
            boolean z6 = d;
            d63 d632 = ay0.a;
            if (z6 || Q2 == d632) {
                i80 i809 = i807;
                f = f4;
                i6 = i16;
                yt22 = yt23;
                i5 = i17;
                jl4 = jl42;
                i80 = i808;
                d63 = d632;
                i802 = i809;
                c95 = new c95(vr2, z, me7, ge7, ge76, ge77, la5, f);
                yt22.o0(c95);
            } else {
                i6 = i16;
                yt22 = yt23;
                i5 = i17;
                jl4 = jl42;
                i80 = i808;
                d63 = d632;
                i802 = i807;
                f = f4;
                c95 = Q2;
            }
            c95 c952 = c95;
            ey3 ey32 = (ey3) yt22.k(xy0.n);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, jl4);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar2 = tx0.f;
            Q(ckVar2, yt22, c952);
            ck ckVar3 = tx0.e;
            Q(ckVar3, yt22, m);
            Integer valueOf = Integer.valueOf(hashCode);
            ck ckVar4 = tx0.g;
            Q(ckVar4, yt22, valueOf);
            ce ceVar = tx0.h;
            O(yt22, ceVar);
            ck ckVar5 = tx0.d;
            Q(ckVar5, yt22, E);
            fw02.H(yt22, Integer.valueOf((i6 >> 12) & 14));
            al4 al4 = al4.w;
            if (gs213 != null) {
                yt22.e0(1051742060);
                ml4 d2 = rc9.w0(jl4, "Leading").d(al4);
                i804 = i80;
                ey3 = ey32;
                lh4 d3 = mb0.d(i802, false);
                i803 = i802;
                int hashCode2 = Long.hashCode(yt22.T);
                vf5 m2 = yt22.m();
                ml4 E2 = gw8.E(yt22, d2);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                Q(ckVar2, yt22, d3);
                Q(ckVar3, yt22, m2);
                f21.s(hashCode2, yt22, ckVar4, yt22, ceVar);
                Q(ckVar5, yt22, E2);
                z2 = false;
                pb4.q((i3 >> 12) & 14, gs213, yt22, true, false);
            } else {
                i803 = i802;
                i804 = i80;
                ey3 = ey32;
                z2 = false;
                yt22.e0(1051988076);
                yt22.r(false);
            }
            if (gs214 != null) {
                yt22.e0(1052030794);
                ml4 d4 = rc9.w0(jl4, "Trailing").d(al4);
                lh4 d5 = mb0.d(i803, z2);
                int hashCode3 = Long.hashCode(yt22.T);
                vf5 m3 = yt22.m();
                ml4 E3 = gw8.E(yt22, d4);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                Q(ckVar2, yt22, d5);
                Q(ckVar3, yt22, m3);
                f21.s(hashCode3, yt22, ckVar4, yt22, ceVar);
                Q(ckVar5, yt22, E3);
                gs214 = gs24;
                pb4.q((i3 >> 15) & 14, gs214, yt22, true, false);
            } else {
                yt22.e0(1052278732);
                yt22.r(z2);
            }
            la52 = la5;
            ey3 ey33 = ey3;
            float l = x91.l(la52, ey33);
            float k = x91.k(la52, ey33);
            if (gs23 != null) {
                l -= f;
                if (l < 0.0f) {
                    l = 0.0f;
                }
            }
            float f5 = l;
            if (gs214 != null) {
                float f6 = k - f;
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                k = f6;
            }
            if (gs25 != null) {
                yt22.e0(1052982711);
                ml4 O = x91.O(yu6.r(yu6.f(rc9.w0(jl4, "Prefix"), 24.0f, 0.0f, 2)), f5, 0.0f, 2.0f, 0.0f, 10);
                i805 = i804;
                lh4 d6 = mb0.d(i805, false);
                f2 = k;
                int hashCode4 = Long.hashCode(yt22.T);
                vf5 m4 = yt22.m();
                ml4 E4 = gw8.E(yt22, O);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                Q(ckVar2, yt22, d6);
                Q(ckVar3, yt22, m4);
                f21.s(hashCode4, yt22, ckVar4, yt22, ceVar);
                Q(ckVar5, yt22, E4);
                pb4.q((i3 >> 18) & 14, gs25, yt22, true, false);
            } else {
                f2 = k;
                i805 = i804;
                gs2 gs218 = gs25;
                yt22.e0(1053310412);
                yt22.r(false);
            }
            if (gs26 != null) {
                yt22.e0(1053353657);
                ml4 O2 = x91.O(yu6.r(yu6.f(rc9.w0(jl4, "Suffix"), 24.0f, 0.0f, 2)), 2.0f, 0.0f, f2, 0.0f, 10);
                lh4 d7 = mb0.d(i805, false);
                ckVar = ckVar5;
                int hashCode5 = Long.hashCode(yt22.T);
                vf5 m5 = yt22.m();
                ml4 E5 = gw8.E(yt22, O2);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                Q(ckVar2, yt22, d7);
                Q(ckVar3, yt22, m5);
                f21.s(hashCode5, yt22, ckVar4, yt22, ceVar);
                Q(ckVar, yt22, E5);
                gs210 = gs26;
                pb4.q((i3 >> 21) & 14, gs210, yt22, true, false);
            } else {
                gs210 = gs26;
                ckVar = ckVar5;
                yt22.e0(1053679436);
                yt22.r(false);
            }
            ml4 O3 = x91.O(yu6.r(yu6.f(jl4, 24.0f, 0.0f, 2)), gs25 == null ? f5 : 0.0f, 0.0f, gs210 == null ? f2 : 0.0f, 0.0f, 10);
            if (hs2 != null) {
                yt22.e0(1054049421);
                hs22 = hs2;
                hs22.u(rc9.w0(jl4, "Hint").d(O3), yt22, Integer.valueOf((i3 >> 3) & 112));
                yt22.r(false);
            } else {
                hs22 = hs2;
                yt22.e0(1054140716);
                yt22.r(false);
            }
            ml4 d8 = rc9.w0(jl4, "TextField").d(O3);
            lh4 d9 = mb0.d(i805, true);
            i80 i8010 = i805;
            int hashCode6 = Long.hashCode(yt22.T);
            vf5 m6 = yt22.m();
            ml4 E6 = gw8.E(yt22, d8);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            Q(ckVar2, yt22, d9);
            Q(ckVar3, yt22, m6);
            f21.s(hashCode6, yt22, ckVar4, yt22, ceVar);
            Q(ckVar, yt22, E6);
            gs2.H(yt22, Integer.valueOf((i3 >> 3) & 14));
            yt22.r(true);
            if (gs22 != null) {
                yt22.e0(1054793359);
                if (i5 != 4) {
                    ge74 = ge7;
                    if ((i6 & 8) == 0 || !yt22.i(ge74)) {
                        z4 = false;
                        Q = yt22.Q();
                        if (z4 || Q == d63) {
                            Q = new fd7(2, (Object) ge74);
                            yt22.o0(Q);
                        }
                        ml4 d10 = rc9.w0(yu6.r(we.D(jl4, new rz5(1, (sr2) Q))), "Label").d(jl4);
                        i806 = i8010;
                        lh4 d11 = mb0.d(i806, false);
                        int hashCode7 = Long.hashCode(yt22.T);
                        vf5 m7 = yt22.m();
                        ml4 E7 = gw8.E(yt22, d10);
                        yt22.i0();
                        if (!yt22.S) {
                            yt22.l(vy0);
                        } else {
                            yt22.r0();
                        }
                        Q(ckVar2, yt22, d11);
                        Q(ckVar3, yt22, m7);
                        f21.s(hashCode7, yt22, ckVar4, yt22, ceVar);
                        Q(ckVar, yt22, E7);
                        gs29 = gs22;
                        pb4.q((i3 >> 9) & 14, gs29, yt22, true, false);
                    }
                } else {
                    ge74 = ge7;
                }
                z4 = true;
                Q = yt22.Q();
                Q = new fd7(2, (Object) ge74);
                yt22.o0(Q);
                ml4 d102 = rc9.w0(yu6.r(we.D(jl4, new rz5(1, (sr2) Q))), "Label").d(jl4);
                i806 = i8010;
                lh4 d112 = mb0.d(i806, false);
                int hashCode72 = Long.hashCode(yt22.T);
                vf5 m72 = yt22.m();
                ml4 E72 = gw8.E(yt22, d102);
                yt22.i0();
                if (!yt22.S) {
                }
                Q(ckVar2, yt22, d112);
                Q(ckVar3, yt22, m72);
                f21.s(hashCode72, yt22, ckVar4, yt22, ceVar);
                Q(ckVar, yt22, E72);
                gs29 = gs22;
                pb4.q((i3 >> 9) & 14, gs29, yt22, true, false);
            } else {
                gs29 = gs22;
                i806 = i8010;
                yt22.e0(1055190252);
                yt22.r(false);
            }
            if (gs27 != null) {
                yt22.e0(1055238767);
                ml4 J = x91.J(yu6.r(yu6.f(rc9.w0(jl4, "Supporting"), 16.0f, 0.0f, 2)), new pa5(16.0f, 4.0f, 16.0f, 0.0f));
                lh4 d12 = mb0.d(i806, false);
                int hashCode8 = Long.hashCode(yt22.T);
                vf5 m8 = yt22.m();
                ml4 E8 = gw8.E(yt22, J);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                Q(ckVar2, yt22, d12);
                Q(ckVar3, yt22, m8);
                f21.s(hashCode8, yt22, ckVar4, yt22, ceVar);
                Q(ckVar, yt22, E8);
                gs28 = gs27;
                z3 = true;
                pb4.q((i6 >> 15) & 14, gs28, yt22, true, false);
            } else {
                gs28 = gs27;
                z3 = true;
                yt22.e0(1055574156);
                yt22.r(false);
            }
            yt22.r(z3);
        } else {
            gs29 = gs22;
            gs28 = gs27;
            la52 = la5;
            hs22 = hs23;
            yt22 = yt23;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new be7(gs2, hs22, gs29, gs23, gs24, gs25, gs26, z, me7, ge7, ge72, ge73, vr2, fw0, gs28, la52, i, i2);
        }
    }

    public static void b0(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = d0(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = d0(i2, i3, "end index");
            } else {
                str = h75.J("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04df  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x055a  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0619  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x061e  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0623  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x06a9  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x06d3  */
    public static final void c(a37 a37, yd7 yd7, boolean z, boolean z2, boolean z3, boolean z4, mm7 mm7, tg7 tg7, tg7 tg72, hs2 hs2, yt2 yt2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z5;
        long j;
        in8 in8;
        ed5 ed5;
        ee7 ee7;
        im7 im7;
        d63 d63;
        boolean z6;
        ce ceVar;
        boolean z7;
        Object obj;
        je2 je2;
        boolean z8;
        Object Q;
        boolean z9;
        Object Q2;
        float f;
        kf7 kf7;
        boolean z10;
        im7 im72;
        am2 am2;
        am2 am22;
        h60 h60;
        float f2;
        h60 h602;
        float f3;
        lf7 lf7;
        lf7 lf72;
        lq6 lq6;
        lq6 lq62;
        yj5 yj5;
        yj5 yj52;
        mf7 mf7;
        mf7 mf72;
        qj5 qj5;
        qj5 qj52;
        qj5 qj53;
        tg7 tg73;
        boolean z11;
        boolean z12;
        lq6 l;
        boolean z13;
        vr2 vr2;
        long j2;
        lo7 lo7;
        int i12;
        boolean z14;
        Object obj2;
        long j3;
        int i13;
        boolean z15;
        Object Q3;
        jt0 jt0;
        long j4;
        boolean z16;
        Object Q4;
        boolean z17;
        vr2 vr22;
        yd7 yd72 = yd7;
        boolean z18 = z;
        boolean z19 = z2;
        boolean z20 = z3;
        boolean z21 = z4;
        mm7 mm72 = mm7;
        tg7 tg74 = tg7;
        tg7 tg75 = tg72;
        hs2 hs22 = hs2;
        yt2 yt22 = yt2;
        in8 in82 = mm72.a;
        ed5 ed52 = mm72.d;
        ce ceVar2 = ce.M;
        yt22.g0(376119213);
        if (yt22.g(a37)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i14 = i | i2;
        if (yt22.g(yd72)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i15 = i14 | i3;
        if (yt22.h(z18)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i16 = i15 | i4;
        if (yt22.h(z19)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i17 = i16 | i5;
        if (yt22.h(z20)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i18 = i17 | i6;
        if (yt22.h(z21)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i19 = i18 | i7;
        if (yt22.g(mm72)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i20 = i19 | i8;
        if (yt22.g(tg74)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i21 = i20 | i9;
        if (yt22.g(tg75)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i22 = i21 | i10;
        if (yt22.i(hs22)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i23 = i22 | i11;
        if ((i23 & 306783379) != 306783378) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (yt22.V(i23 & 1, z5)) {
            Object Q5 = yt22.Q();
            d63 d632 = ay0.a;
            if (Q5 == d632) {
                Q5 = new Object();
                yt22.o0(Q5);
            }
            ee7 ee72 = (ee7) Q5;
            if (!z18) {
                j = yd72.z;
            } else if (z2) {
                j = yd72.A;
            } else if (z20) {
                j = yd72.x;
            } else {
                j = yd72.y;
            }
            vm4 vm4 = vm4.z;
            if (z21) {
                yt22.e0(-601510006);
                long b2 = tg74.b();
                if (z21 && b2 == 16) {
                    b2 = j;
                }
                long b3 = tg75.b();
                if (z21 && b3 == 16) {
                    b3 = j;
                }
                je2 H = hj8.H(vm4, yt22);
                int i24 = ((i23 >> 18) & 14) | 384;
                yt22.e0(-759924327);
                int[] iArr = fe7.a;
                if (iArr[((vc3) ed52.getValue()).ordinal()] == 1) {
                    j2 = b2;
                } else {
                    j2 = b3;
                }
                yt22.r(false);
                tt0 f4 = jt0.f(j2);
                boolean g = yt22.g(f4);
                Object Q6 = yt22.Q();
                if (g || Q6 == d632) {
                    lo7 lo72 = new lo7(ceVar2, new pb(7, f4));
                    yt22.o0(lo72);
                    Q6 = lo72;
                }
                lo7 lo73 = (lo7) Q6;
                int i25 = (i24 & 14) | 3072;
                if (!mm72.h()) {
                    yt22.e0(1666573488);
                    i12 = i25;
                    if ((((i25 & 14) ^ 6) <= 4 || !yt22.g(mm72)) && (i12 & 6) != 4) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    obj2 = yt22.Q();
                    if (z17 || obj2 == d632) {
                        ix6 h = j45.h();
                        if (h != null) {
                            vr22 = h.e();
                        } else {
                            vr22 = null;
                        }
                        lo7 = lo73;
                        ix6 j5 = j45.j(h);
                        in8 = in82;
                        try {
                            Object H0 = in8.H0();
                            j45.m(h, j5, vr22);
                            yt22.o0(H0);
                            obj2 = H0;
                        } catch (Throwable th) {
                            j45.m(h, j5, vr22);
                            throw th;
                        }
                    } else {
                        lo7 = lo73;
                        in8 = in82;
                    }
                    z14 = false;
                    yt22.r(false);
                } else {
                    i12 = i25;
                    lo7 = lo73;
                    in8 = in82;
                    z14 = false;
                    yt22.e0(1666827533);
                    yt22.r(false);
                    obj2 = in8.H0();
                }
                yt22.e0(-759924327);
                if (iArr[((vc3) obj2).ordinal()] == 1) {
                    j3 = b2;
                } else {
                    j3 = b3;
                }
                yt22.r(z14);
                jt0 jt02 = new jt0(j3);
                int i26 = i12 & 14;
                int i27 = i26 ^ 6;
                if (i27 <= 4 || !yt22.g(mm72)) {
                    i13 = i26;
                    if ((i12 & 6) != 4) {
                        z15 = false;
                        Q3 = yt22.Q();
                        if (z15 || Q3 == d632) {
                            Q3 = u55.i(new wo0(mm72, 14));
                            yt22.o0(Q3);
                        }
                        yt22.e0(-759924327);
                        if (iArr[((vc3) ((a37) Q3).getValue()).ordinal()] != 1) {
                            jt0 = jt02;
                            long j6 = b2;
                            ed5 = ed52;
                            j4 = j6;
                        } else {
                            jt0 = jt02;
                            ed5 = ed52;
                            j4 = b3;
                        }
                        yt22.r(false);
                        jt0 jt03 = new jt0(j4);
                        if ((i27 <= 4 || !yt22.g(mm72)) && (i12 & 6) != 4) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        Q4 = yt22.Q();
                        if (z16 || Q4 == d632) {
                            Q4 = u55.i(new wo0(mm72, 15));
                            yt22.o0(Q4);
                        }
                        gm7 gm7 = (gm7) ((a37) Q4).getValue();
                        yt22.e0(1730286052);
                        z6 = false;
                        yt22.r(false);
                        jt0 jt04 = jt0;
                        ee7 = ee72;
                        d63 = d632;
                        jt0 jt05 = jt03;
                        ceVar = ceVar2;
                        im7 = rc9.F(mm72, jt04, jt05, H, lo7, yt22, i13 | 196608);
                        yt22.r(false);
                    }
                } else {
                    i13 = i26;
                }
                z15 = true;
                Q3 = yt22.Q();
                Q3 = u55.i(new wo0(mm72, 14));
                yt22.o0(Q3);
                yt22.e0(-759924327);
                if (iArr[((vc3) ((a37) Q3).getValue()).ordinal()] != 1) {
                }
                yt22.r(false);
                jt0 jt032 = new jt0(j4);
                if ((i27 <= 4 || !yt22.g(mm72)) && (i12 & 6) != 4) {
                }
                Q4 = yt22.Q();
                Q4 = u55.i(new wo0(mm72, 15));
                yt22.o0(Q4);
                gm7 gm72 = (gm7) ((a37) Q4).getValue();
                yt22.e0(1730286052);
                z6 = false;
                yt22.r(false);
                jt0 jt042 = jt0;
                ee7 = ee72;
                d63 = d632;
                jt0 jt052 = jt032;
                ceVar = ceVar2;
                im7 = rc9.F(mm72, jt042, jt052, H, lo7, yt22, i13 | 196608);
                yt22.r(false);
            } else {
                in8 = in82;
                ed5 = ed52;
                ceVar = ceVar2;
                ee7 = ee72;
                d63 = d632;
                z6 = false;
                yt22.e0(-601031335);
                yt22.r(false);
                im7 = null;
            }
            je2 H2 = hj8.H(vm4, yt22);
            int i28 = ((i23 >> 18) & 14) | 384;
            vc3 vc3 = (vc3) ed5.getValue();
            yt22.e0(1139343725);
            yt22.r(z6);
            tt0 f5 = jt0.f(j);
            boolean g2 = yt22.g(f5);
            Object Q7 = yt22.Q();
            if (g2 || Q7 == d63) {
                lo7 lo74 = new lo7(ceVar, new pb(7, f5));
                yt22.o0(lo74);
                Q7 = lo74;
            }
            lo7 lo75 = (lo7) Q7;
            int i29 = (i28 & 14) | 3072;
            if (!mm72.h()) {
                yt22.e0(1666573488);
                if ((((i29 & 14) ^ 6) <= 4 || !yt22.g(mm72)) && (i29 & 6) != 4) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                obj = yt22.Q();
                if (z13 || obj == d63) {
                    ix6 h2 = j45.h();
                    if (h2 != null) {
                        vr2 = h2.e();
                    } else {
                        vr2 = null;
                    }
                    ix6 j7 = j45.j(h2);
                    try {
                        Object H02 = in8.H0();
                        j45.m(h2, j7, vr2);
                        yt22.o0(H02);
                        obj = H02;
                    } catch (Throwable th2) {
                        j45.m(h2, j7, vr2);
                        throw th2;
                    }
                }
                z7 = false;
                yt22.r(false);
            } else {
                z7 = false;
                yt22.e0(1666827533);
                yt22.r(false);
                obj = in8.H0();
            }
            vc3 vc32 = (vc3) obj;
            yt22.e0(1139343725);
            yt22.r(z7);
            im7 im73 = im7;
            jt0 jt06 = new jt0(j);
            int i30 = i29 & 14;
            int i31 = i30 ^ 6;
            if (i31 <= 4 || !yt22.g(mm72)) {
                je2 = H2;
                if ((i29 & 6) != 4) {
                    z8 = false;
                    Q = yt22.Q();
                    if (z8 || Q == d63) {
                        Q = u55.i(new wo0(mm72, 10));
                        yt22.o0(Q);
                    }
                    vc3 vc33 = (vc3) ((a37) Q).getValue();
                    yt22.e0(1139343725);
                    yt22.r(false);
                    lo7 lo76 = lo75;
                    jt0 jt07 = new jt0(j);
                    if ((i31 <= 4 || !yt22.g(mm72)) && (i29 & 6) != 4) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    Q2 = yt22.Q();
                    if (z9 || Q2 == d63) {
                        Q2 = u55.i(new wo0(mm72, 11));
                        yt22.o0(Q2);
                    }
                    gm7 gm73 = (gm7) ((a37) Q2).getValue();
                    yt22.e0(-1207102280);
                    yt22.r(false);
                    im7 F = rc9.F(mm72, jt06, jt07, je2, lo76, yt22, i30 | 196608);
                    if (a37 == null) {
                        f = ((Number) a37.getValue()).floatValue();
                    } else {
                        f = 1.0f;
                    }
                    yy6 yy6 = tg75.a;
                    yy6 yy62 = tg74.a;
                    kf7 kf72 = zy6.d;
                    kf7 kf73 = yy6.a;
                    kf7 = yy62.a;
                    z10 = kf73 instanceof mc0;
                    kf7 kf74 = jf7.a;
                    if (z10 || (kf7 instanceof mc0)) {
                        im72 = F;
                        if (!z10 || !(kf7 instanceof mc0)) {
                            kf74 = (kf7) zy6.b(kf73, kf7, f);
                        } else {
                            mc0 mc0 = (mc0) kf73;
                            mc0 mc02 = (mc0) kf7;
                            kc0 kc0 = (kc0) zy6.b(mc0.a, mc02.a, f);
                            float E = we.E(mc0.b, mc02.b, f);
                            if (kc0 != null) {
                                if (kc0 instanceof ky6) {
                                    long l2 = o55.l(E, ((ky6) kc0).a);
                                    if (l2 != 16) {
                                        kf74 = new xt0(l2);
                                    }
                                } else if (kc0 instanceof iq6) {
                                    kf74 = new mc0((iq6) kc0, E);
                                } else {
                                    h.c();
                                    return;
                                }
                            }
                        }
                    } else {
                        im72 = F;
                        long F2 = uq3.F(kf73.b(), kf7.b(), f);
                        if (F2 != 16) {
                            kf74 = new xt0(F2);
                        }
                    }
                    kf7 kf75 = kf74;
                    ea7 ea7 = (ea7) zy6.b(yy6.f, yy62.f, f);
                    long c2 = zy6.c(yy6.b, yy62.b, f);
                    am2 = yy6.c;
                    if (am2 == null) {
                        am2 = am2.y;
                    }
                    am22 = yy62.c;
                    if (am22 == null) {
                        am22 = am2.y;
                    }
                    am2 am23 = new am2(z65.p(we.F(f, am2.w, am22.w), 1, 1000));
                    yl2 yl2 = (yl2) zy6.b(yy6.d, yy62.d, f);
                    zl2 zl2 = (zl2) zy6.b(yy6.e, yy62.e, f);
                    String str = (String) zy6.b(yy6.g, yy62.g, f);
                    long c3 = zy6.c(yy6.h, yy62.h, f);
                    h60 = yy6.i;
                    if (h60 == null) {
                        f2 = h60.a;
                    } else {
                        f2 = 0.0f;
                    }
                    h602 = yy62.i;
                    if (h602 == null) {
                        f3 = h602.a;
                    } else {
                        f3 = 0.0f;
                    }
                    float E2 = we.E(f2, f3, f);
                    lf7 = yy6.j;
                    lf7 lf73 = lf7.c;
                    if (lf7 == null) {
                        lf7 = lf73;
                    }
                    lf72 = yy62.j;
                    if (lf72 != null) {
                        lf73 = lf72;
                    }
                    am2 am24 = am23;
                    lf7 lf74 = new lf7(we.E(lf7.a, lf73.a, f), we.E(lf7.b, lf73.b, f));
                    ya4 ya4 = (ya4) zy6.b(yy6.k, yy62.k, f);
                    lf7 lf75 = lf74;
                    long F3 = uq3.F(yy6.l, yy62.l, f);
                    rd7 rd7 = (rd7) zy6.b(yy6.m, yy62.m, f);
                    lq6 = yy6.n;
                    lq6 lq63 = yy62.n;
                    if (lq6 == null || lq63 != null) {
                        if (lq6 != null) {
                            lq63.getClass();
                            l = i35.l(new lq6(jt0.b(0.0f, lq63.a), lq63.b, lq63.c), lq63, f);
                        } else if (lq63 == null) {
                            l = i35.l(lq6, new lq6(jt0.b(0.0f, lq6.a), lq6.b, lq6.c), f);
                        } else {
                            l = i35.l(lq6, lq63, f);
                        }
                        lq62 = l;
                    } else {
                        lq62 = null;
                    }
                    yj5 = yy6.o;
                    yj5 yj53 = yy62.o;
                    if (yj5 == null || yj53 != null) {
                        if (yj5 == null) {
                            yj5 = yj5.a;
                        }
                        yj52 = yj5;
                    } else {
                        yj52 = null;
                    }
                    yy6 yy63 = new yy6(kf75, c2, am24, yl2, zl2, ea7, str, c3, new h60(E2), lf75, ya4, F3, rd7, lq62, yj52, (iz1) zy6.b(yy6.p, yy62.p, f));
                    nc5 nc5 = tg75.b;
                    nc5 nc52 = tg74.b;
                    int i32 = oc5.b;
                    int i33 = ((hc7) zy6.b(new hc7(nc5.a), new hc7(nc52.a), f)).a;
                    int i34 = ((ud7) zy6.b(new ud7(nc5.b), new ud7(nc52.b), f)).a;
                    long c4 = zy6.c(nc5.c, nc52.c, f);
                    mf7 = nc5.d;
                    if (mf7 == null) {
                        mf7 = mf7.c;
                    }
                    mf72 = nc52.d;
                    if (mf72 == null) {
                        mf72 = mf7.c;
                    }
                    im7 im74 = im72;
                    mf7 mf73 = new mf7(zy6.c(mf7.a, mf72.a, f), zy6.c(mf7.b, mf72.b, f));
                    qj5 = nc5.e;
                    qj52 = nc52.e;
                    if (qj5 == null || qj52 != null) {
                        qj5 qj54 = qj5.c;
                        if (qj5 == null) {
                            qj5 = qj54;
                        }
                        z11 = qj5.a;
                        if (qj52 == null) {
                            qj52 = qj54;
                        }
                        z12 = qj52.a;
                        if (z11 != z12) {
                            qj53 = qj5;
                        } else {
                            qj53 = new qj5(((k32) zy6.b(new k32(qj5.b), new k32(qj52.b), f)).a, ((Boolean) zy6.b(Boolean.valueOf(z11), Boolean.valueOf(z12), f)).booleanValue());
                        }
                    } else {
                        qj53 = null;
                    }
                    mf7 mf74 = mf73;
                    tg7 tg76 = new tg7(yy63, new nc5(i33, i34, c4, mf74, qj53, (m64) zy6.b(nc5.f, nc52.f, f), ((g64) zy6.b(new g64(nc5.g), new g64(nc52.g), f)).a, ((i73) zy6.b(new i73(nc5.h), new i73(nc52.h), f)).a, (jg7) zy6.b(nc5.i, nc52.i, f)));
                    if (!z4) {
                        im73.getClass();
                        tg73 = tg7.a(tg76, ((jt0) im73.F.getValue()).a, 0, (am2) null, (ea7) null, 0, 0, (dk5) null, (m64) null, 16777214);
                    } else {
                        tg73 = tg76;
                    }
                    d(((jt0) im74.F.getValue()).a, tg73, su0.J(57043598, new dx4(18, hs22, ee7), yt22), yt2, 384);
                }
            } else {
                je2 = H2;
            }
            z8 = true;
            Q = yt22.Q();
            Q = u55.i(new wo0(mm72, 10));
            yt22.o0(Q);
            vc3 vc332 = (vc3) ((a37) Q).getValue();
            yt22.e0(1139343725);
            yt22.r(false);
            lo7 lo762 = lo75;
            jt0 jt072 = new jt0(j);
            if ((i31 <= 4 || !yt22.g(mm72)) && (i29 & 6) != 4) {
            }
            Q2 = yt22.Q();
            Q2 = u55.i(new wo0(mm72, 11));
            yt22.o0(Q2);
            gm7 gm732 = (gm7) ((a37) Q2).getValue();
            yt22.e0(-1207102280);
            yt22.r(false);
            im7 F4 = rc9.F(mm72, jt06, jt072, je2, lo762, yt22, i30 | 196608);
            if (a37 == null) {
            }
            yy6 yy64 = tg75.a;
            yy6 yy622 = tg74.a;
            kf7 kf722 = zy6.d;
            kf7 kf732 = yy64.a;
            kf7 = yy622.a;
            z10 = kf732 instanceof mc0;
            kf7 kf742 = jf7.a;
            if (z10 || (kf7 instanceof mc0)) {
            }
            kf7 kf752 = kf742;
            ea7 ea72 = (ea7) zy6.b(yy64.f, yy622.f, f);
            long c22 = zy6.c(yy64.b, yy622.b, f);
            am2 = yy64.c;
            if (am2 == null) {
            }
            am22 = yy622.c;
            if (am22 == null) {
            }
            am2 am232 = new am2(z65.p(we.F(f, am2.w, am22.w), 1, 1000));
            yl2 yl22 = (yl2) zy6.b(yy64.d, yy622.d, f);
            zl2 zl22 = (zl2) zy6.b(yy64.e, yy622.e, f);
            String str2 = (String) zy6.b(yy64.g, yy622.g, f);
            long c32 = zy6.c(yy64.h, yy622.h, f);
            h60 = yy64.i;
            if (h60 == null) {
            }
            h602 = yy622.i;
            if (h602 == null) {
            }
            float E22 = we.E(f2, f3, f);
            lf7 = yy64.j;
            lf7 lf732 = lf7.c;
            if (lf7 == null) {
            }
            lf72 = yy622.j;
            if (lf72 != null) {
            }
            am2 am242 = am232;
            lf7 lf742 = new lf7(we.E(lf7.a, lf732.a, f), we.E(lf7.b, lf732.b, f));
            ya4 ya42 = (ya4) zy6.b(yy64.k, yy622.k, f);
            lf7 lf752 = lf742;
            long F32 = uq3.F(yy64.l, yy622.l, f);
            rd7 rd72 = (rd7) zy6.b(yy64.m, yy622.m, f);
            lq6 = yy64.n;
            lq6 lq632 = yy622.n;
            if (lq6 == null) {
            }
            if (lq6 != null) {
            }
            lq62 = l;
            yj5 = yy64.o;
            yj5 yj532 = yy622.o;
            if (yj5 == null) {
            }
            if (yj5 == null) {
            }
            yj52 = yj5;
            yy6 yy632 = new yy6(kf752, c22, am242, yl22, zl22, ea72, str2, c32, new h60(E22), lf752, ya42, F32, rd72, lq62, yj52, (iz1) zy6.b(yy64.p, yy622.p, f));
            nc5 nc53 = tg75.b;
            nc5 nc522 = tg74.b;
            int i322 = oc5.b;
            int i332 = ((hc7) zy6.b(new hc7(nc53.a), new hc7(nc522.a), f)).a;
            int i342 = ((ud7) zy6.b(new ud7(nc53.b), new ud7(nc522.b), f)).a;
            long c42 = zy6.c(nc53.c, nc522.c, f);
            mf7 = nc53.d;
            if (mf7 == null) {
            }
            mf72 = nc522.d;
            if (mf72 == null) {
            }
            im7 im742 = im72;
            mf7 mf732 = new mf7(zy6.c(mf7.a, mf72.a, f), zy6.c(mf7.b, mf72.b, f));
            qj5 = nc53.e;
            qj52 = nc522.e;
            if (qj5 == null) {
            }
            qj5 qj542 = qj5.c;
            if (qj5 == null) {
            }
            z11 = qj5.a;
            if (qj52 == null) {
            }
            z12 = qj52.a;
            if (z11 != z12) {
            }
            mf7 mf742 = mf732;
            tg7 tg762 = new tg7(yy632, new nc5(i332, i342, c42, mf742, qj53, (m64) zy6.b(nc53.f, nc522.f, f), ((g64) zy6.b(new g64(nc53.g), new g64(nc522.g), f)).a, ((i73) zy6.b(new i73(nc53.h), new i73(nc522.h), f)).a, (jg7) zy6.b(nc53.i, nc522.i, f)));
            if (!z4) {
            }
            d(((jt0) im742.F.getValue()).a, tg73, su0.J(57043598, new dx4(18, hs22, ee7), yt22), yt2, 384);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ae7(a37, yd7, z, z2, z3, z4, mm7, tg7, tg72, hs22, i);
        }
    }

    public static void c0(jc9 jc9) {
        String str = ((qb9) jc9).z;
        AtomicReference atomicReference = vb9.a;
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final void d(long j, tg7 tg7, gs2 gs2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        yt2 yt22;
        gs2 gs22;
        tg7 tg72;
        long j2;
        int i4;
        yt2.g0(396611577);
        if (yt2.f(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (yt2.g(tg7)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i & 384) == 0) {
            if (yt2.i(gs2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i6 |= i4;
        }
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i6 & 1, z)) {
            long j3 = j;
            tg7 tg73 = tg7;
            gs2 gs23 = gs2;
            yt22 = yt2;
            a35.a(j3, tg73, gs23, yt22, i6 & 1022);
            j2 = j3;
            tg72 = tg73;
            gs22 = gs23;
        } else {
            j2 = j;
            tg72 = tg7;
            gs22 = gs2;
            yt22 = yt2;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new iu5(j2, tg72, gs22, i, 1);
        }
    }

    public static String d0(int i, int i2, String str) {
        if (i < 0) {
            return h75.J("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return h75.J("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        h.q(hl6.k(i2, "negative size: "));
        return null;
    }

    public static final void e(long j, gs2 gs2, yt2 yt2, int i) {
        int i2;
        int i3;
        boolean z;
        yt2.g0(590397809);
        if (yt2.f(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (yt2.i(gs2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i5 & 1, z)) {
            t49.c(b81.g(j, j41.a), gs2, yt2, (i5 & 112) | 8);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new rp0(j, gs2, i);
        }
    }

    public static void f(Appendable appendable, Object obj, vr2 vr2) {
        boolean z;
        appendable.getClass();
        if (vr2 != null) {
            appendable.append((CharSequence) vr2.y(obj));
            return;
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof CharSequence;
        }
        if (z) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static String g(int i, int i2, String str) {
        if (i < 0) {
            return u55.o("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return u55.o("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void h(boolean z) {
        if (!z) {
            ku4.v();
        }
    }

    public static void i(boolean z, String str, Object obj) {
        if (!z) {
            h.q(u55.o(str, obj));
        }
    }

    public static void j(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = u55.o("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 >= 0) {
                str = u55.o("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void k(ListenableFuture listenableFuture, String str, Object obj) {
        if (listenableFuture == null) {
            ku4.j(u55.o(str, obj));
        }
    }

    public static void l(String str, Object obj) {
        if (obj == null) {
            ku4.j(str);
        }
    }

    public static void m(int i, int i2) {
        if (i < 0 || i > i2) {
            h.l(g(i, i2, "index"));
        }
    }

    public static void n(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = g(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = g(i2, i3, "end index");
            } else {
                str = u55.o("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void o(String str, boolean z) {
        if (!z) {
            h.s(str);
        }
    }

    public static Bundle p(Parcel parcel, int i) {
        int N = N(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + N);
        return readBundle;
    }

    public static byte[] q(Parcel parcel, int i) {
        int N = N(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + N);
        return createByteArray;
    }

    public static byte[][] r(Parcel parcel, int i) {
        int N = N(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + N);
        return bArr;
    }

    public static int[] s(Parcel parcel, int i) {
        int N = N(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + N);
        return createIntArray;
    }

    public static Parcelable t(Parcel parcel, int i, Parcelable.Creator creator) {
        int N = N(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + N);
        return parcelable;
    }

    public static String u(Parcel parcel, int i) {
        int N = N(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + N);
        return readString;
    }

    public static ArrayList v(Parcel parcel, int i) {
        int N = N(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + N);
        return createStringArrayList;
    }

    public static Object[] w(Parcel parcel, int i, Parcelable.Creator creator) {
        int N = N(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + N);
        return createTypedArray;
    }

    public static ArrayList x(Parcel parcel, int i, Parcelable.Creator creator) {
        int N = N(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (N == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + N);
        return createTypedArrayList;
    }

    public static final ly5 y(ll4 ll4, boolean z, boolean z2) {
        if (!ll4.w.J) {
            return ly5.e;
        }
        if (z) {
            return rc9.M0(ll4, 8).y1();
        }
        xz4 M0 = rc9.M0(ll4, 8);
        return t49.I(M0).Q(M0, z2);
    }

    public static void z(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(hl6.p(new StringBuilder(String.valueOf(i).length() + 26), "Overread allowed size end=", i), parcel);
        }
    }

    public abstract void S(boolean z);

    public void R(boolean z) {
    }
}
