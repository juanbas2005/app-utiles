package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* renamed from: n40  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n40 implements fi2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public n40(da0 da0, fi2 fi2) {
        this.w = 1;
        this.y = da0;
        this.x = fi2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: eo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: fo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: fo5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: do5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v83, resolved type: do5} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v5, types: [int] */
    /* JADX WARNING: type inference failed for: r1v37, types: [f61, r81, e81] */
    /* JADX WARNING: type inference failed for: r1v38 */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r9v9, types: [int] */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    public final Object k(Object obj, f61 f61) {
        m40 m40;
        int i;
        xi2 xi2;
        Object obj2;
        int i2;
        jj2 jj2;
        int i3;
        fi2 fi2;
        qf4 qf4;
        int i4;
        df3 df3;
        ? r1;
        Object obj3 = obj;
        f61 f612 = f61;
        int i5 = this.w;
        Object obj4 = p81.w;
        ? r9 = 0;
        vs7 vs7 = vs7.a;
        Object obj5 = this.y;
        Object obj6 = this.x;
        switch (i5) {
            case b85.b:
                if (f612 instanceof m40) {
                    m40 = (m40) f612;
                    int i6 = m40.A;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        m40.A = i6 - Integer.MIN_VALUE;
                        Object obj7 = m40.z;
                        i = m40.A;
                        if (i != 0) {
                            o85.q(obj7);
                            fi2 fi22 = (fi2) obj6;
                            String str = (String) obj3;
                            if (str == null || d57.I0(str)) {
                                str = (String) obj5;
                            }
                            m40.A = 1;
                            if (fi22.k(str, m40) == obj4) {
                                return obj4;
                            }
                        } else if (i == 1) {
                            o85.q(obj7);
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        return vs7;
                    }
                }
                m40 = new m40(this, f612);
                Object obj72 = m40.z;
                i = m40.A;
                if (i != 0) {
                }
                return vs7;
            case 1:
                if (f612 instanceof xi2) {
                    xi2 = (xi2) f612;
                    int i7 = xi2.A;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        xi2.A = i7 - Integer.MIN_VALUE;
                        obj2 = xi2.z;
                        i2 = xi2.A;
                        if (i2 != 0) {
                            o85.q(obj2);
                            xi2.C = obj3;
                            xi2.D = 0;
                            xi2.A = 1;
                            obj2 = ((da0) obj5).H(obj3, xi2);
                            if (obj2 == obj4) {
                                return obj4;
                            }
                        } else if (i2 == 1) {
                            int i8 = xi2.D;
                            obj3 = xi2.C;
                            o85.q(obj2);
                            r9 = i8;
                        } else if (i2 == 2) {
                            o85.q(obj2);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                            xi2.C = null;
                            xi2.D = r9;
                            xi2.A = 2;
                            if (((fi2) obj6).k(obj3, xi2) == obj4) {
                                return obj4;
                            }
                            return vs7;
                        }
                        throw new AbortFlowException(this);
                    }
                }
                xi2 = new xi2(this, f612);
                obj2 = xi2.z;
                i2 = xi2.A;
                if (i2 != 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            case 2:
                if (f612 instanceof jj2) {
                    jj2 = (jj2) f612;
                    int i9 = jj2.A;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        jj2.A = i9 - Integer.MIN_VALUE;
                        Object obj8 = jj2.z;
                        i3 = jj2.A;
                        if (i3 != 0) {
                            o85.q(obj8);
                            fi2 = (fi2) obj6;
                            jj2.C = obj3;
                            jj2.D = fi2;
                            jj2.E = 0;
                            jj2.A = 1;
                            if (((gs2) obj5).H(obj3, jj2) == obj4) {
                                return obj4;
                            }
                        } else if (i3 == 1) {
                            int i10 = jj2.E;
                            fi2 fi23 = jj2.D;
                            Object obj9 = jj2.C;
                            o85.q(obj8);
                            fi2 = fi23;
                            obj3 = obj9;
                            r9 = i10;
                        } else if (i3 == 2) {
                            o85.q(obj8);
                            return vs7;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jj2.C = null;
                        jj2.D = null;
                        jj2.E = r9;
                        jj2.A = 2;
                        if (fi2.k(obj3, jj2) == obj4) {
                            return obj4;
                        }
                        return vs7;
                    }
                }
                jj2 = new jj2(this, f612);
                Object obj82 = jj2.z;
                i3 = jj2.A;
                if (i3 != 0) {
                }
                jj2.C = null;
                jj2.D = null;
                jj2.E = r9;
                jj2.A = 2;
                if (fi2.k(obj3, jj2) == obj4) {
                }
                return vs7;
            case 3:
                df3 df32 = (df3) obj3;
                ArrayList arrayList = (ArrayList) obj6;
                if (df32 instanceof dk2) {
                    arrayList.add(df32);
                } else if (df32 instanceof ek2) {
                    arrayList.remove(((ek2) df32).a);
                }
                ((aq4) obj5).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return vs7;
            case 4:
                df3 df33 = (df3) obj3;
                c74 c74 = (c74) obj5;
                lp4 lp4 = (lp4) obj6;
                if ((df33 instanceof r23) || (df33 instanceof dk2) || (df33 instanceof eo5)) {
                    lp4.a(df33);
                } else if (df33 instanceof s23) {
                    lp4.j(((s23) df33).a);
                } else if (df33 instanceof ek2) {
                    lp4.j(((ek2) df33).a);
                } else if (df33 instanceof fo5) {
                    lp4.j(((fo5) df33).a);
                } else if (df33 instanceof do5) {
                    lp4.j(((do5) df33).a);
                }
                Object[] objArr = lp4.a;
                int i11 = lp4.b;
                int i12 = 0;
                while (r9 < i11) {
                    df3 df34 = (df3) objArr[r9];
                    if (df34 instanceof r23) {
                        c74.getClass();
                        i12 |= 2;
                    } else if (df34 instanceof dk2) {
                        c74.getClass();
                        i12 |= 1;
                    } else if (df34 instanceof eo5) {
                        c74.getClass();
                        i12 |= 4;
                    }
                    r9++;
                }
                c74.b.e(i12);
                return vs7;
            case 5:
                rf4 rf4 = (rf4) obj5;
                LinkedHashMap linkedHashMap = rf4.b;
                if (f612 instanceof qf4) {
                    qf4 = (qf4) f612;
                    int i13 = qf4.A;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        qf4.A = i13 - Integer.MIN_VALUE;
                        Object obj10 = qf4.z;
                        i4 = qf4.A;
                        if (i4 != 0) {
                            o85.q(obj10);
                            fi2 fi24 = (fi2) obj6;
                            df3 df35 = (df3) obj3;
                            if (df35 instanceof eo5) {
                                df3 eo5 = new eo5(l35.d(((eo5) df35).a, ((l35) rf4.a.b()).a));
                                linkedHashMap.put(df35, eo5);
                                df3 = eo5;
                            } else if (df35 instanceof do5) {
                                do5 do5 = (do5) df35;
                                eo5 eo52 = (eo5) linkedHashMap.remove(do5.a);
                                df3 = do5;
                                if (eo52 != null) {
                                    df3 = new do5(eo52);
                                }
                            } else {
                                boolean z = df35 instanceof fo5;
                                df3 = df35;
                                if (z) {
                                    fo5 fo5 = (fo5) df35;
                                    eo5 eo53 = (eo5) linkedHashMap.remove(fo5.a);
                                    df3 = fo5;
                                    if (eo53 != null) {
                                        df3 = new fo5(eo53);
                                    }
                                }
                            }
                            qf4.A = 1;
                            if (fi24.k(df3, qf4) == obj4) {
                                return obj4;
                            }
                        } else if (i4 == 1) {
                            o85.q(obj10);
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        return vs7;
                    }
                }
                qf4 = new qf4(this, f612);
                Object obj102 = qf4.z;
                i4 = qf4.A;
                if (i4 != 0) {
                }
                return vs7;
            case 6:
                ((aq4) obj6).setValue(Boolean.TRUE);
                ((ad5) obj5).e(((e30) obj3).c);
                return vs7;
            case 7:
                o81 o81 = (o81) obj5;
                df3 df36 = (df3) obj3;
                ai aiVar = (ai) obj6;
                ed5 ed5 = aiVar.X;
                if (df36 instanceof go5) {
                    if (aiVar.R) {
                        aiVar.V0((go5) df36);
                    } else {
                        aiVar.S.a(df36);
                    }
                }
                ((Boolean) ed5.getValue()).getClass();
                ArrayList arrayList2 = aiVar.U;
                if (df36 instanceof r23) {
                    arrayList2.add(df36);
                } else if (df36 instanceof s23) {
                    arrayList2.remove(((s23) df36).a);
                } else if (df36 instanceof dk2) {
                    arrayList2.add(df36);
                    ed5.setValue(Boolean.TRUE);
                } else if (df36 instanceof ek2) {
                    arrayList2.remove(((ek2) df36).a);
                    int size = arrayList2.size();
                    while (true) {
                        if (r9 >= size) {
                            ed5.setValue(Boolean.FALSE);
                        } else if (!(((df3) arrayList2.get(r9)) instanceof dk2)) {
                            r9++;
                        }
                    }
                } else if (df36 instanceof vy1) {
                    arrayList2.add(df36);
                } else if (df36 instanceof wy1) {
                    arrayList2.remove(((wy1) df36).a);
                } else {
                    if (df36 instanceof uy1) {
                        arrayList2.remove(((uy1) df36).a);
                    }
                    return vs7;
                }
                df3 df37 = (df3) dt0.H0(arrayList2);
                n86 n86 = (n86) aiVar.O.b();
                if (!sg3.e(aiVar.V, df37)) {
                    if (df37 != null) {
                        boolean z2 = df37 instanceof r23;
                        float f = 0.0f;
                        if (z2) {
                            if (n86.c instanceof k86) {
                                f = 0.08f;
                            }
                        } else if (df37 instanceof dk2) {
                            if (n86.b instanceof i86) {
                                f = 0.1f;
                            }
                        } else if ((df37 instanceof vy1) && (n86.d instanceof g86)) {
                            f = 0.16f;
                        }
                        float f2 = f;
                        jo7 jo7 = c86.a;
                        if (!z2) {
                            if (df37 instanceof dk2) {
                                jo7 = new jo7(45, (i12) j12.c, 2);
                            } else if (df37 instanceof vy1) {
                                jo7 = new jo7(45, (i12) j12.c, 2);
                            }
                        }
                        r1 = 0;
                        ar7.H(o81, (e81) null, (r81) null, new xt4(aiVar, f2, jo7, (f61) null, 2), 3);
                    } else {
                        r1 = 0;
                        df3 df38 = aiVar.V;
                        jo7 jo72 = c86.a;
                        if (!(df38 instanceof r23) && !(df38 instanceof dk2) && (df38 instanceof vy1)) {
                            jo72 = new jo7(150, (i12) j12.c, 2);
                        }
                        ar7.H(o81, (e81) null, (r81) null, new k05(aiVar, jo72, (f61) null, 10), 3);
                    }
                    ar7.H(o81, r1, r1, new ot(aiVar, r1, 25), 3);
                    aiVar.V = df37;
                }
                return vs7;
            case 8:
                long j = ((l35) obj3).a;
                uj ujVar = (uj) obj6;
                if ((((l35) ujVar.d()).a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((l35) ujVar.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object f3 = ujVar.f(f612, new l35(j));
                    if (f3 == obj4) {
                        return f3;
                    }
                    return vs7;
                }
                ar7.H((o81) obj5, (e81) null, (r81) null, new wj6(ujVar, j, (f61) null), 3);
                return vs7;
            case 9:
                df3 df39 = (df3) obj3;
                f06 f06 = (f06) obj6;
                if (df39 instanceof eo5) {
                    f06.w++;
                } else if (df39 instanceof fo5) {
                    f06.w--;
                } else if (df39 instanceof do5) {
                    f06.w--;
                }
                if (f06.w > 0) {
                    r9 = 1;
                }
                xh7 xh7 = (xh7) obj5;
                if (xh7.N != r9) {
                    xh7.N = r9;
                    su0.B(xh7);
                }
                return vs7;
            default:
                ((a55) obj6).a((be8) obj5, (r31) obj3);
                return vs7;
        }
    }

    public /* synthetic */ n40(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }
}
