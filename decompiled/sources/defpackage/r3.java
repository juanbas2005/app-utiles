package defpackage;

import java.util.List;

/* renamed from: r3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class r3 extends yj1 implements qp7 {
    public final k28 A;
    public final boolean B;
    public final int C;
    public final ib4 D;
    public final ib4 E;
    public final kb4 F;

    /* JADX WARNING: type inference failed for: r5v1, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r5v2, types: [ib4, hb4] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r3(kb4 kb4, vj1 vj1, rm rmVar, uq4 uq4, k28 k28, boolean z, int i, pe2 pe2) {
        super(vj1, rmVar, uq4, sy6.j);
        if (kb4 == null) {
            v0(0);
            throw null;
        } else if (vj1 == null) {
            v0(1);
            throw null;
        } else if (rmVar == null) {
            v0(2);
            throw null;
        } else if (uq4 == null) {
            v0(3);
            throw null;
        } else if (k28 == null) {
            v0(4);
            throw null;
        } else if (pe2 != null) {
            this.A = k28;
            this.B = z;
            this.C = i;
            this.D = new hb4(kb4, new o3(this, kb4, pe2));
            this.E = new hb4(kb4, new p3(0, (Object) this, (Object) uq4));
            this.F = kb4;
        } else {
            v0(6);
            throw null;
        }
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[1] = "getOriginal";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public final boolean D() {
        return this.B;
    }

    public final k28 I() {
        k28 k28 = this.A;
        if (k28 != null) {
            return k28;
        }
        v0(7);
        throw null;
    }

    public final Object P(zj1 zj1, Object obj) {
        return zj1.f(this, obj);
    }

    public final kb4 X() {
        kb4 kb4 = this.F;
        if (kb4 != null) {
            return kb4;
        }
        v0(14);
        throw null;
    }

    public final boolean d0() {
        return false;
    }

    public final fu6 g0() {
        fu6 fu6 = (fu6) this.E.b();
        if (fu6 != null) {
            return fu6;
        }
        v0(10);
        throw null;
    }

    public abstract List g1();

    public final int getIndex() {
        return this.C;
    }

    public final List getUpperBounds() {
        List d = ((q3) n()).e();
        if (d != null) {
            return d;
        }
        v0(8);
        throw null;
    }

    public final wo7 n() {
        wo7 wo7 = (wo7) this.D.b();
        if (wo7 != null) {
            return wo7;
        }
        v0(9);
        throw null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final vj1 m74a() {
        return this;
    }

    public final qp7 a() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final vq0 m75a() {
        return this;
    }

    public final xj1 e1() {
        return this;
    }

    public List f1(List list) {
        return list;
    }
}
