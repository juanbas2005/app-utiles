package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g98 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                g98 g98 = (g98) arrayList.get(i);
                if (this.e == g98.b) {
                    c(this.c, g98);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(x64 x64, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        h31 h31 = (h31) ((g31) arrayList.get(0)).S;
        x64.t();
        h31.b(x64, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((g31) arrayList.get(i2)).b(x64, false);
        }
        if (i == 0 && h31.y0 > 0) {
            ed1.g(h31, x64, arrayList, 0);
        }
        if (i == 1 && h31.z0 > 0) {
            ed1.g(h31, x64, arrayList, 1);
        }
        try {
            x64.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            g31 g31 = (g31) arrayList.get(i3);
            z53 z53 = new z53(14);
            new WeakReference(g31);
            x64.n(g31.H);
            x64.n(g31.I);
            x64.n(g31.J);
            x64.n(g31.K);
            x64.n(g31.L);
            this.d.add(z53);
        }
        if (i == 0) {
            n = x64.n(h31.H);
            n2 = x64.n(h31.J);
            x64.t();
        } else {
            n = x64.n(h31.I);
            n2 = x64.n(h31.K);
            x64.t();
        }
        return n2 - n;
    }

    public final void c(int i, g98 g98) {
        int i2 = g98.b;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            g31 g31 = (g31) it.next();
            ArrayList arrayList = g98.a;
            if (!arrayList.contains(g31)) {
                arrayList.add(g31);
            }
            if (i == 0) {
                g31.m0 = i2;
            } else {
                g31.n0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String n = hl6.n(sb, this.b, "] <");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            n = n + " " + ((g31) it.next()).g0;
        }
        return n.concat(" >");
    }
}
