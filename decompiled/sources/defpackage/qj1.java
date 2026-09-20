package defpackage;

import java.util.List;

/* renamed from: qj1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qj1 extends yg5 {
    public int A;
    public final List x;
    public final e81 y;
    public Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qj1(Object obj, List list, Object obj2, e81 e81) {
        super(obj);
        obj.getClass();
        list.getClass();
        obj2.getClass();
        this.x = list;
        this.y = e81;
        this.z = obj2;
    }

    public final Object a(Object obj, h61 h61) {
        this.A = 0;
        obj.getClass();
        this.z = obj;
        return c(h61);
    }

    public final Object b() {
        return this.z;
    }

    public final Object c(f61 f61) {
        int i = this.A;
        if (i < 0) {
            return this.z;
        }
        if (i < this.x.size()) {
            return e(f61);
        }
        this.A = -1;
        return this.z;
    }

    public final Object d(f61 f61, Object obj) {
        obj.getClass();
        this.z = obj;
        return c(f61);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003c A[SYNTHETIC] */
    public final Object e(f61 f61) {
        pj1 pj1;
        int i;
        int i2;
        Object u;
        p81 p81;
        if (f61 instanceof pj1) {
            pj1 = (pj1) f61;
            int i3 = pj1.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pj1.B = i3 - Integer.MIN_VALUE;
                Object obj = pj1.z;
                i = pj1.B;
                if (i != 0 || i == 1) {
                    o85.q(obj);
                    do {
                        i2 = this.A;
                        if (i2 == -1) {
                            List list = this.x;
                            if (i2 >= list.size()) {
                                this.A = -1;
                            } else {
                                this.A = i2 + 1;
                                Object obj2 = this.z;
                                pj1.B = 1;
                                u = ((hs2) list.get(i2)).u(this, obj2, pj1);
                                p81 = p81.w;
                            }
                        }
                        return this.z;
                    } while (u != p81);
                    return p81;
                }
                h.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        pj1 = new pj1(this, f61);
        Object obj3 = pj1.z;
        i = pj1.B;
        if (i != 0) {
        }
        o85.q(obj3);
        do {
            i2 = this.A;
            if (i2 == -1) {
            }
            return this.z;
        } while (u != p81);
        return p81;
    }

    public final e81 k() {
        return this.y;
    }
}
