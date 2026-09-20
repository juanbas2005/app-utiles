package defpackage;

import java.text.BreakIterator;

/* renamed from: m4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m4 extends f1 {
    public static m4 e;
    public static m4 f;
    public static m4 g;
    public static final p56 h = p56.x;
    public static final p56 i = p56.w;
    public final /* synthetic */ int c;
    public Object d;

    public /* synthetic */ m4(int i2) {
        this.c = i2;
    }

    public final int[] e(int i2) {
        int i3;
        switch (this.c) {
            case b85.b:
                int length = i().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i2);
                        BreakIterator breakIterator2 = (BreakIterator) this.d;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i2 = breakIterator2.following(i2);
                            } else {
                                sg3.a0("impl");
                                throw null;
                            }
                        } else if (breakIterator2 != null) {
                            int following = breakIterator2.following(i2);
                            if (following == -1) {
                                return null;
                            }
                            return h(i2, following);
                        } else {
                            sg3.a0("impl");
                            throw null;
                        }
                    } else {
                        sg3.a0("impl");
                        throw null;
                    }
                } while (i2 != -1);
                return null;
            case 1:
                if (i().length() <= 0 || i2 >= i().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!v(i2) && (!v(i2) || (i2 != 0 && v(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 != null) {
                        i2 = breakIterator3.following(i2);
                        if (i2 == -1) {
                            return null;
                        }
                    } else {
                        sg3.a0("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 != null) {
                    int following2 = breakIterator4.following(i2);
                    if (following2 == -1 || !u(following2)) {
                        return null;
                    }
                    return h(i2, following2);
                }
                sg3.a0("impl");
                throw null;
            default:
                if (i().length() <= 0 || i2 >= i().length()) {
                    return null;
                }
                bg7 bg7 = (bg7) this.d;
                p56 p56 = h;
                if (i2 < 0) {
                    if (bg7 != null) {
                        i3 = bg7.b.d(0);
                    } else {
                        sg3.a0("layoutResult");
                        throw null;
                    }
                } else if (bg7 != null) {
                    int d2 = bg7.b.d(i2);
                    if (s(d2, p56) == i2) {
                        i3 = d2;
                    } else {
                        i3 = d2 + 1;
                    }
                } else {
                    sg3.a0("layoutResult");
                    throw null;
                }
                bg7 bg72 = (bg7) this.d;
                if (bg72 == null) {
                    sg3.a0("layoutResult");
                    throw null;
                } else if (i3 >= bg72.b.f) {
                    return null;
                } else {
                    return h(s(i3, p56), s(i3, i) + 1);
                }
        }
    }

    public final int[] q(int i2) {
        int i3;
        switch (this.c) {
            case b85.b:
                int length = i().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i2);
                        BreakIterator breakIterator2 = (BreakIterator) this.d;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i2 = breakIterator2.preceding(i2);
                            } else {
                                sg3.a0("impl");
                                throw null;
                            }
                        } else if (breakIterator2 != null) {
                            int preceding = breakIterator2.preceding(i2);
                            if (preceding == -1) {
                                return null;
                            }
                            return h(preceding, i2);
                        } else {
                            sg3.a0("impl");
                            throw null;
                        }
                    } else {
                        sg3.a0("impl");
                        throw null;
                    }
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = i().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !v(i2 - 1) && !u(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 != null) {
                        i2 = breakIterator3.preceding(i2);
                        if (i2 == -1) {
                            return null;
                        }
                    } else {
                        sg3.a0("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 != null) {
                    int preceding2 = breakIterator4.preceding(i2);
                    if (preceding2 == -1 || !v(preceding2)) {
                        return null;
                    }
                    if (preceding2 == 0 || !v(preceding2 - 1)) {
                        return h(preceding2, i2);
                    }
                    return null;
                }
                sg3.a0("impl");
                throw null;
            default:
                if (i().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = i().length();
                bg7 bg7 = (bg7) this.d;
                p56 p56 = i;
                if (i2 > length3) {
                    if (bg7 != null) {
                        i3 = bg7.b.d(i().length());
                    } else {
                        sg3.a0("layoutResult");
                        throw null;
                    }
                } else if (bg7 != null) {
                    int d2 = bg7.b.d(i2);
                    if (s(d2, p56) + 1 == i2) {
                        i3 = d2;
                    } else {
                        i3 = d2 - 1;
                    }
                } else {
                    sg3.a0("layoutResult");
                    throw null;
                }
                if (i3 < 0) {
                    return null;
                }
                return h(s(i3, h), s(i3, p56) + 1);
        }
    }

    public int s(int i2, p56 p56) {
        bg7 bg7 = (bg7) this.d;
        if (bg7 != null) {
            int g2 = bg7.g(i2);
            bg7 bg72 = (bg7) this.d;
            if (bg72 != null) {
                p56 h2 = bg72.h(g2);
                bg7 bg73 = (bg7) this.d;
                if (p56 != h2) {
                    if (bg73 != null) {
                        return bg73.g(i2);
                    }
                    sg3.a0("layoutResult");
                    throw null;
                } else if (bg73 != null) {
                    return bg73.b.c(i2, false) - 1;
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

    public void t(String str) {
        switch (this.c) {
            case b85.b:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    sg3.a0("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    sg3.a0("impl");
                    throw null;
                }
        }
    }

    public boolean u(int i2) {
        if (i2 <= 0 || !v(i2 - 1)) {
            return false;
        }
        if (i2 == i().length() || !v(i2)) {
            return true;
        }
        return false;
    }

    public boolean v(int i2) {
        if (i2 < 0 || i2 >= i().length()) {
            return false;
        }
        return Character.isLetterOrDigit(i().codePointAt(i2));
    }
}
