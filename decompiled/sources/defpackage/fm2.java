package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: fm2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fm2 extends l66 implements gs2 {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fm2(Object obj, Object obj2, f61 f61, int i) {
        super(2, f61);
        this.y = i;
        this.B = obj;
        this.C = obj2;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.y;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                return ((fm2) o((f61) obj2, (g97) obj)).s(vs7);
            case 1:
                return ((fm2) o((f61) obj2, (g97) obj)).s(vs7);
            case 2:
                return ((fm2) o((f61) obj2, (bl6) obj)).s(vs7);
            case 3:
                return ((fm2) o((f61) obj2, (bl6) obj)).s(vs7);
            default:
                return ((fm2) o((f61) obj2, (g97) obj)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.y;
        Object obj2 = this.C;
        switch (i) {
            case b85.b:
                fm2 fm2 = new fm2((e81) this.B, (gs2) obj2, f61, 0);
                fm2.A = obj;
                return fm2;
            case 1:
                fm2 fm22 = new fm2((wd7) obj2, f61, 1);
                fm22.A = obj;
                return fm22;
            case 2:
                fm2 fm23 = new fm2((sr2) obj2, f61, 2);
                fm23.B = obj;
                return fm23;
            case 3:
                fm2 fm24 = new fm2((al6) this.B, (sr2) obj2, f61, 3);
                fm24.A = obj;
                return fm24;
            default:
                fm2 fm25 = new fm2((lk5) this.B, (h06) obj2, f61, 4);
                fm25.A = obj;
                return fm25;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: g97} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: g97} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: p81} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: vs7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: p81} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: vs7} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:107|108|109|118|119|120|121) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (r6 == r7) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0255, code lost:
        if (defpackage.fd1.r(r6, r2, r1) != r7) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0258, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x025d, code lost:
        if (defpackage.r16.X(r3) != false) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x025f, code lost:
        r1.A = r6;
        r1.z = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0267, code lost:
        if (defpackage.fd1.r(r6, r2, r1) == r7) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x026b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        if (r3 == r7) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b4, code lost:
        if (r4 == r7) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01cf, code lost:
        if (r3 != r7) goto L_0x01d3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x00c5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x00bf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2 A[LOOP:2: B:31:0x00b1->B:35:0x00c2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0175  */
    public final Object s(Object obj) {
        g97 g97;
        g97 g972;
        qk5 qk5;
        int i;
        Object obj2;
        g97 g973;
        bl6 bl6;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        g97 g974;
        List list;
        int size;
        int i2;
        Object obj7;
        int i3 = this.y;
        lk5 lk5 = lk5.y;
        int i4 = 2;
        Object obj8 = vs7.a;
        Object obj9 = p81.w;
        Object obj10 = this.C;
        switch (i3) {
            case b85.b:
                e81 e81 = (e81) this.B;
                int i5 = this.z;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            g97 = this.A;
                            try {
                                o85.q(obj);
                            } catch (CancellationException e) {
                                e = e;
                                break;
                            }
                        } else if (i5 == 3) {
                            o85.q(obj);
                            g97 = (g97) this.A;
                        } else {
                            h.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        g97 = this.A;
                        o85.q(obj);
                        this.A = g97;
                        this.z = 2;
                        break;
                    }
                } else {
                    o85.q(obj);
                    g97 = (g97) this.A;
                }
                if (r16.X(e81)) {
                    this.A = g97;
                    this.z = 1;
                    if (((gs2) obj10).H(g97, this) == obj9) {
                        return obj9;
                    }
                    this.A = g97;
                    this.z = 2;
                }
                return obj8;
            case 1:
                wd7 wd7 = (wd7) obj10;
                int i6 = this.z;
                if (i6 == 0) {
                    o85.q(obj);
                    g973 = (g97) this.A;
                    this.A = g973;
                    this.z = 1;
                    i = 2;
                    obj2 = sb7.b(g973, this, 2);
                    break;
                } else if (i6 == 1) {
                    g973 = (g97) this.A;
                    o85.q(obj);
                    obj2 = obj;
                    i = 2;
                } else if (i6 == 2) {
                    qk5 = (qk5) this.B;
                    o85.q(obj);
                    g972 = (g97) this.A;
                    Object obj11 = obj;
                    List list2 = ((kk5) obj11).a;
                    int size2 = list2.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size2) {
                            qk5 qk52 = (qk5) list2.get(i7);
                            if (!a35.i(qk52.a, qk5.a) || !qk52.d) {
                                i7++;
                            } else {
                                i = 2;
                            }
                        }
                        wd7.c();
                        return obj8;
                    }
                    this.A = g972;
                    this.B = qk5;
                    this.z = i;
                    obj11 = g972.c(lk5.x, this);
                    break;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qk5 qk53 = (qk5) obj2;
                long j = qk53.c;
                wd7.d();
                qk5 qk54 = qk53;
                g972 = g973;
                qk5 = qk54;
                this.A = g972;
                this.B = qk5;
                this.z = i;
                obj11 = g972.c(lk5.x, this);
                break;
            case 2:
                int i8 = this.z;
                if (i8 == 0) {
                    o85.q(obj);
                    bl6 = (bl6) this.B;
                } else if (i8 == 1) {
                    obj3 = this.A;
                    bl6 = (bl6) this.B;
                    o85.q(obj);
                    if (obj3 == null) {
                        return obj8;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object b = ((sr2) obj10).b();
                if (b == null) {
                    this.B = bl6;
                    this.A = b;
                    this.z = 1;
                    bl6.c(this, b);
                } else {
                    obj3 = null;
                    if (obj3 == null) {
                    }
                    Object b2 = ((sr2) obj10).b();
                    if (b2 == null) {
                    }
                }
                this.B = bl6;
                this.A = b2;
                this.z = 1;
                bl6.c(this, b2);
                return obj9;
            case 3:
                bl6 bl62 = (bl6) this.A;
                int i9 = this.z;
                if (i9 == 0) {
                    o85.q(obj);
                    Iterator it = ((al6) this.B).iterator();
                    if (it.hasNext()) {
                        this.A = null;
                        this.z = 1;
                        bl62.getClass();
                        if (!it.hasNext()) {
                            obj5 = obj8;
                        } else {
                            bl62.y = it;
                            bl62.w = 2;
                            bl62.z = this;
                            obj5 = obj9;
                        }
                        if (obj5 != obj9) {
                            return obj8;
                        }
                    } else {
                        this.A = null;
                        this.z = 2;
                        bl62.getClass();
                        Iterator it2 = ((al6) ((sr2) obj10).b()).iterator();
                        if (!it2.hasNext()) {
                            obj4 = obj8;
                        } else {
                            bl62.y = it2;
                            bl62.w = 2;
                            bl62.z = this;
                            obj4 = obj9;
                        }
                        if (obj4 != obj9) {
                            return obj8;
                        }
                    }
                    return obj9;
                } else if (i9 == 1 || i9 == 2) {
                    o85.q(obj);
                    return obj8;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                h06 h06 = (h06) obj10;
                int i10 = this.z;
                kc4 kc4 = kc4.a;
                if (i10 == 0) {
                    o85.q(obj);
                    g974 = (g97) this.A;
                } else if (i10 == 1) {
                    g974 = (g97) this.A;
                    o85.q(obj);
                    obj7 = obj;
                    kk5 kk5 = (kk5) obj7;
                    List list3 = kk5.a;
                    int size3 = list3.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size3) {
                            if (ub5.c((qk5) list3.get(i11))) {
                                i11++;
                                i4 = 2;
                            } else {
                                if (kk5.c == i4) {
                                    h06.w = mc4.a;
                                } else {
                                    int size4 = list3.size();
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= size4) {
                                            this.A = g974;
                                            this.z = 2;
                                            obj6 = g974.c(lk5, this);
                                            break;
                                        } else {
                                            qk5 qk55 = (qk5) list3.get(i12);
                                        }
                                        qk5 qk552 = (qk5) list3.get(i12);
                                        if (qk552.c() || ub5.n(qk552, g974.B.T, g974.d())) {
                                            h06.w = kc4;
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                                h06.w = mc4.a;
                                return obj8;
                            }
                            i11++;
                            i4 = 2;
                        }
                        h06.w = new lc4((qk5) list3.get(0));
                        return obj8;
                    }
                    list = ((kk5) obj6).a;
                    size = list.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                        }
                        if (!((qk5) list.get(i2)).c()) {
                        }
                        i2++;
                    }
                } else if (i10 == 2) {
                    g974 = (g97) this.A;
                    o85.q(obj);
                    obj6 = obj;
                    list = ((kk5) obj6).a;
                    size = list.size();
                    i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            i4 = 2;
                        }
                        if (!((qk5) list.get(i2)).c()) {
                            h06.w = kc4;
                            return obj8;
                        }
                        i2++;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.A = g974;
                this.z = 1;
                obj7 = g974.c((lk5) this.B, this);
                break;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fm2(Object obj, f61 f61, int i) {
        super(2, f61);
        this.y = i;
        this.C = obj;
    }
}
