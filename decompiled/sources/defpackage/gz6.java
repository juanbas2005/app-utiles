package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: gz6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gz6 {
    public int a;
    public int b;
    public final bq2 c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final wq2 l;

    public gz6(int i2, int i3, wq2 wq2) {
        if (i2 == 0) {
            throw null;
        } else if (i3 != 0) {
            bq2 bq2 = wq2.c;
            bq2.getClass();
            if (i2 == 0) {
                throw null;
            } else if (i3 != 0) {
                bq2.getClass();
                this.a = i2;
                this.b = i3;
                this.c = bq2;
                this.d = new ArrayList();
                this.i = true;
                ArrayList arrayList = new ArrayList();
                this.j = arrayList;
                this.k = arrayList;
                this.l = wq2;
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.h = false;
        if (!this.e) {
            this.e = true;
            if (this.j.isEmpty()) {
                b();
                return;
            }
            for (fz6 fz6 : dt0.b1(this.k)) {
                fz6.getClass();
                if (!fz6.b) {
                    fz6.a(viewGroup);
                }
                fz6.b = true;
            }
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (rq2.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.I = false;
        this.l.k();
    }

    public final void c(fz6 fz6) {
        fz6.getClass();
        ArrayList arrayList = this.j;
        if (arrayList.remove(fz6) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i2, int i3) {
        if (i2 == 0) {
            throw null;
        } else if (i3 != 0) {
            int B = b81.B(i3);
            bq2 bq2 = this.c;
            if (B != 0) {
                if (B != 1) {
                    if (B == 2) {
                        if (rq2.L(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + bq2 + " mFinalState = " + hl6.w(this.a) + " -> REMOVED. mLifecycleImpact  = " + hl6.v(this.b) + " to REMOVING.");
                        }
                        this.a = 1;
                        this.b = 3;
                        this.i = true;
                    }
                } else if (this.a == 1) {
                    if (rq2.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + bq2 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + hl6.v(this.b) + " to ADDING.");
                    }
                    this.a = 2;
                    this.b = 2;
                    this.i = true;
                }
            } else if (this.a != 1) {
                if (rq2.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + bq2 + " mFinalState = " + hl6.w(this.a) + " -> " + hl6.w(i2) + '.');
                }
                this.a = i2;
            }
        } else {
            throw null;
        }
    }

    public final String toString() {
        StringBuilder q = b81.q("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        q.append(hl6.w(this.a));
        q.append(" lifecycleImpact = ");
        q.append(hl6.v(this.b));
        q.append(" fragment = ");
        q.append(this.c);
        q.append('}');
        return q.toString();
    }
}
