package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: wg0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wg0 {
    public final /* synthetic */ int a = 0;
    public ArrayList b = null;

    public wg0(mu3 mu3) {
    }

    public void a(vg0 vg0) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int i = 0;
        while (true) {
            int size = this.b.size();
            ArrayList arrayList = this.b;
            if (i >= size) {
                arrayList.add(vg0);
                return;
            } else if (((vg0) arrayList.get(i)).a.b > vg0.a.b) {
                this.b.add(i, vg0);
                return;
            } else {
                i++;
            }
        }
    }

    public void b(wg0 wg0) {
        if (wg0.b != null) {
            if (this.b == null) {
                this.b = new ArrayList(wg0.b.size());
            }
            Iterator it = wg0.b.iterator();
            while (it.hasNext()) {
                a((vg0) it.next());
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case b85.b:
                if (this.b == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    sb.append(((vg0) it.next()).toString());
                    sb.append(10);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public wg0() {
    }
}
