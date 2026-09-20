package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: vy  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vy extends km7 {
    public ArrayList Y;
    public boolean Z;
    public int a0;
    public boolean b0;
    public int c0;

    public final void A(View view) {
        super.A(view);
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            ((km7) this.Y.get(i)).A(view);
        }
    }

    public final void B() {
        ArrayList arrayList;
        if (this.Y.isEmpty()) {
            J();
            m();
            return;
        }
        um7 um7 = new um7();
        um7.b = this;
        Iterator it = this.Y.iterator();
        while (it.hasNext()) {
            ((km7) it.next()).a(um7);
        }
        this.a0 = this.Y.size();
        if (!this.Z) {
            int i = 1;
            while (true) {
                int size = this.Y.size();
                arrayList = this.Y;
                if (i >= size) {
                    break;
                }
                ((km7) arrayList.get(i - 1)).a(new um7((km7) this.Y.get(i), 2));
                i++;
            }
            km7 km7 = (km7) arrayList.get(0);
            if (km7 != null) {
                km7.B();
                return;
            }
            return;
        }
        Iterator it2 = this.Y.iterator();
        while (it2.hasNext()) {
            ((km7) it2.next()).B();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    public final void C(long j, long j2) {
        boolean z;
        long j3;
        long j4 = j;
        long j5 = j2;
        long j6 = this.S;
        long j7 = 0;
        if (this.E != null) {
            if (j4 < 0 && j5 < 0) {
                return;
            }
            if (j4 > j6 && j5 > j6) {
                return;
            }
        }
        int i = (j4 > j5 ? 1 : (j4 == j5 ? 0 : -1));
        if (i < 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if ((i2 >= 0 && j5 < 0) || (j4 <= j6 && j5 > j6)) {
            this.N = false;
            w(this, kj6.x, z);
        }
        if (this.Z) {
            for (int i3 = 0; i3 < this.Y.size(); i3++) {
                ((km7) this.Y.get(i3)).C(j4, j5);
            }
        } else {
            int i4 = 1;
            while (true) {
                int size = this.Y.size();
                ArrayList arrayList = this.Y;
                if (i4 >= size) {
                    i4 = arrayList.size();
                    break;
                } else if (((km7) arrayList.get(i4)).T > j5) {
                    break;
                } else {
                    i4++;
                }
            }
            int i5 = i4 - 1;
            if (i >= 0) {
                while (true) {
                    if (i5 >= this.Y.size()) {
                        break;
                    }
                    km7 km7 = (km7) this.Y.get(i5);
                    long j8 = km7.T;
                    j3 = j7;
                    long j9 = j4 - j8;
                    if (j9 < j3) {
                        break;
                    }
                    km7.C(j9, j5 - j8);
                    i5++;
                    j7 = j3;
                }
            } else {
                j3 = 0;
                while (i5 >= 0) {
                    km7 km72 = (km7) this.Y.get(i5);
                    long j10 = km72.T;
                    long j11 = j4 - j10;
                    km72.C(j11, j5 - j10);
                    if (j11 >= 0) {
                        break;
                    }
                    i5--;
                }
            }
            if (this.E == null) {
                int i6 = (j4 > j6 ? 1 : (j4 == j6 ? 0 : -1));
                if ((i6 > 0 && j5 <= j6) || (i2 < 0 && j5 >= j3)) {
                    if (i6 > 0) {
                        this.N = true;
                    }
                    w(this, kj6.y, z);
                    return;
                }
                return;
            }
            return;
        }
        j3 = j7;
        if (this.E == null) {
        }
    }

    public final void D(long j) {
        ArrayList arrayList;
        this.y = j;
        if (j >= 0 && (arrayList = this.Y) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((km7) this.Y.get(i)).D(j);
            }
        }
    }

    public final void E(u55 u55) {
        this.c0 |= 8;
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            ((km7) this.Y.get(i)).E(u55);
        }
    }

    public final void F(TimeInterpolator timeInterpolator) {
        this.c0 |= 1;
        ArrayList arrayList = this.Y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((km7) this.Y.get(i)).F(timeInterpolator);
            }
        }
        this.z = timeInterpolator;
    }

    public final void G(z53 z53) {
        super.G(z53);
        this.c0 |= 4;
        if (this.Y != null) {
            for (int i = 0; i < this.Y.size(); i++) {
                ((km7) this.Y.get(i)).G(z53);
            }
        }
    }

    public final void H() {
        this.c0 |= 2;
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            ((km7) this.Y.get(i)).H();
        }
    }

    public final void I(long j) {
        this.x = j;
    }

    public final String K(String str) {
        String K = super.K(str);
        for (int i = 0; i < this.Y.size(); i++) {
            K = K + "\n" + ((km7) this.Y.get(i)).K(str.concat("  "));
        }
        return K;
    }

    public final void L(km7 km7) {
        this.Y.add(km7);
        km7.E = this;
        long j = this.y;
        if (j >= 0) {
            km7.D(j);
        }
        if ((this.c0 & 1) != 0) {
            km7.F(this.z);
        }
        if ((this.c0 & 2) != 0) {
            km7.H();
        }
        if ((this.c0 & 4) != 0) {
            km7.G(this.R);
        }
        if ((this.c0 & 8) != 0) {
            km7.E((u55) null);
        }
    }

    public final void c() {
        super.c();
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            ((km7) this.Y.get(i)).c();
        }
    }

    public final void d(xm7 xm7) {
        View view = xm7.b;
        if (u(view)) {
            Iterator it = this.Y.iterator();
            while (it.hasNext()) {
                km7 km7 = (km7) it.next();
                if (km7.u(view)) {
                    km7.d(xm7);
                    xm7.c.add(km7);
                }
            }
        }
    }

    public final void f(xm7 xm7) {
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            ((km7) this.Y.get(i)).f(xm7);
        }
    }

    public final void g(xm7 xm7) {
        View view = xm7.b;
        if (u(view)) {
            Iterator it = this.Y.iterator();
            while (it.hasNext()) {
                km7 km7 = (km7) it.next();
                if (km7.u(view)) {
                    km7.g(xm7);
                    xm7.c.add(km7);
                }
            }
        }
    }

    /* renamed from: j */
    public final km7 clone() {
        vy vyVar = (vy) super.clone();
        vyVar.Y = new ArrayList();
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            km7 j = ((km7) this.Y.get(i)).clone();
            vyVar.Y.add(j);
            j.E = vyVar;
        }
        return vyVar;
    }

    public final void l(ViewGroup viewGroup, am6 am6, am6 am62, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.x;
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            km7 km7 = (km7) this.Y.get(i);
            if (j > 0 && (this.Z || i == 0)) {
                long j2 = km7.x;
                if (j2 > 0) {
                    km7.I(j2 + j);
                } else {
                    km7.I(j);
                }
            }
            km7.l(viewGroup, am6, am62, arrayList, arrayList2);
        }
    }

    public final boolean s() {
        for (int i = 0; i < this.Y.size(); i++) {
            if (((km7) this.Y.get(i)).s()) {
                return true;
            }
        }
        return false;
    }

    public final void x(View view) {
        super.x(view);
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            ((km7) this.Y.get(i)).x(view);
        }
    }

    public final void y() {
        this.S = 0;
        um7 um7 = new um7(this, 0);
        for (int i = 0; i < this.Y.size(); i++) {
            km7 km7 = (km7) this.Y.get(i);
            km7.a(um7);
            km7.y();
            long j = km7.S;
            boolean z = this.Z;
            long j2 = this.S;
            if (z) {
                this.S = Math.max(j2, j);
            } else {
                km7.T = j2;
                this.S = j2 + j;
            }
        }
    }

    public final km7 z(jm7 jm7) {
        super.z(jm7);
        return this;
    }
}
