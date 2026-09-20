package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: dr5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dr5 {
    public vj1 a;
    public fl4 b;
    public us1 c;
    public cr5 d = null;
    public int e;
    public bq7 f;
    public boolean g;
    public final qz3 h;
    public final uq4 i;
    public final vw3 j;
    public final /* synthetic */ er5 k;

    public dr5(er5 er5) {
        this.k = er5;
        this.a = er5.r();
        this.b = er5.o();
        this.c = er5.f();
        this.e = er5.u();
        this.f = bq7.a;
        this.g = true;
        this.h = er5.P;
        this.i = er5.getName();
        this.j = er5.b();
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        Throwable th;
        int i4 = i2;
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 5 || i4 == 7 || i4 == 9 || i4 == 11 || i4 == 19 || i4 == 13 || i4 == 14 || i4 == 16 || i4 == 17) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 5 || i4 == 7 || i4 == 9 || i4 == 11 || i4 == 19 || i4 == 13 || i4 == 14 || i4 == 16 || i4 == 17) {
            i3 = 2;
        } else {
            i3 = 3;
        }
        Object[] objArr = new Object[i3];
        switch (i4) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case h75.g /*15*/:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i4 == 1) {
            objArr[1] = "setOwner";
        } else if (i4 == 2) {
            objArr[1] = "setOriginal";
        } else if (i4 == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i4 == 5) {
            objArr[1] = "setReturnType";
        } else if (i4 == 7) {
            objArr[1] = "setModality";
        } else if (i4 == 9) {
            objArr[1] = "setVisibility";
        } else if (i4 == 11) {
            objArr[1] = "setKind";
        } else if (i4 == 19) {
            objArr[1] = "setName";
        } else if (i4 == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i4 == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i4 == 16) {
            objArr[1] = "setSubstitution";
        } else if (i4 != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i4) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case h75.g /*15*/:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 5 || i4 == 7 || i4 == 9 || i4 == 11 || i4 == 19 || i4 == 13 || i4 == 14 || i4 == 16 || i4 == 17) {
            th = new IllegalStateException(format);
        } else {
            th = new IllegalArgumentException(format);
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: fr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: jr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: lc2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: lc2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: lc2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: lc2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: jr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: jr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: jr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: jr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: jr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: fr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: fr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: fr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: fr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: fr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: lc2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: lc2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: vw3} */
    /* JADX WARNING: type inference failed for: r4v14, types: [vw3] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final er5 b() {
        qz3 qz3;
        qz3 qz32;
        fr5 fr5;
        jr5 jr5;
        dq7 dq7;
        lc2 lc2;
        lc2 lc22;
        sr2 sr2;
        jr5 d2;
        vw3 vw3;
        fr5 c2;
        Object obj;
        Iterator it;
        Object obj2;
        vw3 h2;
        vj1 vj1 = this.a;
        fl4 fl4 = this.b;
        us1 us1 = this.c;
        cr5 cr5 = this.d;
        int i2 = this.e;
        uq4 uq4 = this.i;
        er5 er5 = this.k;
        er5 h1 = er5.h1(vj1, fl4, us1, cr5, i2, uq4);
        List typeParameters = er5.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        dq7 t = h03.t(typeParameters, this.f, h1, arrayList);
        vw3 vw32 = this.j;
        k28 k28 = k28.A;
        vw3 h3 = t.h(vw32, k28);
        Object obj3 = null;
        if (h3 != null) {
            k28 k282 = k28.z;
            vw3 h4 = t.h(vw32, k282);
            if (h4 != null) {
                h1.l1(h4);
            }
            qz3 qz33 = this.h;
            if (qz33 != null) {
                qz3 g1 = qz33.h(t);
                if (g1 != null) {
                    qz3 = g1;
                }
            } else {
                qz3 = null;
            }
            qz3 qz34 = er5.Q;
            if (qz34 == null || (h2 = t.h(qz34.b(), k282)) == null) {
                qz32 = null;
            } else {
                qz34.f1();
                qz32 = new qz3(h1, new t92(h1, h2), qz34.getAnnotations());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = er5.O.iterator();
            while (it2.hasNext()) {
                qz3 qz35 = (qz3) it2.next();
                vw3 h5 = t.h(qz35.b(), k282);
                if (h5 == null) {
                    it = it2;
                    Object obj4 = obj3;
                    obj = obj4;
                    obj2 = obj4;
                } else {
                    obj = obj3;
                    it = it2;
                    uq4 d1 = ((v51) qz35.f1()).d1();
                    qz35.f1();
                    obj2 = new qz3(h1, new v51((pi0) h1, h5, d1), qz35.getAnnotations());
                }
                if (obj2 != null) {
                    arrayList2.add(obj2);
                }
                it2 = it;
                obj3 = obj;
            }
            Throwable th = obj3;
            er5 er52 = h1;
            er52.m1(h3, arrayList, qz3, qz32, arrayList2);
            er5 er53 = er52;
            fr5 fr52 = er5.S;
            or2 or2 = sy6.j;
            if (fr52 == null) {
                fr5 = th;
            } else {
                rm annotations = fr52.getAnnotations();
                fl4 fl42 = this.b;
                us1 f2 = er5.S.f();
                if (this.e == 2 && vs1.e(vs1.g(f2.a.l()))) {
                    f2 = vs1.h;
                }
                us1 us12 = f2;
                fr5 fr53 = er5.S;
                boolean z = fr53.A;
                boolean z2 = fr53.B;
                boolean z3 = fr53.E;
                int i3 = this.e;
                cr5 cr52 = this.d;
                if (cr52 == null) {
                    c2 = th;
                } else {
                    c2 = cr52.c();
                }
                fr5 = new fr5(er53, annotations, fl42, us12, z, z2, z3, i3, c2, or2);
            }
            if (fr5 != 0) {
                fr5 fr54 = er5.S;
                vw3 vw33 = fr54.I;
                fr5.H = er5.i1(t, fr54);
                if (vw33 != null) {
                    vw3 = t.h(vw33, k28);
                } else {
                    vw3 = th;
                }
                fr5.i1(vw3);
            }
            jr5 jr52 = er5.T;
            if (jr52 == null) {
                jr5 = th;
            } else {
                rm annotations2 = jr52.getAnnotations();
                fl4 fl43 = this.b;
                us1 f3 = er5.T.f();
                if (this.e == 2 && vs1.e(vs1.g(f3.a.l()))) {
                    f3 = vs1.h;
                }
                us1 us13 = f3;
                jr5 jr53 = er5.T;
                boolean z4 = jr53.A;
                boolean z5 = jr53.B;
                boolean z6 = jr53.E;
                int i4 = this.e;
                cr5 cr53 = this.d;
                if (cr53 == null) {
                    d2 = th;
                } else {
                    d2 = cr53.d();
                }
                jr5 = new jr5(er53, annotations2, fl43, us13, z4, z5, z6, i4, d2, or2);
            }
            if (jr5 != 0) {
                dq7 = t;
                List j1 = zs2.j1(jr5, er5.T.S(), dq7, false, false, (boolean[]) null);
                if (j1 == null) {
                    j1 = Collections.singletonList(jr5.h1(jr5, ts1.e(this.a).o(), ((h28) er5.T.S().get(0)).getAnnotations()));
                }
                if (j1.size() == 1) {
                    jr5.H = er5.i1(dq7, er5.T);
                    h28 h28 = (h28) j1.get(0);
                    if (h28 != null) {
                        jr5.I = h28;
                    } else {
                        jr5.v0(6);
                        throw th;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else {
                dq7 = t;
            }
            lc2 lc23 = er5.U;
            if (lc23 == null) {
                lc2 = th;
            } else {
                lc2 = new lc2(lc23.getAnnotations(), er53);
            }
            lc2 lc24 = er5.V;
            if (lc24 == null) {
                lc22 = th;
            } else {
                lc22 = new lc2(lc24.getAnnotations(), er53);
            }
            er53.j1(fr5, jr5, lc2, lc22);
            if (this.g) {
                int i5 = wv6.y;
                wv6 f4 = ub5.f();
                for (cr5 h6 : er5.s()) {
                    f4.add(h6.h(dq7));
                }
                er53.G = f4;
            }
            if (er5.B() && (sr2 = er5.D) != null) {
                er53.k1(er5.C, sr2);
            }
            return er53;
        }
        return null;
    }
}
