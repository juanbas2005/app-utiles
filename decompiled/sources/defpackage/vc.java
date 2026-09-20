package defpackage;

/* renamed from: vc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vc extends ty1 {
    public bd f0;
    public Boolean g0;
    public eh2 h0;
    public tp1 i0;

    /* JADX WARNING: type inference failed for: r9v4, types: [java.lang.Object, e06] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    public static final Object q1(vc vcVar, float f, h61 h61) {
        sc scVar;
        int i;
        e06 e06;
        Object obj;
        if (h61 instanceof sc) {
            scVar = (sc) h61;
            int i2 = scVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scVar.C = i2 - Integer.MIN_VALUE;
                Object obj2 = scVar.A;
                i = scVar.C;
                if (i != 0) {
                    o85.q(obj2);
                    boolean c = vcVar.f0.c();
                    Object obj3 = p81.w;
                    if (c) {
                        bd bdVar = vcVar.f0;
                        scVar.C = 1;
                        if (!bdVar.c()) {
                            bc3.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
                        }
                        Object value = bdVar.g.getValue();
                        ll1 b = bdVar.b();
                        float e = bdVar.e();
                        f81 f81 = bdVar.b;
                        if (f81 != null) {
                            zh zhVar = bdVar.c;
                            if (zhVar != null) {
                                Object b2 = rc.b(b, e, f, f81, zhVar);
                                if (((Boolean) bdVar.a.y(b2)).booleanValue()) {
                                    obj = rc.e(bdVar, b2, f, scVar);
                                } else {
                                    obj = rc.e(bdVar, value, f, scVar);
                                }
                                if (obj == obj3) {
                                    return obj3;
                                }
                                return obj;
                            }
                            sg3.a0("velocityThreshold");
                            throw null;
                        }
                        sg3.a0("positionalThreshold");
                        throw null;
                    }
                    ? obj4 = new Object();
                    obj4.w = f;
                    bd bdVar2 = vcVar.f0;
                    uc ucVar = new uc(vcVar, obj4, f, (f61) null);
                    scVar.z = obj4;
                    scVar.C = 2;
                    mq4 mq4 = bdVar2.f;
                    xc xcVar = new xc(bdVar2, ucVar, (f61) null, 0);
                    mq4.getClass();
                    Object L = gl0.L(new p6(hq4.w, mq4, (vr2) xcVar, (f61) null), scVar);
                    if (L != obj3) {
                        L = vs7.a;
                    }
                    if (L != obj3) {
                        e06 = obj4;
                    }
                    return obj3;
                } else if (i == 1) {
                    o85.q(obj2);
                    return obj2;
                } else if (i == 2) {
                    e06 = scVar.z;
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new Float(e06.w);
            }
        }
        scVar = new sc(vcVar, h61);
        Object obj22 = scVar.A;
        i = scVar.C;
        if (i != 0) {
        }
        return new Float(e06.w);
    }

    public final void N0() {
        s1();
    }

    public final Object c1(sy1 sy1, sy1 sy12) {
        bd bdVar = this.f0;
        ea eaVar = new ea(sy1, this, (f61) null);
        mq4 mq4 = bdVar.f;
        xc xcVar = new xc(bdVar, eaVar, (f61) null, 0);
        mq4.getClass();
        Object L = gl0.L(new p6(hq4.w, mq4, (vr2) xcVar, (f61) null), sy12);
        vs7 vs7 = vs7.a;
        p81 p81 = p81.w;
        if (L != p81) {
            L = vs7;
        }
        if (L == p81) {
            return L;
        }
        return vs7;
    }

    public final void d() {
        I();
        if (this.J) {
            tp1 tp1 = rc9.O0(this).T;
            tp1 tp12 = this.i0;
            if (tp12 == null || !tp12.equals(tp1)) {
                this.i0 = tp1;
                s1();
            }
        }
    }

    public final void i1(dy1 dy1) {
        if (this.J) {
            ar7.H(J0(), (e81) null, (r81) null, new n0(this, dy1, (f61) null, 3), 3);
        }
    }

    public final boolean n1() {
        if (this.f0.l.getValue() != null) {
            return true;
        }
        return false;
    }

    public final boolean r1() {
        Boolean bool = this.g0;
        if (bool != null) {
            bool.getClass();
            return bool.booleanValue();
        } else if (rc9.O0(this).U == ey3.x && this.M == z75.x) {
            return true;
        } else {
            return false;
        }
    }

    public final void s1() {
        jo7 jo7 = ic.a;
        j5 j5Var = ic.b;
        tp1 tp1 = rc9.O0(this).T;
        this.i0 = tp1;
        this.h0 = new ax6(new wr0((Object) this.f0, (Object) j5Var, (Object) new lc(tp1, 0), 4), rc.b, jo7);
    }

    public final void h1(long j) {
    }
}
