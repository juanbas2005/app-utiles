package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: iq7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class iq7 {
    public static final v62 a = z62.c(x62.H, new String[0]);
    public static final v62 b = z62.c(x62.E, new String[0]);
    public static final hq7 c = new hq7("NO_EXPECTED_TYPE");
    public static final hq7 d = new hq7("UNIT_EXPECTED_TYPE");

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 48 || i3 == 53 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 48 || i3 == 53 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 4:
            case 6:
            case 7:
            case 9:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case h75.g:
            case 17:
            case 19:
            case 26:
            case 35:
            case h75.h:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
            default:
                objArr[0] = "type";
                break;
        }
        if (i3 != 4) {
            if (i3 != 9) {
                if (i3 == 11 || i3 == 15) {
                    objArr[1] = "makeUnsubstitutedType";
                } else if (i3 == 17) {
                    objArr[1] = "getDefaultTypeProjections";
                } else if (i3 == 19) {
                    objArr[1] = "getImmediateSupertypes";
                } else if (i3 == 26) {
                    objArr[1] = "getAllSupertypes";
                } else if (i3 == 35) {
                    objArr[1] = "substituteProjectionsForParameters";
                } else if (i3 != 48) {
                    if (i3 != 53) {
                        if (!(i3 == 6 || i3 == 7)) {
                            switch (i3) {
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                    break;
                                default:
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                    break;
                            }
                        }
                    }
                    objArr[1] = "getPrimitiveNumberType";
                } else {
                    objArr[1] = "getDefaultPrimitiveNumberType";
                }
            }
            objArr[1] = "makeNullableIfNeeded";
        } else {
            objArr[1] = "makeNullableAsSpecified";
        }
        switch (i3) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case h75.g:
            case 17:
            case 19:
            case 26:
            case 35:
            case h75.h:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 48 || i3 == 53 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public static boolean b(vw3 vw3) {
        if (vw3 == null) {
            a(28);
            throw null;
        } else if (vw3.Q()) {
            return true;
        } else {
            if (!(vw3.n0() instanceof zg2) || !b(((zg2) vw3.n0()).y)) {
                return false;
            }
            return true;
        }
    }

    public static boolean c(vw3 vw3, vr2 vr2, wv6 wv6) {
        zg2 zg2;
        if (vw3 == null) {
            return false;
        }
        du7 n0 = vw3.n0();
        if (l(vw3)) {
            return ((Boolean) vr2.y(n0)).booleanValue();
        }
        if (wv6 != null && wv6.contains(vw3)) {
            return false;
        }
        if (((Boolean) vr2.y(n0)).booleanValue()) {
            return true;
        }
        if (wv6 == null) {
            int i = wv6.y;
            wv6 = ub5.f();
        }
        wv6.add(vw3);
        if (n0 instanceof zg2) {
            zg2 = (zg2) n0;
        } else {
            zg2 = null;
        }
        if (zg2 != null && (c(zg2.x, vr2, wv6) || c(zg2.y, vr2, wv6))) {
            return true;
        }
        if ((n0 instanceof qo1) && c(((qo1) n0).x, vr2, wv6)) {
            return true;
        }
        wo7 L = vw3.L();
        if (L instanceof gg3) {
            for (vw3 c2 : ((gg3) L).x) {
                if (c(c2, vr2, wv6)) {
                    return true;
                }
            }
            return false;
        }
        for (xp7 xp7 : vw3.G()) {
            if (!xp7.c() && c(xp7.b(), vr2, wv6)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new p27((vw3) ((qp7) it.next()).g0()));
            }
            return dt0.b1(arrayList);
        }
        a(16);
        throw null;
    }

    public static boolean e(vw3 vw3) {
        vw3 vw32;
        if (vw3 == null) {
            a(27);
            throw null;
        } else if (vw3.Q() || ((vw3.n0() instanceof zg2) && e(((zg2) vw3.n0()).y))) {
            return true;
        } else {
            if (!(vw3.n0() instanceof qo1)) {
                if (f(vw3)) {
                    if (!(vw3.L().u() instanceof ql4)) {
                        dq7 d2 = dq7.d(vw3);
                        Collection<vw3> e = vw3.L().e();
                        ArrayList arrayList = new ArrayList(e.size());
                        for (vw3 vw33 : e) {
                            if (vw33 != null) {
                                vw3 h = d2.h(vw33, k28.y);
                                if (h != null) {
                                    vw32 = h(h, vw3.Q());
                                } else {
                                    vw32 = null;
                                }
                                if (vw32 != null) {
                                    arrayList.add(vw32);
                                }
                            } else {
                                a(21);
                                throw null;
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((vw3) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                wo7 L = vw3.L();
                if (L instanceof gg3) {
                    for (vw3 e2 : ((gg3) L).x) {
                        if (e(e2)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public static boolean f(vw3 vw3) {
        qp7 qp7 = null;
        if (vw3 != null) {
            if (vw3.L().u() instanceof qp7) {
                qp7 = (qp7) vw3.L().u();
            }
            if (qp7 != null) {
                return true;
            }
            vw3.L();
            return false;
        }
        a(60);
        throw null;
    }

    public static du7 g(vw3 vw3, boolean z) {
        if (vw3 != null) {
            du7 o0 = vw3.n0().o0(z);
            if (o0 != null) {
                return o0;
            }
            a(4);
            throw null;
        }
        a(3);
        throw null;
    }

    public static vw3 h(vw3 vw3, boolean z) {
        if (vw3 == null) {
            a(8);
            throw null;
        } else if (z) {
            return g(vw3, true);
        } else {
            return vw3;
        }
    }

    public static fu6 i(fu6 fu6, boolean z) {
        if (fu6 == null) {
            a(5);
            throw null;
        } else if (!z) {
            return fu6;
        } else {
            fu6 w0 = fu6.o0(true);
            if (w0 != null) {
                return w0;
            }
            a(6);
            throw null;
        }
    }

    public static p27 j(qp7 qp7) {
        if (qp7 != null) {
            return new p27(qp7);
        }
        a(45);
        throw null;
    }

    public static xp7 k(qp7 qp7, wj3 wj3) {
        if (qp7 == null) {
            a(46);
            throw null;
        } else if (wj3.a == fq7.w) {
            return new p27(fb5.u(qp7));
        } else {
            return new p27(qp7);
        }
    }

    public static boolean l(vw3 vw3) {
        if (vw3 == null) {
            a(0);
            throw null;
        } else if (vw3 == c || vw3 == d) {
            return true;
        } else {
            return false;
        }
    }
}
