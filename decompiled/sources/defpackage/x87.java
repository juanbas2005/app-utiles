package defpackage;

import java.util.List;

/* renamed from: x87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x87 extends yg5 {
    public final f61[] A;
    public int B;
    public int C;
    public final List x;
    public final w87 y = new w87(this);
    public Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x87(Object obj, Object obj2, List list) {
        super(obj2);
        obj.getClass();
        obj2.getClass();
        list.getClass();
        this.x = list;
        this.z = obj;
        this.A = new f61[list.size()];
        this.B = -1;
    }

    public final Object a(Object obj, h61 h61) {
        this.C = 0;
        if (this.x.size() == 0) {
            return obj;
        }
        obj.getClass();
        this.z = obj;
        if (this.B < 0) {
            return c(h61);
        }
        h.s("Already started");
        return null;
    }

    public final Object b() {
        return this.z;
    }

    public final Object c(f61 f61) {
        Object obj;
        int i = this.C;
        int size = this.x.size();
        p81 p81 = p81.w;
        if (i == size) {
            obj = this.z;
        } else {
            f61.getClass();
            int i2 = this.B + 1;
            this.B = i2;
            f61[] f61Arr = this.A;
            f61Arr[i2] = f61;
            if (e(true)) {
                int i3 = this.B;
                if (i3 >= 0) {
                    this.B = i3 - 1;
                    f61Arr[i3] = null;
                    obj = this.z;
                } else {
                    h.s("No more continuations to resume");
                    return null;
                }
            } else {
                obj = p81;
            }
        }
        if (obj == p81) {
            f61.getClass();
        }
        return obj;
    }

    public final Object d(f61 f61, Object obj) {
        obj.getClass();
        this.z = obj;
        return c(f61);
    }

    public final boolean e(boolean z2) {
        hs2 hs2;
        Object obj;
        w87 w87;
        do {
            int i = this.C;
            List list = this.x;
            if (i != list.size()) {
                this.C = i + 1;
                hs2 = (hs2) list.get(i);
                try {
                    obj = this.z;
                    w87 = this.y;
                    hs2.getClass();
                    obj.getClass();
                    w87.getClass();
                    mp7.Q(3, hs2);
                } catch (Throwable th) {
                    f(new m66(th));
                    return false;
                }
            } else if (z2) {
                return true;
            } else {
                f(this.z);
                return false;
            }
        } while (hs2.u(this, obj, w87) != p81.w);
        return false;
    }

    public final void f(Object obj) {
        int i = this.B;
        if (i >= 0) {
            f61[] f61Arr = this.A;
            f61 f61 = f61Arr[i];
            f61.getClass();
            int i2 = this.B;
            this.B = i2 - 1;
            f61Arr[i2] = null;
            h81 h81 = (h81) f61.r().a0(hz2.z);
            if (!(h81 instanceof h81)) {
                f61 = rc9.a0(f61);
            } else if (h81.m0(f61.r())) {
                f61 = rc9.a0(f61);
            }
            Throwable a = o66.a(obj);
            if (a == null) {
                f61.f(obj);
                return;
            }
            try {
                a.getCause();
            } catch (Throwable unused) {
            }
            f61.f(new m66(a));
            return;
        }
        h.s("No more continuations to resume");
    }

    public final e81 k() {
        return this.y.r();
    }
}
