package defpackage;

import android.view.textclassifier.TextClassifier;

/* renamed from: q0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q0 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ long C;
    public Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q0(dd7 dd7, long j, jd7 jd7, cd7 cd7, f61 f61) {
        super(2, f61);
        this.A = 3;
        this.D = dd7;
        this.C = j;
        this.E = jd7;
        this.F = cd7;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((q0) o((f61) obj2, (o81) obj)).s(vs7);
            case 1:
                return ((q0) o((f61) obj2, pa4.i(obj))).s(vs7);
            case 2:
                return ((q0) o((f61) obj2, (xh6) obj)).s(vs7);
            case 3:
                return ((q0) o((f61) obj2, (o81) obj)).s(vs7);
            case 4:
                return ((q0) o((f61) obj2, (o81) obj)).s(vs7);
            default:
                return ((q0) o((f61) obj2, (o81) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.F;
        Object obj3 = this.E;
        switch (i) {
            case b85.b:
                ap4 ap4 = (ap4) obj2;
                return new q0((Object) (el3) obj3, this.C, (Object) ap4, f61, 0);
            case 1:
                q0 q0Var = new q0(this.C, f61, (wj5) obj3, (CharSequence) obj2);
                q0Var.D = obj;
                return q0Var;
            case 2:
                long j = this.C;
                q0 q0Var2 = new q0((Object) (zh6) obj3, j, (Object) (e06) obj2, f61, 2);
                q0Var2.D = obj;
                return q0Var2;
            case 3:
                return new q0((dd7) this.D, this.C, (jd7) obj3, (cd7) obj2, f61);
            case 4:
                ap4 ap42 = (ap4) obj2;
                return new q0((Object) (aq4) obj3, this.C, (Object) ap42, f61, 4);
            default:
                return new q0((dy7) this.D, (String) obj3, (String) obj2, this.C, f61);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
        if (r5.b(r8, r4) == r9) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009a, code lost:
        if (r5.b(r0, r4) == r9) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        if (new defpackage.te7(r0.C, r4, 0).s(r6) == r9) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016d, code lost:
        if (((defpackage.el3) r7).j0(r4) == r9) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    public final Object s(Object obj) {
        fo5 fo5;
        eo5 eo5;
        aq4 aq4;
        int i = this.A;
        long j = this.C;
        vs7 vs7 = vs7.a;
        Object obj2 = this.F;
        Object obj3 = this.E;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                ap4 ap4 = (ap4) obj2;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    break;
                } else if (i2 == 1) {
                    o85.q(obj);
                } else if (i2 == 2) {
                    fo5 = (fo5) this.D;
                    o85.q(obj);
                    this.D = null;
                    this.B = 3;
                    if (ap4.b(fo5, this) != p81) {
                        return vs7;
                    }
                    return p81;
                } else if (i2 == 3) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eo5 eo52 = new eo5(j);
                fo5 fo52 = new fo5(eo52);
                this.D = fo52;
                this.B = 2;
                if (ap4.b(eo52, this) != p81) {
                    fo5 = fo52;
                    this.D = null;
                    this.B = 3;
                    if (ap4.b(fo5, this) != p81) {
                    }
                }
                return p81;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    TextClassifier i4 = pa4.i(this.D);
                    this.B = 1;
                    long j2 = this.C;
                    TextClassifier textClassifier = i4;
                    if (wj5.a((wj5) obj3, (CharSequence) obj2, j2, textClassifier, this) == p81) {
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
            case 2:
                zh6 zh6 = (zh6) obj3;
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    float h = zh6.h(j);
                    ou4 ou4 = new ou4((Object) (e06) obj2, (Object) zh6, (Object) (xh6) this.D, 8);
                    this.B = 1;
                    if (i95.e(0.0f, h, (hl) null, ou4, this, 12) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i5 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 3:
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    te7 te7 = ((dd7) this.D).M;
                    if (te7 != null) {
                        this.B = 1;
                        break;
                    }
                } else if (i6 == 1) {
                    o85.q(obj);
                } else if (i6 == 2) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.B = 2;
                if (((jd7) obj3).a((cd7) obj2, this) != p81) {
                    return vs7;
                }
                return p81;
            case 4:
                ap4 ap42 = (ap4) obj2;
                aq4 aq42 = (aq4) obj3;
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    eo5 eo53 = (eo5) aq42.getValue();
                    if (eo53 != null) {
                        do5 do5 = new do5(eo53);
                        if (ap42 != null) {
                            this.D = aq42;
                            this.B = 1;
                            break;
                        }
                        aq4 = aq42;
                    }
                    eo5 = new eo5(j);
                    if (ap42 != null) {
                        this.D = eo5;
                        this.B = 2;
                        break;
                    }
                    aq42.setValue(eo5);
                    return vs7;
                } else if (i7 == 1) {
                    aq4 = (aq4) this.D;
                    o85.q(obj);
                } else if (i7 == 2) {
                    eo5 = (eo5) this.D;
                    o85.q(obj);
                    aq42.setValue(eo5);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aq4.setValue((Object) null);
                eo5 = new eo5(j);
                if (ap42 != null) {
                }
                aq42.setValue(eo5);
                return vs7;
            default:
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    qe1 qe1 = ((dy7) this.D).a;
                    iw7 iw7 = new iw7((String) obj3, (String) obj2, this.C, (f61) null);
                    this.B = 1;
                    Object a = qe1.a(iw7, this);
                    if (a == p81) {
                        return p81;
                    }
                    return a;
                } else if (i8 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q0(long j, f61 f61, wj5 wj5, CharSequence charSequence) {
        super(2, f61);
        this.A = 1;
        this.E = wj5;
        this.F = charSequence;
        this.C = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q0(dy7 dy7, String str, String str2, long j, f61 f61) {
        super(2, f61);
        this.A = 5;
        this.D = dy7;
        this.E = str;
        this.F = str2;
        this.C = j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, long j, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.E = obj;
        this.C = j;
        this.F = obj2;
    }
}
