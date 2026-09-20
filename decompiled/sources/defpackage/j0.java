package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: j0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j0 extends ql4 {
    public final uq4 w;
    public final ib4 x;
    public final ib4 y;
    public final ib4 z;

    /* JADX WARNING: type inference failed for: r0v1, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r0v2, types: [ib4, hb4] */
    /* JADX WARNING: type inference failed for: r0v4, types: [ib4, hb4] */
    public j0(kb4 kb4, uq4 uq4) {
        if (kb4 == null) {
            A0(0);
            throw null;
        } else if (uq4 != null) {
            this.w = uq4;
            this.x = new hb4(kb4, new i0(this, 0));
            this.y = new hb4(kb4, new i0(this, 1));
            this.z = new hb4(kb4, new i0(this, 2));
        } else {
            A0(1);
            throw null;
        }
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5 || i3 == 6 || i3 == 9 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 17 || i3 == 19 || i3 == 20) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5 || i3 == 6 || i3 == 9 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 17 || i3 == 19 || i3 == 20) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case h75.g:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i3 == 2) {
            objArr[1] = "getName";
        } else if (i3 == 3) {
            objArr[1] = "getOriginal";
        } else if (i3 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i3 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i3 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i3 == 9 || i3 == 12 || i3 == 14 || i3 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i3 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i3 == 19) {
            objArr[1] = "substitute";
        } else if (i3 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i3) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case h75.g:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5 || i3 == 6 || i3 == 9 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 17 || i3 == 19 || i3 == 20) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    public final ji4 A(bq7 bq7) {
        ts1.h(rs1.c(this));
        ji4 G = G(bq7, ax3.p);
        if (G != null) {
            return G;
        }
        A0(16);
        throw null;
    }

    /* renamed from: B0 */
    public ql4 h(dq7 dq7) {
        if (dq7 == null) {
            A0(18);
            throw null;
        } else if (dq7.a.e()) {
            return this;
        } else {
            return new h44(this, dq7);
        }
    }

    public ji4 G(bq7 bq7, ax3 ax3) {
        if (bq7.e()) {
            ji4 o0 = o0(ax3);
            if (o0 != null) {
                return o0;
            }
            A0(12);
            throw null;
        }
        return new c77(o0(ax3), new dq7(bq7));
    }

    public final Object P(zj1 zj1, Object obj) {
        return zj1.I(this, obj);
    }

    public final qz3 Q() {
        qz3 qz3 = (qz3) this.z.b();
        if (qz3 != null) {
            return qz3;
        }
        A0(5);
        throw null;
    }

    public ji4 Y() {
        ji4 ji4 = (ji4) this.y.b();
        if (ji4 != null) {
            return ji4;
        }
        A0(4);
        throw null;
    }

    public final fu6 g0() {
        fu6 fu6 = (fu6) this.x.b();
        if (fu6 != null) {
            return fu6;
        }
        A0(20);
        throw null;
    }

    public final uq4 getName() {
        uq4 uq4 = this.w;
        if (uq4 != null) {
            return uq4;
        }
        A0(2);
        throw null;
    }

    public ji4 n0() {
        ts1.h(rs1.c(this));
        ji4 o0 = o0(ax3.p);
        if (o0 != null) {
            return o0;
        }
        A0(17);
        throw null;
    }

    public List t() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(6);
        throw null;
    }

    public final vj1 a() {
        return this;
    }

    public final ql4 J() {
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public final vq0 m46a() {
        return this;
    }
}
