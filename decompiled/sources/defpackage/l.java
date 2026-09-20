package defpackage;

import com.google.zxing.NotFoundException;

/* renamed from: l  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l extends n {
    public final String c;
    public final String d;

    public l(i90 i90, String str, String str2) {
        super(i90);
        this.c = str2;
        this.d = str;
    }

    public final String p() {
        if (((i90) this.a).x == 84) {
            StringBuilder sb = new StringBuilder();
            s(8, sb);
            w(sb, 48, 20);
            int C = wr0.C(68, 16, (i90) ((wr0) this.b).x);
            if (C != 38400) {
                sb.append('(');
                sb.append(this.c);
                sb.append(')');
                int i = C % 32;
                int i2 = C / 32;
                int i3 = (i2 % 12) + 1;
                int i4 = i2 / 12;
                if (i4 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i4);
                if (i3 / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i3);
                if (i / 10 == 0) {
                    sb.append('0');
                }
                sb.append(i);
            }
            return sb.toString();
        }
        throw NotFoundException.y;
    }

    public final void u(int i, StringBuilder sb) {
        sb.append('(');
        sb.append(this.d);
        sb.append(i / 100000);
        sb.append(')');
    }

    public final int v(int i) {
        return i % 100000;
    }
}
