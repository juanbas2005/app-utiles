package defpackage;

import java.util.List;

/* renamed from: s17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s17 extends a97 implements gs2 {
    public int A;
    public final /* synthetic */ d37 B;
    public final /* synthetic */ t17 C;
    public final /* synthetic */ String D;
    public final /* synthetic */ boolean E;
    public e17 F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s17(d37 d37, f61 f61, t17 t17, String str, boolean z) {
        super(2, f61);
        this.B = d37;
        this.C = t17;
        this.D = str;
        this.E = z;
    }

    public final Object H(Object obj, Object obj2) {
        return ((s17) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new s17(this.B, f61, this.C, this.D, this.E);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r8 == r7) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r0 == r7) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        return r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2 A[LOOP:3: B:37:0x00d2->B:38:0x00ea, LOOP_START] */
    public final Object s(Object obj) {
        Object obj2;
        e17 e17;
        boolean z;
        Object value;
        Object value2;
        Object value3;
        Object obj3;
        Object value4;
        int i = this.A;
        t17 t17 = this.C;
        d37 d37 = this.B;
        p81 p81 = p81.w;
        if (i == 0) {
            o85.q(obj);
            do {
                value4 = d37.getValue();
            } while (!d37.i(value4, b81.h((Object) null, (is7) value4, (Object) null, true, 1)));
            e17 = (e17) ((is7) d37.getValue()).a;
            d17 d17 = t17.b;
            this.F = e17;
            this.A = 1;
            obj2 = d17.f(this.D, this.E, this);
        } else if (i == 1) {
            e17 = this.F;
            o85.q(obj);
            obj2 = ((o66) obj).w;
        } else if (i == 2) {
            e17 = this.F;
            try {
                o85.q(obj);
                obj3 = ((o66) obj).w;
                o85.q(obj3);
                obj2 = (List) obj3;
            } catch (Throwable th) {
                obj2 = new m66(th);
            }
            e17 e172 = e17;
            if (!(obj2 instanceof m66)) {
                obj2 = e17.a(e172, (List) obj2, (r11) null, (String) null, (String) null, false, (hv2) null, 62);
            }
            z = obj2 instanceof m66;
            if (z) {
                if (z) {
                    obj2 = null;
                }
                if (obj2 != null) {
                    do {
                        value3 = d37.getValue();
                    } while (!d37.i(value3, is7.a((is7) value3, obj2, false, (hv2) null, 4)));
                } else {
                    do {
                        value2 = d37.getValue();
                    } while (!d37.i(value2, is7.a((is7) value2, (Object) null, false, new hv2(25, (Object) new IllegalStateException("Operation succeeded but returned no data")), 1)));
                }
            } else {
                do {
                    value = d37.getValue();
                } while (!d37.i(value, is7.a((is7) value, (Object) null, false, new hv2(25, (Object) o66.a(obj2)), 1)));
            }
            return vs7.a;
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (!(obj2 instanceof m66)) {
            vs7 vs7 = (vs7) obj2;
            d17 d172 = t17.b;
            this.F = e17;
            this.A = 2;
            obj3 = d172.e(this);
        }
        e17 e1722 = e17;
        if (!(obj2 instanceof m66)) {
        }
        z = obj2 instanceof m66;
        if (z) {
        }
        return vs7.a;
    }
}
