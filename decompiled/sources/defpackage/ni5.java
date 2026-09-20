package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: ni5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ni5 {
    public final nz7 a;
    public final dv7 b;
    public final h81 c;

    public ni5(nz7 nz7, dv7 dv7, h81 h81) {
        nz7.getClass();
        dv7.getClass();
        this.a = nz7;
        this.b = dv7;
        this.c = h81;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public static final Object a(ni5 ni5, az7 az7, f61 f61) {
        th5 th5;
        int i;
        vy7 vy7;
        String str;
        ni5.getClass();
        if (f61 instanceof th5) {
            th5 = (th5) f61;
            int i2 = th5.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                th5.C = i2 - Integer.MIN_VALUE;
                Object obj = th5.A;
                i = th5.C;
                if (i != 0) {
                    o85.q(obj);
                    c6 b2 = ni5.a.b(az7);
                    th5.z = az7;
                    th5.C = 1;
                    obj = gr8.H(b2, th5);
                    p81 p81 = p81.w;
                    if (obj == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    az7 = th5.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vy7 = (vy7) obj;
                if (vy7 == null && (str = vy7.c) == null) {
                    return str;
                }
                throw new IllegalStateException("Código USSD no encontrado para ".concat(az7.w).toString());
            }
        }
        th5 = new th5(ni5, f61);
        Object obj2 = th5.A;
        i = th5.C;
        if (i != 0) {
        }
        vy7 = (vy7) obj2;
        if (vy7 == null && (str = vy7.c) == null) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object b(h61 h61) {
        uh5 uh5;
        int i;
        if (h61 instanceof uh5) {
            uh5 = (uh5) h61;
            int i2 = uh5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uh5.B = i2 - Integer.MIN_VALUE;
                Object obj = uh5.z;
                i = uh5.B;
                if (i != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    vh5 vh5 = new vh5(this, (f61) null, 0);
                    uh5.B = 1;
                    Object e0 = ar7.e0(h81, vh5, uh5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        uh5 = new uh5(this, h61);
        Object obj2 = uh5.z;
        i = uh5.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object c(String str, h61 h61) {
        wh5 wh5;
        int i;
        if (h61 instanceof wh5) {
            wh5 = (wh5) h61;
            int i2 = wh5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wh5.B = i2 - Integer.MIN_VALUE;
                Object obj = wh5.z;
                i = wh5.B;
                if (i != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    xh5 xh5 = new xh5(str, this, (f61) null, 0);
                    wh5.B = 1;
                    Object e0 = ar7.e0(h81, xh5, wh5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        wh5 = new wh5(this, h61);
        Object obj2 = wh5.z;
        i = wh5.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object d(boolean z, h61 h61) {
        yh5 yh5;
        int i;
        if (h61 instanceof yh5) {
            yh5 = (yh5) h61;
            int i2 = yh5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yh5.B = i2 - Integer.MIN_VALUE;
                Object obj = yh5.z;
                i = yh5.B;
                if (i != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    zh5 zh5 = new zh5(this, z, (f61) null, 0);
                    yh5.B = 1;
                    Object e0 = ar7.e0(h81, zh5, yh5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        yh5 = new yh5(this, h61);
        Object obj2 = yh5.z;
        i = yh5.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object e(boolean z, h61 h61) {
        ai5 ai5;
        int i;
        if (h61 instanceof ai5) {
            ai5 = (ai5) h61;
            int i2 = ai5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ai5.B = i2 - Integer.MIN_VALUE;
                Object obj = ai5.z;
                i = ai5.B;
                if (i != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    zh5 zh5 = new zh5(this, z, (f61) null, 1);
                    ai5.B = 1;
                    Object e0 = ar7.e0(h81, zh5, ai5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        ai5 = new ai5(this, h61);
        Object obj2 = ai5.z;
        i = ai5.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object f(h61 h61) {
        bi5 bi5;
        int i;
        if (h61 instanceof bi5) {
            bi5 = (bi5) h61;
            int i2 = bi5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bi5.B = i2 - Integer.MIN_VALUE;
                Object obj = bi5.z;
                i = bi5.B;
                if (i != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    vh5 vh5 = new vh5(this, (f61) null, 1);
                    bi5.B = 1;
                    Object e0 = ar7.e0(h81, vh5, bi5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        bi5 = new bi5(this, h61);
        Object obj2 = bi5.z;
        i = bi5.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object g(String str, h61 h61) {
        ci5 ci5;
        int i;
        if (h61 instanceof ci5) {
            ci5 = (ci5) h61;
            int i2 = ci5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ci5.B = i2 - Integer.MIN_VALUE;
                Object obj = ci5.z;
                i = ci5.B;
                if (i != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    xh5 xh5 = new xh5(str, this, (f61) null, 1);
                    ci5.B = 1;
                    Object e0 = ar7.e0(h81, xh5, ci5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        ci5 = new ci5(this, h61);
        Object obj2 = ci5.z;
        i = ci5.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object h(int i, boolean z, h61 h61) {
        di5 di5;
        int i2;
        if (h61 instanceof di5) {
            di5 = (di5) h61;
            int i3 = di5.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                di5.B = i3 - Integer.MIN_VALUE;
                Object obj = di5.z;
                i2 = di5.B;
                if (i2 != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    ei5 ei5 = new ei5(this, i, z, (f61) null, 0);
                    di5.B = 1;
                    Object e0 = ar7.e0(h81, ei5, di5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        di5 = new di5(this, h61);
        Object obj2 = di5.z;
        i2 = di5.B;
        if (i2 != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object i(boolean z, h61 h61) {
        fi5 fi5;
        int i;
        if (h61 instanceof fi5) {
            fi5 = (fi5) h61;
            int i2 = fi5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fi5.B = i2 - Integer.MIN_VALUE;
                Object obj = fi5.z;
                i = fi5.B;
                if (i != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    zh5 zh5 = new zh5(this, z, (f61) null, 2);
                    fi5.B = 1;
                    Object e0 = ar7.e0(h81, zh5, fi5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        fi5 = new fi5(this, h61);
        Object obj2 = fi5.z;
        i = fi5.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object j(h61 h61) {
        gi5 gi5;
        int i;
        if (h61 instanceof gi5) {
            gi5 = (gi5) h61;
            int i2 = gi5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gi5.B = i2 - Integer.MIN_VALUE;
                Object obj = gi5.z;
                i = gi5.B;
                if (i != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    vh5 vh5 = new vh5(this, (f61) null, 2);
                    gi5.B = 1;
                    Object e0 = ar7.e0(h81, vh5, gi5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        gi5 = new gi5(this, h61);
        Object obj2 = gi5.z;
        i = gi5.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object k(h61 h61) {
        hi5 hi5;
        int i;
        if (h61 instanceof hi5) {
            hi5 = (hi5) h61;
            int i2 = hi5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hi5.B = i2 - Integer.MIN_VALUE;
                Object obj = hi5.z;
                i = hi5.B;
                if (i != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    vh5 vh5 = new vh5(this, (f61) null, 3);
                    hi5.B = 1;
                    Object e0 = ar7.e0(h81, vh5, hi5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        hi5 = new hi5(this, h61);
        Object obj2 = hi5.z;
        i = hi5.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object l(h61 h61) {
        ii5 ii5;
        int i;
        if (h61 instanceof ii5) {
            ii5 = (ii5) h61;
            int i2 = ii5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ii5.B = i2 - Integer.MIN_VALUE;
                Object obj = ii5.z;
                i = ii5.B;
                if (i != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    vh5 vh5 = new vh5(this, (f61) null, 4);
                    ii5.B = 1;
                    Object e0 = ar7.e0(h81, vh5, ii5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        ii5 = new ii5(this, h61);
        Object obj2 = ii5.z;
        i = ii5.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object m(int i, boolean z, h61 h61) {
        ji5 ji5;
        int i2;
        if (h61 instanceof ji5) {
            ji5 = (ji5) h61;
            int i3 = ji5.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ji5.B = i3 - Integer.MIN_VALUE;
                Object obj = ji5.z;
                i2 = ji5.B;
                if (i2 != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    ei5 ei5 = new ei5(this, i, z, (f61) null, 1);
                    ji5.B = 1;
                    Object e0 = ar7.e0(h81, ei5, ji5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        ji5 = new ji5(this, h61);
        Object obj2 = ji5.z;
        i2 = ji5.B;
        if (i2 != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object n(int i, boolean z, h61 h61) {
        ki5 ki5;
        int i2;
        if (h61 instanceof ki5) {
            ki5 = (ki5) h61;
            int i3 = ki5.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ki5.B = i3 - Integer.MIN_VALUE;
                Object obj = ki5.z;
                i2 = ki5.B;
                if (i2 != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    ei5 ei5 = new ei5(this, i, z, (f61) null, 2);
                    ki5.B = 1;
                    Object e0 = ar7.e0(h81, ei5, ki5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        ki5 = new ki5(this, h61);
        Object obj2 = ki5.z;
        i2 = ki5.B;
        if (i2 != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final Object o(h61 h61) {
        li5 li5;
        int i;
        if (h61 instanceof li5) {
            li5 = (li5) h61;
            int i2 = li5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                li5.B = i2 - Integer.MIN_VALUE;
                Object obj = li5.z;
                i = li5.B;
                if (i != 0) {
                    o85.q(obj);
                    h81 h81 = this.c;
                    vh5 vh5 = new vh5(this, (f61) null, 5);
                    li5.B = 1;
                    Object e0 = ar7.e0(h81, vh5, li5);
                    p81 p81 = p81.w;
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
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
        li5 = new li5(this, h61);
        Object obj2 = li5.z;
        i = li5.B;
        if (i != 0) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object p(boolean z, h61 h61) {
        mi5 mi5;
        int i;
        if (h61 instanceof mi5) {
            mi5 = (mi5) h61;
            int i2 = mi5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mi5.B = i2 - Integer.MIN_VALUE;
                Object obj = mi5.z;
                i = mi5.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    mi5.B = 1;
                    Object D = ((dy7) dv7).D(z, mi5);
                    p81 p81 = p81.w;
                    if (D == p81) {
                        return p81;
                    }
                    return D;
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
        mi5 = new mi5(this, h61);
        Object obj2 = mi5.z;
        i = mi5.B;
        if (i != 0) {
        }
    }
}
