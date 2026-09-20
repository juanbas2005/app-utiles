package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: eq1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class eq1 implements aq1 {
    public h98 a = null;
    public boolean b = false;
    public boolean c = false;
    public final h98 d;
    public int e = 1;
    public int f;
    public int g;
    public int h = 1;
    public dv1 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public eq1(h98 h98) {
        this.d = h98;
    }

    public final void a(aq1 aq1) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((eq1) it.next()).j) {
                return;
            }
        }
        this.c = true;
        h98 h98 = this.a;
        if (h98 != null) {
            h98.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        eq1 eq1 = null;
        int i2 = 0;
        while (it2.hasNext()) {
            eq1 eq12 = (eq1) it2.next();
            if (!(eq12 instanceof dv1)) {
                i2++;
                eq1 = eq12;
            }
        }
        if (eq1 != null && i2 == 1 && eq1.j) {
            dv1 dv1 = this.i;
            if (dv1 != null) {
                if (dv1.j) {
                    this.f = this.h * dv1.g;
                } else {
                    return;
                }
            }
            d(eq1.g + this.f);
        }
        h98 h982 = this.a;
        if (h982 != null) {
            h982.a(this);
        }
    }

    public final void b(h98 h98) {
        this.k.add(h98);
        if (this.j) {
            h98.a(h98);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i2) {
        if (!this.j) {
            this.j = true;
            this.g = i2;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                aq1 aq1 = (aq1) it.next();
                aq1.a(aq1);
            }
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.g0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        if (this.j) {
            obj = Integer.valueOf(this.g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
