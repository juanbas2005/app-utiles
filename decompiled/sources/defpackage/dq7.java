package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: dq7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dq7 {
    public static final dq7 b = new dq7(bq7.a);
    public final bq7 a;

    public dq7(bq7 bq7) {
        this.a = bq7;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                case 12:
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                case 12:
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case h75.g /*15*/:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
            default:
                objArr[0] = "substitution";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i != 34) {
            if (i != 37) {
                switch (i) {
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    case 12:
                    case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                        objArr[1] = "safeSubstitute";
                        break;
                    default:
                        switch (i) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                objArr[1] = "unsafeSubstitute";
                                break;
                            default:
                                switch (i) {
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                        break;
                                    default:
                                        switch (i) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                break;
                                        }
                                }
                        }
                }
            }
            objArr[1] = "combine";
        } else {
            objArr[1] = "filterOutUnsafeVariance";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case h75.g /*15*/:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                case 12:
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public static k28 b(k28 k28, k28 k282) {
        if (k28 == null) {
            a(38);
            throw null;
        } else if (k282 != null) {
            k28 k283 = k28.y;
            if (k28 == k283) {
                if (k282 != null) {
                    return k282;
                }
                a(40);
                throw null;
            } else if (k282 == k283) {
                if (k28 != null) {
                    return k28;
                }
                a(41);
                throw null;
            } else if (k28 != k282) {
                throw new AssertionError("Variance conflict: type parameter variance '" + k28 + "' and projection kind '" + k282 + "' cannot be combined");
            } else if (k282 != null) {
                return k282;
            } else {
                a(42);
                throw null;
            }
        } else {
            a(39);
            throw null;
        }
    }

    public static int c(k28 k28, k28 k282) {
        k28 k283 = k28.A;
        k28 k284 = k28.z;
        if (k28 == k284 && k282 == k283) {
            return 3;
        }
        if (k28 == k283 && k282 == k284) {
            return 2;
        }
        return 1;
    }

    public static dq7 d(vw3 vw3) {
        if (vw3 != null) {
            return new dq7(yo7.b.f(vw3.L(), vw3.G()));
        }
        a(6);
        throw null;
    }

    public static dq7 e(bq7 bq7, bq7 bq72) {
        if (bq7 == null) {
            a(3);
            throw null;
        } else if (bq72 != null) {
            if (bq7.e()) {
                bq7 = bq72;
            } else if (!bq72.e()) {
                bq7 = new nv1(bq7, bq72);
            }
            return new dq7(bq7);
        } else {
            a(4);
            throw null;
        }
    }

    public static String g(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (!t49.S(th)) {
                return "[Exception while computing toString(): " + th + "]";
            }
            throw th;
        }
    }

    public final vw3 f(vw3 vw3, k28 k28) {
        if (vw3 == null) {
            a(9);
            throw null;
        } else if (this.a.e()) {
            return vw3;
        } else {
            try {
                vw3 b2 = i(new p27(vw3, k28), (qp7) null, 0).b();
                if (b2 != null) {
                    return b2;
                }
                a(12);
                throw null;
            } catch (cq7 e) {
                return z62.c(x62.G, e.getMessage());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [bq7, java.lang.Object] */
    public final vw3 h(vw3 vw3, k28 k28) {
        if (vw3 == null) {
            a(14);
            throw null;
        } else if (k28 != null) {
            bq7 bq7 = this.a;
            xp7 p27 = new p27(bq7.f(vw3, k28), k28);
            if (!bq7.e()) {
                try {
                    p27 = i(p27, (qp7) null, 0);
                } catch (cq7 unused) {
                    p27 = null;
                }
            }
            if (bq7.a() || bq7.b()) {
                boolean b2 = bq7.b();
                if (p27 != null) {
                    if (!p27.c()) {
                        vw3 b3 = p27.b();
                        b3.getClass();
                        if (iq7.c(b3, e7.I, (wv6) null)) {
                            k28 a2 = p27.a();
                            a2.getClass();
                            if (a2 == k28.A) {
                                p27 = new p27((vw3) h49.o(b3).b, a2);
                            } else if (b2) {
                                p27 = new p27((vw3) h49.o(b3).a, a2);
                            } else {
                                ? obj = new Object();
                                dq7 dq7 = new dq7(obj);
                                if (!obj.e()) {
                                    try {
                                        p27 = dq7.i(p27, (qp7) null, 0);
                                    } catch (cq7 unused2) {
                                    }
                                }
                            }
                        }
                    }
                }
                p27 = null;
            }
            if (p27 == null) {
                return null;
            }
            return p27.b();
        } else {
            a(15);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x028e, code lost:
        if (r0 != 2) goto L_0x02ae;
     */
    public final xp7 i(xp7 xp7, qp7 qp7, int i) {
        t tVar;
        fu6 fu6;
        char c;
        dq7 dq7;
        ad1 ad1;
        vw3 vw3;
        ad1 ad12;
        boolean z;
        dq7 dq72 = this;
        qp7 qp72 = qp7;
        int i2 = i;
        vw3 vw32 = null;
        if (xp7 != null) {
            bq7 bq7 = dq72.a;
            if (i2 <= 100) {
                if (!xp7.c()) {
                    vw3 b2 = xp7.b();
                    if (b2 instanceof kq7) {
                        kq7 kq7 = (kq7) b2;
                        du7 A = kq7.A();
                        vw3 l = kq7.l();
                        xp7 i3 = dq72.i(new p27(A, xp7.a()), qp72, i2 + 1);
                        if (i3.c()) {
                            return i3;
                        }
                        return new p27(ub5.t(i3.b().n0(), dq72.h(l, xp7.a())), i3.a());
                    }
                    b2.getClass();
                    b2.n0();
                    if (!(b2.n0() instanceof jw5)) {
                        xp7 d = bq7.d(b2);
                        if (d == null) {
                            d = null;
                        } else if (b2.getAnnotations().i(m27.y)) {
                            wo7 L = d.b().L();
                            if (L instanceof cz4) {
                                xp7 xp72 = ((cz4) L).w;
                                k28 a2 = xp72.a();
                                if (c(xp7.a(), a2) == 3) {
                                    d = new p27(xp72.b());
                                } else if (qp72 != null && c(qp72.I(), a2) == 3) {
                                    d = new p27(xp72.b());
                                }
                            }
                        }
                        k28 a3 = xp7.a();
                        int i4 = 0;
                        if (d == null && (b2.n0() instanceof zg2)) {
                            du7 n0 = b2.n0();
                            if (n0 instanceof ad1) {
                                ad12 = (ad1) n0;
                            } else {
                                ad12 = null;
                            }
                            if (ad12 != null) {
                                z = ad12.v();
                            } else {
                                z = false;
                            }
                            if (!z) {
                                zg2 zg2 = (zg2) b2.n0();
                                fu6 fu62 = zg2.y;
                                fu6 fu63 = zg2.x;
                                int i5 = i2 + 1;
                                xp7 i6 = dq72.i(new p27(fu63, a3), qp72, i5);
                                xp7 i7 = dq72.i(new p27(fu62, a3), qp72, i5);
                                k28 a4 = i6.a();
                                if (!(i6.b() == fu63 && i7.b() == fu62)) {
                                    return new p27(kl8.n(wn6.c(i6.b()), wn6.c(i7.b())), a4);
                                }
                            }
                        }
                        if (!fv3.F(b2) && !gr8.N(b2)) {
                            if (d != null) {
                                int c2 = c(a3, d.a());
                                if (!(b2.L() instanceof jl0)) {
                                    int B = b81.B(c2);
                                    if (B == 1) {
                                        return new p27(b2.L().g().p(), k28.A);
                                    }
                                    if (B == 2) {
                                        throw new Exception("Out-projection in in-position");
                                    }
                                }
                                du7 n02 = b2.n0();
                                if (n02 instanceof ad1) {
                                    ad1 = (ad1) n02;
                                } else {
                                    ad1 = null;
                                }
                                if (ad1 == null || !ad1.v()) {
                                    ad1 = null;
                                }
                                if (d.c()) {
                                    return d;
                                }
                                if (ad1 != null) {
                                    vw3 = ad1.t(d.b());
                                } else {
                                    vw3 = iq7.h(d.b(), b2.Q());
                                }
                                if (!b2.getAnnotations().isEmpty()) {
                                    rm c3 = bq7.c(b2.getAnnotations());
                                    if (c3 != null) {
                                        if (c3.i(m27.y)) {
                                            c3 = new yd2(c3, new e18(10));
                                        }
                                        vw3 = jb5.E(vw3, new tm(new rm[]{vw3.getAnnotations(), c3}));
                                    } else {
                                        a(33);
                                        throw null;
                                    }
                                }
                                if (c2 == 1) {
                                    a3 = b(a3, d.a());
                                }
                                return new p27(vw3, a3);
                            }
                            vw3 b3 = xp7.b();
                            k28 a5 = xp7.a();
                            if (!(b3.L().u() instanceof qp7)) {
                                du7 n03 = b3.n0();
                                if (n03 instanceof t) {
                                    tVar = (t) n03;
                                } else {
                                    tVar = null;
                                }
                                if (tVar != null) {
                                    fu6 = tVar.y;
                                } else {
                                    fu6 = null;
                                }
                                k28 k28 = k28.y;
                                if (fu6 != null) {
                                    if (bq7 instanceof ja3) {
                                        ja3 ja3 = (ja3) bq7;
                                        if (ja3.d) {
                                            dq7 = new dq7(new ja3(ja3.b, ja3.c, false));
                                            vw32 = dq7.h(fu6, k28);
                                        }
                                    }
                                    dq7 = dq72;
                                    vw32 = dq7.h(fu6, k28);
                                }
                                List parameters = b3.L().getParameters();
                                List G = b3.G();
                                ArrayList arrayList = new ArrayList(parameters.size());
                                boolean z2 = false;
                                while (i4 < parameters.size()) {
                                    qp7 qp73 = (qp7) parameters.get(i4);
                                    xp7 xp73 = (xp7) G.get(i4);
                                    xp7 i8 = dq72.i(xp73, qp73, i2 + 1);
                                    int B2 = b81.B(c(qp73.I(), i8.a()));
                                    if (B2 != 0) {
                                        if (B2 != 1) {
                                            c = 2;
                                        } else {
                                            c = 2;
                                        }
                                        i8 = iq7.j(qp73);
                                    } else {
                                        c = 2;
                                        if (qp73.I() != k28 && !i8.c()) {
                                            i8 = new p27(i8.b(), k28);
                                        }
                                    }
                                    if (i8 != xp73) {
                                        z2 = true;
                                    }
                                    arrayList.add(i8);
                                    i4++;
                                    dq72 = this;
                                    char c4 = c;
                                }
                                if (z2) {
                                    G = arrayList;
                                }
                                rm c5 = bq7.c(b3.getAnnotations());
                                G.getClass();
                                c5.getClass();
                                vw3 u = wn6.u(b3, G, c5, 4);
                                if ((u instanceof fu6) && (vw32 instanceof fu6)) {
                                    u = o85.y((fu6) u, (fu6) vw32);
                                }
                                return new p27(u, a5);
                            }
                        }
                    }
                }
                return xp7;
            }
            ku4.A("Recursion too deep. Most likely infinite loop while substituting ", g(xp7), "; substitution: ", g(bq7));
            return null;
        }
        a(18);
        throw null;
    }
}
