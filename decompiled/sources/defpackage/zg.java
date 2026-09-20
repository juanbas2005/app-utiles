package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zg  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zg {
    public final dh a;
    public final int b;
    public final long c;
    public final zf7 d;
    public final CharSequence e;
    public final List f;

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x014a  */
    public zg(dh dhVar, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        yy6 yy6;
        int i14;
        char c2;
        yy6 yy62;
        int i15;
        TextUtils.TruncateAt truncateAt;
        zf7 a2;
        Layout layout;
        int i16;
        int i17;
        int i18;
        zg zgVar;
        Layout layout2;
        jq6[] jq6Arr;
        CharSequence charSequence;
        List list;
        boolean z;
        boolean z2;
        boolean z3;
        ly5 ly5;
        boolean z4;
        float f2;
        float f3;
        int c3;
        int c4;
        int i19;
        TextUtils.TruncateAt truncateAt2;
        int i20;
        Spannable spannable;
        dh dhVar2 = dhVar;
        int i21 = i;
        int i22 = i2;
        this.a = dhVar2;
        this.b = i21;
        long j2 = j;
        this.c = j2;
        if (!(k31.i(j2) == 0 && k31.j(j2) == 0)) {
            zb3.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i21 < 1) {
            zb3.a("maxLines should be greater than 0");
        }
        tg7 tg7 = dhVar2.x;
        CharSequence charSequence2 = dhVar2.D;
        if (i22 == 2) {
            i3 = 0;
            if (!(wg7.a(tg7.a.h, ya5.k(0)) || wg7.a(tg7.a.h, wg7.c) || (i20 = tg7.b.a) == 0 || i20 == 5 || i20 == 4 || charSequence2.length() == 0)) {
                if (charSequence2 instanceof Spannable) {
                    spannable = (Spannable) charSequence2;
                } else {
                    spannable = null;
                }
                spannable = spannable == null ? new SpannableString(charSequence2) : spannable;
                if (!b85.l(spannable, ha3.class)) {
                    spannable.setSpan(new Object(), spannable.length() - 1, spannable.length() - 1, 33);
                }
                charSequence2 = spannable;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        nc5 nc5 = tg7.b;
        yy6 yy63 = tg7.a;
        int i23 = nc5.a;
        int i24 = 3;
        if (i23 == 1) {
            i4 = 3;
        } else if (i23 == 2) {
            i4 = 4;
        } else if (i23 == 3) {
            i4 = 2;
        } else if (i23 != 5 && i23 == 6) {
            i4 = 1;
        } else {
            i4 = i3;
        }
        if (i23 == 4) {
            i5 = 1;
        } else {
            i5 = i3;
        }
        if (nc5.h != 2) {
            i6 = i3;
        } else if (Build.VERSION.SDK_INT <= 32) {
            i6 = 2;
        } else {
            i6 = 4;
        }
        int i25 = nc5.g;
        int i26 = i25 & 255;
        if (i26 != 1) {
            if (i26 == 2) {
                i8 = i25;
                i9 = i5;
                i7 = 1;
            } else if (i26 == 3) {
                i8 = i25;
                i9 = i5;
                i7 = 2;
            }
            i10 = (i8 >> 8) & 255;
            if (i10 != 1) {
                if (i10 == 2) {
                    i24 = 1;
                } else if (i10 == 3) {
                    i24 = 2;
                } else if (i10 == 4) {
                }
                i11 = (i8 >> 16) & 255;
                if (i11 == 1) {
                    i12 = 2;
                } else {
                    i12 = 2;
                    if (i11 == 2) {
                        yy6 = yy63;
                        i14 = i4;
                        i13 = 1;
                        if (i22 != i12) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else if (i22 == 5) {
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        } else if (i22 == 4) {
                            truncateAt2 = TextUtils.TruncateAt.START;
                        } else {
                            i15 = i6;
                            c2 = ' ';
                            yy62 = yy6;
                            truncateAt = null;
                            a2 = a(i14, i9, truncateAt, i21, i15, i7, i24, i13, charSequence3);
                            layout = a2.f;
                            int i27 = i14;
                            if (Build.VERSION.SDK_INT >= 35 || dhVar2.C.getLetterSpacing() == 0.0f || (!(i22 == 4 || i22 == 5) || layout.getEllipsisCount(0) <= 0)) {
                                zgVar = this;
                                i17 = i;
                                i18 = i27;
                                i16 = 2;
                            } else {
                                int ellipsisStart = layout.getEllipsisStart(0);
                                i16 = 2;
                                CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                                zgVar = this;
                                i17 = i;
                                i18 = i27;
                                a2 = zgVar.a(i18, i9, truncateAt, i17, i15, i7, i24, i13, TextUtils.concat(charSequenceArr));
                            }
                            int i28 = a2.g;
                            if (i22 != i16 || a2.a() <= k31.g(j2) || i17 <= 1) {
                                zgVar.d = a2;
                            } else {
                                int g = k31.g(j2);
                                int i29 = 0;
                                while (true) {
                                    if (i29 >= i28) {
                                        i29 = i28;
                                        break;
                                    } else if (a2.e(i29) > ((float) g)) {
                                        break;
                                    } else {
                                        i29++;
                                    }
                                }
                                if (i29 >= 0 && i29 != zgVar.b) {
                                    if (i29 < 1) {
                                        i19 = 1;
                                    } else {
                                        i19 = i29;
                                    }
                                    a2 = zgVar.a(i18, i9, truncateAt, i19, i15, i7, i24, i13, zgVar.e);
                                }
                                zgVar.d = a2;
                            }
                            zgVar.a.C.c(yy62.a.c(), (((long) Float.floatToRawIntBits(zgVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(zgVar.d())) << c2), yy62.a.a());
                            layout2 = zgVar.d.f;
                            if (layout2.getText() instanceof Spanned) {
                                CharSequence text = layout2.getText();
                                text.getClass();
                                Spanned spanned = (Spanned) text;
                                Class<jq6> cls = jq6.class;
                                if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
                                    CharSequence text2 = layout2.getText();
                                    text2.getClass();
                                    jq6Arr = (jq6[]) ((Spanned) text2).getSpans(0, layout2.getText().length(), cls);
                                    if (jq6Arr != null) {
                                        for (jq6 jq6 : jq6Arr) {
                                            jq6.y.setValue(new wu6((((long) Float.floatToRawIntBits(zgVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(zgVar.d())) << c2)));
                                        }
                                    }
                                    charSequence = zgVar.e;
                                    if (charSequence instanceof Spanned) {
                                        list = a42.w;
                                    } else {
                                        Spanned spanned2 = (Spanned) charSequence;
                                        Object[] spans = spanned2.getSpans(0, charSequence.length(), hh5.class);
                                        ArrayList arrayList = new ArrayList(spans.length);
                                        for (Object obj : spans) {
                                            hh5 hh5 = (hh5) obj;
                                            int spanStart = spanned2.getSpanStart(hh5);
                                            int spanEnd = spanned2.getSpanEnd(hh5);
                                            int g2 = zgVar.d.g(spanStart);
                                            if (g2 >= zgVar.b) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (zgVar.d.f.getEllipsisCount(g2) > 0) {
                                                if (spanEnd > zgVar.d.f.getEllipsisStart(g2) + zgVar.d.f.getLineStart(g2)) {
                                                    z2 = true;
                                                    if (spanEnd <= zgVar.d.f(g2)) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (!z2 || z3 || z) {
                                                        ly5 = null;
                                                    } else {
                                                        if (zgVar.d.f.getParagraphDirection(g2) == 1) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        boolean isRtlCharAt = zgVar.d.f.isRtlCharAt(spanStart);
                                                        if (!z4 || isRtlCharAt) {
                                                            if (!z4 || !isRtlCharAt) {
                                                                zf7 zf7 = zgVar.d;
                                                                if (isRtlCharAt) {
                                                                    f2 = zf7.j(spanStart, false);
                                                                    c4 = hh5.c();
                                                                } else {
                                                                    f3 = zf7.k(spanStart, false);
                                                                    c3 = hh5.c();
                                                                }
                                                            } else {
                                                                f2 = zgVar.d.k(spanStart, false);
                                                                c4 = hh5.c();
                                                            }
                                                            f3 = f2 - ((float) c4);
                                                            zf7 zf72 = zgVar.d;
                                                            hh5.getClass();
                                                            float d2 = zf72.d(g2) - ((float) hh5.b());
                                                            ly5 = new ly5(f3, d2, f2, ((float) hh5.b()) + d2);
                                                        } else {
                                                            f3 = zgVar.d.j(spanStart, false);
                                                            c3 = hh5.c();
                                                        }
                                                        f2 = ((float) c3) + f3;
                                                        zf7 zf722 = zgVar.d;
                                                        hh5.getClass();
                                                        float d22 = zf722.d(g2) - ((float) hh5.b());
                                                        ly5 = new ly5(f3, d22, f2, ((float) hh5.b()) + d22);
                                                    }
                                                    arrayList.add(ly5);
                                                }
                                            }
                                            z2 = false;
                                            if (spanEnd <= zgVar.d.f(g2)) {
                                            }
                                            if (!z2) {
                                            }
                                            ly5 = null;
                                            arrayList.add(ly5);
                                        }
                                        list = arrayList;
                                    }
                                    zgVar.f = list;
                                }
                            }
                            jq6Arr = null;
                            if (jq6Arr != null) {
                            }
                            charSequence = zgVar.e;
                            if (charSequence instanceof Spanned) {
                            }
                            zgVar.f = list;
                        }
                        i15 = i6;
                        c2 = ' ';
                        yy62 = yy6;
                        truncateAt = truncateAt2;
                        a2 = a(i14, i9, truncateAt, i21, i15, i7, i24, i13, charSequence3);
                        layout = a2.f;
                        int i272 = i14;
                        if (Build.VERSION.SDK_INT >= 35 || dhVar2.C.getLetterSpacing() == 0.0f || ((i22 == 4 && i22 == 5) || layout.getEllipsisCount(0) <= 0)) {
                        }
                        int i282 = a2.g;
                        if (i22 != i16 || a2.a() <= k31.g(j2) || i17 <= 1) {
                        }
                        zgVar.a.C.c(yy62.a.c(), (((long) Float.floatToRawIntBits(zgVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(zgVar.d())) << c2), yy62.a.a());
                        layout2 = zgVar.d.f;
                        if (layout2.getText() instanceof Spanned) {
                        }
                        jq6Arr = null;
                        if (jq6Arr != null) {
                        }
                        charSequence = zgVar.e;
                        if (charSequence instanceof Spanned) {
                        }
                        zgVar.f = list;
                    }
                }
                yy6 = yy63;
                i14 = i4;
                i13 = i3;
                if (i22 != i12) {
                }
                i15 = i6;
                c2 = ' ';
                yy62 = yy6;
                truncateAt = truncateAt2;
                a2 = a(i14, i9, truncateAt, i21, i15, i7, i24, i13, charSequence3);
                layout = a2.f;
                int i2722 = i14;
                if (Build.VERSION.SDK_INT >= 35 || dhVar2.C.getLetterSpacing() == 0.0f || ((i22 == 4 && i22 == 5) || layout.getEllipsisCount(0) <= 0)) {
                }
                int i2822 = a2.g;
                if (i22 != i16 || a2.a() <= k31.g(j2) || i17 <= 1) {
                }
                zgVar.a.C.c(yy62.a.c(), (((long) Float.floatToRawIntBits(zgVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(zgVar.d())) << c2), yy62.a.a());
                layout2 = zgVar.d.f;
                if (layout2.getText() instanceof Spanned) {
                }
                jq6Arr = null;
                if (jq6Arr != null) {
                }
                charSequence = zgVar.e;
                if (charSequence instanceof Spanned) {
                }
                zgVar.f = list;
            }
            i24 = i3;
            i11 = (i8 >> 16) & 255;
            if (i11 == 1) {
            }
            yy6 = yy63;
            i14 = i4;
            i13 = i3;
            if (i22 != i12) {
            }
            i15 = i6;
            c2 = ' ';
            yy62 = yy6;
            truncateAt = truncateAt2;
            a2 = a(i14, i9, truncateAt, i21, i15, i7, i24, i13, charSequence3);
            layout = a2.f;
            int i27222 = i14;
            if (Build.VERSION.SDK_INT >= 35 || dhVar2.C.getLetterSpacing() == 0.0f || ((i22 == 4 && i22 == 5) || layout.getEllipsisCount(0) <= 0)) {
            }
            int i28222 = a2.g;
            if (i22 != i16 || a2.a() <= k31.g(j2) || i17 <= 1) {
            }
            zgVar.a.C.c(yy62.a.c(), (((long) Float.floatToRawIntBits(zgVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(zgVar.d())) << c2), yy62.a.a());
            layout2 = zgVar.d.f;
            if (layout2.getText() instanceof Spanned) {
            }
            jq6Arr = null;
            if (jq6Arr != null) {
            }
            charSequence = zgVar.e;
            if (charSequence instanceof Spanned) {
            }
            zgVar.f = list;
        }
        i8 = i25;
        i9 = i5;
        i7 = i3;
        i10 = (i8 >> 8) & 255;
        if (i10 != 1) {
        }
        i24 = i3;
        i11 = (i8 >> 16) & 255;
        if (i11 == 1) {
        }
        yy6 = yy63;
        i14 = i4;
        i13 = i3;
        if (i22 != i12) {
        }
        i15 = i6;
        c2 = ' ';
        yy62 = yy6;
        truncateAt = truncateAt2;
        a2 = a(i14, i9, truncateAt, i21, i15, i7, i24, i13, charSequence3);
        layout = a2.f;
        int i272222 = i14;
        if (Build.VERSION.SDK_INT >= 35 || dhVar2.C.getLetterSpacing() == 0.0f || ((i22 == 4 && i22 == 5) || layout.getEllipsisCount(0) <= 0)) {
        }
        int i282222 = a2.g;
        if (i22 != i16 || a2.a() <= k31.g(j2) || i17 <= 1) {
        }
        zgVar.a.C.c(yy62.a.c(), (((long) Float.floatToRawIntBits(zgVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(zgVar.d())) << c2), yy62.a.a());
        layout2 = zgVar.d.f;
        if (layout2.getText() instanceof Spanned) {
        }
        jq6Arr = null;
        if (jq6Arr != null) {
        }
        charSequence = zgVar.e;
        if (charSequence instanceof Spanned) {
        }
        zgVar.f = list;
    }

    public final zf7 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        boolean z;
        qj5 qj5;
        float d2 = d();
        dh dhVar = this.a;
        zi ziVar = dhVar.C;
        int i8 = dhVar.H;
        jy3 jy3 = dhVar.E;
        tg7 tg7 = dhVar.x;
        ah ahVar = bh.a;
        dk5 dk5 = tg7.c;
        if (dk5 == null || (qj5 = dk5.b) == null) {
            z = false;
        } else {
            z = qj5.a;
        }
        return new zf7(charSequence, d2, ziVar, i, truncateAt, i8, z, i3, i5, i6, i7, i4, i2, jy3);
    }

    public final float b() {
        return (float) this.d.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    public final long c(ly5 ly5, int i, kj6 kj6) {
        boolean z;
        int[] iArr;
        si6 ax2;
        SegmentFinder segmentFinder;
        RectF s = o85.s(ly5);
        if (i != 0 && i == 1) {
            z = true;
        } else {
            z = false;
        }
        yg ygVar = new yg(0, kj6);
        zf7 zf7 = this.d;
        TextPaint textPaint = zf7.a;
        Layout layout = zf7.f;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            if (z) {
                segmentFinder = new jn(new k68(3, layout.getText(), zf7.l()));
            } else {
                jg.t();
                segmentFinder = jg.o(jg.n(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(s, segmentFinder, new kg(ygVar));
        } else {
            o9 c2 = zf7.c();
            if (z) {
                ax2 = new k68(3, layout.getText(), zf7.l());
            } else {
                CharSequence text = layout.getText();
                if (i2 >= 29) {
                    ax2 = new zw2(text, textPaint);
                } else {
                    ax2 = new ax2(text);
                }
            }
            si6 si6 = ax2;
            int lineForVertical = layout.getLineForVertical((int) s.top);
            if (s.top <= zf7.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < zf7.g) {
                int i3 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) s.bottom);
                if (lineForVertical2 != 0 || s.bottom >= zf7.i(0)) {
                    int n = z85.n(zf7, layout, c2, i3, s, si6, ygVar, true);
                    while (true) {
                        int i4 = i3;
                        if (n == -1 && i4 < lineForVertical2) {
                            i3 = i4 + 1;
                            n = z85.n(zf7, layout, c2, i3, s, si6, ygVar, true);
                        } else if (n != -1) {
                            int i5 = lineForVertical2;
                            int n2 = z85.n(zf7, layout, c2, i5, s, si6, ygVar, false);
                            while (n2 == -1 && i4 < i5) {
                                i5--;
                                n2 = z85.n(zf7, layout, c2, i5, s, si6, ygVar, false);
                            }
                            if (n2 != -1) {
                                iArr = new int[]{si6.e(n + 1), si6.f(n2 - 1)};
                            }
                        }
                    }
                    if (n != -1) {
                    }
                }
            }
            iArr = null;
        }
        if (iArr == null) {
            return lg7.b;
        }
        return i95.a(iArr[0], iArr[1]);
    }

    public final float d() {
        return (float) k31.h(this.c);
    }

    public final void e(qk0 qk0) {
        Canvas a2 = pd.a(qk0);
        zf7 zf7 = this.d;
        if (zf7.d) {
            a2.save();
            a2.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = zf7.h;
        if (a2.getClipBounds(zf7.p)) {
            if (i != 0) {
                a2.translate(0.0f, (float) i);
            }
            ThreadLocal threadLocal = dg7.a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new Canvas();
                threadLocal.set(obj);
            }
            jc7 jc7 = (jc7) obj;
            jc7.a = a2;
            try {
                zf7.f.draw(jc7);
                if (i != 0) {
                    a2.translate(0.0f, -1.0f * ((float) i));
                }
            } finally {
                jc7.a = null;
            }
        }
        if (zf7.d) {
            a2.restore();
        }
    }

    public final void f(qk0 qk0, long j, lq6 lq6, rd7 rd7, iz1 iz1) {
        zi ziVar = this.a.C;
        int i = ziVar.c;
        ziVar.d(j);
        ziVar.f(lq6);
        ziVar.g(rd7);
        ziVar.e(iz1);
        ziVar.b(3);
        e(qk0);
        ziVar.b(i);
    }

    public final void g(qk0 qk0, kc0 kc0, float f2, lq6 lq6, rd7 rd7, iz1 iz1) {
        zi ziVar = this.a.C;
        int i = ziVar.c;
        float d2 = d();
        float b2 = b();
        long floatToRawIntBits = (long) Float.floatToRawIntBits(d2);
        ziVar.c(kc0, (((long) Float.floatToRawIntBits(b2)) & 4294967295L) | (floatToRawIntBits << 32), f2);
        ziVar.f(lq6);
        ziVar.g(rd7);
        ziVar.e(iz1);
        ziVar.b(3);
        e(qk0);
        ziVar.b(i);
    }
}
