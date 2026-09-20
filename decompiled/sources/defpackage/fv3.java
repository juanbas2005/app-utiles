package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: fv3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fv3 {
    public static final uq4 e = uq4.g("<built-ins module>");
    public tl4 a;
    public final ib4 b;
    public final fb4 c;
    public final kb4 d;

    /* JADX WARNING: type inference failed for: r2v0, types: [ib4, hb4] */
    public fv3(kb4 kb4) {
        this.d = kb4;
        kb4.a(new dv3(this, 0));
        this.b = new hb4(kb4, new dv3(this, 1));
        this.c = kb4.b(new nm(this, 1));
    }

    public static boolean A(vj1 vj1) {
        if (vj1 == null) {
            a(9);
            throw null;
        } else if (rs1.h(vj1, rd0.class, false) != null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean B(vw3 vw3, vp2 vp2) {
        if (vw3 == null) {
            a(97);
            throw null;
        } else if (vp2 != null) {
            return I(vw3.L(), vp2);
        } else {
            a(98);
            throw null;
        }
    }

    public static boolean C(vw3 vw3, vp2 vp2) {
        if (vp2 == null) {
            a(135);
            throw null;
        } else if (!B(vw3, vp2) || vw3.Q()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean D(yj1 yj1) {
        if (yj1.a().getAnnotations().i(m27.m)) {
            return true;
        }
        if (!(yj1 instanceof cr5)) {
            return false;
        }
        cr5 cr5 = (cr5) yj1;
        boolean a0 = cr5.a0();
        fr5 c2 = cr5.c();
        jr5 d2 = cr5.d();
        if (c2 == null || !D(c2)) {
            return false;
        }
        if (!a0) {
            return true;
        }
        if (d2 == null || !D(d2)) {
            return false;
        }
        return true;
    }

    public static boolean E(vw3 vw3, vp2 vp2) {
        if (vw3 == null) {
            a(105);
            throw null;
        } else if (vp2 == null) {
            a(106);
            throw null;
        } else if (vw3.Q() || !B(vw3, vp2)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean F(vw3 vw3) {
        if (vw3 == null) {
            a(136);
            throw null;
        } else if (!B(vw3, m27.b) || iq7.e(vw3)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean G(vw3 vw3) {
        if (vw3.Q()) {
            return false;
        }
        vq0 u = vw3.L().u();
        if (!(u instanceof ql4) || u((ql4) u) == null) {
            return false;
        }
        return true;
    }

    public static boolean H(vw3 vw3) {
        if (E(vw3, m27.f)) {
            return true;
        }
        return false;
    }

    public static boolean I(wo7 wo7, vp2 vp2) {
        if (wo7 == null) {
            a(101);
            throw null;
        } else if (vp2 != null) {
            vq0 u = wo7.u();
            if (!(u instanceof ql4) || !b((ql4) u, vp2)) {
                return false;
            }
            return true;
        } else {
            a(102);
            throw null;
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=vq0, code=vj1, for r1v0, types: [vq0] */
    public static boolean J(vj1 vj1) {
        if (vj1 != null) {
            while (vj1 != null) {
                if (vj1 instanceof x95) {
                    up2 up2 = ((y95) ((x95) vj1)).A;
                    uq4 uq4 = n27.j;
                    up2.getClass();
                    uq4.getClass();
                    return up2.a.h(uq4);
                }
                vj1 = vj1.r();
            }
            return false;
        }
        a(10);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 11 || i3 == 13 || i3 == 15 || i3 == 69 || i3 == 74 || i3 == 81 || i3 == 84 || i3 == 86 || i3 == 87)) {
            switch (i3) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i3) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i3) {
                                case h75.h /*48*/:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i3) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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
        if (!(i3 == 11 || i3 == 13 || i3 == 15 || i3 == 69 || i3 == 74 || i3 == 81 || i3 == 84 || i3 == 86 || i3 == 87)) {
            switch (i3) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i3) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i3) {
                                case h75.h /*48*/:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i3) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case h75.g /*15*/:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case h75.h /*48*/:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 161:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i3 == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i3 == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i3 == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i3 == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i3 == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i3 == 81 || i3 == 84) {
            objArr[1] = "getArrayType";
        } else if (i3 == 86) {
            objArr[1] = "getEnumType";
        } else if (i3 != 87) {
            switch (i3) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i3) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case 28:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case 37:
                            objArr[1] = "getList";
                            break;
                        case 38:
                            objArr[1] = "getMutableList";
                            break;
                        case 39:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case 41:
                            objArr[1] = "getMap";
                            break;
                        case 42:
                            objArr[1] = "getMutableMap";
                            break;
                        case 43:
                            objArr[1] = "getMapEntry";
                            break;
                        case 44:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case 45:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i3) {
                                case h75.h /*48*/:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case 49:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i3) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case 64:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                            }
                    }
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i3) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case h75.g /*15*/:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case h75.h /*48*/:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 11 || i3 == 13 || i3 == 15 || i3 == 69 || i3 == 74 || i3 == 81 || i3 == 84 || i3 == 86 || i3 == 87)) {
            switch (i3) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i3) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i3) {
                                case h75.h /*48*/:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i3) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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

    public static boolean b(ql4 ql4, vp2 vp2) {
        if (ql4 == null) {
            a(103);
            throw null;
        } else if (vp2 == null) {
            a(104);
            throw null;
        } else if (!ql4.getName().equals(vp2.g()) || !vp2.equals(rs1.f(ql4))) {
            return false;
        } else {
            return true;
        }
    }

    public static ro5 s(vq0 vq0) {
        if (vq0 == null) {
            a(77);
            throw null;
        } else if (m27.e0.contains(vq0.getName())) {
            return (ro5) m27.g0.get(rs1.f(vq0));
        } else {
            return null;
        }
    }

    public static ro5 u(ql4 ql4) {
        if (m27.d0.contains(ql4.getName())) {
            return (ro5) m27.f0.get(rs1.f(ql4));
        }
        return null;
    }

    public static boolean y(vw3 vw3) {
        if (vw3 != null) {
            return B(vw3, m27.a);
        }
        a(139);
        throw null;
    }

    public static boolean z(vw3 vw3) {
        if (vw3 != null) {
            return B(vw3, m27.g);
        }
        a(88);
        throw null;
    }

    public final void c() {
        rd0 rd0;
        uq4 uq4 = e;
        uq4.getClass();
        kb4 kb4 = this.d;
        tl4 tl4 = new tl4(uq4, kb4, this, 48);
        this.a = tl4;
        pd0.a.getClass();
        tl4 tl42 = this.a;
        Iterable m = m();
        gj5 q = q();
        u9 d2 = d();
        ((qd0) ((pd0) od0.b.getValue())).getClass();
        tl42.getClass();
        m.getClass();
        q.getClass();
        d2.getClass();
        Set<up2> set = n27.q;
        set.getClass();
        ArrayList arrayList = new ArrayList();
        for (up2 up2 : set) {
            md0.m.getClass();
            InputStream D = td0.D(md0.a(up2));
            if (D != null) {
                rd0 = ag8.n(up2, kb4, tl42, D);
            } else {
                rd0 = null;
            }
            if (rd0 != null) {
                arrayList.add(rd0);
            }
        }
        z95 z95 = new z95(arrayList);
        am6 am6 = new am6(kb4, (sl4) tl42);
        wv2 wv2 = new wv2(15, z95);
        md0 md0 = md0.m;
        ws1 ws1 = new ws1(kb4, tl42, wv2, new qc3((sl4) tl42, am6, md0), z95, m, am6, d2, q, md0.a, (kz4) null, new n63(kb4), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((rd0) it.next()).g1(ws1);
        }
        tl4.D = z95;
        tl4 tl43 = this.a;
        tl43.getClass();
        tl43.C = new wv1(qs.p1(new tl4[]{tl43}));
    }

    public u9 d() {
        return pe2.x;
    }

    public final fu6 e() {
        fu6 g0 = k("Any").g0();
        if (g0 != null) {
            return g0;
        }
        a(51);
        throw null;
    }

    public final vw3 f(vw3 vw3) {
        if (vw3 != null) {
            vw3 g = g(vw3);
            if (g != null) {
                return g;
            }
            ku4.t("not array: ", vw3);
            return null;
        }
        a(68);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e A[RETURN] */
    public final vw3 g(vw3 vw3) {
        sl4 sl4;
        fu6 fu6;
        gq0 f;
        gq0 gq0;
        ql4 y;
        if (vw3 != null) {
            if (!z(vw3)) {
                du7 g = iq7.g(vw3, false);
                vw3 vw32 = (vw3) ((ev3) this.b.b()).b.get(g);
                if (vw32 != null) {
                    return vw32;
                }
                int i = rs1.a;
                vq0 u = g.L().u();
                if (u == null) {
                    sl4 = null;
                } else {
                    sl4 = rs1.d(u);
                }
                if (sl4 != null) {
                    vq0 u2 = g.L().u();
                    if (u2 != null) {
                        Set set = zt7.a;
                        uq4 name = u2.getName();
                        name.getClass();
                        if (!(!zt7.d.contains(name) || (f = ts1.f(u2)) == null || (gq0 = (gq0) zt7.b.get(f)) == null || (y = r16.y(sl4, gq0)) == null)) {
                            fu6 = y.g0();
                            if (fu6 == null) {
                                return fu6;
                            }
                        }
                    }
                    fu6 = null;
                    if (fu6 == null) {
                        return null;
                    }
                }
            } else if (vw3.G().size() == 1) {
                return ((xp7) vw3.G().get(0)).b();
            }
            return null;
        }
        a(70);
        throw null;
    }

    public final fu6 h(vw3 vw3) {
        if (vw3 != null) {
            return i(k28.y, vw3, me6.x);
        }
        a(83);
        throw null;
    }

    public final fu6 i(k28 k28, vw3 vw3, rm rmVar) {
        if (vw3 != null) {
            return kl8.H(b85.u(rmVar), k("Array"), Collections.singletonList(new p27(vw3, k28)));
        }
        a(79);
        throw null;
    }

    public final ql4 j(up2 up2) {
        if (up2 != null) {
            ql4 J = rd3.J(l(), up2);
            if (J != null) {
                return J;
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public final ql4 k(String str) {
        if (str != null) {
            return (ql4) this.c.y(uq4.e(str));
        }
        a(14);
        throw null;
    }

    public final tl4 l() {
        this.a.getClass();
        tl4 tl4 = this.a;
        if (tl4 != null) {
            return tl4;
        }
        a(7);
        throw null;
    }

    public Iterable m() {
        List singletonList = Collections.singletonList(new kd0(this.d, l()));
        if (singletonList != null) {
            return singletonList;
        }
        a(5);
        throw null;
    }

    public final fu6 n() {
        fu6 p = p();
        if (p != null) {
            return p;
        }
        a(53);
        throw null;
    }

    public final fu6 o() {
        fu6 g0 = k("Nothing").g0();
        if (g0 != null) {
            return g0;
        }
        a(49);
        throw null;
    }

    public final fu6 p() {
        fu6 w0 = e().o0(true);
        if (w0 != null) {
            return w0;
        }
        a(52);
        throw null;
    }

    public gj5 q() {
        return td0.J;
    }

    public final fu6 r(ro5 ro5) {
        if (ro5 != null) {
            fu6 fu6 = (fu6) ((ev3) this.b.b()).a.get(ro5);
            if (fu6 != null) {
                return fu6;
            }
            a(74);
            throw null;
        }
        a(73);
        throw null;
    }

    public final fu6 t(ro5 ro5) {
        if (ro5 != null) {
            fu6 g0 = k(ro5.w.b()).g0();
            if (g0 != null) {
                return g0;
            }
            a(55);
            throw null;
        }
        a(54);
        throw null;
    }

    public final fu6 v() {
        fu6 g0 = k("String").g0();
        if (g0 != null) {
            return g0;
        }
        a(66);
        throw null;
    }

    public final ql4 w(int i) {
        up2 up2 = n27.f;
        ql4 j = j(up2.a(uq4.e(gt2.d.b + i)));
        if (j != null) {
            return j;
        }
        a(18);
        throw null;
    }

    public final fu6 x() {
        fu6 g0 = k("Unit").g0();
        if (g0 != null) {
            return g0;
        }
        a(65);
        throw null;
    }
}
