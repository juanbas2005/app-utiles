package defpackage;

import android.util.Log;
import com.google.android.gms.internal.measurement.zzabo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* renamed from: qj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qj8 extends f76 {
    public static final Set f;
    public static final zd9 g;
    public static final oj8 h;
    public final String b;
    public final Level c;
    public final Set d;
    public final zd9 e;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new id9[]{xc9.a, qd9.b, rd9.a})));
        f = unmodifiableSet;
        zd9 zd9 = new zd9(hj8.I(unmodifiableSet));
        g = zd9;
        h = new oj8(Level.ALL, unmodifiableSet, zd9);
    }

    public /* synthetic */ qj8(String str, Level level, Set set, zd9 zd9) {
        super(str);
        this.b = fb5.w(str);
        this.c = level;
        this.d = set;
        this.e = zd9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:147:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x02a6 A[SYNTHETIC] */
    public static void d(uc9 uc9, String str, Level level, Set set, zd9 zd9) {
        cj8 cj8;
        boolean z;
        Level level2;
        String str2;
        int x;
        cj8 cj82;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        String str3;
        char c2;
        cj8 cj83;
        td9 td9;
        sd9 sd9;
        ak8 ak8;
        int i2;
        Object[] objArr;
        int i3;
        us0 us0;
        boolean z6;
        int i4;
        boolean z7;
        cj8 de9;
        uc9 uc92 = uc9;
        b85 d2 = uc92.d();
        Level level3 = uc92.a;
        Boolean bool = (Boolean) d2.A(rd9.a);
        if (bool == null || !bool.booleanValue()) {
            ((ij8) dj8.a).getClass();
            b85 c3 = nj8.b.c();
            b85 d3 = uc92.d();
            int w = d3.w();
            if (w == 0) {
                cj8 = cj8.a;
            } else {
                if (w <= 28) {
                    de9 = new ce9(c3, d3);
                } else {
                    de9 = new de9(c3, d3);
                }
                cj8 = de9;
            }
            if (level3.intValue() < level.intValue()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int i5 = fj8.a;
                if (uc92.f == null && cj8.b() <= set.size()) {
                    if (set.containsAll(cj8.c())) {
                        if (uc92.f == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            Object[] objArr2 = uc92.g;
                            if (objArr2 != null) {
                                str2 = vd9.a(objArr2[0]);
                                level2 = level3;
                                Throwable th = (Throwable) uc92.d().A(xc9.a);
                                x = fb5.x(level2);
                                if (x != 2) {
                                    Log.v(str, str2, th);
                                    return;
                                } else if (x == 3) {
                                    Log.d(str, str2, th);
                                    return;
                                } else if (x == 4) {
                                    Log.i(str, str2, th);
                                    return;
                                } else if (x != 5) {
                                    Log.e(str, str2, th);
                                    return;
                                } else {
                                    Log.w(str, str2, th);
                                    return;
                                }
                            } else {
                                h.s("cannot get literal argument before calling log()");
                                return;
                            }
                        } else {
                            h.s("cannot get literal argument if a template context exists");
                            return;
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            fd9 fd9 = uc92.d;
            if (fd9 != null) {
                if (t75.N(2, fd9, sb)) {
                    sb.append(" ");
                }
                if (!z || uc92.f == null) {
                    gj8 gj8 = uc92.f;
                    if (gj8 != null) {
                        if (gj8 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String str4 = "cannot get arguments unless a template context exists";
                        if (z3) {
                            Object[] objArr3 = uc92.g;
                            String str5 = "cannot get arguments before calling log()";
                            if (objArr3 != null) {
                                j32 j32 = new j32(gj8, objArr3, sb);
                                StringBuilder sb2 = (StringBuilder) j32.g;
                                gj8 gj82 = (gj8) j32.e;
                                dk8 dk8 = gj82.a;
                                String str6 = gj82.b;
                                dk8.getClass();
                                int b2 = ek8.b(0, str6);
                                int i6 = -1;
                                int i7 = 0;
                                while (b2 >= 0) {
                                    int i8 = 3;
                                    int i9 = b2 + 1;
                                    int i10 = i9;
                                    int i11 = 0;
                                    while (i10 < str6.length()) {
                                        int i12 = i10 + 1;
                                        Level level4 = level3;
                                        char charAt = str6.charAt(i10);
                                        int i13 = i10;
                                        char c4 = (char) (charAt - '0');
                                        String str7 = str4;
                                        if (c4 < 10) {
                                            int i14 = (i11 * 10) + c4;
                                            if (i14 < 1000000) {
                                                i11 = i14;
                                                i10 = i12;
                                                level3 = level4;
                                                str4 = str7;
                                            } else {
                                                throw zzabo.a(b2, i12, "index too large", str6);
                                            }
                                        } else {
                                            if (charAt != '$') {
                                                i = -1;
                                                if (charAt != '<') {
                                                    i6 = i7;
                                                    i7++;
                                                } else if (i6 == -1) {
                                                    throw zzabo.a(b2, i12, "invalid relative parameter", str6);
                                                } else if (i12 != str6.length()) {
                                                    str6.charAt(i12);
                                                    i9 = i12;
                                                    i12 = i13 + 2;
                                                } else {
                                                    throw new RuntimeException(zzabo.c(b2, -1, "unterminated parameter", str6));
                                                }
                                            } else if (i13 - i9 == 0) {
                                                throw zzabo.a(b2, i12, "missing index", str6);
                                            } else if (str6.charAt(i9) != '0') {
                                                int i15 = i11 - 1;
                                                if (i12 != str6.length()) {
                                                    str6.charAt(i12);
                                                    i9 = i12;
                                                    i12 = i13 + 2;
                                                    i6 = i15;
                                                    i = -1;
                                                } else {
                                                    throw new RuntimeException(zzabo.c(b2, -1, "unterminated parameter", str6));
                                                }
                                            } else {
                                                throw zzabo.a(b2, i12, "index has leading zero", str6);
                                            }
                                            int i16 = i12 + i;
                                            while (i16 < str6.length()) {
                                                if (((char) ((str6.charAt(i16) & 65503) - 'A')) < 26) {
                                                    char charAt2 = str6.charAt(i16);
                                                    char c5 = charAt2 & ' ';
                                                    if (c5 == 0) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    td9 td92 = td9.e;
                                                    if (i9 != i16 || z5) {
                                                        if (true != z5) {
                                                            i4 = 0;
                                                        } else {
                                                            i4 = 128;
                                                        }
                                                        while (i9 != i16) {
                                                            int i17 = i9 + 1;
                                                            c2 = c5;
                                                            char charAt3 = str6.charAt(i9);
                                                            str3 = str5;
                                                            if (charAt3 < ' ' || charAt3 > '0') {
                                                                cj83 = cj8;
                                                                if (charAt3 <= '9') {
                                                                    int i18 = charAt3 - '0';
                                                                    while (true) {
                                                                        if (i17 == i16) {
                                                                            td9 = new td9(i4, i18, -1);
                                                                            break;
                                                                        }
                                                                        int i19 = i17 + 1;
                                                                        char charAt4 = str6.charAt(i17);
                                                                        if (charAt4 == '.') {
                                                                            td9 = new td9(i4, i18, td9.e(i19, i16, str6));
                                                                            break;
                                                                        }
                                                                        char c6 = (char) (charAt4 - '0');
                                                                        if (c6 < 10) {
                                                                            i18 = (i18 * 10) + c6;
                                                                            if (i18 <= 999999) {
                                                                                i17 = i19;
                                                                                i8 = 3;
                                                                            } else {
                                                                                throw zzabo.a(i9, i16, "width too large", str6);
                                                                            }
                                                                        } else {
                                                                            throw zzabo.b(i17, "invalid width character", str6);
                                                                        }
                                                                    }
                                                                    sd9 = sd9.B[(charAt2 | ' ') - 'a'];
                                                                    if (c2 == 0 && (sd9 == null || (sd9.y & 128) == 0)) {
                                                                        sd9 = null;
                                                                    }
                                                                    int i20 = i16 + 1;
                                                                    if (sd9 != null) {
                                                                        td9.getClass();
                                                                        int i21 = sd9.y;
                                                                        int i22 = sd9.x;
                                                                        if (i22 != 1) {
                                                                            if (i22 == 2 || i22 == i8 || i22 == 4) {
                                                                                z6 = false;
                                                                                if (!td9.b(i21, z6)) {
                                                                                    if (i6 < 10) {
                                                                                        Map map = bk8.z;
                                                                                        if (td9.a()) {
                                                                                            us0[] us0Arr = (bk8[]) bk8.z.get(sd9);
                                                                                            jb5.K("default parameter", us0Arr);
                                                                                            ak8 = us0Arr[i6];
                                                                                            i2 = ak8.w;
                                                                                            if (i2 < 32) {
                                                                                                j32.b |= 1 << i2;
                                                                                            }
                                                                                            j32.c = Math.max(j32.c, i2);
                                                                                            ek8.a(j32.d, b2, str6, sb2);
                                                                                            objArr = (Object[]) j32.f;
                                                                                            i3 = ak8.w;
                                                                                            if (i3 < objArr.length) {
                                                                                                Object obj = objArr[i3];
                                                                                                if (obj != null) {
                                                                                                    ak8.E(j32, obj);
                                                                                                } else {
                                                                                                    sb2.append("null");
                                                                                                }
                                                                                            } else {
                                                                                                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                                                                                            }
                                                                                            j32.d = i20;
                                                                                            b2 = ek8.b(i20, str6);
                                                                                            cj8 = cj83;
                                                                                            level3 = level4;
                                                                                            str4 = str7;
                                                                                            str5 = str3;
                                                                                        }
                                                                                    }
                                                                                    us0 = new bk8(i6, sd9, td9);
                                                                                } else {
                                                                                    throw zzabo.a(b2, i20, "invalid format specifier", str6);
                                                                                }
                                                                            } else if (i22 != 5) {
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        z6 = true;
                                                                        if (!td9.b(i21, z6)) {
                                                                        }
                                                                    } else if (charAt2 == 't' || charAt2 == 'T') {
                                                                        if (td9.b(160, false)) {
                                                                            int i23 = i16 + 2;
                                                                            if (i23 <= str6.length()) {
                                                                                zj8 zj8 = (zj8) zj8.x.get(Character.valueOf(str6.charAt(i20)));
                                                                                if (zj8 != null) {
                                                                                    ak8 = new ak8(td9, i6, zj8);
                                                                                    i20 = i23;
                                                                                    i2 = ak8.w;
                                                                                    if (i2 < 32) {
                                                                                    }
                                                                                    j32.c = Math.max(j32.c, i2);
                                                                                    ek8.a(j32.d, b2, str6, sb2);
                                                                                    objArr = (Object[]) j32.f;
                                                                                    i3 = ak8.w;
                                                                                    if (i3 < objArr.length) {
                                                                                    }
                                                                                    j32.d = i20;
                                                                                    b2 = ek8.b(i20, str6);
                                                                                    cj8 = cj83;
                                                                                    level3 = level4;
                                                                                    str4 = str7;
                                                                                    str5 = str3;
                                                                                } else {
                                                                                    throw zzabo.b(i20, "illegal date/time conversion", str6);
                                                                                }
                                                                            } else {
                                                                                throw zzabo.b(b2, "truncated format specifier", str6);
                                                                            }
                                                                        } else {
                                                                            throw zzabo.a(b2, i20, "invalid format specification", str6);
                                                                        }
                                                                    } else if (charAt2 != 'h' && charAt2 != 'H') {
                                                                        throw zzabo.a(b2, i20, "invalid format specification", str6);
                                                                    } else if (td9.b(160, false)) {
                                                                        us0 = new us0(td9, i6);
                                                                    } else {
                                                                        throw zzabo.a(b2, i20, "invalid format specification", str6);
                                                                    }
                                                                    ak8 = us0;
                                                                    i2 = ak8.w;
                                                                    if (i2 < 32) {
                                                                    }
                                                                    j32.c = Math.max(j32.c, i2);
                                                                    ek8.a(j32.d, b2, str6, sb2);
                                                                    objArr = (Object[]) j32.f;
                                                                    i3 = ak8.w;
                                                                    if (i3 < objArr.length) {
                                                                    }
                                                                    j32.d = i20;
                                                                    b2 = ek8.b(i20, str6);
                                                                    cj8 = cj83;
                                                                    level3 = level4;
                                                                    str4 = str7;
                                                                    str5 = str3;
                                                                } else {
                                                                    throw zzabo.b(i9, "invalid flag", str6);
                                                                }
                                                            } else {
                                                                cj83 = cj8;
                                                                int i24 = ((int) ((td9.d >>> ((charAt3 - ' ') * 3)) & 7)) - 1;
                                                                if (i24 >= 0) {
                                                                    int i25 = 1 << i24;
                                                                    if ((i4 & i25) == 0) {
                                                                        i4 |= i25;
                                                                        i9 = i17;
                                                                        cj8 = cj83;
                                                                        c5 = c2;
                                                                        str5 = str3;
                                                                    } else {
                                                                        throw zzabo.b(i9, "repeated flag", str6);
                                                                    }
                                                                } else if (charAt3 == '.') {
                                                                    td9 = new td9(i4, -1, td9.e(i17, i16, str6));
                                                                    sd9 = sd9.B[(charAt2 | ' ') - 'a'];
                                                                    sd9 = null;
                                                                    int i202 = i16 + 1;
                                                                    if (sd9 != null) {
                                                                    }
                                                                    ak8 = us0;
                                                                    i2 = ak8.w;
                                                                    if (i2 < 32) {
                                                                    }
                                                                    j32.c = Math.max(j32.c, i2);
                                                                    ek8.a(j32.d, b2, str6, sb2);
                                                                    objArr = (Object[]) j32.f;
                                                                    i3 = ak8.w;
                                                                    if (i3 < objArr.length) {
                                                                    }
                                                                    j32.d = i202;
                                                                    b2 = ek8.b(i202, str6);
                                                                    cj8 = cj83;
                                                                    level3 = level4;
                                                                    str4 = str7;
                                                                    str5 = str3;
                                                                } else {
                                                                    throw zzabo.b(i9, "invalid flag", str6);
                                                                }
                                                            }
                                                        }
                                                        td9 = new td9(i4, -1, -1);
                                                    } else {
                                                        td9 = td9.e;
                                                    }
                                                    cj83 = cj8;
                                                    c2 = c5;
                                                    str3 = str5;
                                                    sd9 = sd9.B[(charAt2 | ' ') - 'a'];
                                                    sd9 = null;
                                                    int i2022 = i16 + 1;
                                                    if (sd9 != null) {
                                                    }
                                                    ak8 = us0;
                                                    i2 = ak8.w;
                                                    if (i2 < 32) {
                                                    }
                                                    j32.c = Math.max(j32.c, i2);
                                                    ek8.a(j32.d, b2, str6, sb2);
                                                    objArr = (Object[]) j32.f;
                                                    i3 = ak8.w;
                                                    if (i3 < objArr.length) {
                                                    }
                                                    j32.d = i2022;
                                                    b2 = ek8.b(i2022, str6);
                                                    cj8 = cj83;
                                                    level3 = level4;
                                                    str4 = str7;
                                                    str5 = str3;
                                                } else {
                                                    cj8 cj84 = cj8;
                                                    i16++;
                                                    str5 = str5;
                                                    i8 = 3;
                                                }
                                            }
                                            throw new RuntimeException(zzabo.c(b2, -1, "unterminated parameter", str6));
                                        }
                                    }
                                    throw new RuntimeException(zzabo.c(b2, -1, "unterminated parameter", str6));
                                }
                                cj82 = cj8;
                                level2 = level3;
                                String str8 = str4;
                                String str9 = str5;
                                int i26 = j32.b;
                                if (((i26 + 1) & i26) != 0 || (j32.c > 31 && i26 != -1)) {
                                    throw new RuntimeException(String.format("unreferenced arguments [first missing index=%d]", new Object[]{Integer.valueOf(Integer.numberOfTrailingZeros(~i26))}));
                                }
                                ek8.a(j32.d, str6.length(), str6, sb2);
                                if (uc92.f != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    Object[] objArr4 = uc92.g;
                                    if (objArr4 == null) {
                                        h.s(str9);
                                        return;
                                    } else if (objArr4.length > j32.c + 1) {
                                        sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                                    }
                                } else {
                                    h.s(str8);
                                    return;
                                }
                            } else {
                                h.s(str5);
                                return;
                            }
                        } else {
                            h.s(str4);
                            return;
                        }
                    } else {
                        cj82 = cj8;
                        level2 = level3;
                        if (gj8 == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            Object[] objArr5 = uc92.g;
                            if (objArr5 != null) {
                                sb.append(vd9.a(objArr5[0]));
                            } else {
                                h.s("cannot get literal argument before calling log()");
                                return;
                            }
                        } else {
                            h.s("cannot get literal argument if a template context exists");
                            return;
                        }
                    }
                    int i27 = fj8.a;
                    ud9 ud9 = new ud9(sb);
                    cj82.a(zd9, ud9);
                    if (ud9.b) {
                        sb.append(" ]");
                    }
                } else {
                    sb.append("(REDACTED) ");
                    sb.append(uc92.f.b);
                    level2 = level3;
                }
                str2 = sb.toString();
                Throwable th2 = (Throwable) uc92.d().A(xc9.a);
                x = fb5.x(level2);
                if (x != 2) {
                }
            } else {
                h.s("cannot request log site information prior to postProcess()");
            }
        }
    }

    public final boolean a(Level level) {
        int x = fb5.x(level);
        if (Log.isLoggable(this.b, x) || Log.isLoggable("all", x)) {
            return true;
        }
        return false;
    }

    public final void b(uc9 uc9) {
        d(uc9, this.b, this.c, this.d, this.e);
    }
}
