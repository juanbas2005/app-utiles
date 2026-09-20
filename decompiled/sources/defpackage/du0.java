package defpackage;

/* renamed from: du0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class du0 implements fi2 {
    public final /* synthetic */ ad0 w;
    public final /* synthetic */ int x;

    public du0(ad0 ad0, int i) {
        this.w = ad0;
        this.x = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: p81} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: p81} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: vs7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: vs7} */
    /* JADX WARNING: type inference failed for: r8v1, types: [f61] */
    /* JADX WARNING: type inference failed for: r9v4, types: [vf8, c1, e81] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r7.w.b(r0, r9) == r6) goto L_0x00d1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final Object k(Object obj, f61 f61) {
        cu0 cu0;
        int i;
        sv1 sv1;
        Object obj2;
        ? a0;
        Object obj3;
        boolean z;
        if (f61 instanceof cu0) {
            cu0 = (cu0) f61;
            int i2 = cu0.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cu0.B = i2 - Integer.MIN_VALUE;
                Object obj4 = cu0.z;
                i = cu0.B;
                sv1 = null;
                Object obj5 = vs7.a;
                obj2 = p81.w;
                if (i != 0) {
                    o85.q(obj4);
                    ka3 ka3 = new ka3(this.x, obj);
                    cu0.B = 1;
                } else if (i == 1) {
                    o85.q(obj4);
                } else if (i == 2) {
                    o85.q(obj4);
                    return obj5;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cu0.B = 2;
                e81 r = cu0.r();
                r16.x(r);
                a0 = rc9.a0(cu0);
                if (a0 instanceof sv1) {
                    sv1 = a0;
                }
                if (sv1 != null) {
                    h81 h81 = sv1.z;
                    if (tv1.c(h81, r)) {
                        sv1.B = obj5;
                        sv1.y = 1;
                        h81.V(r, sv1);
                    } else {
                        ? c1Var = new c1(vf8.y);
                        e81 X = r.X(c1Var);
                        sv1.B = obj5;
                        sv1.y = 1;
                        h81.V(X, sv1);
                        if (c1Var.x) {
                            i72 a = ih7.a();
                            as asVar = a.A;
                            if (asVar != null) {
                                z = asVar.isEmpty();
                            } else {
                                z = true;
                            }
                            if (!z) {
                                if (a.y >= 4294967296L) {
                                    sv1.B = obj5;
                                    sv1.y = 1;
                                    a.p0(sv1);
                                } else {
                                    a.q0(true);
                                    try {
                                        sv1.run();
                                        do {
                                        } while (a.s0());
                                    } catch (Throwable th) {
                                        a.o0(true);
                                        throw th;
                                    }
                                    a.o0(true);
                                }
                            }
                        }
                    }
                    obj3 = obj2;
                    if (obj3 != obj2) {
                        obj3 = obj5;
                    }
                    if (obj3 == obj2) {
                        return obj2;
                    }
                    return obj5;
                }
                obj3 = obj5;
                if (obj3 != obj2) {
                }
                if (obj3 == obj2) {
                }
            }
        }
        cu0 = new cu0(this, f61);
        Object obj42 = cu0.z;
        i = cu0.B;
        sv1 = null;
        Object obj52 = vs7.a;
        obj2 = p81.w;
        if (i != 0) {
        }
        cu0.B = 2;
        e81 r2 = cu0.r();
        r16.x(r2);
        a0 = rc9.a0(cu0);
        if (a0 instanceof sv1) {
        }
        if (sv1 != null) {
        }
        obj3 = obj52;
        if (obj3 != obj2) {
        }
        if (obj3 == obj2) {
        }
    }
}
