package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* renamed from: je7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class je7 extends ct2 implements vr2 {
    public final /* synthetic */ int D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je7(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.D = i4;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, d06] */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02ca, code lost:
        if (defpackage.os3.a(defpackage.uq3.f(r1.getKeyCode()), defpackage.os3.o) != false) goto L_0x0508;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03d6, code lost:
        if (defpackage.os3.a(r6, defpackage.os3.N) == false) goto L_0x0507;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0181  */
    public final Object y(Object obj) {
        ou0 ou0;
        ps3 ps3;
        hf7 hf7;
        vl vlVar;
        ps7 ps7;
        ps3 ps32;
        ps3 ps33;
        ps3 ps34;
        Integer num;
        Object obj2 = obj;
        int i = this.D;
        Object obj3 = this.x;
        switch (i) {
            case b85.b:
                KeyEvent keyEvent = ((qs3) obj2).a;
                he7 he7 = (he7) obj3;
                kg7 kg7 = he7.f;
                boolean z = he7.d;
                boolean z2 = true;
                if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
                    nj1 nj1 = he7.i;
                    nj1.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        nj1.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        num = null;
                    } else {
                        Integer num2 = nj1.a;
                        if (num2 != null) {
                            nj1.a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num2.intValue(), unicodeChar);
                            Integer valueOf = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                unicodeChar = valueOf.intValue();
                            }
                            num = Integer.valueOf(unicodeChar);
                        } else {
                            num = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (num != null) {
                        ou0 = new ou0(new StringBuilder().appendCodePoint(num.intValue()).toString(), 1);
                        if (ou0 == null) {
                            if (z) {
                                he7.a(sg3.D(ou0));
                                kg7.a = null;
                                return Boolean.valueOf(z2);
                            }
                        } else if (rd3.A(keyEvent) == 2) {
                            he7.j.getClass();
                            int y = sg3.y(keyEvent);
                            int i2 = rg3.p;
                            if (y == 9) {
                                long f = uq3.f(keyEvent.getKeyCode());
                                if (os3.a(f, os3.f)) {
                                    ps3 = ps3.m0;
                                } else if (os3.a(f, os3.g)) {
                                    ps3 = ps3.n0;
                                } else if (os3.a(f, os3.d)) {
                                    ps3 = ps3.e0;
                                } else if (os3.a(f, os3.e)) {
                                    ps3 = ps3.f0;
                                }
                                if (ps3 == null) {
                                    int i3 = rg3.q;
                                    int y2 = sg3.y(keyEvent);
                                    long f2 = uq3.f(keyEvent.getKeyCode());
                                    boolean a = os3.a(f2, os3.s);
                                    ps3 ps35 = ps3.p0;
                                    ps3 ps36 = ps3.R;
                                    if (a) {
                                        if (!(y2 == 0 || y2 == 8)) {
                                            int i4 = rg3.r;
                                            if (y2 != 12) {
                                                if (y2 == 2 || y2 == 10) {
                                                    ps34 = ps3.T;
                                                    if (ps3 == null) {
                                                        int y3 = sg3.y(keyEvent);
                                                        ps3 ps37 = ps3.k0;
                                                        ps3 ps38 = ps3.l0;
                                                        if (y3 == 10) {
                                                            long f3 = uq3.f(keyEvent.getKeyCode());
                                                            ps32 = ps38;
                                                            if (os3.a(f3, os3.f) || os3.a(f3, os3.H)) {
                                                                ps33 = ps3.g0;
                                                                if (ps33 == null) {
                                                                    Object obj4 = ws3.a.x;
                                                                    int y4 = sg3.y(keyEvent);
                                                                    ps3 ps39 = ps3.s0;
                                                                    if (y4 == 10) {
                                                                        break;
                                                                    } else {
                                                                        ps3 ps310 = ps3.O;
                                                                        ps3 ps311 = ps3.Q;
                                                                        ps3 ps312 = ps3.P;
                                                                        if (y4 == 2) {
                                                                            long f4 = uq3.f(keyEvent.getKeyCode());
                                                                            if (!os3.a(f4, os3.j) && !os3.a(f4, os3.x) && !os3.a(f4, os3.N)) {
                                                                                if (!os3.a(f4, os3.l)) {
                                                                                    if (!os3.a(f4, os3.m)) {
                                                                                        if (os3.a(f4, os3.i)) {
                                                                                            ps39 = ps3.X;
                                                                                        } else if (!os3.a(f4, os3.n)) {
                                                                                            if (os3.a(f4, os3.o)) {
                                                                                                ps39 = ps3.r0;
                                                                                            }
                                                                                        }
                                                                                        ps3 = ps39;
                                                                                    }
                                                                                    ps39 = ps311;
                                                                                    ps3 = ps39;
                                                                                }
                                                                            }
                                                                            ps39 = ps310;
                                                                            ps3 = ps39;
                                                                        } else if (y4 == 8) {
                                                                            long f5 = uq3.f(keyEvent.getKeyCode());
                                                                            if (!os3.a(f5, os3.f) && !os3.a(f5, os3.H)) {
                                                                                if (!os3.a(f5, os3.g) && !os3.a(f5, os3.I)) {
                                                                                    if (!os3.a(f5, os3.d) && !os3.a(f5, os3.F)) {
                                                                                        if (!os3.a(f5, os3.e) && !os3.a(f5, os3.G)) {
                                                                                            if (!os3.a(f5, os3.C) && !os3.a(f5, os3.L)) {
                                                                                                if (!os3.a(f5, os3.D) && !os3.a(f5, os3.M)) {
                                                                                                    if (!os3.a(f5, os3.v) && !os3.a(f5, os3.J)) {
                                                                                                        if (!os3.a(f5, os3.w) && !os3.a(f5, os3.K)) {
                                                                                                            if (!os3.a(f5, os3.x)) {
                                                                                                                break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            ps39 = ps32;
                                                                                                            ps3 = ps39;
                                                                                                        }
                                                                                                    } else {
                                                                                                        ps39 = ps37;
                                                                                                        ps3 = ps39;
                                                                                                    }
                                                                                                } else {
                                                                                                    ps39 = ps3.d0;
                                                                                                    ps3 = ps39;
                                                                                                }
                                                                                            } else {
                                                                                                ps39 = ps3.c0;
                                                                                                ps3 = ps39;
                                                                                            }
                                                                                        } else {
                                                                                            ps39 = ps3.b0;
                                                                                            ps3 = ps39;
                                                                                        }
                                                                                    } else {
                                                                                        ps39 = ps3.a0;
                                                                                        ps3 = ps39;
                                                                                    }
                                                                                } else {
                                                                                    ps39 = ps3.Z;
                                                                                    ps3 = ps39;
                                                                                }
                                                                            } else {
                                                                                ps39 = ps3.Y;
                                                                                ps3 = ps39;
                                                                            }
                                                                        } else if (y4 == 0) {
                                                                            long f6 = uq3.f(keyEvent.getKeyCode());
                                                                            if (os3.a(f6, os3.f) || os3.a(f6, os3.H)) {
                                                                                ps39 = ps3.x;
                                                                                ps3 = ps39;
                                                                            } else if (os3.a(f6, os3.g) || os3.a(f6, os3.I)) {
                                                                                ps39 = ps3.y;
                                                                                ps3 = ps39;
                                                                            } else if (os3.a(f6, os3.d) || os3.a(f6, os3.F)) {
                                                                                ps39 = ps3.H;
                                                                                ps3 = ps39;
                                                                            } else if (os3.a(f6, os3.e) || os3.a(f6, os3.G)) {
                                                                                ps39 = ps3.I;
                                                                                ps3 = ps39;
                                                                            } else {
                                                                                if (os3.a(f6, os3.h)) {
                                                                                    ps39 = ps3.J;
                                                                                } else if (os3.a(f6, os3.C) || os3.a(f6, os3.L)) {
                                                                                    ps39 = ps3.K;
                                                                                } else if (os3.a(f6, os3.D) || os3.a(f6, os3.M)) {
                                                                                    ps39 = ps3.L;
                                                                                } else if (os3.a(f6, os3.v) || os3.a(f6, os3.J)) {
                                                                                    ps39 = ps3.D;
                                                                                } else if (os3.a(f6, os3.w) || os3.a(f6, os3.K)) {
                                                                                    ps39 = ps3.E;
                                                                                } else if (os3.a(f6, os3.r) || os3.a(f6, os3.E)) {
                                                                                    ps39 = ps35;
                                                                                } else if (os3.a(f6, os3.s)) {
                                                                                    ps39 = ps36;
                                                                                } else if (os3.a(f6, os3.t)) {
                                                                                    ps39 = ps3.S;
                                                                                } else if (!os3.a(f6, os3.A)) {
                                                                                    if (!os3.a(f6, os3.y)) {
                                                                                        if (!os3.a(f6, os3.z)) {
                                                                                            if (os3.a(f6, os3.p)) {
                                                                                                ps39 = ps3.q0;
                                                                                            }
                                                                                        }
                                                                                        ps39 = ps310;
                                                                                    }
                                                                                    ps39 = ps311;
                                                                                }
                                                                                ps3 = ps39;
                                                                            }
                                                                        }
                                                                        ps39 = ps312;
                                                                        ps3 = ps39;
                                                                    }
                                                                    ps39 = null;
                                                                    ps3 = ps39;
                                                                } else {
                                                                    ps3 = ps33;
                                                                }
                                                            } else if (os3.a(f3, os3.g) || os3.a(f3, os3.I)) {
                                                                ps33 = ps3.h0;
                                                                if (ps33 == null) {
                                                                }
                                                            } else if (os3.a(f3, os3.d) || os3.a(f3, os3.F)) {
                                                                ps33 = ps3.j0;
                                                                if (ps33 == null) {
                                                                }
                                                            } else if (os3.a(f3, os3.e) || os3.a(f3, os3.G)) {
                                                                ps33 = ps3.i0;
                                                                if (ps33 == null) {
                                                                }
                                                            }
                                                        } else {
                                                            ps32 = ps38;
                                                            if (y3 == 2) {
                                                                long f7 = uq3.f(keyEvent.getKeyCode());
                                                                if (os3.a(f7, os3.f) || os3.a(f7, os3.H)) {
                                                                    ps33 = ps3.A;
                                                                    if (ps33 == null) {
                                                                    }
                                                                } else if (os3.a(f7, os3.g) || os3.a(f7, os3.I)) {
                                                                    ps33 = ps3.z;
                                                                    if (ps33 == null) {
                                                                    }
                                                                } else if (os3.a(f7, os3.d) || os3.a(f7, os3.F)) {
                                                                    ps33 = ps3.C;
                                                                    if (ps33 == null) {
                                                                    }
                                                                } else if (os3.a(f7, os3.e) || os3.a(f7, os3.G)) {
                                                                    ps33 = ps3.B;
                                                                    if (ps33 == null) {
                                                                    }
                                                                } else {
                                                                    if (os3.a(f7, os3.k)) {
                                                                        ps33 = ps36;
                                                                    } else if (os3.a(f7, os3.t)) {
                                                                        ps33 = ps3.U;
                                                                    } else if (os3.a(f7, os3.B)) {
                                                                        ps33 = ps3.o0;
                                                                    }
                                                                    if (ps33 == null) {
                                                                    }
                                                                }
                                                            } else if (y3 == 8) {
                                                                long f8 = uq3.f(keyEvent.getKeyCode());
                                                                if (os3.a(f8, os3.v) || os3.a(f8, os3.J)) {
                                                                    ps33 = ps37;
                                                                    if (ps33 == null) {
                                                                    }
                                                                } else if (os3.a(f8, os3.w) || os3.a(f8, os3.K)) {
                                                                    ps33 = ps32;
                                                                    if (ps33 == null) {
                                                                    }
                                                                }
                                                            } else if (y3 == 1 && os3.a(uq3.f(keyEvent.getKeyCode()), os3.t)) {
                                                                ps33 = ps3.W;
                                                                if (ps33 == null) {
                                                                }
                                                            }
                                                        }
                                                        ps33 = null;
                                                        if (ps33 == null) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        ps34 = ps36;
                                        if (ps3 == null) {
                                        }
                                    } else if ((os3.a(f2, os3.r) || os3.a(f2, os3.E)) && (y2 == 0 || y2 == 8 || y2 == 2 || y2 == 10)) {
                                        ps34 = ps35;
                                        if (ps3 == null) {
                                        }
                                    }
                                    ps34 = null;
                                    if (ps3 == null) {
                                    }
                                }
                                if (ps3 != null && (!ps3.w || z)) {
                                    ? obj5 = new Object();
                                    obj5.w = true;
                                    h17 h17 = new h17(ps3, he7, obj5, 3);
                                    hf7 = he7.c;
                                    oe7 oe7 = new oe7(hf7, he7.g, he7.a.d(), kg7);
                                    h17.y(oe7);
                                    boolean b = lg7.b(oe7.f, hf7.b);
                                    vlVar = oe7.g;
                                    if (!b || !sg3.e(vlVar, hf7.a)) {
                                        he7.k.y(hf7.a(hf7, vlVar, oe7.f, 4));
                                    }
                                    ps7 = he7.h;
                                    if (ps7 != null) {
                                        ps7.e = true;
                                    }
                                    z2 = obj5.w;
                                    return Boolean.valueOf(z2);
                                }
                            } else if (y == 1) {
                                long f9 = uq3.f(keyEvent.getKeyCode());
                                if (os3.a(f9, os3.f)) {
                                    ps3 = ps3.F;
                                } else if (os3.a(f9, os3.g)) {
                                    ps3 = ps3.G;
                                } else if (os3.a(f9, os3.d)) {
                                    ps3 = ps3.M;
                                } else if (os3.a(f9, os3.e)) {
                                    ps3 = ps3.N;
                                } else if (os3.a(f9, os3.s)) {
                                    ps3 = ps3.V;
                                }
                                if (ps3 == null) {
                                }
                                ? obj52 = new Object();
                                obj52.w = true;
                                h17 h172 = new h17(ps3, he7, obj52, 3);
                                hf7 = he7.c;
                                oe7 oe72 = new oe7(hf7, he7.g, he7.a.d(), kg7);
                                h172.y(oe72);
                                boolean b2 = lg7.b(oe72.f, hf7.b);
                                vlVar = oe72.g;
                                he7.k.y(hf7.a(hf7, vlVar, oe72.f, 4));
                                ps7 = he7.h;
                                if (ps7 != null) {
                                }
                                z2 = obj52.w;
                                return Boolean.valueOf(z2);
                            }
                            ps3 = null;
                            if (ps3 == null) {
                            }
                            ? obj522 = new Object();
                            obj522.w = true;
                            h17 h1722 = new h17(ps3, he7, obj522, 3);
                            hf7 = he7.c;
                            oe7 oe722 = new oe7(hf7, he7.g, he7.a.d(), kg7);
                            h1722.y(oe722);
                            boolean b22 = lg7.b(oe722.f, hf7.b);
                            vlVar = oe722.g;
                            he7.k.y(hf7.a(hf7, vlVar, oe722.f, 4));
                            ps7 = he7.h;
                            if (ps7 != null) {
                            }
                            z2 = obj522.w;
                            return Boolean.valueOf(z2);
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                    }
                }
                ou0 = null;
                if (ou0 == null) {
                }
                z2 = false;
                return Boolean.valueOf(z2);
            default:
                return Boolean.valueOf(((bn5) obj3).test(obj2));
        }
    }
}
