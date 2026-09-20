package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import java.util.concurrent.CancellationException;

/* renamed from: vp6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vp6 {
    public final pz4 a;
    public final dv7 b;
    public final kh5 c;
    public final my7 d;

    public vp6(pz4 pz4, dv7 dv7, kh5 kh5, my7 my7) {
        pz4.getClass();
        dv7.getClass();
        kh5.getClass();
        my7.getClass();
        this.a = pz4;
        this.b = dv7;
        this.c = kh5;
        this.d = my7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object A(boolean z, h61 h61) {
        sp6 sp6;
        int i;
        if (h61 instanceof sp6) {
            sp6 = (sp6) h61;
            int i2 = sp6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sp6.B = i2 - Integer.MIN_VALUE;
                Object obj = sp6.z;
                i = sp6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    sp6.B = 1;
                    Object U = ((dy7) dv7).U(z, sp6);
                    p81 p81 = p81.w;
                    if (U == p81) {
                        return p81;
                    }
                    return U;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        sp6 = new sp6(this, h61);
        Object obj2 = sp6.z;
        i = sp6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object B(boolean z, h61 h61) {
        tp6 tp6;
        int i;
        if (h61 instanceof tp6) {
            tp6 = (tp6) h61;
            int i2 = tp6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tp6.B = i2 - Integer.MIN_VALUE;
                Object obj = tp6.z;
                i = tp6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    tp6.B = 1;
                    Object V = ((dy7) dv7).V(z, tp6);
                    p81 p81 = p81.w;
                    if (V == p81) {
                        return p81;
                    }
                    return V;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        tp6 = new tp6(this, h61);
        Object obj2 = tp6.z;
        i = tp6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (((defpackage.dy7) r7).e(r0) != r5) goto L_0x0051;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    public final Object C(h61 h61) {
        up6 up6;
        int i;
        if (h61 instanceof up6) {
            up6 = (up6) h61;
            int i2 = up6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                up6.B = i2 - Integer.MIN_VALUE;
                Object obj = up6.z;
                i = up6.B;
                vs7 vs7 = vs7.a;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    pz4 pz4 = this.a;
                    up6.B = 1;
                    pz4.getClass();
                    if (vs7 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else if (i == 2) {
                    try {
                        o85.q(obj);
                        this.d.b();
                        return vs7;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv7 dv7 = this.b;
                up6.B = 2;
            }
        }
        up6 = new up6(this, h61);
        Object obj2 = up6.z;
        i = up6.B;
        vs7 vs72 = vs7.a;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        dv7 dv72 = this.b;
        up6.B = 2;
    }

    public final c6 a() {
        return new c6(((dy7) this.b).d(), 12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object b(boolean z, h61 h61) {
        to6 to6;
        int i;
        if (h61 instanceof to6) {
            to6 = (to6) h61;
            int i2 = to6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                to6.B = i2 - Integer.MIN_VALUE;
                Object obj = to6.z;
                i = to6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    to6.B = 1;
                    Object k = ((dy7) dv7).k(z, to6);
                    p81 p81 = p81.w;
                    if (k == p81) {
                        return p81;
                    }
                    return k;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        to6 = new to6(this, h61);
        Object obj2 = to6.z;
        i = to6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object c(g40 g40, h61 h61) {
        uo6 uo6;
        int i;
        if (h61 instanceof uo6) {
            uo6 = (uo6) h61;
            int i2 = uo6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uo6.B = i2 - Integer.MIN_VALUE;
                Object obj = uo6.z;
                i = uo6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    String name = g40.name();
                    uo6.B = 1;
                    Object m = ((dy7) dv7).m(name, uo6);
                    p81 p81 = p81.w;
                    if (m == p81) {
                        return p81;
                    }
                    return m;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        uo6 = new uo6(this, h61);
        Object obj2 = uo6.z;
        i = uo6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object d(boolean z, h61 h61) {
        vo6 vo6;
        int i;
        if (h61 instanceof vo6) {
            vo6 = (vo6) h61;
            int i2 = vo6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vo6.B = i2 - Integer.MIN_VALUE;
                Object obj = vo6.z;
                i = vo6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    vo6.B = 1;
                    Object n = ((dy7) dv7).n(z, vo6);
                    p81 p81 = p81.w;
                    if (n == p81) {
                        return p81;
                    }
                    return n;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        vo6 = new vo6(this, h61);
        Object obj2 = vo6.z;
        i = vo6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object e(boolean z, h61 h61) {
        wo6 wo6;
        int i;
        if (h61 instanceof wo6) {
            wo6 = (wo6) h61;
            int i2 = wo6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wo6.B = i2 - Integer.MIN_VALUE;
                Object obj = wo6.z;
                i = wo6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    wo6.B = 1;
                    Object o = ((dy7) dv7).o(z, wo6);
                    p81 p81 = p81.w;
                    if (o == p81) {
                        return p81;
                    }
                    return o;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        wo6 = new wo6(this, h61);
        Object obj2 = wo6.z;
        i = wo6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object f(boolean z, h61 h61) {
        xo6 xo6;
        int i;
        if (h61 instanceof xo6) {
            xo6 = (xo6) h61;
            int i2 = xo6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xo6.B = i2 - Integer.MIN_VALUE;
                Object obj = xo6.z;
                i = xo6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    xo6.B = 1;
                    Object p = ((dy7) dv7).p(z, xo6);
                    p81 p81 = p81.w;
                    if (p == p81) {
                        return p81;
                    }
                    return p;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        xo6 = new xo6(this, h61);
        Object obj2 = xo6.z;
        i = xo6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object g(boolean z, h61 h61) {
        yo6 yo6;
        int i;
        if (h61 instanceof yo6) {
            yo6 = (yo6) h61;
            int i2 = yo6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yo6.B = i2 - Integer.MIN_VALUE;
                Object obj = yo6.z;
                i = yo6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    yo6.B = 1;
                    Object q = ((dy7) dv7).q(z, yo6);
                    p81 p81 = p81.w;
                    if (q == p81) {
                        return p81;
                    }
                    return q;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        yo6 = new yo6(this, h61);
        Object obj2 = yo6.z;
        i = yo6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object h(boolean z, h61 h61) {
        zo6 zo6;
        int i;
        if (h61 instanceof zo6) {
            zo6 = (zo6) h61;
            int i2 = zo6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zo6.B = i2 - Integer.MIN_VALUE;
                Object obj = zo6.z;
                i = zo6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    zo6.B = 1;
                    Object r = ((dy7) dv7).r(z, zo6);
                    p81 p81 = p81.w;
                    if (r == p81) {
                        return p81;
                    }
                    return r;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        zo6 = new zo6(this, h61);
        Object obj2 = zo6.z;
        i = zo6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object i(boolean z, h61 h61) {
        ap6 ap6;
        int i;
        if (h61 instanceof ap6) {
            ap6 = (ap6) h61;
            int i2 = ap6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ap6.B = i2 - Integer.MIN_VALUE;
                Object obj = ap6.z;
                i = ap6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    ap6.B = 1;
                    Object s = ((dy7) dv7).s(z, ap6);
                    p81 p81 = p81.w;
                    if (s == p81) {
                        return p81;
                    }
                    return s;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        ap6 = new ap6(this, h61);
        Object obj2 = ap6.z;
        i = ap6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object j(boolean z, h61 h61) {
        bp6 bp6;
        int i;
        if (h61 instanceof bp6) {
            bp6 = (bp6) h61;
            int i2 = bp6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bp6.B = i2 - Integer.MIN_VALUE;
                Object obj = bp6.z;
                i = bp6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    bp6.B = 1;
                    Object t = ((dy7) dv7).t(z, bp6);
                    p81 p81 = p81.w;
                    if (t == p81) {
                        return p81;
                    }
                    return t;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        bp6 = new bp6(this, h61);
        Object obj2 = bp6.z;
        i = bp6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object k(ae1 ae1, h61 h61) {
        cp6 cp6;
        int i;
        if (h61 instanceof cp6) {
            cp6 = (cp6) h61;
            int i2 = cp6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cp6.B = i2 - Integer.MIN_VALUE;
                Object obj = cp6.z;
                i = cp6.B;
                DarkThemeConfigPreferences darkThemeConfigPreferences = null;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    ae1.getClass();
                    int ordinal = ae1.ordinal();
                    if (ordinal == 0) {
                        darkThemeConfigPreferences = DarkThemeConfigPreferences.FOLLOW_SYSTEM;
                    } else if (ordinal == 1) {
                        darkThemeConfigPreferences = DarkThemeConfigPreferences.LIGHT;
                    } else if (ordinal == 2) {
                        darkThemeConfigPreferences = DarkThemeConfigPreferences.DARK;
                    } else if (ordinal == 3) {
                        darkThemeConfigPreferences = DarkThemeConfigPreferences.AMOLED;
                    } else {
                        h.c();
                    }
                    cp6.B = 1;
                    Object u = ((dy7) dv7).u(darkThemeConfigPreferences, cp6);
                    p81 p81 = p81.w;
                    if (u == p81) {
                        return p81;
                    }
                    return u;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        cp6 = new cp6(this, h61);
        Object obj2 = cp6.z;
        i = cp6.B;
        DarkThemeConfigPreferences darkThemeConfigPreferences2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object l(int i, h61 h61) {
        dp6 dp6;
        int i2;
        if (h61 instanceof dp6) {
            dp6 = (dp6) h61;
            int i3 = dp6.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dp6.B = i3 - Integer.MIN_VALUE;
                Object obj = dp6.z;
                i2 = dp6.B;
                if (i2 != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    dp6.B = 1;
                    Object v = ((dy7) dv7).v(i, dp6);
                    p81 p81 = p81.w;
                    if (v == p81) {
                        return p81;
                    }
                    return v;
                } else if (i2 == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        dp6 = new dp6(this, h61);
        Object obj2 = dp6.z;
        i2 = dp6.B;
        if (i2 != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object m(boolean z, h61 h61) {
        ep6 ep6;
        int i;
        if (h61 instanceof ep6) {
            ep6 = (ep6) h61;
            int i2 = ep6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ep6.B = i2 - Integer.MIN_VALUE;
                Object obj = ep6.z;
                i = ep6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    ep6.B = 1;
                    Object w = ((dy7) dv7).w(z, ep6);
                    p81 p81 = p81.w;
                    if (w == p81) {
                        return p81;
                    }
                    return w;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        ep6 = new ep6(this, h61);
        Object obj2 = ep6.z;
        i = ep6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object n(String str, boolean z, h61 h61) {
        fp6 fp6;
        int i;
        if (h61 instanceof fp6) {
            fp6 = (fp6) h61;
            int i2 = fp6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fp6.B = i2 - Integer.MIN_VALUE;
                Object obj = fp6.z;
                i = fp6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    fp6.B = 1;
                    Object y = ((dy7) dv7).y(str, z, fp6);
                    p81 p81 = p81.w;
                    if (y == p81) {
                        return p81;
                    }
                    return y;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        fp6 = new fp6(this, h61);
        Object obj2 = fp6.z;
        i = fp6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046 A[SYNTHETIC, Splitter:B:22:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a A[Catch:{ CancellationException -> 0x0057, Exception -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object o(boolean z, h61 h61) {
        gp6 gp6;
        int i;
        if (h61 instanceof gp6) {
            gp6 = (gp6) h61;
            int i2 = gp6.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gp6.C = i2 - Integer.MIN_VALUE;
                Object obj = gp6.A;
                i = gp6.C;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    gp6.z = z;
                    gp6.C = 1;
                    Object C = ((dy7) dv7).C(z, gp6);
                    p81 p81 = p81.w;
                    if (C == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    z = gp6.z;
                    try {
                        o85.q(obj);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kh5 kh5 = this.c;
                if (!z) {
                    kh5.b();
                } else {
                    kh5.a();
                }
                return vs7.a;
            }
        }
        gp6 = new gp6(this, h61);
        Object obj2 = gp6.A;
        i = gp6.C;
        if (i != 0) {
        }
        kh5 kh52 = this.c;
        if (!z) {
        }
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object p(int i, az7 az7, h61 h61) {
        hp6 hp6;
        int i2;
        if (h61 instanceof hp6) {
            hp6 = (hp6) h61;
            int i3 = hp6.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hp6.B = i3 - Integer.MIN_VALUE;
                Object obj = hp6.z;
                i2 = hp6.B;
                if (i2 != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    String name = az7.name();
                    hp6.B = 1;
                    Object E = ((dy7) dv7).E(i, hp6, name);
                    p81 p81 = p81.w;
                    if (E == p81) {
                        return p81;
                    }
                    return E;
                } else if (i2 == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        hp6 = new hp6(this, h61);
        Object obj2 = hp6.z;
        i2 = hp6.B;
        if (i2 != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object q(boolean z, h61 h61) {
        ip6 ip6;
        int i;
        if (h61 instanceof ip6) {
            ip6 = (ip6) h61;
            int i2 = ip6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ip6.B = i2 - Integer.MIN_VALUE;
                Object obj = ip6.z;
                i = ip6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    ip6.B = 1;
                    Object F = ((dy7) dv7).F(z, ip6);
                    p81 p81 = p81.w;
                    if (F == p81) {
                        return p81;
                    }
                    return F;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        ip6 = new ip6(this, h61);
        Object obj2 = ip6.z;
        i = ip6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object r(boolean z, h61 h61) {
        jp6 jp6;
        int i;
        if (h61 instanceof jp6) {
            jp6 = (jp6) h61;
            int i2 = jp6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jp6.B = i2 - Integer.MIN_VALUE;
                Object obj = jp6.z;
                i = jp6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    jp6.B = 1;
                    Object G = ((dy7) dv7).G(z, jp6);
                    p81 p81 = p81.w;
                    if (G == p81) {
                        return p81;
                    }
                    return G;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        jp6 = new jp6(this, h61);
        Object obj2 = jp6.z;
        i = jp6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object s(boolean z, h61 h61) {
        kp6 kp6;
        int i;
        if (h61 instanceof kp6) {
            kp6 = (kp6) h61;
            int i2 = kp6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kp6.B = i2 - Integer.MIN_VALUE;
                Object obj = kp6.z;
                i = kp6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    kp6.B = 1;
                    Object M = ((dy7) dv7).M(z, kp6);
                    p81 p81 = p81.w;
                    if (M == p81) {
                        return p81;
                    }
                    return M;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        kp6 = new kp6(this, h61);
        Object obj2 = kp6.z;
        i = kp6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object t(boolean z, h61 h61) {
        lp6 lp6;
        int i;
        if (h61 instanceof lp6) {
            lp6 = (lp6) h61;
            int i2 = lp6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lp6.B = i2 - Integer.MIN_VALUE;
                Object obj = lp6.z;
                i = lp6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    lp6.B = 1;
                    Object N = ((dy7) dv7).N(z, lp6);
                    p81 p81 = p81.w;
                    if (N == p81) {
                        return p81;
                    }
                    return N;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        lp6 = new lp6(this, h61);
        Object obj2 = lp6.z;
        i = lp6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object u(boolean z, h61 h61) {
        mp6 mp6;
        int i;
        if (h61 instanceof mp6) {
            mp6 = (mp6) h61;
            int i2 = mp6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mp6.B = i2 - Integer.MIN_VALUE;
                Object obj = mp6.z;
                i = mp6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    mp6.B = 1;
                    Object O = ((dy7) dv7).O(z, mp6);
                    p81 p81 = p81.w;
                    if (O == p81) {
                        return p81;
                    }
                    return O;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        mp6 = new mp6(this, h61);
        Object obj2 = mp6.z;
        i = mp6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046 A[SYNTHETIC, Splitter:B:22:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a A[Catch:{ CancellationException -> 0x0057, Exception -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object v(boolean z, h61 h61) {
        np6 np6;
        int i;
        if (h61 instanceof np6) {
            np6 = (np6) h61;
            int i2 = np6.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                np6.C = i2 - Integer.MIN_VALUE;
                Object obj = np6.A;
                i = np6.C;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    np6.z = z;
                    np6.C = 1;
                    Object P = ((dy7) dv7).P(z, np6);
                    p81 p81 = p81.w;
                    if (P == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    z = np6.z;
                    try {
                        o85.q(obj);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                my7 my7 = this.d;
                if (!z) {
                    my7.a();
                } else {
                    my7.b();
                }
                return vs7.a;
            }
        }
        np6 = new np6(this, h61);
        Object obj2 = np6.A;
        i = np6.C;
        if (i != 0) {
        }
        my7 my72 = this.d;
        if (!z) {
        }
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object w(int i, h61 h61) {
        op6 op6;
        int i2;
        if (h61 instanceof op6) {
            op6 = (op6) h61;
            int i3 = op6.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                op6.B = i3 - Integer.MIN_VALUE;
                Object obj = op6.z;
                i2 = op6.B;
                if (i2 != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    op6.B = 1;
                    Object Q = ((dy7) dv7).Q(i, op6);
                    p81 p81 = p81.w;
                    if (Q == p81) {
                        return p81;
                    }
                    return Q;
                } else if (i2 == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        op6 = new op6(this, h61);
        Object obj2 = op6.z;
        i2 = op6.B;
        if (i2 != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object x(boolean z, h61 h61) {
        pp6 pp6;
        int i;
        if (h61 instanceof pp6) {
            pp6 = (pp6) h61;
            int i2 = pp6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pp6.B = i2 - Integer.MIN_VALUE;
                Object obj = pp6.z;
                i = pp6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    pp6.B = 1;
                    Object R = ((dy7) dv7).R(z, pp6);
                    p81 p81 = p81.w;
                    if (R == p81) {
                        return p81;
                    }
                    return R;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        pp6 = new pp6(this, h61);
        Object obj2 = pp6.z;
        i = pp6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object y(jy7 jy7, h61 h61) {
        qp6 qp6;
        int i;
        if (h61 instanceof qp6) {
            qp6 = (qp6) h61;
            int i2 = qp6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qp6.B = i2 - Integer.MIN_VALUE;
                Object obj = qp6.z;
                i = qp6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    String name = jy7.name();
                    qp6.B = 1;
                    Object S = ((dy7) dv7).S(name, qp6);
                    p81 p81 = p81.w;
                    if (S == p81) {
                        return p81;
                    }
                    return S;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        qp6 = new qp6(this, h61);
        Object obj2 = qp6.z;
        i = qp6.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object z(boolean z, h61 h61) {
        rp6 rp6;
        int i;
        if (h61 instanceof rp6) {
            rp6 = (rp6) h61;
            int i2 = rp6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rp6.B = i2 - Integer.MIN_VALUE;
                Object obj = rp6.z;
                i = rp6.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    rp6.B = 1;
                    Object T = ((dy7) dv7).T(z, rp6);
                    p81 p81 = p81.w;
                    if (T == p81) {
                        return p81;
                    }
                    return T;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        rp6 = new rp6(this, h61);
        Object obj2 = rp6.z;
        i = rp6.B;
        if (i != 0) {
        }
    }
}
