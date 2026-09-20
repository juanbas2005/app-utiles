package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: x42  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x42 {
    public final jx5 a;
    public final da7 b;
    public final kg5 c;
    public final f96 d;

    public x42(jx5 jx5, da7 da7, kg5 kg5) {
        this.a = jx5;
        this.b = da7;
        this.c = kg5;
        this.d = new f96(jx5, kg5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public static final Object a(x42 x42, xy6 xy6, zv0 zv0, s83 s83, Object obj, v75 v75, g72 g72, h61 h61) {
        s42 s42;
        int i;
        int i2;
        gk1 gk1;
        int i3;
        u83 u83;
        xc2 xc2;
        int size;
        yb5 yb5;
        x42.getClass();
        if (h61 instanceof s42) {
            s42 = (s42) h61;
            int i4 = s42.J;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s42.J = i4 - Integer.MIN_VALUE;
                Object obj2 = s42.H;
                i = s42.J;
                String str = null;
                if (i != 0) {
                    o85.q(obj2);
                    i3 = 0;
                } else if (i == 1) {
                    int i5 = s42.G;
                    g72 g722 = s42.F;
                    v75 v752 = s42.E;
                    Object obj3 = s42.D;
                    s83 s832 = s42.C;
                    zv0 zv02 = s42.B;
                    xy6 xy62 = s42.A;
                    x42 x422 = s42.z;
                    o85.q(obj2);
                    x42 x423 = x422;
                    i2 = i5;
                    x42 = x423;
                    xy6 xy63 = xy62;
                    g72 = g722;
                    xy6 = xy63;
                    zv0 zv03 = zv02;
                    v75 = v752;
                    zv0 = zv03;
                    s83 s833 = s832;
                    obj = obj3;
                    s83 = s833;
                    gk1 = (gk1) obj2;
                    g72.getClass();
                    if (gk1 == null) {
                        BitmapDrawable bitmapDrawable = gk1.a;
                        boolean z = gk1.b;
                        pe1 pe1 = xy6.c;
                        u83 = xy6.a;
                    } else {
                        i3 = i2;
                    }
                    BitmapDrawable bitmapDrawable2 = gk1.a;
                    boolean z2 = gk1.b;
                    pe1 pe12 = xy6.c;
                    u83 = xy6.a;
                    if (!(u83 instanceof xc2)) {
                        xc2 = (xc2) u83;
                    } else {
                        xc2 = null;
                    }
                    if (xc2 != null) {
                        str = xc2.y;
                    }
                    return new r42(bitmapDrawable2, z2, pe12, str);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jx5 jx5 = x42.a;
                List list = zv0.e;
                size = list.size();
                while (true) {
                    if (i3 >= size) {
                        yb5 = null;
                        break;
                    }
                    pk1 a2 = ((mk1) list.get(i3)).a(xy6, v75);
                    if (a2 != null) {
                        yb5 = new yb5(a2, Integer.valueOf(i3));
                        break;
                    }
                    i3++;
                }
                if (yb5 == null) {
                    i2 = ((Number) yb5.x).intValue() + 1;
                    g72.getClass();
                    s42.z = x42;
                    s42.A = xy6;
                    s42.B = zv0;
                    s42.C = s83;
                    s42.D = obj;
                    s42.E = v75;
                    s42.F = g72;
                    s42.G = i2;
                    s42.J = 1;
                    obj2 = ((pk1) yb5.w).a(s42);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                    gk1 = (gk1) obj2;
                    g72.getClass();
                    if (gk1 == null) {
                    }
                    BitmapDrawable bitmapDrawable22 = gk1.a;
                    boolean z22 = gk1.b;
                    pe1 pe122 = xy6.c;
                    u83 = xy6.a;
                    if (!(u83 instanceof xc2)) {
                    }
                    if (xc2 != null) {
                    }
                    return new r42(bitmapDrawable22, z22, pe122, str);
                }
                ku4.k("Unable to create a decoder that supports: ", obj);
                return null;
            }
        }
        s42 = new s42(x42, h61);
        Object obj22 = s42.H;
        i = s42.J;
        String str2 = null;
        if (i != 0) {
        }
        jx5 jx52 = x42.a;
        List list2 = zv0.e;
        size = list2.size();
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (yb5 == null) {
            ku4.k("Unable to create a decoder that supports: ", obj);
        }
        ku4.k("Unable to create a decoder that supports: ", obj);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: xy6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r11v4, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r12v3, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0170, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0171, code lost:
        r2 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e7, code lost:
        if (r1 == r10) goto L_0x01e9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:16:0x004b, B:43:0x013e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0132 A[Catch:{ all -> 0x0170, all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0175 A[Catch:{ all -> 0x0170, all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    public static final Object b(x42 x42, s83 s83, Object obj, v75 v75, g72 g72, h61 h61) {
        t42 t42;
        int i;
        h06 h06;
        Bitmap bitmap;
        h06 h062;
        x42 x422;
        s83 s832;
        g72 g722;
        r42 r42;
        r42 r422;
        s83 s833;
        Object obj2;
        xy6 xy6;
        List list;
        h06 h063;
        g72 g723;
        h06 h064;
        Object obj3;
        h06 h065;
        x42 x423;
        s83 s834;
        h06 h066;
        hc2 hc2;
        x42 x424 = x42;
        s83 s835 = s83;
        h61 h612 = h61;
        if (h612 instanceof t42) {
            t42 = (t42) h612;
            int i2 = t42.J;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t42.J = i2 - Integer.MIN_VALUE;
                t42 t422 = t42;
                Object obj4 = t422.H;
                i = t422.J;
                ? r9 = 0;
                Object obj5 = p81.w;
                if (i != 0) {
                    o85.q(obj4);
                    ? obj6 = new Object();
                    obj6.w = v75;
                    ? obj7 = new Object();
                    obj7.w = x424.a.f;
                    ? obj8 = new Object();
                    try {
                        obj6.w = x424.c.T((v75) obj6.w);
                        s835.getClass();
                        mk1 mk1 = s835.f;
                        if (mk1 != null) {
                            zv0 zv0 = (zv0) obj7.w;
                            zv0.getClass();
                            ArrayList d1 = dt0.d1(zv0.a);
                            ArrayList d12 = dt0.d1(zv0.b);
                            ArrayList d13 = dt0.d1(zv0.c);
                            ArrayList d14 = dt0.d1(zv0.d);
                            ArrayList d15 = dt0.d1(zv0.e);
                            if (mk1 != null) {
                                d15.add(0, mk1);
                            }
                            obj7.w = new zv0(tf4.P(d1), tf4.P(d12), tf4.P(d13), tf4.P(d14), tf4.P(d15));
                        }
                        t422.z = x424;
                        t422.A = s835;
                        Object obj9 = obj;
                        t422.B = obj9;
                        g72 g724 = g72;
                        t422.C = g724;
                        t422.D = obj6;
                        t422.E = obj7;
                        t422.F = obj8;
                        t422.G = obj8;
                        t422.J = 1;
                        obj4 = x424.c((zv0) obj7.w, s835, obj9, (v75) obj6.w, g724, t422);
                        if (obj4 != obj5) {
                            x423 = x42;
                            obj3 = obj;
                            g723 = g72;
                            h064 = obj6;
                            h065 = obj7;
                            h066 = obj8;
                            h06 = h066;
                            s834 = s83;
                        }
                        return obj5;
                    } catch (Throwable th) {
                        th = th;
                        h06 = obj8;
                        Object obj10 = h06.w;
                        if (obj10 instanceof xy6) {
                            r9 = (xy6) obj10;
                        }
                        if (r9 != 0) {
                            i.a(r9.a);
                        }
                        throw th;
                    }
                } else if (i == 1) {
                    h066 = t422.G;
                    h06 = t422.F;
                    h06 h067 = t422.E;
                    h06 h068 = t422.D;
                    g72 g725 = (g72) t422.C;
                    Object obj11 = t422.B;
                    s834 = t422.A;
                    x42 x425 = t422.z;
                    o85.q(obj4);
                    h065 = h067;
                    h064 = h068;
                    g723 = g725;
                    obj3 = obj11;
                    x423 = x425;
                } else if (i == 2) {
                    h06 = t422.D;
                    h063 = (h06) t422.C;
                    g722 = (g72) t422.B;
                    s832 = t422.A;
                    x422 = t422.z;
                    o85.q(obj4);
                    r42 = (r42) obj4;
                    h062 = h063;
                    r422 = r42;
                    g72 g726 = g722;
                    s833 = s832;
                    x42 x426 = x422;
                    obj2 = h06.w;
                    if (obj2 instanceof xy6) {
                        xy6 = (xy6) obj2;
                    } else {
                        xy6 = null;
                    }
                    if (xy6 != null) {
                        i.a(xy6.a);
                    }
                    v75 v752 = (v75) h062.w;
                    t422.z = null;
                    t422.A = null;
                    t422.B = null;
                    t422.C = null;
                    t422.D = null;
                    t422.E = null;
                    t422.F = null;
                    t422.G = null;
                    t422.J = 3;
                    x426.getClass();
                    list = s833.g;
                    if (!list.isEmpty() && ((r422.a instanceof BitmapDrawable) || s833.k)) {
                        obj4 = ar7.e0(s833.u, new w42(x426, r422, v752, list, g726, s833, (f61) null), t422);
                    } else {
                        obj4 = r422;
                    }
                } else if (i == 3) {
                    o85.q(obj4);
                    r42 r423 = (r42) obj4;
                    Drawable drawable = r423.a;
                    if (drawable instanceof BitmapDrawable) {
                        r9 = (BitmapDrawable) drawable;
                    }
                    if (!(r9 == 0 || (bitmap = r9.getBitmap()) == null)) {
                        bitmap.prepareToDraw();
                    }
                    return r423;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h066.w = obj4;
                Object obj12 = h06.w;
                hc2 = (hc2) obj12;
                if (!(hc2 instanceof xy6)) {
                    h81 h81 = s834.t;
                    h06 h069 = h06;
                    s83 s836 = s834;
                    p6 p6Var = new p6(x423, h069, h065, s836, obj3, h064, g723, (f61) null, 1);
                    x422 = x423;
                    s832 = s836;
                    h06 h0610 = h064;
                    g722 = g723;
                    t422.z = x422;
                    t422.A = s832;
                    t422.B = g722;
                    t422.C = h0610;
                    t422.D = h06;
                    t422.E = null;
                    t422.F = null;
                    t422.G = null;
                    t422.J = 2;
                    obj4 = ar7.e0(h81, p6Var, t422);
                    if (obj4 == obj5) {
                        return obj5;
                    }
                    h063 = h0610;
                    r42 = (r42) obj4;
                    h062 = h063;
                    r422 = r42;
                    g72 g7262 = g722;
                    s833 = s832;
                    x42 x4262 = x422;
                    obj2 = h06.w;
                    if (obj2 instanceof xy6) {
                    }
                    if (xy6 != null) {
                    }
                    v75 v7522 = (v75) h062.w;
                    t422.z = null;
                    t422.A = null;
                    t422.B = null;
                    t422.C = null;
                    t422.D = null;
                    t422.E = null;
                    t422.F = null;
                    t422.G = null;
                    t422.J = 3;
                    x4262.getClass();
                    list = s833.g;
                    if (!list.isEmpty() && ((r422.a instanceof BitmapDrawable) || s833.k)) {
                    }
                } else {
                    s832 = s834;
                    x422 = x423;
                    h062 = h064;
                    g722 = g723;
                    if (hc2 instanceof pz1) {
                        r42 = new r42(((pz1) obj12).a, ((pz1) obj12).b, ((pz1) obj12).c, (String) null);
                        r422 = r42;
                        g72 g72622 = g722;
                        s833 = s832;
                        x42 x42622 = x422;
                        obj2 = h06.w;
                        if (obj2 instanceof xy6) {
                        }
                        if (xy6 != null) {
                        }
                        v75 v75222 = (v75) h062.w;
                        t422.z = null;
                        t422.A = null;
                        t422.B = null;
                        t422.C = null;
                        t422.D = null;
                        t422.E = null;
                        t422.F = null;
                        t422.G = null;
                        t422.J = 3;
                        x42622.getClass();
                        list = s833.g;
                        if (!list.isEmpty() && ((r422.a instanceof BitmapDrawable) || s833.k)) {
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
        }
        t42 = new t42(x424, h612);
        t42 t4222 = t42;
        Object obj42 = t4222.H;
        i = t4222.J;
        ? r92 = 0;
        Object obj52 = p81.w;
        if (i != 0) {
        }
        h066.w = obj42;
        Object obj122 = h06.w;
        hc2 = (hc2) obj122;
        if (!(hc2 instanceof xy6)) {
        }
    }

    /* JADX WARNING: type inference failed for: r15v3, types: [hc2, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final Object c(zv0 zv0, s83 s83, Object obj, v75 v75, g72 g72, h61 h61) {
        u42 u42;
        int i;
        int i2;
        ? r15;
        int i3;
        int size;
        yb5 yb5;
        if (h61 instanceof u42) {
            u42 = (u42) h61;
            int i4 = u42.I;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                u42.I = i4 - Integer.MIN_VALUE;
                Object obj2 = u42.G;
                i = u42.I;
                xy6 xy6 = null;
                if (i != 0) {
                    o85.q(obj2);
                    i3 = 0;
                } else if (i == 1) {
                    int i5 = u42.F;
                    g72 g722 = u42.E;
                    v75 v752 = u42.D;
                    obj = u42.C;
                    s83 s832 = u42.B;
                    zv0 zv02 = u42.A;
                    x42 x42 = u42.z;
                    o85.q(obj2);
                    x42 x422 = x42;
                    i2 = i5;
                    this = x422;
                    zv0 zv03 = zv02;
                    g72 = g722;
                    zv0 = zv03;
                    s83 s833 = s832;
                    v75 = v752;
                    s83 = s833;
                    r15 = (hc2) obj2;
                    try {
                        g72.getClass();
                        if (r15 == 0) {
                            return r15;
                        }
                        i3 = i2;
                        return r15;
                    } catch (Throwable th) {
                        if (r15 instanceof xy6) {
                            xy6 = r15;
                        }
                        if (xy6 != null) {
                            i.a(xy6.a);
                        }
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jx5 jx5 = this.a;
                List list = zv0.d;
                size = list.size();
                while (true) {
                    if (i3 < size) {
                        yb5 = null;
                        break;
                    }
                    yb5 yb52 = (yb5) list.get(i3);
                    ic2 ic2 = (ic2) yb52.w;
                    if (((Class) yb52.x).isAssignableFrom(obj.getClass())) {
                        ic2.getClass();
                        jc2 a2 = ic2.a(obj, v75);
                        if (a2 != null) {
                            yb5 = new yb5(a2, Integer.valueOf(i3));
                            break;
                        }
                    }
                    i3++;
                }
                if (yb5 == null) {
                    i2 = ((Number) yb5.x).intValue() + 1;
                    g72.getClass();
                    u42.z = this;
                    u42.A = zv0;
                    u42.B = s83;
                    u42.C = obj;
                    u42.D = v75;
                    u42.E = g72;
                    u42.F = i2;
                    u42.I = 1;
                    obj2 = ((jc2) yb5.w).a(u42);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                    r15 = (hc2) obj2;
                    g72.getClass();
                    if (r15 == 0) {
                    }
                    return r15;
                }
                ku4.k("Unable to create a fetcher that supports: ", obj);
                return null;
            }
        }
        u42 = new u42(this, h61);
        Object obj22 = u42.G;
        i = u42.I;
        xy6 xy62 = null;
        if (i != 0) {
        }
        jx5 jx52 = this.a;
        List list2 = zv0.d;
        size = list2.size();
        while (true) {
            if (i3 < size) {
            }
            i3++;
        }
        if (yb5 == null) {
            ku4.k("Unable to create a fetcher that supports: ", obj);
        }
        ku4.k("Unable to create a fetcher that supports: ", obj);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    public final Object d(mx5 mx5, h61 h61) {
        v42 v42;
        int i;
        ni4 ni4;
        x42 x42 = this;
        mx5 mx52 = mx5;
        h61 h612 = h61;
        f96 f96 = x42.d;
        if (h612 instanceof v42) {
            v42 = (v42) h612;
            int i2 = v42.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v42.D = i2 - Integer.MIN_VALUE;
                v42 v422 = v42;
                Object obj = v422.B;
                i = v422.D;
                if (i != 0) {
                    o85.q(obj);
                    try {
                        s83 s83 = mx52.d;
                        Object obj2 = s83.b;
                        uu6 uu6 = mx52.e;
                        Bitmap.Config[] configArr = i.a;
                        g72 g72 = mx52.f;
                        v75 E = x42.c.E(s83, uu6);
                        wf6 wf6 = E.e;
                        List list = x42.a.f.b;
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            yb5 yb5 = (yb5) list.get(i3);
                            ke0 ke0 = (ke0) yb5.w;
                            if (((Class) yb5.x).isAssignableFrom(obj2.getClass())) {
                                ke0.getClass();
                                Object a2 = ke0.a(obj2, E);
                                if (a2 != null) {
                                    obj2 = a2;
                                }
                            }
                        }
                        g72 g722 = g72;
                        mi4 A = f96.A(s83, obj2, E, g722);
                        if (A != null) {
                            ni4 = f96.y(s83, A, uu6, wf6);
                        } else {
                            ni4 = null;
                        }
                        if (ni4 != null) {
                            return f96.B(mx52, s83, A, ni4);
                        }
                        h81 h81 = s83.s;
                        p6 p6Var = new p6(x42, s83, obj2, E, g722, A, mx52, (f61) null, 2);
                        v422.z = x42;
                        v422.A = mx52;
                        v422.D = 1;
                        Object e0 = ar7.e0(h81, p6Var, v422);
                        p81 p81 = p81.w;
                        if (e0 == p81) {
                            return p81;
                        }
                        return e0;
                    } catch (Throwable th) {
                        th = th;
                        if (th instanceof CancellationException) {
                        }
                    }
                } else if (i == 1) {
                    mx5 mx53 = v422.A;
                    x42 x422 = v422.z;
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        mx52 = mx53;
                        x42 = x422;
                        if (th instanceof CancellationException) {
                            kg5 kg5 = x42.c;
                            return kg5.n(mx52.d, th);
                        }
                        throw th;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        v42 = new v42(x42, h612);
        v42 v4222 = v42;
        Object obj3 = v4222.B;
        i = v4222.D;
        if (i != 0) {
        }
    }
}
