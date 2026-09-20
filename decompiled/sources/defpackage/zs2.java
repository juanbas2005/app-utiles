package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: zs2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class zs2 extends yj1 implements xs2 {
    public List A;
    public List B;
    public vw3 C;
    public List D;
    public qz3 E;
    public qz3 F;
    public fl4 G;
    public us1 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public Collection T;
    public volatile p3 U;
    public final xs2 V;
    public final int W;
    public xs2 X;
    public Map Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zs2(int i, rm rmVar, vj1 vj1, xs2 xs2, uq4 uq4, sy6 sy6) {
        super(vj1, rmVar, uq4, sy6);
        if (vj1 == null) {
            v0(0);
            throw null;
        } else if (rmVar == null) {
            v0(1);
            throw null;
        } else if (uq4 == null) {
            v0(2);
            throw null;
        } else if (i == 0) {
            v0(3);
            throw null;
        } else if (sy6 != null) {
            this.H = vs1.i;
            this.I = false;
            this.J = false;
            this.K = false;
            this.L = false;
            this.M = false;
            this.N = false;
            this.O = false;
            this.P = false;
            this.Q = false;
            this.R = true;
            this.S = false;
            this.T = null;
            this.U = null;
            this.X = null;
            this.Y = null;
            this.V = xs2 == null ? this : xs2;
            this.W = i;
        } else {
            v0(4);
            throw null;
        }
    }

    public static ArrayList j1(xs2 xs2, List list, dq7 dq7, boolean z, boolean z2, boolean[] zArr) {
        vw3 vw3;
        f3 f3Var;
        h28 h28;
        sy6 sy6;
        Object obj;
        dq7 dq72 = dq7;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                h28 h282 = (h28) it.next();
                vw3 b = h282.b();
                k28 k28 = k28.z;
                vw3 h = dq72.h(b, k28);
                vw3 vw32 = h282.F;
                if (vw32 == null) {
                    vw3 = null;
                } else {
                    vw3 = dq72.h(vw32, k28);
                }
                if (h == null) {
                    return null;
                }
                if (!((h == h282.b() && vw32 == vw3) || zArr == null)) {
                    zArr[0] = true;
                }
                if (h282 instanceof g28) {
                    f3Var = new f3((List) ((g28) h282).H.getValue());
                } else {
                    f3Var = null;
                }
                if (z) {
                    h28 = null;
                } else {
                    h28 = h282;
                }
                int i = h282.B;
                rm annotations = h282.getAnnotations();
                uq4 name = h282.getName();
                boolean g1 = h282.g1();
                boolean z3 = h282.D;
                boolean z4 = h282.E;
                if (z2) {
                    sy6 = h282.e();
                } else {
                    sy6 = sy6.j;
                }
                sy6 sy62 = sy6;
                annotations.getClass();
                name.getClass();
                sy62.getClass();
                if (f3Var == null) {
                    obj = new h28(xs2, h28, i, annotations, name, h, g1, z3, z4, vw3, sy62);
                } else {
                    obj = new g28(xs2, h28, i, annotations, name, h, g1, z3, z4, vw3, sy62, f3Var);
                }
                arrayList.add(obj);
            }
            return arrayList;
        }
        v0(30);
        throw null;
    }

    public static /* synthetic */ void v0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
            case 14:
            case h75.g:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
            case 14:
            case h75.g:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
            case 14:
            case h75.g:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case h75.g:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
            case 14:
            case h75.g:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
            case 14:
            case h75.g:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public boolean E() {
        return this.S;
    }

    public final boolean H() {
        return this.N;
    }

    public boolean M() {
        return this.M;
    }

    public Object P(zj1 zj1, Object obj) {
        return zj1.F(this, obj);
    }

    public final List S() {
        List list = this.B;
        if (list != null) {
            return list;
        }
        v0(19);
        throw null;
    }

    public final xs2 V() {
        return this.X;
    }

    public final qz3 W() {
        return this.F;
    }

    public xs2 a() {
        xs2 xs2 = this.V;
        this = this;
        if (xs2 != this) {
            this = xs2.a();
        }
        if (this != null) {
            return this;
        }
        v0(20);
        throw null;
    }

    public final qz3 b0() {
        return this.E;
    }

    public final us1 f() {
        us1 us1 = this.H;
        if (us1 != null) {
            return us1;
        }
        v0(16);
        throw null;
    }

    public final xs2 f1(vj1 vj1, fl4 fl4, us1 us1) {
        xs2 build = r0().H(vj1).A(fl4).v(us1).h(2).w().build();
        if (build != null) {
            return build;
        }
        v0(26);
        throw null;
    }

    /* renamed from: g1 */
    public au6 e0(vj1 vj1, fl4 fl4, us1 us1) {
        return (au6) f1(vj1, fl4, us1);
    }

    public final List getTypeParameters() {
        List list = this.A;
        if (list != null) {
            return list;
        }
        ku4.t("typeParameters == null for ", this);
        return null;
    }

    public xs2 h(dq7 dq7) {
        if (dq7 == null) {
            v0(22);
            throw null;
        } else if (dq7.a.e()) {
            return this;
        } else {
            ys2 l1 = l1(dq7);
            l1.A = a();
            l1.K = true;
            l1.S = true;
            return l1.T.i1(l1);
        }
    }

    public final List h0() {
        List list = this.D;
        if (list != null) {
            return list;
        }
        v0(13);
        throw null;
    }

    public abstract zs2 h1(int i, rm rmVar, vj1 vj1, xs2 xs2, uq4 uq4, sy6 sy6);

    public boolean i() {
        return this.Q;
    }

    /* JADX WARNING: type inference failed for: r16v0 */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r16v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    public zs2 i1(ys2 ys2) {
        rm annotations;
        sy6 sy6;
        ArrayList arrayList;
        qz3 qz3;
        ArrayList arrayList2;
        qz3 qz32;
        ? r8;
        vw3 h;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        xs2 xs2;
        ys2 ys22 = ys2;
        k28 k28 = k28.z;
        boolean[] zArr = new boolean[1];
        boolean z6 = false;
        if (ys22.O != null) {
            annotations = getAnnotations();
            rm rmVar = ys22.O;
            annotations.getClass();
            rmVar.getClass();
            if (annotations.isEmpty()) {
                annotations = rmVar;
            } else if (!rmVar.isEmpty()) {
                annotations = new tm(new rm[]{annotations, rmVar});
            }
        } else {
            annotations = getAnnotations();
        }
        rm rmVar2 = annotations;
        vj1 vj1 = ys22.x;
        xs2 xs22 = ys22.A;
        int i = ys22.B;
        uq4 uq4 = ys22.H;
        if (ys22.K) {
            if (xs22 != null) {
                xs2 = xs22;
            } else {
                xs2 = a();
            }
            sy6 = ((yj1) xs2).e();
        } else {
            sy6 = sy6.j;
        }
        sy6 sy62 = sy6;
        if (sy62 != null) {
            zs2 h1 = h1(i, rmVar2, vj1, xs22, uq4, sy62);
            List list = ys22.N;
            if (list == null) {
                list = getTypeParameters();
            }
            zArr[0] = zArr[0] | (!list.isEmpty());
            ArrayList arrayList3 = new ArrayList(list.size());
            dq7 u = h03.u(list, ys22.w, h1, arrayList3, zArr);
            if (u != null) {
                ArrayList arrayList4 = new ArrayList();
                if (!ys22.D.isEmpty()) {
                    Iterator it = ys22.D.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        qz3 qz33 = (qz3) it.next();
                        vw3 h2 = u.h(qz33.b(), k28);
                        if (h2 == null) {
                            break;
                        }
                        ? r16 = z6;
                        int i3 = i2 + 1;
                        arrayList4.add(fd1.v(h1, h2, ((v51) qz33.f1()).d1(), qz33.getAnnotations(), i2));
                        boolean z7 = zArr[r16];
                        if (h2 != qz33.b()) {
                            z5 = true;
                        } else {
                            z5 = r16;
                        }
                        zArr[r16] = z7 | z5;
                        z6 = r16;
                        i2 = i3;
                    }
                }
                ? r162 = z6;
                qz3 qz34 = ys22.E;
                if (qz34 != null) {
                    vw3 h3 = u.h(qz34.b(), k28);
                    if (h3 != null) {
                        ys22.E.f1();
                        qz3 qz35 = new qz3(h1, new t92(h1, h3), ys22.E.getAnnotations());
                        boolean z8 = zArr[r162];
                        if (h3 != ys22.E.b()) {
                            z4 = true;
                        } else {
                            z4 = r162;
                        }
                        zArr[r162] = z4 | z8;
                        arrayList = arrayList3;
                        qz3 = qz35;
                    }
                } else {
                    arrayList = arrayList3;
                    qz3 = null;
                }
                qz3 qz36 = ys22.F;
                if (qz36 != null) {
                    qz3 g1 = qz36.h(u);
                    if (g1 != null) {
                        boolean z9 = zArr[r162];
                        if (g1 != ys22.F) {
                            z3 = true;
                        } else {
                            z3 = r162;
                        }
                        zArr[r162] = z9 | z3;
                        r8 = r162;
                        arrayList2 = arrayList4;
                        qz32 = g1;
                    }
                } else {
                    r8 = r162;
                    arrayList2 = arrayList4;
                    qz32 = null;
                }
                boolean[] zArr2 = zArr;
                zs2 zs2 = h1;
                ArrayList j1 = j1(zs2, ys22.C, u, ys22.L, ys22.K, zArr2);
                if (j1 != null && (h = u.h(ys22.G, k28.A)) != null) {
                    boolean z10 = zArr2[r8];
                    if (h != ys22.G) {
                        z = true;
                    } else {
                        z = r8;
                    }
                    boolean z11 = z10 | z;
                    zArr2[r8] = z11;
                    if (!z11 && ys22.S) {
                        return this;
                    }
                    zs2.k1(qz3, qz32, arrayList2, arrayList, j1, h, ys22.y, ys22.z);
                    zs2.I = this.I;
                    zs2.J = this.J;
                    zs2.K = this.K;
                    zs2.L = this.L;
                    zs2.M = this.M;
                    zs2.Q = this.Q;
                    zs2.N = this.N;
                    zs2.n1(this.R);
                    zs2.O = ys22.M;
                    zs2.P = ys22.P;
                    Boolean bool = ys22.R;
                    if (bool != null) {
                        z2 = bool.booleanValue();
                    } else {
                        z2 = this.S;
                    }
                    zs2.o1(z2);
                    if (!ys22.Q.isEmpty() || this.Y != null) {
                        LinkedHashMap linkedHashMap = ys22.Q;
                        Map map = this.Y;
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            zs2.Y = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            zs2.Y = linkedHashMap;
                        }
                    }
                    if (ys22.J || this.X != null) {
                        xs2 xs23 = this.X;
                        if (xs23 == null) {
                            xs23 = this;
                        }
                        zs2.X = xs23.h(u);
                    }
                    if (ys22.I && !a().s().isEmpty()) {
                        if (ys22.w.e()) {
                            p3 p3Var = this.U;
                            if (p3Var != null) {
                                zs2.U = p3Var;
                                return zs2;
                            }
                            zs2.m0(s());
                            return zs2;
                        }
                        zs2.U = new p3(10, (Object) this, (Object) u);
                    }
                    return zs2;
                }
            }
            return null;
        }
        v0(27);
        throw null;
    }

    public boolean j() {
        return this.L;
    }

    public vw3 k() {
        return this.C;
    }

    public void k1(qz3 qz3, qz3 qz32, List list, List list2, List list3, vw3 vw3, fl4 fl4, us1 us1) {
        if (list == null) {
            v0(5);
            throw null;
        } else if (list2 == null) {
            v0(6);
            throw null;
        } else if (list3 == null) {
            v0(7);
            throw null;
        } else if (us1 != null) {
            this.A = dt0.b1(list2);
            this.B = dt0.b1(list3);
            this.C = vw3;
            this.G = fl4;
            this.H = us1;
            this.E = qz3;
            this.F = qz32;
            this.D = list;
            int i = 0;
            int i2 = 0;
            while (i2 < list2.size()) {
                qp7 qp7 = (qp7) list2.get(i2);
                if (qp7.getIndex() == i2) {
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(qp7);
                    int index = qp7.getIndex();
                    sb.append(" index is ");
                    sb.append(index);
                    sb.append(" but position is ");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
                }
            }
            while (i < list3.size()) {
                h28 h28 = (h28) list3.get(i);
                if (h28.B == i) {
                    i++;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(h28);
                    int i3 = h28.B;
                    sb2.append("index is ");
                    sb2.append(i3);
                    sb2.append(" but position is ");
                    sb2.append(i);
                    throw new IllegalStateException(sb2.toString());
                }
            }
        } else {
            v0(8);
            throw null;
        }
    }

    public final boolean l0() {
        return this.O;
    }

    public final ys2 l1(dq7 dq7) {
        if (dq7 != null) {
            return new ys2(this, dq7.a, r(), o(), f(), u(), S(), h0(), this.E, k());
        }
        v0(24);
        throw null;
    }

    public boolean m() {
        return this.K;
    }

    public void m0(Collection collection) {
        if (collection != null) {
            this.T = collection;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((xs2) it.next()).q0()) {
                    this.P = true;
                    return;
                }
            }
            return;
        }
        v0(17);
        throw null;
    }

    public final void m1(jt1 jt1, Object obj) {
        if (this.Y == null) {
            this.Y = new LinkedHashMap();
        }
        this.Y.put(jt1, obj);
    }

    public void n1(boolean z) {
        this.R = z;
    }

    public final fl4 o() {
        fl4 fl4 = this.G;
        if (fl4 != null) {
            return fl4;
        }
        v0(15);
        throw null;
    }

    public void o1(boolean z) {
        this.S = z;
    }

    public final void p1(fu6 fu6) {
        if (fu6 != null) {
            this.C = fu6;
        } else {
            v0(11);
            throw null;
        }
    }

    public final boolean q() {
        if (this.I) {
            return true;
        }
        for (xs2 q : a().s()) {
            if (q.q()) {
                return true;
            }
        }
        return false;
    }

    public final boolean q0() {
        return this.P;
    }

    public ws2 r0() {
        return l1(dq7.b);
    }

    public Collection s() {
        p3 p3Var = this.U;
        if (p3Var != null) {
            this.T = (Collection) p3Var.b();
            this.U = null;
        }
        Collection collection = this.T;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        v0(14);
        throw null;
    }

    public final boolean s0() {
        return false;
    }

    public final int u() {
        int i = this.W;
        if (i != 0) {
            return i;
        }
        v0(21);
        throw null;
    }

    public final boolean w() {
        if (this.J) {
            return true;
        }
        for (xs2 w : a().s()) {
            if (w.w()) {
                return true;
            }
        }
        return false;
    }

    public Object z(jt1 jt1) {
        Map map = this.Y;
        if (map == null) {
            return null;
        }
        return map.get(jt1);
    }
}
