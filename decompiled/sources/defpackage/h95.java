package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;

/* renamed from: h95  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h95 {
    public static final List b;
    public static final h95 c;
    public static final ts2 d;
    public final ww3 a;

    static {
        Class<qa2> cls = qa2.class;
        b = dt0.b1(ServiceLoader.load(cls, cls.getClassLoader()));
        ts2 ts2 = new ts2(5);
        d = ts2;
        c = new h95(ts2);
    }

    public h95(ww3 ww3) {
        if (ww3 != null) {
            this.a = ww3;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 11 || i3 == 12 || i3 == 16 || i3 == 21 || i3 == 93 || i3 == 96 || i3 == 101 || i3 == 42 || i3 == 43)) {
            switch (i3) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i3) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i3) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i3) {
                                        case 88:
                                        case 89:
                                        case 90:
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
        if (!(i3 == 11 || i3 == 12 || i3 == 16 || i3 == 21 || i3 == 93 || i3 == 96 || i3 == 101 || i3 == 42 || i3 == 43)) {
            switch (i3) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i3) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i3) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i3) {
                                        case 88:
                                        case 89:
                                        case 90:
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
        switch (i3) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case h75.g:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case h75.h:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
        }
        if (i3 == 11 || i3 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i3 != 16) {
            if (i3 != 21) {
                if (i3 == 93) {
                    objArr[1] = "getMinimalModality";
                } else if (i3 == 96) {
                    objArr[1] = "filterVisibleFakeOverrides";
                } else if (i3 != 101) {
                    if (i3 != 42 && i3 != 43) {
                        switch (i3) {
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                                break;
                            default:
                                switch (i3) {
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                        objArr[1] = "isOverridableByWithoutExternalConditions";
                                        break;
                                    default:
                                        switch (i3) {
                                            case 78:
                                            case 79:
                                            case 80:
                                            case 81:
                                            case 82:
                                                objArr[1] = "selectMostSpecificMember";
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                        objArr[1] = "determineModalityForFakeOverride";
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        objArr[1] = "createTypeCheckerState";
                    }
                } else {
                    objArr[1] = "extractMembersOverridableInBothWays";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = "getOverriddenDeclarations";
        }
        switch (i3) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
                objArr[2] = "overrides";
                break;
            case h75.g:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case h75.h:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 11 || i3 == 12 || i3 == 16 || i3 == 21 || i3 == 93 || i3 == 96 || i3 == 101 || i3 == 42 || i3 == 43)) {
            switch (i3) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i3) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i3) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i3) {
                                        case 88:
                                        case 89:
                                        case 90:
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

    public static boolean b(vw3 vw3, vw3 vw32, uo7 uo7) {
        if (vw3 == null) {
            a(44);
            throw null;
        } else if (vw32 == null) {
            a(45);
            throw null;
        } else if (!gr8.N(vw3) || !gr8.N(vw32)) {
            return td0.v(uo7, vw3.n0(), vw32.n0());
        } else {
            return true;
        }
    }

    public static void c(ri0 ri0, LinkedHashSet linkedHashSet) {
        if (ri0 == null) {
            a(17);
            throw null;
        } else if (ri0.u() != 2) {
            linkedHashSet.add(ri0);
        } else if (!ri0.s().isEmpty()) {
            for (ri0 c2 : ri0.s()) {
                c(c2, linkedHashSet);
            }
        } else {
            ku4.t("No overridden descriptors found for (fake override) ", ri0);
        }
    }

    public static ArrayList d(pi0 pi0) {
        qz3 b0 = pi0.b0();
        ArrayList arrayList = new ArrayList();
        if (b0 != null) {
            arrayList.add(b0.b());
        }
        for (h28 b2 : pi0.S()) {
            arrayList.add(b2.b());
        }
        return arrayList;
    }

    public static void e(Collection<ri0> collection, ql4 ql4, t49 t49) {
        fl4 fl4;
        fl4 fl42;
        fl4 fl43;
        us1 us1;
        if (collection == null) {
            a(83);
            throw null;
        } else if (ql4 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : collection) {
                ri0 ri0 = (ri0) next;
                if (!vs1.e(ri0.f()) && vs1.f(ri0, ql4)) {
                    arrayList.add(next);
                }
            }
            boolean isEmpty = arrayList.isEmpty();
            if (!isEmpty) {
                collection = arrayList;
            }
            Iterator it = collection.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                if (it.hasNext()) {
                    ri0 ri02 = (ri0) it.next();
                    int ordinal = ri02.o().ordinal();
                    if (ordinal == 0) {
                        fl43 = fl4.x;
                        break;
                    } else if (ordinal == 1) {
                        ku4.t("Member cannot have SEALED modality: ", ri02);
                        return;
                    } else if (ordinal == 2) {
                        z2 = true;
                    } else if (ordinal == 3) {
                        z3 = true;
                    }
                } else {
                    boolean H = ql4.H();
                    fl4 fl44 = fl4.A;
                    if (!(!H || ql4.o() == fl44 || ql4.o() == fl4.y)) {
                        z = true;
                    }
                    if (!z2 || z3) {
                        if (z2 || !z3) {
                            HashSet<ri0> hashSet = new HashSet<>();
                            for (ri0 ri03 : collection) {
                                if (ri03 != null) {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    c(ri03, linkedHashSet);
                                    hashSet.addAll(linkedHashSet);
                                } else {
                                    a(15);
                                    throw null;
                                }
                            }
                            if (!hashSet.isEmpty()) {
                                vj1 vj1 = (vj1) hashSet.iterator().next();
                                int i = ts1.a;
                                vj1.getClass();
                                sl4 c2 = rs1.c(vj1);
                                c2.getClass();
                                if (c2.Z(bx3.a) != null) {
                                    ku4.a();
                                    return;
                                }
                            }
                            if (hashSet.size() > 1) {
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                Iterator it2 = hashSet.iterator();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    Iterator it3 = linkedHashSet2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            linkedHashSet2.add(next2);
                                            break;
                                        }
                                        pi0 pi0 = (pi0) next2;
                                        pi0 pi02 = (pi0) it3.next();
                                        if (q(pi0, pi02)) {
                                            it3.remove();
                                        } else if (q(pi02, pi0)) {
                                            break;
                                        }
                                    }
                                }
                                hashSet = linkedHashSet2;
                            }
                            fl4 o = ql4.o();
                            if (o != null) {
                                fl4 = fl44;
                                for (ri0 ri04 : hashSet) {
                                    if (!z || ri04.o() != fl44) {
                                        fl42 = ri04.o();
                                    } else {
                                        fl42 = o;
                                    }
                                    if (fl42.compareTo(fl4) < 0) {
                                        fl4 = fl42;
                                    }
                                }
                            } else {
                                a(92);
                                throw null;
                            }
                        } else {
                            if (z) {
                                fl4 = ql4.o();
                            } else {
                                fl4 = fl44;
                            }
                            if (fl4 == null) {
                                a(90);
                                throw null;
                            }
                        }
                        fl43 = fl4;
                    } else {
                        fl43 = fl4.z;
                    }
                }
            }
            if (isEmpty) {
                us1 = vs1.h;
            } else {
                us1 = vs1.g;
            }
            ri0 e0 = ((ri0) s(collection, new e18(7))).e0(ql4, fl43, us1);
            t49.b0(e0, collection);
            t49.o(e0);
        } else {
            a(84);
            throw null;
        }
    }

    public static ArrayList g(Object obj, LinkedList linkedList, vr2 vr2, vr2 vr22) {
        if (obj != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            pi0 pi0 = (pi0) vr2.y(obj);
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                pi0 pi02 = (pi0) vr2.y(next);
                if (obj == next) {
                    it.remove();
                } else {
                    int j = j(pi0, pi02);
                    if (j == 1) {
                        arrayList.add(next);
                        it.remove();
                    } else if (j == 3) {
                        vr22.y(next);
                        it.remove();
                    }
                }
            }
            return arrayList;
        }
        a(97);
        throw null;
    }

    public static g95 i(pi0 pi0, pi0 pi02) {
        boolean z;
        boolean z2;
        g95 g95;
        if (pi0 == null) {
            a(38);
            throw null;
        } else if (pi02 != null) {
            boolean z3 = pi0 instanceof xs2;
            if ((z3 && !(pi02 instanceof xs2)) || (((z = pi0 instanceof cr5)) && !(pi02 instanceof cr5))) {
                return g95.c("Member kind mismatch");
            }
            if (!z3 && !z) {
                kj6.o("This type of CallableDescriptor cannot be checked for overridability: ", pi0);
                return null;
            } else if (!pi0.getName().equals(pi02.getName())) {
                return g95.c("Name mismatch");
            } else {
                boolean z4 = false;
                if (pi0.b0() == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (pi02.b0() == null) {
                    z4 = true;
                }
                if (z2 != z4) {
                    g95 = g95.c("Receiver presence mismatch");
                } else if (pi0.S().size() != pi02.S().size()) {
                    g95 = g95.c("Value parameter number mismatch");
                } else {
                    g95 = null;
                }
                if (g95 != null) {
                    return g95;
                }
                return null;
            }
        } else {
            a(39);
            throw null;
        }
    }

    public static int j(pi0 pi0, pi0 pi02) {
        h95 h95 = c;
        int b2 = h95.l(pi02, pi0, (ql4) null).b();
        int b3 = h95.m(pi0, pi02, (ql4) null, false).b();
        if (b2 == 1 && b3 == 1) {
            return 1;
        }
        if (b2 == 3 || b3 == 3) {
            return 3;
        }
        return 2;
    }

    public static boolean k(pi0 pi0, pi0 pi02) {
        boolean z;
        if (pi0 == null) {
            a(65);
            throw null;
        } else if (pi02 != null) {
            vw3 k = pi0.k();
            vw3 k2 = pi02.k();
            if (p(pi0, pi02)) {
                uo7 f = c.f(pi0.getTypeParameters(), pi02.getTypeParameters());
                if (pi0 instanceof xs2) {
                    return o(pi0, k, pi02, k2, f);
                }
                if (pi0 instanceof cr5) {
                    cr5 cr5 = (cr5) pi0;
                    cr5 cr52 = (cr5) pi02;
                    jr5 d2 = cr5.d();
                    jr5 d3 = cr52.d();
                    if (d2 == null || d3 == null) {
                        z = true;
                    } else {
                        z = p(d2, d3);
                    }
                    if (z) {
                        if (cr5.a0() && cr52.a0()) {
                            return td0.v(f, k.n0(), k2.n0());
                        }
                        if ((cr5.a0() || !cr52.a0()) && o(pi0, k, pi02, k2, f)) {
                            return true;
                        }
                    }
                } else {
                    ta1.h("Unexpected callable: ", pi0.getClass());
                    return false;
                }
            }
            return false;
        } else {
            a(66);
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static boolean o(pi0 pi0, vw3 vw3, pi0 pi02, vw3 vw32, uo7 uo7) {
        Boolean bool = null;
        if (pi0 == null) {
            a(71);
            throw null;
        } else if (vw3 == null) {
            a(72);
            throw null;
        } else if (pi02 == null) {
            a(73);
            throw null;
        } else if (vw32 != null) {
            du7 n0 = vw3.n0();
            du7 n02 = vw32.n0();
            eq7 eq7 = uo7.c;
            if (n0 == n02) {
                return true;
            }
            gs2 O = eq7.O();
            if (O != null) {
                bool = O.H(n0, n02);
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return td0.x.r(uo7, eq7, n0, n02);
        } else {
            a(74);
            throw null;
        }
    }

    public static boolean p(pi0 pi0, pi0 pi02) {
        if (pi0 == null) {
            a(67);
            throw null;
        } else if (pi02 != null) {
            Integer b2 = vs1.b(pi0.f(), pi02.f());
            if (b2 == null || b2.intValue() >= 0) {
                return true;
            }
            return false;
        } else {
            a(68);
            throw null;
        }
    }

    public static boolean q(pi0 pi0, pi0 pi02) {
        pe2 pe2 = pe2.C;
        if (pi0 == null) {
            a(13);
            throw null;
        } else if (pi02 == null) {
            a(14);
            throw null;
        } else if (!pi0.equals(pi02) && pe2.o(pi0.a(), pi02.a(), false)) {
            return true;
        } else {
            pi0 a2 = pi02.a();
            int i = rs1.a;
            LinkedHashSet<pi0> linkedHashSet = new LinkedHashSet<>();
            rs1.b(pi0.a(), linkedHashSet);
            for (pi0 o : linkedHashSet) {
                if (pe2.o(a2, o, false)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fc  */
    public static void r(ri0 ri0, vr2 vr2) {
        us1 us1;
        us1 us12;
        vr2 vr22;
        us1 us13;
        if (ri0 != null) {
            for (ri0 ri02 : ri0.s()) {
                if (ri02.f() == vs1.g) {
                    r(ri02, vr2);
                }
            }
            if (ri0.f() == vs1.g) {
                Collection s = ri0.s();
                if (s != null) {
                    if (s.isEmpty()) {
                        us1 = vs1.j;
                    } else {
                        Iterator it = s.iterator();
                        loop1:
                        while (true) {
                            us13 = null;
                            while (true) {
                                if (!it.hasNext()) {
                                    break loop1;
                                }
                                us1 f = ((ri0) it.next()).f();
                                if (us13 != null) {
                                    Integer b2 = vs1.b(f, us13);
                                    if (b2 != null) {
                                        if (b2.intValue() <= 0) {
                                        }
                                    }
                                }
                                us13 = f;
                            }
                        }
                        if (us13 != null) {
                            Iterator it2 = s.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    us1 = us13;
                                    break;
                                }
                                Integer b3 = vs1.b(us13, ((ri0) it2.next()).f());
                                if (b3 != null) {
                                    if (b3.intValue() < 0) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        us1 = null;
                    }
                    if (us1 != null) {
                        if (ri0.u() == 2) {
                            Iterator it3 = s.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                ri0 ri03 = (ri0) it3.next();
                                if (ri03.o() != fl4.A && !ri03.f().equals(us1)) {
                                    break;
                                }
                            }
                        } else {
                            us1 = vs1.g(us1.a.l());
                        }
                        if (us1 != null) {
                            if (vr2 != null) {
                                vr2.y(ri0);
                            }
                            us12 = vs1.e;
                        } else {
                            us12 = us1;
                        }
                        if (!(ri0 instanceof er5)) {
                            er5 er5 = (er5) ri0;
                            if (us12 != null) {
                                er5.F = us12;
                                Iterator it4 = ((cr5) ri0).y().iterator();
                                while (it4.hasNext()) {
                                    ar5 ar5 = (ar5) it4.next();
                                    if (us1 == null) {
                                        vr22 = null;
                                    } else {
                                        vr22 = vr2;
                                    }
                                    r(ar5, vr22);
                                }
                                return;
                            }
                            er5.v0(20);
                            throw null;
                        } else if (ri0 instanceof zs2) {
                            zs2 zs2 = (zs2) ri0;
                            if (us12 != null) {
                                zs2.H = us12;
                                return;
                            } else {
                                zs2.v0(10);
                                throw null;
                            }
                        } else {
                            ar5 ar52 = (ar5) ri0;
                            ar52.G = us12;
                            if (us12 != ar52.f1().f()) {
                                ar52.A = false;
                                return;
                            }
                            return;
                        }
                    }
                    us1 = null;
                    if (us1 != null) {
                    }
                    if (!(ri0 instanceof er5)) {
                    }
                } else {
                    a(107);
                    throw null;
                }
            }
        } else {
            a(105);
            throw null;
        }
    }

    public static Object s(Collection collection, vr2 vr2) {
        Object obj;
        if (collection.size() == 1) {
            Object v0 = dt0.v0(collection);
            if (v0 != null) {
                return v0;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(et0.e0(collection, 10));
        for (Object y : collection) {
            arrayList2.add(vr2.y(y));
        }
        Object v02 = dt0.v0(collection);
        pi0 pi0 = (pi0) vr2.y(v02);
        for (Object next : collection) {
            pi0 pi02 = (pi0) vr2.y(next);
            if (pi02 != null) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!k(pi02, (pi0) it.next())) {
                            break;
                        }
                    } else {
                        arrayList.add(next);
                        break;
                    }
                }
                if (k(pi02, pi0) && !k(pi0, pi02)) {
                    v02 = next;
                }
            } else {
                a(69);
                throw null;
            }
        }
        if (arrayList.isEmpty()) {
            if (v02 != null) {
                return v02;
            }
            a(79);
            throw null;
        } else if (arrayList.size() == 1) {
            Object v03 = dt0.v0(arrayList);
            if (v03 != null) {
                return v03;
            }
            a(80);
            throw null;
        } else {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                vw3 k = ((pi0) vr2.y(obj)).k();
                k.getClass();
                if (!(k.n0() instanceof zg2)) {
                    break;
                }
            }
            if (obj != null) {
                return obj;
            }
            Object v04 = dt0.v0(arrayList);
            if (v04 != null) {
                return v04;
            }
            a(82);
            throw null;
        }
    }

    public final uo7 f(List list, List list2) {
        ax3 ax3 = ax3.p;
        s3 s3Var = s3.x;
        if (list == null) {
            a(40);
            throw null;
        } else if (list2 != null) {
            boolean isEmpty = list.isEmpty();
            ww3 ww3 = this.a;
            if (isEmpty) {
                return new uo7(true, true, true, new hv2((HashMap) null, ww3), s3Var, ax3);
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                hashMap.put(((qp7) list.get(i)).n(), ((qp7) list2.get(i)).n());
            }
            return new uo7(true, true, true, new hv2(hashMap, ww3), s3Var, ax3);
        } else {
            a(41);
            throw null;
        }
    }

    public final void h(uq4 uq4, Collection collection, Collection collection2, ql4 ql4, t49 t49) {
        Integer b2;
        boolean z;
        if (uq4 == null) {
            a(50);
            throw null;
        } else if (collection == null) {
            a(51);
            throw null;
        } else if (collection2 == null) {
            a(52);
            throw null;
        } else if (ql4 != null) {
            LinkedHashSet<ri0> linkedHashSet = new LinkedHashSet<>(collection);
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                ri0 ri0 = (ri0) it.next();
                if (ri0 != null) {
                    ArrayList arrayList = new ArrayList(collection.size());
                    int i = wv6.y;
                    wv6 f = ub5.f();
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        ri0 ri02 = (ri0) it2.next();
                        int b3 = l(ri02, ri0, ql4).b();
                        if (vs1.e(ri02.f()) || !vs1.f(ri02, ri0)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        int B = b81.B(b3);
                        if (B == 0) {
                            if (z) {
                                f.add(ri02);
                            }
                            arrayList.add(ri02);
                        } else if (B == 2) {
                            if (z) {
                                t49.z(ri02, ri0);
                            }
                            arrayList.add(ri02);
                        }
                    }
                    t49.b0(ri0, f);
                    linkedHashSet.removeAll(arrayList);
                } else {
                    a(57);
                    throw null;
                }
            }
            if (linkedHashSet.size() >= 2) {
                vj1 r = ((ri0) linkedHashSet.iterator().next()).r();
                if (!linkedHashSet.isEmpty()) {
                    for (ri0 r2 : linkedHashSet) {
                        if (r2.r() != r) {
                            LinkedList<ri0> linkedList = new LinkedList<>(linkedHashSet);
                            while (!linkedList.isEmpty()) {
                                linkedList.isEmpty();
                                ri0 ri03 = null;
                                for (ri0 ri04 : linkedList) {
                                    if (ri03 == null || ((b2 = vs1.b(ri03.f(), ri04.f())) != null && b2.intValue() < 0)) {
                                        ri03 = ri04;
                                    }
                                }
                                ri03.getClass();
                                e(g(ri03, linkedList, new e18(8), new e3(19, (Object) t49, (Object) ri03)), ql4, t49);
                            }
                            return;
                        }
                    }
                }
            }
            for (ri0 singleton : linkedHashSet) {
                e(Collections.singleton(singleton), ql4, t49);
            }
        } else {
            a(53);
            throw null;
        }
    }

    public final g95 l(pi0 pi0, pi0 pi02, ql4 ql4) {
        if (pi0 == null) {
            a(19);
            throw null;
        } else if (pi02 != null) {
            return m(pi0, pi02, ql4, false);
        } else {
            a(20);
            throw null;
        }
    }

    public final g95 m(pi0 pi0, pi0 pi02, ql4 ql4, boolean z) {
        boolean z2;
        if (pi0 == null) {
            a(22);
            throw null;
        } else if (pi02 != null) {
            g95 n = n(pi0, pi02, z);
            if (n.b() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            List<qa2> list = b;
            for (qa2 qa2 : list) {
                if (qa2.a() != 1 && (!z2 || qa2.a() != 2)) {
                    int B = b81.B(qa2.b(pi0, pi02, ql4));
                    if (B == 0) {
                        z2 = true;
                    } else if (B == 1) {
                        return g95.c("External condition");
                    }
                }
            }
            if (!z2) {
                return n;
            }
            for (qa2 qa22 : list) {
                if (qa22.a() == 1) {
                    int B2 = b81.B(qa22.b(pi0, pi02, ql4));
                    if (B2 == 0) {
                        h.k(qa22.getClass().getName(), " condition. It's not supposed to end with success", "Contract violation in ");
                        return null;
                    } else if (B2 == 1) {
                        return g95.c("External condition");
                    }
                }
            }
            g95 g95 = g95.c;
            if (g95 != null) {
                return g95;
            }
            g95.a(0);
            throw null;
        } else {
            a(23);
            throw null;
        }
    }

    public final g95 n(pi0 pi0, pi0 pi02, boolean z) {
        boolean z2;
        Boolean bool;
        pi0 pi03 = pi0;
        pi0 pi04 = pi02;
        if (pi03 == null) {
            a(28);
            throw null;
        } else if (pi04 != null) {
            g95 i = i(pi0, pi02);
            if (i != null) {
                return i;
            }
            ArrayList d2 = d(pi03);
            ArrayList d3 = d(pi04);
            List typeParameters = pi03.getTypeParameters();
            List typeParameters2 = pi04.getTypeParameters();
            if (typeParameters.size() != typeParameters2.size()) {
                for (int i2 = 0; i2 < d2.size(); i2++) {
                    if (!xw3.a.a((vw3) d2.get(i2), (vw3) d3.get(i2))) {
                        return g95.c("Type parameter number mismatch");
                    }
                }
                return new g95(3, "Type parameter number mismatch");
            }
            uo7 f = f(typeParameters, typeParameters2);
            int i3 = 0;
            while (i3 < typeParameters.size()) {
                qp7 qp7 = (qp7) typeParameters.get(i3);
                qp7 qp72 = (qp7) typeParameters2.get(i3);
                if (qp7 == null) {
                    a(47);
                    throw null;
                } else if (qp72 != null) {
                    List<vw3> upperBounds = qp7.getUpperBounds();
                    ArrayList arrayList = new ArrayList(qp72.getUpperBounds());
                    if (upperBounds.size() == arrayList.size()) {
                        for (vw3 vw3 : upperBounds) {
                            ListIterator listIterator = arrayList.listIterator();
                            while (listIterator.hasNext()) {
                                if (b(vw3, (vw3) listIterator.next(), f)) {
                                    listIterator.remove();
                                }
                            }
                        }
                        i3++;
                    }
                    return g95.c("Type parameter bounds mismatch");
                } else {
                    a(48);
                    throw null;
                }
            }
            for (int i4 = 0; i4 < d2.size(); i4++) {
                if (!b((vw3) d2.get(i4), (vw3) d3.get(i4), f)) {
                    return g95.c("Value parameter type mismatch");
                }
            }
            if ((pi03 instanceof xs2) && (pi04 instanceof xs2) && ((xs2) pi03).i() != ((xs2) pi04).i()) {
                return new g95(3, "Incompatible suspendability");
            }
            if (z) {
                vw3 k = pi03.k();
                vw3 k2 = pi04.k();
                if (!(k == null || k2 == null || (gr8.N(k2) && gr8.N(k)))) {
                    du7 n0 = k2.n0();
                    du7 n02 = k.n0();
                    eq7 eq7 = f.c;
                    if (n0 == n02) {
                        z2 = true;
                    } else {
                        gs2 O = eq7.O();
                        if (O != null) {
                            bool = (Boolean) O.H(n0, n02);
                        } else {
                            bool = null;
                        }
                        if (bool != null) {
                            z2 = bool.booleanValue();
                        } else {
                            z2 = td0.x.r(f, eq7, n0, n02);
                        }
                    }
                    if (!z2) {
                        return new g95(3, "Return type mismatch");
                    }
                }
            }
            g95 g95 = g95.c;
            if (g95 != null) {
                return g95;
            }
            g95.a(0);
            throw null;
        } else {
            a(29);
            throw null;
        }
    }
}
