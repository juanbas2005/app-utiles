package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: bc4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bc4 implements y15, o38, c12 {
    public static final float[] A = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    public static final float[] B = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};
    public static final Object y = new Object();
    public static volatile bc4 z;
    public final /* synthetic */ int w;
    public int x;

    public /* synthetic */ bc4(int i, int i2) {
        this.w = i2;
        this.x = i;
    }

    public static bc4 k() {
        bc4 bc4;
        synchronized (y) {
            try {
                if (z == null) {
                    z = new bc4(3, 0);
                }
                bc4 = z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bc4;
    }

    public static String p(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public int b(Context context, String str, boolean z2) {
        return 0;
    }

    public String c() {
        switch (this.w) {
            case 4:
                return hl6.n(new StringBuilder("expected at least "), this.x, " digits");
            default:
                return hl6.n(new StringBuilder("expected at most "), this.x, " digits");
        }
    }

    public void e(String str, String str2) {
        if (this.x <= 3) {
            Log.d(str, str2);
        }
    }

    public int f(Context context, String str) {
        return this.x;
    }

    public void g(String str, String str2, Throwable th) {
        if (this.x <= 3) {
            Log.d(str, str2, th);
        }
    }

    public void h(String str, String str2) {
        if (this.x <= 6) {
            Log.e(str, str2);
        }
    }

    public void i(String str, String str2, Throwable th) {
        if (this.x <= 6) {
            Log.e(str, str2, th);
        }
    }

    public Object l(yr3 yr3, Object obj) {
        ro7 ro7 = (ro7) obj;
        ro7.getClass();
        yr3.getClass();
        return ro7.w.get(this.x);
    }

    public void m(String str, String str2) {
        if (this.x <= 4) {
            Log.i(str, str2);
        }
    }

    public int n() {
        return this.x;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x008a A[EDGE_INSN: B:102:0x008a->B:39:0x008a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0093  */
    public float o(int i, int i2, String str) {
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        float f;
        char charAt;
        boolean z4;
        boolean z5;
        char charAt2;
        int i5 = i;
        int i6 = i2;
        String str2 = str;
        this.x = i5;
        if (i5 >= i6) {
            return Float.NaN;
        }
        char charAt3 = str2.charAt(i5);
        if (charAt3 == '+') {
            z2 = false;
        } else if (charAt3 != '-') {
            z2 = false;
            int i7 = this.x;
            long j = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            z3 = false;
            i3 = 0;
            while (true) {
                i4 = this.x;
                if (i4 >= i6) {
                    break;
                }
                char charAt4 = str2.charAt(i4);
                if (charAt4 == '0') {
                    if (i8 == 0) {
                        i10++;
                    } else {
                        i9++;
                    }
                } else if (charAt4 < '1' || charAt4 > '9') {
                    if (charAt4 != '.' || z3) {
                        break;
                    }
                    i3 = this.x - i7;
                    z3 = true;
                } else {
                    int i11 = i8 + i9;
                    while (i9 > 0) {
                        if (j > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j *= 10;
                        i9--;
                    }
                    if (j > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j = (j * 10) + ((long) (charAt4 - '0'));
                    i8 = i11 + 1;
                    if (j < 0) {
                        return Float.NaN;
                    }
                }
                this.x++;
            }
            if (z3 && this.x == i3 + 1) {
                return Float.NaN;
            }
            if (i8 == 0) {
                if (i10 == 0) {
                    return Float.NaN;
                }
                i8 = 1;
            }
            if (z3) {
                i9 = (i3 - i10) - i8;
            }
            int i12 = this.x;
            if (i12 < i6 && ((charAt = str2.charAt(i12)) == 'E' || charAt == 'e')) {
                int i13 = this.x + 1;
                this.x = i13;
                if (i13 == i6) {
                    return Float.NaN;
                }
                char charAt5 = str2.charAt(i13);
                if (charAt5 == '+') {
                    z5 = false;
                    this.x++;
                } else if (charAt5 != '-') {
                    switch (charAt5) {
                        case h75.h /*48*/:
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            z5 = false;
                            break;
                        default:
                            this.x--;
                            z4 = true;
                            z5 = false;
                            break;
                    }
                } else {
                    z5 = true;
                    this.x++;
                }
                z4 = false;
                if (!z4) {
                    int i14 = this.x;
                    int i15 = 0;
                    while (true) {
                        int i16 = this.x;
                        if (i16 < i6 && (charAt2 = str2.charAt(i16)) >= '0' && charAt2 <= '9') {
                            if (((long) i15) > 922337203685477580L) {
                                return Float.NaN;
                            }
                            i15 = (i15 * 10) + (charAt2 - '0');
                            this.x++;
                        }
                    }
                    if (this.x == i14) {
                        return Float.NaN;
                    }
                    if (z5) {
                        i9 -= i15;
                    } else {
                        i9 += i15;
                    }
                }
            }
            int i17 = i8 + i9;
            if (i17 > 39 || i17 < -44) {
                return Float.NaN;
            }
            float f2 = (float) j;
            if (j != 0) {
                if (i9 > 0) {
                    f = A[i9];
                } else if (i9 < 0) {
                    if (i9 < -38) {
                        f2 = (float) (((double) f2) * 1.0E-20d);
                        i9 += 20;
                    }
                    f = B[-i9];
                }
                f2 *= f;
            }
            if (z2) {
                return -f2;
            }
            return f2;
        } else {
            z2 = true;
        }
        this.x++;
        int i72 = this.x;
        long j2 = 0;
        int i82 = 0;
        int i92 = 0;
        int i102 = 0;
        z3 = false;
        i3 = 0;
        while (true) {
            i4 = this.x;
            if (i4 >= i6) {
            }
            this.x++;
        }
        if (z3 || this.x == i3 + 1) {
        }
    }

    public void q(String str, String str2) {
        if (this.x <= 5) {
            Log.w(str, str2);
        }
    }

    public int r() {
        return 0;
    }

    public ol t(long j, ol olVar, ol olVar2, ol olVar3) {
        if (j < ((long) this.x) * 1000000) {
            return olVar;
        }
        return olVar2;
    }

    public /* synthetic */ bc4() {
        this.w = 1;
    }

    public ol j(long j, ol olVar, ol olVar2, ol olVar3) {
        return olVar3;
    }
}
