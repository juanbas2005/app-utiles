package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: y52  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y52 extends ki4 {
    public final fb4 b;
    public final fb4 c;
    public final ib4 d;
    public final /* synthetic */ z52 e;

    /* JADX WARNING: type inference failed for: r0v3, types: [ib4, hb4] */
    public y52(z52 z52, kb4 kb4) {
        if (kb4 != null) {
            this.e = z52;
            this.b = kb4.b(new x52(this, 0));
            this.c = kb4.b(new x52(this, 1));
            this.d = new hb4(kb4, new k3(20, this));
            return;
        }
        h(0);
        throw null;
    }

    public static /* synthetic */ void h(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
            switch (i) {
                case h75.g:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
            switch (i) {
                case h75.g:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 8:
            case 10:
                objArr[0] = "name";
                break;
            case 2:
            case 6:
                objArr[0] = "location";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case h75.g:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                objArr[0] = "fromSupertypes";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                objArr[0] = "kindFilter";
                break;
            case 14:
                objArr[0] = "nameFilter";
                break;
            case 20:
                objArr[0] = "p";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 3) {
            objArr[1] = "getContributedVariables";
        } else if (i == 7) {
            objArr[1] = "getContributedFunctions";
        } else if (i == 9) {
            objArr[1] = "getSupertypeScope";
        } else if (i != 12) {
            switch (i) {
                case h75.g:
                    objArr[1] = "getContributedDescriptors";
                    break;
                case 16:
                    objArr[1] = "computeAllDeclarations";
                    break;
                case 17:
                    objArr[1] = "getFunctionNames";
                    break;
                case 18:
                    objArr[1] = "getClassifierNames";
                    break;
                case 19:
                    objArr[1] = "getVariableNames";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
            }
        } else {
            objArr[1] = "resolveFakeOverrides";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "getContributedVariables";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case h75.g:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 4:
                objArr[2] = "computeProperties";
                break;
            case 5:
            case 6:
                objArr[2] = "getContributedFunctions";
                break;
            case 8:
                objArr[2] = "computeFunctions";
                break;
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                objArr[2] = "resolveFakeOverrides";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
            case 14:
                objArr[2] = "getContributedDescriptors";
                break;
            case 20:
                objArr[2] = "printScopeStructure";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
            switch (i) {
                case h75.g:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public final Collection a(is1 is1, vr2 vr2) {
        if (is1 != null) {
            Collection collection = (Collection) this.d.b();
            if (collection != null) {
                return collection;
            }
            h(15);
            throw null;
        }
        h(13);
        throw null;
    }

    public final Collection b(uq4 uq4, oz4 oz4) {
        if (uq4 != null) {
            return (Collection) this.b.y(uq4);
        }
        h(5);
        throw null;
    }

    public final Set c() {
        Set set = (Set) this.e.E.b();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    public final Set d() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    public final Collection f(uq4 uq4, oz4 oz4) {
        if (uq4 != null) {
            return (Collection) this.c.y(uq4);
        }
        h(1);
        throw null;
    }

    public final Set g() {
        Set set = (Set) this.e.E.b();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    public final ji4 i() {
        ji4 R = ((vw3) ((n3) this.e.n()).e().iterator().next()).R();
        if (R != null) {
            return R;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(uq4 uq4, Collection collection) {
        if (uq4 == null) {
            h(10);
            throw null;
        } else if (collection != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            uq4 uq42 = uq4;
            Collection collection2 = collection;
            h95.c.h(uq42, collection2, Collections.EMPTY_SET, this.e, new dt1(linkedHashSet, 1));
            return linkedHashSet;
        } else {
            h(11);
            throw null;
        }
    }
}
