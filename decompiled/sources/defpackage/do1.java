package defpackage;

import java.io.InputStream;
import java.util.Map;

/* renamed from: do1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class do1 extends a97 implements hs2 {
    public final /* synthetic */ int A;
    public int B;
    public /* synthetic */ Object C;
    public /* synthetic */ Object D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do1(Object obj, f61 f61, int i) {
        super(3, f61);
        this.A = i;
        this.D = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r15 == r5) goto L_0x00a1;
     */
    public final Object s(Object obj) {
        j85 j85;
        q51 q51;
        do1 do1;
        r31 r31;
        int i = this.A;
        int i2 = 0;
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        r31 r312 = null;
        switch (i) {
            case b85.b:
                yg5 yg5 = (yg5) this.C;
                Object obj2 = this.D;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    Object obj3 = yg5.w;
                    if (((y53) obj3).c.E0("Accept") == null) {
                        ((y53) obj3).c.p0("Accept", "*/*");
                    }
                    q51 p = pv8.p((h53) obj3);
                    if (obj2 instanceof String) {
                        String str = (String) obj2;
                        if (p == null) {
                            p = p51.b;
                        }
                        j85 = new vc7(str, p);
                    } else if (obj2 instanceof byte[]) {
                        j85 = new bo1(p, obj2);
                    } else if (obj2 instanceof hf0) {
                        j85 = new co1(yg5, p, obj2);
                    } else if (obj2 instanceof j85) {
                        j85 = (j85) obj2;
                    } else {
                        y53 y53 = (y53) obj3;
                        y53.getClass();
                        obj2.getClass();
                        if (obj2 instanceof InputStream) {
                            j85 = new co1(y53, p, obj2);
                        } else {
                            j85 = null;
                        }
                    }
                    if (j85 != null) {
                        q51 = j85.b();
                    } else {
                        q51 = null;
                    }
                    if (q51 == null) {
                        return vs7;
                    }
                    y53 y532 = (y53) obj3;
                    dz2 dz2 = y532.c;
                    dz2.getClass();
                    ((Map) dz2.w).remove("Content-Type");
                    fo1.a.h("Transformed with default transformers request body for " + y532.a + " from " + b26.a.b(obj2.getClass()));
                    this.C = null;
                    this.D = null;
                    this.B = 1;
                    if (yg5.d(this, j85) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 1:
                yg5 yg52 = (yg5) this.C;
                h63 h63 = (h63) this.D;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    fp7 fp7 = h63.a;
                    Object obj4 = h63.b;
                    if (!(obj4 instanceof hf0)) {
                        return vs7;
                    }
                    if (!sg3.e(fp7.a, b26.a.b(InputStream.class))) {
                        return vs7;
                    }
                    el3 el3 = (el3) ((l43) yg52.w).k().a0(me6.E);
                    h63 h632 = new h63(fp7, new aa0(2, (Object) new aa0(0, (Object) (hf0) obj4)));
                    this.C = null;
                    this.D = null;
                    this.B = 1;
                    if (yg52.d(this, h632) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i4 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 2:
                yg5 yg53 = (yg5) this.C;
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    this.C = yg53;
                    this.B = 1;
                    obj = yg53.c(this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i5 == 1) {
                    try {
                        o85.q(obj);
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        f96 f96 = ((j43) this.D).E;
                        ((l43) yg53.w).d();
                        f96.getClass();
                        f21.u(((c71) f96.x).a(qr0.d));
                        throw th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h63 h633 = (h63) obj;
                return vs7;
            case 3:
                yg5 yg54 = (yg5) this.C;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    Object obj5 = yg54.w;
                    this.C = null;
                    this.B = 1;
                    if (((gs2) this.D).H(obj5, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i6 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 4:
                yg5 yg55 = (yg5) this.C;
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    this.C = yg55;
                    this.B = 1;
                    do1 = this;
                    obj = ((js2) this.D).K(new Object(), yg55.w, yg55.b(), (fp7) ((y53) yg55.w).f.d(g56.a), do1);
                    break;
                } else if (i7 == 1) {
                    o85.q(obj);
                    do1 = this;
                } else if (i7 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j85 j852 = (j85) obj;
                if (j852 == null) {
                    return vs7;
                }
                do1.C = null;
                do1.B = 2;
                if (yg55.d(do1, j852) != p81) {
                    return vs7;
                }
                return p81;
            default:
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    fi2 fi2 = (fi2) this.C;
                    r31[] r31Arr = (r31[]) ((Object[]) this.D);
                    int length = r31Arr.length;
                    while (true) {
                        r31 = p31.a;
                        if (i2 < length) {
                            r31 r313 = r31Arr[i2];
                            if (!sg3.e(r313, r31)) {
                                r312 = r313;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (r312 != null) {
                        r31 = r312;
                    }
                    this.B = 1;
                    if (fi2.k(r31, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i8 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                do1 do1 = new do1(3, (f61) obj3, 0);
                do1.C = (yg5) obj;
                do1.D = obj2;
                return do1.s(vs7);
            case 1:
                do1 do12 = new do1(3, (f61) obj3, 1);
                do12.C = (yg5) obj;
                do12.D = (h63) obj2;
                return do12.s(vs7);
            case 2:
                h63 h63 = (h63) obj2;
                do1 do13 = new do1((Object) (j43) this.D, (f61) obj3, 2);
                do13.C = (yg5) obj;
                return do13.s(vs7);
            case 3:
                do1 do14 = new do1((Object) (gs2) this.D, (f61) obj3, 3);
                do14.C = (yg5) obj;
                return do14.s(vs7);
            case 4:
                do1 do15 = new do1((Object) (js2) this.D, (f61) obj3, 4);
                do15.C = (yg5) obj;
                return do15.s(vs7);
            default:
                do1 do16 = new do1(3, (f61) obj3, 5);
                do16.C = (fi2) obj;
                do16.D = (Object[]) obj2;
                return do16.s(vs7);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do1(int i, f61 f61, int i2) {
        super(i, f61);
        this.A = i2;
    }
}
