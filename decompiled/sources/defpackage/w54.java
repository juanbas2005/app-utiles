package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: w54  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w54 extends in8 {
    public int A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public k54 E;
    public final d37 F;
    public final boolean x;
    public wr0 y = new wr0(22);
    public final br4 z;

    public w54(t54 t54, boolean z2) {
        super(5);
        this.x = z2;
        this.z = new br4(t54);
        this.D = new ArrayList();
        k54 k54 = k54.x;
        this.E = k54;
        this.F = e37.a(k54);
    }

    public final k54 G0() {
        return this.E;
    }

    public final void M0(s54 s54) {
        s54.getClass();
        e1("removeObserver");
        wr0 wr0 = this.y;
        wr0.getClass();
        tb2 tb2 = (tb2) ((tp4) wr0.x).k(s54);
        if (tb2 != null) {
            tb2 tb22 = tb2.z;
            tb2 tb23 = tb2.y;
            if (tb22 == null) {
                wr0.y = tb23;
            } else {
                tb22.y = tb23;
            }
            tb2 tb24 = tb2.y;
            if (tb24 == null) {
                wr0.z = tb22;
            } else {
                tb24.z = tb22;
            }
            tb2.A = true;
        }
    }

    public final k54 d1(s54 s54) {
        tb2 tb2;
        k54 k54;
        wr0 wr0 = this.y;
        wr0.getClass();
        s54.getClass();
        tb2 tb22 = (tb2) ((tp4) wr0.x).g(s54);
        k54 k542 = null;
        if (tb22 != null) {
            tb2 = tb22.z;
        } else {
            tb2 = null;
        }
        if (tb2 != null) {
            k54 = tb2.x.a;
        } else {
            k54 = null;
        }
        ArrayList arrayList = this.D;
        if (!arrayList.isEmpty()) {
            k542 = (k54) b81.k(1, arrayList);
        }
        k54 k543 = this.E;
        if (k54 == null || k54.compareTo(k543) >= 0) {
            k54 = k543;
        }
        if (k542 == null || k542.compareTo(k54) >= 0) {
            return k54;
        }
        return k542;
    }

    public final void e1(String str) {
        if (this.x) {
            pr.K().c.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                ku4.g(f21.h("Method ", str, " must be called on the main thread"));
            }
        }
    }

    public final void f1(j54 j54) {
        j54.getClass();
        e1("handleLifecycleEvent");
        g1(j54.a());
    }

    public final void g1(k54 k54) {
        if (this.E != k54) {
            t54 t54 = (t54) ((WeakReference) this.z.x).get();
            k54 k542 = this.E;
            k54 k543 = k54.x;
            k54 k544 = k54.w;
            if (k542 == k543 && k54 == k544) {
                throw new IllegalStateException(("State must be at least '" + k54.y + "' to be moved to '" + k54 + "' in component " + t54).toString());
            } else if (k542 != k544 || k542 == k54) {
                this.E = k54;
                if (this.B || this.A != 0) {
                    this.C = true;
                    return;
                }
                this.B = true;
                i1();
                this.B = false;
                if (this.E == k544) {
                    this.y = new wr0(22);
                }
            } else {
                throw new IllegalStateException(("State is '" + k544 + "' and cannot be moved to `" + k54 + "` in component " + t54).toString());
            }
        }
    }

    public final void h1(k54 k54) {
        k54.getClass();
        e1("setCurrentState");
        g1(k54);
    }

    public final void i1() {
        Object obj = ((WeakReference) this.z.x).get();
        if (obj != null) {
            t54 t54 = (t54) obj;
            while (true) {
                wr0 wr0 = this.y;
                if (((tp4) wr0.x).e == 0) {
                    break;
                }
                tb2 tb2 = (tb2) wr0.y;
                if (tb2 != null) {
                    k54 k54 = tb2.x.a;
                    tb2 tb22 = (tb2) wr0.z;
                    if (tb22 != null) {
                        k54 k542 = tb22.x.a;
                        if (k54 == k542 && this.E == k542) {
                            break;
                        }
                        this.C = false;
                        k54 k543 = this.E;
                        if (tb2 != null) {
                            if (k543.compareTo(k54) < 0) {
                                wr0 wr02 = this.y;
                                u54 u54 = new u54(this, t54, 0);
                                wr02.getClass();
                                for (tb2 tb23 = (tb2) wr02.z; tb23 != null; tb23 = tb23.z) {
                                    if (!tb23.A) {
                                        u54.y(tb23);
                                    }
                                }
                            }
                            tb2 tb24 = (tb2) this.y.z;
                            if (!this.C && tb24 != null && this.E.compareTo(tb24.x.a) > 0) {
                                wr0 wr03 = this.y;
                                u54 u542 = new u54(this, t54, 1);
                                wr03.getClass();
                                for (tb2 tb25 = (tb2) wr03.y; tb25 != null; tb25 = tb25.y) {
                                    if (!tb25.A) {
                                        u542.y(tb25);
                                    }
                                }
                            }
                        } else {
                            kj6.i("Collection is empty.");
                            return;
                        }
                    } else {
                        kj6.i("Collection is empty.");
                        return;
                    }
                } else {
                    kj6.i("Collection is empty.");
                    return;
                }
            }
            this.C = false;
            this.F.j(this.E);
            return;
        }
        h.s("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [v54, java.lang.Object] */
    public final void x0(s54 s54) {
        q54 q54;
        v54 v54;
        t54 t54;
        j54 j54;
        s54.getClass();
        e1("addObserver");
        k54 k54 = this.E;
        k54 k542 = k54.w;
        if (k54 != k542) {
            k542 = k54.x;
        }
        ? obj = new Object();
        obj.a = k542;
        HashMap hashMap = b64.a;
        boolean z2 = s54 instanceof q54;
        boolean z3 = s54 instanceof nm1;
        boolean z4 = false;
        if (z2 && z3) {
            q54 = new pm1((nm1) s54, (q54) s54);
        } else if (z3) {
            q54 = new pm1((nm1) s54, (q54) null);
        } else if (z2) {
            q54 = (q54) s54;
        } else {
            Class<?> cls = s54.getClass();
            if (b64.b(cls) == 2) {
                Object obj2 = b64.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() != 1) {
                    int size = list.size();
                    lu2[] lu2Arr = new lu2[size];
                    if (size <= 0) {
                        q54 = new ky5(2, lu2Arr);
                    } else {
                        b64.a((Constructor) list.get(0), s54);
                        throw null;
                    }
                } else {
                    b64.a((Constructor) list.get(0), s54);
                    throw null;
                }
            } else {
                q54 = new pm1(s54);
            }
        }
        obj.b = q54;
        wr0 wr0 = this.y;
        wr0.getClass();
        tp4 tp4 = (tp4) wr0.x;
        tb2 tb2 = (tb2) tp4.g(s54);
        if (tb2 != null) {
            v54 = tb2.x;
        } else {
            tb2 tb22 = new tb2(s54, obj);
            tp4.m(s54, tb22);
            tb2 tb23 = (tb2) wr0.z;
            if (tb23 == null) {
                wr0.y = tb22;
                wr0.z = tb22;
            } else {
                tb23.y = tb22;
                tb22.z = tb23;
                wr0.z = tb22;
            }
            v54 = null;
        }
        if (v54 == null && (t54 = (t54) ((WeakReference) this.z.x).get()) != null) {
            if (this.A != 0 || this.B) {
                z4 = true;
            }
            k54 d1 = d1(s54);
            this.A++;
            while (obj.a.compareTo(d1) < 0) {
                wr0 wr02 = this.y;
                wr02.getClass();
                if (!((tp4) wr02.x).c(s54)) {
                    break;
                }
                k54 k543 = obj.a;
                ArrayList arrayList = this.D;
                arrayList.add(k543);
                h54 h54 = j54.Companion;
                k54 k544 = obj.a;
                h54.getClass();
                k544.getClass();
                int ordinal = k544.ordinal();
                if (ordinal == 1) {
                    j54 = j54.ON_CREATE;
                } else if (ordinal == 2) {
                    j54 = j54.ON_START;
                } else if (ordinal != 3) {
                    j54 = null;
                } else {
                    j54 = j54.ON_RESUME;
                }
                if (j54 != null) {
                    obj.a(t54, j54);
                    it0.l0(arrayList);
                    d1 = d1(s54);
                } else {
                    rf2.y("no event up from ", obj.a);
                    return;
                }
            }
            if (!z4) {
                i1();
            }
            this.A--;
        }
    }
}
