package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: k3  reason: default package */
public final class k3 implements sr2 {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ k3(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: dq7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: mo7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: dq7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: dq7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v86, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: a42} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: java.lang.reflect.Type} */
    /* JADX WARNING: type inference failed for: r22v1, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r22v2, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r22v4, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v11, types: [qz3] */
    /* JADX WARNING: type inference failed for: r8v22, types: [java.util.Map, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v24, types: [java.util.Map, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0ac9  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0acc A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 5 */
    public final Object b() {
        dq7 dq7;
        Iterator it;
        Type type;
        Type type2;
        wp0 w1;
        ? r7;
        a42 a42;
        Type type3;
        int i;
        Object obj;
        a42 a422;
        d16 d16;
        b62 b62;
        tw3 tw3;
        ps psVar;
        int i2 = this.w;
        a42 a423 = a42.w;
        b42 b42 = b42.w;
        int i3 = 10;
        int i4 = 0;
        Type type4 = null;
        Object obj2 = this.x;
        switch (i2) {
            case b85.b:
                ut1 ut1 = (ut1) obj2;
                ql4 f1 = ut1.f1();
                if (f1 == null) {
                    return a423;
                }
                Iterable l = f1.l();
                l.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = l.iterator();
                while (it2.hasNext()) {
                    wp0 wp0 = (wp0) it2.next();
                    s63 s63 = mo7.c0;
                    kb4 kb4 = ut1.A;
                    wp0.getClass();
                    s63.getClass();
                    qm qmVar = me6.x;
                    kb4.getClass();
                    if (ut1.f1() == null) {
                        dq7 = type4;
                    } else {
                        dq7 = dq7.d(ut1.g1());
                    }
                    if (!(dq7 == null || (w1 = wp0.h(dq7)) == null)) {
                        rm annotations = wp0.getAnnotations();
                        int u = wp0.u();
                        if (u != 0) {
                            sy6 e = ut1.e();
                            e.getClass();
                            wp0 wp02 = w1;
                            mo7 mo7 = new mo7(kb4, ut1, w1, (mo7) null, annotations, u, e);
                            wp0 wp03 = wp02;
                            List S = wp0.S();
                            if (S != null) {
                                dq7 dq72 = dq7;
                                ArrayList j1 = zs2.j1(mo7, S, dq72, false, false, (boolean[]) null);
                                if (j1 != null) {
                                    fu6 y = o85.y(mp7.f0(wp03.C.n0()), ut1.g0());
                                    qz3 qz3 = wp0.F;
                                    k28 k28 = k28.y;
                                    if (qz3 != null) {
                                        r7 = fd1.B(mo7, dq72.f(qz3.b(), k28), qmVar);
                                    } else {
                                        r7 = type4;
                                    }
                                    ql4 f12 = ut1.f1();
                                    if (f12 != null) {
                                        List h0 = wp0.h0();
                                        h0.getClass();
                                        ArrayList arrayList2 = new ArrayList(et0.e0(h0, i3));
                                        int i5 = i4;
                                        Type type5 = type4;
                                        for (Object next : h0) {
                                            int i6 = i5 + 1;
                                            if (i5 >= 0) {
                                                qz3 qz32 = (qz3) next;
                                                vw3 f = dq72.f(qz32.b(), k28);
                                                xx5 f13 = qz32.f1();
                                                f13.getClass();
                                                Iterator it3 = it2;
                                                v51 v51 = new v51(f12, f, ((v51) f13).d1());
                                                k26 k26 = xq4.a;
                                                arrayList2.add(new qz3(f12, v51, qmVar, uq4.e(xq4.b + '_' + i5)));
                                                it2 = it3;
                                                i5 = i6;
                                                type5 = type5;
                                            } else {
                                                ? r22 = type5;
                                                sg3.Z();
                                                throw r22;
                                            }
                                        }
                                        a42 = arrayList2;
                                        type3 = type5;
                                    } else {
                                        a42 = a423;
                                        type3 = type4;
                                    }
                                    it = it2;
                                    type = type3;
                                    mo7.k1(r7, (qz3) null, a42, ut1.u0(), j1, y, fl4.x, ut1.B);
                                    type2 = mo7;
                                    if (type2 == null) {
                                        arrayList.add(type2);
                                    }
                                    it2 = it;
                                    type4 = type;
                                    i3 = 10;
                                    i4 = 0;
                                }
                            } else {
                                ? r222 = type4;
                                zs2.v0(28);
                                throw r222;
                            }
                        } else {
                            throw type4;
                        }
                    }
                    it = it2;
                    type2 = type4;
                    type = type2;
                    if (type2 == null) {
                    }
                    it2 = it;
                    type4 = type;
                    i3 = 10;
                    i4 = 0;
                }
                return arrayList;
            case 1:
                return new m3(((n3) obj2).a());
            case 2:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                p3 p3Var = (p3) obj2;
                sb.append(((uq4) p3Var.x).b());
                return i95.l(sb.toString(), ((r3) p3Var.y).getUpperBounds());
            case 3:
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        i = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        i = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        i = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        i = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        i = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        i = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        i = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        i = Arrays.hashCode((double[]) value);
                    } else if (value instanceof Object[]) {
                        i = Arrays.hashCode((Object[]) value);
                    } else {
                        i = value.hashCode();
                    }
                    i4 += i ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(i4);
            case 4:
                fk7 fk7 = (fk7) obj2;
                return new jt0(uq3.F(fk7.a, fk7.b, j12.b.b(0.0f)));
            case 5:
                jd0 jd0 = (jd0) obj2;
                return jd0.a.j(jd0.b).g0();
            case 6:
                vw3 b = ((xp7) obj2).b();
                b.getClass();
                return b;
            case 7:
                return (Class) obj2;
            case 8:
                Object obj3 = ((h06) obj2).w;
                if (obj3 != null) {
                    return (cu6) obj3;
                }
                sg3.a0("result");
                throw null;
            case 9:
                y16 y16 = ((c2) obj2).w;
                if (y16 != null) {
                    type4 = y16.b();
                }
                type4.getClass();
                return m06.c(type4);
            case 10:
                return new yq1((zq1) obj2);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return new ar1((br1) obj2);
            case 12:
                return new cr1((dr1) obj2);
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return new er1((fr1) obj2);
            case 14:
                return new zr1((as1) obj2);
            case h75.g:
                ps1 ps1 = ((ms1) obj2).a;
                ps1 ps12 = new ps1();
                jz0 jz0 = ps1.s;
                yr3[] yr3Arr = ps1.Z;
                yr3 yr3 = yr3Arr[17];
                jz0.getClass();
                yr3.getClass();
                Boolean bool = (Boolean) jz0.x;
                bool.booleanValue();
                ps12.s.U(yr3Arr[17], bool);
                ps12.O.U(yr3Arr[39], Boolean.valueOf(ps1.l()));
                am m = ps1.m();
                m.getClass();
                ps12.N.U(yr3Arr[38], m);
                jz0 jz02 = ps1.M;
                yr3 yr32 = yr3Arr[37];
                jz02.getClass();
                yr32.getClass();
                ps12.M.U(yr3Arr[37], (vr2) jz02.x);
                ps12.X.U(yr3Arr[48], Boolean.valueOf(ps1.n()));
                jz0 jz03 = ps1.i;
                yr3 yr33 = yr3Arr[7];
                jz03.getClass();
                yr33.getClass();
                Boolean bool2 = (Boolean) jz03.x;
                bool2.booleanValue();
                ps12.i.U(yr3Arr[7], bool2);
                ps12.j(ps1.o());
                ps12.f(ps1.p());
                ps12.z.U(yr3Arr[24], ps1.q());
                jz0 jz04 = ps1.J;
                yr3 yr34 = yr3Arr[34];
                jz04.getClass();
                yr34.getClass();
                Boolean bool3 = (Boolean) jz04.x;
                bool3.booleanValue();
                ps12.J.U(yr3Arr[34], bool3);
                ps12.m.U(yr3Arr[11], Boolean.valueOf(ps1.r()));
                jz0 jz05 = ps1.K;
                yr3 yr35 = yr3Arr[35];
                jz05.getClass();
                yr35.getClass();
                Set set = (Set) jz05.x;
                set.getClass();
                ps12.K.U(yr3Arr[35], set);
                ps12.F(ps1.s());
                ps12.T.U(yr3Arr[44], Boolean.valueOf(ps1.t()));
                jz0 jz06 = ps1.u;
                yr3 yr36 = yr3Arr[19];
                jz06.getClass();
                yr36.getClass();
                Boolean bool4 = (Boolean) jz06.x;
                bool4.booleanValue();
                ps12.u.U(yr3Arr[19], bool4);
                jz0 jz07 = ps1.Y;
                yr3 yr37 = yr3Arr[49];
                jz07.getClass();
                yr37.getClass();
                Boolean bool5 = (Boolean) jz07.x;
                bool5.booleanValue();
                ps12.Y.U(yr3Arr[49], bool5);
                ps12.b(ps1.u());
                jz0 jz08 = ps1.n;
                yr3 yr38 = yr3Arr[12];
                jz08.getClass();
                yr38.getClass();
                Boolean bool6 = (Boolean) jz08.x;
                bool6.booleanValue();
                ps12.n.U(yr3Arr[12], bool6);
                f95 v = ps1.v();
                v.getClass();
                ps12.B.U(yr3Arr[26], v);
                jz0 jz09 = ps1.E;
                yr3 yr39 = yr3Arr[29];
                jz09.getClass();
                yr39.getClass();
                ps12.i((qc5) jz09.x);
                jz0 jz010 = ps1.U;
                yr3 yr310 = yr3Arr[45];
                jz010.getClass();
                yr310.getClass();
                Boolean bool7 = (Boolean) jz010.x;
                bool7.booleanValue();
                ps12.U.U(yr3Arr[45], bool7);
                jz0 jz011 = ps1.W;
                yr3 yr311 = yr3Arr[47];
                jz011.getClass();
                yr311.getClass();
                Boolean bool8 = (Boolean) jz011.x;
                bool8.booleanValue();
                ps12.W.U(yr3Arr[47], bool8);
                br5 w2 = ps1.w();
                w2.getClass();
                ps12.H.U(yr3Arr[32], w2);
                jz0 jz012 = ps1.v;
                yr3 yr312 = yr3Arr[20];
                jz012.getClass();
                yr312.getClass();
                ps12.v.U(yr3Arr[20], (vr2) jz012.x);
                jz0 jz013 = ps1.F;
                yr3 yr313 = yr3Arr[30];
                jz013.getClass();
                yr313.getClass();
                ps12.h(((Boolean) jz013.x).booleanValue());
                jz0 jz014 = ps1.S;
                yr3 yr314 = yr3Arr[43];
                jz014.getClass();
                yr314.getClass();
                Boolean bool9 = (Boolean) jz014.x;
                bool9.booleanValue();
                ps12.S.U(yr3Arr[43], bool9);
                jz0 jz015 = ps1.G;
                yr3 yr315 = yr3Arr[31];
                jz015.getClass();
                yr315.getClass();
                ps12.g(((Boolean) jz015.x).booleanValue());
                jz0 jz016 = ps1.q;
                yr3 yr316 = yr3Arr[15];
                jz016.getClass();
                yr316.getClass();
                Boolean bool10 = (Boolean) jz016.x;
                bool10.booleanValue();
                ps12.q.U(yr3Arr[15], bool10);
                jz0 jz017 = ps1.P;
                yr3 yr317 = yr3Arr[40];
                jz017.getClass();
                yr317.getClass();
                Boolean bool11 = (Boolean) jz017.x;
                bool11.booleanValue();
                ps12.P.U(yr3Arr[40], bool11);
                jz0 jz018 = ps1.I;
                yr3 yr318 = yr3Arr[33];
                jz018.getClass();
                yr318.getClass();
                Boolean bool12 = (Boolean) jz018.x;
                bool12.booleanValue();
                ps12.I.U(yr3Arr[33], bool12);
                jz0 jz019 = ps1.p;
                yr3 yr319 = yr3Arr[14];
                jz019.getClass();
                yr319.getClass();
                Boolean bool13 = (Boolean) jz019.x;
                bool13.booleanValue();
                ps12.p.U(yr3Arr[14], bool13);
                ps12.o.U(yr3Arr[13], Boolean.valueOf(ps1.x()));
                jz0 jz020 = ps1.V;
                yr3 yr320 = yr3Arr[46];
                jz020.getClass();
                yr320.getClass();
                Boolean bool14 = (Boolean) jz020.x;
                bool14.getClass();
                ps12.V.U(yr3Arr[46], bool14);
                jz0 jz021 = ps1.r;
                yr3 yr321 = yr3Arr[16];
                jz021.getClass();
                yr321.getClass();
                Boolean bool15 = (Boolean) jz021.x;
                bool15.booleanValue();
                ps12.r.U(yr3Arr[16], bool15);
                jz0 jz022 = ps1.R;
                yr3 yr322 = yr3Arr[42];
                jz022.getClass();
                yr322.getClass();
                Boolean bool16 = (Boolean) jz022.x;
                bool16.booleanValue();
                ps12.R.U(yr3Arr[42], bool16);
                jz0 jz023 = ps1.Q;
                yr3 yr323 = yr3Arr[41];
                jz023.getClass();
                yr323.getClass();
                Boolean bool17 = (Boolean) jz023.x;
                bool17.booleanValue();
                ps12.Q.U(yr3Arr[41], bool17);
                ps12.A.U(yr3Arr[25], Boolean.valueOf(ps1.y()));
                ps12.g.U(yr3Arr[5], Boolean.valueOf(ps1.z()));
                ps12.a(ps1.A());
                ps12.d(ps1.B());
                jz0 jz024 = ps1.y;
                yr3 yr324 = yr3Arr[23];
                jz024.getClass();
                yr324.getClass();
                vr2 vr2 = (vr2) jz024.x;
                vr2.getClass();
                ps12.y.U(yr3Arr[23], vr2);
                jz0 jz025 = ps1.t;
                yr3 yr325 = yr3Arr[18];
                jz025.getClass();
                yr325.getClass();
                Boolean bool18 = (Boolean) jz025.x;
                bool18.booleanValue();
                ps12.t.U(yr3Arr[18], bool18);
                jz0 jz026 = ps1.k;
                yr3 yr326 = yr3Arr[9];
                jz026.getClass();
                yr326.getClass();
                Boolean bool19 = (Boolean) jz026.x;
                bool19.booleanValue();
                ps12.k.U(yr3Arr[9], bool19);
                js1 C = ps1.C();
                C.getClass();
                ps12.C.U(yr3Arr[27], C);
                ps12.j.U(yr3Arr[8], Boolean.valueOf(ps1.D()));
                jz0 jz027 = ps1.c;
                yr3Arr[1].getClass();
                ps12.c(((Boolean) jz027.x).booleanValue());
                jz0 jz028 = ps1.d;
                yr3Arr[2].getClass();
                Boolean bool20 = (Boolean) jz028.x;
                bool20.booleanValue();
                ps12.d.U(yr3Arr[2], bool20);
                jz0 jz029 = ps1.l;
                yr3 yr327 = yr3Arr[10];
                jz029.getClass();
                yr327.getClass();
                Boolean bool21 = (Boolean) jz029.x;
                bool21.booleanValue();
                ps12.l.U(yr3Arr[10], bool21);
                jz0 jz030 = ps1.x;
                yr3 yr328 = yr3Arr[22];
                jz030.getClass();
                yr328.getClass();
                ps12.e(((Boolean) jz030.x).booleanValue());
                ps12.k(ps1.E());
                ms1 ms1 = ms1.c;
                ps12.F(wn6.o(ps12.s(), sg3.E(m27.p, m27.q)));
                ps12.a = true;
                return new ms1(ps12);
            case 16:
                HashSet hashSet = new HashSet();
                gt1 gt1 = (gt1) ((am6) obj2).A;
                ft1 ft1 = gt1.J;
                z00 z00 = gt1.H;
                tr5 tr5 = gt1.A;
                for (vw3 R : ft1.e()) {
                    for (vj1 vj1 : t75.n(R.R(), (is1) null, 3)) {
                        if ((vj1 instanceof au6) || (vj1 instanceof cr5)) {
                            hashSet.add(((ri0) vj1).getName());
                        }
                    }
                }
                List<js5> list = tr5.M;
                list.getClass();
                for (js5 js5 : list) {
                    hashSet.add(t49.P((vq4) z00.b, js5.B));
                }
                List<qs5> list2 = tr5.N;
                list2.getClass();
                for (qs5 qs5 : list2) {
                    hashSet.add(t49.P((vq4) z00.b, qs5.B));
                }
                return wn6.o(hashSet, hashSet);
            case 17:
                qt1 qt1 = (qt1) obj2;
                Iterable n = qt1.n();
                if (n == null) {
                    return null;
                }
                return wn6.o(wn6.o(qt1.m(), qt1.c.c.keySet()), n);
            case 18:
                ArrayList arrayList3 = new ArrayList();
                for (Object next2 : ((LinkedHashMap) ((rd0) obj2).E.A).keySet()) {
                    gq0 gq0 = (gq0) next2;
                    if (!gq0.g() && !eq0.c.contains(gq0)) {
                        arrayList3.add(next2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(et0.e0(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((gq0) it4.next()).f());
                }
                return arrayList4;
            case 19:
                vt1 vt1 = (vt1) obj2;
                z00 z002 = vt1.G;
                return dt0.b1(((ws1) z002.a).e.l(vt1.H, (vq4) z002.b));
            case 20:
                y52 y52 = (y52) obj2;
                HashSet hashSet2 = new HashSet();
                for (uq4 uq4 : (Set) y52.e.E.b()) {
                    oz4 oz4 = oz4.B;
                    hashSet2.addAll(y52.b(uq4, oz4));
                    hashSet2.addAll(y52.f(uq4, oz4));
                }
                return hashSet2;
            case 21:
                ArrayList arrayList5 = ((bu2) obj2).a;
                tp4 tp4 = new tp4(arrayList5.size());
                int size = arrayList5.size();
                while (i4 < size) {
                    ss3 ss3 = (ss3) arrayList5.get(i4);
                    Object obj4 = ss3.b;
                    int i7 = ss3.a;
                    if (obj4 != null) {
                        obj = new nl3(Integer.valueOf(i7), ss3.b);
                    } else {
                        obj = Integer.valueOf(i7);
                    }
                    co4.a(tp4, obj, ss3);
                    i4++;
                }
                return new co4(tp4);
            case 22:
                vv2 vv2 = (vv2) obj2;
                List h = vv2.h();
                ArrayList arrayList6 = new ArrayList(3);
                j0 j0Var = vv2.b;
                Iterable<vw3> e2 = j0Var.n().e();
                e2.getClass();
                ArrayList arrayList7 = new ArrayList();
                for (vw3 R2 : e2) {
                    it0.h0(arrayList7, t75.n(R2.R(), (is1) null, 3));
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it5 = arrayList7.iterator();
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    if (next3 instanceof ri0) {
                        arrayList8.add(next3);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it6 = arrayList8.iterator();
                while (it6.hasNext()) {
                    Object next4 = it6.next();
                    uq4 name = ((ri0) next4).getName();
                    Object obj5 = linkedHashMap.get(name);
                    if (obj5 == null) {
                        obj5 = new ArrayList();
                        linkedHashMap.put(name, obj5);
                    }
                    ((List) obj5).add(next4);
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    key.getClass();
                    uq4 uq42 = (uq4) key;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object next5 : (List) entry2.getValue()) {
                        Boolean valueOf = Boolean.valueOf(((ri0) next5) instanceof xs2);
                        Object obj6 = linkedHashMap2.get(valueOf);
                        if (obj6 == null) {
                            obj6 = new ArrayList();
                            linkedHashMap2.put(valueOf, obj6);
                        }
                        ((List) obj6).add(next5);
                    }
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        boolean booleanValue = ((Boolean) entry3.getKey()).booleanValue();
                        List list3 = (List) entry3.getValue();
                        h95 h95 = h95.c;
                        if (booleanValue) {
                            ArrayList arrayList9 = new ArrayList();
                            for (Object next6 : h) {
                                if (sg3.e(((wj1) ((xs2) next6)).getName(), uq42)) {
                                    arrayList9.add(next6);
                                }
                            }
                            a422 = arrayList9;
                        } else {
                            a422 = a423;
                        }
                        h95.h(uq42, list3, a422, j0Var, new uv2(arrayList6, vv2));
                    }
                }
                return dt0.M0(h, rd3.j(arrayList6));
            case 23:
                Type genericReturnType = ((zh3) obj2).x.getGenericReturnType();
                genericReturnType.getClass();
                return ar7.Y(genericReturnType, b42.w, pp7.w, true, false, (gq7) null, 24);
            case 24:
                return new bj3((cj3) obj2);
            case 25:
                return rg3.c((jj3) obj2, true);
            case 26:
                Map map = di3.a;
                o06 o06 = ((qj3) obj2).d;
                if (o06 instanceof d16) {
                    d16 = (d16) o06;
                } else {
                    d16 = null;
                }
                if (d16 == null || (tw3 = (tw3) di3.b.get(uq4.e(d16.b.name()).b())) == null) {
                    b62 = null;
                } else {
                    up2 up2 = m27.v;
                    up2.getClass();
                    b62 = new b62(new gq0(up2.b(), up2.a.g()), uq4.e(tw3.name()));
                }
                if (b62 != null) {
                    ? singletonMap = Collections.singletonMap(bi3.c, b62);
                    singletonMap.getClass();
                    type4 = singletonMap;
                }
                if (type4 == null) {
                    return b42;
                }
                return type4;
            case 27:
                o06 o062 = ((rj3) obj2).d;
                if (o062 instanceof q06) {
                    Map map2 = di3.a;
                    psVar = di3.a(((q06) o062).a());
                } else if (o062 instanceof d16) {
                    Map map3 = di3.a;
                    psVar = di3.a(sg3.D(o062));
                } else {
                    psVar = null;
                }
                if (psVar != null) {
                    ? singletonMap2 = Collections.singletonMap(bi3.b, psVar);
                    singletonMap2.getClass();
                    type4 = singletonMap2;
                }
                if (type4 == null) {
                    return b42;
                }
                return type4;
            case 28:
                ln3 ln3 = (ln3) obj2;
                n74 m2 = sg3.m();
                m2.add(ln3.a.w);
                x46 x46 = ln3.b;
                if (x46 != null) {
                    m2.add("under-migration:".concat(x46.w));
                }
                for (Map.Entry entry4 : ln3.c.entrySet()) {
                    m2.add("@" + entry4.getKey() + ':' + ((x46) entry4.getValue()).w);
                }
                return (String[]) sg3.i(m2).toArray(new String[0]);
            default:
                un3 un3 = (un3) obj2;
                sn3 sn3 = un3.f;
                if (sn3 != null) {
                    tn3 tn3 = (tn3) sn3.b();
                    un3.f = null;
                    return tn3;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
    }
}
