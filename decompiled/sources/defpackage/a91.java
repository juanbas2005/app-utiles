package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: a91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a91 implements Comparator {
    public static final a91 A = new a91(3);
    public static final a91 B = new a91(4);
    public static final a91 C = new a91(5);
    public static final a91 D = new a91(6);
    public static final a91 x = new a91(0);
    public static final a91 y = new a91(1);
    public static final a91 z = new a91(2);
    public final /* synthetic */ int w;

    public /* synthetic */ a91(int i) {
        this.w = i;
    }

    public static int a(vj1 vj1) {
        if (vj1 == null) {
            rs1.a(36);
            throw null;
        } else if (rs1.l(vj1, iq0.z)) {
            return 8;
        } else {
            if (vj1 instanceof s31) {
                return 7;
            }
            if (vj1 instanceof cr5) {
                if (((cr5) vj1).b0() == null) {
                    return 6;
                }
                return 5;
            } else if (vj1 instanceof xs2) {
                if (((xs2) vj1).b0() == null) {
                    return 4;
                }
                return 3;
            } else if (vj1 instanceof ql4) {
                return 2;
            } else {
                if (vj1 instanceof ut1) {
                    return 1;
                }
                return 0;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: c2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: c2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v89, resolved type: c2} */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v12, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0427  */
    /* JADX WARNING: Unknown variable types count: 2 */
    public final int compare(Object obj, Object obj2) {
        c2 c2Var;
        boolean z2;
        c2 c2Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        Integer num = null;
        switch (this.w) {
            case b85.b /*0*/:
                p16 p16 = (p16) obj;
                p16 p162 = (p16) obj2;
                p16.getClass();
                p162.getClass();
                is3 g = mb2.g(p16.getTypeParameters(), p162.getTypeParameters());
                if (g != null) {
                    as3 k = p16.k();
                    is3 is3 = is3.c;
                    as3 as3 = g.b(k, ks3.w).b;
                    if (as3 != null) {
                        as3 k2 = p162.k();
                        boolean P = ie1.P(as3, k2);
                        boolean P2 = ie1.P(k2, as3);
                        if (!P || P2) {
                            if (P2 && !P) {
                                return 1;
                            }
                            if (as3 instanceof c2) {
                                c2Var = (c2) as3;
                            } else {
                                c2Var = null;
                            }
                            if (c2Var != null) {
                                if (c2Var.D() == null) {
                                    c2Var = null;
                                }
                                if (c2Var != null) {
                                    z2 = true;
                                    if (!(k2 instanceof c2)) {
                                        c2Var2 = (c2) k2;
                                    } else {
                                        c2Var2 = null;
                                    }
                                    if (c2Var2 != null) {
                                        if (c2Var2.D() != null) {
                                            num = c2Var2;
                                        }
                                        if (num != null) {
                                            z3 = true;
                                            if (!z3 || z2) {
                                                if (z2 && !z3) {
                                                    return 1;
                                                }
                                            }
                                        }
                                    }
                                    z3 = false;
                                    return 1;
                                }
                            }
                            z2 = false;
                            if (!(k2 instanceof c2)) {
                            }
                            if (c2Var2 != null) {
                            }
                            z3 = false;
                            return 1;
                        }
                        return -1;
                    }
                    mb2.f(p16.getName());
                    throw null;
                }
                kj6.l("Intersection overrides can't have different type parameters sizes. It must have been reported by the compiler. The following members appear to be violating intersection overrides: '", p16, "' '", p162);
                return 0;
            case 1:
                vk2 vk2 = (vk2) obj;
                vk2 vk22 = (vk2) obj2;
                if (bb0.q0(vk2) && bb0.q0(vk22)) {
                    uy3 O0 = rc9.O0(vk2);
                    uy3 O02 = rc9.O0(vk22);
                    if (!sg3.e(O0, O02)) {
                        uy3[] uy3Arr = new uy3[16];
                        int i = 0;
                        while (O0 != null) {
                            int i2 = i + 1;
                            if (uy3Arr.length < i2) {
                                int length = uy3Arr.length;
                                ? r4 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(uy3Arr, 0, r4, 0, length);
                                uy3Arr = r4;
                            }
                            if (i != 0) {
                                System.arraycopy(uy3Arr, 0, uy3Arr, 0 + 1, i + 0);
                            }
                            uy3Arr[0] = O0;
                            i++;
                            O0 = O0.v();
                        }
                        uy3[] uy3Arr2 = new uy3[16];
                        int i3 = 0;
                        while (O02 != null) {
                            int i4 = i3 + 1;
                            if (uy3Arr2.length < i4) {
                                int length2 = uy3Arr2.length;
                                ? r42 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(uy3Arr2, 0, r42, 0, length2);
                                uy3Arr2 = r42;
                            }
                            if (i3 != 0) {
                                System.arraycopy(uy3Arr2, 0, uy3Arr2, 0 + 1, i3 + 0);
                            }
                            uy3Arr2[0] = O02;
                            i3++;
                            O02 = O02.v();
                        }
                        int min = Math.min(i - 1, i3 - 1);
                        if (min >= 0) {
                            int i5 = 0;
                            while (sg3.e(uy3Arr[i5], uy3Arr2[i5])) {
                                if (i5 != min) {
                                    i5++;
                                }
                            }
                            return sg3.k(uy3Arr[i5].w(), uy3Arr2[i5].w());
                        }
                        h.s("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else if (bb0.q0(vk2)) {
                    return -1;
                } else {
                    if (bb0.q0(vk22)) {
                        return 1;
                    }
                }
                return 0;
            case 2:
                ly5 h = ((fk6) obj).h();
                ly5 h2 = ((fk6) obj2).h();
                int compare = Float.compare(h.a, h2.a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h.b, h2.b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h.d, h2.d);
                if (compare3 != 0) {
                    return compare3;
                }
                return Float.compare(h.c, h2.c);
            case 3:
                vj1 vj1 = (vj1) obj;
                vj1 vj12 = (vj1) obj2;
                int a = a(vj12) - a(vj1);
                if (a != 0) {
                    num = Integer.valueOf(a);
                } else {
                    iq0 iq0 = iq0.z;
                    if (!rs1.l(vj1, iq0) || !rs1.l(vj12, iq0)) {
                        int compareTo = vj1.getName().w.compareTo(vj12.getName().w);
                        if (compareTo != 0) {
                            num = Integer.valueOf(compareTo);
                        }
                    } else {
                        num = 0;
                    }
                }
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            case 4:
                uy3 uy3 = (uy3) obj;
                uy3 uy32 = (uy3) obj2;
                int k3 = sg3.k(uy32.K, uy3.K);
                if (k3 != 0) {
                    return k3;
                }
                return sg3.k(uy3.hashCode(), uy32.hashCode());
            case 5:
                ly5 h3 = ((fk6) obj).h();
                ly5 h4 = ((fk6) obj2).h();
                int compare4 = Float.compare(h4.c, h3.c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(h3.b, h4.b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(h3.d, h4.d);
                if (compare6 != 0) {
                    return compare6;
                }
                return Float.compare(h4.a, h3.a);
            case 6:
                yb5 yb5 = (yb5) obj;
                yb5 yb52 = (yb5) obj2;
                int compare7 = Float.compare(((ly5) yb5.w).b, ((ly5) yb52.w).b);
                if (compare7 != 0) {
                    return compare7;
                }
                return Float.compare(((ly5) yb5.w).d, ((ly5) yb52.w).d);
            case 7:
                return Integer.valueOf(((ul) obj).b).compareTo(Integer.valueOf(((ul) obj2).b));
            case 8:
                return Integer.valueOf(((ul) obj).b).compareTo(Integer.valueOf(((ul) obj2).b));
            case 9:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int min2 = Math.min(str.length(), str2.length());
                int i6 = 4;
                while (true) {
                    if (i6 >= min2) {
                        int length3 = str.length();
                        int length4 = str2.length();
                        if (length3 == length4) {
                            return 0;
                        }
                        if (length3 >= length4) {
                            return 1;
                        }
                    } else {
                        char charAt = str.charAt(i6);
                        char charAt2 = str2.charAt(i6);
                        if (charAt == charAt2) {
                            i6++;
                        } else if (sg3.k(charAt, charAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 10:
                return pd8.k(ts1.g((ql4) obj).a.a, ts1.g((ql4) obj2).a.a);
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                WeakHashMap weakHashMap = e58.a;
                float z6 = ((View) obj).getZ();
                float z7 = ((View) obj2).getZ();
                if (z6 > z7) {
                    return -1;
                }
                if (z6 < z7) {
                    return 1;
                }
                return 0;
            case 12:
                uy3 uy33 = (uy3) obj;
                uy3 uy34 = (uy3) obj2;
                int k4 = sg3.k(uy33.K, uy34.K);
                if (k4 != 0) {
                    return k4;
                }
                return sg3.k(uy33.hashCode(), uy34.hashCode());
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return pd8.k(((t16) obj).getName(), ((t16) obj2).getName());
            case 14:
                du2 du2 = (du2) obj;
                du2 du22 = (du2) obj2;
                RecyclerView recyclerView = du2.d;
                if (recyclerView == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (du22.d == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z4 == z5) {
                    boolean z8 = du2.a;
                    if (z8 == du22.a) {
                        int i7 = du22.b - du2.b;
                        if (i7 != 0) {
                            return i7;
                        }
                        int i8 = du2.c - du22.c;
                        if (i8 != 0) {
                            return i8;
                        }
                        return 0;
                    } else if (!z8) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case h75.g /*15*/:
                return Long.valueOf(((c92) obj).b.getTimeInMillis()).compareTo(Long.valueOf(((c92) obj2).b.getTimeInMillis()));
            case 16:
                return Double.valueOf(((wy2) obj2).c).compareTo(Double.valueOf(((wy2) obj).c));
            case 17:
                Charset charset = (Charset) obj;
                charset.getClass();
                String name = charset.name();
                name.getClass();
                Charset charset2 = (Charset) obj2;
                charset2.getClass();
                String name2 = charset2.name();
                name2.getClass();
                return name.compareTo(name2);
            case 18:
                return pd8.k((Float) ((yb5) obj2).x, (Float) ((yb5) obj).x);
            case 19:
                return pd8.k(((Method) obj).getName(), ((Method) obj2).getName());
            case 20:
                return pd8.k(((Method) obj).getName(), ((Method) obj2).getName());
            case 21:
                k26 k26 = yq3.w;
                Integer b = vs1.b((us1) obj, (us1) obj2);
                if (b != null) {
                    return b.intValue();
                }
                return 0;
            case 22:
                return Integer.valueOf(((ld5) obj2).a).compareTo(Integer.valueOf(((ld5) obj).a));
            case 23:
                return ((ly6) obj).x - ((ly6) obj2).x;
            case 24:
                return pd8.k((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 25:
                return pd8.k((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 26:
                return pd8.k((String) ((yb5) obj).w, (String) ((yb5) obj2).w);
            case 27:
                return pd8.k(((db7) obj).a, ((db7) obj2).a);
            case 28:
                return pd8.k(((fb7) obj).a, ((fb7) obj2).a);
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }
}
