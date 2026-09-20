package defpackage;

import android.os.Parcel;
import io.ktor.util.date.GMTDate;
import java.util.Iterator;

/* renamed from: zk2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zk2 implements y36 {
    public static final zk2 y = new zk2("NONE", 0);
    public static final zk2 z = new zk2("FULL", 0);
    public final /* synthetic */ int w;
    public final String x;

    public zk2(String str) {
        this.w = 1;
        str.getClass();
        this.x = str;
        if (str.length() <= 0) {
            h.s("Date parser pattern shouldn't be empty.");
            throw null;
        }
    }

    public static void a(kd6 kd6, char c, String str) {
        Object obj;
        if (c == '*') {
            return;
        }
        if (c == 'M') {
            xl4.x.getClass();
            Iterator it = xl4.z.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((xl4) obj).w.equals(str)) {
                    break;
                }
            }
            xl4 xl4 = (xl4) obj;
            if (xl4 != null) {
                kd6.B = xl4;
                return;
            }
            throw new IllegalStateException("Invalid month: ".concat(str).toString());
        } else if (c == 'Y') {
            kd6.C = Integer.valueOf(Integer.parseInt(str));
        } else if (c == 'd') {
            kd6.A = Integer.valueOf(Integer.parseInt(str));
        } else if (c == 'h') {
            kd6.z = Integer.valueOf(Integer.parseInt(str));
        } else if (c == 'm') {
            kd6.y = Integer.valueOf(Integer.parseInt(str));
        } else if (c == 's') {
            kd6.x = Integer.valueOf(Integer.parseInt(str));
        } else if (c != 'z') {
            int i = 0;
            while (i < str.length()) {
                if (str.charAt(i) == c) {
                    i++;
                } else {
                    h.s("Check failed.");
                    return;
                }
            }
        } else if (!str.equals("GMT")) {
            h.s("Check failed.");
        }
    }

    public void accept(Object obj, Object obj2) {
        int i = b49.l;
        t39 t39 = new t39((xb7) obj2);
        d49 d49 = (d49) ((f49) obj).l();
        Parcel I = d49.I();
        ds8.c(I, t39);
        I.writeString(this.x);
        d49.J(I, 5);
    }

    public GMTDate b(String str) {
        kd6 kd6 = new kd6(5, false);
        String str2 = this.x;
        char charAt = str2.charAt(0);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i2 < str2.length()) {
            try {
                if (str2.charAt(i2) == charAt) {
                    i2++;
                } else {
                    int i4 = (i3 + i2) - i;
                    a(kd6, charAt, str.substring(i3, i4));
                    try {
                        charAt = str2.charAt(i2);
                        int i5 = i4;
                        i = i2;
                        i2++;
                        i3 = i5;
                    } catch (Throwable unused) {
                        i3 = i4;
                        StringBuilder sb = new StringBuilder("Failed to parse date string: \"");
                        sb.append(str);
                        sb.append("\" at index ");
                        sb.append(i3);
                        sb.append(". Pattern: \"");
                        throw new IllegalStateException(hl6.o(sb, str2, '\"'));
                    }
                }
            } catch (Throwable unused2) {
                StringBuilder sb2 = new StringBuilder("Failed to parse date string: \"");
                sb2.append(str);
                sb2.append("\" at index ");
                sb2.append(i3);
                sb2.append(". Pattern: \"");
                throw new IllegalStateException(hl6.o(sb2, str2, '\"'));
            }
        }
        if (i3 < str.length()) {
            a(kd6, charAt, str.substring(i3));
        }
        Integer num = (Integer) kd6.x;
        num.getClass();
        int intValue = num.intValue();
        Integer num2 = (Integer) kd6.y;
        num2.getClass();
        int intValue2 = num2.intValue();
        Integer num3 = (Integer) kd6.z;
        num3.getClass();
        int intValue3 = num3.intValue();
        Integer num4 = (Integer) kd6.A;
        num4.getClass();
        int intValue4 = num4.intValue();
        xl4 xl4 = (xl4) kd6.B;
        if (xl4 != null) {
            Integer num5 = (Integer) kd6.C;
            num5.getClass();
            return eg1.a(intValue, intValue2, intValue3, intValue4, xl4, num5.intValue());
        }
        sg3.a0("month");
        throw null;
    }

    public String toString() {
        int i = this.w;
        String str = this.x;
        switch (i) {
            case b85.b:
                return str;
            case 2:
                return f21.l(new StringBuilder("Phase('"), str, "')");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zk2(String str, int i) {
        this.w = i;
        this.x = str;
    }
}
