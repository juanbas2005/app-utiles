package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* renamed from: rs1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class rs1 {
    public static final /* synthetic */ int a = 0;

    static {
        new up2("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case h75.g:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case h75.h:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case h75.g:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case h75.h:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public static void b(pi0 pi0, LinkedHashSet linkedHashSet) {
        if (pi0 == null) {
            a(72);
            throw null;
        } else if (!linkedHashSet.contains(pi0)) {
            for (pi0 a2 : pi0.a().s()) {
                pi0 a3 = a2.a();
                b(a3, linkedHashSet);
                linkedHashSet.add(a3);
            }
        }
    }

    public static sl4 c(vj1 vj1) {
        if (vj1 != null) {
            sl4 d = d(vj1);
            if (d != null) {
                return d;
            }
            a(22);
            throw null;
        }
        a(21);
        throw null;
    }

    public static sl4 d(vj1 vj1) {
        if (vj1 != null) {
            while (vj1 != null) {
                if (vj1 instanceof sl4) {
                    return (sl4) vj1;
                }
                if (vj1 instanceof v34) {
                    return ((v34) vj1).y;
                }
                vj1 = vj1.r();
            }
            return null;
        }
        a(23);
        throw null;
    }

    public static me6 e(vj1 vj1) {
        me6 me6 = me6.M;
        if (vj1 != null) {
            if (vj1 instanceof jr5) {
                vj1 = ((jr5) vj1).f1();
            }
            if (vj1 instanceof xj1) {
                ((xj1) vj1).e().getClass();
            }
            return me6;
        }
        a(81);
        throw null;
    }

    public static vp2 f(vj1 vj1) {
        if (vj1 != null) {
            up2 g = g(vj1);
            if (g != null) {
                return g.a;
            }
            return f(vj1.r()).a(vj1.getName());
        }
        a(2);
        throw null;
    }

    public static up2 g(vj1 vj1) {
        if (vj1 == null) {
            a(5);
            throw null;
        } else if ((vj1 instanceof sl4) || z62.f(vj1)) {
            return up2.c;
        } else {
            if (vj1 instanceof v34) {
                return ((v34) vj1).z;
            }
            if (vj1 instanceof x95) {
                return ((y95) ((x95) vj1)).A;
            }
            return null;
        }
    }

    public static vj1 h(vj1 vj1, Class cls, boolean z) {
        if (vj1 == null) {
            return null;
        }
        if (z) {
            vj1 = vj1.r();
        }
        while (vj1 != null) {
            if (cls.isInstance(vj1)) {
                return vj1;
            }
            vj1 = vj1.r();
        }
        return null;
    }

    public static ql4 i(ql4 ql4) {
        if (ql4 != null) {
            for (vw3 vw3 : ql4.n().e()) {
                if (vw3 != null) {
                    wo7 L = vw3.L();
                    if (L != null) {
                        ql4 ql42 = (ql4) L.u();
                        if (ql42 == null) {
                            a(47);
                            throw null;
                        } else if (ql42.v() != iq0.x) {
                            return ql42;
                        }
                    } else {
                        a(46);
                        throw null;
                    }
                } else {
                    a(45);
                    throw null;
                }
            }
            return null;
        }
        a(44);
        throw null;
    }

    public static boolean j(vj1 vj1) {
        if (!l(vj1, iq0.w) || !vj1.getName().equals(oz6.a)) {
            return false;
        }
        return true;
    }

    public static boolean k(vj1 vj1) {
        if (!l(vj1, iq0.B) || !((ql4) vj1).w0()) {
            return false;
        }
        return true;
    }

    public static boolean l(vj1 vj1, iq0 iq0) {
        if (!(vj1 instanceof ql4) || ((ql4) vj1).v() != iq0) {
            return false;
        }
        return true;
    }

    public static boolean m(vj1 vj1) {
        if (vj1 != null) {
            while (vj1 != null) {
                if (j(vj1) || ((vj1 instanceof ak1) && ((ak1) vj1).f() == vs1.f)) {
                    return true;
                }
                vj1 = vj1.r();
            }
            return false;
        }
        a(1);
        throw null;
    }

    public static boolean n(vw3 vw3, vj1 vj1) {
        if (vw3 == null) {
            a(30);
            throw null;
        } else if (vj1 != null) {
            vq0 u = vw3.L().u();
            if (u == null) {
                return false;
            }
            vj1 a2 = u.a();
            if (!(a2 instanceof vq0) || !(vj1 instanceof vq0) || !((vq0) vj1).n().equals(((vq0) a2).n())) {
                return false;
            }
            return true;
        } else {
            a(31);
            throw null;
        }
    }

    public static boolean o(vj1 vj1) {
        if ((l(vj1, iq0.w) || l(vj1, iq0.x)) && ((ql4) vj1).o() == fl4.y) {
            return true;
        }
        return false;
    }

    public static boolean p(vw3 vw3, vj1 vj1) {
        if (vw3 == null) {
            a(32);
            throw null;
        } else if (vj1 == null) {
            a(33);
            throw null;
        } else if (n(vw3, vj1)) {
            return true;
        } else {
            for (vw3 p : vw3.L().e()) {
                if (p(p, vj1)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean q(vj1 vj1) {
        if (vj1 == null || !(vj1.r() instanceof x95)) {
            return false;
        }
        return true;
    }

    public static ri0 r(ri0 ri0) {
        if (ri0 != null) {
            while (ri0.u() == 2) {
                Collection s = ri0.s();
                if (!s.isEmpty()) {
                    ri0 = (ri0) s.iterator().next();
                } else {
                    ku4.t("Fake override should have at least one overridden descriptor: ", ri0);
                    return null;
                }
            }
            return ri0;
        }
        a(58);
        throw null;
    }
}
