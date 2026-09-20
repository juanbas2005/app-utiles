package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ig  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ig {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00dc, code lost:
        if (r9 == null) goto L_0x00de;
     */
    public ig(re3 re3, uq3 uq3) {
        Object obj;
        this.a = 8;
        ig x = uq3.x();
        int i = re3.w;
        if (i < 0) {
            bc3.c("negative nearestRange.first");
        }
        int min = Math.min(re3.x, x.b - 1);
        if (min < i) {
            hp4 hp4 = v25.a;
            hp4.getClass();
            this.c = hp4;
            this.d = new Object[0];
            this.b = 0;
            return;
        }
        int i2 = (min - i) + 1;
        this.d = new Object[i2];
        this.b = i;
        hp4 hp42 = new hp4(i2);
        eq4 eq4 = (eq4) x.c;
        if (i < 0 || i >= x.b) {
            int i3 = x.b;
            bc3.e("Index " + i + ", size " + i3);
        }
        if (min < 0 || min >= x.b) {
            int i4 = x.b;
            bc3.e("Index " + min + ", size " + i4);
        }
        if (min < i) {
            bc3.a("toIndex (" + min + ") should be not smaller than fromIndex (" + i + ")");
        }
        int m = t49.m(i, eq4);
        int i5 = ((hg3) eq4.w[m]).a;
        while (i5 <= min) {
            hg3 hg3 = (hg3) eq4.w[m];
            vr2 key = hg3.c.getKey();
            int i6 = hg3.a;
            int max = Math.max(i, i6);
            int min2 = Math.min(min, (hg3.b + i6) - 1);
            if (max <= min2) {
                while (true) {
                    if (key != null) {
                        obj = key.y(Integer.valueOf(max - i6));
                    }
                    obj = new mm1(max);
                    hp42.g(max, obj);
                    ((Object[]) this.d)[max - this.b] = obj;
                    if (max == min2) {
                        break;
                    }
                    max++;
                }
            }
            i5 += hg3.b;
            m++;
        }
        this.c = hp42;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0208, code lost:
        if (r10 == 1) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x020a, code lost:
        if (r10 == 2) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020c, code lost:
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0219, code lost:
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x021c, code lost:
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021f, code lost:
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0223, code lost:
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.x, (float[]) r0.y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0235, code lost:
        if (r25 <= 0.0f) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0237, code lost:
        r20 = (int[]) r0.x;
        r21 = (float[]) r0.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0246, code lost:
        if (r10 == 1) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0249, code lost:
        if (r10 == 2) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x024b, code lost:
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0256, code lost:
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0259, code lost:
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x025c, code lost:
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0268, code lost:
        return new defpackage.ig(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0270, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01da, code lost:
        if (r13.size() <= 0) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01dc, code lost:
        r0 = new defpackage.hv2(r13, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e2, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e3, code lost:
        if (r0 == null) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e7, code lost:
        if (r20 == false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e9, code lost:
        r0 = new defpackage.hv2(r6, r5, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ef, code lost:
        r0 = new defpackage.hv2(r6, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f5, code lost:
        if (r11 == 1) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f8, code lost:
        if (r11 == 2) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01fa, code lost:
        r16 = (int[]) r0.x;
        r17 = (float[]) r0.y;
     */
    public static ig d(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i2;
        int i3;
        boolean z;
        int i4;
        float f7;
        int i5;
        float f8;
        int i6;
        float f9;
        float f10;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (name.equals("gradient")) {
                String name2 = xml.getName();
                if (name2.equals("gradient")) {
                    TypedArray v = p25.v(resources2, theme2, asAttributeSet, lv5.e);
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) {
                        f = v.getFloat(8, 0.0f);
                    } else {
                        f = 0.0f;
                    }
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null) {
                        f2 = v.getFloat(9, 0.0f);
                    } else {
                        f2 = 0.0f;
                    }
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null) {
                        f3 = v.getFloat(10, 0.0f);
                    } else {
                        f3 = 0.0f;
                    }
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null) {
                        f4 = v.getFloat(11, 0.0f);
                    } else {
                        f4 = 0.0f;
                    }
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) {
                        f5 = v.getFloat(3, 0.0f);
                    } else {
                        f5 = 0.0f;
                    }
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null) {
                        f6 = v.getFloat(4, 0.0f);
                    } else {
                        f6 = 0.0f;
                    }
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) {
                        i2 = v.getInt(2, 0);
                    } else {
                        i2 = 0;
                    }
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null) {
                        i3 = v.getColor(0, 0);
                    } else {
                        i3 = 0;
                    }
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) {
                        i4 = v.getColor(7, 0);
                    } else {
                        i4 = 0;
                    }
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
                        f7 = f;
                        i5 = v.getColor(1, 0);
                    } else {
                        f7 = f;
                        i5 = 0;
                    }
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
                        f8 = f2;
                        i6 = v.getInt(6, 0);
                    } else {
                        f8 = f2;
                        i6 = 0;
                    }
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null) {
                        f9 = v.getFloat(5, 0.0f);
                    } else {
                        f9 = 0.0f;
                    }
                    v.recycle();
                    int depth = xml.getDepth() + 1;
                    XmlResourceParser xmlResourceParser = xml;
                    ArrayList arrayList = new ArrayList(20);
                    float f11 = f9;
                    ArrayList arrayList2 = new ArrayList(20);
                    while (true) {
                        int next2 = xmlResourceParser.next();
                        float f12 = f3;
                        if (next2 == 1) {
                            f10 = f4;
                            break;
                        }
                        int depth2 = xmlResourceParser.getDepth();
                        f10 = f4;
                        if (depth2 < depth && next2 == 3) {
                            break;
                        }
                        if (next2 == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                            TypedArray v2 = p25.v(resources2, theme2, asAttributeSet, lv5.f);
                            boolean hasValue = v2.hasValue(0);
                            boolean hasValue2 = v2.hasValue(1);
                            if (!hasValue || !hasValue2) {
                            } else {
                                int color = v2.getColor(0, 0);
                                float f13 = v2.getFloat(1, 0.0f);
                                v2.recycle();
                                arrayList2.add(Integer.valueOf(color));
                                arrayList.add(Float.valueOf(f13));
                            }
                        }
                        f3 = f12;
                        f4 = f10;
                    }
                    throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
            } else if (name.equals("selector")) {
                ColorStateList b2 = wt0.b(resources2, xml, asAttributeSet, theme2);
                return new ig((Shader) null, b2, b2.getDefaultColor());
            } else {
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
        } else {
            throw new XmlPullParserException("No start tag found");
        }
    }

    public void a(int i, d24 d24) {
        if (i < 0) {
            bc3.a("size should be >=0");
        }
        if (i != 0) {
            hg3 hg3 = new hg3(this.b, i, d24);
            this.b += i;
            ((eq4) this.c).b(hg3);
        }
    }

    public void b() {
        w70 w70;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            sz1.a(drawable);
        }
        if (drawable != null && (w70 = (w70) this.d) != null) {
            yo.e(drawable, w70, imageView.getDrawableState());
        }
    }

    public n36 c(boolean z) {
        r93 r93;
        r93 r932;
        if (!z || (r932 = (r93) this.d) == null) {
            n36 a2 = n36.a(this.b, (Object[]) this.c, this);
            if (!z || (r93 = (r93) this.d) == null) {
                return a2;
            }
            throw r93.a();
        }
        throw r932.a();
    }

    public hg3 e(int i) {
        if (i < 0 || i >= this.b) {
            int i2 = this.b;
            bc3.e("Index " + i + ", size " + i2);
        }
        hg3 hg3 = (hg3) this.d;
        if (hg3 != null) {
            int i3 = hg3.a;
            if (i < hg3.b + i3 && i3 <= i) {
                return hg3;
            }
        }
        eq4 eq4 = (eq4) this.c;
        hg3 hg32 = (hg3) eq4.w[t49.m(i, eq4)];
        this.d = hg32;
        return hg32;
    }

    public int f(Object obj) {
        hp4 hp4 = (hp4) this.c;
        int d2 = hp4.d(obj);
        if (d2 >= 0) {
            return hp4.c[d2];
        }
        return -1;
    }

    public Object g(int i) {
        Object[] objArr = (Object[]) this.d;
        int i2 = i - this.b;
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public int h(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i8 = i6;
        int i9 = i7;
        int i10 = i & 33554431;
        long[] jArr = (long[]) this.c;
        int i11 = this.b;
        int i12 = i11 + 3;
        this.b = i12;
        int length = jArr.length;
        if (length <= i12) {
            int max = Math.max(length * 2, i12);
            this.c = Arrays.copyOf(jArr, max);
            this.d = Arrays.copyOf((long[]) this.d, max);
        }
        long[] jArr2 = (long[]) this.c;
        jArr2[i11] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i11 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        boolean z5 = false;
        int i13 = i8 & 33554431;
        jArr2[i11 + 2] = ((z3 ? 1 : 0) << 63) | ((z2 ? 1 : 0) << 62) | ((z ? 1 : 0) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i13) << 25) | ((long) (i & 33554431));
        if (i8 == -1) {
            return i11;
        }
        if (i9 != -4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            yb3.b("Inserted child " + i10 + " without valid parent index");
        }
        int i14 = i9 + 2;
        long j = jArr2[i14];
        if ((33554431 & ((int) j)) == i13) {
            z5 = true;
        }
        if (!z5) {
            yb3.b("Inserted child " + i10 + " without valid parent index or parent " + i13 + " not found");
        }
        int i15 = my5.b;
        jArr2[i14] = (-1151795604700004353L & j) | (((long) Math.min((i11 - i9) / 3, 1023)) << 50);
        return i11;
    }

    public boolean i() {
        ColorStateList colorStateList;
        if (((Shader) this.c) != null || (colorStateList = (ColorStateList) this.d) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public void j(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = qv5.f;
        cf4 w = cf4.w(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) w.y;
        e58.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) w.y, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable != null || (resourceId = typedArray.getResourceId(1, -1)) == -1 || (drawable = rc9.N(imageView.getContext(), resourceId)) == null)) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                sz1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(w.g(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(sz1.b(typedArray.getInt(3, -1), (PorterDuff.Mode) null));
            }
            w.A();
        } catch (Throwable th) {
            Throwable th2 = th;
            w.A();
            throw th2;
        }
    }

    public void k(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, i93.d(objArr.length, i));
        }
        ie1.y(obj, obj2);
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
    }

    public void l(n36 n36) {
        Set entrySet = n36.entrySet();
        int size = (entrySet.size() + this.b) * 2;
        Object[] objArr = (Object[]) this.c;
        if (size > objArr.length) {
            this.c = Arrays.copyOf(objArr, i93.d(objArr.length, size));
        }
        at7 o = ((k36) entrySet).o();
        while (true) {
            m93 m93 = (m93) o;
            if (m93.hasNext()) {
                Map.Entry entry = (Map.Entry) m93.next();
                k(entry.getKey(), entry.getValue());
            } else {
                return;
            }
        }
    }

    public void m(int i, int i2, int i3, long j) {
        int i4;
        char c2;
        int i5;
        long j2;
        char c3 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i6 = my5.b;
            long j3 = -1125899873288193L;
            int i7 = 33554431;
            char c4 = 25;
            long[] jArr = (long[]) this.c;
            long[] jArr2 = (long[]) this.d;
            int i8 = this.b;
            jArr2[0] = (j & -1125899873288193L) | (((long) (i & 33554431)) << 25);
            int i9 = 1;
            while (i9 > 0) {
                i9--;
                long j4 = jArr2[i9];
                int i10 = ((int) j4) & i7;
                int i11 = ((int) (j4 >> c4)) & i7;
                int i12 = ((int) (j4 >> c3)) & 1023;
                if (i12 == 1023) {
                    i4 = i8;
                } else {
                    i4 = (i12 * 3) + i11;
                }
                if (i11 >= 0) {
                    while (i11 < i8 - 2 && i11 <= i4) {
                        int i13 = i11 + 2;
                        long j5 = jArr[i13];
                        char c5 = c3;
                        int i14 = i7;
                        if ((((int) (j5 >> c4)) & i14) == i10) {
                            long j6 = jArr[i11];
                            int i15 = i11 + 1;
                            j2 = j3;
                            long j7 = jArr[i15];
                            c2 = c4;
                            i5 = i4;
                            jArr[i11] = (((long) (((int) j6) + i3)) & 4294967295L) | (((long) (((int) (j6 >> 32)) + i2)) << 32);
                            jArr[i15] = (((long) (((int) j7) + i3)) & 4294967295L) | (((long) (((int) (j7 >> 32)) + i2)) << 32);
                            jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                            if ((((int) (j5 >> c5)) & 1023) > 0) {
                                int i16 = my5.b;
                                jArr2[i9] = (j5 & j2) | (((long) ((i11 + 3) & i14)) << c2);
                                i9++;
                            }
                        } else {
                            j2 = j3;
                            c2 = c4;
                            i5 = i4;
                        }
                        i11 += 3;
                        i4 = i5;
                        c4 = c2;
                        i7 = i14;
                        c3 = c5;
                        j3 = j2;
                    }
                    c4 = c4;
                    i7 = i7;
                    c3 = c3;
                    j3 = j3;
                } else {
                    return;
                }
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                StringBuilder sb = new StringBuilder();
                if (((gu5) this.c) == gu5.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ig(String str, String[] strArr) {
        String str2;
        this.a = 6;
        boolean z = false;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.d = str2;
        this.c = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (length <= 23 ? true : z) {
            int i = 2;
            while (i <= 7 && !Log.isLoggable((String) this.c, i)) {
                i++;
            }
            this.b = i;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public ig(gu5 gu5, int i, String str) {
        this.a = 11;
        this.c = gu5;
        this.b = i;
        this.d = str;
    }

    public ig(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.a = 0;
        this.c = arrayList;
        this.b = i;
        this.d = motionEvent;
        if (arrayList.isEmpty()) {
            h.q("changes cannot be empty");
            throw null;
        }
    }

    public ig(ImageView imageView) {
        this.a = 1;
        this.b = 0;
        this.c = imageView;
    }

    public /* synthetic */ ig(int i, byte b2) {
        this.a = i;
    }

    public ig(Shader shader, ColorStateList colorStateList, int i) {
        this.a = 3;
        this.c = shader;
        this.d = colorStateList;
        this.b = i;
    }

    public ig() {
        this.a = 7;
        this.c = new eq4(new hg3[16]);
    }

    public ig(g58 g58) {
        this.a = 2;
        this.c = g58;
    }

    public ig(int i) {
        this.a = 5;
        this.c = new Object[(i * 2)];
        this.b = 0;
    }
}
