package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: dh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dh implements lc5 {
    public final dl2 A;
    public final tp1 B;
    public final zi C;
    public final CharSequence D;
    public final jy3 E;
    public cf4 F;
    public final boolean G;
    public final int H;
    public final String w;
    public final tg7 x;
    public final List y;
    public final List z;

    /* JADX WARNING: type inference failed for: r4v3, types: [android.text.TextPaint, android.graphics.Paint, zi] */
    /* JADX WARNING: type inference failed for: r9v9, types: [android.text.Spannable] */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03a9, code lost:
        if ((r6.b.c & 1095216660480L) == 0) goto L_0x089b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        r7 = ((defpackage.xa4) r10.w.get(0)).a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        if (r7 == 1) goto L_0x0076;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02cb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0555  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x07b2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0837  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0861 A[LOOP:9: B:397:0x085f->B:398:0x0861, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0872  */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ed  */
    public dh(String str, tg7 tg7, List list, List list2, dl2 dl2, tp1 tp1) {
        boolean z2;
        int i;
        ch chVar;
        jg7 jg7;
        int i2;
        int i3;
        int size;
        int i4;
        Object obj;
        boolean z3;
        yl2 yl2;
        ya4 ya4;
        lf7 lf7;
        String str2;
        long j;
        long b;
        boolean z4;
        am2 am2;
        ea7 ea7;
        boolean z5;
        long j2;
        h60 h60;
        boolean z6;
        long j3;
        boolean z7;
        boolean z8;
        yy6 yy6;
        boolean z9;
        CharSequence charSequence;
        SpannableString spannableString;
        long j4;
        boolean z10;
        int i5;
        mf7 mf7;
        nc5 nc5;
        ArrayList arrayList;
        int size2;
        int i6;
        yy6 yy62;
        ea7 ea72;
        yy6 yy63;
        int size3;
        int i7;
        boolean z11;
        mf7 mf72;
        int size4;
        int i8;
        int i9;
        tp1 tp12;
        Object obj2;
        int i10;
        List list3;
        int i11;
        tp1 tp13;
        int i12;
        boolean z12;
        boolean z13;
        yy6 yy64;
        int i13;
        ArrayList arrayList2;
        int i14;
        float f;
        float f2;
        int i15;
        boolean z14;
        boolean z15;
        qj5 qj5;
        k32 k32;
        int i16;
        qj5 qj52;
        ul ulVar;
        long j5;
        h60 h602;
        am2 am22;
        int i17;
        zl2 zl2;
        int i18;
        wq7 b2;
        Typeface typeface;
        tg7 tg72 = tg7;
        List list4 = list;
        tp1 tp14 = tp1;
        this.w = str;
        this.x = tg72;
        this.y = list4;
        this.z = list2;
        this.A = dl2;
        this.B = tp14;
        float b3 = tp14.b();
        ? textPaint = new TextPaint(1);
        textPaint.density = b3;
        textPaint.b = rd7.b;
        textPaint.c = 3;
        textPaint.d = lq6.d;
        this.C = textPaint;
        boolean c = c35.c(tg72);
        yy6 yy65 = tg72.a;
        nc5 nc52 = tg72.b;
        if (!c) {
            z2 = false;
        } else {
            ji8 ji8 = a32.a;
            ji8 ji82 = a32.a;
            a37 a37 = (a37) ji82.x;
            if (a37 == null) {
                if (w22.d()) {
                    a37 = ji82.x();
                    ji82.x = a37;
                } else {
                    a37 = rc9.n;
                }
            }
            z2 = ((Boolean) a37.getValue()).booleanValue();
        }
        this.G = z2;
        int i19 = nc52.b;
        ya4 ya42 = yy65.k;
        if (i19 != 4) {
            if (i19 != 5) {
                if (i19 == 1) {
                    i = 0;
                } else if (i19 == 2) {
                    i = 1;
                } else if (i19 == 3 || i19 == 0) {
                    Locale locale = (ya42 == null || locale == null) ? Locale.getDefault() : locale;
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                } else {
                    h.s("Invalid TextDirection.");
                    throw null;
                }
                this.H = i;
                chVar = new ch(0, this);
                jg7 = nc52.i;
                jg7 = jg7 == null ? jg7.c : jg7;
                if (jg7.b) {
                    i2 = textPaint.getFlags() | 128;
                } else {
                    i2 = textPaint.getFlags() & -129;
                }
                textPaint.setFlags(i2);
                i3 = jg7.a;
                if (i3 == 1) {
                    textPaint.setFlags(textPaint.getFlags() | 64);
                    textPaint.setHinting(0);
                } else if (i3 == 2) {
                    textPaint.getFlags();
                    textPaint.setHinting(1);
                } else if (i3 == 3) {
                    textPaint.getFlags();
                    textPaint.setHinting(0);
                } else {
                    textPaint.getFlags();
                }
                size = list4.size();
                i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list4.get(i4);
                    if (((ul) obj).a instanceof yy6) {
                        break;
                    }
                    i4++;
                }
                if (obj != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                long j6 = yy65.b;
                am2 am23 = yy65.c;
                yl2 = yy65.d;
                String str3 = yy65.g;
                ya4 = yy65.k;
                kf7 kf7 = yy65.a;
                lf7 = yy65.j;
                str2 = str3;
                j = yy65.h;
                long j7 = j6;
                b = wg7.b(j7);
                z4 = z3;
                am2 = am23;
                if (xg7.a(b, 4294967296L)) {
                    textPaint.setTextSize(tp14.C0(j7));
                } else if (xg7.a(b, 8589934592L)) {
                    textPaint.setTextSize(wg7.c(j7) * textPaint.getTextSize());
                }
                ea7 = yy65.f;
                if (ea7 != null && yl2 == null && am2 == null) {
                    z5 = z4;
                } else {
                    if (am2 == null) {
                        am22 = am2.y;
                    } else {
                        am22 = am2;
                    }
                    if (yl2 != null) {
                        i17 = yl2.a;
                    } else {
                        i17 = 0;
                    }
                    zl2 = yy65.e;
                    if (zl2 != null) {
                        i18 = zl2.a;
                    } else {
                        i18 = 65535;
                    }
                    dh dhVar = (dh) chVar.x;
                    z5 = z4;
                    b2 = ((el2) dhVar.A).b(ea7, am22, i17, i18);
                    if (!(b2 instanceof wq7)) {
                        cf4 cf4 = new cf4(b2, dhVar.F);
                        dhVar.F = cf4;
                        Object obj3 = cf4.z;
                        obj3.getClass();
                        typeface = (Typeface) obj3;
                    } else {
                        Object obj4 = b2.w;
                        obj4.getClass();
                        typeface = (Typeface) obj4;
                    }
                    textPaint.setTypeface(typeface);
                }
                if (ya4 != null) {
                    ya4 ya43 = ya4.y;
                    if (!ya4.equals(kj5.a.G())) {
                        ArrayList arrayList3 = new ArrayList(et0.e0(ya4, 10));
                        for (xa4 xa4 : ya4.w) {
                            arrayList3.add(xa4.a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        textPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null) {
                    String str4 = str2;
                    if (!str4.equals("")) {
                        textPaint.setFontFeatureSettings(str4);
                    }
                }
                if (lf7 != null && !lf7.equals(lf7.c)) {
                    textPaint.setTextScaleX(textPaint.getTextScaleX() * lf7.a);
                    textPaint.setTextSkewX(textPaint.getTextSkewX() + lf7.b);
                }
                textPaint.d(kf7.b());
                textPaint.c(kf7.c(), 9205357640488583168L, kf7.a());
                textPaint.f(yy65.n);
                textPaint.g(yy65.m);
                textPaint.e(yy65.p);
                if (xg7.a(wg7.b(j), 4294967296L) && wg7.c(j) != 0.0f) {
                    float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
                    float C0 = tp14.C0(j);
                    if (textScaleX != 0.0f) {
                        textPaint.setLetterSpacing(C0 / textScaleX);
                    }
                } else if (xg7.a(wg7.b(j), 8589934592L)) {
                    textPaint.setLetterSpacing(wg7.c(j));
                }
                j2 = yy65.l;
                h60 = yy65.i;
                if (!z5 || !xg7.a(wg7.b(j), 4294967296L) || wg7.c(j) == 0.0f) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                j3 = jt0.g;
                if (jt0.c(j2, j3) || jt0.c(j2, jt0.f)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (h60 == null || Float.compare(h60.a, 0.0f) == 0) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (!z6 || z7 || z8) {
                    long j8 = !z6 ? wg7.c : j;
                    if (z7) {
                        j5 = j2;
                    } else {
                        j5 = j3;
                    }
                    if (z8) {
                        h602 = h60;
                    } else {
                        h602 = null;
                    }
                    yy6 = new yy6(0, 0, (am2) null, (yl2) null, (zl2) null, (ea7) null, (String) null, j8, h602, (lf7) null, (ya4) null, j5, (rd7) null, (lq6) null, 63103);
                } else {
                    yy6 = null;
                }
                List list5 = this.y;
                if (yy6 != null) {
                    int size5 = list5.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size5);
                    for (int i20 = 0; i20 < size5; i20++) {
                        if (i20 == 0) {
                            ulVar = new ul(0, this.w.length(), yy6);
                        } else {
                            ulVar = (ul) this.y.get(i20 - 1);
                        }
                        arrayList4.add(ulVar);
                    }
                    list5 = arrayList4;
                }
                String str5 = this.w;
                float textSize = this.C.getTextSize();
                tg7 tg73 = this.x;
                List list6 = this.z;
                tp1 tp15 = this.B;
                z9 = this.G;
                ah ahVar = bh.a;
                if (!z9 || !w22.d()) {
                    charSequence = str5;
                } else {
                    dk5 dk5 = tg73.c;
                    if (dk5 == null || (qj52 = dk5.b) == null) {
                        k32 = null;
                    } else {
                        k32 = new k32(qj52.b);
                    }
                    if (k32 != null && k32.a == 2) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    CharSequence g = w22.a().g(0, str5.length(), i16, str5);
                    g.getClass();
                    charSequence = g;
                }
                CharSequence charSequence2 = (list5.isEmpty() && list6.isEmpty() && sg3.e(tg73.b.d, mf7.c)) ? charSequence : charSequence2;
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                yy6 yy66 = tg73.a;
                nc5 nc53 = tg73.b;
                if (sg3.e(yy66.m, rd7.c)) {
                    j4 = 0;
                    spannableString.setSpan(bh.a, 0, str5.length(), 33);
                } else {
                    j4 = 0;
                }
                dk5 dk52 = tg73.c;
                if (dk52 == null || (qj5 = dk52.b) == null) {
                    z10 = false;
                } else {
                    z10 = qj5.a;
                }
                if (!z10 || nc53.f != null) {
                    m64 m64 = nc53.f;
                    m64 = m64 == null ? m64.d : m64;
                    float E2 = t75.E(nc53.c, textSize, tp15);
                    if (!Float.isNaN(E2)) {
                        if (spannableString.length() == 0 || d57.J0(spannableString) == 10) {
                            i15 = spannableString.length() + 1;
                        } else {
                            i15 = spannableString.length();
                        }
                        int i21 = i15;
                        int i22 = m64.b;
                        if ((i22 & 1) > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i22 & 16) > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        i5 = 0;
                        spannableString.setSpan(new n64(E2, i21, z14, z15, m64.a, m64.c), 0, spannableString.length(), 33);
                        mf7 = nc53.d;
                        if (mf7 == null) {
                            int i23 = i5;
                            long j9 = mf7.a;
                            long j10 = mf7.b;
                            nc5 nc54 = nc53;
                            if ((wg7.a(j9, ya5.k(i23)) && wg7.a(j10, ya5.k(i23))) || (j9 & 1095216660480L) == j4 || (j10 & 1095216660480L) == j4) {
                                nc5 = nc54;
                            } else {
                                long b4 = wg7.b(j9);
                                float f3 = textSize;
                                nc5 = nc54;
                                if (xg7.a(b4, 4294967296L)) {
                                    f = tp15.C0(j9);
                                } else if (xg7.a(b4, 8589934592L)) {
                                    f = wg7.c(j9) * f3;
                                } else {
                                    f = 0.0f;
                                }
                                long b5 = wg7.b(j10);
                                if (xg7.a(b5, 4294967296L)) {
                                    f2 = tp15.C0(j10);
                                } else if (xg7.a(b5, 8589934592L)) {
                                    f2 = wg7.c(j10) * f3;
                                } else {
                                    f2 = 0.0f;
                                }
                                spannableString.setSpan(new LeadingMarginSpan.Standard((int) ((float) Math.ceil((double) f)), (int) ((float) Math.ceil((double) f2))), 0, spannableString.length(), 33);
                            }
                        } else {
                            nc5 = nc53;
                        }
                        arrayList = new ArrayList(list5.size());
                        size2 = list5.size();
                        for (i6 = 0; i6 < size2; i6++) {
                            ul ulVar2 = (ul) list5.get(i6);
                            Object obj5 = ulVar2.a;
                            if (obj5 instanceof yy6) {
                                yy6 yy67 = (yy6) obj5;
                                if (yy67.f != null || yy67.d != null || yy67.c != null || ((yy6) obj5).e != null) {
                                    arrayList.add(ulVar2);
                                }
                            }
                        }
                        yy62 = tg73.a;
                        ea72 = yy62.f;
                        if (ea72 == null && yy62.d == null && yy62.c == null && yy62.e == null) {
                            yy63 = null;
                        } else {
                            yy63 = new yy6(0, 0, yy62.c, yy62.d, yy62.e, ea72, (String) null, 0, (h60) null, (lf7) null, (ya4) null, 0, (rd7) null, (lq6) null, 65475);
                        }
                        gc5 gc5 = new gc5(22, (Object) spannableString, (Object) chVar);
                        if (arrayList.size() <= 1) {
                            int size6 = arrayList.size();
                            int i24 = size6 * 2;
                            int[] iArr = new int[i24];
                            int size7 = arrayList.size();
                            for (int i25 = 0; i25 < size7; i25++) {
                                ul ulVar3 = (ul) arrayList.get(i25);
                                iArr[i25] = ulVar3.b;
                                iArr[i25 + size6] = ulVar3.c;
                            }
                            if (i24 > 1) {
                                Arrays.sort(iArr);
                            }
                            if (i24 != 0) {
                                int i26 = iArr[0];
                                int i27 = 0;
                                while (i27 < i24) {
                                    int i28 = iArr[i27];
                                    if (i28 == i26) {
                                        arrayList2 = arrayList;
                                        yy64 = yy63;
                                        i14 = i27;
                                        i13 = i24;
                                    } else {
                                        int size8 = arrayList.size();
                                        yy64 = yy63;
                                        int i29 = 0;
                                        while (i29 < size8) {
                                            ArrayList arrayList5 = arrayList;
                                            ul ulVar4 = (ul) arrayList.get(i29);
                                            int i30 = i27;
                                            int i31 = ulVar4.b;
                                            int i32 = i24;
                                            int i33 = ulVar4.c;
                                            if (i31 != i33 && wl.b(i26, i28, i31, i33)) {
                                                yy6 yy68 = (yy6) ulVar4.a;
                                                yy63 = yy63 != null ? yy63.c(yy68) : yy68;
                                            }
                                            i29++;
                                            i27 = i30;
                                            arrayList = arrayList5;
                                            i24 = i32;
                                        }
                                        arrayList2 = arrayList;
                                        i14 = i27;
                                        i13 = i24;
                                        if (yy63 != null) {
                                            gc5.u(yy63, Integer.valueOf(i26), Integer.valueOf(i28));
                                        }
                                        i26 = i28;
                                    }
                                    i27 = i14 + 1;
                                    yy63 = yy64;
                                    arrayList = arrayList2;
                                    i24 = i13;
                                }
                            } else {
                                kj6.i("Array is empty.");
                                throw null;
                            }
                        } else if (!arrayList.isEmpty()) {
                            yy6 yy69 = (yy6) ((ul) arrayList.get(0)).a;
                            gc5.u(yy63 != null ? yy63.c(yy69) : yy69, Integer.valueOf(((ul) arrayList.get(0)).b), Integer.valueOf(((ul) arrayList.get(0)).c));
                        }
                        size3 = list5.size();
                        i7 = 0;
                        z11 = false;
                        while (i7 < size3) {
                            ul ulVar5 = (ul) list5.get(i7);
                            Object obj6 = ulVar5.a;
                            if (obj6 instanceof yy6) {
                                int i34 = ulVar5.b;
                                int i35 = ulVar5.c;
                                if (i34 >= 0 && i34 < spannableString.length() && i35 > i34 && i35 <= spannableString.length()) {
                                    yy6 yy610 = (yy6) obj6;
                                    long j11 = yy610.h;
                                    h60 h603 = yy610.i;
                                    kf7 kf72 = yy610.a;
                                    if (h603 != null) {
                                        i10 = size3;
                                        i11 = i7;
                                        spannableString.setSpan(new i60(0, h603.a), i34, i35, 33);
                                    } else {
                                        i10 = size3;
                                        i11 = i7;
                                    }
                                    t75.G(spannableString, kf72.b(), i34, i35);
                                    kc0 c2 = kf72.c();
                                    float a = kf72.a();
                                    if (c2 != null) {
                                        if (c2 instanceof ky6) {
                                            t75.G(spannableString, ((ky6) c2).a, i34, i35);
                                        } else {
                                            spannableString.setSpan(new jq6((iq6) c2, a), i34, i35, 33);
                                        }
                                    }
                                    rd7 rd7 = yy610.m;
                                    if (rd7 != null) {
                                        int i36 = rd7.a;
                                        if ((i36 | 1) == i36) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if ((i36 | 2) == i36) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        sd7 sd7 = new sd7(z12, z13);
                                        i12 = 33;
                                        spannableString.setSpan(sd7, i34, i35, 33);
                                    } else {
                                        i12 = 33;
                                    }
                                    long j12 = j11;
                                    int i37 = i12;
                                    t75.H(spannableString, yy610.b, tp15, i34, i35);
                                    String str6 = yy610.g;
                                    if (str6 != null) {
                                        spannableString.setSpan(new gl2(0, str6), i34, i35, i37);
                                    }
                                    lf7 lf72 = yy610.j;
                                    if (lf72 != null) {
                                        spannableString.setSpan(new ScaleXSpan(lf72.a), i34, i35, i37);
                                        spannableString.setSpan(new i60(1, lf72.b), i34, i35, i37);
                                    }
                                    t75.I(spannableString, yy610.k, i34, i35);
                                    tp13 = tp15;
                                    long j13 = yy610.l;
                                    if (j13 != 16) {
                                        spannableString.setSpan(new BackgroundColorSpan(uq3.M(j13)), i34, i35, i37);
                                    }
                                    lq6 lq6 = yy610.n;
                                    if (lq6 != null) {
                                        long j14 = lq6.b;
                                        list3 = list5;
                                        int M = uq3.M(lq6.a);
                                        int i38 = i34;
                                        float intBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32));
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j14 & 4294967295L));
                                        float f4 = lq6.c;
                                        oq6 oq6 = new oq6(intBitsToFloat, intBitsToFloat2, f4 == 0.0f ? Float.MIN_VALUE : f4, M);
                                        i34 = i38;
                                        i37 = 33;
                                        spannableString.setSpan(oq6, i34, i35, 33);
                                    } else {
                                        list3 = list5;
                                    }
                                    iz1 iz1 = yy610.p;
                                    if (iz1 != null) {
                                        spannableString.setSpan(new jz1(iz1), i34, i35, i37);
                                    }
                                    if (xg7.a(wg7.b(j12), 4294967296L) || xg7.a(wg7.b(j12), 8589934592L)) {
                                        z11 = true;
                                        i7 = i11 + 1;
                                        list5 = list3;
                                        tp15 = tp13;
                                        size3 = i10;
                                    } else {
                                        i7 = i11 + 1;
                                        list5 = list3;
                                        tp15 = tp13;
                                        size3 = i10;
                                    }
                                }
                            }
                            i10 = size3;
                            i11 = i7;
                            list3 = list5;
                            tp13 = tp15;
                            i7 = i11 + 1;
                            list5 = list3;
                            tp15 = tp13;
                            size3 = i10;
                        }
                        List list7 = list5;
                        tp1 tp16 = tp15;
                        if (z11) {
                            int size9 = list7.size();
                            int i39 = 0;
                            while (i39 < size9) {
                                List list8 = list7;
                                ul ulVar6 = (ul) list8.get(i39);
                                rl rlVar = (rl) ulVar6.a;
                                if (rlVar instanceof yy6) {
                                    int i40 = ulVar6.b;
                                    int i41 = ulVar6.c;
                                    if (i40 >= 0 && i40 < spannableString.length() && i41 > i40 && i41 <= spannableString.length()) {
                                        long j15 = ((yy6) rlVar).h;
                                        long b6 = wg7.b(j15);
                                        tp1 tp17 = tp16;
                                        i9 = size9;
                                        if (xg7.a(b6, 4294967296L)) {
                                            tp12 = tp17;
                                            obj2 = new z44(tp12.C0(j15));
                                        } else {
                                            tp12 = tp17;
                                            long j16 = j15;
                                            if (xg7.a(b6, 8589934592L)) {
                                                obj2 = new y44(wg7.c(j16));
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        if (obj2 != null) {
                                            spannableString.setSpan(obj2, i40, i41, 33);
                                        }
                                        i39++;
                                        tp16 = tp12;
                                        size9 = i9;
                                        list7 = list8;
                                    }
                                }
                                i9 = size9;
                                tp12 = tp16;
                                i39++;
                                tp16 = tp12;
                                size9 = i9;
                                list7 = list8;
                            }
                        }
                        List list9 = list7;
                        tp1 tp18 = tp16;
                        mf72 = nc5.d;
                        if (mf72 != null) {
                            long j17 = mf72.a;
                            long b7 = wg7.b(j17);
                            if (xg7.a(b7, 4294967296L)) {
                                tp18.C0(j17);
                            } else if (xg7.a(b7, 8589934592L)) {
                                wg7.c(j17);
                            }
                        }
                        size4 = list9.size();
                        for (i8 = 0; i8 < size4; i8++) {
                            Object obj7 = ((ul) list9.get(i8)).a;
                        }
                        charSequence2 = spannableString;
                        if (list6.size() > 0) {
                            ul ulVar7 = (ul) list6.get(0);
                            if (ulVar7.a == null) {
                                for (Object obj8 : spannableString.getSpans(ulVar7.b, ulVar7.c, uq7.class)) {
                                    spannableString.removeSpan((uq7) obj8);
                                }
                                throw null;
                            }
                            ku4.a();
                            throw null;
                        }
                        this.D = charSequence2;
                        this.E = new jy3(charSequence2, this.C, this.H);
                        return;
                    }
                } else {
                    float E3 = t75.E(nc53.c, textSize, tp15);
                    if (!Float.isNaN(E3)) {
                        spannableString.setSpan(new i64(E3), 0, spannableString.length(), 33);
                    }
                }
                i5 = 0;
                mf7 = nc53.d;
                if (mf7 == null) {
                }
                arrayList = new ArrayList(list5.size());
                size2 = list5.size();
                while (i6 < size2) {
                }
                yy62 = tg73.a;
                ea72 = yy62.f;
                if (ea72 == null || yy62.d == null || yy62.c == null || yy62.e == null) {
                }
                gc5 gc52 = new gc5(22, (Object) spannableString, (Object) chVar);
                if (arrayList.size() <= 1) {
                }
                size3 = list5.size();
                i7 = 0;
                z11 = false;
                while (i7 < size3) {
                }
                List list72 = list5;
                tp1 tp162 = tp15;
                if (z11) {
                }
                List list92 = list72;
                tp1 tp182 = tp162;
                mf72 = nc5.d;
                if (mf72 != null) {
                }
                size4 = list92.size();
                while (i8 < size4) {
                }
                charSequence2 = spannableString;
                if (list6.size() > 0) {
                }
                this.D = charSequence2;
                this.E = new jy3(charSequence2, this.C, this.H);
                return;
            }
            i = 3;
            this.H = i;
            chVar = new ch(0, this);
            jg7 = nc52.i;
            if (jg7 == null) {
            }
            if (jg7.b) {
            }
            textPaint.setFlags(i2);
            i3 = jg7.a;
            if (i3 == 1) {
            }
            size = list4.size();
            i4 = 0;
            while (true) {
                if (i4 >= size) {
                }
                i4++;
            }
            if (obj != null) {
            }
            long j62 = yy65.b;
            am2 am232 = yy65.c;
            yl2 = yy65.d;
            String str32 = yy65.g;
            ya4 = yy65.k;
            kf7 kf73 = yy65.a;
            lf7 = yy65.j;
            str2 = str32;
            j = yy65.h;
            long j72 = j62;
            b = wg7.b(j72);
            z4 = z3;
            am2 = am232;
            if (xg7.a(b, 4294967296L)) {
            }
            ea7 = yy65.f;
            if (ea7 != null) {
            }
            if (am2 == null) {
            }
            if (yl2 != null) {
            }
            zl2 = yy65.e;
            if (zl2 != null) {
            }
            dh dhVar2 = (dh) chVar.x;
            z5 = z4;
            b2 = ((el2) dhVar2.A).b(ea7, am22, i17, i18);
            if (!(b2 instanceof wq7)) {
            }
            textPaint.setTypeface(typeface);
            if (ya4 != null) {
            }
            if (str2 != null) {
            }
            textPaint.setTextScaleX(textPaint.getTextScaleX() * lf7.a);
            textPaint.setTextSkewX(textPaint.getTextSkewX() + lf7.b);
            textPaint.d(kf73.b());
            textPaint.c(kf73.c(), 9205357640488583168L, kf73.a());
            textPaint.f(yy65.n);
            textPaint.g(yy65.m);
            textPaint.e(yy65.p);
            if (xg7.a(wg7.b(j), 4294967296L) || wg7.c(j) != 0.0f) {
            }
            j2 = yy65.l;
            h60 = yy65.i;
            if (!z5 || !xg7.a(wg7.b(j), 4294967296L) || wg7.c(j) == 0.0f) {
            }
            j3 = jt0.g;
            if (jt0.c(j2, j3) || jt0.c(j2, jt0.f)) {
            }
            if (h60 == null || Float.compare(h60.a, 0.0f) == 0) {
            }
            if (!z6) {
            }
            long j82 = !z6 ? wg7.c : j;
            if (z7) {
            }
            if (z8) {
            }
            yy6 = new yy6(0, 0, (am2) null, (yl2) null, (zl2) null, (ea7) null, (String) null, j82, h602, (lf7) null, (ya4) null, j5, (rd7) null, (lq6) null, 63103);
            List list52 = this.y;
            if (yy6 != null) {
            }
            String str52 = this.w;
            float textSize2 = this.C.getTextSize();
            tg7 tg732 = this.x;
            List list62 = this.z;
            tp1 tp152 = this.B;
            z9 = this.G;
            ah ahVar2 = bh.a;
            if (!z9 || !w22.d()) {
            }
        }
        i = 2;
        this.H = i;
        chVar = new ch(0, this);
        jg7 = nc52.i;
        if (jg7 == null) {
        }
        if (jg7.b) {
        }
        textPaint.setFlags(i2);
        i3 = jg7.a;
        if (i3 == 1) {
        }
        size = list4.size();
        i4 = 0;
        while (true) {
            if (i4 >= size) {
            }
            i4++;
        }
        if (obj != null) {
        }
        long j622 = yy65.b;
        am2 am2322 = yy65.c;
        yl2 = yy65.d;
        String str322 = yy65.g;
        ya4 = yy65.k;
        kf7 kf732 = yy65.a;
        lf7 = yy65.j;
        str2 = str322;
        j = yy65.h;
        long j722 = j622;
        b = wg7.b(j722);
        z4 = z3;
        am2 = am2322;
        if (xg7.a(b, 4294967296L)) {
        }
        ea7 = yy65.f;
        if (ea7 != null) {
        }
        if (am2 == null) {
        }
        if (yl2 != null) {
        }
        zl2 = yy65.e;
        if (zl2 != null) {
        }
        dh dhVar22 = (dh) chVar.x;
        z5 = z4;
        b2 = ((el2) dhVar22.A).b(ea7, am22, i17, i18);
        if (!(b2 instanceof wq7)) {
        }
        textPaint.setTypeface(typeface);
        if (ya4 != null) {
        }
        if (str2 != null) {
        }
        textPaint.setTextScaleX(textPaint.getTextScaleX() * lf7.a);
        textPaint.setTextSkewX(textPaint.getTextSkewX() + lf7.b);
        textPaint.d(kf732.b());
        textPaint.c(kf732.c(), 9205357640488583168L, kf732.a());
        textPaint.f(yy65.n);
        textPaint.g(yy65.m);
        textPaint.e(yy65.p);
        if (xg7.a(wg7.b(j), 4294967296L) || wg7.c(j) != 0.0f) {
        }
        j2 = yy65.l;
        h60 = yy65.i;
        if (!z5 || !xg7.a(wg7.b(j), 4294967296L) || wg7.c(j) == 0.0f) {
        }
        j3 = jt0.g;
        if (jt0.c(j2, j3) || jt0.c(j2, jt0.f)) {
        }
        if (h60 == null || Float.compare(h60.a, 0.0f) == 0) {
        }
        if (!z6) {
        }
        long j822 = !z6 ? wg7.c : j;
        if (z7) {
        }
        if (z8) {
        }
        yy6 = new yy6(0, 0, (am2) null, (yl2) null, (zl2) null, (ea7) null, (String) null, j822, h602, (lf7) null, (ya4) null, j5, (rd7) null, (lq6) null, 63103);
        List list522 = this.y;
        if (yy6 != null) {
        }
        String str522 = this.w;
        float textSize22 = this.C.getTextSize();
        tg7 tg7322 = this.x;
        List list622 = this.z;
        tp1 tp1522 = this.B;
        z9 = this.G;
        ah ahVar22 = bh.a;
        if (!z9 || !w22.d()) {
        }
    }

    public final boolean b() {
        boolean z2;
        cf4 cf4 = this.F;
        if (cf4 != null) {
            z2 = cf4.u();
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        if (!this.G && c35.c(this.x)) {
            ji8 ji8 = a32.a;
            ji8 ji82 = a32.a;
            a37 a37 = (a37) ji82.x;
            if (a37 == null) {
                if (w22.d()) {
                    a37 = ji82.x();
                    ji82.x = a37;
                } else {
                    a37 = rc9.n;
                }
            }
            if (((Boolean) a37.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final float d() {
        jy3 jy3 = this.E;
        float f = jy3.e;
        TextPaint textPaint = jy3.b;
        if (!Float.isNaN(f)) {
            return jy3.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = jy3.a;
        lineInstance.setText(new go0(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, su0.f);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new pe3(i, next, 1));
            } else {
                re3 re3 = (re3) priorityQueue.peek();
                if (re3 != null && re3.x - re3.w < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new pe3(i, next, 1));
                }
            }
            i = next;
        }
        float f2 = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (it.hasNext()) {
                re3 re32 = (re3) it.next();
                f2 = Layout.getDesiredWidth(jy3.b(), re32.w, re32.x, textPaint);
                while (it.hasNext()) {
                    re3 re33 = (re3) it.next();
                    f2 = Math.max(f2, Layout.getDesiredWidth(jy3.b(), re33.w, re33.x, textPaint));
                }
            } else {
                rf2.c();
                return 0.0f;
            }
        }
        jy3.e = f2;
        return f2;
    }

    public final float e() {
        return this.E.c();
    }
}
