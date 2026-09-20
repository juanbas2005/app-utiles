package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: or0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class or0 extends v0 {
    public qk5 g0;
    public ta3 h0;

    public final void I() {
        r23 r23;
        ap4 ap4 = this.M;
        if (!(ap4 == null || (r23 = this.Z) == null)) {
            ap4.c(new s23(r23));
        }
        this.Z = null;
        m1(false);
    }

    public final void h0() {
        m1(true);
    }

    public final boolean i1(KeyEvent keyEvent) {
        return false;
    }

    public final void j1(KeyEvent keyEvent) {
        k1();
    }

    public final void m1(boolean z) {
        if (z) {
            this.h0 = null;
        } else {
            this.g0 = null;
        }
        c1(z);
        this.W = "idle";
    }

    public final void w(ig igVar, lk5 lk5) {
        boolean z;
        ArrayList arrayList = (ArrayList) igVar.c;
        g1();
        if (this.R && this.V == null) {
            kv2 kv2 = new kv2(this);
            V0(kv2);
            this.V = kv2;
        }
        int i = 0;
        if (lk5 == lk5.x) {
            if (this.h0 == null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (rd3.h((ta3) arrayList.get(i2))) {
                        ta3 ta3 = (ta3) arrayList.get(0);
                        ta3.i = true;
                        this.h0 = ta3;
                        if (this.R) {
                            this.W = "waiting";
                            e1(ta3);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ta3 ta32 = (ta3) arrayList.get(i3);
                if (ta32.i || !ta32.h || ta32.d) {
                    float f = ((g58) h49.w(this, xy0.u)).f();
                    int size3 = arrayList.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ta3 ta33 = (ta3) arrayList.get(i4);
                        long j = ta33.c;
                        ta3 ta34 = this.h0;
                        ta34.getClass();
                        if (Math.abs(l35.c(l35.d(j, ta34.c))) > f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (ta33.i || z) {
                            m1(true);
                            return;
                        }
                    }
                    return;
                }
            }
            ((ta3) arrayList.get(0)).i = true;
            if (this.R) {
                this.W = "recognized";
                ta3 ta35 = this.h0;
                ta35.getClass();
                d1(true, ta35.c);
                k1();
            }
            this.h0 = null;
        } else if (lk5 == lk5.y) {
            if (this.h0 != null) {
                int size4 = arrayList.size();
                while (true) {
                    if (i >= size4) {
                        break;
                    }
                    ta3 ta36 = (ta3) arrayList.get(i);
                    if (ta36.i && ta36 != this.h0) {
                        m1(true);
                        break;
                    }
                    i++;
                }
            }
            if (sg3.e(this.W, "recognized")) {
                this.W = "idle";
            }
        }
    }

    public final void y(kk5 kk5, lk5 lk5, long j) {
        super.y(kk5, lk5, j);
        if (lk5 == lk5.x) {
            if (this.g0 != null) {
                List list = kk5.a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (!ub5.c((qk5) list.get(i))) {
                        long b1 = b1(j);
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            qk5 qk5 = (qk5) list.get(i2);
                            if (qk5.c() || ub5.n(qk5, j, b1)) {
                                m1(false);
                                return;
                            }
                        }
                        return;
                    }
                }
                ((qk5) list.get(0)).a();
                if (this.R) {
                    this.W = "recognized";
                    qk5 qk52 = this.g0;
                    qk52.getClass();
                    d1(false, qk52.c);
                    k1();
                }
                this.g0 = null;
            } else if (sb7.e(kk5, true)) {
                qk5 qk53 = (qk5) kk5.a.get(0);
                qk53.a();
                this.g0 = qk53;
                if (this.R) {
                    this.W = "waiting";
                    f1(qk53);
                }
            }
        } else if (lk5 == lk5.y) {
            if (this.g0 != null) {
                List list2 = kk5.a;
                int size3 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        break;
                    }
                    qk5 qk54 = (qk5) list2.get(i3);
                    if (qk54.c() && qk54 != this.g0) {
                        m1(false);
                        break;
                    }
                    i3++;
                }
            }
            if (sg3.e(this.W, "recognized")) {
                this.W = "idle";
            }
        }
    }
}
