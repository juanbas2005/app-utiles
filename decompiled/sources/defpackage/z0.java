package defpackage;

import android.graphics.Rect;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* renamed from: z0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z0 extends wx3 implements gs2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(int i, Object obj) {
        super(2);
        this.x = i;
        this.y = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0256, code lost:
        if (r0 != null) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x026a, code lost:
        if (r0 != null) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0295, code lost:
        if (r0 != null) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02aa, code lost:
        if (r0 != null) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ef, code lost:
        if (r0 != null) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0309, code lost:
        if (r0 != null) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ba, code lost:
        if (r0 != null) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c1, code lost:
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ff, code lost:
        if (r0 != null) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0201, code lost:
        r0 = r0.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0206, code lost:
        r0 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0208, code lost:
        defpackage.mb8.b(r1, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0221, code lost:
        if (r0 != null) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0223, code lost:
        defpackage.mb8.b(r1, r3, r0);
     */
    public final Object H(Object obj, Object obj2) {
        boolean z;
        ad3 ad3;
        ic3 ic3;
        bw1 g;
        List list;
        bw1 g2;
        ic3 ic32;
        bw1 g3;
        int i;
        db8 F;
        ad3 ad32;
        ad3 ad33;
        boolean z2;
        boolean z3;
        int i2 = this.x;
        jl4 jl4 = jl4.w;
        boolean z4 = false;
        vs7 vs7 = vs7.a;
        Object obj3 = this.y;
        switch (i2) {
            case b85.b:
                yt2 yt2 = (yt2) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (yt2.V(intValue & 1, z)) {
                    ((a1) obj3).a(0, yt2);
                } else {
                    yt2.Y();
                }
                return vs7;
            case 1:
                yc4 yc4 = (yc4) obj;
                k23 k23 = (k23) obj2;
                xd xdVar = (xd) obj3;
                mb8 mb8 = xdVar.K;
                if (mb8 == null) {
                    mb8 = new mb8(xdVar.N.getInsetsWatcher());
                    xdVar.K = mb8;
                }
                ob8 ob8 = mb8.a;
                yo4 yo4 = mb8.e;
                int[] iArr = yo4.b;
                Object[] objArr = yo4.c;
                long[] jArr = yo4.a;
                int length = jArr.length - 2;
                ad3 ad34 = ad3.e;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = z4;
                            while (i6 < i5) {
                                if ((j & 255) < 128) {
                                    int i7 = (i3 << 3) + i6;
                                    int i8 = iArr[i7];
                                    i = i4;
                                    kb8 kb8 = (kb8) objArr[i7];
                                    ad3 = ad34;
                                    ad3 ad35 = null;
                                    if (!mb8.a(k23, ((lb8) kb8).c)) {
                                        ic3 = ((lb8) kb8).d;
                                        if (!mb8.a(k23, ic3)) {
                                            if (!(i8 == -1 || (ic3 = (ic3) mb8.c.b(i8)) == null)) {
                                                if (!mb8.a(k23, ic3)) {
                                                    ic3 = (ic3) mb8.d.b(i8);
                                                    if (ic3 != null && mb8.a(k23, ic3)) {
                                                        kb8.a.getClass();
                                                        if (kb8 != jb8.j) {
                                                            nb8 nb8 = (nb8) ob8.H(i8).getValue();
                                                            if (nb8 == null) {
                                                                ad32 = null;
                                                                break;
                                                            } else {
                                                                ad32 = nb8.b;
                                                                break;
                                                            }
                                                        } else {
                                                            db8 F2 = ob8.F();
                                                            if (F2 != null) {
                                                                g2 = F2.a.g();
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    kb8.a.getClass();
                                                    if (kb8 != jb8.j) {
                                                        nb8 nb82 = (nb8) ob8.H(i8).getValue();
                                                        if (nb82 == null) {
                                                            ad33 = null;
                                                            break;
                                                        } else {
                                                            ad33 = nb82.a;
                                                            break;
                                                        }
                                                    } else {
                                                        db8 F3 = ob8.F();
                                                        if (F3 != null) {
                                                            g2 = F3.a.g();
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            kb8.a.getClass();
                                            if (kb8 != jb8.j) {
                                                if (!(kb8 == jb8.d || (F = ob8.F()) == null)) {
                                                    ad35 = F.a.i(i8);
                                                }
                                                ad32 = ad35;
                                                break;
                                            } else {
                                                db8 F4 = ob8.F();
                                                if (F4 != null) {
                                                    g2 = F4.a.g();
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        ic32 = ((lb8) kb8).c;
                                        kb8.a.getClass();
                                        if (kb8 == jb8.j) {
                                            db8 F5 = ob8.F();
                                            if (F5 != null) {
                                                g3 = F5.a.g();
                                                break;
                                            }
                                        } else {
                                            db8 F6 = ob8.F();
                                            if (F6 != null) {
                                                ad35 = F6.a.h(i8);
                                            }
                                            ad3 ad36 = ad35;
                                            if (ad36 != null) {
                                                mb8.b(yc4, ic32, ad36);
                                            }
                                        }
                                    }
                                } else {
                                    ad3 = ad34;
                                    i = i4;
                                }
                                j >>= i;
                                i6++;
                                i4 = i;
                                ad34 = ad3;
                            }
                            ad3 = ad34;
                            if (i5 != i4) {
                            }
                        } else {
                            ad3 = ad34;
                        }
                        if (i3 != length) {
                            i3++;
                            ad34 = ad3;
                            z4 = false;
                        }
                    }
                    return vs7;
                }
                ad3 = ad34;
                kb8.a.getClass();
                lb8 lb8 = jb8.j;
                if (mb8.a(k23, lb8.c)) {
                    ic32 = lb8.c;
                    db8 F7 = ob8.F();
                    if (F7 != null) {
                        g3 = F7.a.g();
                        break;
                    }
                } else {
                    ic3 = lb8.d;
                    if (mb8.a(k23, ic3)) {
                        db8 F8 = ob8.F();
                        if (F8 != null) {
                            g2 = F8.a.g();
                            break;
                        }
                    } else {
                        ic3[] ic3Arr = mb8.b;
                        int length2 = ic3Arr.length;
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            if (i9 < length2) {
                                ic3 ic33 = ic3Arr[i9];
                                int i11 = i10 + 1;
                                if (mb8.a(k23, ic33)) {
                                    db8 F9 = ob8.F();
                                    if (!(F9 == null || (g = F9.a.g()) == null)) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            list = bn.c(g.a);
                                        } else {
                                            list = Collections.EMPTY_LIST;
                                        }
                                        Rect rect = (Rect) list.get(i10);
                                        yc4.c(ic33.b(), (float) rect.left);
                                        yc4.c(ic33.d(), (float) rect.top);
                                        yc4.c(ic33.c(), (float) rect.right);
                                        yc4.c(ic33.a(), (float) rect.bottom);
                                    }
                                } else {
                                    i9++;
                                    i10 = i11;
                                }
                            }
                        }
                    }
                }
                return vs7;
                ad3 ad37 = g3.a();
                mb8.b(yc4, ic32, ad37);
                return vs7;
            case 2:
                yt2 yt22 = (yt2) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yt22.V(1 & intValue2, z2)) {
                    Object Q = yt22.Q();
                    if (Q == ay0.a) {
                        Q = ce.C;
                        yt22.o0(Q);
                    }
                    h03.e(ck6.a(jl4, false, (vr2) Q), (gs2) ((aq4) obj3).getValue(), yt22, 0);
                } else {
                    yt22.Y();
                }
                return vs7;
            case 3:
                a52 a52 = (a52) obj;
                a52 a522 = (a52) obj2;
                a52 a523 = a52.y;
                if (a52 == a523 && a522 == a523 && !((x82) obj3).a.e) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 4:
                ((Number) obj2).intValue();
                ((vx0) obj3).a(b85.v(1), (yt2) obj);
                return vs7;
            case 5:
                ml4 ml4 = (ml4) obj;
                ml4 ml42 = (kl4) obj2;
                yt2 yt23 = (yt2) obj3;
                if (ml42 instanceof zx0) {
                    hs2 hs2 = ((zx0) ml42).w;
                    mp7.Q(3, hs2);
                    ml42 = gw8.D(yt23, (ml4) hs2.u(jl4, yt23, 0));
                }
                return ml4.d(ml42);
            case 6:
                ((Number) obj2).intValue();
                ((tu1) obj3).a(b85.v(1), (yt2) obj);
                return vs7;
            case 7:
                yt2 yt24 = (yt2) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (yt24.V(intValue3 & 1, z3)) {
                    List list2 = (List) obj3;
                    int size = list2.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        gs2 gs2 = (gs2) list2.get(i12);
                        int hashCode = Long.hashCode(yt24.T);
                        ux0.d.getClass();
                        xe xeVar = tx0.c;
                        yt24.i0();
                        if (yt24.S) {
                            yt24.l(xeVar);
                        } else {
                            yt24.r0();
                        }
                        g75.Q(tx0.g, yt24, Integer.valueOf(hashCode));
                        gs2.H(yt24, 0);
                        yt24.r(true);
                    }
                } else {
                    yt24.Y();
                }
                return vs7;
            default:
                ((Number) obj2).intValue();
                ((pl5) obj3).a(b85.v(1), (yt2) obj);
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(a1 a1Var, int i, int i2) {
        super(2);
        this.x = i2;
        this.y = a1Var;
    }
}
