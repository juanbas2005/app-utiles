package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;

/* renamed from: gv7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gv7 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ dy7 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv7(dy7 dy7, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = dy7;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((gv7) o(f61, o81)).s(vs7);
            case 1:
                return ((gv7) o(f61, o81)).s(vs7);
            case 2:
                return ((gv7) o(f61, o81)).s(vs7);
            case 3:
                return ((gv7) o(f61, o81)).s(vs7);
            case 4:
                return ((gv7) o(f61, o81)).s(vs7);
            case 5:
                return ((gv7) o(f61, o81)).s(vs7);
            default:
                return ((gv7) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        dy7 dy7 = this.C;
        switch (i) {
            case b85.b:
                return new gv7(dy7, f61, 0);
            case 1:
                return new gv7(dy7, f61, 1);
            case 2:
                return new gv7(dy7, f61, 2);
            case 3:
                return new gv7(dy7, f61, 3);
            case 4:
                return new gv7(dy7, f61, 4);
            case 5:
                return new gv7(dy7, f61, 5);
            default:
                return new gv7(dy7, f61, 6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    public final Object s(Object obj) {
        String id;
        int i = this.A;
        dy7 dy7 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    qe1 qe1 = dy7.a;
                    da0 da0 = new da0(2, (f61) null, 6);
                    this.B = 1;
                    Object a = qe1.a(da0, this);
                    if (a == p81) {
                        return p81;
                    }
                    return a;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    qe1 qe12 = dy7.a;
                    da0 da02 = new da0(2, (f61) null, 7);
                    this.B = 1;
                    Object a2 = qe12.a(da02, this);
                    if (a2 == p81) {
                        return p81;
                    }
                    return a2;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 2:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    di2 b = dy7.a.b();
                    this.B = 1;
                    obj = gr8.H(b, this);
                    if (obj == p81) {
                        return p81;
                    }
                    id = ((UserDataPreferences) obj).getId();
                    if (id.length() == 0) {
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                    id = ((UserDataPreferences) obj).getId();
                    if (id.length() == 0) {
                        return id;
                    }
                    h.s("User not authenticated");
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 3:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    qe1 qe13 = dy7.a;
                    bj bjVar = new bj(2, (f61) null, 4);
                    this.B = 1;
                    Object a3 = qe13.a(bjVar, this);
                    if (a3 == p81) {
                        return p81;
                    }
                    return a3;
                } else if (i5 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 4:
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    qe1 qe14 = dy7.a;
                    da0 da03 = new da0(2, (f61) null, 8);
                    this.B = 1;
                    Object a4 = qe14.a(da03, this);
                    if (a4 == p81) {
                        return p81;
                    }
                    return a4;
                } else if (i6 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 5:
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    qe1 qe15 = dy7.a;
                    da0 da04 = new da0(2, (f61) null, 9);
                    this.B = 1;
                    Object a5 = qe15.a(da04, this);
                    if (a5 == p81) {
                        return p81;
                    }
                    return a5;
                } else if (i7 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    qe1 qe16 = dy7.a;
                    da0 da05 = new da0(2, (f61) null, 10);
                    this.B = 1;
                    Object a6 = qe16.a(da05, this);
                    if (a6 == p81) {
                        return p81;
                    }
                    return a6;
                } else if (i8 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
