package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: w21  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w21 {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(101, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(105, 13);
        sparseIntArray.append(108, 16);
        sparseIntArray.append(106, 14);
        sparseIntArray.append(103, 11);
        sparseIntArray.append(107, 15);
        sparseIntArray.append(104, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(120, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(121, 67);
        sparseIntArray.append(112, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(111, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(110, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(113, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(122, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(115, 82);
        sparseIntArray.append(119, 83);
        sparseIntArray.append(118, 84);
        sparseIntArray.append(117, 85);
        sparseIntArray.append(116, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(104, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(105, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(106, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(103, 83);
        sparseIntArray2.append(102, 84);
        sparseIntArray2.append(101, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int[] c(i50 i50, String str) {
        int i;
        String[] split = str.split(",");
        Context context = i50.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = iv5.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && i50.isInEditMode() && (i50.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) i50.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.I;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.I.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* JADX WARNING: type inference failed for: r2v190, types: [q21, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    public static r21 d(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        int i;
        int i2;
        r21 r21 = new r21();
        if (z) {
            iArr = jv5.c;
        } else {
            iArr = jv5.a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        String[] strArr = gw8.l;
        u21 u21 = r21.b;
        v21 v21 = r21.e;
        t21 t21 = r21.c;
        s21 s21 = r21.d;
        int[] iArr2 = d;
        SparseIntArray sparseIntArray = e;
        if (z) {
            String[] strArr2 = strArr;
            ? obj = new Object();
            int[] iArr3 = iArr2;
            String str = "CURRENTLY UNSUPPORTED";
            obj.a = new int[10];
            obj.b = new int[10];
            obj.c = 0;
            obj.d = new int[10];
            obj.e = new float[10];
            obj.f = 0;
            obj.g = new int[5];
            obj.h = new String[5];
            obj.i = 0;
            obj.j = new int[4];
            obj.k = new boolean[4];
            obj.l = 0;
            t21.getClass();
            s21.getClass();
            v21.getClass();
            int i3 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f.get(index)) {
                    case 2:
                        i2 = indexCount;
                        obj.b(2, obtainStyledAttributes.getDimensionPixelSize(index, s21.H));
                        continue;
                    case 5:
                        i2 = indexCount;
                        obj.c(5, obtainStyledAttributes.getString(index));
                        continue;
                    case 6:
                        i2 = indexCount;
                        obj.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, s21.B));
                        break;
                    case 7:
                        i2 = indexCount;
                        obj.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, s21.C));
                        break;
                    case 8:
                        i2 = indexCount;
                        obj.b(8, obtainStyledAttributes.getDimensionPixelSize(index, s21.I));
                        break;
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                        i2 = indexCount;
                        obj.b(11, obtainStyledAttributes.getDimensionPixelSize(index, s21.O));
                        break;
                    case 12:
                        i2 = indexCount;
                        obj.b(12, obtainStyledAttributes.getDimensionPixelSize(index, s21.P));
                        break;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER:
                        i2 = indexCount;
                        obj.b(13, obtainStyledAttributes.getDimensionPixelSize(index, s21.L));
                        break;
                    case 14:
                        i2 = indexCount;
                        obj.b(14, obtainStyledAttributes.getDimensionPixelSize(index, s21.N));
                        break;
                    case h75.g:
                        i2 = indexCount;
                        obj.b(15, obtainStyledAttributes.getDimensionPixelSize(index, s21.Q));
                        break;
                    case 16:
                        i2 = indexCount;
                        obj.b(16, obtainStyledAttributes.getDimensionPixelSize(index, s21.M));
                        break;
                    case 17:
                        i2 = indexCount;
                        obj.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, s21.d));
                        break;
                    case 18:
                        i2 = indexCount;
                        obj.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, s21.e));
                        break;
                    case 19:
                        i2 = indexCount;
                        obj.a(19, obtainStyledAttributes.getFloat(index, s21.f));
                        break;
                    case 20:
                        i2 = indexCount;
                        obj.a(20, obtainStyledAttributes.getFloat(index, s21.v));
                        break;
                    case 21:
                        i2 = indexCount;
                        obj.b(21, obtainStyledAttributes.getLayoutDimension(index, s21.c));
                        break;
                    case 22:
                        i2 = indexCount;
                        obj.b(22, iArr3[obtainStyledAttributes.getInt(index, u21.a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        obj.b(23, obtainStyledAttributes.getLayoutDimension(index, s21.b));
                        break;
                    case 24:
                        i2 = indexCount;
                        obj.b(24, obtainStyledAttributes.getDimensionPixelSize(index, s21.E));
                        break;
                    case 27:
                        i2 = indexCount;
                        obj.b(27, obtainStyledAttributes.getInt(index, s21.D));
                        break;
                    case 28:
                        i2 = indexCount;
                        obj.b(28, obtainStyledAttributes.getDimensionPixelSize(index, s21.F));
                        break;
                    case 31:
                        i2 = indexCount;
                        obj.b(31, obtainStyledAttributes.getDimensionPixelSize(index, s21.J));
                        break;
                    case 34:
                        i2 = indexCount;
                        obj.b(34, obtainStyledAttributes.getDimensionPixelSize(index, s21.G));
                        break;
                    case 37:
                        i2 = indexCount;
                        obj.a(37, obtainStyledAttributes.getFloat(index, s21.w));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, r21.a);
                        r21.a = resourceId;
                        obj.b(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        obj.a(39, obtainStyledAttributes.getFloat(index, s21.T));
                        break;
                    case 40:
                        i2 = indexCount;
                        obj.a(40, obtainStyledAttributes.getFloat(index, s21.S));
                        break;
                    case 41:
                        i2 = indexCount;
                        obj.b(41, obtainStyledAttributes.getInt(index, s21.U));
                        break;
                    case 42:
                        i2 = indexCount;
                        obj.b(42, obtainStyledAttributes.getInt(index, s21.V));
                        break;
                    case 43:
                        i2 = indexCount;
                        obj.a(43, obtainStyledAttributes.getFloat(index, u21.c));
                        break;
                    case 44:
                        i2 = indexCount;
                        obj.d(44, true);
                        obj.a(44, obtainStyledAttributes.getDimension(index, v21.m));
                        break;
                    case 45:
                        i2 = indexCount;
                        obj.a(45, obtainStyledAttributes.getFloat(index, v21.b));
                        break;
                    case 46:
                        i2 = indexCount;
                        obj.a(46, obtainStyledAttributes.getFloat(index, v21.c));
                        break;
                    case 47:
                        i2 = indexCount;
                        obj.a(47, obtainStyledAttributes.getFloat(index, v21.d));
                        break;
                    case h75.h:
                        i2 = indexCount;
                        obj.a(48, obtainStyledAttributes.getFloat(index, v21.e));
                        break;
                    case 49:
                        i2 = indexCount;
                        obj.a(49, obtainStyledAttributes.getDimension(index, v21.f));
                        break;
                    case 50:
                        i2 = indexCount;
                        obj.a(50, obtainStyledAttributes.getDimension(index, v21.g));
                        break;
                    case 51:
                        i2 = indexCount;
                        obj.a(51, obtainStyledAttributes.getDimension(index, v21.i));
                        break;
                    case 52:
                        i2 = indexCount;
                        obj.a(52, obtainStyledAttributes.getDimension(index, v21.j));
                        break;
                    case 53:
                        i2 = indexCount;
                        obj.a(53, obtainStyledAttributes.getDimension(index, v21.k));
                        break;
                    case 54:
                        i2 = indexCount;
                        obj.b(54, obtainStyledAttributes.getInt(index, s21.W));
                        break;
                    case 55:
                        i2 = indexCount;
                        obj.b(55, obtainStyledAttributes.getInt(index, s21.X));
                        break;
                    case 56:
                        i2 = indexCount;
                        obj.b(56, obtainStyledAttributes.getDimensionPixelSize(index, s21.Y));
                        break;
                    case 57:
                        i2 = indexCount;
                        obj.b(57, obtainStyledAttributes.getDimensionPixelSize(index, s21.Z));
                        break;
                    case 58:
                        i2 = indexCount;
                        obj.b(58, obtainStyledAttributes.getDimensionPixelSize(index, s21.a0));
                        break;
                    case 59:
                        i2 = indexCount;
                        obj.b(59, obtainStyledAttributes.getDimensionPixelSize(index, s21.b0));
                        break;
                    case 60:
                        i2 = indexCount;
                        obj.a(60, obtainStyledAttributes.getFloat(index, v21.a));
                        break;
                    case 62:
                        i2 = indexCount;
                        obj.b(62, obtainStyledAttributes.getDimensionPixelSize(index, s21.z));
                        break;
                    case 63:
                        i2 = indexCount;
                        obj.a(63, obtainStyledAttributes.getFloat(index, s21.A));
                        break;
                    case 64:
                        i2 = indexCount;
                        obj.b(64, f(obtainStyledAttributes, index, t21.a));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            obj.c(65, strArr2[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        } else {
                            obj.c(65, obtainStyledAttributes.getString(index));
                            break;
                        }
                    case 66:
                        i2 = indexCount;
                        obj.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        obj.a(67, obtainStyledAttributes.getFloat(index, t21.e));
                        break;
                    case 68:
                        i2 = indexCount;
                        obj.a(68, obtainStyledAttributes.getFloat(index, u21.d));
                        break;
                    case 69:
                        i2 = indexCount;
                        obj.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        String str2 = str;
                        obj.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", str);
                        break;
                    case 72:
                        i2 = indexCount;
                        obj.b(72, obtainStyledAttributes.getInt(index, s21.e0));
                        break;
                    case 73:
                        i2 = indexCount;
                        obj.b(73, obtainStyledAttributes.getDimensionPixelSize(index, s21.f0));
                        break;
                    case 74:
                        i2 = indexCount;
                        obj.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = indexCount;
                        obj.d(75, obtainStyledAttributes.getBoolean(index, s21.m0));
                        break;
                    case 76:
                        i2 = indexCount;
                        obj.b(76, obtainStyledAttributes.getInt(index, t21.c));
                        break;
                    case 77:
                        i2 = indexCount;
                        obj.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = indexCount;
                        obj.b(78, obtainStyledAttributes.getInt(index, u21.b));
                        break;
                    case 79:
                        i2 = indexCount;
                        obj.a(79, obtainStyledAttributes.getFloat(index, t21.d));
                        break;
                    case 80:
                        i2 = indexCount;
                        obj.d(80, obtainStyledAttributes.getBoolean(index, s21.k0));
                        break;
                    case 81:
                        i2 = indexCount;
                        obj.d(81, obtainStyledAttributes.getBoolean(index, s21.l0));
                        break;
                    case 82:
                        i2 = indexCount;
                        obj.b(82, obtainStyledAttributes.getInteger(index, t21.b));
                        break;
                    case 83:
                        i2 = indexCount;
                        obj.b(83, f(obtainStyledAttributes, index, v21.h));
                        break;
                    case 84:
                        i2 = indexCount;
                        obj.b(84, obtainStyledAttributes.getInteger(index, t21.g));
                        break;
                    case 85:
                        i2 = indexCount;
                        obj.a(85, obtainStyledAttributes.getFloat(index, t21.f));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 != 1) {
                            if (i5 != 3) {
                                obj.b(88, obtainStyledAttributes.getInteger(index, t21.i));
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                t21.h = string;
                                obj.c(90, string);
                                if (t21.h.indexOf("/") <= 0) {
                                    obj.b(88, -1);
                                    break;
                                } else {
                                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                                    t21.i = resourceId2;
                                    obj.b(89, resourceId2);
                                    obj.b(88, -2);
                                    break;
                                }
                            }
                        } else {
                            int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                            t21.i = resourceId3;
                            obj.b(89, resourceId3);
                            if (t21.i != -1) {
                                obj.b(88, -2);
                                break;
                            }
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        obj.b(93, obtainStyledAttributes.getDimensionPixelSize(index, s21.K));
                        break;
                    case 94:
                        i2 = indexCount;
                        obj.b(94, obtainStyledAttributes.getDimensionPixelSize(index, s21.R));
                        break;
                    case 95:
                        i2 = indexCount;
                        g(obj, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        g(obj, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        obj.b(97, obtainStyledAttributes.getInt(index, s21.n0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = qm4.O;
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            r21.a = obtainStyledAttributes.getResourceId(index, r21.a);
                            break;
                        } else {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            String[] strArr3 = strArr;
            int[] iArr4 = iArr2;
            String str3 = "CURRENTLY UNSUPPORTED";
            int i7 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        t21.getClass();
                        s21.getClass();
                        v21.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        s21.o = f(obtainStyledAttributes, index2, s21.o);
                        continue;
                    case 2:
                        i = indexCount2;
                        s21.H = obtainStyledAttributes.getDimensionPixelSize(index2, s21.H);
                        continue;
                    case 3:
                        i = indexCount2;
                        s21.n = f(obtainStyledAttributes, index2, s21.n);
                        continue;
                    case 4:
                        i = indexCount2;
                        s21.m = f(obtainStyledAttributes, index2, s21.m);
                        continue;
                    case 5:
                        i = indexCount2;
                        s21.x = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i = indexCount2;
                        s21.B = obtainStyledAttributes.getDimensionPixelOffset(index2, s21.B);
                        continue;
                    case 7:
                        i = indexCount2;
                        s21.C = obtainStyledAttributes.getDimensionPixelOffset(index2, s21.C);
                        continue;
                    case 8:
                        i = indexCount2;
                        s21.I = obtainStyledAttributes.getDimensionPixelSize(index2, s21.I);
                        continue;
                    case 9:
                        i = indexCount2;
                        s21.u = f(obtainStyledAttributes, index2, s21.u);
                        continue;
                    case 10:
                        i = indexCount2;
                        s21.t = f(obtainStyledAttributes, index2, s21.t);
                        continue;
                    case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                        i = indexCount2;
                        s21.O = obtainStyledAttributes.getDimensionPixelSize(index2, s21.O);
                        continue;
                    case 12:
                        i = indexCount2;
                        s21.P = obtainStyledAttributes.getDimensionPixelSize(index2, s21.P);
                        continue;
                    case ry4.PERF_SESSIONS_FIELD_NUMBER:
                        i = indexCount2;
                        s21.L = obtainStyledAttributes.getDimensionPixelSize(index2, s21.L);
                        continue;
                    case 14:
                        i = indexCount2;
                        s21.N = obtainStyledAttributes.getDimensionPixelSize(index2, s21.N);
                        continue;
                    case h75.g:
                        i = indexCount2;
                        s21.Q = obtainStyledAttributes.getDimensionPixelSize(index2, s21.Q);
                        continue;
                    case 16:
                        i = indexCount2;
                        s21.M = obtainStyledAttributes.getDimensionPixelSize(index2, s21.M);
                        continue;
                    case 17:
                        i = indexCount2;
                        s21.d = obtainStyledAttributes.getDimensionPixelOffset(index2, s21.d);
                        continue;
                    case 18:
                        i = indexCount2;
                        s21.e = obtainStyledAttributes.getDimensionPixelOffset(index2, s21.e);
                        continue;
                    case 19:
                        i = indexCount2;
                        s21.f = obtainStyledAttributes.getFloat(index2, s21.f);
                        continue;
                    case 20:
                        i = indexCount2;
                        s21.v = obtainStyledAttributes.getFloat(index2, s21.v);
                        continue;
                    case 21:
                        i = indexCount2;
                        s21.c = obtainStyledAttributes.getLayoutDimension(index2, s21.c);
                        continue;
                    case 22:
                        i = indexCount2;
                        int i8 = obtainStyledAttributes.getInt(index2, u21.a);
                        u21.a = i8;
                        u21.a = iArr4[i8];
                        continue;
                    case 23:
                        i = indexCount2;
                        s21.b = obtainStyledAttributes.getLayoutDimension(index2, s21.b);
                        continue;
                    case 24:
                        i = indexCount2;
                        s21.E = obtainStyledAttributes.getDimensionPixelSize(index2, s21.E);
                        continue;
                    case 25:
                        i = indexCount2;
                        s21.g = f(obtainStyledAttributes, index2, s21.g);
                        continue;
                    case 26:
                        i = indexCount2;
                        s21.h = f(obtainStyledAttributes, index2, s21.h);
                        continue;
                    case 27:
                        i = indexCount2;
                        s21.D = obtainStyledAttributes.getInt(index2, s21.D);
                        continue;
                    case 28:
                        i = indexCount2;
                        s21.F = obtainStyledAttributes.getDimensionPixelSize(index2, s21.F);
                        continue;
                    case 29:
                        i = indexCount2;
                        s21.i = f(obtainStyledAttributes, index2, s21.i);
                        continue;
                    case 30:
                        i = indexCount2;
                        s21.j = f(obtainStyledAttributes, index2, s21.j);
                        continue;
                    case 31:
                        i = indexCount2;
                        s21.J = obtainStyledAttributes.getDimensionPixelSize(index2, s21.J);
                        continue;
                    case 32:
                        i = indexCount2;
                        s21.r = f(obtainStyledAttributes, index2, s21.r);
                        continue;
                    case 33:
                        i = indexCount2;
                        s21.s = f(obtainStyledAttributes, index2, s21.s);
                        continue;
                    case 34:
                        i = indexCount2;
                        s21.G = obtainStyledAttributes.getDimensionPixelSize(index2, s21.G);
                        continue;
                    case 35:
                        i = indexCount2;
                        s21.l = f(obtainStyledAttributes, index2, s21.l);
                        continue;
                    case 36:
                        i = indexCount2;
                        s21.k = f(obtainStyledAttributes, index2, s21.k);
                        continue;
                    case 37:
                        i = indexCount2;
                        s21.w = obtainStyledAttributes.getFloat(index2, s21.w);
                        continue;
                    case 38:
                        i = indexCount2;
                        r21.a = obtainStyledAttributes.getResourceId(index2, r21.a);
                        continue;
                    case 39:
                        i = indexCount2;
                        s21.T = obtainStyledAttributes.getFloat(index2, s21.T);
                        continue;
                    case 40:
                        i = indexCount2;
                        s21.S = obtainStyledAttributes.getFloat(index2, s21.S);
                        continue;
                    case 41:
                        i = indexCount2;
                        s21.U = obtainStyledAttributes.getInt(index2, s21.U);
                        continue;
                    case 42:
                        i = indexCount2;
                        s21.V = obtainStyledAttributes.getInt(index2, s21.V);
                        continue;
                    case 43:
                        i = indexCount2;
                        u21.c = obtainStyledAttributes.getFloat(index2, u21.c);
                        continue;
                    case 44:
                        i = indexCount2;
                        v21.l = true;
                        v21.m = obtainStyledAttributes.getDimension(index2, v21.m);
                        continue;
                    case 45:
                        i = indexCount2;
                        v21.b = obtainStyledAttributes.getFloat(index2, v21.b);
                        continue;
                    case 46:
                        i = indexCount2;
                        v21.c = obtainStyledAttributes.getFloat(index2, v21.c);
                        continue;
                    case 47:
                        i = indexCount2;
                        v21.d = obtainStyledAttributes.getFloat(index2, v21.d);
                        continue;
                    case h75.h:
                        i = indexCount2;
                        v21.e = obtainStyledAttributes.getFloat(index2, v21.e);
                        continue;
                    case 49:
                        i = indexCount2;
                        v21.f = obtainStyledAttributes.getDimension(index2, v21.f);
                        continue;
                    case 50:
                        i = indexCount2;
                        v21.g = obtainStyledAttributes.getDimension(index2, v21.g);
                        continue;
                    case 51:
                        i = indexCount2;
                        v21.i = obtainStyledAttributes.getDimension(index2, v21.i);
                        continue;
                    case 52:
                        i = indexCount2;
                        v21.j = obtainStyledAttributes.getDimension(index2, v21.j);
                        continue;
                    case 53:
                        i = indexCount2;
                        v21.k = obtainStyledAttributes.getDimension(index2, v21.k);
                        continue;
                    case 54:
                        i = indexCount2;
                        s21.W = obtainStyledAttributes.getInt(index2, s21.W);
                        continue;
                    case 55:
                        i = indexCount2;
                        s21.X = obtainStyledAttributes.getInt(index2, s21.X);
                        continue;
                    case 56:
                        i = indexCount2;
                        s21.Y = obtainStyledAttributes.getDimensionPixelSize(index2, s21.Y);
                        continue;
                    case 57:
                        i = indexCount2;
                        s21.Z = obtainStyledAttributes.getDimensionPixelSize(index2, s21.Z);
                        continue;
                    case 58:
                        i = indexCount2;
                        s21.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, s21.a0);
                        continue;
                    case 59:
                        i = indexCount2;
                        s21.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, s21.b0);
                        continue;
                    case 60:
                        i = indexCount2;
                        v21.a = obtainStyledAttributes.getFloat(index2, v21.a);
                        continue;
                    case 61:
                        i = indexCount2;
                        s21.y = f(obtainStyledAttributes, index2, s21.y);
                        continue;
                    case 62:
                        i = indexCount2;
                        s21.z = obtainStyledAttributes.getDimensionPixelSize(index2, s21.z);
                        continue;
                    case 63:
                        i = indexCount2;
                        s21.A = obtainStyledAttributes.getFloat(index2, s21.A);
                        continue;
                    case 64:
                        i = indexCount2;
                        t21.a = f(obtainStyledAttributes, index2, t21.a);
                        continue;
                    case 65:
                        i = indexCount2;
                        String str4 = str3;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            t21.getClass();
                        } else {
                            String str5 = strArr3[obtainStyledAttributes.getInteger(index2, 0)];
                            t21.getClass();
                            continue;
                        }
                    case 66:
                        i = indexCount2;
                        String str6 = str3;
                        obtainStyledAttributes.getInt(index2, 0);
                        t21.getClass();
                        continue;
                    case 67:
                        i = indexCount2;
                        String str7 = str3;
                        t21.e = obtainStyledAttributes.getFloat(index2, t21.e);
                        break;
                    case 68:
                        i = indexCount2;
                        String str8 = str3;
                        u21.d = obtainStyledAttributes.getFloat(index2, u21.d);
                        break;
                    case 69:
                        i = indexCount2;
                        String str9 = str3;
                        s21.c0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        String str10 = str3;
                        s21.d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", str3);
                        break;
                    case 72:
                        i = indexCount2;
                        s21.e0 = obtainStyledAttributes.getInt(index2, s21.e0);
                        break;
                    case 73:
                        i = indexCount2;
                        s21.f0 = obtainStyledAttributes.getDimensionPixelSize(index2, s21.f0);
                        break;
                    case 74:
                        i = indexCount2;
                        s21.i0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        s21.m0 = obtainStyledAttributes.getBoolean(index2, s21.m0);
                        break;
                    case 76:
                        i = indexCount2;
                        t21.c = obtainStyledAttributes.getInt(index2, t21.c);
                        break;
                    case 77:
                        i = indexCount2;
                        s21.j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        u21.b = obtainStyledAttributes.getInt(index2, u21.b);
                        break;
                    case 79:
                        i = indexCount2;
                        t21.d = obtainStyledAttributes.getFloat(index2, t21.d);
                        break;
                    case 80:
                        i = indexCount2;
                        s21.k0 = obtainStyledAttributes.getBoolean(index2, s21.k0);
                        break;
                    case 81:
                        i = indexCount2;
                        s21.l0 = obtainStyledAttributes.getBoolean(index2, s21.l0);
                        break;
                    case 82:
                        i = indexCount2;
                        t21.b = obtainStyledAttributes.getInteger(index2, t21.b);
                        break;
                    case 83:
                        i = indexCount2;
                        v21.h = f(obtainStyledAttributes, index2, v21.h);
                        break;
                    case 84:
                        i = indexCount2;
                        t21.g = obtainStyledAttributes.getInteger(index2, t21.g);
                        break;
                    case 85:
                        i = indexCount2;
                        t21.f = obtainStyledAttributes.getFloat(index2, t21.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = obtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            t21.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            t21.h = string2;
                            if (string2.indexOf("/") > 0) {
                                t21.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, t21.i);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        i = indexCount2;
                        s21.p = f(obtainStyledAttributes, index2, s21.p);
                        break;
                    case 92:
                        i = indexCount2;
                        s21.q = f(obtainStyledAttributes, index2, s21.q);
                        break;
                    case 93:
                        i = indexCount2;
                        s21.K = obtainStyledAttributes.getDimensionPixelSize(index2, s21.K);
                        break;
                    case 94:
                        i = indexCount2;
                        s21.R = obtainStyledAttributes.getDimensionPixelSize(index2, s21.R);
                        break;
                    case 95:
                        i = indexCount2;
                        g(s21, obtainStyledAttributes, index2, 0);
                        continue;
                    case 96:
                        i = indexCount2;
                        g(s21, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        s21.n0 = obtainStyledAttributes.getInt(index2, s21.n0);
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                }
                i7++;
            }
        }
        obtainStyledAttributes.recycle();
        return r21;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    public static void g(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        if (obj != null) {
            int i3 = typedArray.peekValue(i).type;
            boolean z = true;
            int i4 = 0;
            if (i3 != 3) {
                if (i3 != 5) {
                    dimensionPixelSize = typedArray.getInt(i, 0);
                    if (dimensionPixelSize == -4) {
                        i4 = -2;
                    } else if (dimensionPixelSize == -3 || !(dimensionPixelSize == -2 || dimensionPixelSize == -1)) {
                        z = false;
                    }
                    if (!(obj instanceof m21)) {
                        m21 m21 = (m21) obj;
                        if (i2 == 0) {
                            m21.width = i4;
                            m21.V = z;
                            return;
                        }
                        m21.height = i4;
                        m21.W = z;
                        return;
                    } else if (obj instanceof s21) {
                        s21 s21 = (s21) obj;
                        if (i2 == 0) {
                            s21.b = i4;
                            s21.k0 = z;
                            return;
                        }
                        s21.c = i4;
                        s21.l0 = z;
                        return;
                    } else if (obj instanceof q21) {
                        q21 q21 = (q21) obj;
                        if (i2 == 0) {
                            q21.b(23, i4);
                            q21.d(80, z);
                            return;
                        }
                        q21.b(21, i4);
                        q21.d(81, z);
                        return;
                    } else {
                        return;
                    }
                } else {
                    dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
                }
                z = false;
                i4 = dimensionPixelSize;
                if (!(obj instanceof m21)) {
                }
            } else {
                String string = typedArray.getString(i);
                if (string != null) {
                    int indexOf = string.indexOf(61);
                    int length = string.length();
                    if (indexOf > 0 && indexOf < length - 1) {
                        String substring = string.substring(0, indexOf);
                        String substring2 = string.substring(indexOf + 1);
                        if (substring2.length() > 0) {
                            String trim = substring.trim();
                            String trim2 = substring2.trim();
                            if ("ratio".equalsIgnoreCase(trim)) {
                                if (obj instanceof m21) {
                                    m21 m212 = (m21) obj;
                                    if (i2 == 0) {
                                        m212.width = 0;
                                    } else {
                                        m212.height = 0;
                                    }
                                    h(m212, trim2);
                                } else if (obj instanceof s21) {
                                    ((s21) obj).x = trim2;
                                } else if (obj instanceof q21) {
                                    ((q21) obj).c(5, trim2);
                                }
                            } else if ("weight".equalsIgnoreCase(trim)) {
                                try {
                                    float parseFloat = Float.parseFloat(trim2);
                                    if (obj instanceof m21) {
                                        m21 m213 = (m21) obj;
                                        if (i2 == 0) {
                                            m213.width = 0;
                                            m213.G = parseFloat;
                                            return;
                                        }
                                        m213.height = 0;
                                        m213.H = parseFloat;
                                    } else if (obj instanceof s21) {
                                        s21 s212 = (s21) obj;
                                        if (i2 == 0) {
                                            s212.b = 0;
                                            s212.T = parseFloat;
                                            return;
                                        }
                                        s212.c = 0;
                                        s212.S = parseFloat;
                                    } else if (obj instanceof q21) {
                                        q21 q212 = (q21) obj;
                                        if (i2 == 0) {
                                            q212.b(23, 0);
                                            q212.a(39, parseFloat);
                                            return;
                                        }
                                        q212.b(21, 0);
                                        q212.a(40, parseFloat);
                                    }
                                } catch (NumberFormatException unused) {
                                }
                            } else if ("parent".equalsIgnoreCase(trim)) {
                                float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                                if (obj instanceof m21) {
                                    m21 m214 = (m21) obj;
                                    if (i2 == 0) {
                                        m214.width = 0;
                                        m214.Q = max;
                                        m214.K = 2;
                                        return;
                                    }
                                    m214.height = 0;
                                    m214.R = max;
                                    m214.L = 2;
                                } else if (obj instanceof s21) {
                                    s21 s213 = (s21) obj;
                                    if (i2 == 0) {
                                        s213.b = 0;
                                        s213.c0 = max;
                                        s213.W = 2;
                                        return;
                                    }
                                    s213.c = 0;
                                    s213.d0 = max;
                                    s213.X = 2;
                                } else if (obj instanceof q21) {
                                    q21 q213 = (q21) obj;
                                    if (i2 == 0) {
                                        q213.b(23, 0);
                                        q213.b(54, 2);
                                        return;
                                    }
                                    q213.b(21, 0);
                                    q213.b(55, 2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void h(m21 m21, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                }
                i2 = i;
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        m21.F = str;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [i50, android.view.View, k21] */
    /* JADX WARNING: type inference failed for: r9v1, types: [j50, pz2] */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010c, code lost:
        r21 = r10;
     */
    public final void a(ConstraintLayout constraintLayout) {
        int i;
        HashSet hashSet;
        String str;
        HashMap hashMap;
        String str2;
        w21 w21 = this;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout2.getChildCount();
        HashMap hashMap2 = w21.c;
        HashSet hashSet2 = new HashSet(hashMap2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout2.getChildAt(i2);
            int id = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb.append(str2);
                Log.w("ConstraintSet", sb.toString());
            } else if (w21.b && id == -1) {
                rf2.r("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (id != -1) {
                if (hashMap2.containsKey(Integer.valueOf(id))) {
                    hashSet2.remove(Integer.valueOf(id));
                    r21 r21 = (r21) hashMap2.get(Integer.valueOf(id));
                    if (r21 != null) {
                        u21 u21 = r21.b;
                        s21 s21 = r21.d;
                        v21 v21 = r21.e;
                        if (childAt instanceof i50) {
                            s21.g0 = 1;
                            i50 i50 = (i50) childAt;
                            i50.setId(id);
                            i50.setType(s21.e0);
                            i50.setMargin(s21.f0);
                            i50.setAllowsGoneWidget(s21.m0);
                            int[] iArr = s21.h0;
                            if (iArr != null) {
                                i50.setReferencedIds(iArr);
                            } else {
                                String str3 = s21.i0;
                                if (str3 != null) {
                                    int[] c2 = c(i50, str3);
                                    s21.h0 = c2;
                                    i50.setReferencedIds(c2);
                                }
                            }
                        }
                        m21 m21 = (m21) childAt.getLayoutParams();
                        m21.a();
                        r21.a(m21);
                        HashMap hashMap3 = r21.f;
                        Class<?> cls = childAt.getClass();
                        for (String str4 : hashMap3.keySet()) {
                            i21 i21 = (i21) hashMap3.get(str4);
                            HashSet hashSet3 = hashSet2;
                            if (!i21.a) {
                                str = b81.y("set", str4);
                            } else {
                                str = str4;
                            }
                            int i3 = i2;
                            try {
                                int B = b81.B(i21.b);
                                Class cls2 = Float.TYPE;
                                Class cls3 = Integer.TYPE;
                                switch (B) {
                                    case b85.b:
                                        hashMap = hashMap3;
                                        cls.getMethod(str, new Class[]{cls3}).invoke(childAt, new Object[]{Integer.valueOf(i21.c)});
                                        break;
                                    case 1:
                                        hashMap = hashMap3;
                                        cls.getMethod(str, new Class[]{cls2}).invoke(childAt, new Object[]{Float.valueOf(i21.d)});
                                        break;
                                    case 2:
                                        hashMap = hashMap3;
                                        cls.getMethod(str, new Class[]{cls3}).invoke(childAt, new Object[]{Integer.valueOf(i21.g)});
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(str, new Class[]{Drawable.class});
                                        hashMap = hashMap3;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(i21.g);
                                            method.invoke(childAt, new Object[]{colorDrawable});
                                        } catch (NoSuchMethodException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                            hashSet2 = hashSet3;
                                            i2 = i3;
                                            hashMap3 = hashMap;
                                        } catch (IllegalAccessException e3) {
                                            e = e3;
                                            StringBuilder q = b81.q(" Custom Attribute \"", str4, "\" not found on ");
                                            q.append(cls.getName());
                                            Log.e("TransitionLayout", q.toString());
                                            e.printStackTrace();
                                            hashSet2 = hashSet3;
                                            i2 = i3;
                                            hashMap3 = hashMap;
                                        } catch (InvocationTargetException e4) {
                                            e = e4;
                                            StringBuilder q2 = b81.q(" Custom Attribute \"", str4, "\" not found on ");
                                            q2.append(cls.getName());
                                            Log.e("TransitionLayout", q2.toString());
                                            e.printStackTrace();
                                            hashSet2 = hashSet3;
                                            i2 = i3;
                                            hashMap3 = hashMap;
                                        }
                                    case 4:
                                        cls.getMethod(str, new Class[]{CharSequence.class}).invoke(childAt, new Object[]{i21.e});
                                        break;
                                    case 5:
                                        cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(childAt, new Object[]{Boolean.valueOf(i21.f)});
                                        break;
                                    case 6:
                                        cls.getMethod(str, new Class[]{cls2}).invoke(childAt, new Object[]{Float.valueOf(i21.d)});
                                        break;
                                    case 7:
                                        cls.getMethod(str, new Class[]{cls3}).invoke(childAt, new Object[]{Integer.valueOf(i21.c)});
                                        break;
                                }
                            } catch (NoSuchMethodException e5) {
                                e = e5;
                                hashMap = hashMap3;
                                Log.e("TransitionLayout", e.getMessage());
                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                hashSet2 = hashSet3;
                                i2 = i3;
                                hashMap3 = hashMap;
                            } catch (IllegalAccessException e6) {
                                e = e6;
                                hashMap = hashMap3;
                                StringBuilder q3 = b81.q(" Custom Attribute \"", str4, "\" not found on ");
                                q3.append(cls.getName());
                                Log.e("TransitionLayout", q3.toString());
                                e.printStackTrace();
                                hashSet2 = hashSet3;
                                i2 = i3;
                                hashMap3 = hashMap;
                            } catch (InvocationTargetException e7) {
                                e = e7;
                                hashMap = hashMap3;
                                StringBuilder q22 = b81.q(" Custom Attribute \"", str4, "\" not found on ");
                                q22.append(cls.getName());
                                Log.e("TransitionLayout", q22.toString());
                                e.printStackTrace();
                                hashSet2 = hashSet3;
                                i2 = i3;
                                hashMap3 = hashMap;
                            }
                        }
                        hashSet = hashSet2;
                        i = i2;
                        childAt.setLayoutParams(m21);
                        if (u21.b == 0) {
                            childAt.setVisibility(u21.a);
                        }
                        childAt.setAlpha(u21.c);
                        childAt.setRotation(v21.a);
                        childAt.setRotationX(v21.b);
                        childAt.setRotationY(v21.c);
                        childAt.setScaleX(v21.d);
                        childAt.setScaleY(v21.e);
                        if (v21.h != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(v21.h);
                            if (findViewById != null) {
                                float bottom = ((float) (findViewById.getBottom() + findViewById.getTop())) / 2.0f;
                                float right = ((float) (findViewById.getRight() + findViewById.getLeft())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - ((float) childAt.getLeft()));
                                    childAt.setPivotY(bottom - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(v21.f)) {
                                childAt.setPivotX(v21.f);
                            }
                            if (!Float.isNaN(v21.g)) {
                                childAt.setPivotY(v21.g);
                            }
                        }
                        childAt.setTranslationX(v21.i);
                        childAt.setTranslationY(v21.j);
                        childAt.setTranslationZ(v21.k);
                        if (v21.l) {
                            childAt.setElevation(v21.m);
                        }
                    }
                } else {
                    hashSet = hashSet2;
                    i = i2;
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
                i2 = i + 1;
                w21 = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            w21 = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            r21 r212 = (r21) hashMap2.get(num);
            if (r212 != null) {
                s21 s212 = r212.d;
                if (s212.g0 == 1) {
                    Context context = constraintLayout2.getContext();
                    ? view = new View(context);
                    view.w = new int[32];
                    view.C = new HashMap();
                    view.y = context;
                    ? pz2 = new pz2();
                    pz2.r0 = 0;
                    pz2.s0 = true;
                    pz2.t0 = 0;
                    pz2.u0 = false;
                    view.F = pz2;
                    view.z = pz2;
                    view.i();
                    view.setVisibility(8);
                    view.setId(num.intValue());
                    int[] iArr2 = s212.h0;
                    if (iArr2 != null) {
                        view.setReferencedIds(iArr2);
                    } else {
                        String str5 = s212.i0;
                        if (str5 != null) {
                            int[] c3 = c(view, str5);
                            s212.h0 = c3;
                            view.setReferencedIds(c3);
                        }
                    }
                    view.setType(s212.e0);
                    view.setMargin(s212.f0);
                    m21 g = ConstraintLayout.g();
                    view.i();
                    r212.a(g);
                    constraintLayout2.addView(view, g);
                }
                if (s212.a) {
                    yx2 yx2 = new yx2(constraintLayout2.getContext());
                    yx2.setId(num.intValue());
                    m21 g2 = ConstraintLayout.g();
                    r212.a(g2);
                    constraintLayout2.addView(yx2, g2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout2.getChildAt(i4);
            if (childAt2 instanceof k21) {
                ((k21) childAt2).e(constraintLayout2);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        HashMap hashMap;
        int i;
        w21 w21 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = w21.c;
        hashMap2.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            m21 m21 = (m21) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!w21.b || id != -1) {
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new r21());
                }
                r21 r21 = (r21) hashMap2.get(Integer.valueOf(id));
                if (r21 == null) {
                    i = childCount;
                    hashMap = hashMap2;
                } else {
                    u21 u21 = r21.b;
                    s21 s21 = r21.d;
                    v21 v21 = r21.e;
                    HashMap hashMap3 = new HashMap();
                    Class<?> cls = childAt.getClass();
                    HashMap hashMap4 = w21.a;
                    for (String str : hashMap4.keySet()) {
                        i21 i21 = (i21) hashMap4.get(str);
                        int i3 = childCount;
                        try {
                            if (str.equals("BackgroundColor")) {
                                hashMap = hashMap2;
                                try {
                                    hashMap3.put(str, new i21(i21, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    e.printStackTrace();
                                    childCount = i3;
                                    hashMap2 = hashMap;
                                } catch (IllegalAccessException e3) {
                                    e = e3;
                                    e.printStackTrace();
                                    childCount = i3;
                                    hashMap2 = hashMap;
                                } catch (InvocationTargetException e4) {
                                    e = e4;
                                    e.printStackTrace();
                                    childCount = i3;
                                    hashMap2 = hashMap;
                                }
                            } else {
                                hashMap = hashMap2;
                                hashMap3.put(str, new i21(i21, cls.getMethod("getMap" + str, (Class[]) null).invoke(childAt, (Object[]) null)));
                            }
                        } catch (NoSuchMethodException e5) {
                            e = e5;
                            hashMap = hashMap2;
                            e.printStackTrace();
                            childCount = i3;
                            hashMap2 = hashMap;
                        } catch (IllegalAccessException e6) {
                            e = e6;
                            hashMap = hashMap2;
                            e.printStackTrace();
                            childCount = i3;
                            hashMap2 = hashMap;
                        } catch (InvocationTargetException e7) {
                            e = e7;
                            hashMap = hashMap2;
                            e.printStackTrace();
                            childCount = i3;
                            hashMap2 = hashMap;
                        }
                        childCount = i3;
                        hashMap2 = hashMap;
                    }
                    i = childCount;
                    hashMap = hashMap2;
                    r21.f = hashMap3;
                    r21.a = id;
                    s21.g = m21.d;
                    s21.h = m21.e;
                    s21.i = m21.f;
                    s21.j = m21.g;
                    s21.k = m21.h;
                    s21.l = m21.i;
                    s21.m = m21.j;
                    s21.n = m21.k;
                    s21.o = m21.l;
                    s21.p = m21.m;
                    s21.q = m21.n;
                    s21.r = m21.r;
                    s21.s = m21.s;
                    s21.t = m21.t;
                    s21.u = m21.u;
                    s21.v = m21.D;
                    s21.w = m21.E;
                    s21.x = m21.F;
                    s21.y = m21.o;
                    s21.z = m21.p;
                    s21.A = m21.q;
                    s21.B = m21.S;
                    s21.C = m21.T;
                    s21.D = m21.U;
                    s21.f = m21.c;
                    s21.d = m21.a;
                    s21.e = m21.b;
                    s21.b = m21.width;
                    s21.c = m21.height;
                    s21.E = m21.leftMargin;
                    s21.F = m21.rightMargin;
                    s21.G = m21.topMargin;
                    s21.H = m21.bottomMargin;
                    s21.K = m21.C;
                    s21.S = m21.H;
                    s21.T = m21.G;
                    s21.V = m21.J;
                    s21.U = m21.I;
                    s21.k0 = m21.V;
                    s21.l0 = m21.W;
                    s21.W = m21.K;
                    s21.X = m21.L;
                    s21.Y = m21.O;
                    s21.Z = m21.P;
                    s21.a0 = m21.M;
                    s21.b0 = m21.N;
                    s21.c0 = m21.Q;
                    s21.d0 = m21.R;
                    s21.j0 = m21.X;
                    s21.M = m21.w;
                    s21.O = m21.y;
                    s21.L = m21.v;
                    s21.N = m21.x;
                    s21.Q = m21.z;
                    s21.P = m21.A;
                    s21.R = m21.B;
                    s21.n0 = m21.Y;
                    s21.I = m21.getMarginEnd();
                    s21.J = m21.getMarginStart();
                    u21.a = childAt.getVisibility();
                    u21.c = childAt.getAlpha();
                    v21.a = childAt.getRotation();
                    v21.b = childAt.getRotationX();
                    v21.c = childAt.getRotationY();
                    v21.d = childAt.getScaleX();
                    v21.e = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        v21.f = pivotX;
                        v21.g = pivotY;
                    }
                    v21.i = childAt.getTranslationX();
                    v21.j = childAt.getTranslationY();
                    v21.k = childAt.getTranslationZ();
                    if (v21.l) {
                        v21.m = childAt.getElevation();
                    }
                    if (childAt instanceof i50) {
                        i50 i50 = (i50) childAt;
                        s21.m0 = i50.getAllowsGoneWidget();
                        s21.h0 = i50.getReferencedIds();
                        s21.e0 = i50.getType();
                        s21.f0 = i50.getMargin();
                    }
                }
                i2++;
                w21 = this;
                childCount = i;
                hashMap2 = hashMap;
            } else {
                rf2.r("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    r21 d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.a = true;
                    }
                    this.c.put(Integer.valueOf(d2.a), d2);
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
