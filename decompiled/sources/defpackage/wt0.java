package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import cu.lestebang.utiletecsa.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: wt0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class wt0 {
    public static final ThreadLocal a = new ThreadLocal();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2 || next == 1) {
                if (next != 2) {
                    return b(resources, xmlResourceParser, asAttributeSet, theme);
                }
                throw new XmlPullParserException("No start tag found");
            }
            next = xmlResourceParser.next();
            break;
        } while (next == 1);
        if (next != 2) {
        }
    }

    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARNING: Unknown variable types count: 2 */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int depth;
        TypedArray typedArray;
        int i2;
        float f;
        float f2;
        int attributeCount;
        int i3;
        boolean z;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        float f3;
        float f4;
        int i8;
        float f5;
        TypedValue typedValue;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            boolean z2 = true;
            int depth2 = xmlPullParser.getDepth() + 1;
            int[][] iArr2 = new int[20][];
            int[] iArr3 = new int[20];
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int next = xmlPullParser.next();
                if (next == z2 || ((depth = xmlPullParser.getDepth()) < i && next == 3)) {
                    int[] iArr4 = new int[i10];
                    int[][] iArr5 = new int[i10][];
                    System.arraycopy(iArr3, 0, iArr4, 0, i10);
                    System.arraycopy(iArr2, 0, iArr5, 0, i10);
                } else if (next != 2 || depth > i || !xmlPullParser.getName().equals("item")) {
                    resources2 = resources;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    z2 = z2;
                    depth2 = i;
                    i9 = 0;
                } else {
                    int[] iArr6 = lv5.a;
                    if (theme2 == null) {
                        typedArray = resources2.obtainAttributes(attributeSet2, iArr6);
                    } else {
                        typedArray = theme2.obtainStyledAttributes(attributeSet2, iArr6, i9, i9);
                    }
                    int resourceId = typedArray.getResourceId(i9, -1);
                    if (resourceId != -1) {
                        ThreadLocal threadLocal = a;
                        TypedValue typedValue2 = (TypedValue) threadLocal.get();
                        if (typedValue2 == null) {
                            typedValue = new TypedValue();
                            threadLocal.set(typedValue);
                        } else {
                            typedValue = typedValue2;
                        }
                        resources2.getValue(resourceId, typedValue, z2);
                        int i11 = typedValue.type;
                        if (i11 < 28 || i11 > 31) {
                            try {
                                i2 = a(resources2, resources2.getXml(resourceId), theme2).getDefaultColor();
                            } catch (Exception unused) {
                                i2 = typedArray.getColor(i9, -65281);
                            }
                            if (!typedArray.hasValue(z2)) {
                                f = typedArray.getFloat(z2, 1.0f);
                            } else if (typedArray.hasValue(3)) {
                                f = typedArray.getFloat(3, 1.0f);
                            } else {
                                f = 1.0f;
                            }
                            ? r16 = z2;
                            if (Build.VERSION.SDK_INT < 31 || !typedArray.hasValue(2)) {
                                f2 = typedArray.getFloat(4, -1.0f);
                            } else {
                                f2 = typedArray.getFloat(2, -1.0f);
                            }
                            typedArray.recycle();
                            attributeCount = attributeSet2.getAttributeCount();
                            int[] iArr7 = new int[attributeCount];
                            i3 = i9;
                            int i12 = i3;
                            while (i3 < attributeCount) {
                                int attributeNameResource = attributeSet2.getAttributeNameResource(i3);
                                if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == R.attr.alpha || attributeNameResource == R.attr.lStar)) {
                                    int i13 = i12 + 1;
                                    if (!attributeSet2.getAttributeBooleanValue(i3, false)) {
                                        attributeNameResource = -attributeNameResource;
                                    }
                                    iArr7[i12] = attributeNameResource;
                                    i12 = i13;
                                }
                                i3++;
                                Resources resources3 = resources;
                            }
                            int[] trimStateSet = StateSet.trimStateSet(iArr7, i12);
                            float f6 = 100.0f;
                            if (f2 < 0.0f || f2 > 100.0f) {
                                z = false;
                            } else {
                                z = r16;
                            }
                            if (f == 1.0f || z) {
                                int K = gl0.K((int) ((((float) Color.alpha(i2)) * f) + 0.5f), 0, 255);
                                if (!z) {
                                    tj0 a2 = tj0.a(i2);
                                    float f7 = a2.a;
                                    float f8 = a2.b;
                                    v68 v68 = v68.k;
                                    if (((double) f8) < 1.0d || ((double) Math.round(f2)) <= 0.0d || ((double) Math.round(f2)) >= 100.0d) {
                                        iArr = trimStateSet;
                                        i4 = i;
                                        i7 = pv8.K(f2);
                                    } else {
                                        if (f7 < 0.0f) {
                                            f3 = 0.0f;
                                        } else {
                                            f3 = Math.min(360.0f, f7);
                                        }
                                        float f9 = 0.0f;
                                        float f10 = f8;
                                        boolean z3 = r16;
                                        tj0 tj0 = null;
                                        while (true) {
                                            if (Math.abs(f9 - f8) >= 0.4f) {
                                                float f11 = 1000.0f;
                                                float f12 = f6;
                                                float f13 = 0.0f;
                                                float f14 = 1000.0f;
                                                tj0 tj02 = null;
                                                while (true) {
                                                    if (Math.abs(f13 - f12) <= 0.01f) {
                                                        iArr = trimStateSet;
                                                        i4 = i;
                                                        f4 = f6;
                                                        break;
                                                    }
                                                    f4 = f6;
                                                    float f15 = ((f12 - f13) / 2.0f) + f13;
                                                    iArr = trimStateSet;
                                                    int d = tj0.b(f15, f10, f3).d(v68.k);
                                                    float L = pv8.L(Color.red(d));
                                                    float L2 = pv8.L(Color.green(d));
                                                    float L3 = pv8.L(Color.blue(d));
                                                    float[] fArr = pv8.d[r16];
                                                    float f16 = ((L3 * fArr[2]) + ((L2 * fArr[r16]) + (L * fArr[0]))) / f4;
                                                    if (f16 <= 0.008856452f) {
                                                        f5 = f16 * 903.2963f;
                                                        i8 = d;
                                                    } else {
                                                        i8 = d;
                                                        f5 = (((float) Math.cbrt((double) f16)) * 116.0f) - 16.0f;
                                                    }
                                                    float abs = Math.abs(f2 - f5);
                                                    if (abs < 0.2f) {
                                                        tj0 a3 = tj0.a(i8);
                                                        float f17 = abs;
                                                        tj0 b = tj0.b(a3.c, a3.b, f3);
                                                        float f18 = a3.d - b.d;
                                                        float f19 = a3.e - b.e;
                                                        float f20 = a3.f - b.f;
                                                        float f21 = (f20 * f20) + (f19 * f19) + (f18 * f18);
                                                        tj0 tj03 = a3;
                                                        i4 = i;
                                                        float pow = (float) (Math.pow(Math.sqrt((double) f21), 0.63d) * 1.41d);
                                                        if (pow <= 1.0f) {
                                                            f14 = pow;
                                                            f11 = f17;
                                                            tj02 = tj03;
                                                        }
                                                    } else {
                                                        i4 = i;
                                                    }
                                                    if (f11 == 0.0f && f14 == 0.0f) {
                                                        break;
                                                    }
                                                    if (f5 < f2) {
                                                        f13 = f15;
                                                    } else {
                                                        f12 = f15;
                                                    }
                                                    AttributeSet attributeSet3 = attributeSet;
                                                    Resources.Theme theme3 = theme;
                                                    f6 = f4;
                                                    trimStateSet = iArr;
                                                    i = i4;
                                                }
                                                tj0 tj04 = tj02;
                                                if (!z3) {
                                                    if (tj04 == null) {
                                                        f8 = f10;
                                                    } else {
                                                        tj0 = tj04;
                                                        f9 = f10;
                                                    }
                                                    f10 = ((f8 - f9) / 2.0f) + f9;
                                                    AttributeSet attributeSet4 = attributeSet;
                                                    Resources.Theme theme4 = theme;
                                                    f6 = f4;
                                                    trimStateSet = iArr;
                                                    i = i4;
                                                } else if (tj04 != null) {
                                                    i7 = tj04.d(v68);
                                                    break;
                                                } else {
                                                    f10 = ((f8 - f9) / 2.0f) + f9;
                                                    AttributeSet attributeSet5 = attributeSet;
                                                    Resources.Theme theme5 = theme;
                                                    f6 = f4;
                                                    trimStateSet = iArr;
                                                    i = i4;
                                                    z3 = false;
                                                }
                                            } else {
                                                iArr = trimStateSet;
                                                i4 = i;
                                                if (tj0 == null) {
                                                    i7 = pv8.K(f2);
                                                } else {
                                                    i7 = tj0.d(v68);
                                                }
                                            }
                                        }
                                    }
                                    i2 = i7;
                                } else {
                                    iArr = trimStateSet;
                                    i4 = i;
                                }
                                i2 = (16777215 & i2) | (K << 24);
                            } else {
                                iArr = trimStateSet;
                                i4 = i;
                            }
                            i5 = i10 + 1;
                            int i14 = 8;
                            if (i5 > iArr3.length) {
                                if (i10 <= 4) {
                                    i6 = 8;
                                } else {
                                    i6 = i10 * 2;
                                }
                                int[] iArr8 = new int[i6];
                                System.arraycopy(iArr3, 0, iArr8, 0, i10);
                                iArr3 = iArr8;
                            }
                            iArr3[i10] = i2;
                            if (i5 > iArr2.length) {
                                Class<?> componentType = iArr2.getClass().getComponentType();
                                if (i10 > 4) {
                                    i14 = i10 * 2;
                                }
                                ? r1 = (Object[]) Array.newInstance(componentType, i14);
                                System.arraycopy(iArr2, 0, r1, 0, i10);
                                iArr2 = r1;
                            }
                            iArr2[i10] = iArr;
                            iArr2 = iArr2;
                            attributeSet2 = attributeSet;
                            theme2 = theme;
                            i10 = i5;
                            z2 = r16;
                            depth2 = i4;
                            i9 = 0;
                            resources2 = resources;
                        }
                    }
                    i2 = typedArray.getColor(i9, -65281);
                    if (!typedArray.hasValue(z2)) {
                    }
                    ? r162 = z2;
                    if (Build.VERSION.SDK_INT < 31 || !typedArray.hasValue(2)) {
                    }
                    typedArray.recycle();
                    attributeCount = attributeSet2.getAttributeCount();
                    int[] iArr72 = new int[attributeCount];
                    i3 = i9;
                    int i122 = i3;
                    while (i3 < attributeCount) {
                    }
                    int[] trimStateSet2 = StateSet.trimStateSet(iArr72, i122);
                    float f62 = 100.0f;
                    if (f2 < 0.0f || f2 > 100.0f) {
                    }
                    if (f == 1.0f) {
                    }
                    int K2 = gl0.K((int) ((((float) Color.alpha(i2)) * f) + 0.5f), 0, 255);
                    if (!z) {
                    }
                    i2 = (16777215 & i2) | (K2 << 24);
                    i5 = i10 + 1;
                    int i142 = 8;
                    if (i5 > iArr3.length) {
                    }
                    iArr3[i10] = i2;
                    if (i5 > iArr2.length) {
                    }
                    iArr2[i10] = iArr;
                    iArr2 = iArr2;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i10 = i5;
                    z2 = r162;
                    depth2 = i4;
                    i9 = 0;
                    resources2 = resources;
                }
            }
            int[] iArr42 = new int[i10];
            int[][] iArr52 = new int[i10][];
            System.arraycopy(iArr3, 0, iArr42, 0, i10);
            System.arraycopy(iArr2, 0, iArr52, 0, i10);
            return new ColorStateList(iArr52, iArr42);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }
}
