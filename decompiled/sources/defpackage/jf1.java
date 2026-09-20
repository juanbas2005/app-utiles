package defpackage;

import androidx.datastore.core.CorruptionException;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: jf1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class jf1 implements qe1 {
    public final gd2 a;
    public final w81 b;
    public final o81 c;
    public final ze1 d = new ze1(3, new p0((Object) this, (f61) null, 14));
    public final qq4 e = new qq4();
    public int f;
    public h27 g;
    public final ji8 h = new ji8(15);
    public final am6 i;
    public final z97 j;
    public final z97 k;
    public final am6 l;

    public jf1(gd2 gd2, List list, w81 w81, o81 o81) {
        this.a = gd2;
        this.b = w81;
        this.c = o81;
        this.i = new am6(this, list);
        this.j = new z97(new re1(this, 0));
        this.k = new z97(new re1(this, 1));
        this.l = new am6(o81, new gg0(17, (Object) this), new xw0(27), new n0(this, (f61) null, 29));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[Catch:{ all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object c(jf1 jf1, h61 h61) {
        af1 af1;
        int i2;
        qq4 qq4;
        int i3;
        if (h61 instanceof af1) {
            af1 = (af1) h61;
            int i4 = af1.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                af1.C = i4 - Integer.MIN_VALUE;
                Object obj = af1.A;
                i2 = af1.C;
                if (i2 != 0) {
                    o85.q(obj);
                    qq4 qq42 = jf1.e;
                    af1.z = qq42;
                    af1.C = 1;
                    Object a2 = qq42.a(af1);
                    p81 p81 = p81.w;
                    if (a2 == p81) {
                        return p81;
                    }
                    qq4 = qq42;
                } else if (i2 == 1) {
                    qq4 = af1.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = jf1.f - 1;
                jf1.f = i3;
                if (i3 == 0) {
                    h27 h27 = jf1.g;
                    if (h27 != null) {
                        h27.o((CancellationException) null);
                    }
                    jf1.g = null;
                }
                qq4.k((Object) null);
                return vs7.a;
            }
        }
        af1 = new af1(jf1, h61);
        Object obj2 = af1.A;
        i2 = af1.C;
        if (i2 != 0) {
        }
        try {
            i3 = jf1.f - 1;
            jf1.f = i3;
            if (i3 == 0) {
            }
            qq4.k((Object) null);
            return vs7.a;
        } catch (Throwable th) {
            qq4.k((Object) null);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object d(jf1 jf1, vj4 vj4, h61 h61) {
        bf1 bf1;
        int i2;
        xu0 xu0;
        Throwable a2;
        if (h61 instanceof bf1) {
            bf1 = (bf1) h61;
            int i3 = bf1.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bf1.C = i3 - Integer.MIN_VALUE;
                Object obj = bf1.A;
                i2 = bf1.C;
                if (i2 != 0) {
                    o85.q(obj);
                    xu0 xu02 = vj4.b;
                    try {
                        e81 e81 = vj4.d;
                        try {
                            e81 e812 = bf1.x;
                            e812.getClass();
                            e81 X = e81.X(e812);
                            n0 n0Var = new n0(jf1, vj4, (f61) null, 27);
                            bf1.z = xu02;
                            bf1.C = 1;
                            Object e0 = ar7.e0(X, n0Var, bf1);
                            p81 p81 = p81.w;
                            if (e0 == p81) {
                                return p81;
                            }
                            xu0 xu03 = xu02;
                            obj = e0;
                            xu0 = xu03;
                        } catch (Throwable th) {
                            th = th;
                            xu0 = xu02;
                            obj = new m66(th);
                            a2 = o66.a(obj);
                            if (a2 != null) {
                            }
                            return vs7.a;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        xu0 = xu02;
                        obj = new m66(th);
                        a2 = o66.a(obj);
                        if (a2 != null) {
                        }
                        return vs7.a;
                    }
                } else if (i2 == 1) {
                    xu0 = bf1.z;
                    try {
                        o85.q(obj);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a2 = o66.a(obj);
                if (a2 != null) {
                    xu0.c0(obj);
                } else {
                    xu0.getClass();
                    xu0.c0(new av0(a2, false));
                }
                return vs7.a;
            }
        }
        bf1 = new bf1(jf1, h61);
        Object obj2 = bf1.A;
        i2 = bf1.C;
        if (i2 != 0) {
        }
        a2 = o66.a(obj2);
        if (a2 != null) {
        }
        return vs7.a;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048 A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public static final Object e(jf1 jf1, h61 h61) {
        cf1 cf1;
        int i2;
        qq4 qq4;
        int i3;
        if (h61 instanceof cf1) {
            cf1 = (cf1) h61;
            int i4 = cf1.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cf1.C = i4 - Integer.MIN_VALUE;
                Object obj = cf1.A;
                i2 = cf1.C;
                if (i2 != 0) {
                    o85.q(obj);
                    qq4 qq42 = jf1.e;
                    cf1.z = qq42;
                    cf1.C = 1;
                    Object a2 = qq42.a(cf1);
                    p81 p81 = p81.w;
                    if (a2 == p81) {
                        return p81;
                    }
                    qq4 = qq42;
                } else if (i2 == 1) {
                    qq4 = cf1.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = jf1.f + 1;
                jf1.f = i3;
                if (i3 == 1) {
                    jf1.g = ar7.H(jf1.c, (e81) null, (r81) null, new we1(jf1, (f61) null, 1), 3);
                }
                qq4.k((Object) null);
                return vs7.a;
            }
        }
        cf1 = new cf1(jf1, h61);
        Object obj2 = cf1.A;
        i2 = cf1.C;
        if (i2 != 0) {
        }
        try {
            i3 = jf1.f + 1;
            jf1.f = i3;
            if (i3 == 1) {
            }
            qq4.k((Object) null);
            return vs7.a;
        } catch (Throwable th) {
            qq4.k((Object) null);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r7 == r4) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r1.Q(r0) != r4) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public static final Object f(jf1 jf1, h61 h61) {
        df1 df1;
        int i2;
        Throwable th;
        int i3;
        int intValue;
        if (h61 instanceof df1) {
            df1 = (df1) h61;
            int i4 = df1.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                df1.C = i4 - Integer.MIN_VALUE;
                Object obj = df1.A;
                i2 = df1.C;
                p81 p81 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    cf3 i5 = jf1.i();
                    df1.C = 1;
                    obj = i5.a(df1);
                } else if (i2 == 1) {
                    o85.q(obj);
                } else if (i2 == 2) {
                    i3 = df1.z;
                    try {
                        o85.q(obj);
                        return vs7.a;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                intValue = ((Number) obj).intValue();
                am6 am6 = jf1.i;
                df1.z = intValue;
                df1.C = 2;
            }
        }
        df1 = new df1(jf1, h61);
        Object obj2 = df1.A;
        i2 = df1.C;
        p81 p812 = p81.w;
        if (i2 != 0) {
        }
        intValue = ((Number) obj2).intValue();
        try {
            am6 am62 = jf1.i;
            df1.z = intValue;
            df1.C = 2;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            i3 = intValue;
            th = th4;
            jf1.h.G(new lw5(th, i3));
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: de1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: de1} */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r11 == r7) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (r11 == r7) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a1, code lost:
        if (r11 == r7) goto L_0x00a3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    public static final Object g(jf1 jf1, boolean z, f61 f61) {
        ef1 ef1;
        int i2;
        yb5 yb5;
        y27 y27;
        boolean z2;
        int i3;
        ji8 ji8 = jf1.h;
        if (f61 instanceof ef1) {
            ef1 = (ef1) f61;
            int i4 = ef1.D;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ef1.D = i4 - Integer.MIN_VALUE;
                Object obj = ef1.B;
                i2 = ef1.D;
                Object obj2 = p81.w;
                if (i2 != 0) {
                    o85.q(obj);
                    y27 w = ji8.w();
                    if (!(w instanceof ks7)) {
                        cf3 i5 = jf1.i();
                        ef1.A = w;
                        ef1.z = z;
                        ef1.D = 1;
                        obj = i5.a(ef1);
                        y27 = w;
                    } else {
                        h.s("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                } else if (i2 == 1) {
                    z = ef1.z;
                    y27 y272 = ef1.A;
                    o85.q(obj);
                    y27 = y272;
                } else if (i2 == 2) {
                    o85.q(obj);
                    yb5 = (yb5) obj;
                    y27 y273 = (y27) yb5.w;
                    if (((Boolean) yb5.x).booleanValue()) {
                    }
                    return y273;
                } else if (i2 == 3) {
                    o85.q(obj);
                    yb5 = (yb5) obj;
                    y27 y2732 = (y27) yb5.w;
                    if (((Boolean) yb5.x).booleanValue()) {
                        ji8.G(y2732);
                    }
                    return y2732;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int intValue = ((Number) obj).intValue();
                z2 = y27 instanceof de1;
                if (!z2) {
                    i3 = ((de1) y27).a;
                } else {
                    i3 = -1;
                }
                if (!z2 && intValue == i3) {
                    return y27;
                }
                if (!z) {
                    cf3 i6 = jf1.i();
                    xc xcVar = new xc(jf1, (f61) null, 4);
                    ef1.A = null;
                    ef1.D = 2;
                    obj = i6.c(xcVar, ef1);
                } else {
                    cf3 i7 = jf1.i();
                    ff1 ff1 = new ff1(jf1, i3, (f61) null, 0);
                    ef1.A = null;
                    ef1.D = 3;
                    obj = i7.d(ff1, ef1);
                }
                return obj2;
            }
        }
        ef1 = new ef1(jf1, f61);
        Object obj3 = ef1.B;
        i2 = ef1.D;
        Object obj22 = p81.w;
        if (i2 != 0) {
        }
        int intValue2 = ((Number) obj3).intValue();
        z2 = y27 instanceof de1;
        if (!z2) {
        }
        if (!z2) {
        }
        if (!z) {
        }
        return obj22;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, h06, java.io.Serializable] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
        if (r0 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0092, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0093, code lost:
        r4 = r12.i();
        r14.A = r0;
        r14.z = r13;
        r14.D = r1;
        r14.G = 2;
        r4 = r4.a(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        if (r4 != r10) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        r11 = r1;
        r1 = r13;
        r13 = r11;
        r11 = r4;
        r4 = r0;
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        return new defpackage.de1(r13, ((java.lang.Number) r0).intValue(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cb, code lost:
        r0 = ((java.lang.Number) r0).intValue();
        r1 = r12.i();
        r4 = new defpackage.ff1(r12, r0, (defpackage.f61) null, 1);
        r14.z = r13;
        r14.G = 4;
        r0 = r1.d(r4, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e3, code lost:
        if (r0 != r10) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e8, code lost:
        return (defpackage.de1) r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    public static final Object h(jf1 jf1, boolean z, h61 h61) {
        gf1 gf1;
        gf1 gf12;
        Object obj;
        int i2;
        Object obj2;
        CorruptionException corruptionException;
        Throwable th;
        h06 h06;
        f06 f06;
        h06 h062;
        h06 h063;
        CorruptionException corruptionException2;
        Object obj3;
        if (h61 instanceof gf1) {
            gf1 = (gf1) h61;
            int i3 = gf1.G;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gf1.G = i3 - Integer.MIN_VALUE;
                gf12 = gf1;
                obj = gf12.E;
                i2 = gf12.G;
                int i4 = 0;
                obj2 = p81.w;
                switch (i2) {
                    case b85.b:
                        o85.q(obj);
                        if (!z) {
                            cf3 i5 = jf1.i();
                            gf12.z = z;
                            gf12.G = 3;
                            obj = i5.a(gf12);
                            if (obj == obj2) {
                                break;
                            }
                        } else {
                            gf12.z = z;
                            gf12.G = 1;
                            obj = jf1.j(gf12);
                            if (obj == obj2) {
                                break;
                            }
                        }
                        break;
                    case 1:
                        z = gf12.z;
                        o85.q(obj);
                        break;
                    case 2:
                        int i6 = gf12.D;
                        boolean z2 = gf12.z;
                        Object obj4 = gf12.A;
                        try {
                            o85.q(obj);
                        } catch (CorruptionException e2) {
                            e = e2;
                            z = z2;
                            break;
                        }
                    case 3:
                        z = gf12.z;
                        o85.q(obj);
                        break;
                    case 4:
                        z = gf12.z;
                        try {
                            o85.q(obj);
                            break;
                        } catch (CorruptionException e3) {
                            e = e3;
                            break;
                        }
                    case 5:
                        z = gf12.z;
                        h06 h064 = gf12.B;
                        o85.q(obj);
                        h06 h065 = h064;
                        h063 = (h06) gf12.C;
                        corruptionException2 = (CorruptionException) gf12.A;
                        h062 = h065;
                        break;
                    case 6:
                        f06 = (f06) gf12.C;
                        h06 = gf12.B;
                        corruptionException = (CorruptionException) gf12.A;
                        try {
                            o85.q(obj);
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            break;
                        }
                    default:
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        gf1 = new gf1(jf1, h61);
        gf12 = gf1;
        obj = gf12.E;
        i2 = gf12.G;
        int i42 = 0;
        obj2 = p81.w;
        switch (i2) {
            case b85.b:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        ? obj5 = new Object();
        w81 w81 = jf1.b;
        gf12.A = e;
        gf12.B = obj5;
        gf12.C = obj5;
        gf12.z = z;
        gf12.G = 5;
        Object e4 = w81.e(e);
        if (e4 != obj2) {
            h062 = obj5;
            corruptionException2 = e;
            obj = e4;
            h063 = h062;
            h063.w = obj;
            ? obj6 = new Object();
            try {
                jf1 jf12 = jf1;
                v6 v6Var = new v6((Object) h062, (Object) jf12, (Object) obj6, (f61) null, 1);
                gf12.A = corruptionException2;
                gf12.B = h062;
                gf12.C = obj6;
                gf12.G = 6;
                if (z) {
                    obj3 = v6Var.y(gf12);
                } else {
                    obj3 = jf12.i().c(new ne1(v6Var, (f61) null, 1), gf12);
                }
                if (obj3 != obj2) {
                    h06 = h062;
                    f06 = obj6;
                    Object obj7 = h06.w;
                    if (obj7 != null) {
                        i42 = obj7.hashCode();
                    }
                    obj2 = new de1(i42, f06.w, obj7);
                }
            } catch (Throwable th3) {
                th = th3;
                corruptionException = corruptionException2;
                su0.b(corruptionException, th);
                throw corruptionException;
            }
        }
        return obj2;
    }

    public final Object a(gs2 gs2, f61 f61) {
        iu7 iu7 = (iu7) f61.r().a0(kw5.N);
        if (iu7 != null) {
            iu7.a(this);
        }
        return ar7.e0(new iu7(iu7, this), new p0((Object) this, (Object) gs2, (f61) null, 15), f61);
    }

    public final di2 b() {
        return this.d;
    }

    public final cf3 i() {
        return (cf3) this.k.getValue();
    }

    public final Object j(h61 h61) {
        return ((jd2) this.j.getValue()).a(new xe1(3, (f61) null), h61);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, f06] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object k(Object obj, boolean z, h61 h61) {
        hf1 hf1;
        int i2;
        f06 f06;
        if (h61 instanceof hf1) {
            hf1 = (hf1) h61;
            int i3 = hf1.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hf1.C = i3 - Integer.MIN_VALUE;
                Object obj2 = hf1.A;
                i2 = hf1.C;
                if (i2 != 0) {
                    o85.q(obj2);
                    ? obj3 = new Object();
                    if1 if1 = new if1(obj3, this, obj, z, (f61) null);
                    hf1.z = obj3;
                    hf1.C = 1;
                    Object b2 = ((jd2) this.j.getValue()).b(if1, hf1);
                    p81 p81 = p81.w;
                    if (b2 == p81) {
                        return p81;
                    }
                    f06 = obj3;
                } else if (i2 == 1) {
                    f06 = hf1.z;
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return new Integer(f06.w);
            }
        }
        hf1 = new hf1(this, h61);
        Object obj22 = hf1.A;
        i2 = hf1.C;
        if (i2 != 0) {
        }
        return new Integer(f06.w);
    }
}
