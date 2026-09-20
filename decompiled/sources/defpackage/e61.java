package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: e61  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e61 implements zr3 {
    public final /* synthetic */ int a = 0;
    public final zr3 b;
    public final Object c;
    public final Object d;
    public final ll6 e;

    public e61(gq3 gq3, zr3 zr3, zr3[] zr3Arr) {
        gq3.getClass();
        this.c = gq3;
        this.b = zr3;
        List asList = Arrays.asList(zr3Arr);
        asList.getClass();
        this.d = asList;
        gg0 gg0 = new gg0(15, (Object) this);
        this.e = new w51(b85.f("kotlinx.serialization.ContextualSerializer", pl6.l, new ll6[0], gg0), gq3);
    }

    public final Object deserialize(ok1 ok1) {
        int i = this.a;
        zr3 zr3 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case b85.b:
                gq3 gq3 = (gq3) obj;
                ok1.a().b(gq3, (List) obj2);
                if (zr3 != null) {
                    return ok1.g(zr3);
                }
                uq3.L(gq3);
                throw null;
            default:
                nl6 nl6 = (nl6) this.e;
                gy0 c2 = ok1.c(nl6);
                Object obj3 = su0.k;
                Object obj4 = obj3;
                Object obj5 = obj4;
                Object obj6 = obj5;
                while (true) {
                    int h = c2.h(nl6);
                    if (h == -1) {
                        c2.b(nl6);
                        if (obj4 == obj3) {
                            throw new IllegalArgumentException("Element 'first' is missing");
                        } else if (obj5 == obj3) {
                            throw new IllegalArgumentException("Element 'second' is missing");
                        } else if (obj6 != obj3) {
                            return new eo7(obj4, obj5, obj6);
                        } else {
                            throw new IllegalArgumentException("Element 'third' is missing");
                        }
                    } else if (h == 0) {
                        obj4 = c2.r(nl6, 0, zr3, (Object) null);
                    } else if (h == 1) {
                        obj5 = c2.r(nl6, 1, (zr3) obj, (Object) null);
                    } else if (h == 2) {
                        obj6 = c2.r(nl6, 2, (zr3) obj2, (Object) null);
                    } else {
                        throw new IllegalArgumentException(hl6.k(h, "Unexpected index "));
                    }
                }
        }
    }

    public final ll6 getDescriptor() {
        switch (this.a) {
            case b85.b:
                return (w51) this.e;
            default:
                return (nl6) this.e;
        }
    }

    public final void serialize(j42 j42, Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        zr3 zr3 = this.b;
        switch (i) {
            case b85.b:
                obj.getClass();
                gq3 gq3 = (gq3) obj3;
                j42.a().b(gq3, (List) obj2);
                if (zr3 != null) {
                    j42.g(zr3, obj);
                    return;
                } else {
                    uq3.L(gq3);
                    throw null;
                }
            default:
                eo7 eo7 = (eo7) obj;
                eo7.getClass();
                nl6 nl6 = (nl6) this.e;
                hy0 c2 = j42.c(nl6);
                c2.o(nl6, 0, zr3, eo7.w);
                c2.o(nl6, 1, (zr3) obj3, eo7.x);
                c2.o(nl6, 2, (zr3) obj2, eo7.y);
                c2.b(nl6);
                return;
        }
    }

    public e61(zr3 zr3, zr3 zr32, zr3 zr33) {
        this.b = zr3;
        this.c = zr32;
        this.d = zr33;
        this.e = b85.e("kotlin.Triple", new ll6[0], new ay5(25, (Object) this));
    }
}
