package defpackage;

import androidx.compose.foundation.gestures.AnchoredDragFinishedSignal;

/* renamed from: rc  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rc {
    public static final j5 a = new j5(5);
    public static final tj1 b = new tj1(new hz2(19));

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, e06] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r6 = new defpackage.kc(r4, r6, 0);
     */
    public static final Object a(bd bdVar, float f, ad adVar, ll1 ll1, Object obj, hl hlVar, nc ncVar) {
        float f2;
        kc kcVar;
        Object c;
        float c2 = ll1.c(obj);
        ? obj2 = new Object();
        if (Float.isNaN(bdVar.j.d())) {
            f2 = 0.0f;
        } else {
            f2 = bdVar.j.d();
        }
        obj2.w = f2;
        if (!Float.isNaN(c2)) {
            float f3 = obj2.w;
            if (f3 != c2 && (c = i95.c(f3, c2, f, hlVar, kcVar, ncVar)) == p81.w) {
                return c;
            }
        }
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c A[RETURN] */
    public static final Object b(ll1 ll1, float f, float f2, vr2 vr2, sr2 sr2) {
        boolean z;
        boolean z2;
        if (!Float.isNaN(f)) {
            boolean z3 = false;
            if (Math.abs(f2) > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z || f2 <= 0.0f) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z) {
                Object a2 = ll1.a(f);
                a2.getClass();
                return a2;
            } else if (Math.abs(f2) >= Math.abs(((Number) sr2.b()).floatValue())) {
                Object b2 = ll1.b(f, z2);
                b2.getClass();
                return b2;
            } else {
                Object b3 = ll1.b(f, false);
                b3.getClass();
                float c = ll1.c(b3);
                Object b4 = ll1.b(f, true);
                b4.getClass();
                float c2 = ll1.c(b4);
                float abs = Math.abs(((Number) vr2.y(Float.valueOf(Math.abs(c - c2)))).floatValue());
                if (!z2) {
                    c = c2;
                }
                if (Math.abs(c - f) >= abs) {
                    z3 = true;
                }
                if (z3) {
                    if (z2) {
                        return b4;
                    }
                } else if (z3) {
                    h.c();
                    return null;
                } else if (z2) {
                    return b3;
                }
                return b3;
            }
        } else {
            h.q("The offset provided to computeTarget must not be NaN.");
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object c(sr2 sr2, gs2 gs2, h61 h61) {
        oc ocVar;
        int i;
        if (h61 instanceof oc) {
            oc ocVar2 = (oc) h61;
            int i2 = ocVar2.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ocVar2.A = i2 - Integer.MIN_VALUE;
                ocVar = ocVar2;
                Object obj = ocVar.z;
                i = ocVar.A;
                if (i != 0) {
                    o85.q(obj);
                    p0 p0Var = new p0((Object) sr2, (Object) gs2, (f61) null, 4);
                    ocVar.A = 1;
                    Object L = gl0.L(p0Var, ocVar);
                    p81 p81 = p81.w;
                    if (L == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                    } catch (AnchoredDragFinishedSignal unused) {
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            }
        }
        ocVar = new h61(h61);
        Object obj2 = ocVar.z;
        i = ocVar.A;
        if (i != 0) {
        }
        return vs7.a;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, e06] */
    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public static final Object d(bd bdVar, Object obj, float f, hl hlVar, tj1 tj1, h61 h61) {
        mc mcVar;
        int i;
        float f2;
        e06 e06;
        if (h61 instanceof mc) {
            mc mcVar2 = (mc) h61;
            int i2 = mcVar2.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mcVar2.C = i2 - Integer.MIN_VALUE;
                mcVar = mcVar2;
                Object obj2 = mcVar.B;
                i = mcVar.C;
                if (i != 0) {
                    o85.q(obj2);
                    ? obj3 = new Object();
                    obj3.w = f;
                    bd bdVar2 = bdVar;
                    float f3 = f;
                    nc ncVar = new nc(bdVar2, f3, hlVar, obj3, tj1, (f61) null);
                    mcVar.A = obj3;
                    mcVar.z = f3;
                    mcVar.C = 1;
                    Object a2 = bdVar2.a(obj, hq4.w, ncVar, mcVar);
                    p81 p81 = p81.w;
                    if (a2 == p81) {
                        return p81;
                    }
                    f2 = f3;
                    e06 = obj3;
                } else if (i == 1) {
                    f2 = mcVar.z;
                    e06 = mcVar.A;
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new Float(f2 - e06.w);
            }
        }
        mcVar = new h61(h61);
        Object obj22 = mcVar.B;
        i = mcVar.C;
        if (i != 0) {
        }
        return new Float(f2 - e06.w);
    }

    public static Object e(bd bdVar, Object obj, float f, sc scVar) {
        hl hlVar;
        tj1 tj1;
        if (bdVar.c()) {
            hlVar = bdVar.d;
            if (hlVar == null) {
                sg3.a0("snapAnimationSpec");
                throw null;
            }
        } else {
            hlVar = ic.a;
        }
        hl hlVar2 = hlVar;
        if (bdVar.c()) {
            tj1 = bdVar.e;
            if (tj1 == null) {
                sg3.a0("decayAnimationSpec");
                throw null;
            }
        } else {
            tj1 = ic.c;
        }
        return d(bdVar, obj, f, hlVar2, tj1, scVar);
    }
}
