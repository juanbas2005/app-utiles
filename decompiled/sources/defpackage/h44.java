package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: h44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h44 extends ql4 {
    public ArrayList A;
    public oq0 B;
    public final ql4 w;
    public final dq7 x;
    public dq7 y;
    public ArrayList z;

    public h44(ql4 ql4, dq7 dq7) {
        this.w = ql4;
        this.x = dq7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e3 A[ADDED_TO_REGION] */
    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        String format;
        Throwable th;
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i != 2) {
            if (i != 3) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 13) {
                                    if (i != 23) {
                                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                    } else {
                                        objArr[0] = "substitutor";
                                    }
                                    switch (i) {
                                        case 2:
                                        case 3:
                                        case 5:
                                        case 6:
                                        case 8:
                                        case 10:
                                        case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                                        case 23:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                            break;
                                        case 4:
                                        case 7:
                                        case 9:
                                        case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                                            objArr[1] = "getMemberScope";
                                            break;
                                        case 12:
                                        case 14:
                                            objArr[1] = "getUnsubstitutedMemberScope";
                                            break;
                                        case h75.g /*15*/:
                                            objArr[1] = "getStaticScope";
                                            break;
                                        case 16:
                                            objArr[1] = "getDefaultType";
                                            break;
                                        case 17:
                                            objArr[1] = "getContextReceivers";
                                            break;
                                        case 18:
                                            objArr[1] = "getConstructors";
                                            break;
                                        case 19:
                                            objArr[1] = "getAnnotations";
                                            break;
                                        case 20:
                                            objArr[1] = "getName";
                                            break;
                                        case 21:
                                            objArr[1] = "getOriginal";
                                            break;
                                        case 22:
                                            objArr[1] = "getContainingDeclaration";
                                            break;
                                        case 24:
                                            objArr[1] = "substitute";
                                            break;
                                        case 25:
                                            objArr[1] = "getKind";
                                            break;
                                        case 26:
                                            objArr[1] = "getModality";
                                            break;
                                        case 27:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 28:
                                            objArr[1] = "getUnsubstitutedInnerClassesScope";
                                            break;
                                        case 29:
                                            objArr[1] = "getSource";
                                            break;
                                        case 30:
                                            objArr[1] = "getDeclaredTypeParameters";
                                            break;
                                        case 31:
                                            objArr[1] = "getSealedSubclasses";
                                            break;
                                        default:
                                            objArr[1] = "getTypeConstructor";
                                            break;
                                    }
                                    if (i != 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
                                        objArr[2] = "getMemberScope";
                                    } else if (i == 13) {
                                        objArr[2] = "getUnsubstitutedMemberScope";
                                    } else if (i == 23) {
                                        objArr[2] = "substitute";
                                    }
                                    format = String.format(str, objArr);
                                    if (i != 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) {
                                        th = new IllegalArgumentException(format);
                                    } else {
                                        th = new IllegalStateException(format);
                                    }
                                    throw th;
                                }
                            }
                        }
                    }
                }
                objArr[0] = "typeSubstitution";
                switch (i) {
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 10:
                    case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                    case 23:
                        break;
                    case 4:
                    case 7:
                    case 9:
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                        break;
                    case 12:
                    case 14:
                        break;
                    case h75.g /*15*/:
                        break;
                    case 16:
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;
                    case 20:
                        break;
                    case 21:
                        break;
                    case 22:
                        break;
                    case 24:
                        break;
                    case 25:
                        break;
                    case 26:
                        break;
                    case 27:
                        break;
                    case 28:
                        break;
                    case 29:
                        break;
                    case 30:
                        break;
                    case 31:
                        break;
                }
                if (i != 2) {
                }
                objArr[2] = "getMemberScope";
                format = String.format(str, objArr);
                if (i != 2) {
                }
                th = new IllegalArgumentException(format);
                throw th;
            }
            objArr[0] = "kotlinTypeRefiner";
            switch (i) {
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 10:
                case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                case 23:
                    break;
                case 4:
                case 7:
                case 9:
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    break;
                case 12:
                case 14:
                    break;
                case h75.g /*15*/:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:
                    break;
                case 21:
                    break;
                case 22:
                    break;
                case 24:
                    break;
                case 25:
                    break;
                case 26:
                    break;
                case 27:
                    break;
                case 28:
                    break;
                case 29:
                    break;
                case 30:
                    break;
                case 31:
                    break;
            }
            if (i != 2) {
            }
            objArr[2] = "getMemberScope";
            format = String.format(str, objArr);
            if (i != 2) {
            }
            th = new IllegalArgumentException(format);
            throw th;
        }
        objArr[0] = "typeArguments";
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 23:
                break;
            case 4:
            case 7:
            case 9:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                break;
            case 12:
            case 14:
                break;
            case h75.g /*15*/:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            case 29:
                break;
            case 30:
                break;
            case 31:
                break;
        }
        if (i != 2) {
        }
        objArr[2] = "getMemberScope";
        format = String.format(str, objArr);
        if (i != 2) {
        }
        th = new IllegalArgumentException(format);
        throw th;
    }

    public final ji4 A(bq7 bq7) {
        ts1.h(rs1.c(this));
        return G(bq7, ax3.p);
    }

    public final dq7 B0() {
        if (this.y == null) {
            dq7 dq7 = this.x;
            if (dq7.a.e()) {
                this.y = dq7;
            } else {
                List parameters = this.w.n().getParameters();
                ArrayList arrayList = new ArrayList(parameters.size());
                this.z = arrayList;
                this.y = h03.t(parameters, dq7.a, this, arrayList);
                ArrayList arrayList2 = this.z;
                arrayList2.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!((qp7) next).d0()) {
                        arrayList3.add(next);
                    }
                }
                this.A = arrayList3;
            }
        }
        return this.y;
    }

    public final ji4 G(bq7 bq7, ax3 ax3) {
        ji4 G = this.w.G(bq7, ax3);
        if (!this.x.a.e()) {
            return new c77(G, B0());
        }
        if (G != null) {
            return G;
        }
        A0(7);
        throw null;
    }

    public final boolean H() {
        return this.w.H();
    }

    public final ql4 J() {
        ql4 J = this.w.a();
        if (J != null) {
            return J;
        }
        A0(21);
        throw null;
    }

    public final ji4 L() {
        ji4 L = this.w.L();
        if (L != null) {
            return L;
        }
        A0(15);
        throw null;
    }

    public final Object P(zj1 zj1, Object obj) {
        return zj1.I(this, obj);
    }

    public final qz3 Q() {
        throw new UnsupportedOperationException();
    }

    public final ji4 Y() {
        ji4 Y = this.w.Y();
        if (Y != null) {
            return Y;
        }
        A0(28);
        throw null;
    }

    public final sy6 e() {
        return sy6.j;
    }

    public final us1 f() {
        us1 f = this.w.f();
        if (f != null) {
            return f;
        }
        A0(27);
        throw null;
    }

    public final fu6 g0() {
        ro7 ro7;
        List d = iq7.d(n().getParameters());
        rm annotations = getAnnotations();
        if (annotations.isEmpty()) {
            ro7.x.getClass();
            ro7 = ro7.y;
        } else {
            kg5 kg5 = ro7.x;
            List D = sg3.D(new um(annotations));
            kg5.getClass();
            ro7 = kg5.l(D);
        }
        return kl8.J(n0(), ro7, n(), d, false);
    }

    public final rm getAnnotations() {
        rm annotations = this.w.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        A0(19);
        throw null;
    }

    public final uq4 getName() {
        uq4 name = this.w.getName();
        if (name != null) {
            return name;
        }
        A0(20);
        throw null;
    }

    public final xj1 h(dq7 dq7) {
        if (dq7 != null) {
            bq7 bq7 = dq7.a;
            if (bq7.e()) {
                return this;
            }
            return new h44(this, dq7.e(bq7, B0().a));
        }
        A0(23);
        throw null;
    }

    public final boolean j() {
        return this.w.j();
    }

    public final Collection l() {
        Collection<wp0> l = this.w.l();
        ArrayList arrayList = new ArrayList(l.size());
        for (wp0 wp0 : l) {
            wp0.getClass();
            ys2 l1 = wp0.l1(dq7.b);
            l1.A = wp0.e1();
            l1.A(wp0.o());
            l1.v(wp0.f());
            l1.h(wp0.u());
            l1.I = false;
            arrayList.add(((wp0) l1.T.i1(l1)).h(B0()));
        }
        return arrayList;
    }

    public final boolean m() {
        return this.w.m();
    }

    public final wo7 n() {
        wo7 n = this.w.n();
        if (!this.x.a.e()) {
            if (this.B == null) {
                dq7 B0 = B0();
                Collection<vw3> e = n.e();
                ArrayList arrayList = new ArrayList(e.size());
                for (vw3 h : e) {
                    arrayList.add(B0.h(h, k28.y));
                }
                this.B = new oq0(this, this.z, arrayList, kb4.e);
            }
            oq0 oq0 = this.B;
            if (oq0 != null) {
                return oq0;
            }
            A0(1);
            throw null;
        } else if (n != null) {
            return n;
        } else {
            A0(0);
            throw null;
        }
    }

    public final ji4 n0() {
        ts1.h(rs1.c(this.w));
        return o0(ax3.p);
    }

    public final fl4 o() {
        fl4 o = this.w.o();
        if (o != null) {
            return o;
        }
        A0(26);
        throw null;
    }

    public final ji4 o0(ax3 ax3) {
        ji4 o0 = this.w.o0(ax3);
        if (!this.x.a.e()) {
            return new c77(o0, B0());
        }
        if (o0 != null) {
            return o0;
        }
        A0(14);
        throw null;
    }

    public final boolean p() {
        return this.w.p();
    }

    public final wp0 p0() {
        return this.w.p0();
    }

    public final vj1 r() {
        vj1 r = this.w.r();
        if (r != null) {
            return r;
        }
        A0(22);
        throw null;
    }

    public final boolean s0() {
        return this.w.s0();
    }

    public final List t() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(17);
        throw null;
    }

    public final List u0() {
        B0();
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            return arrayList;
        }
        A0(30);
        throw null;
    }

    public final iq0 v() {
        iq0 v = this.w.v();
        if (v != null) {
            return v;
        }
        A0(25);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [vw3] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final y18 v0() {
        y18 v0 = this.w.v0();
        if (v0 == null) {
            return null;
        }
        boolean z2 = v0 instanceof cc3;
        k28 k28 = k28.y;
        dq7 dq7 = this.x;
        if (z2) {
            cc3 cc3 = (cc3) v0;
            uq4 uq4 = cc3.a;
            fu6 fu6 = (fu6) cc3.b;
            if (fu6 != null && !dq7.a.e()) {
                fu6 = B0().h(fu6, k28);
            }
            return new cc3(uq4, fu6);
        } else if (v0 instanceof kn4) {
            ArrayList arrayList = ((kn4) v0).a;
            ArrayList arrayList2 = new ArrayList(et0.e0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                yb5 yb5 = (yb5) it.next();
                uq4 uq42 = (uq4) yb5.w;
                fu6 fu62 = (fu6) ((v76) yb5.x);
                if (fu62 != null && !dq7.a.e()) {
                    fu62 = (fu6) B0().h(fu62, k28);
                }
                arrayList2.add(new yb5(uq42, fu62));
            }
            return new kn4(arrayList2);
        } else {
            h.c();
            return null;
        }
    }

    public final boolean w0() {
        return this.w.w0();
    }

    public final boolean x0() {
        return this.w.x0();
    }

    public final boolean y0() {
        return this.w.y0();
    }

    public final boolean z0() {
        return this.w.z0();
    }
}
