package defpackage;

/* renamed from: n4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n4 extends f1 {
    public static n4 e;
    public static final p56 f = p56.x;
    public static final p56 g = p56.w;
    public bg7 c;
    public fk6 d;

    public final int[] e(int i) {
        int i2;
        if (i().length() > 0 && i < i().length()) {
            try {
                fk6 fk6 = this.d;
                if (fk6 != null) {
                    ly5 g2 = fk6.g();
                    int round = Math.round(g2.d - g2.b);
                    if (i <= 0) {
                        i = 0;
                    }
                    bg7 bg7 = this.c;
                    if (bg7 != null) {
                        int d2 = bg7.b.d(i);
                        bg7 bg72 = this.c;
                        if (bg72 != null) {
                            float f2 = bg72.b.f(d2) + ((float) round);
                            bg7 bg73 = this.c;
                            if (bg73 != null) {
                                pn4 pn4 = bg73.b;
                                int i3 = (f2 > pn4.f(pn4.f - 1) ? 1 : (f2 == pn4.f(pn4.f - 1) ? 0 : -1));
                                bg7 bg74 = this.c;
                                if (i3 < 0) {
                                    if (bg74 != null) {
                                        i2 = bg74.b.e(f2);
                                    } else {
                                        sg3.a0("layoutResult");
                                        throw null;
                                    }
                                } else if (bg74 != null) {
                                    i2 = bg74.b.f;
                                } else {
                                    sg3.a0("layoutResult");
                                    throw null;
                                }
                                return h(i, s(i2 - 1, g) + 1);
                            }
                            sg3.a0("layoutResult");
                            throw null;
                        }
                        sg3.a0("layoutResult");
                        throw null;
                    }
                    sg3.a0("layoutResult");
                    throw null;
                }
                sg3.a0("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int[] q(int i) {
        int i2;
        if (i().length() > 0 && i > 0) {
            try {
                fk6 fk6 = this.d;
                if (fk6 != null) {
                    ly5 g2 = fk6.g();
                    int round = Math.round(g2.d - g2.b);
                    int length = i().length();
                    if (length <= i) {
                        i = length;
                    }
                    bg7 bg7 = this.c;
                    if (bg7 != null) {
                        int d2 = bg7.b.d(i);
                        bg7 bg72 = this.c;
                        if (bg72 != null) {
                            float f2 = bg72.b.f(d2) - ((float) round);
                            if (f2 > 0.0f) {
                                bg7 bg73 = this.c;
                                if (bg73 != null) {
                                    i2 = bg73.b.e(f2);
                                } else {
                                    sg3.a0("layoutResult");
                                    throw null;
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i == i().length() && i2 < d2) {
                                i2++;
                            }
                            return h(s(i2, f), i);
                        }
                        sg3.a0("layoutResult");
                        throw null;
                    }
                    sg3.a0("layoutResult");
                    throw null;
                }
                sg3.a0("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int s(int i, p56 p56) {
        bg7 bg7 = this.c;
        if (bg7 != null) {
            int g2 = bg7.g(i);
            bg7 bg72 = this.c;
            if (bg72 != null) {
                p56 h = bg72.h(g2);
                bg7 bg73 = this.c;
                if (p56 != h) {
                    if (bg73 != null) {
                        return bg73.g(i);
                    }
                    sg3.a0("layoutResult");
                    throw null;
                } else if (bg73 != null) {
                    return bg73.b.c(i, false) - 1;
                } else {
                    sg3.a0("layoutResult");
                    throw null;
                }
            } else {
                sg3.a0("layoutResult");
                throw null;
            }
        } else {
            sg3.a0("layoutResult");
            throw null;
        }
    }
}
