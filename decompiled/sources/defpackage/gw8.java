package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.zxing.NotFoundException;
import cu.lestebang.utiletecsa.R;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: gw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class gw8 {
    public static final float[][] b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] d = {95.047f, 100.0f, 108.883f};
    public static final double[][] e = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] f = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final fw0 g = new fw0(1209850788, new ww0(15), false);
    public static final fw0 h = new fw0(974577250, new ww0(16), false);
    public static final fw0 i = new fw0(-600569619, new xw0(7), false);
    public static final fw0 j = new fw0(1549246861, new xw0(8), false);
    public static final fw0 k = new fw0(122043798, new ww0(17), false);
    public static final String[] l = {"standard", "accelerate", "decelerate", "linear"};
    public static final int[] m = {R.attr.colorPrimary};
    public static final int[] n = {R.attr.colorPrimaryVariant};
    public static x83 o = null;
    public static final float p = 24.0f;
    public static final float q = 24.0f;
    public static x83 r;
    public static Context s;
    public final /* synthetic */ int a = 24;

    public static int A(float f2) {
        float f3;
        boolean z;
        float f4;
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            f3 = f5 * f5 * f5;
        } else {
            f3 = f2 / 903.2963f;
        }
        float f6 = f5 * f5 * f5;
        if (f6 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f6;
        } else {
            f4 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f6 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = d;
        return yt0.a((double) (f4 * fArr[0]), (double) (f3 * fArr[1]), (double) (f6 * fArr[2]));
    }

    public static final boolean B(int i2, String str) {
        char charAt = str.charAt(i2);
        if ('A' > charAt || charAt >= '[') {
            return false;
        }
        return true;
    }

    public static float C(int i2) {
        float pow;
        float f2 = ((float) i2) / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((double) ((f2 + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static final ml4 D(yt2 yt2, ml4 ml4) {
        if (ml4.b(ce.P)) {
            return ml4;
        }
        yt2.f0(1219399079);
        ml4 ml42 = (ml4) ml4.a(new z0(5, yt2), jl4.w);
        yt2.r(false);
        return ml42;
    }

    public static final ml4 E(yt2 yt2, ml4 ml4) {
        yt2.e0(439770924);
        ml4 D = D(yt2, ml4);
        yt2.r(false);
        return D;
    }

    public static TypedArray F(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        l(context, attributeSet, i2, i3);
        m(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static final ml4 G(ml4 ml4, vr2 vr2) {
        return ml4.d(new y35(vr2));
    }

    public static final boolean H(String str) {
        str.getClass();
        if (str.equals("GET") || str.equals("HEAD")) {
            return false;
        }
        return true;
    }

    public static TypedValue I(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean J(Context context, int i2, boolean z) {
        TypedValue I = I(context, i2);
        if (I == null || I.type != 18) {
            return z;
        }
        if (I.data != 0) {
            return true;
        }
        return false;
    }

    public static TypedValue K(Context context, String str, int i2) {
        TypedValue I = I(context, i2);
        if (I != null) {
            return I;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i2)}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d8  */
    public static k90 L(k90 k90, int i2, int i3, lg5 lg5) {
        k90 k902 = k90;
        int i4 = i2;
        int i5 = i3;
        lg5 lg52 = lg5;
        if (i4 <= 0 || i5 <= 0) {
            throw NotFoundException.y;
        }
        k90 k903 = new k90(i4, i5);
        int i6 = i4 * 2;
        float[] fArr = new float[i6];
        int i7 = 0;
        while (i7 < i5) {
            float f2 = ((float) i7) + 0.5f;
            for (int i8 = 0; i8 < i6; i8 += 2) {
                fArr[i8] = ((float) (i8 / 2)) + 0.5f;
                fArr[i8 + 1] = f2;
            }
            float f3 = lg52.a;
            float f4 = lg52.b;
            float f5 = lg52.c;
            float f6 = lg52.d;
            float f7 = lg52.e;
            float f8 = lg52.f;
            float f9 = lg52.g;
            float f10 = lg52.h;
            float f11 = lg52.i;
            int i9 = i6 - 1;
            for (int i10 = 0; i10 < i9; i10 += 2) {
                float f12 = fArr[i10];
                int i11 = i10 + 1;
                float f13 = fArr[i11];
                float f14 = (f8 * f13) + (f5 * f12) + f11;
                fArr[i10] = (((f6 * f13) + (f3 * f12)) + f9) / f14;
                fArr[i11] = (((f13 * f7) + (f12 * f4)) + f10) / f14;
            }
            int i12 = k902.w;
            int i13 = k902.x;
            boolean z = true;
            for (int i14 = 0; i14 < i9 && z; i14 += 2) {
                int i15 = (int) fArr[i14];
                int i16 = i14 + 1;
                int i17 = (int) fArr[i16];
                if (i15 < -1 || i15 > i12 || i17 < -1 || i17 > i13) {
                    throw NotFoundException.y;
                }
                if (i15 == -1) {
                    fArr[i14] = 0.0f;
                } else if (i15 == i12) {
                    fArr[i14] = (float) (i12 - 1);
                } else {
                    z = false;
                    if (i17 != -1) {
                        fArr[i16] = 0.0f;
                    } else if (i17 == i13) {
                        fArr[i16] = (float) (i13 - 1);
                    }
                    z = true;
                }
                z = true;
                if (i17 != -1) {
                }
                z = true;
            }
            boolean z2 = true;
            for (int i18 = i6 - 2; i18 >= 0 && z2; i18 -= 2) {
                int i19 = (int) fArr[i18];
                int i20 = i18 + 1;
                int i21 = (int) fArr[i20];
                if (i19 < -1 || i19 > i12 || i21 < -1 || i21 > i13) {
                    throw NotFoundException.y;
                }
                if (i19 == -1) {
                    fArr[i18] = 0.0f;
                } else if (i19 == i12) {
                    fArr[i18] = (float) (i12 - 1);
                } else {
                    z2 = false;
                    if (i21 != -1) {
                        fArr[i20] = 0.0f;
                    } else if (i21 == i13) {
                        fArr[i20] = (float) (i13 - 1);
                    }
                    z2 = true;
                }
                z2 = true;
                if (i21 != -1) {
                }
                z2 = true;
            }
            int i22 = 0;
            while (i22 < i6) {
                try {
                    if (k902.b((int) fArr[i22], (int) fArr[i22 + 1])) {
                        k903.f(i22 / 2, i7);
                    }
                    i22 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw NotFoundException.y;
                }
            }
            i7++;
            i5 = i3;
            lg52 = lg5;
        }
        return k903;
    }

    public static String M(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -2056817302:
                if (!str.equals("java.lang.Integer")) {
                    return null;
                }
                return "Int";
            case -2034166429:
                if (!str.equals("java.lang.Cloneable")) {
                    return null;
                }
                return "Cloneable";
            case -1979556166:
                if (!str.equals("java.lang.annotation.Annotation")) {
                    return null;
                }
                return "Annotation";
            case -1571515090:
                if (!str.equals("java.lang.Comparable")) {
                    return null;
                }
                return "Comparable";
            case -1383349348:
                if (!str.equals("java.util.Map")) {
                    return null;
                }
                return "Map";
            case -1383343454:
                if (!str.equals("java.util.Set")) {
                    return null;
                }
                return "Set";
            case -1325958191:
                if (!str.equals("double")) {
                    return null;
                }
                return "Double";
            case -1182275604:
                if (!str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -1062240117:
                if (!str.equals("java.lang.CharSequence")) {
                    return null;
                }
                return "CharSequence";
            case -688322466:
                if (!str.equals("java.util.Collection")) {
                    return null;
                }
                return "Collection";
            case -527879800:
                if (!str.equals("java.lang.Float")) {
                    return null;
                }
                return "Float";
            case -515992664:
                if (!str.equals("java.lang.Short")) {
                    return null;
                }
                return "Short";
            case -246476834:
                if (!str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -207262728:
                if (!str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -165139126:
                if (!str.equals("java.util.Map$Entry")) {
                    return null;
                }
                return "Entry";
            case 104431:
                if (!str.equals("int")) {
                    return null;
                }
                return "Int";
            case 3039496:
                if (!str.equals("byte")) {
                    return null;
                }
                return "Byte";
            case 3052374:
                if (!str.equals("char")) {
                    return null;
                }
                return "Char";
            case 3327612:
                if (!str.equals("long")) {
                    return null;
                }
                return "Long";
            case 64711720:
                if (!str.equals("boolean")) {
                    return null;
                }
                return "Boolean";
            case 65821278:
                if (!str.equals("java.util.List")) {
                    return null;
                }
                return "List";
            case 77230534:
                if (!str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 97526364:
                if (!str.equals("float")) {
                    return null;
                }
                return "Float";
            case 109413500:
                if (!str.equals("short")) {
                    return null;
                }
                return "Short";
            case 155276373:
                if (!str.equals("java.lang.Character")) {
                    return null;
                }
                return "Char";
            case 226173651:
                if (!str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 344809556:
                if (!str.equals("java.lang.Boolean")) {
                    return null;
                }
                return "Boolean";
            case 398507100:
                if (!str.equals("java.lang.Byte")) {
                    return null;
                }
                return "Byte";
            case 398585941:
                if (!str.equals("java.lang.Enum")) {
                    return null;
                }
                return "Enum";
            case 398795216:
                if (!str.equals("java.lang.Long")) {
                    return null;
                }
                return "Long";
            case 482629606:
                if (!str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 499831342:
                if (!str.equals("java.util.Iterator")) {
                    return null;
                }
                return "Iterator";
            case 577341676:
                if (!str.equals("java.util.ListIterator")) {
                    return null;
                }
                return "ListIterator";
            case 599019395:
                if (!str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 761287205:
                if (!str.equals("java.lang.Double")) {
                    return null;
                }
                return "Double";
            case 1052881309:
                if (!str.equals("java.lang.Number")) {
                    return null;
                }
                return "Number";
            case 1063877011:
                if (!str.equals("java.lang.Object")) {
                    return null;
                }
                return "Any";
            case 1195259493:
                if (!str.equals("java.lang.String")) {
                    return null;
                }
                return "String";
            case 1275614662:
                if (!str.equals("java.lang.Iterable")) {
                    return null;
                }
                return "Iterable";
            case 1383693018:
                if (!str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 1630335596:
                if (!str.equals("java.lang.Throwable")) {
                    return null;
                }
                return "Throwable";
            case 1877171123:
                if (!str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return null;
                }
                return "Companion";
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (!str.equals("kotlin.jvm.functions.Function10")) {
                            return null;
                        }
                        return "Function10";
                    case -1811142715:
                        if (!str.equals("kotlin.jvm.functions.Function11")) {
                            return null;
                        }
                        return "Function11";
                    case -1811142714:
                        if (!str.equals("kotlin.jvm.functions.Function12")) {
                            return null;
                        }
                        return "Function12";
                    case -1811142713:
                        if (!str.equals("kotlin.jvm.functions.Function13")) {
                            return null;
                        }
                        return "Function13";
                    case -1811142712:
                        if (!str.equals("kotlin.jvm.functions.Function14")) {
                            return null;
                        }
                        return "Function14";
                    case -1811142711:
                        if (!str.equals("kotlin.jvm.functions.Function15")) {
                            return null;
                        }
                        return "Function15";
                    case -1811142710:
                        if (!str.equals("kotlin.jvm.functions.Function16")) {
                            return null;
                        }
                        return "Function16";
                    case -1811142709:
                        if (!str.equals("kotlin.jvm.functions.Function17")) {
                            return null;
                        }
                        return "Function17";
                    case -1811142708:
                        if (!str.equals("kotlin.jvm.functions.Function18")) {
                            return null;
                        }
                        return "Function18";
                    case -1811142707:
                        if (!str.equals("kotlin.jvm.functions.Function19")) {
                            return null;
                        }
                        return "Function19";
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (!str.equals("kotlin.jvm.functions.Function20")) {
                                    return null;
                                }
                                return "Function20";
                            case -1811142684:
                                if (!str.equals("kotlin.jvm.functions.Function21")) {
                                    return null;
                                }
                                return "Function21";
                            case -1811142683:
                                if (!str.equals("kotlin.jvm.functions.Function22")) {
                                    return null;
                                }
                                return "Function22";
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (!str.equals("kotlin.jvm.functions.Function0")) {
                                            return null;
                                        }
                                        return "Function0";
                                    case 80123372:
                                        if (!str.equals("kotlin.jvm.functions.Function1")) {
                                            return null;
                                        }
                                        return "Function1";
                                    case 80123373:
                                        if (!str.equals("kotlin.jvm.functions.Function2")) {
                                            return null;
                                        }
                                        return "Function2";
                                    case 80123374:
                                        if (!str.equals("kotlin.jvm.functions.Function3")) {
                                            return null;
                                        }
                                        return "Function3";
                                    case 80123375:
                                        if (!str.equals("kotlin.jvm.functions.Function4")) {
                                            return null;
                                        }
                                        return "Function4";
                                    case 80123376:
                                        if (!str.equals("kotlin.jvm.functions.Function5")) {
                                            return null;
                                        }
                                        return "Function5";
                                    case 80123377:
                                        if (!str.equals("kotlin.jvm.functions.Function6")) {
                                            return null;
                                        }
                                        return "Function6";
                                    case 80123378:
                                        if (!str.equals("kotlin.jvm.functions.Function7")) {
                                            return null;
                                        }
                                        return "Function7";
                                    case 80123379:
                                        if (!str.equals("kotlin.jvm.functions.Function8")) {
                                            return null;
                                        }
                                        return "Function8";
                                    case 80123380:
                                        if (!str.equals("kotlin.jvm.functions.Function9")) {
                                            return null;
                                        }
                                        return "Function9";
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final String N(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String O(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return f21.h("CornerRadius.circular(", gr8.Y(Float.intBitsToFloat(i2)), ")");
        }
        return pb4.m("CornerRadius.elliptical(", gr8.Y(Float.intBitsToFloat(i2)), ", ", gr8.Y(Float.intBitsToFloat(i3)), ")");
    }

    public static final ml4 P(ml4 ml4, mg3 mg3) {
        return ml4.d(new og3(mg3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0107  */
    public static final void a(sr2 sr2, ml4 ml4, boolean z, pq6 pq6, xd0 xd0, ce0 ce0, ua0 ua0, la5 la5, hs2 hs2, yt2 yt2, int i2, int i3) {
        int i4;
        jl4 jl4;
        int i5;
        boolean z2;
        pq6 pq62;
        xd0 xd02;
        ce0 ce02;
        int i6;
        ua0 ua02;
        int i7;
        la5 la52;
        boolean z3;
        la5 la53;
        ua0 ua03;
        ce0 ce03;
        xd0 xd03;
        pq6 pq63;
        boolean z4;
        ml4 ml42;
        yx5 v;
        int i8;
        la5 la54;
        ce0 ce04;
        boolean z5;
        pq6 pq64;
        ml4 ml43;
        long j2;
        long j3;
        pq6 pq65;
        xd0 xd04;
        ce0 ce05;
        ap4 ap4;
        d63 d63;
        il ilVar;
        float f2;
        float f3;
        ap4 ap42;
        boolean z6;
        uj ujVar;
        ce0 ce06;
        la5 la55;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        yt2 yt22 = yt2;
        int i19 = i2;
        int i20 = i3;
        yt22.g0(-1310015664);
        if ((i19 & 6) == 0) {
            if (yt22.i(sr2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i4 = i18 | i19;
        } else {
            sr2 sr22 = sr2;
            i4 = i19;
        }
        int i21 = i20 & 2;
        if (i21 != 0) {
            i4 |= 48;
        } else if ((i19 & 48) == 0) {
            jl4 = ml4;
            if (yt22.g(jl4)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i4 |= i17;
            i5 = i20 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i19 & 384) == 0) {
                z2 = z;
                if (yt22.h(z2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i4 |= i16;
                if ((i19 & 3072) == 0) {
                    if ((i20 & 8) == 0) {
                        pq62 = pq6;
                        if (yt22.g(pq62)) {
                            i15 = 2048;
                            i4 |= i15;
                        }
                    } else {
                        pq62 = pq6;
                    }
                    i15 = 1024;
                    i4 |= i15;
                } else {
                    pq62 = pq6;
                }
                if ((i19 & 24576) == 0) {
                    if ((i20 & 16) == 0) {
                        xd02 = xd0;
                        if (yt22.g(xd02)) {
                            i14 = 16384;
                            i4 |= i14;
                        }
                    } else {
                        xd02 = xd0;
                    }
                    i14 = 8192;
                    i4 |= i14;
                } else {
                    xd02 = xd0;
                }
                if ((196608 & i19) == 0) {
                    if ((i20 & 32) == 0) {
                        ce02 = ce0;
                        if (yt22.g(ce02)) {
                            i13 = 131072;
                            i4 |= i13;
                        }
                    } else {
                        ce02 = ce0;
                    }
                    i13 = 65536;
                    i4 |= i13;
                } else {
                    ce02 = ce0;
                }
                i6 = i20 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((1572864 & i19) == 0) {
                    ua02 = ua0;
                    if (yt22.g(ua02)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i4 |= i12;
                    i7 = i20 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                        la52 = la5;
                    } else {
                        la52 = la5;
                        if ((i19 & 12582912) == 0) {
                            if (yt22.g(la52)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i4 |= i11;
                        }
                    }
                    if ((i20 & 256) == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (yt22.g((Object) null)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                        i4 |= i10;
                    }
                    hs2 hs22 = hs2;
                    if ((i2 & 805306368) == 0) {
                        if (yt22.i(hs22)) {
                            i9 = 536870912;
                        } else {
                            i9 = 268435456;
                        }
                        i4 |= i9;
                    }
                    boolean z7 = true;
                    if ((i4 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!yt22.V(i4 & 1, z3)) {
                        yt22.a0();
                        if ((i2 & 1) == 0 || yt22.C()) {
                            if (i21 != 0) {
                                jl4 = jl4.w;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 8) != 0) {
                                pa5 pa5 = yd0.a;
                                i4 &= -7169;
                                pq62 = hr6.a(kl8.a, yt22);
                            }
                            if ((i3 & 16) != 0) {
                                pa5 pa52 = yd0.a;
                                i4 &= -57345;
                                xd02 = yd0.b(((zg4) yt22.k(ch4.b)).a);
                            }
                            if ((i3 & 32) != 0) {
                                pa5 pa53 = yd0.a;
                                ce06 = new ce0(ie1.H);
                                i4 &= -458753;
                            } else {
                                ce06 = ce02;
                            }
                            if (i6 != 0) {
                                ua02 = null;
                            }
                            if (i7 != 0) {
                                la55 = yd0.a;
                            } else {
                                la55 = la52;
                            }
                            la54 = la55;
                            i8 = i4;
                            ce04 = ce06;
                            ml43 = jl4;
                            z5 = z2;
                            pq64 = pq62;
                        } else {
                            yt22.Y();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            i8 = i4;
                            ml43 = jl4;
                            z5 = z2;
                            pq64 = pq62;
                            ce04 = ce02;
                            la54 = la52;
                        }
                        yt22.s();
                        yt22.e0(1691726283);
                        Object Q = yt22.Q();
                        d63 d632 = ay0.a;
                        if (Q == d632) {
                            Q = b81.e(yt22);
                        }
                        ap4 ap43 = (ap4) Q;
                        yt22.r(false);
                        if (z5) {
                            j2 = xd02.a;
                        } else {
                            j2 = xd02.c;
                        }
                        long j4 = j2;
                        if (z5) {
                            j3 = xd02.b;
                        } else {
                            j3 = xd02.d;
                        }
                        long j5 = j3;
                        if (ce04 == null) {
                            yt22.e0(1691909926);
                            yt22.r(false);
                            pq65 = pq64;
                            d63 = d632;
                            ce05 = ce04;
                            xd04 = xd02;
                            ilVar = null;
                            ap4 = ap43;
                        } else {
                            yt22.e0(-499611589);
                            int i22 = ((i8 >> 6) & 14) | ((i8 >> 9) & 896);
                            Object Q2 = yt22.Q();
                            if (Q2 == d632) {
                                Q2 = new yx6();
                                yt22.o0(Q2);
                            }
                            yx6 yx6 = (yx6) Q2;
                            boolean g2 = yt22.g(ap43);
                            Object Q3 = yt22.Q();
                            if (g2 || Q3 == d632) {
                                Q3 = new ae0(ap43, yx6, (f61) null, 0);
                                yt22.o0(Q3);
                            }
                            t49.h((gs2) Q3, yt22, ap43);
                            df3 df3 = (df3) dt0.H0(yx6);
                            if (z5 && !(df3 instanceof eo5) && (df3 instanceof r23)) {
                                f3 = ce04.a;
                            } else {
                                f3 = 0.0f;
                            }
                            Object Q4 = yt22.Q();
                            if (Q4 == d632) {
                                pq65 = pq64;
                                ap42 = ap43;
                                xd04 = xd02;
                                Q4 = new uj(new lx1(f3), we.x, (Object) null, 12);
                                yt22.o0(Q4);
                            } else {
                                pq65 = pq64;
                                ap42 = ap43;
                                xd04 = xd02;
                            }
                            uj ujVar2 = (uj) Q4;
                            lx1 lx1 = new lx1(f3);
                            boolean i23 = yt22.i(ujVar2) | yt22.d(f3);
                            if ((((i22 & 14) ^ 6) <= 4 || !yt22.h(z5)) && (i22 & 6) != 4) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            boolean z8 = i23 | z6;
                            if ((((i22 & 896) ^ 384) <= 256 || !yt22.g(ce04)) && (i22 & 384) != 256) {
                                z7 = false;
                            }
                            boolean i24 = z8 | z7 | yt22.i(df3);
                            Object Q5 = yt22.Q();
                            if (i24 || Q5 == d632) {
                                d63 = d632;
                                ujVar = ujVar2;
                                ap4 = ap42;
                                Q5 = new be0(ujVar, f3, z5, ce04, df3, (f61) null, 0);
                                ce05 = ce04;
                                yt22.o0(Q5);
                            } else {
                                ap4 = ap42;
                                d63 = d632;
                                ce05 = ce04;
                                ujVar = ujVar2;
                            }
                            t49.h((gs2) Q5, yt22, lx1);
                            ilVar = ujVar.c;
                            yt22.r(false);
                        }
                        if (ilVar != null) {
                            f2 = ((lx1) ilVar.x.getValue()).w;
                        } else {
                            f2 = 0.0f;
                        }
                        Object Q6 = yt22.Q();
                        if (Q6 == d63) {
                            Q6 = new j5(18);
                            yt22.o0(Q6);
                        }
                        la5 la56 = la54;
                        long j6 = j5;
                        boolean z9 = z5;
                        ua0 ua04 = ua02;
                        pq6 pq66 = pq65;
                        ml4 ml44 = ml43;
                        sr2 sr23 = sr2;
                        s87.c(sr23, ck6.a(ml43, false, (vr2) Q6), z9, pq66, j4, j6, 0.0f, f2, ua04, ap4, su0.J(-535639973, new ff(j6, (Object) la56, (Object) hs2, 1), yt22), yt22, (i8 & 8078) | (234881024 & (i8 << 6)), 64);
                        pq63 = pq66;
                        z4 = z9;
                        ua03 = ua04;
                        ce03 = ce05;
                        la53 = la56;
                        ml42 = ml44;
                        xd03 = xd04;
                    } else {
                        yt2.Y();
                        la53 = la52;
                        ml42 = jl4;
                        z4 = z2;
                        pq63 = pq62;
                        xd03 = xd02;
                        ce03 = ce02;
                        ua03 = ua02;
                    }
                    v = yt2.v();
                    if (v == null) {
                        v.d = new he0(sr2, ml42, z4, pq63, xd03, ce03, ua03, la53, hs2, i2, i3);
                        return;
                    }
                    return;
                }
                ua02 = ua0;
                i7 = i20 & 128;
                if (i7 == 0) {
                }
                if ((i20 & 256) == 0) {
                }
                hs2 hs222 = hs2;
                if ((i2 & 805306368) == 0) {
                }
                boolean z72 = true;
                if ((i4 & 306783379) == 306783378) {
                }
                if (!yt22.V(i4 & 1, z3)) {
                }
                v = yt2.v();
                if (v == null) {
                }
            }
            z2 = z;
            if ((i19 & 3072) == 0) {
            }
            if ((i19 & 24576) == 0) {
            }
            if ((196608 & i19) == 0) {
            }
            i6 = i20 & 64;
            if (i6 != 0) {
            }
            ua02 = ua0;
            i7 = i20 & 128;
            if (i7 == 0) {
            }
            if ((i20 & 256) == 0) {
            }
            hs2 hs2222 = hs2;
            if ((i2 & 805306368) == 0) {
            }
            boolean z722 = true;
            if ((i4 & 306783379) == 306783378) {
            }
            if (!yt22.V(i4 & 1, z3)) {
            }
            v = yt2.v();
            if (v == null) {
            }
        }
        jl4 = ml4;
        i5 = i20 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i19 & 3072) == 0) {
        }
        if ((i19 & 24576) == 0) {
        }
        if ((196608 & i19) == 0) {
        }
        i6 = i20 & 64;
        if (i6 != 0) {
        }
        ua02 = ua0;
        i7 = i20 & 128;
        if (i7 == 0) {
        }
        if ((i20 & 256) == 0) {
        }
        hs2 hs22222 = hs2;
        if ((i2 & 805306368) == 0) {
        }
        boolean z7222 = true;
        if ((i4 & 306783379) == 306783378) {
        }
        if (!yt22.V(i4 & 1, z3)) {
        }
        v = yt2.v();
        if (v == null) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fd  */
    public static final void b(sr2 sr2, ml4 ml4, boolean z, pq6 pq6, xd0 xd0, ua0 ua0, la5 la5, fw0 fw0, yt2 yt2, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        pq6 pq62;
        xd0 xd02;
        ua0 ua02;
        int i6;
        pa5 pa5;
        int i7;
        fw0 fw02;
        boolean z3;
        la5 la52;
        ua0 ua03;
        xd0 xd03;
        pq6 pq63;
        boolean z4;
        ml4 ml42;
        yx5 v;
        ml4 ml43;
        pq6 pq64;
        xd0 xd04;
        int i8;
        pq6 pq65;
        boolean z5;
        xd0 xd05;
        int i9;
        long j2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        yt2 yt22 = yt2;
        int i18 = i2;
        int i19 = i3;
        rt0 rt0 = su0.j;
        yt22.g0(399974542);
        if ((i18 & 6) == 0) {
            if (yt22.i(sr2)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i4 = i17 | i18;
        } else {
            sr2 sr22 = sr2;
            i4 = i18;
        }
        int i20 = i19 & 2;
        if (i20 != 0) {
            i4 |= 48;
        } else if ((i18 & 48) == 0) {
            if (yt22.g(ml4)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i4 |= i16;
            i5 = i19 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i18 & 384) == 0) {
                z2 = z;
                if (yt22.h(z2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i4 |= i15;
                if ((i18 & 3072) == 0) {
                    if ((i19 & 8) == 0) {
                        pq62 = pq6;
                        if (yt22.g(pq62)) {
                            i14 = 2048;
                            i4 |= i14;
                        }
                    } else {
                        pq62 = pq6;
                    }
                    i14 = 1024;
                    i4 |= i14;
                } else {
                    pq62 = pq6;
                }
                if ((i18 & 24576) == 0) {
                    if ((i19 & 16) == 0) {
                        xd02 = xd0;
                        if (yt22.g(xd02)) {
                            i13 = 16384;
                            i4 |= i13;
                        }
                    } else {
                        xd02 = xd0;
                    }
                    i13 = 8192;
                    i4 |= i13;
                } else {
                    xd02 = xd0;
                }
                int i21 = i4 | 196608;
                if ((1572864 & i18) == 0) {
                    if ((i19 & 64) == 0) {
                        ua02 = ua0;
                        if (yt22.g(ua02)) {
                            i12 = 1048576;
                            i21 |= i12;
                        }
                    } else {
                        ua02 = ua0;
                    }
                    i12 = 524288;
                    i21 |= i12;
                } else {
                    ua02 = ua0;
                }
                i6 = i19 & 128;
                if (i6 != 0) {
                    i21 |= 12582912;
                } else if ((12582912 & i18) == 0) {
                    pa5 = la5;
                    if (yt22.g(pa5)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i21 |= i11;
                    i7 = i21 | 100663296;
                    if ((805306368 & i18) != 0) {
                        fw02 = fw0;
                        if (yt22.i(fw02)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i7 |= i10;
                    } else {
                        fw02 = fw0;
                    }
                    int i22 = i20;
                    if ((i7 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!yt22.V(i7 & 1, z3)) {
                        yt22.a0();
                        if ((i18 & 1) == 0 || yt22.C()) {
                            if (i22 != 0) {
                                ml43 = jl4.w;
                            } else {
                                ml43 = ml4;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i19 & 8) != 0) {
                                pa5 pa52 = yd0.a;
                                pq64 = hr6.a(kl8.a, yt22);
                                i7 &= -7169;
                            } else {
                                pq64 = pq62;
                            }
                            if ((i19 & 16) != 0) {
                                pa5 pa53 = yd0.a;
                                xd04 = yd0.c(((zg4) yt22.k(ch4.b)).a);
                                i7 &= -57345;
                            } else {
                                xd04 = xd02;
                            }
                            if ((i19 & 64) != 0) {
                                pa5 pa54 = yd0.a;
                                float f2 = kl8.c;
                                if (z2) {
                                    yt22.e0(-112362814);
                                    long e2 = st0.e(rt0, yt22);
                                    yt22.r(false);
                                    i9 = -3670017;
                                    j2 = e2;
                                } else {
                                    yt22.e0(-112275208);
                                    i9 = -3670017;
                                    j2 = jt0.b(0.1f, st0.e(rt0, yt22));
                                    yt22.r(false);
                                }
                                i7 &= i9;
                                ua02 = uq3.a(f2, j2);
                            }
                            if (i6 != 0) {
                                pa5 = yd0.a;
                            }
                            i8 = i7;
                            pq65 = pq64;
                            z5 = z2;
                            xd05 = xd04;
                        } else {
                            yt22.Y();
                            if ((i19 & 8) != 0) {
                                i7 &= -7169;
                            }
                            if ((i19 & 16) != 0) {
                                i7 &= -57345;
                            }
                            if ((i19 & 64) != 0) {
                                i7 &= -3670017;
                            }
                            ml43 = ml4;
                            i8 = i7;
                            z5 = z2;
                            pq65 = pq62;
                            xd05 = xd02;
                        }
                        ua03 = ua02;
                        la52 = pa5;
                        yt22.s();
                        a(sr2, ml43, z5, pq65, xd05, (ce0) null, ua03, la52, fw02, yt22, i8 & 2147483646, 0);
                        xd03 = xd05;
                        pq63 = pq65;
                        z4 = z5;
                        ml42 = ml43;
                    } else {
                        yt2.Y();
                        ml42 = ml4;
                        z4 = z2;
                        pq63 = pq62;
                        xd03 = xd02;
                        ua03 = ua02;
                        la52 = pa5;
                    }
                    v = yt2.v();
                    if (v == null) {
                        v.d = new ee0(sr2, ml42, z4, pq63, xd03, ua03, la52, fw0, i18, i19);
                        return;
                    }
                    return;
                }
                pa5 = la5;
                i7 = i21 | 100663296;
                if ((805306368 & i18) != 0) {
                }
                int i222 = i20;
                if ((i7 & 306783379) == 306783378) {
                }
                if (!yt22.V(i7 & 1, z3)) {
                }
                v = yt2.v();
                if (v == null) {
                }
            }
            z2 = z;
            if ((i18 & 3072) == 0) {
            }
            if ((i18 & 24576) == 0) {
            }
            int i212 = i4 | 196608;
            if ((1572864 & i18) == 0) {
            }
            i6 = i19 & 128;
            if (i6 != 0) {
            }
            pa5 = la5;
            i7 = i212 | 100663296;
            if ((805306368 & i18) != 0) {
            }
            int i2222 = i20;
            if ((i7 & 306783379) == 306783378) {
            }
            if (!yt22.V(i7 & 1, z3)) {
            }
            v = yt2.v();
            if (v == null) {
            }
        }
        ml4 ml44 = ml4;
        i5 = i19 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i18 & 3072) == 0) {
        }
        if ((i18 & 24576) == 0) {
        }
        int i2122 = i4 | 196608;
        if ((1572864 & i18) == 0) {
        }
        i6 = i19 & 128;
        if (i6 != 0) {
        }
        pa5 = la5;
        i7 = i2122 | 100663296;
        if ((805306368 & i18) != 0) {
        }
        int i22222 = i20;
        if ((i7 & 306783379) == 306783378) {
        }
        if (!yt22.V(i7 & 1, z3)) {
        }
        v = yt2.v();
        if (v == null) {
        }
    }

    public static final void c(String str, ml4 ml4, sr2 sr2, sr2 sr22, long j2, yt2 yt2, int i2) {
        int i3;
        boolean z;
        ml4 ml42;
        ml4 ml43;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        int i6;
        int i7;
        String str2 = str;
        sr2 sr23 = sr2;
        sr2 sr24 = sr22;
        long j3 = j2;
        yt2 yt22 = yt2;
        int i8 = i2;
        yt22.g0(-2078815310);
        if ((i8 & 6) == 0) {
            if (yt22.g(str2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i8;
        } else {
            i3 = i8;
        }
        int i9 = i3 | 48;
        if ((i8 & 384) == 0) {
            if (yt22.i(sr23)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i9 |= i6;
        }
        if ((i8 & 3072) == 0) {
            if (yt22.i(sr24)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i9 |= i5;
        }
        if ((i8 & 24576) == 0) {
            if (yt22.f(j3)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i9 |= i4;
        }
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i9 & 1, z)) {
            yt22.a0();
            int i10 = i8 & 1;
            ml4 ml44 = jl4.w;
            if (i10 == 0 || yt22.C()) {
                ml43 = ml44;
            } else {
                yt22.Y();
                ml43 = ml4;
            }
            yt22.s();
            if (j3 != 16) {
                yt22.e0(-853219337);
                d63 d63 = ay0.a;
                if (sr23 != null) {
                    yt22.e0(-853120974);
                    int i11 = i9 & 896;
                    if (i11 == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Object Q = yt22.Q();
                    if (z4 || Q == d63) {
                        Q = new wf(4, sr23);
                        yt22.o0(Q);
                    }
                    ml4 a2 = d97.a(ml44, sr23, (PointerInputEventHandler) Q);
                    if ((i9 & 14) == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i11 == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z7 = z5 | z6;
                    Object Q2 = yt22.Q();
                    if (z7 || Q2 == d63) {
                        Q2 = new w34(23, str2, sr23);
                        yt22.o0(Q2);
                    }
                    ml44 = ck6.a(a2, true, (vr2) Q2);
                    yt22.r(false);
                } else {
                    yt22.e0(-852623672);
                    yt22.r(false);
                }
                ml4 d2 = ml43.d(yu6.c).d(ml44);
                if ((((57344 & i9) ^ 24576) <= 16384 || !yt22.f(j3)) && (i9 & 24576) != 16384) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if ((i9 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z8 = z3 | z2;
                Object Q3 = yt22.Q();
                if (z8 || Q3 == d63) {
                    Q3 = new vz5(1, j3, sr24);
                    yt22.o0(Q3);
                }
                tf4.c(d2, (vr2) Q3, yt22, 0);
                yt22.r(false);
            } else {
                yt22.e0(-852426512);
                yt22.r(false);
            }
            ml42 = ml43;
        } else {
            yt22.Y();
            ml42 = ml4;
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ii0(str2, ml42, sr23, sr24, j3, i8);
        }
    }

    public static final ay4 d() {
        Context context = s;
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        sharedPreferences.getClass();
        return new ay4(9, sharedPreferences);
    }

    public static final void e(sr2 sr2, ml4 ml4, boolean z, pq6 pq6, xd0 xd0, la5 la5, hs2 hs2, yt2 yt2, int i2, int i3) {
        int i4;
        pq6 pq62;
        xd0 xd02;
        boolean z2;
        la5 la52;
        boolean z3;
        ml4 ml42;
        pa5 pa5;
        xd0 xd03;
        pq6 pq63;
        boolean z4;
        ml4 ml43;
        pq6 pq64;
        xd0 xd04;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        yt2 yt22 = yt2;
        int i13 = i2;
        yt22.g0(-1061374109);
        if ((i13 & 6) == 0) {
            if (yt22.i(sr2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i4 = i12 | i13;
        } else {
            i4 = i13;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i13 & 48) == 0) {
            if (yt22.g(ml4)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i4 |= i11;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else if ((i13 & 384) == 0) {
            if (yt22.h(z)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i4 |= i10;
        }
        if ((i13 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                pq62 = pq6;
                if (yt22.g(pq62)) {
                    i9 = 2048;
                    i4 |= i9;
                }
            } else {
                pq62 = pq6;
            }
            i9 = 1024;
            i4 |= i9;
        } else {
            pq62 = pq6;
        }
        if ((i13 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                xd02 = xd0;
                if (yt22.g(xd02)) {
                    i8 = 16384;
                    i4 |= i8;
                }
            } else {
                xd02 = xd0;
            }
            i8 = 8192;
            i4 |= i8;
        } else {
            xd02 = xd0;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i13 & 196608) == 0) {
            if (yt22.g((Object) null)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i4 |= i7;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (yt22.g((Object) null)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i4 |= i6;
        }
        int i16 = i4 | 113246208;
        hs2 hs22 = hs2;
        if ((805306368 & i13) == 0) {
            if (yt22.i(hs22)) {
                i5 = 536870912;
            } else {
                i5 = 268435456;
            }
            i16 |= i5;
        }
        boolean z5 = true;
        if ((306783379 & i16) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (yt22.V(i16 & 1, z2)) {
            yt22.a0();
            if ((i13 & 1) == 0 || yt22.C()) {
                if (i14 != 0) {
                    ml4 = jl4.w;
                }
                if (i15 == 0) {
                    z5 = z;
                }
                if ((i3 & 8) != 0) {
                    pa5 pa52 = yd0.a;
                    pq64 = hr6.a(kl8.a, yt22);
                    i16 &= -7169;
                } else {
                    pq64 = pq62;
                }
                if ((i3 & 16) != 0) {
                    pa5 pa53 = yd0.a;
                    xd04 = yd0.d(((zg4) yt22.k(ch4.b)).a);
                    i16 &= -57345;
                } else {
                    xd04 = xd02;
                }
                xd03 = xd04;
                pa5 = yd0.c;
                z4 = z5;
                pq63 = pq64;
                ml43 = ml4;
            } else {
                yt22.Y();
                if ((i3 & 8) != 0) {
                    i16 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    i16 &= -57345;
                }
                ml43 = ml4;
                z4 = z;
                pa5 = la5;
                pq63 = pq62;
                xd03 = xd02;
            }
            yt22.s();
            a(sr2, ml43, z4, pq63, xd03, (ce0) null, (ua0) null, pa5, hs2, yt22, i16 & 2147483646, 0);
            xd02 = xd03;
            la52 = pa5;
            pq62 = pq63;
            z3 = z4;
            ml42 = ml43;
        } else {
            yt2.Y();
            ml42 = ml4;
            z3 = z;
            la52 = la5;
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new ie0(sr2, ml42, z3, pq62, xd02, la52, hs2, i13, i3);
        }
    }

    public static final boolean f(ux1 ux1, long j2) {
        if (!ux1.w.J) {
            return false;
        }
        hc3 hc3 = (hc3) rc9.O0(ux1).a0.d;
        if (!hc3.r0.J) {
            return false;
        }
        long R = hc3.R(0);
        float intBitsToFloat = Float.intBitsToFloat((int) (R >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (R & 4294967295L));
        long j3 = ux1.M;
        float f2 = ((float) ((int) (j3 >> 32))) + intBitsToFloat;
        float f3 = ((float) ((int) (j3 & 4294967295L))) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f2) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        if (intBitsToFloat2 > intBitsToFloat4 || intBitsToFloat4 > f3) {
            return false;
        }
        return true;
    }

    public static int g(double d2) {
        double d3;
        boolean z;
        double d4;
        double d5 = (d2 + 16.0d) / 116.0d;
        if (d2 > 8.0d) {
            d3 = d5 * d5 * d5;
        } else {
            d3 = d2 / 903.2962962962963d;
        }
        double d6 = d5 * d5 * d5;
        if (d6 > 0.008856451679035631d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d4 = d6;
        } else {
            d4 = d2 / 903.2962962962963d;
        }
        if (!z) {
            d6 = d2 / 903.2962962962963d;
        }
        float[] fArr = d;
        double d7 = d4 * ((double) fArr[0]);
        double d8 = d3 * ((double) fArr[1]);
        double d9 = d6 * ((double) fArr[2]);
        double[][] dArr = f;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[2] * d9) + (dArr2[1] * d8) + (dArr2[0] * d7);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[2] * d9) + (dArr3[1] * d8) + (dArr3[0] * d7);
        double[] dArr4 = dArr[2];
        return ((s(d10) & 255) << 16) | -16777216 | ((s(d11) & 255) << 8) | (s((dArr4[2] * d9) + (dArr4[1] * d8) + (dArr4[0] * d7)) & 255);
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r0v11, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    public static final Object i(in8 in8, h61 h61) {
        d dVar;
        int i2;
        Throwable th;
        h06 h06;
        in8 in82;
        s54 s54;
        if (h61 instanceof d) {
            d dVar2 = (d) h61;
            int i3 = dVar2.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar2.C = i3 - Integer.MIN_VALUE;
                dVar = dVar2;
                Object obj = dVar.B;
                i2 = dVar.C;
                vs7 vs7 = vs7.a;
                if (i2 != 0) {
                    o85.q(obj);
                    if (in8.G0().compareTo(k54.z) >= 0) {
                        return vs7;
                    }
                    ? obj2 = new Object();
                    try {
                        dVar.z = in8;
                        dVar.A = obj2;
                        dVar.C = 1;
                        kk0 kk0 = new kk0(1, rc9.a0(dVar));
                        kk0.v();
                        e eVar = new e(kk0);
                        obj2.w = eVar;
                        in8.x0(eVar);
                        Object t = kk0.t();
                        p81 p81 = p81.w;
                        if (t == p81) {
                            return p81;
                        }
                        in82 = in8;
                        h06 = obj2;
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        in82 = in8;
                        h06 = obj2;
                        th = th3;
                        s54 s542 = (s54) h06.w;
                        if (s542 != null) {
                            in82.M0(s542);
                        }
                        throw th;
                    }
                } else if (i2 == 1) {
                    h06 = dVar.A;
                    in82 = dVar.z;
                    try {
                        o85.q(obj);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s54 = (s54) h06.w;
                if (s54 != null) {
                    in82.M0(s54);
                }
                return vs7;
            }
        }
        dVar = new h61(h61);
        Object obj3 = dVar.B;
        i2 = dVar.C;
        vs7 vs72 = vs7.a;
        if (i2 != 0) {
        }
        s54 = (s54) h06.w;
        if (s54 != null) {
        }
        return vs72;
    }

    public static final String j(String str) {
        char charAt;
        str.getClass();
        if (str.length() == 0 || 'a' > (charAt = str.charAt(0)) || charAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(charAt));
        sb.append(str, 1, str.length());
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a A[SYNTHETIC, Splitter:B:10:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    public static final Charset k(yh4 yh4) {
        String str;
        if (yh4 != null) {
            k26 k26 = yh4.e;
            String[] strArr = yh4.d;
            int i2 = 0;
            int m2 = wn6.m(0, strArr.length - 1, 2);
            Charset charset = null;
            if (m2 >= 0) {
                while (true) {
                    if (!k57.n0(strArr[i2], "charset", true)) {
                        if (i2 == m2) {
                            break;
                        }
                        i2 += 2;
                    } else {
                        str = strArr[i2 + 1];
                        break;
                    }
                }
                if (str != null) {
                    try {
                        charset = Charset.forName(str);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (charset != null) {
                    return charset;
                }
            }
            str = null;
            if (str != null) {
            }
            if (charset != null) {
            }
        }
        return mo0.a;
    }

    public static void l(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov5.E, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                n(context, n, "Theme.MaterialComponents");
            }
        }
        n(context, m, "Theme.AppCompat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0.getResourceId(0, -1) != -1) goto L_0x001d;
     */
    public static void m(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov5.E, i2, i3);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int resourceId : iArr2) {
                if (obtainStyledAttributes2.getResourceId(resourceId, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
        }
        z = true;
        obtainStyledAttributes.recycle();
        if (!z) {
            h.q("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void n(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int i2 = 0;
        while (i2 < iArr.length) {
            if (obtainStyledAttributes.hasValue(i2)) {
                i2++;
            } else {
                obtainStyledAttributes.recycle();
                h.q(f21.h("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static String o(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "kotlin.Double.Companion";
            case -2056817302:
                if (!str.equals("java.lang.Integer")) {
                    return null;
                }
                return "kotlin.Int";
            case -2034166429:
                if (!str.equals("java.lang.Cloneable")) {
                    return null;
                }
                return "kotlin.Cloneable";
            case -1979556166:
                if (!str.equals("java.lang.annotation.Annotation")) {
                    return null;
                }
                return "kotlin.Annotation";
            case -1571515090:
                if (!str.equals("java.lang.Comparable")) {
                    return null;
                }
                return "kotlin.Comparable";
            case -1383349348:
                if (!str.equals("java.util.Map")) {
                    return null;
                }
                return "kotlin.collections.Map";
            case -1383343454:
                if (!str.equals("java.util.Set")) {
                    return null;
                }
                return "kotlin.collections.Set";
            case -1325958191:
                if (!str.equals("double")) {
                    return null;
                }
                return "kotlin.Double";
            case -1182275604:
                if (!str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return null;
                }
                return "kotlin.Byte.Companion";
            case -1062240117:
                if (!str.equals("java.lang.CharSequence")) {
                    return null;
                }
                return "kotlin.CharSequence";
            case -688322466:
                if (!str.equals("java.util.Collection")) {
                    return null;
                }
                return "kotlin.collections.Collection";
            case -527879800:
                if (!str.equals("java.lang.Float")) {
                    return null;
                }
                return "kotlin.Float";
            case -515992664:
                if (!str.equals("java.lang.Short")) {
                    return null;
                }
                return "kotlin.Short";
            case -246476834:
                if (!str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return null;
                }
                return "kotlin.Char.Companion";
            case -207262728:
                if (!str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return null;
                }
                return "kotlin.Long.Companion";
            case -165139126:
                if (!str.equals("java.util.Map$Entry")) {
                    return null;
                }
                return "kotlin.collections.Map.Entry";
            case 104431:
                if (!str.equals("int")) {
                    return null;
                }
                return "kotlin.Int";
            case 3039496:
                if (!str.equals("byte")) {
                    return null;
                }
                return "kotlin.Byte";
            case 3052374:
                if (!str.equals("char")) {
                    return null;
                }
                return "kotlin.Char";
            case 3327612:
                if (!str.equals("long")) {
                    return null;
                }
                return "kotlin.Long";
            case 64711720:
                if (!str.equals("boolean")) {
                    return null;
                }
                return "kotlin.Boolean";
            case 65821278:
                if (!str.equals("java.util.List")) {
                    return null;
                }
                return "kotlin.collections.List";
            case 77230534:
                if (!str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return null;
                }
                return "kotlin.Short.Companion";
            case 97526364:
                if (!str.equals("float")) {
                    return null;
                }
                return "kotlin.Float";
            case 109413500:
                if (!str.equals("short")) {
                    return null;
                }
                return "kotlin.Short";
            case 155276373:
                if (!str.equals("java.lang.Character")) {
                    return null;
                }
                return "kotlin.Char";
            case 226173651:
                if (!str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return null;
                }
                return "kotlin.Enum.Companion";
            case 344809556:
                if (!str.equals("java.lang.Boolean")) {
                    return null;
                }
                return "kotlin.Boolean";
            case 398507100:
                if (!str.equals("java.lang.Byte")) {
                    return null;
                }
                return "kotlin.Byte";
            case 398585941:
                if (!str.equals("java.lang.Enum")) {
                    return null;
                }
                return "kotlin.Enum";
            case 398795216:
                if (!str.equals("java.lang.Long")) {
                    return null;
                }
                return "kotlin.Long";
            case 482629606:
                if (!str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return null;
                }
                return "kotlin.Float.Companion";
            case 499831342:
                if (!str.equals("java.util.Iterator")) {
                    return null;
                }
                return "kotlin.collections.Iterator";
            case 577341676:
                if (!str.equals("java.util.ListIterator")) {
                    return null;
                }
                return "kotlin.collections.ListIterator";
            case 599019395:
                if (!str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return null;
                }
                return "kotlin.String.Companion";
            case 761287205:
                if (!str.equals("java.lang.Double")) {
                    return null;
                }
                return "kotlin.Double";
            case 1052881309:
                if (!str.equals("java.lang.Number")) {
                    return null;
                }
                return "kotlin.Number";
            case 1063877011:
                if (!str.equals("java.lang.Object")) {
                    return null;
                }
                return "kotlin.Any";
            case 1195259493:
                if (!str.equals("java.lang.String")) {
                    return null;
                }
                return "kotlin.String";
            case 1275614662:
                if (!str.equals("java.lang.Iterable")) {
                    return null;
                }
                return "kotlin.collections.Iterable";
            case 1383693018:
                if (!str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return null;
                }
                return "kotlin.Boolean.Companion";
            case 1630335596:
                if (!str.equals("java.lang.Throwable")) {
                    return null;
                }
                return "kotlin.Throwable";
            case 1877171123:
                if (!str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return null;
                }
                return "kotlin.Int.Companion";
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (!str.equals("kotlin.jvm.functions.Function10")) {
                            return null;
                        }
                        return "kotlin.Function10";
                    case -1811142715:
                        if (!str.equals("kotlin.jvm.functions.Function11")) {
                            return null;
                        }
                        return "kotlin.Function11";
                    case -1811142714:
                        if (!str.equals("kotlin.jvm.functions.Function12")) {
                            return null;
                        }
                        return "kotlin.Function12";
                    case -1811142713:
                        if (!str.equals("kotlin.jvm.functions.Function13")) {
                            return null;
                        }
                        return "kotlin.Function13";
                    case -1811142712:
                        if (!str.equals("kotlin.jvm.functions.Function14")) {
                            return null;
                        }
                        return "kotlin.Function14";
                    case -1811142711:
                        if (!str.equals("kotlin.jvm.functions.Function15")) {
                            return null;
                        }
                        return "kotlin.Function15";
                    case -1811142710:
                        if (!str.equals("kotlin.jvm.functions.Function16")) {
                            return null;
                        }
                        return "kotlin.Function16";
                    case -1811142709:
                        if (!str.equals("kotlin.jvm.functions.Function17")) {
                            return null;
                        }
                        return "kotlin.Function17";
                    case -1811142708:
                        if (!str.equals("kotlin.jvm.functions.Function18")) {
                            return null;
                        }
                        return "kotlin.Function18";
                    case -1811142707:
                        if (!str.equals("kotlin.jvm.functions.Function19")) {
                            return null;
                        }
                        return "kotlin.Function19";
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (!str.equals("kotlin.jvm.functions.Function20")) {
                                    return null;
                                }
                                return "kotlin.Function20";
                            case -1811142684:
                                if (!str.equals("kotlin.jvm.functions.Function21")) {
                                    return null;
                                }
                                return "kotlin.Function21";
                            case -1811142683:
                                if (!str.equals("kotlin.jvm.functions.Function22")) {
                                    return null;
                                }
                                return "kotlin.Function22";
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (!str.equals("kotlin.jvm.functions.Function0")) {
                                            return null;
                                        }
                                        return "kotlin.Function0";
                                    case 80123372:
                                        if (!str.equals("kotlin.jvm.functions.Function1")) {
                                            return null;
                                        }
                                        return "kotlin.Function1";
                                    case 80123373:
                                        if (!str.equals("kotlin.jvm.functions.Function2")) {
                                            return null;
                                        }
                                        return "kotlin.Function2";
                                    case 80123374:
                                        if (!str.equals("kotlin.jvm.functions.Function3")) {
                                            return null;
                                        }
                                        return "kotlin.Function3";
                                    case 80123375:
                                        if (!str.equals("kotlin.jvm.functions.Function4")) {
                                            return null;
                                        }
                                        return "kotlin.Function4";
                                    case 80123376:
                                        if (!str.equals("kotlin.jvm.functions.Function5")) {
                                            return null;
                                        }
                                        return "kotlin.Function5";
                                    case 80123377:
                                        if (!str.equals("kotlin.jvm.functions.Function6")) {
                                            return null;
                                        }
                                        return "kotlin.Function6";
                                    case 80123378:
                                        if (!str.equals("kotlin.jvm.functions.Function7")) {
                                            return null;
                                        }
                                        return "kotlin.Function7";
                                    case 80123379:
                                        if (!str.equals("kotlin.jvm.functions.Function8")) {
                                            return null;
                                        }
                                        return "kotlin.Function8";
                                    case 80123380:
                                        if (!str.equals("kotlin.jvm.functions.Function9")) {
                                            return null;
                                        }
                                        return "kotlin.Function9";
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static ml4 p(ml4 ml4, hs2 hs2) {
        return ml4.d(new zx0(hs2));
    }

    public static gv0 q(String str, String str2) {
        y00 y00 = new y00(str, str2);
        fv0 b2 = gv0.b(y00.class);
        b2.c = 1;
        b2.g = new ev0(0, y00);
        return b2.b();
    }

    public static qw2 r(Bundle bundle) {
        Uri uri;
        bundle.getClass();
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            if (Build.VERSION.SDK_INT >= 33) {
                uri = (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class);
            } else {
                uri = (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            }
            Uri uri2 = uri;
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            string.getClass();
            string2.getClass();
            return new qw2(string, string2, string3, string4, string5, uri2, string6);
        } catch (Exception e2) {
            throw new Exception(e2);
        }
    }

    public static int s(double d2) {
        double d3;
        double d4 = d2 / 100.0d;
        if (d4 <= 0.0031308d) {
            d3 = d4 * 12.92d;
        } else {
            d3 = (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d;
        }
        int round = (int) Math.round(d3 * 255.0d);
        if (round < 0) {
            return 0;
        }
        if (round > 255) {
            return 255;
        }
        return round;
    }

    public static final boolean t(long j2, long j3) {
        if (j2 == j3) {
            return true;
        }
        return false;
    }

    public static fm u(rm rmVar, up2 up2) {
        Object obj;
        up2.getClass();
        Iterator it = rmVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (sg3.e(((fm) obj).f(), up2)) {
                break;
            }
        }
        return (fm) obj;
    }

    public static gv0 v(String str, ta1 ta1) {
        fv0 b2 = gv0.b(y00.class);
        b2.c = 1;
        b2.a(zp1.c(Context.class));
        b2.g = new yv0(9, (Object) str, (Object) ta1);
        return b2.b();
    }

    public static String w(Context context, int i2) {
        if (context == null) {
            return "";
        }
        if (i2 == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i2 != 7) {
            switch (i2) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i2);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static final ro4 x(up2 up2, gq3 gq3) {
        up2.getClass();
        gq3.getClass();
        return new ro4(gq3, up2.a.a, new so4(gq3, up2), new so4(up2, gq3));
    }

    public static boolean y(rm rmVar, up2 up2) {
        up2.getClass();
        if (rmVar.m(up2) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ml4, java.lang.Object] */
    public static final ml4 z() {
        return new Object();
    }

    public abstract String h();

    public String toString() {
        switch (this.a) {
            case 24:
                return h();
            default:
                return super.toString();
        }
    }
}
