package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yg0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yg0 {
    public final int a = 0;
    public final String b = null;
    public ArrayList c = null;
    public ArrayList d = null;

    public yg0(int i, String str) {
        this.a = i == 0 ? 1 : i;
        this.b = str;
    }

    public final void a(int i, String str, String str2) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(new lg0(str, i, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.a;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.b;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lg0 lg0 = (lg0) it.next();
                sb.append('[');
                String str2 = lg0.a;
                String str3 = lg0.c;
                sb.append(str2);
                int B = b81.B(lg0.b);
                if (B == 1) {
                    sb.append('=');
                    sb.append(str3);
                } else if (B == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (B == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList arrayList2 = this.d;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                sb.append(':');
                sb.append((og0) it2.next());
            }
        }
        return sb.toString();
    }
}
