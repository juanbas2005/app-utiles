package defpackage;

import java.util.Calendar;
import java.util.Date;

/* renamed from: ak8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ak8 extends us0 {
    public final zj8 y;

    public ak8(td9 td9, int i, zj8 zj8) {
        super(td9, i);
        char c;
        this.y = zj8;
        StringBuilder sb = new StringBuilder("%");
        td9.d(sb);
        if (true != td9.c()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb.append(c);
        sb.append(zj8.w);
    }

    public final void E(j32 j32, Object obj) {
        char c;
        td9 td9 = (td9) this.x;
        StringBuilder sb = (StringBuilder) j32.g;
        boolean z = obj instanceof Date;
        zj8 zj8 = this.y;
        if (z || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder("%");
            td9.d(sb2);
            if (true != td9.c()) {
                c = 't';
            } else {
                c = 'T';
            }
            sb2.append(c);
            sb2.append(zj8.w);
            sb.append(String.format(vd9.a, sb2.toString(), new Object[]{obj}));
            return;
        }
        char c2 = zj8.w;
        StringBuilder sb3 = new StringBuilder(String.valueOf(c2).length() + 2);
        sb3.append("%t");
        sb3.append(c2);
        j32.i(sb, obj, sb3.toString());
    }
}
