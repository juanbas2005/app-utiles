package defpackage;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: v44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v44 {
    public final View a;
    public final qc3 b;
    public vr2 c = new tm3(10);
    public vr2 d = new tm3(11);
    public u44 e;
    public ze7 f;
    public g58 g;
    public hf7 h = new hf7(4, lg7.b, "");
    public c93 i = c93.g;
    public final ArrayList j = new ArrayList();
    public final nz3 k = rg3.y(i44.x, new zh(25, (Object) this));
    public Rect l;
    public final q44 m;

    public v44(View view, mg mgVar, qc3 qc3) {
        this.a = view;
        this.b = qc3;
        this.m = new q44(mgVar, qc3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x014c  */
    public final jy5 a(EditorInfo editorInfo) {
        int i2;
        ya4 ya4;
        int i3;
        int i4;
        EditorInfo editorInfo2 = editorInfo;
        hf7 hf7 = this.h;
        String str = hf7.a.x;
        long j2 = hf7.b;
        c93 c93 = this.i;
        int i5 = c93.e;
        int i6 = c93.d;
        boolean z = c93.a;
        int i7 = 3;
        if (i5 != 1) {
            if (i5 == 0) {
                i2 = 1;
            } else if (i5 == 2) {
                i2 = 2;
            } else if (i5 == 6) {
                i2 = 5;
            } else if (i5 == 5) {
                i2 = 7;
            } else if (i5 == 3) {
                i2 = 3;
            } else if (i5 == 4) {
                i2 = 4;
            } else if (i5 != 7) {
                h.s("invalid ImeAction");
                return null;
            }
            editorInfo2.imeOptions = i2;
            ya4 = c93.f;
            if (sg3.e(ya4, ya4.y)) {
            }
            if (i6 != 1) {
            }
            i3 = 1;
            editorInfo2.inputType = i3;
            editorInfo2.inputType = 131072 | i3;
            if (c93.e == 1) {
            }
            i4 = editorInfo2.inputType;
            if ((i4 & 15) == 1) {
            }
            int i8 = lg7.c;
            editorInfo2.initialSelStart = (int) (j2 >> 32);
            editorInfo2.initialSelEnd = (int) (j2 & 4294967295L);
            h49.P(editorInfo2, str);
            editorInfo2.imeOptions |= 33554432;
            h49.Q(editorInfo2, false);
            r44 r44 = s44.a;
            if (w22.d()) {
            }
            jy5 jy5 = new jy5(this.h, new f96(27, (Object) this), this.i.c, this.e, this.f, this.g);
            this.j.add(new WeakReference(jy5));
            return jy5;
        } else if (!z) {
            i2 = 0;
            editorInfo2.imeOptions = i2;
            ya4 = c93.f;
            if (sg3.e(ya4, ya4.y)) {
                editorInfo2.hintLocales = null;
            } else {
                ArrayList arrayList = new ArrayList(et0.e0(ya4, 10));
                for (xa4 xa4 : ya4.w) {
                    arrayList.add(xa4.a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                editorInfo2.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
            }
            if (i6 != 1) {
                if (i6 == 2) {
                    editorInfo2.imeOptions |= Integer.MIN_VALUE;
                } else {
                    if (i6 == 3) {
                        i3 = 2;
                    } else {
                        if (i6 != 4) {
                            i3 = 17;
                            if (i6 != 5) {
                                if (i6 == 6) {
                                    i3 = 33;
                                } else if (i6 == 7) {
                                    i3 = 129;
                                } else {
                                    i7 = 18;
                                    if (i6 != 8) {
                                        if (i6 == 9) {
                                            i3 = 8194;
                                        } else if (i6 == 10) {
                                            i3 = 145;
                                        } else if (i6 == 11) {
                                            i3 = 113;
                                        } else if (i6 == 12) {
                                            i3 = 97;
                                        } else if (i6 == 13) {
                                            i3 = 49;
                                        } else if (i6 == 14) {
                                            i3 = 65;
                                        } else if (i6 == 15) {
                                            i3 = 81;
                                        } else if (i6 == 16) {
                                            i3 = 177;
                                        } else if (i6 == 17) {
                                            i3 = 193;
                                        } else if (i6 == 18) {
                                            i3 = 4;
                                        } else {
                                            i3 = 20;
                                            if (i6 != 19) {
                                                if (i6 == 20) {
                                                    i3 = 36;
                                                } else if (i6 == 21) {
                                                    i3 = 4098;
                                                } else if (i6 == 22) {
                                                    i3 = 12290;
                                                } else if (i6 == 23) {
                                                    i3 = 8210;
                                                } else if (i6 == 24) {
                                                    i3 = 4114;
                                                } else if (i6 == 25) {
                                                    i3 = 12306;
                                                } else {
                                                    h.s("Invalid Keyboard Type");
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i3 = i7;
                    }
                    editorInfo2.inputType = i3;
                    if (!z && (i3 & 15) == 1) {
                        editorInfo2.inputType = 131072 | i3;
                        if (c93.e == 1) {
                            editorInfo2.imeOptions |= 1073741824;
                        }
                    }
                    i4 = editorInfo2.inputType;
                    if ((i4 & 15) == 1) {
                        int i9 = c93.b;
                        if (i9 == 1) {
                            editorInfo2.inputType = i4 | 4096;
                        } else if (i9 == 2) {
                            editorInfo2.inputType = i4 | 8192;
                        } else if (i9 == 3) {
                            editorInfo2.inputType = i4 | 16384;
                        }
                        if (c93.c) {
                            editorInfo2.inputType |= 32768;
                        }
                    }
                    int i82 = lg7.c;
                    editorInfo2.initialSelStart = (int) (j2 >> 32);
                    editorInfo2.initialSelEnd = (int) (j2 & 4294967295L);
                    h49.P(editorInfo2, str);
                    editorInfo2.imeOptions |= 33554432;
                    if (e67.a || i6 != 7 || i6 == 10 || i6 == 8 || i6 == 23 || i6 == 24 || i6 == 25) {
                        h49.Q(editorInfo2, false);
                    } else {
                        h49.Q(editorInfo2, true);
                        editorInfo2.setSupportedHandwritingGestures(sg3.E(jg.p(), j22.v(), jg.A(), j22.n(), j22.y(), j22.A(), j22.C()));
                        editorInfo2.setSupportedHandwritingGesturePreviews(qs.r1(new Class[]{jg.p(), j22.v(), jg.A(), j22.n()}));
                    }
                    r44 r442 = s44.a;
                    if (w22.d()) {
                        w22.a().i(editorInfo2);
                    }
                    jy5 jy52 = new jy5(this.h, new f96(27, (Object) this), this.i.c, this.e, this.f, this.g);
                    this.j.add(new WeakReference(jy52));
                    return jy52;
                }
            }
            i3 = 1;
            editorInfo2.inputType = i3;
            editorInfo2.inputType = 131072 | i3;
            if (c93.e == 1) {
            }
            i4 = editorInfo2.inputType;
            if ((i4 & 15) == 1) {
            }
            int i822 = lg7.c;
            editorInfo2.initialSelStart = (int) (j2 >> 32);
            editorInfo2.initialSelEnd = (int) (j2 & 4294967295L);
            h49.P(editorInfo2, str);
            editorInfo2.imeOptions |= 33554432;
            if (e67.a && i6 != 7) {
            }
            h49.Q(editorInfo2, false);
            r44 r4422 = s44.a;
            if (w22.d()) {
            }
            jy5 jy522 = new jy5(this.h, new f96(27, (Object) this), this.i.c, this.e, this.f, this.g);
            this.j.add(new WeakReference(jy522));
            return jy522;
        }
        i2 = 6;
        editorInfo2.imeOptions = i2;
        ya4 = c93.f;
        if (sg3.e(ya4, ya4.y)) {
        }
        if (i6 != 1) {
        }
        i3 = 1;
        editorInfo2.inputType = i3;
        editorInfo2.inputType = 131072 | i3;
        if (c93.e == 1) {
        }
        i4 = editorInfo2.inputType;
        if ((i4 & 15) == 1) {
        }
        int i8222 = lg7.c;
        editorInfo2.initialSelStart = (int) (j2 >> 32);
        editorInfo2.initialSelEnd = (int) (j2 & 4294967295L);
        h49.P(editorInfo2, str);
        editorInfo2.imeOptions |= 33554432;
        h49.Q(editorInfo2, false);
        r44 r44222 = s44.a;
        if (w22.d()) {
        }
        jy5 jy5222 = new jy5(this.h, new f96(27, (Object) this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(jy5222));
        return jy5222;
    }
}
