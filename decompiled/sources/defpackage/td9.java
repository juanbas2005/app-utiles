package defpackage;

import com.google.android.gms.internal.measurement.zzabo;

/* renamed from: td9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class td9 {
    public static final long d;
    public static final td9 e = new td9(0, -1, -1);
    public final int a;
    public final int b;
    public final int c;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        d = j;
    }

    public td9(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static int e(int i, int i2, String str) {
        if (i != i2) {
            int i3 = i;
            int i4 = 0;
            while (i3 < i2) {
                char charAt = (char) (str.charAt(i3) - '0');
                if (charAt < 10) {
                    i4 = (i4 * 10) + charAt;
                    if (i4 <= 999999) {
                        i3++;
                    } else {
                        throw zzabo.a(i, i2, "precision too large", str);
                    }
                } else {
                    throw zzabo.b(i3, "invalid precision character", str);
                }
            }
            if (i4 != 0) {
                return i4;
            }
            if (i2 == i + 1) {
                return 0;
            }
            throw zzabo.a(i, i2, "invalid precision", str);
        }
        throw zzabo.b(i - 1, "missing precision", str);
    }

    public final boolean a() {
        if (this == e) {
            return true;
        }
        return false;
    }

    public final boolean b(int i, boolean z) {
        int i2;
        if (a()) {
            return true;
        }
        int i3 = ~i;
        int i4 = this.a;
        if ((i3 & i4) != 0) {
            return false;
        }
        if ((!z && this.c != -1) || (i4 & 9) == 9 || (i2 = i4 & 96) == 96) {
            return false;
        }
        if (i2 == 0 || this.b != -1) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if ((this.a & 128) != 0) {
            return true;
        }
        return false;
    }

    public final void d(StringBuilder sb) {
        if (!a()) {
            int i = 0;
            while (true) {
                int i2 = this.a & -129;
                int i3 = 1 << i;
                if (i3 > i2) {
                    break;
                }
                if ((i2 & i3) != 0) {
                    sb.append(" #(+,-0".charAt(i));
                }
                i++;
            }
            int i4 = this.b;
            if (i4 != -1) {
                sb.append(i4);
            }
            int i5 = this.c;
            if (i5 != -1) {
                sb.append('.');
                sb.append(i5);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof td9) {
            td9 td9 = (td9) obj;
            if (td9.a == this.a && td9.b == this.b && td9.c == this.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
