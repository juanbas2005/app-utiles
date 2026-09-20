package defpackage;

/* renamed from: us1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class us1 {
    public final h8 a;
    public final /* synthetic */ int b;

    public us1(h8 h8Var, int i) {
        this.b = i;
        h8Var.getClass();
        this.a = h8Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0226 A[LOOP:1: B:113:0x0226->B:124:0x0257, LOOP_START, PHI: r12 
      PHI: (r12v1 vj1) = (r12v0 vj1), (r12v2 vj1) binds: [B:112:0x0223, B:124:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    public final boolean a(xx5 xx5, ak1 ak1, vj1 vj1) {
        vj1 vj12;
        vj1 h;
        ak1 ak12;
        ql4 ql4;
        Class<ql4> cls = ql4.class;
        switch (this.b) {
            case b85.b:
                if (vj1 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"}));
                } else if (rs1.q(ak1) && rs1.e(vj1) != me6.M) {
                    return vs1.d(ak1, vj1);
                } else {
                    if (ak1 instanceof s31) {
                        ((s31) ak1).r();
                    }
                    vj1 vj13 = ak1;
                    while (vj13 != null) {
                        vj1 r = vj13.r();
                        if (!(r instanceof ql4) || rs1.k(r)) {
                            boolean z = r instanceof x95;
                            vj13 = r;
                            if (z) {
                                vj12 = r;
                                if (vj12 == null) {
                                    return false;
                                }
                                while (vj1 != null) {
                                    if (vj12 != vj1) {
                                        if (!(vj1 instanceof x95)) {
                                            vj1 = vj1.r();
                                        } else if (!(vj12 instanceof x95) || !((y95) ((x95) vj12)).A.equals(((y95) ((x95) vj1)).A) || !rs1.c(vj1).equals(rs1.c(vj12))) {
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                                return false;
                            }
                        } else {
                            vj12 = r;
                            if (vj12 == null) {
                            }
                        }
                    }
                    vj12 = vj13;
                    if (vj12 == null) {
                    }
                }
                break;
            case 1:
                if (vj1 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"}));
                } else if (!vs1.a.a(xx5, ak1, vj1)) {
                    return false;
                } else {
                    if (xx5 == vs1.l) {
                        return true;
                    }
                    if (xx5 == vs1.k || (h = rs1.h(ak1, cls, true)) == null || !(xx5 instanceof w93)) {
                        return false;
                    }
                    return ((w93) xx5).w.a().equals(h.a());
                }
            case 2:
                if (vj1 != null) {
                    ql4 ql42 = (ql4) rs1.h(ak1, cls, true);
                    ql4 ql43 = (ql4) rs1.h(vj1, cls, false);
                    if (ql43 == null) {
                        return false;
                    }
                    if (ql42 == null || !rs1.k(ql42) || (ql4 = (ql4) rs1.h(ql42, cls, true)) == null || !rs1.p(ql43.g0(), ql4.a())) {
                        if (ak1 instanceof ri0) {
                            ak12 = rs1.r((ri0) ak1);
                        } else {
                            ak12 = ak1;
                        }
                        ql4 ql44 = (ql4) rs1.h(ak12, cls, true);
                        if (ql44 == null) {
                            return false;
                        }
                        if (rs1.p(ql43.g0(), ql44.a()) && xx5 != vs1.m) {
                            if ((ak12 instanceof ri0) && !(ak12 instanceof s31) && xx5 != vs1.l) {
                                if (!(xx5 == vs1.k || xx5 == null)) {
                                    vw3 b2 = xx5.b();
                                    if (!rs1.p(b2, ql43)) {
                                        b2.n0();
                                    }
                                }
                            }
                        }
                        return a(xx5, ak1, ql43.r());
                    }
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"}));
            case 3:
                if (vj1 != null) {
                    if (!rs1.c(vj1).F(rs1.c(ak1))) {
                        return false;
                    }
                    vs1.n.getClass();
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"}));
            case 4:
                if (vj1 != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"}));
            case 5:
                if (vj1 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"}));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                if (vj1 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"}));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 7:
                if (vj1 != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"}));
            case 8:
                if (vj1 != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"}));
            case 9:
                if (vj1 != null) {
                    return ni3.c(ak1, vj1);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"}));
            case 10:
                if (vj1 != null) {
                    return ni3.b(xx5, ak1, vj1);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"}));
            default:
                if (vj1 != null) {
                    return ni3.b(xx5, ak1, vj1);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"}));
        }
    }

    public final String toString() {
        return this.a.d();
    }
}
