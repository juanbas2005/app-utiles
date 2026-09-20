package defpackage;

import io.ktor.client.plugins.ClientRequestException;
import io.ktor.client.plugins.RedirectResponseException;
import io.ktor.client.plugins.ResponseException;
import io.ktor.client.plugins.ServerResponseException;
import io.ktor.utils.io.charsets.MalformedInputException;

/* renamed from: ff1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ff1 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public boolean C;
    public /* synthetic */ Object D;
    public int E;
    public Object F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff1(jf1 jf1, int i, f61 f61, int i2) {
        super(2, f61);
        this.A = i2;
        this.D = jf1;
        this.E = i;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ff1) o((f61) obj2, bool)).s(vs7);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((ff1) o((f61) obj2, bool2)).s(vs7);
            default:
                return ((ff1) o((f61) obj2, (yl1) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        switch (this.A) {
            case b85.b:
                ff1 ff1 = new ff1((jf1) this.D, this.E, f61, 0);
                ff1.C = ((Boolean) obj).booleanValue();
                return ff1;
            case 1:
                ff1 ff12 = new ff1((jf1) this.D, this.E, f61, 1);
                ff12.C = ((Boolean) obj).booleanValue();
                return ff12;
            default:
                ff1 ff13 = new ff1(2, f61);
                ff13.D = obj;
                return ff13;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014e, code lost:
        if (r12 == r3) goto L_0x0161;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017b  */
    public final Object s(Object obj) {
        y27 y27;
        boolean z;
        int i;
        Throwable th;
        boolean z2;
        int i2;
        Object obj2;
        int i3;
        boolean z3;
        String str;
        yl1 yl1;
        int i4;
        Throwable th2;
        boolean z4;
        int i5 = this.A;
        p81 p81 = p81.w;
        switch (i5) {
            case b85.b:
                jf1 jf1 = (jf1) this.D;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    z = this.C;
                    this.C = z;
                    this.B = 1;
                    obj = jf1.h(jf1, z, this);
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i6 == 1) {
                    z = this.C;
                    try {
                        o85.q(obj);
                    } catch (Throwable th3) {
                        if (z) {
                            cf3 i7 = jf1.i();
                            this.F = th3;
                            this.C = z;
                            this.B = 2;
                            Object a = i7.a(this);
                            if (a != p81) {
                                Throwable th4 = th3;
                                obj = a;
                                th = th4;
                                z2 = z;
                            }
                        } else {
                            Throwable th5 = th3;
                            i = this.E;
                            th = th5;
                        }
                    }
                } else if (i6 == 2) {
                    z2 = this.C;
                    th = (Throwable) this.F;
                    o85.q(obj);
                    i = ((Number) obj).intValue();
                    z = z2;
                    y27 = new lw5(th, i);
                    return new yb5(y27, Boolean.valueOf(z));
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y27 = (y27) obj;
                return new yb5(y27, Boolean.valueOf(z));
            case 1:
                jf1 jf12 = (jf1) this.D;
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    z3 = this.C;
                    this.C = z3;
                    this.B = 1;
                    obj = jf12.j(this);
                    break;
                } else if (i8 == 1) {
                    z3 = this.C;
                    o85.q(obj);
                } else if (i8 == 2) {
                    obj2 = this.F;
                    o85.q(obj);
                    i2 = ((Number) obj).intValue();
                    if (obj2 != null) {
                        i3 = obj2.hashCode();
                    } else {
                        i3 = 0;
                    }
                    return new de1(i3, i2, obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (z3) {
                    cf3 i9 = jf12.i();
                    this.F = obj;
                    this.B = 2;
                    Object a2 = i9.a(this);
                    if (a2 != p81) {
                        Object obj3 = obj;
                        obj = a2;
                        obj2 = obj3;
                        i2 = ((Number) obj).intValue();
                        if (obj2 != null) {
                        }
                        return new de1(i3, i2, obj2);
                    }
                    return p81;
                }
                Object obj4 = obj;
                i2 = this.E;
                obj2 = obj4;
                if (obj2 != null) {
                }
                return new de1(i3, i2, obj2);
            default:
                yl1 yl12 = (yl1) this.D;
                int i10 = this.E;
                vs7 vs7 = vs7.a;
                if (i10 == 0) {
                    o85.q(obj);
                    z4 = ((Boolean) yl12.V().getAttributes().b(g43.c)).booleanValue();
                    if (!z4) {
                        cc4 cc4 = cn1.b;
                        cc4.h("Skipping default response validation for " + yl12.V().c().D());
                    } else {
                        int i11 = yl12.e().w;
                        l43 V = yl12.V();
                        if (i11 >= 300) {
                            iz0 attributes = V.getAttributes();
                            au auVar = cn1.a;
                            attributes.getClass();
                            auVar.getClass();
                            if (!attributes.c().containsKey(auVar)) {
                                this.D = yl12;
                                this.C = z4;
                                this.B = i11;
                                this.E = 1;
                                Object n = n85.n(V, this);
                                if (n != p81) {
                                    Object obj5 = n;
                                    i4 = i11;
                                    obj = obj5;
                                }
                                return p81;
                            }
                        }
                    }
                    return vs7;
                } else if (i10 == 1) {
                    i4 = this.B;
                    z4 = this.C;
                    o85.q(obj);
                } else if (i10 == 2) {
                    i4 = this.B;
                    yl1 = (yl1) this.F;
                    try {
                        o85.q(obj);
                        str = (String) obj;
                    } catch (MalformedInputException unused) {
                    }
                    if (300 > i4 && i4 < 400) {
                        th2 = new RedirectResponseException(yl1, str);
                    } else if (400 > i4 && i4 < 500) {
                        th2 = new ClientRequestException(yl1, str);
                    } else if (500 > i4 || i4 >= 600) {
                        th2 = new ResponseException(yl1, str);
                    } else {
                        th2 = new ServerResponseException(yl1, str);
                    }
                    cc4 cc42 = cn1.b;
                    cc42.h("Default response validation for " + yl12.V().c().D() + " failed with " + th2);
                    throw th2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l43 l43 = (l43) obj;
                l43.getAttributes().e(cn1.a, vs7);
                yl1 d = l43.d();
                try {
                    this.D = yl12;
                    this.F = d;
                    this.C = z4;
                    this.B = i4;
                    this.E = 2;
                    Object q = h49.q(d, mo0.a, this);
                    if (q != p81) {
                        yl1 yl13 = d;
                        obj = q;
                        yl1 = yl13;
                        str = (String) obj;
                        if (300 > i4) {
                        }
                        if (400 > i4) {
                        }
                        if (500 > i4 || i4 >= 600) {
                        }
                        cc4 cc422 = cn1.b;
                        cc422.h("Default response validation for " + yl12.V().c().D() + " failed with " + th2);
                        throw th2;
                    }
                    return p81;
                } catch (MalformedInputException unused2) {
                    yl1 = d;
                    str = "<body failed decoding>";
                    if (300 > i4) {
                    }
                    if (400 > i4) {
                    }
                    if (500 > i4 || i4 >= 600) {
                    }
                    cc4 cc4222 = cn1.b;
                    cc4222.h("Default response validation for " + yl12.V().c().D() + " failed with " + th2);
                    throw th2;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff1(int i, f61 f61) {
        super(i, f61);
        this.A = 2;
    }
}
