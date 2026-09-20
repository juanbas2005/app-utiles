package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: xg5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xg5 {
    public final ArrayList a;
    public int b;
    public boolean c;
    public zk2 d;
    private volatile /* synthetic */ Object interceptors$delegate = null;

    public xg5(zk2... zk2Arr) {
        rd3.a();
        this.a = sg3.I(Arrays.copyOf(zk2Arr, zk2Arr.length));
    }

    public final Object a(Object obj, Object obj2, h61 h61) {
        yg5 yg5;
        mg5 mg5;
        int x;
        mg5 mg52;
        e81 r = h61.r();
        if (((List) this.interceptors$delegate) == null) {
            int i = this.b;
            if (i == 0) {
                this.interceptors$delegate = a42.w;
                this.c = false;
                this.d = null;
            } else {
                ArrayList arrayList = this.a;
                if (i == 1 && (x = sg3.x(arrayList)) >= 0) {
                    int i2 = 0;
                    while (true) {
                        Object obj3 = arrayList.get(i2);
                        if (obj3 instanceof mg5) {
                            mg52 = (mg5) obj3;
                        } else {
                            mg52 = null;
                        }
                        if (mg52 == null || mg52.c.isEmpty()) {
                            if (i2 == x) {
                                break;
                            }
                            i2++;
                        } else {
                            List list = mg52.c;
                            mg52.d = true;
                            this.interceptors$delegate = list;
                            this.c = false;
                            this.d = mg52.a;
                            break;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int x2 = sg3.x(arrayList);
                if (x2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        Object obj4 = arrayList.get(i3);
                        if (obj4 instanceof mg5) {
                            mg5 = (mg5) obj4;
                        } else {
                            mg5 = null;
                        }
                        if (mg5 != null) {
                            List list2 = mg5.c;
                            arrayList2.ensureCapacity(list2.size() + arrayList2.size());
                            int size = list2.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                arrayList2.add(list2.get(i4));
                            }
                        }
                        if (i3 == x2) {
                            break;
                        }
                        i3++;
                    }
                }
                this.interceptors$delegate = arrayList2;
                this.c = false;
                this.d = null;
            }
        }
        this.c = true;
        List list3 = (List) this.interceptors$delegate;
        list3.getClass();
        boolean d2 = d();
        obj.getClass();
        obj2.getClass();
        r.getClass();
        if (zg5.a || d2) {
            yg5 = new qj1(obj, list3, obj2, r);
        } else {
            yg5 = new x87(obj2, obj, list3);
        }
        return yg5.a(obj2, h61);
    }

    public final mg5 b(zk2 zk2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == zk2) {
                mg5 mg5 = new mg5(zk2, ch5.d);
                arrayList.set(i, mg5);
                return mg5;
            }
            if (obj instanceof mg5) {
                mg5 mg52 = (mg5) obj;
                if (mg52.a == zk2) {
                    return mg52;
                }
            }
        }
        return null;
    }

    public final int c(zk2 zk2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == zk2 || ((obj instanceof mg5) && ((mg5) obj).a == zk2)) {
                return i;
            }
        }
        return -1;
    }

    public abstract boolean d();

    public final boolean e(zk2 zk2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == zk2) {
                return true;
            }
            if ((obj instanceof mg5) && ((mg5) obj).a == zk2) {
                return true;
            }
        }
        return false;
    }

    public final void f(zk2 zk2, hs2 hs2) {
        zk2.getClass();
        mg5 b2 = b(zk2);
        if (b2 != null) {
            List list = (List) this.interceptors$delegate;
            if (!this.a.isEmpty() && list != null && !this.c && (!(list instanceof ar3) || (list instanceof cr3))) {
                if (sg3.e(this.d, zk2)) {
                    list.add(hs2);
                } else if (zk2 == dt0.G0(this.a) || c(zk2) == sg3.x(this.a)) {
                    mg5 b3 = b(zk2);
                    b3.getClass();
                    if (b3.d) {
                        b3.c = dt0.d1(b3.c);
                        b3.d = false;
                    }
                    b3.c.add(hs2);
                    list.add(hs2);
                }
                this.b++;
                return;
            }
            if (b2.d) {
                b2.c = dt0.d1(b2.c);
                b2.d = false;
            }
            b2.c.add(hs2);
            this.b++;
            this.interceptors$delegate = null;
            this.c = false;
            this.d = null;
            return;
        }
        throw new j1("Phase " + zk2 + " was not registered for this pipeline", 3);
    }
}
