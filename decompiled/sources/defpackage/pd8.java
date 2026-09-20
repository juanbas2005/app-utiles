package defpackage;

import android.content.Context;
import android.graphics.Shader;
import android.os.Build;
import android.view.inputmethod.ExtractedText;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import cu.lestebang.utiletecsa.R;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: pd8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class pd8 {
    public static x83 A;
    public static x83 B;
    public static x83 C;
    public static final /* synthetic */ int D = 0;
    public static final int[][] a;
    public static final fw0 b = new fw0(-1230666825, new ww0(1), false);
    public static final fw0 c = new fw0(-468189188, new ww0(2), false);
    public static final fw0 d = new fw0(1333967608, new ww0(3), false);
    public static final fw0 e = new fw0(-1335544701, new ww0(4), false);
    public static final m60 f = new Object();
    public static final char[] g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final vq6 i = vq6.C;
    public static final float j = 96.0f;
    public static final float k = 4.0f;
    public static final float l = 44.0f;
    public static final rt0 m = rt0.M;
    public static final float n = 80.0f;
    public static final byte[] o = {48, 49, 53, 0};
    public static final byte[] p = {48, 49, 48, 0};
    public static final byte[] q = {48, 48, 57, 0};
    public static final byte[] r = {48, 48, 53, 0};
    public static final byte[] s = {48, 48, 49, 0};
    public static final byte[] t = {48, 48, 49, 0};
    public static final byte[] u = {48, 48, 50, 0};
    public static final rt0 v = rt0.E;
    public static final float w = 0.38f;
    public static final Object x = new Object();
    public static volatile bn8 y;
    public static volatile bn8 z;

    /* JADX WARNING: type inference failed for: r0v7, types: [m60, java.lang.Object] */
    static {
        int[] iArr = {121, 120, 127, 126, 133, 132, 139, 138, 145, 144, 151, 150, 157, 156, 163, 162, 169, 168, 175, 174, 181, 180, 187, 186, 193, 192, 199, 198, -2, -2};
        a = new int[][]{iArr, new int[]{123, 122, 129, 128, 135, 134, 141, 140, 147, 146, 153, 152, 159, 158, 165, 164, 171, 170, 177, 176, 183, 182, 189, 188, 195, 194, 201, 200, 816, -3}, new int[]{125, 124, 131, 130, 137, 136, 143, 142, 149, 148, 155, 154, 161, 160, 167, 166, 173, 172, 179, 178, ModuleDescriptor.MODULE_VERSION, 184, 191, 190, 197, 196, 203, 202, 818, 817}, new int[]{283, 282, 277, 276, 271, 270, 265, 264, 259, 258, 253, 252, 247, 246, 241, 240, 235, 234, 229, 228, 223, 222, 217, 216, 211, 210, 205, 204, 819, -3}, new int[]{285, 284, 279, 278, 273, 272, 267, 266, 261, 260, 255, 254, 249, 248, 243, 242, 237, 236, 231, 230, 225, 224, 219, 218, 213, 212, 207, 206, 821, 820}, new int[]{287, 286, 281, 280, 275, 274, 269, 268, 263, 262, 257, 256, 251, 250, 245, 244, 239, 238, 233, 232, 227, 226, 221, 220, 215, 214, 209, 208, 822, -3}, new int[]{289, 288, 295, 294, 301, 300, 307, 306, 313, 312, 319, 318, 325, 324, 331, 330, 337, 336, 343, 342, 349, 348, 355, 354, 361, 360, 367, 366, 824, 823}, new int[]{291, 290, 297, 296, 303, 302, 309, 308, 315, 314, 321, 320, 327, 326, 333, 332, 339, 338, 345, 344, 351, 350, 357, 356, 363, 362, 369, 368, 825, -3}, new int[]{293, 292, 299, 298, 305, 304, 311, 310, 317, 316, 323, 322, 329, 328, 335, 334, 341, 340, 347, 346, 353, 352, 359, 358, 365, 364, 371, 370, 827, 826}, new int[]{409, 408, 403, 402, 397, 396, 391, 390, 79, 78, -2, -2, 13, 12, 37, 36, 2, -1, 44, 43, 109, 108, 385, 384, 379, 378, 373, 372, 828, -3}, new int[]{411, 410, 405, 404, 399, 398, 393, 392, 81, 80, 40, -2, 15, 14, 39, 38, 3, -1, -1, 45, 111, 110, 387, 386, 381, 380, 375, 374, 830, 829}, new int[]{413, 412, 407, 406, 401, 400, 395, 394, 83, 82, 41, -3, -3, -3, -3, -3, 5, 4, 47, 46, 113, 112, 389, 388, 383, 382, 377, 376, 831, -3}, new int[]{415, 414, 421, 420, 427, 426, 103, 102, 55, 54, 16, -3, -3, -3, -3, -3, -3, -3, 20, 19, 85, 84, 433, 432, 439, 438, 445, 444, 833, 832}, new int[]{417, 416, 423, 422, 429, 428, 105, 104, 57, 56, -3, -3, -3, -3, -3, -3, -3, -3, 22, 21, 87, 86, 435, 434, 441, 440, 447, 446, 834, -3}, new int[]{419, 418, 425, 424, 431, 430, 107, 106, 59, 58, -3, -3, -3, -3, -3, -3, -3, -3, -3, 23, 89, 88, 437, 436, 443, 442, 449, 448, 836, 835}, new int[]{481, 480, 475, 474, 469, 468, 48, -2, 30, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 0, 53, 52, 463, 462, 457, 456, 451, 450, 837, -3}, new int[]{483, 482, 477, 476, 471, 470, 49, -1, -2, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -2, -1, 465, 464, 459, 458, 453, 452, 839, 838}, new int[]{485, 484, 479, 478, 473, 472, 51, 50, 31, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 1, -2, 42, 467, 466, 461, 460, 455, 454, 840, -3}, new int[]{487, 486, 493, 492, 499, 498, 97, 96, 61, 60, -3, -3, -3, -3, -3, -3, -3, -3, -3, 26, 91, 90, 505, 504, 511, 510, 517, 516, 842, 841}, new int[]{489, 488, 495, 494, 501, 500, 99, 98, 63, 62, -3, -3, -3, -3, -3, -3, -3, -3, 28, 27, 93, 92, 507, 506, 513, 512, 519, 518, 843, -3}, new int[]{491, 490, 497, 496, 503, 502, 101, 100, 65, 64, 17, -3, -3, -3, -3, -3, -3, -3, 18, 29, 95, 94, 509, 508, 515, 514, 521, 520, 845, 844}, new int[]{559, 558, 553, 552, 547, 546, 541, 540, 73, 72, 32, -3, -3, -3, -3, -3, -3, 10, 67, 66, 115, 114, 535, 534, 529, 528, 523, 522, 846, -3}, new int[]{561, 560, 555, 554, 549, 548, 543, 542, 75, 74, -2, -1, 7, 6, 35, 34, 11, -2, 69, 68, 117, 116, 537, 536, 531, 530, 525, 524, 848, 847}, new int[]{563, 562, 557, 556, 551, 550, 545, 544, 77, 76, -2, 33, 9, 8, 25, 24, -1, -2, 71, 70, 119, 118, 539, 538, 533, 532, 527, 526, 849, -3}, new int[]{565, 564, 571, 570, 577, 576, 583, 582, 589, 588, 595, 594, 601, 600, 607, 606, 613, 612, 619, 618, 625, 624, 631, 630, 637, 636, 643, 642, 851, 850}, new int[]{567, 566, 573, 572, 579, 578, 585, 584, 591, 590, 597, 596, 603, 602, 609, 608, 615, 614, 621, 620, 627, 626, 633, 632, 639, 638, 645, 644, 852, -3}, new int[]{569, 568, 575, 574, 581, 580, 587, 586, 593, 592, 599, 598, 605, 604, 611, 610, 617, 616, 623, 622, 629, 628, 635, 634, 641, 640, 647, 646, 854, 853}, new int[]{727, 726, 721, 720, 715, 714, 709, 708, 703, 702, 697, 696, 691, 690, 685, 684, 679, 678, 673, 672, 667, 666, 661, 660, 655, 654, 649, 648, 855, -3}, new int[]{729, 728, 723, 722, 717, 716, 711, 710, 705, 704, 699, 698, 693, 692, 687, 686, 681, 680, 675, 674, 669, 668, 663, 662, 657, 656, 651, 650, 857, 856}, new int[]{731, 730, 725, 724, 719, 718, 713, 712, 707, 706, 701, 700, 695, 694, 689, 688, 683, 682, 677, 676, 671, 670, 665, 664, 659, 658, 653, 652, 858, -3}, new int[]{733, 732, 739, 738, 745, 744, 751, 750, 757, 756, 763, 762, 769, 768, 775, 774, 781, 780, 787, 786, 793, 792, 799, 798, 805, 804, 811, 810, 860, 859}, new int[]{735, 734, 741, 740, 747, 746, 753, 752, 759, 758, 765, 764, 771, 770, 777, 776, 783, 782, 789, 788, 795, 794, 801, 800, 807, 806, 813, 812, 861, -3}, new int[]{737, 736, 743, 742, 749, 748, 755, 754, 761, 760, 767, 766, 773, 772, 779, 778, 785, 784, 791, 790, 797, 796, 803, 802, 809, 808, 815, 814, 863, 862}};
    }

    public static final void A(kk0 kk0, f61 f61, boolean z2) {
        Object obj;
        os7 os7;
        Object u2 = kk0.u();
        Throwable g2 = kk0.g(u2);
        if (g2 != null) {
            obj = new m66(g2);
        } else {
            obj = kk0.h(u2);
        }
        if (z2) {
            f61.getClass();
            sv1 sv1 = (sv1) f61;
            h61 h61 = sv1.A;
            Object obj2 = sv1.C;
            e81 r2 = h61.r();
            Object c2 = gh7.c(r2, obj2);
            if (c2 != gh7.a) {
                os7 = su0.R(h61, r2, c2);
            } else {
                os7 = null;
            }
            try {
                h61.f(obj);
                if (os7 == null || os7.z0()) {
                    gh7.a(r2, c2);
                }
            } catch (Throwable th) {
                if (os7 == null || os7.z0()) {
                    gh7.a(r2, c2);
                }
                throw th;
            }
        } else {
            f61.f(obj);
        }
    }

    public static void C(int i2, n21 n21, g31 g31, boolean z2) {
        float f2;
        float f3 = g31.c0;
        h21 h21 = g31.H;
        int d2 = h21.f.d();
        h21 h212 = g31.J;
        int d3 = h212.f.d();
        int e2 = h21.e() + d2;
        int e3 = d3 - h212.e();
        if (d2 == d3) {
            f3 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int n2 = g31.n();
        int i3 = (d3 - d2) - n2;
        if (d2 > d3) {
            i3 = (d2 - d3) - n2;
        }
        if (i3 > 0) {
            f2 = (f3 * ((float) i3)) + 0.5f;
        } else {
            f2 = f3 * ((float) i3);
        }
        int i4 = ((int) f2) + d2;
        int i5 = i4 + n2;
        if (d2 > d3) {
            i5 = i4 - n2;
        }
        g31.E(i4, i5);
        u(i2 + 1, n21, g31, z2);
    }

    public static void D(int i2, g31 g31, n21 n21, g31 g312, boolean z2) {
        int i3;
        float f2 = g312.c0;
        h21 h21 = g312.H;
        int e2 = h21.e() + h21.f.d();
        h21 h212 = g312.J;
        int d2 = h212.f.d() - h212.e();
        if (d2 >= e2) {
            int n2 = g312.n();
            if (g312.f0 != 8) {
                int i4 = g312.q;
                if (i4 == 2) {
                    if (g31 instanceof h31) {
                        i3 = g31.n();
                    } else {
                        i3 = g31.S.n();
                    }
                    n2 = (int) (g312.c0 * 0.5f * ((float) i3));
                } else if (i4 == 0) {
                    n2 = d2 - e2;
                }
                n2 = Math.max(g312.t, n2);
                int i5 = g312.u;
                if (i5 > 0) {
                    n2 = Math.min(i5, n2);
                }
            }
            int i6 = e2 + ((int) ((f2 * ((float) ((d2 - e2) - n2))) + 0.5f));
            g312.E(i6, n2 + i6);
            u(i2 + 1, n21, g312, z2);
        }
    }

    public static void E(int i2, n21 n21, g31 g31) {
        float f2;
        float f3 = g31.d0;
        h21 h21 = g31.I;
        int d2 = h21.f.d();
        h21 h212 = g31.K;
        int d3 = h212.f.d();
        int e2 = h21.e() + d2;
        int e3 = d3 - h212.e();
        if (d2 == d3) {
            f3 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int k2 = g31.k();
        int i3 = (d3 - d2) - k2;
        if (d2 > d3) {
            i3 = (d2 - d3) - k2;
        }
        if (i3 > 0) {
            f2 = (f3 * ((float) i3)) + 0.5f;
        } else {
            f2 = f3 * ((float) i3);
        }
        int i4 = (int) f2;
        int i5 = d2 + i4;
        int i6 = i5 + k2;
        if (d2 > d3) {
            i5 = d2 - i4;
            i6 = i5 - k2;
        }
        g31.F(i5, i6);
        Q(i2 + 1, n21, g31);
    }

    public static void F(int i2, g31 g31, n21 n21, g31 g312) {
        int i3;
        float f2 = g312.d0;
        h21 h21 = g312.I;
        int e2 = h21.e() + h21.f.d();
        h21 h212 = g312.K;
        int d2 = h212.f.d() - h212.e();
        if (d2 >= e2) {
            int k2 = g312.k();
            if (g312.f0 != 8) {
                int i4 = g312.r;
                if (i4 == 2) {
                    if (g31 instanceof h31) {
                        i3 = g31.k();
                    } else {
                        i3 = g31.S.k();
                    }
                    k2 = (int) (f2 * 0.5f * ((float) i3));
                } else if (i4 == 0) {
                    k2 = d2 - e2;
                }
                k2 = Math.max(g312.w, k2);
                int i5 = g312.x;
                if (i5 > 0) {
                    k2 = Math.min(i5, k2);
                }
            }
            int i6 = e2 + ((int) ((f2 * ((float) ((d2 - e2) - k2))) + 0.5f));
            g312.F(i6, k2 + i6);
            Q(i2 + 1, n21, g312);
        }
    }

    public static final Shader.TileMode G(int i2) {
        if (i2 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i2 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i2 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i2 != 3) {
            return Shader.TileMode.CLAMP;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Shader.TileMode.DECAL;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final Annotation H(lt3 lt3, ClassLoader classLoader) {
        lt3.getClass();
        String str = lt3.a;
        Class l2 = g18.l(classLoader, J(str), 0);
        if (l2 != null) {
            Map map = lt3.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(tf4.F(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), I((fu3) entry.getValue(), str, (String) entry.getKey(), classLoader));
            }
            return (Annotation) pv8.t(l2, linkedHashMap);
        }
        throw new Error("Annotation class not found: ".concat(str));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: t16} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: t16} */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (r1 == false) goto L_0x0085;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final Object I(fu3 fu3, String str, String str2, ClassLoader classLoader) {
        List parameters;
        as3 y2;
        gq3 gq3;
        Class cls;
        if (fu3 instanceof mt3) {
            return H(((mt3) fu3).a, classLoader);
        }
        int i2 = 0;
        if (fu3 instanceof nt3) {
            nt3 nt3 = (nt3) fu3;
            String str3 = nt3.a;
            gq3 x2 = x(classLoader, str3, false);
            if (x2 != null) {
                Class u2 = kl8.u(x2);
                int i3 = nt3.b;
                while (i2 < i3) {
                    u2 = g18.e(u2);
                    i2++;
                }
                return u2;
            }
            throw new Error("Unresolved class: ".concat(str3));
        }
        Object obj = null;
        if (fu3 instanceof ot3) {
            gq3 x3 = x(classLoader, str, false);
            if (x3 != null) {
                if (!kl8.u(x3).isAnnotation()) {
                    x3 = null;
                }
                if (x3 != null) {
                    zq3 zq3 = (zq3) dt0.R0(x3.r());
                    if (!(zq3 == null || (parameters = zq3.getParameters()) == null)) {
                        Iterator it = parameters.iterator();
                        boolean z2 = false;
                        t16 t16 = null;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (sg3.e(next.getName(), str2)) {
                                    if (z2) {
                                        break;
                                    }
                                    z2 = true;
                                    t16 = next;
                                }
                            }
                        }
                        t16 = null;
                        t16 t162 = t16;
                        if (!(t162 == null || (y2 = t162.y()) == null)) {
                            vq3 J = y2.J();
                            if (J instanceof gq3) {
                                gq3 = (gq3) J;
                            } else {
                                gq3 = null;
                            }
                            if (gq3 != null) {
                                Class u3 = kl8.u(gq3);
                                if (sg3.e(u3.getComponentType(), gq3.class)) {
                                    cls = Class.class;
                                } else {
                                    cls = u3.getComponentType();
                                }
                                ArrayList arrayList = ((ot3) fu3).a;
                                Object newInstance = Array.newInstance(cls, arrayList.size());
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    Array.set(newInstance, i2, I((fu3) it2.next(), str, (String) null, classLoader));
                                    i2++;
                                }
                                newInstance.getClass();
                                return newInstance;
                            }
                            rf2.x("Array parameter type is not a class: ", y2);
                            return null;
                        }
                    }
                    h.r("No parameter ", str2, " found in annotation constructor of ", str);
                    return null;
                }
            }
            throw new Error("Not an annotation class: ".concat(str));
        } else if (fu3 instanceof tt3) {
            tt3 tt3 = (tt3) fu3;
            String str4 = tt3.b;
            String str5 = tt3.a;
            Class l2 = g18.l(classLoader, J(str5), 0);
            if (l2 != null) {
                Object[] enumConstants = l2.getEnumConstants();
                enumConstants.getClass();
                int length = enumConstants.length;
                boolean z3 = false;
                Object obj2 = null;
                while (true) {
                    if (i2 < length) {
                        Object obj3 = enumConstants[i2];
                        obj3.getClass();
                        if (sg3.e(((Enum) obj3).name(), str4)) {
                            if (z3) {
                                break;
                            }
                            z3 = true;
                            obj2 = obj3;
                        }
                        i2++;
                    } else if (z3) {
                        obj = obj2;
                    }
                }
                if (obj != null) {
                    return obj;
                }
                throw new Error("Unresolved enum entry: " + str5 + '.' + str4);
            }
            throw new Error("Unresolved enum class: ".concat(str5));
        } else if (fu3 instanceof wt3) {
            String str6 = ((wt3) fu3).a;
            Class l3 = g18.l(classLoader, J(str6), 0);
            if (l3 != null) {
                return l3;
            }
            throw new Error("Unresolved class: ".concat(str6));
        } else if (fu3 instanceof bu3) {
            return Byte.valueOf(((bu3) fu3).a);
        } else {
            if (fu3 instanceof eu3) {
                return Short.valueOf(((eu3) fu3).a);
            }
            if (fu3 instanceof cu3) {
                return Integer.valueOf(((cu3) fu3).a);
            }
            if (fu3 instanceof du3) {
                return Long.valueOf(((du3) fu3).a);
            }
            if (fu3 instanceof xt3) {
                return ((xt3) fu3).a();
            }
            h.c();
            return null;
        }
    }

    public static final gq0 J(String str) {
        String str2;
        str.getClass();
        boolean u0 = k57.u0(str, ".", false);
        if (u0) {
            str = str.substring(1);
        }
        int L0 = d57.L0(str, '/', 0, 6);
        if (L0 == -1) {
            str2 = "";
        } else {
            str2 = str.substring(0, L0);
        }
        String replace = str2.replace('/', '.');
        replace.getClass();
        return new gq0(new up2(replace), new up2(d57.d1('/', str, str)), u0);
    }

    public static final ExtractedText K(hf7 hf7) {
        ExtractedText extractedText = new ExtractedText();
        String str = hf7.a.x;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = hf7.b;
        extractedText.selectionStart = lg7.f(j2);
        extractedText.selectionEnd = lg7.e(j2);
        extractedText.flags = d57.y0(hf7.a.x, 10) ^ true ? 1 : 0;
        return extractedText;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, h06] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e1 A[LOOP:0: B:27:0x00db->B:29:0x00e1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x025b  */
    public static final c2 L(uu3 uu3, ClassLoader classLoader, vp7 vp7, boolean z2, sr2 sr2) {
        boolean z3;
        vq3 vq3;
        Iterator it;
        uu3 uu32;
        c2 c2Var;
        yr3[] yr3Arr;
        r16 a2;
        hu3 hu3;
        String str;
        r16 a3;
        hu3 hu32;
        ro4 ro4;
        qc3 qc3;
        sr2 sr22;
        pu3 pu3;
        cu6 cu6;
        as3 as3;
        gs3 gs3;
        as3 as32;
        String str2;
        gq0 J;
        vq3 a4;
        uu3 uu33 = uu3;
        ClassLoader classLoader2 = classLoader;
        vp7 vp72 = vp7;
        sr2 sr23 = sr2;
        uu33.getClass();
        ArrayList arrayList = uu33.g;
        vp72.getClass();
        ? obj = new Object();
        List V = cl6.V(new cv2(new xg2(cl6.S(e7.V, uu33), e7.W, fl6.D), new l61(classLoader2, vp72, sr23, obj)));
        r16 a5 = uu33.a();
        qc3 qc32 = su.w;
        yr3[] yr3Arr2 = su.a;
        if (qc32.C(yr3Arr2[49], uu33) || z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (a5 instanceof hu3) {
            String str3 = ((hu3) a5).e0;
            if (sg3.e(str3, "kotlin/Array")) {
                as3 as33 = ((gs3) dt0.Q0(V)).b;
                if (as33 == null) {
                    as33 = k27.a;
                }
                vq3 = b26.a.b(g18.e(kl8.u(rj1.v(as33))));
                boolean C22 = qc32.C(yr3Arr2[49], uu33);
                ou3 ou33 = xp3.c;
                ou33.getClass();
                ArrayList arrayList22 = ((xp3) rj1.I(arrayList, ou33)).b;
                ArrayList arrayList32 = new ArrayList(et0.e0(arrayList22, 10));
                it = arrayList22.iterator();
                while (it.hasNext()) {
                    arrayList32.add(H((lt3) it.next(), classLoader2));
                }
                uu32 = uu33.d;
                if (uu32 == null) {
                    c2Var = M(uu32, classLoader2, vp72, (sr2) null, 12);
                } else {
                    c2Var = null;
                }
                qc3 qc332 = su.y;
                yr3Arr = su.a;
                boolean C32 = qc332.C(yr3Arr[51], uu33);
                a2 = uu33.a();
                if (!(a2 instanceof hu3)) {
                    hu3 = (hu3) a2;
                } else {
                    hu3 = null;
                }
                if (hu3 == null) {
                    str = hu3.e0;
                } else {
                    str = null;
                }
                boolean e22 = sg3.e(str, "kotlin/Nothing");
                qc3 qc342 = su.x;
                boolean C42 = qc342.C(yr3Arr[50], uu33);
                a3 = uu33.a();
                vq3 vq322 = vq3;
                if (!(a3 instanceof hu3)) {
                    hu32 = (hu3) a3;
                } else {
                    hu32 = null;
                }
                if (!(hu32 == null || (str2 = hu32.e0) == null)) {
                    J = J(str2);
                    if (tj3.l.containsKey(J)) {
                        ro4 = gw8.x(J.a(), (gq3) vq322);
                        ArrayList arrayList422 = arrayList;
                        qc3 = qc342;
                        boolean z422 = e22;
                        boolean z522 = C42;
                        obj.w = new cu6(vq322, V, C22, arrayList32, c2Var, C32, z422, z522, ro4, sr23);
                        if (qc3.C(yr3Arr[50], uu33)) {
                            Object obj2 = obj.w;
                            if (obj2 != null) {
                                cu6 cu62 = (cu6) obj2;
                                boolean z6 = cu62.E;
                                List list = cu62.y;
                                if (z6) {
                                    gs3 gs32 = (gs3) dt0.z0(list.size() - 2, list);
                                    if (!(gs32 == null || (as3 = gs32.b) == null)) {
                                        if (!(!sg3.e(as3.J(), b26.a.b(f61.class)) || (gs3 = (gs3) dt0.S0(as3.I())) == null || (as32 = gs3.b) == null)) {
                                            as3 as34 = as32;
                                            vq3 vq33 = cu62.x;
                                            List t0 = dt0.t0(2, list);
                                            gs3 gs33 = gs3.c;
                                            sr22 = sr2;
                                            cu6 = new cu6(vq33, dt0.N0(t0, x91.C(as34)), cu62.z, cu62.A, cu62.B, cu62.C, cu62.D, true, cu62.F, sr22);
                                            if (cu6 != null) {
                                                StringBuilder sb = new StringBuilder("Invalid suspend function type: ");
                                                Object obj3 = obj.w;
                                                if (obj3 == null) {
                                                    sg3.a0("result");
                                                    throw null;
                                                }
                                                sb.append((cu6) obj3);
                                                throw new Error(sb.toString());
                                            }
                                            obj.w = cu6;
                                        }
                                    }
                                    sr22 = sr2;
                                    cu6 = null;
                                    if (cu6 != null) {
                                    }
                                } else {
                                    rf2.j("Not a suspend function type: ", cu62);
                                    return null;
                                }
                            } else {
                                sg3.a0("result");
                                throw null;
                            }
                        } else {
                            sr22 = sr2;
                        }
                        pu3 = uu33.f;
                        if (pu3 == null || !sg3.e(pu3.b, "kotlin.jvm.PlatformType")) {
                            Object obj4 = obj.w;
                            if (obj4 != null) {
                                return (cu6) obj4;
                            }
                            sg3.a0("result");
                            throw null;
                        }
                        Object obj5 = obj.w;
                        if (obj5 != null) {
                            cu6 cu63 = (cu6) obj5;
                            c2 M = M(pu3.a, classLoader2, vp72, (sr2) null, 12);
                            ou3 ou32 = xp3.c;
                            ou32.getClass();
                            boolean z7 = ((xp3) rj1.I(arrayList422, ou32)).a;
                            M.getClass();
                            if (cu63.equals(M)) {
                                return cu63;
                            }
                            return new yg2(cu63, M, z7, sr22);
                        }
                        sg3.a0("result");
                        throw null;
                    }
                }
                ro4 = null;
                ArrayList arrayList4222 = arrayList;
                qc3 = qc342;
                boolean z4222 = e22;
                boolean z5222 = C42;
                obj.w = new cu6(vq322, V, C22, arrayList32, c2Var, C32, z4222, z5222, ro4, sr23);
                if (qc3.C(yr3Arr[50], uu33)) {
                }
                pu3 = uu33.f;
                if (pu3 == null || !sg3.e(pu3.b, "kotlin.jvm.PlatformType")) {
                }
            } else {
                a4 = x(classLoader2, str3, z3);
                if (a4 == null) {
                    throw new Error("Class not found: ".concat(str3));
                }
            }
        } else if (a5 instanceof iu3) {
            a4 = new bs3(J(((iu3) a5).e0).a());
        } else if (a5 instanceof ju3) {
            int i2 = ((ju3) a5).e0;
            a4 = vp72.a(i2);
            if (a4 == null) {
                a4 = new y62(i2);
            }
        } else {
            h.c();
            return null;
        }
        vq3 = a4;
        boolean C222 = qc32.C(yr3Arr2[49], uu33);
        ou3 ou332 = xp3.c;
        ou332.getClass();
        ArrayList arrayList222 = ((xp3) rj1.I(arrayList, ou332)).b;
        ArrayList arrayList322 = new ArrayList(et0.e0(arrayList222, 10));
        it = arrayList222.iterator();
        while (it.hasNext()) {
        }
        uu32 = uu33.d;
        if (uu32 == null) {
        }
        qc3 qc3322 = su.y;
        yr3Arr = su.a;
        boolean C322 = qc3322.C(yr3Arr[51], uu33);
        a2 = uu33.a();
        if (!(a2 instanceof hu3)) {
        }
        if (hu3 == null) {
        }
        boolean e222 = sg3.e(str, "kotlin/Nothing");
        qc3 qc3422 = su.x;
        boolean C422 = qc3422.C(yr3Arr[50], uu33);
        a3 = uu33.a();
        vq3 vq3222 = vq3;
        if (!(a3 instanceof hu3)) {
        }
        J = J(str2);
        if (tj3.l.containsKey(J)) {
        }
        ro4 = null;
        ArrayList arrayList42222 = arrayList;
        qc3 = qc3422;
        boolean z42222 = e222;
        boolean z52222 = C422;
        obj.w = new cu6(vq3222, V, C222, arrayList322, c2Var, C322, z42222, z52222, ro4, sr23);
        if (qc3.C(yr3Arr[50], uu33)) {
        }
        pu3 = uu33.f;
        if (pu3 == null || !sg3.e(pu3.b, "kotlin.jvm.PlatformType")) {
        }
    }

    public static /* synthetic */ c2 M(uu3 uu3, ClassLoader classLoader, vp7 vp7, sr2 sr2, int i2) {
        boolean z2;
        if ((i2 & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            sr2 = null;
        }
        return L(uu3, classLoader, vp7, z2, sr2);
    }

    public static final ks3 N(zu3 zu3) {
        zu3.getClass();
        int ordinal = zu3.ordinal();
        if (ordinal == 0) {
            return ks3.w;
        }
        if (ordinal == 1) {
            return ks3.x;
        }
        if (ordinal == 2) {
            return ks3.y;
        }
        h.c();
        return null;
    }

    public static final ls3 O(k78 k78) {
        k78.getClass();
        int ordinal = k78.ordinal();
        if (ordinal == 0) {
            return ls3.y;
        }
        ls3 ls3 = ls3.z;
        if (ordinal == 1) {
            return ls3;
        }
        if (ordinal == 2) {
            return ls3.x;
        }
        if (ordinal == 3) {
            return ls3.w;
        }
        if (ordinal != 4) {
            ls3 = null;
            if (ordinal == 5) {
                return null;
            }
            h.c();
        }
        return ls3;
    }

    public static final long P(int i2, int i3) {
        long j2 = (((long) i2) * 12) + ((long) i3);
        long j3 = j2 / 12;
        if (-2147483648L <= j3 && j3 <= 2147483647L) {
            return j2;
        }
        h.j(pb4.k("The total number of years in ", i2, " years and ", i3, " months overflows an Int"));
        return 0;
    }

    /* JADX WARNING: type inference failed for: r11v5, types: [m60, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v8, types: [m60, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v32, types: [m60, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5, types: [m60, java.lang.Object] */
    public static void Q(int i2, n21 n21, g31 g31) {
        boolean z2;
        h21 h21;
        h21 h212;
        float f2;
        h21 h213;
        h21 h214;
        h21 h215;
        n21 n212 = n21;
        g31 g312 = g31;
        if (!g312.m) {
            if (!(g312 instanceof h31) && g312.w() && j(g312)) {
                h31.Q(g312, n212, new Object());
            }
            h21 i3 = g312.i(3);
            h21 i4 = g312.i(5);
            int d2 = i3.d();
            int d3 = i4.d();
            HashSet hashSet = i3.a;
            if (hashSet != null && i3.c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    h21 h216 = (h21) it.next();
                    g31 g313 = h216.d;
                    int i5 = i2 + 1;
                    boolean j2 = j(g313);
                    h21 h217 = g313.I;
                    h21 h218 = g313.K;
                    if (!g313.w() || !j2) {
                        f2 = 0.0f;
                    } else {
                        f2 = 0.0f;
                        h31.Q(g313, n212, new Object());
                    }
                    int i6 = g313.o0[1];
                    if (i6 != 3 || j2) {
                        if (!g313.w()) {
                            if (h216 == h217 && h218.f == null) {
                                int e2 = h217.e() + d2;
                                g313.F(e2, g313.k() + e2);
                                Q(i5, n212, g313);
                            } else if (h216 == h218 && h218.f == null) {
                                int e3 = d2 - h218.e();
                                g313.F(e3 - g313.k(), e3);
                                Q(i5, n212, g313);
                            } else if (h216 == h217 && (h213 = h218.f) != null && h213.c) {
                                E(i5, n212, g313);
                            }
                        }
                    } else if (i6 == 3 && g313.x >= 0 && g313.w >= 0) {
                        if ((g313.f0 == 8 || (g313.r == 0 && g313.V == f2)) && !g313.v() && !g313.E) {
                            if (((h216 == h217 && (h215 = h218.f) != null && h215.c) || (h216 == h218 && (h214 = h217.f) != null && h214.c)) && !g313.v()) {
                                F(i5, g312, n212, g313);
                            }
                        }
                    }
                }
            }
            if (!(g312 instanceof zx2)) {
                HashSet hashSet2 = i4.a;
                if (hashSet2 != null && i4.c) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        h21 h219 = (h21) it2.next();
                        g31 g314 = h219.d;
                        int i7 = i2 + 1;
                        boolean j3 = j(g314);
                        h21 h2110 = g314.I;
                        h21 h2111 = g314.K;
                        if (g314.w() && j3) {
                            h31.Q(g314, n212, new Object());
                        }
                        if ((h219 != h2110 || (h212 = h2111.f) == null || !h212.c) && (h219 != h2111 || (h21 = h2110.f) == null || !h21.c)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        int i8 = g314.o0[1];
                        if (i8 != 3 || j3) {
                            if (!g314.w()) {
                                if (h219 == h2110 && h2111.f == null) {
                                    int e4 = h2110.e() + d3;
                                    g314.F(e4, g314.k() + e4);
                                    Q(i7, n212, g314);
                                } else if (h219 == h2111 && h2110.f == null) {
                                    int e5 = d3 - h2111.e();
                                    g314.F(e5 - g314.k(), e5);
                                    Q(i7, n212, g314);
                                } else if (z2 && !g314.v()) {
                                    E(i7, n212, g314);
                                }
                            }
                        } else if (i8 == 3 && g314.x >= 0 && g314.w >= 0) {
                            if ((g314.f0 == 8 || (g314.r == 0 && g314.V == 0.0f)) && !g314.v() && !g314.E && z2 && !g314.v()) {
                                F(i7, g312, n212, g314);
                            }
                        }
                    }
                }
                h21 i9 = g312.i(6);
                if (i9.a != null && i9.c) {
                    int d4 = i9.d();
                    Iterator it3 = i9.a.iterator();
                    while (it3.hasNext()) {
                        h21 h2112 = (h21) it3.next();
                        g31 g315 = h2112.d;
                        int i10 = i2 + 1;
                        boolean j4 = j(g315);
                        h21 h2113 = g315.L;
                        if (g315.w() && j4) {
                            h31.Q(g315, n212, new Object());
                        }
                        if ((g315.o0[1] != 3 || j4) && !g315.w() && h2112 == h2113) {
                            int e6 = h2112.e() + d4;
                            if (g315.D) {
                                int i11 = e6 - g315.Z;
                                int i12 = g315.U + i11;
                                g315.Y = i11;
                                g315.I.l(i11);
                                g315.K.l(i12);
                                h2113.l(e6);
                                g315.k = true;
                            }
                            Q(i10, n212, g315);
                        }
                    }
                }
                g312.m = true;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r15v4, types: [ax0, java.lang.Object, f1] */
    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ae, code lost:
        if (r15 == r12) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        r15 = new defpackage.f1((defpackage.yv4) new defpackage.i30(r13, r4));
        r15.c = new defpackage.o(20);
        r6.o0(r15);
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        r15 = (defpackage.ax0) r15;
        r6.e0(-585307852);
        r4 = r6.i(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d4, code lost:
        if ((r2 & 112) != 32) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d6, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d8, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d9, code lost:
        r4 = r4 | r5;
        r5 = r6.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        if (r4 != false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e0, code lost:
        if (r5 != r12) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e2, code lost:
        r5 = new defpackage.f5(4, r15, r1);
        r6.o0(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ea, code lost:
        defpackage.t49.l((defpackage.sr2) r5, r6);
        r4 = r2;
        r2 = java.lang.Boolean.valueOf(r0);
        r5 = r6.i(r15);
        r7 = r4 & 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fa, code lost:
        if (r7 != 4) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fd, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fe, code lost:
        r3 = r5 | r10;
        r4 = r6.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0104, code lost:
        if (r3 != false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0106, code lost:
        if (r4 != r12) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0108, code lost:
        r4 = new defpackage.j30(0, r15, r0);
        r6.o0(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0110, code lost:
        r3 = r15;
        defpackage.h49.k(r2, r3, (defpackage.t54) null, (defpackage.vr2) r4, r6, r7);
        r2 = r6.i(r11) | r6.i(r3);
        r4 = r6.Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0125, code lost:
        if (r2 != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0127, code lost:
        if (r4 != r12) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0129, code lost:
        r4 = new defpackage.m0(6, r11, r3);
        r6.o0(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0132, code lost:
        defpackage.t49.f(r11, r3, (defpackage.vr2) r4, r6);
        r6.r(false);
     */
    public static final void a(boolean r16, defpackage.sr2 r17, defpackage.yt2 r18, int r19) {
        /*
            r0 = r16
            r1 = r17
            r6 = r18
            r8 = r19
            r2 = -361453782(0xffffffffea74a72a, float:-7.3941827E25)
            r6.g0(r2)
            r2 = r8 & 6
            r3 = 4
            if (r2 != 0) goto L_0x001e
            boolean r2 = r6.h(r0)
            if (r2 == 0) goto L_0x001b
            r2 = r3
            goto L_0x001c
        L_0x001b:
            r2 = 2
        L_0x001c:
            r2 = r2 | r8
            goto L_0x001f
        L_0x001e:
            r2 = r8
        L_0x001f:
            r4 = r8 & 48
            r5 = 32
            if (r4 != 0) goto L_0x0030
            boolean r4 = r6.i(r1)
            if (r4 == 0) goto L_0x002d
            r4 = r5
            goto L_0x002f
        L_0x002d:
            r4 = 16
        L_0x002f:
            r2 = r2 | r4
        L_0x0030:
            r4 = r2 & 19
            r7 = 18
            r9 = 0
            r10 = 1
            if (r4 == r7) goto L_0x003a
            r4 = r10
            goto L_0x003b
        L_0x003a:
            r4 = r9
        L_0x003b:
            r7 = r2 & 1
            boolean r4 = r6.V(r7, r4)
            if (r4 == 0) goto L_0x0141
            yy0 r4 = defpackage.ja4.a
            java.lang.Object r4 = r6.k(r4)
            sv4 r4 = (defpackage.sv4) r4
            if (r4 != 0) goto L_0x005b
            r4 = 535274673(0x1fe7a4b1, float:9.8104764E-20)
            r6.e0(r4)
            w45 r4 = defpackage.la4.a(r6)
        L_0x0057:
            r6.r(r9)
            goto L_0x0062
        L_0x005b:
            r7 = 535271790(0x1fe7996e, float:9.8086134E-20)
            r6.e0(r7)
            goto L_0x0057
        L_0x0062:
            if (r4 == 0) goto L_0x013b
            boolean r7 = r6.g(r4)
            java.lang.Object r11 = r6.Q()
            d63 r12 = defpackage.ay0.a
            if (r7 != 0) goto L_0x0072
            if (r11 != r12) goto L_0x009b
        L_0x0072:
            h30 r11 = new h30
            boolean r7 = r4 instanceof defpackage.sv4
            r13 = 0
            if (r7 == 0) goto L_0x007d
            r7 = r4
            sv4 r7 = (defpackage.sv4) r7
            goto L_0x007e
        L_0x007d:
            r7 = r13
        L_0x007e:
            if (r7 == 0) goto L_0x0085
            rv4 r7 = r7.getNavigationEventDispatcher()
            goto L_0x0086
        L_0x0085:
            r7 = r13
        L_0x0086:
            boolean r14 = r4 instanceof defpackage.w45
            if (r14 == 0) goto L_0x008e
            r14 = r4
            w45 r14 = (defpackage.w45) r14
            goto L_0x008f
        L_0x008e:
            r14 = r13
        L_0x008f:
            if (r14 == 0) goto L_0x0095
            v45 r13 = r14.b()
        L_0x0095:
            r11.<init>(r7, r13)
            r6.o0(r11)
        L_0x009b:
            h30 r11 = (defpackage.h30) r11
            long r13 = r6.T
            boolean r7 = r6.g(r11)
            boolean r15 = r6.f(r13)
            r7 = r7 | r15
            java.lang.Object r15 = r6.Q()
            if (r7 != 0) goto L_0x00b0
            if (r15 != r12) goto L_0x00c6
        L_0x00b0:
            ax0 r15 = new ax0
            i30 r7 = new i30
            r7.<init>(r13, r4)
            r15.<init>((defpackage.yv4) r7)
            o r4 = new o
            r7 = 20
            r4.<init>(r7)
            r15.c = r4
            r6.o0(r15)
        L_0x00c6:
            ax0 r15 = (defpackage.ax0) r15
            r4 = -585307852(0xffffffffdd1ce934, float:-7.066641E17)
            r6.e0(r4)
            boolean r4 = r6.i(r15)
            r7 = r2 & 112(0x70, float:1.57E-43)
            if (r7 != r5) goto L_0x00d8
            r5 = r10
            goto L_0x00d9
        L_0x00d8:
            r5 = r9
        L_0x00d9:
            r4 = r4 | r5
            java.lang.Object r5 = r6.Q()
            if (r4 != 0) goto L_0x00e2
            if (r5 != r12) goto L_0x00ea
        L_0x00e2:
            f5 r5 = new f5
            r5.<init>(r3, r15, r1)
            r6.o0(r5)
        L_0x00ea:
            sr2 r5 = (defpackage.sr2) r5
            defpackage.t49.l(r5, r6)
            r4 = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            boolean r5 = r6.i(r15)
            r7 = r4 & 14
            if (r7 != r3) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            r10 = r9
        L_0x00fe:
            r3 = r5 | r10
            java.lang.Object r4 = r6.Q()
            if (r3 != 0) goto L_0x0108
            if (r4 != r12) goto L_0x0110
        L_0x0108:
            j30 r4 = new j30
            r4.<init>(r9, r15, r0)
            r6.o0(r4)
        L_0x0110:
            r5 = r4
            vr2 r5 = (defpackage.vr2) r5
            r4 = 0
            r3 = r15
            defpackage.h49.k(r2, r3, r4, r5, r6, r7)
            boolean r2 = r6.i(r11)
            boolean r4 = r6.i(r3)
            r2 = r2 | r4
            java.lang.Object r4 = r6.Q()
            if (r2 != 0) goto L_0x0129
            if (r4 != r12) goto L_0x0132
        L_0x0129:
            m0 r4 = new m0
            r2 = 6
            r4.<init>(r2, r11, r3)
            r6.o0(r4)
        L_0x0132:
            vr2 r4 = (defpackage.vr2) r4
            defpackage.t49.f(r11, r3, r4, r6)
            r6.r(r9)
            goto L_0x0144
        L_0x013b:
            java.lang.String r0 = "No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two."
            defpackage.h.s(r0)
            return
        L_0x0141:
            r6.Y()
        L_0x0144:
            yx5 r2 = r6.v()
            if (r2 == 0) goto L_0x0151
            k30 r3 = new k30
            r3.<init>(r0, r1, r8, r9)
            r2.d = r3
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd8.a(boolean, sr2, yt2, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, ul3] */
    /* JADX WARNING: type inference failed for: r1v1, types: [km3, pl3] */
    public static km3 b(vr2 vr2) {
        ol3 ol3 = pl3.d;
        ol3.getClass();
        ? obj = new Object();
        wl3 wl3 = ol3.a;
        obj.a = wl3.a;
        boolean z2 = wl3.e;
        obj.b = wl3.b;
        obj.c = wl3.c;
        String str = wl3.f;
        String str2 = wl3.g;
        fq0 fq0 = wl3.j;
        boolean z3 = wl3.i;
        obj.d = wl3.h;
        obj.e = wl3.d;
        z53 z53 = ol3.b;
        boolean z4 = wl3.k;
        vr2.y(obj);
        if (sg3.e(str, "    ")) {
            wl3 wl32 = new wl3(obj.a, obj.b, obj.c, obj.e, z2, str, str2, obj.d, z3, fq0, z4);
            z53.getClass();
            return new pl3(wl32, z53);
        }
        h.q("Indent should not be specified when default printing mode is used");
        return null;
    }

    public static final void c(bw4 bw4, boolean z2, sr2 sr2, sr2 sr22, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        sr2 sr23;
        yt2.g0(1220469155);
        if (yt2.g(bw4)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (yt2.h(z2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4 | 384;
        if (yt2.i(sr22)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5;
        if ((i8 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt2.V(i8 & 1, z3)) {
            Object Q = yt2.Q();
            d63 d63 = ay0.a;
            if (Q == d63) {
                Q = new o(20);
                yt2.o0(Q);
            }
            sr2 sr24 = (sr2) Q;
            Object Q2 = yt2.Q();
            if (Q2 == d63) {
                Q2 = new o(20);
                yt2.o0(Q2);
            }
            sr2 sr25 = (sr2) Q2;
            Object Q3 = yt2.Q();
            if (Q3 == d63) {
                Q3 = new o(20);
                yt2.o0(Q3);
            }
            int i9 = i8 << 9;
            sr2 sr26 = sr24;
            bw4 bw42 = bw4;
            boolean z4 = z2;
            sr2 sr27 = sr22;
            yt2 yt22 = yt2;
            sr2 sr28 = (sr2) Q3;
            d(bw42, false, sr25, sr28, z4, sr26, sr27, yt22, (i9 & 3670016) | (i8 & 14) | 3504 | (57344 & i9) | 196608);
            sr23 = sr26;
        } else {
            yt2.Y();
            sr23 = sr2;
        }
        yx5 v2 = yt2.v();
        if (v2 != null) {
            v2.d = new ai0((Object) bw4, z2, (ds2) sr23, sr22, i2, 7);
        }
    }

    public static final void d(bw4 bw4, boolean z2, sr2 sr2, sr2 sr22, boolean z3, sr2 sr23, sr2 sr24, yt2 yt2, int i2) {
        int i3;
        boolean z4;
        sr2 sr25;
        sr2 sr26;
        boolean z5;
        sr2 sr27;
        sr2 sr28;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        bw4 bw42 = bw4;
        yt2 yt22 = yt2;
        int i11 = i2;
        yt22.g0(898330592);
        if ((i11 & 6) == 0) {
            if (yt22.g(bw42)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i11;
        } else {
            i3 = i11;
        }
        if ((i11 & 48) == 0) {
            z4 = z2;
            if (yt22.h(z4)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        } else {
            z4 = z2;
        }
        if ((i11 & 384) == 0) {
            sr25 = sr2;
            if (yt22.i(sr25)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        } else {
            sr25 = sr2;
        }
        if ((i11 & 3072) == 0) {
            sr26 = sr22;
            if (yt22.i(sr26)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        } else {
            sr26 = sr22;
        }
        if ((i11 & 24576) == 0) {
            z5 = z3;
            if (yt22.h(z5)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        } else {
            z5 = z3;
        }
        if ((196608 & i11) == 0) {
            sr27 = sr23;
            if (yt22.i(sr27)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        } else {
            sr27 = sr23;
        }
        if ((1572864 & i11) == 0) {
            sr28 = sr24;
            if (yt22.i(sr28)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        } else {
            sr28 = sr24;
        }
        boolean z15 = false;
        if ((i3 & 599187) != 599186) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!yt22.V(i3 & 1, z6)) {
            yt22.Y();
        } else if (((Boolean) yt22.k(kd3.a)).booleanValue()) {
            yx5 v2 = yt22.v();
            if (v2 != null) {
                v2.d = new uv4(bw42, z4, sr25, sr26, z5, sr27, sr28, i11, 0);
                return;
            }
            return;
        } else {
            sv4 sv4 = (sv4) yt22.k(ja4.a);
            if (sv4 != null) {
                rv4 navigationEventDispatcher = sv4.getNavigationEventDispatcher();
                int i12 = i3 & 14;
                if (i12 == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                Object Q = yt22.Q();
                d63 d63 = ay0.a;
                if (z7 || Q == d63) {
                    Q = new fx0((yv4) bw42.c.getValue(), new h43(20, bw42));
                    yt22.o0(Q);
                }
                fx0 fx0 = (fx0) Q;
                boolean i13 = yt22.i(fx0);
                if ((i3 & 112) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z16 = i13 | z8;
                if ((i3 & 896) == 256) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z17 = z16 | z9;
                if ((i3 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z18 = z17 | z10;
                if ((57344 & i3) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z19 = z18 | z11;
                if ((458752 & i3) == 131072) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z20 = z19 | z12;
                if ((i3 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z21 = z13 | z20;
                if (i12 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z22 = z21 | z14;
                Object Q2 = yt22.Q();
                if (z22 || Q2 == d63) {
                    bw4 bw43 = bw42;
                    fx0 fx02 = fx0;
                    vv4 vv4 = new vv4(fx02, z2, sr2, sr22, z3, sr23, sr24, bw43);
                    fx0 = fx02;
                    bw42 = bw43;
                    yt22.o0(vv4);
                    Q2 = vv4;
                }
                t49.l((sr2) Q2, yt22);
                if (i12 == 4) {
                    z15 = true;
                }
                boolean i14 = z15 | yt22.i(fx0) | yt22.i(navigationEventDispatcher);
                Object Q3 = yt22.Q();
                if (i14 || Q3 == d63) {
                    Q3 = new g5((Object) bw42, (Object) fx0, (Object) navigationEventDispatcher, 22);
                    yt22.o0(Q3);
                }
                t49.e(bw42, (vr2) Q3, yt22);
            } else {
                h.s("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                return;
            }
        }
        yx5 v3 = yt22.v();
        if (v3 != null) {
            v3.d = new uv4(bw42, z2, sr2, sr22, z3, sr23, sr24, i2, 1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: o34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: f06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: f06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: h06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: o34} */
    /* JADX WARNING: type inference failed for: r20v1, types: [java.lang.Object, e06] */
    /* JADX WARNING: type inference failed for: r7v5, types: [java.lang.Object, d06] */
    /* JADX WARNING: type inference failed for: r8v10, types: [java.lang.Object, h06] */
    /* JADX WARNING: type inference failed for: r13v6, types: [java.lang.Object, f06] */
    /* JADX WARNING: type inference failed for: r3v12, types: [h61] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3 A[SYNTHETIC, Splitter:B:38:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    public static final Object e(o34 o34, int i2, int i3, tp1 tp1, h61 h61) {
        w24 w24;
        int i4;
        Object obj;
        o34 o342;
        int i5;
        o34 o343;
        int i6;
        w24 w242;
        il D2;
        Float f2;
        boolean z2;
        jf jfVar;
        int i7;
        f06 f06;
        float f3;
        o34 o344;
        h06 h06;
        d06 d06;
        float f4;
        w24 w243;
        float f5;
        int i8;
        int i9;
        f06 f062;
        o34 o345;
        w24 w244;
        o34 o346;
        w24 w245;
        int i10;
        o34 o347;
        w24 w246;
        int i11;
        o34 o348;
        h06 h062;
        d06 d062;
        w24 w247;
        int i12;
        w24 w248;
        int i13;
        float f6;
        boolean z3;
        boolean z4;
        int i14;
        d06 d063;
        h06 h063;
        o34 o349;
        d06 d064;
        f06 f063;
        int i15;
        h06 h064;
        int i16;
        int i17 = i2;
        tp1 tp12 = tp1;
        h61 h612 = h61;
        if (h612 instanceof w24) {
            w24 w249 = (w24) h612;
            int i18 = w249.K;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                w249.K = i18 - Integer.MIN_VALUE;
                w24 = w249;
                Object obj2 = w24.J;
                i4 = w24.K;
                int i19 = 30;
                float f7 = 0.0f;
                obj = p81.w;
                if (i4 != 0) {
                    o85.q(obj2);
                    if (((float) i17) < 0.0f) {
                        bc3.a("Index should be non-negative");
                    }
                    try {
                        float e0 = tp12.e0(2500.0f);
                        f4 = tp12.e0(1500.0f);
                        float e02 = tp12.e0(50.0f);
                        ? obj3 = new Object();
                        obj3.w = true;
                        ? obj4 = new Object();
                        obj4.w = gr8.a(0.0f, 0.0f, 30);
                        if (!w(o34, i2)) {
                            o34 o3410 = o34;
                            try {
                                i11 = i17;
                                w246 = w24;
                                o347 = o3410;
                                if (i17 > ((s34) o3410.c).h()) {
                                    i16 = 1;
                                } else {
                                    i16 = 0;
                                }
                                ? obj5 = new Object();
                                obj5.w = 1;
                                float f8 = e0;
                                f5 = e02;
                                i9 = i16;
                                f3 = f8;
                                i7 = i3;
                                f062 = obj5;
                                i12 = i17;
                                w247 = w24;
                                d062 = obj3;
                                h062 = obj4;
                                o348 = o3410;
                            } catch (mh3 e2) {
                                e = e2;
                                o346 = o347;
                                w245 = w246;
                                i10 = i11;
                                i6 = i10;
                                o345 = o346;
                                w244 = w245;
                                o343 = o345;
                                w242 = w244;
                                D2 = gr8.D(e.x, 0.0f, 0.0f, 30);
                                float f9 = (float) e.w;
                                Object obj6 = new Object();
                                f2 = new Float(f9);
                                if (((Number) D2.b()).floatValue() == 0.0f) {
                                }
                                jfVar = new jf(f9, obj6, o343, 1);
                                w242.z = o343;
                                w242.A = null;
                                w242.B = null;
                                w242.C = null;
                                w242.D = i6;
                                w242.K = 2;
                                if (i95.h(D2, f2, (x17) null, !z2, jfVar, w242, 2) != obj) {
                                }
                                return obj;
                            }
                        } else {
                            o34 o3411 = o34;
                            throw new mh3(o34.b(i2), (il) obj4.w);
                        }
                    } catch (mh3 e3) {
                        e = e3;
                        o346 = o34;
                        i10 = i17;
                        w245 = w24;
                        i6 = i10;
                        o345 = o346;
                        w244 = w245;
                        o343 = o345;
                        w242 = w244;
                        D2 = gr8.D(e.x, 0.0f, 0.0f, 30);
                        float f92 = (float) e.w;
                        Object obj62 = new Object();
                        f2 = new Float(f92);
                        if (((Number) D2.b()).floatValue() == 0.0f) {
                        }
                        jfVar = new jf(f92, obj62, o343, 1);
                        w242.z = o343;
                        w242.A = null;
                        w242.B = null;
                        w242.C = null;
                        w242.D = i6;
                        w242.K = 2;
                        if (i95.h(D2, f2, (x17) null, !z2, jfVar, w242, 2) != obj) {
                        }
                        return obj;
                    }
                } else if (i4 == 1) {
                    i9 = w24.F;
                    float f10 = w24.I;
                    f4 = w24.H;
                    f3 = w24.G;
                    int i20 = w24.E;
                    int i21 = w24.D;
                    f06 = w24.C;
                    h06 h065 = w24.B;
                    d06 d065 = w24.A;
                    o343 = w24.z;
                    try {
                        o85.q(obj2);
                        h06 h066 = h065;
                        o344 = o343;
                        h06 = h066;
                        f5 = f10;
                        i7 = i20;
                        i8 = i21;
                        w243 = w24;
                        d06 = d065;
                        o347 = o344;
                        w246 = w243;
                        i11 = i8;
                        f06.w++;
                        f062 = f06;
                        i19 = 30;
                        f7 = 0.0f;
                        o348 = o344;
                        h062 = h06;
                        d062 = d06;
                        w247 = w243;
                        i12 = i8;
                    } catch (mh3 e4) {
                        e = e4;
                        i6 = i21;
                        w242 = w24;
                        D2 = gr8.D(e.x, 0.0f, 0.0f, 30);
                        float f922 = (float) e.w;
                        Object obj622 = new Object();
                        f2 = new Float(f922);
                        if (((Number) D2.b()).floatValue() == 0.0f) {
                        }
                        jfVar = new jf(f922, obj622, o343, 1);
                        w242.z = o343;
                        w242.A = null;
                        w242.B = null;
                        w242.C = null;
                        w242.D = i6;
                        w242.K = 2;
                        if (i95.h(D2, f2, (x17) null, !z2, jfVar, w242, 2) != obj) {
                        }
                        return obj;
                    }
                } else if (i4 == 2) {
                    i5 = w24.D;
                    o342 = w24.z;
                    o85.q(obj2);
                    o342.f(i5);
                    return vs7.a;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                float f11 = f4;
                o347 = o348;
                w246 = w247;
                i11 = i12;
                if (d062.w) {
                    try {
                        o347 = o348;
                        w246 = w247;
                        i11 = i12;
                        switch (o348.a) {
                            case b85.b:
                                i13 = ((s34) o348.c).j().n;
                                break;
                            default:
                                i13 = ((ob5) o348.c).n();
                                break;
                        }
                    } catch (mh3 e5) {
                        e = e5;
                        i6 = i12;
                        w248 = w247;
                        o343 = o348;
                    }
                    if (i13 > 0) {
                        try {
                            try {
                                try {
                                    int b2 = o348.b(i12);
                                    if (((float) Math.abs(b2)) < f3) {
                                        o347 = o348;
                                        w246 = w247;
                                        i11 = i12;
                                        f6 = Math.max(Math.abs((float) b2), f5);
                                        if (i9 == 0) {
                                            f6 = -f6;
                                        }
                                    } else if (i9 != 0) {
                                        f6 = f3;
                                    } else {
                                        f6 = -f3;
                                    }
                                    il D3 = gr8.D((il) h062.w, f7, f7, i19);
                                    h062.w = D3;
                                    ? obj7 = new Object();
                                    Float f12 = new Float(f6);
                                    if (((Number) ((il) h062.w).b()).floatValue() == f7) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    boolean z5 = !z3;
                                    if (i9 != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    o347 = o348;
                                    w246 = w247;
                                    i11 = i12;
                                    v24 v24 = new v24(o349, i14, f6, obj7, d063, z4, f11, f062, i7, h063);
                                    w246 = w247;
                                    i11 = f063;
                                    o347 = h064;
                                    w247.z = o343;
                                    w247.A = d064;
                                    w247.B = h064;
                                    w247.C = f063;
                                    w247.D = i6;
                                    w247.E = i15;
                                    w247.G = f3;
                                    w247.H = f4;
                                    w247.I = f5;
                                    w247.F = i9;
                                    w247.K = 1;
                                    w246 = w247;
                                    i11 = f063;
                                    o347 = h064;
                                    if (i95.h(D3, f12, (x17) null, z5, v24, w248, 2) != obj) {
                                        h06 h067 = h064;
                                        o344 = o343;
                                        h06 = h067;
                                        f06 = f063;
                                        i8 = i6;
                                        i7 = i15;
                                        w243 = w248;
                                        d06 = d064;
                                        o347 = o344;
                                        w246 = w243;
                                        i11 = i8;
                                        f06.w++;
                                        f062 = f06;
                                        i19 = 30;
                                        f7 = 0.0f;
                                        o348 = o344;
                                        h062 = h06;
                                        d062 = d06;
                                        w247 = w243;
                                        i12 = i8;
                                        float f112 = f4;
                                        o347 = o348;
                                        w246 = w247;
                                        i11 = i12;
                                        if (d062.w) {
                                        }
                                    }
                                } catch (mh3 e6) {
                                    e = e6;
                                    w24 w2410 = w247;
                                    o343 = o349;
                                    i6 = i14;
                                    w242 = w247;
                                    D2 = gr8.D(e.x, 0.0f, 0.0f, 30);
                                    float f9222 = (float) e.w;
                                    Object obj6222 = new Object();
                                    f2 = new Float(f9222);
                                    if (((Number) D2.b()).floatValue() == 0.0f) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    jfVar = new jf(f9222, obj6222, o343, 1);
                                    w242.z = o343;
                                    w242.A = null;
                                    w242.B = null;
                                    w242.C = null;
                                    w242.D = i6;
                                    w242.K = 2;
                                    if (i95.h(D2, f2, (x17) null, !z2, jfVar, w242, 2) != obj) {
                                        i5 = i6;
                                        o342 = o343;
                                        o342.f(i5);
                                        return vs7.a;
                                    }
                                    return obj;
                                }
                                i14 = i12;
                                d063 = d062;
                                h063 = h062;
                                o349 = o348;
                            } catch (mh3 e7) {
                                e = e7;
                                w242 = w248;
                                D2 = gr8.D(e.x, 0.0f, 0.0f, 30);
                                float f92222 = (float) e.w;
                                Object obj62222 = new Object();
                                f2 = new Float(f92222);
                                if (((Number) D2.b()).floatValue() == 0.0f) {
                                }
                                jfVar = new jf(f92222, obj62222, o343, 1);
                                w242.z = o343;
                                w242.A = null;
                                w242.B = null;
                                w242.C = null;
                                w242.D = i6;
                                w242.K = 2;
                                if (i95.h(D2, f2, (x17) null, !z2, jfVar, w242, 2) != obj) {
                                }
                                return obj;
                            }
                            w248 = w247;
                        } catch (mh3 e8) {
                            e = e8;
                            w24 w2411 = w247;
                            w242 = w247;
                            D2 = gr8.D(e.x, 0.0f, 0.0f, 30);
                            float f922222 = (float) e.w;
                            Object obj622222 = new Object();
                            f2 = new Float(f922222);
                            if (((Number) D2.b()).floatValue() == 0.0f) {
                            }
                            jfVar = new jf(f922222, obj622222, o343, 1);
                            w242.z = o343;
                            w242.A = null;
                            w242.B = null;
                            w242.C = null;
                            w242.D = i6;
                            w242.K = 2;
                            if (i95.h(D2, f2, (x17) null, !z2, jfVar, w242, 2) != obj) {
                            }
                            return obj;
                        }
                        o343 = o349;
                        i6 = i14;
                        d064 = d063;
                        f4 = f112;
                        f063 = f062;
                        i15 = i7;
                        h064 = h063;
                        return obj;
                    }
                }
                return vs7.a;
            }
        }
        w24 = new h61(h612);
        Object obj22 = w24.J;
        i4 = w24.K;
        int i192 = 30;
        float f72 = 0.0f;
        obj = p81.w;
        if (i4 != 0) {
        }
        float f1122 = f4;
        try {
            o347 = o348;
            w246 = w247;
            i11 = i12;
            if (d062.w) {
            }
        } catch (mh3 e9) {
            e = e9;
            i6 = i12;
            w24 w2412 = w247;
            o345 = o348;
            w244 = w247;
            o343 = o345;
            w242 = w244;
            D2 = gr8.D(e.x, 0.0f, 0.0f, 30);
            float f9222222 = (float) e.w;
            Object obj6222222 = new Object();
            f2 = new Float(f9222222);
            if (((Number) D2.b()).floatValue() == 0.0f) {
            }
            jfVar = new jf(f9222222, obj6222222, o343, 1);
            w242.z = o343;
            w242.A = null;
            w242.B = null;
            w242.C = null;
            w242.D = i6;
            w242.K = 2;
            if (i95.h(D2, f2, (x17) null, !z2, jfVar, w242, 2) != obj) {
            }
            return obj;
        }
        return vs7.a;
    }

    public static final boolean f(boolean z2, o34 o34, int i2) {
        if (z2) {
            if (o34.c() > i2) {
                return true;
            }
            if (o34.c() != i2 || o34.d() <= 0) {
                return false;
            }
            return true;
        } else if (o34.c() < i2) {
            return true;
        } else {
            if (o34.c() != i2 || o34.d() >= 0) {
                return false;
            }
            return true;
        }
    }

    public static final void g(StringBuilder sb, Class<?> cls) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
        } else if (cls.equals(Integer.TYPE)) {
            sb.append("I");
        } else if (cls.equals(Long.TYPE)) {
            sb.append("J");
        } else if (cls.equals(Short.TYPE)) {
            sb.append("S");
        } else if (cls.equals(Byte.TYPE)) {
            sb.append("B");
        } else if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
        } else if (cls.equals(Character.TYPE)) {
            sb.append("C");
        } else if (cls.equals(Float.TYPE)) {
            sb.append("F");
        } else if (cls.equals(Double.TYPE)) {
            sb.append("D");
        } else {
            sb.append("L");
            String replace = cls.getName().replace('.', '/');
            replace.getClass();
            sb.append(replace);
            sb.append(";");
        }
    }

    public static String i(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i2 = 0; i2 < length; i2++) {
            char[] cArr = g;
            sb.append(cArr[(bArr[i2] & 240) >>> 4]);
            sb.append(cArr[bArr[i2] & 15]);
        }
        return sb.toString();
    }

    public static boolean j(g31 g31) {
        h31 h31;
        boolean z2;
        boolean z3;
        int[] iArr = g31.o0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        g31 g312 = g31.S;
        if (g312 != null) {
            h31 = (h31) g312;
        } else {
            h31 = null;
        }
        if (h31 != null) {
            int i4 = h31.o0[0];
        }
        if (h31 != null) {
            int i5 = h31.o0[1];
        }
        if (i2 == 1 || g31.x() || i2 == 2 || ((i2 == 3 && g31.q == 0 && g31.V == 0.0f && g31.q(0)) || (i2 == 3 && g31.q == 1 && g31.r(0, g31.n())))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i3 == 1 || g31.y() || i3 == 2 || ((i3 == 3 && g31.r == 0 && g31.V == 0.0f && g31.q(1)) || (i2 == 3 && g31.r == 1 && g31.r(1, g31.k())))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((g31.V <= 0.0f || (!z2 && !z3)) && (!z2 || !z3)) {
            return false;
        }
        return true;
    }

    public static int k(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            if (comparable2 == null) {
                return 0;
            }
            return -1;
        } else if (comparable2 == null) {
            return 1;
        } else {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    public static final String l(su3 su3, yq3 yq3) {
        String str;
        to3 to3 = tf4.z(su3).c;
        if (to3 != null) {
            return to3.toString();
        }
        fo3 fo3 = tf4.z(su3).b;
        String str2 = 0;
        if (fo3 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mn3.a(fo3.C));
        if (su.b(su3) != k78.x || !(yq3 instanceof oq3)) {
            if (su.b(su3) == k78.y && (yq3 instanceof pr3)) {
                pr3 pr3 = (pr3) yq3;
                y16 y16 = ((or3) pr3.y.getValue()).d;
                yr3 yr3 = or3.g[0];
                v16 v16 = (v16) y16.b();
                if (v16 != null) {
                    str2 = v16.b.a;
                }
                if (str2 == gv3.E) {
                    str = "$".concat(pr3.x.getSimpleName());
                }
            }
            str = "";
        } else {
            gu3 d0 = ((oq3) yq3).d0();
            if (d0 != null) {
                str2 = tf4.w(d0).b;
            }
            if (str2 == null) {
                str2 = "main";
            }
            str = "$".concat(xq4.a.g(str2, "_"));
        }
        sb.append(str);
        sb.append("()");
        sb.append(fo3.D);
        return sb.toString();
    }

    public static at2 m(ss2 ss2, boolean z2) {
        String lowerCase;
        ss2 ss22 = ss2;
        ss22.getClass();
        List list = ss22.G;
        at2 at2 = new at2(ss22, (at2) null, 1, z2);
        qz3 Q = ss22.Q();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((qp7) next).I() != k28.z) {
                break;
            }
            arrayList.add(next);
        }
        ss h1 = dt0.h1(arrayList);
        ArrayList arrayList2 = new ArrayList(et0.e0(h1, 10));
        Iterator it = h1.iterator();
        while (true) {
            f02 f02 = (f02) it;
            if (f02.x.hasNext()) {
                ka3 ka3 = (ka3) f02.next();
                int i2 = ka3.a;
                qp7 qp7 = (qp7) ka3.b;
                String b2 = qp7.getName().b();
                b2.getClass();
                if (b2.equals("T")) {
                    lowerCase = "instance";
                } else if (b2.equals("E")) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = b2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                qp7 qp72 = qp7;
                at2 at22 = at2;
                qp7 qp73 = qp72;
                qm qmVar = me6.x;
                uq4 e2 = uq4.e(lowerCase);
                fu6 g0 = qp73.g0();
                g0.getClass();
                arrayList2.add(new h28(at22, (h28) null, i2, qmVar, e2, g0, false, false, false, (vw3) null, sy6.j));
                at2 = at22;
            } else {
                at2 at23 = at2;
                fu6 g02 = ((qp7) dt0.G0(list)).g0();
                fl4 fl4 = fl4.A;
                us1 us1 = vs1.e;
                a42 a42 = a42.w;
                at2.k1((qz3) null, Q, a42, a42, arrayList2, g02, fl4, us1);
                at2 at24 = at2;
                at24.S = true;
                return at24;
            }
        }
    }

    public static final nd8 o(Context context, f01 f01) {
        y86 y86;
        context.getClass();
        qd8 qd8 = new qd8(f01.c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ol6 ol6 = qd8.a;
        ol6.getClass();
        z53 z53 = f01.d;
        boolean z2 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        z53.getClass();
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z2) {
            y86 = new y86(applicationContext, cls, (String) null);
            y86.i = true;
        } else {
            y86 = fb5.g(applicationContext, cls, "androidx.work.workdb");
            y86.h = new c9(24, applicationContext);
        }
        y86.f = ol6;
        y86.d.add(new yq0(z53));
        y86.a(wk4.h);
        y86.a(new j56(applicationContext, 2, 3));
        y86.a(wk4.i);
        y86.a(wk4.j);
        y86.a(new j56(applicationContext, 5, 6));
        y86.a(wk4.k);
        y86.a(wk4.l);
        y86.a(wk4.m);
        y86.a(new j56(applicationContext));
        y86.a(new j56(applicationContext, 10, 11));
        y86.a(wk4.d);
        y86.a(wk4.e);
        y86.a(wk4.f);
        y86.a(wk4.g);
        y86.a(new j56(applicationContext, 21, 22));
        y86.p = false;
        y86.q = true;
        y86.r = true;
        WorkDatabase workDatabase = (WorkDatabase) y86.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        zk7 zk7 = new zk7(applicationContext2, qd8);
        lp5 lp5 = new lp5(context.getApplicationContext(), f01, qd8, workDatabase);
        Context context2 = context;
        f01 f012 = f01;
        return new nd8(context2.getApplicationContext(), f012, qd8, workDatabase, (List) od8.D.F(context2, f012, qd8, workDatabase, zk7, lp5), lp5, zk7);
    }

    public static final Method p(wq3 wq3, String str) {
        str.getClass();
        if (!(wq3 instanceof vp0)) {
            return null;
        }
        String f1 = d57.f1(str, '(');
        if (!f1.equals("<init>")) {
            Method[] declaredMethods = ((vp0) wq3).b().getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (sg3.e(method.getName(), f1)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(method.getName());
                    sb.append("(");
                    Class[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    for (Class cls : parameterTypes) {
                        cls.getClass();
                        g(sb, cls);
                    }
                    sb.append(")");
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    g(sb, returnType);
                    if (sb.toString().equals(str)) {
                        return method;
                    }
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("Generic Java constructors are not supported: " + wq3 + '/' + str);
    }

    public static tj0 q(int i2) {
        float f2;
        int i3 = i2;
        cr2 cr2 = cr2.k;
        float C2 = gw8.C((i3 >> 16) & 255);
        float C3 = gw8.C((i3 >> 8) & 255);
        float C4 = gw8.C(i3 & 255);
        double[][] dArr = gw8.e;
        double d2 = (double) C2;
        double[] dArr2 = dArr[0];
        double d3 = (double) C3;
        double d4 = (double) C4;
        double d5 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d6 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d5, (float) d6, (float) ((d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]))};
        float[][] fArr2 = gw8.b;
        float f3 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = fArr3[1] * f4;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5 + (fArr3[0] * f3);
        float[] fArr4 = fArr2[1];
        float f8 = fArr4[1] * f4;
        float f9 = fArr4[2] * f6;
        float[] fArr5 = fArr2[2];
        float f10 = f3 * fArr5[0];
        float f11 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + f10;
        float[] fArr6 = cr2.g;
        float f12 = cr2.e;
        float f13 = cr2.b;
        float f14 = fArr6[0] * f7;
        float f15 = fArr6[1] * (f9 + f8 + (fArr4[0] * f3));
        float f16 = fArr6[2] * f11;
        float f17 = cr2.h;
        float pow = (float) Math.pow((double) ((Math.abs(f14) * f17) / 100.0f), 0.41999998688697815d);
        float pow2 = (float) Math.pow((double) ((Math.abs(f15) * f17) / 100.0f), 0.41999998688697815d);
        float pow3 = (float) Math.pow((double) ((Math.abs(f16) * f17) / 100.0f), 0.41999998688697815d);
        float signum = ((Math.signum(f14) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        float f18 = (((-12.0f * signum2) + (signum * 11.0f)) + signum3) / 11.0f;
        float f19 = ((signum + signum2) - (signum3 * 2.0f)) / 9.0f;
        float f20 = signum2 * 20.0f;
        float f21 = ((21.0f * signum3) + ((signum * 20.0f) + f20)) / 20.0f;
        float f22 = (((signum * 40.0f) + f20) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f19, (double) f18)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f23 = atan2;
        float f24 = (f23 * 3.1415927f) / 180.0f;
        float f25 = f19;
        float pow4 = ((float) Math.pow((double) ((f22 * cr2.c) / f13), (double) (cr2.j * f12))) * 100.0f;
        if (((double) f23) < 20.14d) {
            f2 = 360.0f + f23;
        } else {
            f2 = f23;
        }
        float pow5 = ((float) Math.pow((double) (((((((((float) Math.cos((double) (((f2 * 3.1415927f) / 180.0f) + 2.0f))) + 3.8f) * 0.25f) * 3846.1538f) * cr2.f) * cr2.d) * ((float) Math.sqrt((double) ((f25 * f25) + (f18 * f18))))) / (f21 + 0.305f)), 0.8999999761581421d)) * ((float) Math.pow((double) (1.64f - ((float) Math.pow(0.28999999165534973d, (double) cr2.a))), 0.7300000190734863d));
        float sqrt = pow5 * ((float) Math.sqrt((double) (pow4 / 100.0f)));
        Math.sqrt((double) ((pow5 * f12) / (f13 + 4.0f)));
        float f26 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((cr2.i * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d7 = (double) f24;
        return new tj0(f23, sqrt, pow4, f26, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    public static tj0 r(float f2, float f3, float f4) {
        cr2 cr2 = cr2.k;
        Math.sqrt((double) (((f3 / ((float) Math.sqrt(((double) f2) / 100.0d))) * cr2.e) / (cr2.b + 4.0f)));
        float f5 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((((double) (cr2.i * f3)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (double) ((3.1415927f * f4) / 180.0f);
        return new tj0(f4, f3, f2, f5, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static final gj s(e81 e81) {
        gj gjVar = (gj) e81.a0(d63.F);
        if (gjVar != null) {
            return gjVar;
        }
        h.s("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* JADX WARNING: type inference failed for: r14v8, types: [m60, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v22, types: [m60, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v11, types: [m60, java.lang.Object] */
    public static void u(int i2, n21 n21, g31 g31, boolean z2) {
        boolean z3;
        h21 h21;
        h21 h212;
        char c2;
        h21 h213;
        h21 h214;
        h21 h215;
        n21 n212 = n21;
        g31 g312 = g31;
        boolean z4 = z2;
        if (!g312.l) {
            if (!(g312 instanceof h31) && g312.w() && j(g312)) {
                h31.Q(g312, n212, new Object());
            }
            h21 i3 = g312.i(2);
            h21 i4 = g312.i(4);
            int d2 = i3.d();
            int d3 = i4.d();
            HashSet hashSet = i3.a;
            if (hashSet != null && i3.c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    h21 h216 = (h21) it.next();
                    g31 g313 = h216.d;
                    int i5 = i2 + 1;
                    boolean j2 = j(g313);
                    h21 h217 = g313.H;
                    h21 h218 = g313.J;
                    if (!g313.w() || !j2) {
                        c2 = 0;
                    } else {
                        c2 = 0;
                        h31.Q(g313, n212, new Object());
                    }
                    int i6 = g313.o0[c2];
                    if (i6 != 3 || j2) {
                        if (!g313.w()) {
                            if (h216 == h217 && h218.f == null) {
                                int e2 = h217.e() + d2;
                                g313.E(e2, g313.n() + e2);
                                u(i5, n212, g313, z4);
                            } else if (h216 == h218 && h217.f == null) {
                                int e3 = d2 - h218.e();
                                g313.E(e3 - g313.n(), e3);
                                u(i5, n212, g313, z4);
                            } else if (h216 == h217 && (h213 = h218.f) != null && h213.c && !g313.u()) {
                                C(i5, n212, g313, z4);
                            }
                        }
                    } else if (i6 == 3 && g313.u >= 0 && g313.t >= 0) {
                        if ((g313.f0 == 8 || (g313.q == 0 && g313.V == 0.0f)) && !g313.u() && !g313.E) {
                            if (((h216 == h217 && (h215 = h218.f) != null && h215.c) || (h216 == h218 && (h214 = h217.f) != null && h214.c)) && !g313.u()) {
                                D(i5, g312, n212, g313, z4);
                            }
                        }
                    }
                }
            }
            if (!(g312 instanceof zx2)) {
                HashSet hashSet2 = i4.a;
                if (hashSet2 != null && i4.c) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        h21 h219 = (h21) it2.next();
                        g31 g314 = h219.d;
                        int i7 = i2 + 1;
                        boolean j3 = j(g314);
                        h21 h2110 = g314.H;
                        h21 h2111 = g314.J;
                        if (g314.w() && j3) {
                            h31.Q(g314, n212, new Object());
                        }
                        if ((h219 != h2110 || (h212 = h2111.f) == null || !h212.c) && (h219 != h2111 || (h21 = h2110.f) == null || !h21.c)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        int i8 = g314.o0[0];
                        if (i8 != 3 || j3) {
                            if (!g314.w()) {
                                if (h219 == h2110 && h2111.f == null) {
                                    int e4 = h2110.e() + d3;
                                    g314.E(e4, g314.n() + e4);
                                    u(i7, n212, g314, z4);
                                } else if (h219 == h2111 && h2110.f == null) {
                                    int e5 = d3 - h2111.e();
                                    g314.E(e5 - g314.n(), e5);
                                    u(i7, n212, g314, z4);
                                } else if (z3 && !g314.u()) {
                                    C(i7, n212, g314, z4);
                                }
                            }
                        } else if (i8 == 3 && g314.u >= 0 && g314.t >= 0) {
                            if ((g314.f0 == 8 || (g314.q == 0 && g314.V == 0.0f)) && !g314.u() && !g314.E && z3 && !g314.u()) {
                                D(i7, g312, n212, g314, z4);
                            }
                        }
                    }
                }
                g312.l = true;
            }
        }
    }

    public static final boolean w(o34 o34, int i2) {
        int c2 = o34.c();
        if (i2 > o34.e() || c2 > i2) {
            return false;
        }
        return true;
    }

    public static final gq3 x(ClassLoader classLoader, String str, boolean z2) {
        Class cls;
        str.getClass();
        Class l2 = g18.l(classLoader, J(str), 0);
        if (l2 == null) {
            return null;
        }
        if (!z2 && (cls = (Class) m06.b.get(l2)) != null) {
            l2 = cls;
        }
        return b26.a.b(l2);
    }

    public static int y(int[] iArr, int i2) {
        for (int max : iArr) {
            i2 = Math.max(i2, max);
        }
        return i2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [n80, nd0] */
    public static nd0 z(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        pe3 pe3 = new pe3(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(et0.e0(pe3, 10));
        Iterator it = pe3.iterator();
        while (((qe3) it).y) {
            ((je3) it).nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] a1 = dt0.a1(arrayList);
        int[] copyOf = Arrays.copyOf(a1, a1.length);
        return new n80(Arrays.copyOf(copyOf, copyOf.length));
    }

    public abstract void B(fr6 fr6, float f2);

    public abstract void h(ab6 ab6, Object obj);

    public abstract String n();

    public abstract float t(fr6 fr6);

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        defpackage.dh4.f(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        throw r3;
     */
    public void v(ua6 ua6, Object obj) {
        ua6.getClass();
        if (obj != null) {
            ab6 k0 = ua6.k0(n());
            h(k0, obj);
            k0.i0();
            dh4.f(k0, (Throwable) null);
        }
    }
}
