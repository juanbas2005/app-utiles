package defpackage;

/* renamed from: ow7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ow7 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ dy7 C;
    public final /* synthetic */ boolean D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow7(dy7 dy7, boolean z, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = dy7;
        this.D = z;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((ow7) o(f61, o81)).s(vs7);
            case 1:
                return ((ow7) o(f61, o81)).s(vs7);
            case 2:
                return ((ow7) o(f61, o81)).s(vs7);
            case 3:
                return ((ow7) o(f61, o81)).s(vs7);
            case 4:
                return ((ow7) o(f61, o81)).s(vs7);
            case 5:
                return ((ow7) o(f61, o81)).s(vs7);
            case 6:
                return ((ow7) o(f61, o81)).s(vs7);
            case 7:
                return ((ow7) o(f61, o81)).s(vs7);
            case 8:
                return ((ow7) o(f61, o81)).s(vs7);
            case 9:
                return ((ow7) o(f61, o81)).s(vs7);
            case 10:
                return ((ow7) o(f61, o81)).s(vs7);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return ((ow7) o(f61, o81)).s(vs7);
            case 12:
                return ((ow7) o(f61, o81)).s(vs7);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return ((ow7) o(f61, o81)).s(vs7);
            case 14:
                return ((ow7) o(f61, o81)).s(vs7);
            case h75.g:
                return ((ow7) o(f61, o81)).s(vs7);
            case 16:
                return ((ow7) o(f61, o81)).s(vs7);
            case 17:
                return ((ow7) o(f61, o81)).s(vs7);
            case 18:
                return ((ow7) o(f61, o81)).s(vs7);
            case 19:
                return ((ow7) o(f61, o81)).s(vs7);
            default:
                return ((ow7) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        boolean z = this.D;
        dy7 dy7 = this.C;
        switch (i) {
            case b85.b:
                return new ow7(dy7, z, f61, 0);
            case 1:
                return new ow7(dy7, z, f61, 1);
            case 2:
                return new ow7(dy7, z, f61, 2);
            case 3:
                return new ow7(dy7, z, f61, 3);
            case 4:
                return new ow7(dy7, z, f61, 4);
            case 5:
                return new ow7(dy7, z, f61, 5);
            case 6:
                return new ow7(dy7, z, f61, 6);
            case 7:
                return new ow7(dy7, z, f61, 7);
            case 8:
                return new ow7(dy7, z, f61, 8);
            case 9:
                return new ow7(dy7, z, f61, 9);
            case 10:
                return new ow7(dy7, z, f61, 10);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new ow7(dy7, z, f61, 11);
            case 12:
                return new ow7(dy7, z, f61, 12);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new ow7(dy7, z, f61, 13);
            case 14:
                return new ow7(dy7, z, f61, 14);
            case h75.g:
                return new ow7(dy7, z, f61, 15);
            case 16:
                return new ow7(dy7, z, f61, 16);
            case 17:
                return new ow7(dy7, z, f61, 17);
            case 18:
                return new ow7(dy7, z, f61, 18);
            case 19:
                return new ow7(dy7, z, f61, 19);
            default:
                return new ow7(dy7, z, f61, 20);
        }
    }

    public final Object s(Object obj) {
        int i = this.A;
        boolean z = this.D;
        dy7 dy7 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    qe1 qe1 = dy7.a;
                    b43 b43 = new b43(z, (f61) null, 1);
                    this.B = 1;
                    Object a = qe1.a(b43, this);
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
                    b43 b432 = new b43(z, (f61) null, 2);
                    this.B = 1;
                    Object a2 = qe12.a(b432, this);
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
                    qe1 qe13 = dy7.a;
                    b43 b433 = new b43(z, (f61) null, 3);
                    this.B = 1;
                    Object a3 = qe13.a(b433, this);
                    if (a3 == p81) {
                        return p81;
                    }
                    return a3;
                } else if (i4 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 3:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    qe1 qe14 = dy7.a;
                    b43 b434 = new b43(z, (f61) null, 4);
                    this.B = 1;
                    Object a4 = qe14.a(b434, this);
                    if (a4 == p81) {
                        return p81;
                    }
                    return a4;
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
                    qe1 qe15 = dy7.a;
                    b43 b435 = new b43(z, (f61) null, 5);
                    this.B = 1;
                    Object a5 = qe15.a(b435, this);
                    if (a5 == p81) {
                        return p81;
                    }
                    return a5;
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
                    qe1 qe16 = dy7.a;
                    b43 b436 = new b43(z, (f61) null, 6);
                    this.B = 1;
                    Object a6 = qe16.a(b436, this);
                    if (a6 == p81) {
                        return p81;
                    }
                    return a6;
                } else if (i7 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 6:
                int i8 = this.B;
                if (i8 == 0) {
                    o85.q(obj);
                    qe1 qe17 = dy7.a;
                    b43 b437 = new b43(z, (f61) null, 7);
                    this.B = 1;
                    Object a7 = qe17.a(b437, this);
                    if (a7 == p81) {
                        return p81;
                    }
                    return a7;
                } else if (i8 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 7:
                int i9 = this.B;
                if (i9 == 0) {
                    o85.q(obj);
                    qe1 qe18 = dy7.a;
                    b43 b438 = new b43(z, (f61) null, 8);
                    this.B = 1;
                    Object a8 = qe18.a(b438, this);
                    if (a8 == p81) {
                        return p81;
                    }
                    return a8;
                } else if (i9 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 8:
                int i10 = this.B;
                if (i10 == 0) {
                    o85.q(obj);
                    qe1 qe19 = dy7.a;
                    b43 b439 = new b43(z, (f61) null, 9);
                    this.B = 1;
                    Object a9 = qe19.a(b439, this);
                    if (a9 == p81) {
                        return p81;
                    }
                    return a9;
                } else if (i10 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 9:
                int i11 = this.B;
                if (i11 == 0) {
                    o85.q(obj);
                    qe1 qe110 = dy7.a;
                    b43 b4310 = new b43(z, (f61) null, 10);
                    this.B = 1;
                    Object a10 = qe110.a(b4310, this);
                    if (a10 == p81) {
                        return p81;
                    }
                    return a10;
                } else if (i11 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 10:
                int i12 = this.B;
                if (i12 == 0) {
                    o85.q(obj);
                    qe1 qe111 = dy7.a;
                    b43 b4311 = new b43(z, (f61) null, 11);
                    this.B = 1;
                    Object a11 = qe111.a(b4311, this);
                    if (a11 == p81) {
                        return p81;
                    }
                    return a11;
                } else if (i12 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                int i13 = this.B;
                if (i13 == 0) {
                    o85.q(obj);
                    qe1 qe112 = dy7.a;
                    b43 b4312 = new b43(z, (f61) null, 12);
                    this.B = 1;
                    Object a12 = qe112.a(b4312, this);
                    if (a12 == p81) {
                        return p81;
                    }
                    return a12;
                } else if (i13 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 12:
                int i14 = this.B;
                if (i14 == 0) {
                    o85.q(obj);
                    qe1 qe113 = dy7.a;
                    b43 b4313 = new b43(z, (f61) null, 13);
                    this.B = 1;
                    Object a13 = qe113.a(b4313, this);
                    if (a13 == p81) {
                        return p81;
                    }
                    return a13;
                } else if (i14 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                int i15 = this.B;
                if (i15 == 0) {
                    o85.q(obj);
                    qe1 qe114 = dy7.a;
                    b43 b4314 = new b43(z, (f61) null, 14);
                    this.B = 1;
                    Object a14 = qe114.a(b4314, this);
                    if (a14 == p81) {
                        return p81;
                    }
                    return a14;
                } else if (i15 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 14:
                int i16 = this.B;
                if (i16 == 0) {
                    o85.q(obj);
                    qe1 qe115 = dy7.a;
                    b43 b4315 = new b43(z, (f61) null, 15);
                    this.B = 1;
                    Object a15 = qe115.a(b4315, this);
                    if (a15 == p81) {
                        return p81;
                    }
                    return a15;
                } else if (i16 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case h75.g:
                int i17 = this.B;
                if (i17 == 0) {
                    o85.q(obj);
                    qe1 qe116 = dy7.a;
                    b43 b4316 = new b43(z, (f61) null, 16);
                    this.B = 1;
                    Object a16 = qe116.a(b4316, this);
                    if (a16 == p81) {
                        return p81;
                    }
                    return a16;
                } else if (i17 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 16:
                int i18 = this.B;
                if (i18 == 0) {
                    o85.q(obj);
                    qe1 qe117 = dy7.a;
                    b43 b4317 = new b43(z, (f61) null, 17);
                    this.B = 1;
                    Object a17 = qe117.a(b4317, this);
                    if (a17 == p81) {
                        return p81;
                    }
                    return a17;
                } else if (i18 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 17:
                int i19 = this.B;
                if (i19 == 0) {
                    o85.q(obj);
                    qe1 qe118 = dy7.a;
                    b43 b4318 = new b43(z, (f61) null, 18);
                    this.B = 1;
                    Object a18 = qe118.a(b4318, this);
                    if (a18 == p81) {
                        return p81;
                    }
                    return a18;
                } else if (i19 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 18:
                int i20 = this.B;
                if (i20 == 0) {
                    o85.q(obj);
                    qe1 qe119 = dy7.a;
                    b43 b4319 = new b43(z, (f61) null, 19);
                    this.B = 1;
                    Object a19 = qe119.a(b4319, this);
                    if (a19 == p81) {
                        return p81;
                    }
                    return a19;
                } else if (i20 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 19:
                int i21 = this.B;
                if (i21 == 0) {
                    o85.q(obj);
                    qe1 qe120 = dy7.a;
                    b43 b4320 = new b43(z, (f61) null, 20);
                    this.B = 1;
                    Object a20 = qe120.a(b4320, this);
                    if (a20 == p81) {
                        return p81;
                    }
                    return a20;
                } else if (i21 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                int i22 = this.B;
                if (i22 == 0) {
                    o85.q(obj);
                    qe1 qe121 = dy7.a;
                    b43 b4321 = new b43(z, (f61) null, 21);
                    this.B = 1;
                    Object a21 = qe121.a(b4321, this);
                    if (a21 == p81) {
                        return p81;
                    }
                    return a21;
                } else if (i22 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
