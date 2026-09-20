package defpackage;

/* renamed from: jp2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jp2 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public Object B;
    public int C;
    public final /* synthetic */ np2 D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp2(np2 np2, String str, String str2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.D = np2;
        this.E = str;
        this.F = str2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((jp2) o(f61, o81)).s(vs7);
            default:
                return ((jp2) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                f61 f612 = f61;
                return new jp2(this.D, this.E, this.F, f612, 0);
            default:
                return new jp2(this.D, this.E, this.F, f61, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r11 == r6) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
        if (r11 == r6) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    public final Object s(Object obj) {
        Object obj2;
        Throwable a;
        Object obj3;
        Object obj4;
        Throwable a2;
        Object obj5;
        int i = this.A;
        vs7 vs7 = vs7.a;
        String str = this.F;
        String str2 = this.E;
        p81 p81 = p81.w;
        np2 np2 = this.D;
        switch (i) {
            case b85.b:
                int i2 = this.C;
                if (i2 == 0) {
                    o85.q(obj);
                    sn2 sn2 = np2.b;
                    this.C = 1;
                    obj2 = ((lo2) sn2).i(str2, str, this);
                    break;
                } else if (i2 == 1) {
                    o85.q(obj);
                    obj2 = ((o66) obj).w;
                } else if (i2 == 2) {
                    obj3 = this.B;
                    o85.q(obj);
                    obj2 = obj3;
                    a = o66.a(obj2);
                    if (a != null) {
                        return vs7;
                    }
                    np2.f(a);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj2 instanceof m66)) {
                    vs7 vs72 = (vs7) obj2;
                    np2.h(new cb(str2, 11));
                    this.B = obj2;
                    this.C = 2;
                    if (np2.e(np2, str2, this) != p81) {
                        obj3 = obj2;
                        obj2 = obj3;
                    }
                    return p81;
                }
                a = o66.a(obj2);
                if (a != null) {
                }
            default:
                int i3 = this.C;
                if (i3 == 0) {
                    o85.q(obj);
                    sn2 sn22 = np2.b;
                    this.C = 1;
                    obj4 = ((lo2) sn22).k(str2, this);
                    break;
                } else if (i3 == 1) {
                    o85.q(obj);
                    obj4 = ((o66) obj).w;
                } else if (i3 == 2) {
                    obj5 = this.B;
                    o85.q(obj);
                    obj4 = obj5;
                    a2 = o66.a(obj4);
                    if (a2 != null) {
                        return vs7;
                    }
                    np2.f(a2);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj4 instanceof m66)) {
                    vs7 vs73 = (vs7) obj4;
                    np2.h(new cb(str, 12));
                    this.B = obj4;
                    this.C = 2;
                    if (np2.e(np2, str, this) != p81) {
                        obj5 = obj4;
                        obj4 = obj5;
                    }
                    return p81;
                }
                a2 = o66.a(obj4);
                if (a2 != null) {
                }
        }
    }
}
