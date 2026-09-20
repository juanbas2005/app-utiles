package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: fe8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fe8 {
    public final a96 a;
    public final bq1 b = new bq1(8);
    public final wy7 c = new wy7(2);

    public fe8(a96 a96) {
        this.a = a96;
    }

    public final void a(ua6 ua6, js jsVar) {
        fs fsVar = (fs) jsVar.keySet();
        js jsVar2 = fsVar.w;
        if (!jsVar2.isEmpty()) {
            if (jsVar.y > 999) {
                l55.t(jsVar, new ee8(this, ua6, 0));
                return;
            }
            StringBuilder sb = new StringBuilder("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int i = jsVar2.y;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("?");
                if (i2 < i - 1) {
                    sb.append(",");
                }
            }
            sb.append(")");
            ab6 k0 = ua6.k0(sb.toString());
            Iterator it = fsVar.iterator();
            int i3 = 1;
            while (true) {
                es esVar = (es) it;
                if (!esVar.hasNext()) {
                    break;
                }
                k0.F(i3, (String) esVar.next());
                i3++;
            }
            try {
                k0.getClass();
                int g = u55.g(k0, "work_spec_id");
                if (g != -1) {
                    while (k0.i0()) {
                        List list = (List) jsVar.get(k0.R(g));
                        if (list != null) {
                            byte[] blob = k0.getBlob(0);
                            ce1 ce1 = ce1.b;
                            list.add(r16.D(blob));
                        }
                    }
                    k0.close();
                }
            } finally {
                k0.close();
            }
        }
    }

    public final void b(ua6 ua6, js jsVar) {
        fs fsVar = (fs) jsVar.keySet();
        js jsVar2 = fsVar.w;
        if (!jsVar2.isEmpty()) {
            if (jsVar.y > 999) {
                l55.t(jsVar, new ee8(this, ua6, 1));
                return;
            }
            StringBuilder sb = new StringBuilder("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int i = jsVar2.y;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("?");
                if (i2 < i - 1) {
                    sb.append(",");
                }
            }
            sb.append(")");
            ab6 k0 = ua6.k0(sb.toString());
            Iterator it = fsVar.iterator();
            int i3 = 1;
            while (true) {
                es esVar = (es) it;
                if (!esVar.hasNext()) {
                    break;
                }
                k0.F(i3, (String) esVar.next());
                i3++;
            }
            try {
                k0.getClass();
                int g = u55.g(k0, "work_spec_id");
                if (g != -1) {
                    while (k0.i0()) {
                        List list = (List) jsVar.get(k0.R(g));
                        if (list != null) {
                            list.add(k0.R(0));
                        }
                    }
                    k0.close();
                }
            } finally {
                k0.close();
            }
        }
    }

    public final void c(String str) {
        str.getClass();
        sg3.O(this.a, false, true, new sd8(str, 10));
    }

    public final kd8 d(String str) {
        str.getClass();
        return (kd8) sg3.O(this.a, true, false, new sd8(str, 3));
    }

    public final be8 e(String str) {
        str.getClass();
        return (be8) sg3.O(this.a, true, false, new sd8(str, 2));
    }

    public final List f(String str) {
        str.getClass();
        return (List) sg3.O(this.a, true, false, new sd8(str, 11));
    }

    public final void g(long j, String str) {
        str.getClass();
        ((Number) sg3.O(this.a, false, true, new tk3(2, j, str))).intValue();
    }

    public final void h(int i, String str) {
        str.getClass();
        sg3.O(this.a, false, true, new ia7(i, 1, str));
    }

    public final void i(long j, String str) {
        str.getClass();
        sg3.O(this.a, false, true, new tk3(3, j, str));
    }

    public final void j(kd8 kd8, String str) {
        str.getClass();
        ((Number) sg3.O(this.a, false, true, new k77(21, (Object) kd8, (Object) str))).intValue();
    }

    public final void k(int i, String str) {
        str.getClass();
        sg3.O(this.a, false, true, new ia7(i, str));
    }
}
