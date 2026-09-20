package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bk7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bk7 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public bk7(z00 z00, bk7 bk7, List list, String str, String str2) {
        Map map;
        list.getClass();
        this.b = z00;
        this.c = bk7;
        this.d = str;
        this.e = str2;
        kb4 kb4 = ((ws1) z00.a).a;
        int i = 0;
        this.f = kb4.c(new zo7(this, 0));
        this.g = kb4.c(new zo7(this, 1));
        if (list.isEmpty()) {
            map = b42.w;
        } else {
            map = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gt5 gt5 = (gt5) it.next();
                map.put(Integer.valueOf(gt5.z), new vt1((z00) this.b, gt5, i));
                i++;
            }
        }
        this.h = map;
    }

    public static fu6 a(fu6 fu6, vw3 vw3) {
        fv3 k = jb5.k(fu6);
        rm annotations = fu6.getAnnotations();
        vw3 w = ag8.w(fu6);
        List s = ag8.s(fu6);
        List<xp7> t0 = dt0.t0(1, ag8.y(fu6));
        ArrayList arrayList = new ArrayList(et0.e0(t0, 10));
        for (xp7 b2 : t0) {
            arrayList.add(b2.b());
        }
        return ag8.o(k, annotations, w, s, arrayList, vw3, true).o0(fu6.Q());
    }

    public static final ArrayList e(bt5 bt5, bk7 bk7) {
        Iterable iterable;
        List list = bt5.z;
        list.getClass();
        bt5 w = p25.w(bt5, (wv1) ((z00) bk7.b).d);
        if (w != null) {
            iterable = e(w, bk7);
        } else {
            iterable = null;
        }
        if (iterable == null) {
            iterable = a42.w;
        }
        return dt0.M0(list, iterable);
    }

    public static ro7 f(List list, rm rmVar) {
        ro7 ro7;
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((go1) it.next()).getClass();
            if (rmVar.isEmpty()) {
                ro7.x.getClass();
                ro7 = ro7.y;
            } else {
                kg5 kg5 = ro7.x;
                List D = sg3.D(new um(rmVar));
                kg5.getClass();
                ro7 = kg5.l(D);
            }
            arrayList.add(ro7);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it0.h0(arrayList2, (Iterable) it2.next());
        }
        ro7.x.getClass();
        return kg5.l(arrayList2);
    }

    public static final ql4 h(bk7 bk7, bt5 bt5, int i) {
        z00 z00 = (z00) bk7.b;
        gq0 J = t49.J((vq4) z00.b, i);
        al6<bt5> S = cl6.S(new zo7(bk7, 2), bt5);
        ArrayList arrayList = new ArrayList();
        for (bt5 bt52 : S) {
            bt52.getClass();
            arrayList.add(Integer.valueOf(bt52.z.size()));
        }
        Iterator it = cl6.S(ap7.D, J).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                sg3.Y();
                throw null;
            }
        }
        while (arrayList.size() < i2) {
            arrayList.add(0);
        }
        return ((ws1) z00.a).l.E(J, arrayList);
    }

    public List b() {
        return dt0.b1(((Map) this.h).values());
    }

    public qp7 c(int i) {
        qp7 qp7 = (qp7) ((Map) this.h).get(Integer.valueOf(i));
        if (qp7 != null) {
            return qp7;
        }
        bk7 bk7 = (bk7) this.c;
        if (bk7 != null) {
            return bk7.c(i);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: qp7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: qp7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: qp7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: qp7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: qp7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013b  */
    public fu6 d(bt5 bt5, boolean z) {
        wo7 wo7;
        fu6 fu6;
        bt5 bt52;
        fu6 fu62;
        ht2 ht2;
        xp7 xp7;
        vw3 b2;
        up2 up2;
        pi0 pi0;
        up2 up22;
        int size;
        rm rmVar;
        boolean z2;
        Object obj;
        k28 k28;
        bt5 bt53;
        Object p27;
        vq0 vq0;
        vq0 vq02;
        bt5 bt54 = bt5;
        z00 z00 = (z00) this.b;
        wv1 wv1 = (wv1) z00.d;
        vj1 vj1 = (vj1) z00.c;
        ws1 ws1 = (ws1) z00.a;
        bt54.getClass();
        if (bt54.p()) {
            if (t49.J((vq4) z00.b, bt54.E).c) {
                ((ws1) z00.a).g.getClass();
            }
        } else if ((bt54.y & 128) == 128) {
            if (t49.J((vq4) z00.b, bt54.H).c) {
                ((ws1) z00.a).g.getClass();
            }
        }
        if (bt54.p()) {
            vq0 = (vq0) ((m70) this.f).y(Integer.valueOf(bt54.E));
            if (vq0 == null) {
                vq0 = h(this, bt54, bt54.E);
            }
        } else {
            int i = bt54.y;
            if ((i & 32) == 32) {
                vq0 = c(bt54.F);
                if (vq0 == null) {
                    z62 z62 = z62.a;
                    wo7 = z62.d(x62.K, String.valueOf(bt54.F), (String) this.e);
                    int i2 = 1;
                    if (!z62.f(wo7.u())) {
                        z62 z622 = z62.a;
                        return z62.e(x62.S, a42.w, wo7, (String[]) Arrays.copyOf(new String[]{wo7.toString()}, 1));
                    }
                    xs1 xs1 = new xs1(ws1.a, new p3(this, false, bt54, 29));
                    ro7 f2 = f(ws1.r, xs1);
                    ArrayList e2 = e(bt54, this);
                    ArrayList arrayList = new ArrayList(et0.e0(e2, 10));
                    Iterator it = e2.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            zs5 zs5 = (zs5) next;
                            List parameters = wo7.getParameters();
                            parameters.getClass();
                            qp7 qp7 = (qp7) dt0.z0(i3, parameters);
                            ys5 ys5 = zs5.y;
                            if (ys5 != ys5.A) {
                                ys5.getClass();
                                int ordinal = ys5.ordinal();
                                if (ordinal == 0) {
                                    k28 = k28.z;
                                } else if (ordinal == i2) {
                                    k28 = k28.A;
                                } else if (ordinal == 2) {
                                    k28 = k28.y;
                                } else if (ordinal != 3) {
                                    h.c();
                                    return null;
                                } else {
                                    kj6.o("Only IN, OUT and INV are supported. Actual argument: ", ys5);
                                    return null;
                                }
                                int i5 = zs5.x;
                                if ((i5 & 2) == 2) {
                                    bt53 = zs5.z;
                                } else if ((i5 & 4) == 4) {
                                    bt53 = wv1.a(zs5.A);
                                } else {
                                    bt53 = null;
                                }
                                if (bt53 == null) {
                                    obj = new p27((vw3) z62.c(x62.X, zs5.toString()));
                                    arrayList.add(obj);
                                    i3 = i4;
                                    i2 = 1;
                                } else {
                                    p27 = new p27(g(bt53), k28);
                                }
                            } else if (qp7 == null) {
                                obj = new o27(ws1.b.g());
                                arrayList.add(obj);
                                i3 = i4;
                                i2 = 1;
                            } else {
                                p27 = new p27(qp7);
                            }
                            obj = p27;
                            arrayList.add(obj);
                            i3 = i4;
                            i2 = 1;
                        } else {
                            sg3.Z();
                            throw null;
                        }
                    }
                    List b1 = dt0.b1(arrayList);
                    vq0 u = wo7.u();
                    if (!z || !(u instanceof ut1)) {
                        boolean booleanValue = wg2.a.e(bt54.M).booleanValue();
                        boolean z3 = bt54.A;
                        if (booleanValue) {
                            int size2 = wo7.getParameters().size() - b1.size();
                            if (size2 == 0) {
                                fu62 = kl8.I(f2, wo7, b1, z3);
                                vq0 u2 = fu62.L().u();
                                if (u2 == null || !(u2 instanceof ql4) || !fv3.J(u2)) {
                                    ht2 = null;
                                } else {
                                    int i6 = ts1.a;
                                    vp2 f3 = rs1.f(u2);
                                    f3.getClass();
                                    ht2 = ag8.t(f3);
                                }
                                if (!(!sg3.e(ht2, dt2.d) || (xp7 = (xp7) dt0.H0(ag8.y(fu62))) == null || (b2 = xp7.b()) == null)) {
                                    vq0 u3 = b2.L().u();
                                    if (u3 != null) {
                                        up2 = ts1.g(u3);
                                    } else {
                                        up2 = null;
                                    }
                                    if (b2.G().size() == 1 && (sg3.e(up2, n27.g) || sg3.e(up2, bp7.a))) {
                                        vw3 b3 = ((xp7) dt0.Q0(b2.G())).b();
                                        b3.getClass();
                                        if (vj1 instanceof pi0) {
                                            pi0 = (pi0) vj1;
                                        } else {
                                            pi0 = null;
                                        }
                                        if (pi0 != null) {
                                            up22 = ts1.c(pi0);
                                        } else {
                                            up22 = null;
                                        }
                                        fu62 = sg3.e(up22, y87.a) ? a(fu62, b3) : a(fu62, b3);
                                    }
                                    if (fu62 == null) {
                                    }
                                }
                            } else if (size2 == 1 && (size = b1.size() - 1) >= 0) {
                                wo7 n = wo7.g().w(size).n();
                                n.getClass();
                                fu62 = kl8.I(f2, n, b1, z3);
                                if (fu62 == null) {
                                    z62 z623 = z62.a;
                                    fu6 = z62.e(x62.M, b1, wo7, new String[0]);
                                } else {
                                    fu6 = fu62;
                                }
                            }
                            fu62 = null;
                            if (fu62 == null) {
                            }
                        } else {
                            fu6 = kl8.I(f2, wo7, b1, z3);
                            if (wg2.b.e(bt54.M).booleanValue()) {
                                fu6 w = pe2.w(fu6, true);
                                if (w != null) {
                                    fu6 = w;
                                } else {
                                    ku4.z("null DefinitelyNotNullType for '", fu6);
                                    return null;
                                }
                            }
                        }
                    } else {
                        ut1 ut1 = (ut1) u;
                        hr2 hr2 = new hr2(13);
                        List<qp7> parameters2 = ut1.D.getParameters();
                        ArrayList arrayList2 = new ArrayList(et0.e0(parameters2, 10));
                        for (qp7 a2 : parameters2) {
                            arrayList2.add(a2.a());
                        }
                        no7 no7 = new no7((Object) null, ut1, b1, sf4.a0(dt0.i1(arrayList2, b1)), 0);
                        ro7.x.getClass();
                        ro7 ro7 = ro7.y;
                        ro7.getClass();
                        fu6 u4 = hr2.u(no7, ro7, false, 0, true);
                        List list = ws1.r;
                        ArrayList K0 = dt0.K0(xs1, u4.getAnnotations());
                        if (K0.isEmpty()) {
                            rmVar = me6.x;
                        } else {
                            rmVar = new tm(0, K0);
                        }
                        ro7 f4 = f(list, rmVar);
                        if (iq7.e(u4) || bt54.A) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        fu6 = u4.o0(z2).v0(f4);
                    }
                    int i7 = bt54.y;
                    if ((i7 & 1024) == 1024) {
                        bt52 = bt54.K;
                    } else if ((i7 & 2048) == 2048) {
                        bt52 = wv1.a(bt54.L);
                    } else {
                        bt52 = null;
                    }
                    if (bt52 != null) {
                        return o85.y(fu6, d(bt52, false));
                    }
                    return fu6;
                }
            } else if ((i & 64) == 64) {
                String string = ((vq4) z00.b).getString(bt54.G);
                Iterator it2 = b().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        vq02 = null;
                        break;
                    }
                    Object next2 = it2.next();
                    if (sg3.e(next2.getName().b(), string)) {
                        vq02 = next2;
                        break;
                    }
                }
                vq0 vq03 = (qp7) vq02;
                if (vq03 == null) {
                    z62 z624 = z62.a;
                    wo7 = z62.d(x62.L, string, vj1.toString());
                    int i22 = 1;
                    if (!z62.f(wo7.u())) {
                    }
                } else {
                    vq0 = vq03;
                }
            } else if ((i & 128) == 128) {
                vq0 = (vq0) ((m70) this.g).y(Integer.valueOf(bt54.H));
                if (vq0 == null) {
                    vq0 = h(this, bt54, bt54.H);
                }
            } else {
                z62 z625 = z62.a;
                wo7 = z62.d(x62.N, new String[0]);
                int i222 = 1;
                if (!z62.f(wo7.u())) {
                }
            }
        }
        wo7 = vq0.n();
        wo7.getClass();
        int i2222 = 1;
        if (!z62.f(wo7.u())) {
        }
    }

    public vw3 g(bt5 bt5) {
        bt5 bt52;
        z00 z00 = (z00) this.b;
        bt5.getClass();
        if ((bt5.y & 2) != 2) {
            return d(bt5, true);
        }
        String string = ((vq4) z00.b).getString(bt5.B);
        fu6 d2 = d(bt5, true);
        wv1 wv1 = (wv1) z00.d;
        int i = bt5.y;
        if ((i & 4) == 4) {
            bt52 = bt5.C;
        } else if ((i & 8) == 8) {
            bt52 = wv1.a(bt5.D);
        } else {
            bt52 = null;
        }
        bt52.getClass();
        fu6 d3 = d(bt52, true);
        int i2 = ((ws1) z00.a).j.w;
        bt5.getClass();
        string.getClass();
        d2.getClass();
        d3.getClass();
        switch (i2) {
            case 6:
                throw new IllegalArgumentException("This method should not be used.");
            default:
                if (!string.equals("kotlin.jvm.PlatformType")) {
                    return z62.c(x62.I, string, d2.toString(), d3.toString());
                } else if (!bt5.l(qp3.f)) {
                    return kl8.n(d2, d3);
                } else {
                    zg2 zg2 = new zg2(d2, d3);
                    xw3.a.b(d2, d3);
                    return zg2;
                }
        }
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                String str2 = (String) this.d;
                bk7 bk7 = (bk7) this.c;
                if (bk7 == null) {
                    str = "";
                } else {
                    str = ". Child of ".concat((String) bk7.d);
                }
                return str2.concat(str);
            default:
                return super.toString();
        }
    }

    public bk7(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.e = layoutParams;
        this.f = new Rect();
        this.g = new int[2];
        this.h = new int[2];
        this.b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(bk7.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131886084;
        layoutParams.flags = 24;
    }
}
