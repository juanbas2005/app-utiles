package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* renamed from: f1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class f1 {
    public Object a;
    public Object b;

    public f1(yv4 yv4) {
        this.a = new g30(0, this);
        this.b = new f30(this, yv4);
    }

    public void c() {
        to toVar = (to) this.a;
        if (toVar != null) {
            try {
                ((wo) this.b).G.unregisterReceiver(toVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int[] e(int i);

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof g87)) {
            return menuItem;
        }
        g87 g87 = (g87) menuItem;
        if (((zt6) this.b) == null) {
            this.b = new zt6(0);
        }
        MenuItem menuItem2 = (MenuItem) ((zt6) this.b).get(g87);
        if (menuItem2 != null) {
            return menuItem2;
        }
        cj4 cj4 = new cj4((Context) this.a, g87);
        ((zt6) this.b).put(g87, cj4);
        return cj4;
    }

    public int[] h(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String i() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        sg3.a0("text");
        throw null;
    }

    public boolean j() {
        if (!((g30) this.a).b || !((f30) this.b).a()) {
            return false;
        }
        return true;
    }

    public abstract void l();

    public abstract void o();

    public abstract String p();

    public abstract int[] q(int i);

    public void r() {
        c();
        IntentFilter d = d();
        if (d.countActions() != 0) {
            if (((to) this.a) == null) {
                this.a = new to(0, this);
            }
            ((wo) this.b).G.registerReceiver((to) this.a, d);
        }
    }

    public f1(i90 i90) {
        this.a = i90;
        this.b = new wr0(i90);
    }

    public void k() {
    }

    public void n() {
    }

    public f1(Context context) {
        this.a = context;
    }

    public f1() {
        this.b = new int[2];
    }

    public f1(wo woVar) {
        this.b = woVar;
    }

    public void m(e30 e30) {
    }
}
