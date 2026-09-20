package defpackage;

import java.util.ArrayList;

/* renamed from: rx0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rx0 implements pv3 {
    public final ArrayList w;

    public rx0(int i) {
        switch (i) {
            case 1:
                this.w = new ArrayList();
                return;
            default:
                this.w = new ArrayList();
                return;
        }
    }

    public ov3 a(gq0 gq0) {
        return null;
    }

    public void b(Object obj) {
        if (obj instanceof String) {
            this.w.add((String) obj);
        }
    }

    public void c() {
        i((String[]) this.w.toArray(new String[0]));
    }

    public boolean e(int i, au2 au2, Object obj) {
        ArrayList arrayList = au2.a;
        if (arrayList == null) {
            f(i, au2, (Object) null);
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof st2)) {
                if (!(obj2 instanceof au2)) {
                    ta1.l("Unexpected child source info ", obj2);
                    break;
                } else if (e(i, (au2) obj2, obj)) {
                    f(0, au2, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                f(0, au2, obj2);
                return true;
            }
            i2++;
        }
        return false;
    }

    public void f(int i, au2 au2, Object obj) {
        this.w.add(new sx0(i, (g75) null, (Integer) null));
    }

    public void h(int i, Object obj, au2 au2, Object obj2) {
        if (sg3.e(obj, ay0.a)) {
            f(i, au2, (Object) null);
        }
    }

    public abstract void i(String[] strArr);

    public void g(jq0 jq0) {
    }

    public void d(gq0 gq0, uq4 uq4) {
    }
}
