package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* renamed from: j32  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class j32 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public Object f;
    public Object g;

    public j32(int[] iArr, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.e = iArr;
                hc9 hc9 = new hc9(-1, -1);
                this.f = hc9;
                this.g = hc9;
                return;
            default:
                this.e = iArr;
                rq8 rq8 = new rq8(-1, -1);
                this.f = rq8;
                this.g = rq8;
                return;
        }
    }

    public static void i(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(vd9.a(obj));
        sb.append("]");
    }

    public void a() {
        this.b = 1;
        this.f = (qk4) this.e;
        this.d = 0;
    }

    public boolean b() {
        ok4 b2 = ((qk4) this.f).b.b();
        int a2 = b2.a(6);
        if ((a2 == 0 || ((ByteBuffer) b2.z).get(a2 + b2.w) == 0) && this.c != 65039) {
            return false;
        }
        return true;
    }

    public void c() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 1:
                if (this.c != 0) {
                    int[] iArr = (int[]) obj;
                    rq8 rq8 = (rq8) ((rq8) this.g).d.get(Integer.valueOf(iArr[this.b]));
                    while (true) {
                        int i2 = (rq8.b - rq8.a) + 1;
                        int i3 = this.c;
                        if (i2 <= i3) {
                            int i4 = this.b + i2;
                            this.b = i4;
                            this.g = rq8;
                            int i5 = i3 - i2;
                            this.c = i5;
                            if (i5 > 0) {
                                rq8 = (rq8) rq8.d.get(Integer.valueOf(iArr[i4]));
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                if (this.c != 0) {
                    int[] iArr2 = (int[]) obj;
                    hc9 hc9 = (hc9) ((hc9) this.g).d.get(Integer.valueOf(iArr2[this.b]));
                    while (true) {
                        int i6 = (hc9.b - hc9.a) + 1;
                        int i7 = this.c;
                        if (i6 <= i7) {
                            int i8 = this.b + i6;
                            this.b = i8;
                            this.g = hc9;
                            int i9 = i7 - i6;
                            this.c = i9;
                            if (i9 > 0) {
                                hc9 = (hc9) hc9.d.get(Integer.valueOf(iArr2[i8]));
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }

    public void d() {
        switch (this.a) {
            case 1:
                rq8 rq8 = ((rq8) this.g).c;
                if (rq8 != null) {
                    this.g = rq8;
                } else {
                    this.g = (rq8) this.f;
                    int i = this.c;
                    if (i > 0) {
                        this.c = i - 1;
                    }
                    if (this.d > 0) {
                        this.b++;
                    }
                }
                c();
                return;
            default:
                hc9 hc9 = ((hc9) this.g).c;
                if (hc9 != null) {
                    this.g = hc9;
                } else {
                    this.g = (hc9) this.f;
                    int i2 = this.c;
                    if (i2 > 0) {
                        this.c = i2 - 1;
                    }
                    if (this.d > 0) {
                        this.b++;
                    }
                }
                c();
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if ((r8 instanceof java.math.BigDecimal) == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        if ((r8 instanceof java.math.BigInteger) == false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a2  */
    public void e(Object obj, sd9 sd9, td9 td9) {
        String str;
        int i;
        td9 td92;
        boolean z;
        StringBuilder sb = (StringBuilder) this.g;
        int i2 = sd9.x;
        String str2 = sd9.z;
        int B = b81.B(i2);
        int i3 = 4;
        int i4 = 1;
        if (B != 0) {
            if (B != 1) {
                if (B != 2) {
                    if (B != 3) {
                        if (B != 4) {
                            throw null;
                        } else if (!(obj instanceof Double)) {
                            if (!(obj instanceof Float)) {
                            }
                        }
                    } else if (!(obj instanceof Integer)) {
                        if (!(obj instanceof Long)) {
                            if (!(obj instanceof Byte)) {
                                if (!(obj instanceof Short)) {
                                }
                            }
                        }
                    }
                } else if (!(obj instanceof Character)) {
                    if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                        z = Character.isValidCodePoint(((Number) obj).intValue());
                    }
                    z = false;
                }
                z = true;
            } else {
                z = obj instanceof Boolean;
            }
            if (!z) {
                i(sb, obj, str2);
                return;
            }
        }
        int ordinal = sd9.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            if (!td9.a()) {
                                int i5 = td9.a;
                                int i6 = i5 & 128;
                                if (i6 == 0) {
                                    td92 = td9.e;
                                } else if (!(i6 == i5 && td9.b == -1 && td9.c == -1)) {
                                    td92 = new td9(i6, -1, -1);
                                }
                                if (td92.equals(td9)) {
                                    Number number = (Number) obj;
                                    Locale locale = vd9.a;
                                    boolean c2 = td9.c();
                                    long longValue = number.longValue();
                                    if (number instanceof Long) {
                                        vd9.b(sb, longValue, c2);
                                        return;
                                    } else if (number instanceof Integer) {
                                        vd9.b(sb, longValue & 4294967295L, c2);
                                        return;
                                    } else if (number instanceof Byte) {
                                        vd9.b(sb, longValue & 255, c2);
                                        return;
                                    } else if (number instanceof Short) {
                                        vd9.b(sb, longValue & 65535, c2);
                                        return;
                                    } else if (number instanceof BigInteger) {
                                        String bigInteger = ((BigInteger) number).toString(16);
                                        if (c2) {
                                            bigInteger = bigInteger.toUpperCase(vd9.a);
                                        }
                                        sb.append(bigInteger);
                                        return;
                                    } else {
                                        h.s("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                        return;
                                    }
                                }
                            }
                            td92 = td9;
                            if (td92.equals(td9)) {
                            }
                        }
                    }
                } else if (td9.a()) {
                    if (obj instanceof Character) {
                        sb.append(obj);
                        return;
                    }
                    int intValue = ((Number) obj).intValue();
                    if ((intValue >>> 16) == 0) {
                        sb.append((char) intValue);
                        return;
                    } else {
                        sb.append(Character.toChars(intValue));
                        return;
                    }
                }
            }
            if (td9.a()) {
                sb.append(obj);
                return;
            }
        } else if (obj instanceof Formattable) {
            Formattable formattable = (Formattable) obj;
            Locale locale2 = vd9.a;
            int i7 = td9.a;
            int i8 = i7 & 162;
            if (i8 != 0) {
                if ((i7 & 32) == 0) {
                    i4 = 0;
                }
                if ((i7 & 128) != 0) {
                    i = 2;
                } else {
                    i = 0;
                }
                if ((i7 & 2) == 0) {
                    i3 = 0;
                }
                i8 = i4 | i | i3;
            }
            int length = sb.length();
            Formatter formatter = new Formatter(sb, vd9.a);
            try {
                formattable.formatTo(formatter, i8, td9.b, td9.c);
                return;
            } catch (RuntimeException e2) {
                sb.setLength(length);
                try {
                    Appendable out = formatter.out();
                    try {
                        str = e2.toString();
                    } catch (RuntimeException e3) {
                        str = e3.getClass().getSimpleName();
                    }
                    out.append(vd9.c(str, formattable));
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
        } else if (td9.a()) {
            sb.append(vd9.a(obj));
            return;
        }
        if (!td9.a()) {
            char c3 = sd9.w;
            if (td9.c()) {
                c3 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            td9.d(sb2);
            sb2.append((char) c3);
            str2 = sb2.toString();
        }
        sb.append(String.format(vd9.a, str2, new Object[]{obj}));
    }

    public void f(rq8 rq8, StringBuilder sb) {
        for (rq8 rq82 : rq8.d.values()) {
            sb.append("  ");
            sb.append(rq8);
            sb.append(" -> ");
            sb.append(rq82);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.e;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, rq82.a, Math.min(iArr.length, rq82.b + 1))));
            sb.append("\"]\n");
            f(rq82, sb);
        }
    }

    public void g(hc9 hc9, StringBuilder sb) {
        for (hc9 hc92 : hc9.d.values()) {
            sb.append("  ");
            sb.append(hc9);
            sb.append(" -> ");
            sb.append(hc92);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.e;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, hc92.a, Math.min(iArr.length, hc92.b + 1))));
            sb.append("\"]\n");
            g(hc92, sb);
        }
    }

    public boolean h(int i, int i2, int i3, int i4) {
        int i5 = this.a;
        Object obj = this.e;
        switch (i5) {
            case 1:
                if (i < 0 || i3 < 0) {
                    return false;
                }
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                int min = Math.min(length, i2);
                if (min - i != Math.min(length, i4) - i3) {
                    return false;
                }
                for (int i6 = i; i6 <= min; i6++) {
                    if (iArr[i6] != iArr[(i3 + i6) - i]) {
                        return false;
                    }
                }
                return true;
            default:
                if (i < 0 || i3 < 0) {
                    return false;
                }
                int[] iArr2 = (int[]) obj;
                int length2 = iArr2.length;
                int min2 = Math.min(length2, i2);
                if (min2 - i != Math.min(length2, i4) - i3) {
                    return false;
                }
                for (int i7 = i; i7 <= min2; i7++) {
                    if (iArr2[i7] != iArr2[(i3 + i7) - i]) {
                        return false;
                    }
                }
                return true;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("digraph {\n");
                f((rq8) this.f, sb);
                sb.append("}");
                return sb.toString();
            case 2:
                StringBuilder sb2 = new StringBuilder("digraph {\n");
                g((hc9) this.f, sb2);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public j32(gj8 gj8, Object[] objArr, StringBuilder sb) {
        this.a = 3;
        this.b = 0;
        this.c = -1;
        jb5.K("context", gj8);
        this.e = gj8;
        this.d = 0;
        this.f = objArr;
        this.g = sb;
    }

    public j32(qk4 qk4) {
        this.a = 0;
        this.b = 1;
        this.e = qk4;
        this.f = qk4;
    }
}
