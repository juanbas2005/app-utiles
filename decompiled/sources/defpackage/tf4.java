package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import cu.lestebang.utiletecsa.R;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: tf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class tf4 {
    public static final fw0 a = new fw0(1863131183, new xw0(5), false);
    public static final wp1 b = new wp1(1.0f, 1.0f);
    public static final int[] c = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] d = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] e = {3, 6};
    public static final int[] f = {1, 2, 4, 5, 7, 8};
    public static final Object g = new Object();
    public static Method h;
    public static boolean i;
    public static x83 j;
    public static x83 k;
    public static x83 l;

    public static String A(Class cls) {
        LinkedHashMap linkedHashMap = ox4.b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            mx4 mx4 = (mx4) cls.getAnnotation(mx4.class);
            if (mx4 != null) {
                str = mx4.value();
            } else {
                str = null;
            }
            if (str == null || str.length() <= 0) {
                h.j("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, str);
        }
        str.getClass();
        return str;
    }

    public static final boolean B(char c2) {
        if (c2 == 9) {
            return true;
        }
        if (' ' <= c2 && c2 < '0') {
            return true;
        }
        if (';' <= c2 && c2 < 'A') {
            return true;
        }
        if ('[' <= c2 && c2 < 'a') {
            return true;
        }
        if ('{' > c2 || c2 >= 127) {
            return false;
        }
        return true;
    }

    public static final boolean C(char c2) {
        if ('0' > c2 || c2 >= ':') {
            return false;
        }
        return true;
    }

    public static final boolean D(char c2) {
        if (c2 >= 0 && c2 < 9) {
            return true;
        }
        if (10 <= c2 && c2 < ' ') {
            return true;
        }
        if (('0' <= c2 && c2 < ':') || c2 == ':') {
            return true;
        }
        if ('a' <= c2 && c2 < '{') {
            return true;
        }
        if ('A' <= c2 && c2 < '[') {
            return true;
        }
        if (127 > c2 || c2 >= 256) {
            return false;
        }
        return true;
    }

    public static final boolean E(char c2) {
        if (c2 >= 0 && c2 < '0') {
            return true;
        }
        if ('J' > c2 || c2 >= 256) {
            return false;
        }
        return true;
    }

    public static int F(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static ml4 G(ml4 ml4, tx4 tx4) {
        return ml4.d(new wx4(tx4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015e, code lost:
        r7 = r8;
     */
    public static final List H(String str) {
        int i2;
        int i3;
        List list;
        int i4;
        List list2;
        yb5 yb5;
        yb5 yb52;
        int i5;
        String str2 = str;
        a42 a42 = a42.w;
        if (str2 == null) {
            return a42;
        }
        nf1 nf1 = new nf1(26);
        i44 i44 = i44.x;
        nz3 y = rg3.y(i44, nf1);
        for (int i6 = 0; i6 <= str2.length() - 1; i6 = i2) {
            nz3 y2 = rg3.y(i44, new nf1(27));
            Integer num = null;
            i2 = i6;
            while (true) {
                if (i2 <= str2.length() - 1) {
                    char charAt = str2.charAt(i2);
                    if (charAt != ',') {
                        if (charAt == ';') {
                            if (num == null) {
                                num = Integer.valueOf(i2);
                            }
                            int i7 = i2 + 1;
                            int i8 = i7;
                            while (true) {
                                if (i8 > d57.C0(str2)) {
                                    I(y2, str2, i7, i8, "");
                                    break;
                                }
                                char charAt2 = str2.charAt(i8);
                                if (charAt2 == ',' || charAt2 == ';') {
                                    I(y2, str2, i7, i8, "");
                                } else if (charAt2 != '=') {
                                    i8++;
                                } else {
                                    int i9 = i8 + 1;
                                    if (str2.length() == i9) {
                                        yb5 = new yb5(Integer.valueOf(i9), "");
                                    } else {
                                        char c2 = '\"';
                                        if (str2.charAt(i9) != '\"') {
                                            int i10 = i9;
                                            while (true) {
                                                if (i10 > str2.length() - 1) {
                                                    yb52 = new yb5(Integer.valueOf(i10), d57.k1(str2.substring(i9, i10)).toString());
                                                    break;
                                                }
                                                char charAt3 = str2.charAt(i10);
                                                if (charAt3 == ',' || charAt3 == ';') {
                                                    yb52 = new yb5(Integer.valueOf(i10), d57.k1(str2.substring(i9, i10)).toString());
                                                } else {
                                                    i10++;
                                                }
                                            }
                                        } else {
                                            int i11 = i8 + 2;
                                            StringBuilder sb = new StringBuilder();
                                            while (true) {
                                                if (i11 > str2.length() - 1) {
                                                    yb52 = new yb5(Integer.valueOf(i11), "\"".concat(sb.toString()));
                                                    break;
                                                }
                                                char charAt4 = str2.charAt(i11);
                                                if (charAt4 == c2) {
                                                    i5 = i11 + 1;
                                                    int i12 = i5;
                                                    while (i12 < str2.length() && str2.charAt(i12) == ' ') {
                                                        i12++;
                                                    }
                                                    if (i12 == str2.length() || str2.charAt(i12) == ';' || str2.charAt(i12) == ',') {
                                                        yb52 = new yb5(Integer.valueOf(i5), sb.toString());
                                                    }
                                                }
                                                if (charAt4 != '\\' || i11 >= str2.length() - 3) {
                                                    sb.append(charAt4);
                                                    i11++;
                                                } else {
                                                    sb.append(str2.charAt(i11 + 1));
                                                    i11 += 2;
                                                }
                                                c2 = '\"';
                                            }
                                            yb52 = new yb5(Integer.valueOf(i5), sb.toString());
                                        }
                                        yb5 = yb52;
                                    }
                                    int intValue = ((Number) yb5.w).intValue();
                                    I(y2, str2, i7, i8, (String) yb5.x);
                                    i2 = intValue;
                                }
                            }
                        } else {
                            i2++;
                        }
                    } else {
                        ArrayList arrayList = (ArrayList) y.getValue();
                        if (num != null) {
                            i4 = num.intValue();
                        } else {
                            i4 = i2;
                        }
                        String obj = d57.k1(str2.substring(i6, i4)).toString();
                        if (y2.a()) {
                            list2 = (List) y2.getValue();
                        } else {
                            list2 = a42;
                        }
                        arrayList.add(new wy2(obj, list2));
                        i2++;
                    }
                } else {
                    ArrayList arrayList2 = (ArrayList) y.getValue();
                    if (num != null) {
                        i3 = num.intValue();
                    } else {
                        i3 = i2;
                    }
                    String obj2 = d57.k1(str2.substring(i6, i3)).toString();
                    if (y2.a()) {
                        list = (List) y2.getValue();
                    } else {
                        list = a42;
                    }
                    arrayList2.add(new wy2(obj2, list));
                }
            }
        }
        if (y.a()) {
            return (List) y.getValue();
        }
        return a42;
    }

    public static final void I(nz3 nz3, String str, int i2, int i3, String str2) {
        String obj = d57.k1(str.substring(i2, i3)).toString();
        if (obj.length() != 0) {
            ((ArrayList) nz3.getValue()).add(new xy2(obj, str2));
        }
    }

    public static final yt1 J(String str, vr2 vr2, String str2, int i2) {
        char charAt = str.charAt(i2);
        if (((Boolean) vr2.y(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return K(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i2);
    }

    public static final yt1 K(String str, String str2) {
        return new yt1(str2 + " when parsing an Instant from \"" + R(64, str) + '\"', str);
    }

    public static final int L(int i2, String str) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    public static final ArrayList M(List list, List list2, yt2 yt2, int i2) {
        List list3;
        yt2 yt22;
        ArrayList arrayList;
        Object Q = yt2.Q();
        Object obj = ay0.a;
        if (Q == obj) {
            Q = new LinkedHashSet();
            yt2.o0(Q);
        }
        Set set = (Set) Q;
        Object Q2 = yt2.Q();
        if (Q2 == obj) {
            Q2 = new LinkedHashSet();
            yt2.o0(Q2);
        }
        Set set2 = (Set) Q2;
        yt2.e0(110758886);
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                List list4 = list2;
                arrayList.add(n((cu4) list.get(i3), list4, set, set2, yt2, i2 & 112));
                i3++;
                list2 = list4;
            }
            list3 = list2;
            yt22 = yt2;
        } else {
            list3 = list2;
            yt22 = yt2;
            arrayList = new ArrayList(et0.e0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(n((cu4) it.next(), list3, set, set2, yt22, i2 & 112));
            }
        }
        ArrayList arrayList2 = arrayList;
        yt22.r(false);
        h(arrayList2, list3, set, set2, yt22, i2 & 112);
        return arrayList2;
    }

    public static final se4 N(hj8 hj8, vr2 vr2, yt2 yt2, int i2) {
        hj8 hj82;
        u55.v(hj8, yt2);
        aq4 v = u55.v(vr2, yt2);
        Object[] objArr = new Object[0];
        Object Q = yt2.Q();
        d63 d63 = ay0.a;
        if (Q == d63) {
            Q = new o(3);
            yt2.o0(Q);
        }
        String str = (String) u55.s(objArr, (sr2) Q, yt2, 48);
        e9 e9Var = (e9) yt2.k(n94.a);
        if (e9Var == null) {
            yt2.e0(1213380307);
            Object obj = (Context) yt2.k(ye.b);
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                } else if (obj instanceof e9) {
                    break;
                } else {
                    obj = ((ContextWrapper) obj).getBaseContext();
                }
            }
            e9Var = (e9) obj;
        } else {
            yt2.e0(1213379439);
        }
        yt2.r(false);
        if (e9Var != null) {
            pv0 e2 = e9Var.e();
            Object Q2 = yt2.Q();
            if (Q2 == d63) {
                Q2 = new Object();
                yt2.o0(Q2);
            }
            w8 w8Var = (w8) Q2;
            Object Q3 = yt2.Q();
            if (Q3 == d63) {
                Q3 = new se4(w8Var);
                yt2.o0(Q3);
            }
            se4 se4 = (se4) Q3;
            boolean i3 = yt2.i(w8Var) | yt2.i(e2) | yt2.g(str) | yt2.i(hj8) | yt2.g(v);
            Object Q4 = yt2.Q();
            if (i3 || Q4 == d63) {
                hj82 = hj8;
                Q4 = new b9((Object) w8Var, (Object) e2, (Object) str, (Object) hj82, (Object) v, 0);
                yt2.o0(Q4);
            } else {
                hj82 = hj8;
            }
            vr2 vr22 = (vr2) Q4;
            boolean g2 = yt2.g(e2) | yt2.g(str) | yt2.g(hj82);
            Object Q5 = yt2.Q();
            if (g2 || Q5 == d63) {
                Q5 = new iw1(vr22);
                yt2.o0(Q5);
            }
            iw1 iw1 = (iw1) Q5;
            return se4;
        }
        h.s("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        return null;
    }

    public static final se3 O(ly5 ly5) {
        return new se3(Math.round(ly5.a), Math.round(ly5.b), Math.round(ly5.c), Math.round(ly5.d));
    }

    public static final List P(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return a42.w;
        }
        if (size != 1) {
            return Collections.unmodifiableList(new ArrayList(arrayList));
        }
        return Collections.singletonList(dt0.w0(arrayList));
    }

    public static final Map Q(Map map) {
        int size = map.size();
        if (size == 0) {
            return b42.w;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) dt0.v0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final String R(int i2, String str) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    public static final boolean S(Throwable th, sr2 sr2) {
        List list;
        Object invoke;
        th.getClass();
        Integer num = th3.a;
        DiagnosticComposeException diagnosticComposeException = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            list = Arrays.asList(suppressed);
            list.getClass();
        } else {
            Method method = jj5.b;
            if (method == null || (invoke = method.invoke(th, (Object[]) null)) == null) {
                list = a42.w;
            } else {
                list = Arrays.asList((Throwable[]) invoke);
                list.getClass();
            }
        }
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) list.get(i2)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            qx0 qx0 = (qx0) sr2.b();
            if (qx0 != null) {
                boolean z2 = qx0.b;
                List list2 = qx0.a;
                if (z2) {
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((sx0) list2.get(i3)).getClass();
                    }
                } else if (!list2.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                qx0.getClass();
                diagnosticComposeException = new DiagnosticComposeException(qx0);
            }
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            su0.b(th, diagnosticComposeException);
        }
        return z;
    }

    public static final Bundle T(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", "107402597829-jcid33bdpvf5rvatm8m5tga0cbulpu3p.apps.googleusercontent.com");
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", str);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", false);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", (String) null);
        bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", (ArrayList) null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", false);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", (String) null);
        return bundle;
    }

    public static final void a(String str, fw0 fw0, long j2, sr2 sr2, ml4 ml4, yt2 yt2, int i2) {
        int i3;
        String str2;
        boolean z;
        yt2 yt22;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        fw0 fw02 = fw0;
        long j3 = j2;
        sr2 sr22 = sr2;
        ml4 ml42 = ml4;
        yt2 yt23 = yt2;
        int i9 = i2;
        yt23.g0(1182334539);
        if ((i9 & 6) == 0) {
            str2 = str;
            if (yt23.g(str2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i9;
        } else {
            str2 = str;
            i3 = i9;
        }
        if ((i9 & 48) == 0) {
            if (yt23.i(fw02)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i9 & 384) == 0) {
            if (yt23.f(j3)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i9 & 3072) == 0) {
            if (yt23.i(sr22)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i9 & 24576) == 0) {
            if (yt23.g(ml42)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (yt23.V(i3 & 1, z)) {
            ml4 h2 = b96.h(we.f(ml42, q96.a(24.0f)), j3, gr8.h);
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object Q = yt23.Q();
            if (z2 || Q == ay0.a) {
                Q = new gi0(1, sr22);
                yt23.o0(Q);
            }
            ml4 M = x91.M(h49.u(h2, false, (String) null, (sr2) Q, 15), 0.0f, 10.0f, 1);
            ea6 a2 = ca6.a(wr.e, xb4.I, yt23, 54);
            int hashCode = Long.hashCode(yt23.T);
            vf5 m = yt23.m();
            ml4 E = gw8.E(yt23, M);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt23.i0();
            if (yt23.S) {
                yt23.l(vy0);
            } else {
                yt23.r0();
            }
            g75.Q(tx0.f, yt23, a2);
            g75.Q(tx0.e, yt23, m);
            g75.Q(tx0.g, yt23, Integer.valueOf(hashCode));
            g75.O(yt23, tx0.h);
            g75.Q(tx0.d, yt23, E);
            long j4 = jt0.c;
            fw02.u(new jt0(j4), yt23, Integer.valueOf((i3 & 112) | 6));
            k75.a(yt23, yu6.p(jl4.w, 6.0f));
            yt2 yt24 = yt23;
            yf7.b(str2, (ml4) null, j4, ya5.k(14), am2.B, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt24, (i3 & 14) | 1597824, 0, 262058);
            yt22 = yt24;
            yt22.r(true);
        } else {
            yt22 = yt23;
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new ii0(str, fw02, j3, sr22, ml42, i9);
        }
    }

    public static final void b(boolean z, String str, String str2, boolean z2, sr2 sr2, sr2 sr22, sr2 sr23, vr2 vr2, yt2 yt2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        String str3;
        boolean z4;
        String str4;
        ga6 ga6;
        ce ceVar;
        long j2;
        boolean z5;
        boolean z6;
        boolean z7;
        String str5 = str2;
        boolean z8 = z2;
        sr2 sr24 = sr23;
        vr2 vr22 = vr2;
        yt2 yt22 = yt2;
        sr2.getClass();
        sr22.getClass();
        sr24.getClass();
        vr22.getClass();
        yt22.g0(1584376199);
        if (yt22.h(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i11 = i2 | i3;
        if (yt22.g(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i12 = i11 | i4;
        if (yt22.g(str5)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i13 = i12 | i5;
        if (yt22.h(z8)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i14 = i13 | i6;
        if (yt22.i(sr2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i15 = i14 | i7;
        if (yt22.i(sr22)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i16 = i15 | i8;
        if (yt22.i(sr24)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i17 = i16 | i9;
        if (yt22.i(vr22)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i18 = i17 | i10;
        if ((4793491 & i18) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (yt22.V(i18 & 1, z3)) {
            if (z8) {
                str3 = hl6.l(yt22, -1538977640, R.string.call_alert_title_revertida, yt22, false);
            } else {
                str3 = hl6.l(yt22, -1538905255, R.string.call_alert_title_incoming, yt22, false);
            }
            sd2 sd2 = yu6.a;
            ml4 h2 = b96.h(we.f(x91.M(sd2, 16.0f, 0.0f, 2), q96.a(16.0f)), uq3.d(4062453816L), gr8.h);
            if ((29360128 & i18) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object Q = yt22.Q();
            d63 d63 = ay0.a;
            if (z4 || Q == d63) {
                Q = new wf(1, vr22);
                yt22.o0(Q);
            }
            ml4 K = x91.K(d97.a(h2, vs7.a, (PointerInputEventHandler) Q), 16.0f);
            g80 g80 = xb4.K;
            sr srVar = wr.c;
            int i19 = i18;
            au0 a2 = zt0.a(srVar, g80, yt22, 0);
            int hashCode = Long.hashCode(yt22.T);
            vf5 m = yt22.m();
            ml4 E = gw8.E(yt22, K);
            ux0.d.getClass();
            vy0 vy0 = tx0.b;
            yt22.i0();
            int i20 = hashCode;
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            ck ckVar = tx0.f;
            g75.Q(ckVar, yt22, a2);
            ck ckVar2 = tx0.e;
            g75.Q(ckVar2, yt22, m);
            Integer valueOf = Integer.valueOf(i20);
            String str6 = str3;
            ck ckVar3 = tx0.g;
            g75.Q(ckVar3, yt22, valueOf);
            ce ceVar2 = tx0.h;
            g75.O(yt22, ceVar2);
            ck ckVar4 = tx0.d;
            g75.Q(ckVar4, yt22, E);
            ea6 a3 = ca6.a(wr.a, xb4.I, yt22, 48);
            int hashCode2 = Long.hashCode(yt22.T);
            vf5 m2 = yt22.m();
            jl4 jl4 = jl4.w;
            sd2 sd22 = sd2;
            ml4 E2 = gw8.E(yt22, jl4);
            yt22.i0();
            d63 d632 = d63;
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a3);
            g75.Q(ckVar2, yt22, m2);
            f21.s(hashCode2, yt22, ckVar3, yt22, ceVar2);
            g75.Q(ckVar4, yt22, E2);
            ga6 ga62 = ga6.a;
            ml4 b2 = ga62.b(jl4, 1.0f, true);
            au0 a4 = zt0.a(srVar, g80, yt22, 0);
            jl4 jl42 = jl4;
            int hashCode3 = Long.hashCode(yt22.T);
            vf5 m3 = yt22.m();
            ml4 E3 = gw8.E(yt22, b2);
            yt22.i0();
            if (yt22.S) {
                yt22.l(vy0);
            } else {
                yt22.r0();
            }
            g75.Q(ckVar, yt22, a4);
            g75.Q(ckVar2, yt22, m3);
            f21.s(hashCode3, yt22, ckVar3, yt22, ceVar2);
            g75.Q(ckVar4, yt22, E3);
            long d2 = uq3.d(4288407465L);
            long k2 = ya5.k(13);
            am2 am2 = am2.B;
            sd2 sd23 = sd22;
            ck ckVar5 = ckVar3;
            jl4 jl43 = jl42;
            d63 d633 = d632;
            yf7.b(str6, (ml4) null, d2, k2, am2, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt2, 1597824, 0, 262058);
            if (str2 == null) {
                str4 = str;
            } else {
                str4 = str2;
            }
            long j3 = jt0.c;
            yt2 yt23 = yt2;
            yf7.b(str4, (ml4) null, j3, ya5.k(18), am2, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt23, 1597824, 0, 262058);
            long j4 = j3;
            yt2 yt24 = yt23;
            if (str2 != null) {
                yt24.e0(-837565519);
                ga6 = ga62;
                ceVar = ceVar2;
                j2 = j4;
                yt2 yt25 = yt2;
                yf7.b(str, (ml4) null, jt0.b(0.8f, j4), ya5.k(14), (am2) null, (ea7) null, 0, (rd7) null, (hc7) null, 0, 0, false, 0, 0, (tg7) null, yt25, ((i19 >> 3) & 14) | 24960, 0, 262122);
                yt24 = yt25;
                yt24.r(false);
            } else {
                ga6 = ga62;
                ceVar = ceVar2;
                j2 = j4;
                yt24.e0(-837356021);
                yt24.r(false);
            }
            yt24.r(true);
            x83 U = gl0.U();
            long b3 = jt0.b(0.7f, j2);
            jl4 jl44 = jl43;
            ml4 l2 = yu6.l(jl44, 24.0f);
            if ((i19 & 3670016) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object Q2 = yt24.Q();
            if (z5 || Q2 == d633) {
                z6 = false;
                Q2 = new gi0(0, sr24);
                yt24.o0(Q2);
            } else {
                z6 = false;
            }
            ml4 u = h49.u(l2, z6, (String) null, (sr2) Q2, 15);
            yt2 yt26 = yt2;
            d83.a(U, (String) null, u, b3, yt26, 3120, 0);
            yt22 = yt26;
            yt22.r(true);
            if (z) {
                yt22.e0(-1739300346);
                ml4 O = x91.O(sd23, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                ea6 a5 = ca6.a(new ur(12.0f, true, new h(2)), xb4.H, yt22, 6);
                int hashCode4 = Long.hashCode(yt22.T);
                vf5 m4 = yt22.m();
                ml4 E4 = gw8.E(yt22, O);
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(ckVar, yt22, a5);
                g75.Q(ckVar2, yt22, m4);
                f21.s(hashCode4, yt22, ckVar5, yt22, ceVar);
                g75.Q(ckVar4, yt22, E4);
                ga6 ga63 = ga6;
                a(l55.u(R.string.call_alert_action_call, yt22), jw0.a, uq3.d(4281236806L), sr2, ga63.b(jl44, 1.0f, true), yt22, ((i19 >> 3) & 7168) | 432);
                z7 = true;
                a(l55.u(R.string.call_alert_action_sms, yt22), jw0.b, uq3.d(4281228669L), sr22, ga63.b(jl44, 1.0f, true), yt22, ((i19 >> 6) & 7168) | 432);
                yt22.r(true);
                yt22.r(false);
            } else {
                z7 = true;
                yt22.e0(-1737936687);
                yt22.r(false);
            }
            yt22.r(z7);
        } else {
            yt22.Y();
        }
        yx5 v = yt22.v();
        if (v != null) {
            v.d = new hi0(z, str, str2, z2, sr2, sr22, sr24, vr2, i2);
        }
    }

    public static final void c(ml4 ml4, vr2 vr2, yt2 yt2, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        yt2.g0(-932836462);
        if ((i2 & 6) == 0) {
            if (yt2.g(ml4)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if (yt2.i(vr2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i3 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i6 & 1, z)) {
            k75.a(yt2, pv8.x(ml4, vr2));
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new vk0(ml4, vr2, i2);
        }
    }

    public static final se3 d(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new se3(i2, i3, ((int) (j3 >> 32)) + i2, ((int) (j3 & 4294967295L)) + i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kj6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: kj6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: kj6} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static final void e(String str, vr2 vr2, fw0 fw0, fw0 fw02, ml4 ml4, String str2, yt2 yt2, int i2) {
        int i3;
        boolean z;
        kj6 kj6;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        yt2 yt22 = yt2;
        int i10 = i2;
        str.getClass();
        vr2.getClass();
        yt22.g0(802609071);
        if ((i10 & 6) == 0) {
            if (yt22.g(str)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i10;
        } else {
            i3 = i10;
        }
        if ((i10 & 48) == 0) {
            if (yt22.i(vr2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        fw0 fw03 = fw0;
        if ((i10 & 384) == 0) {
            if (yt22.i(fw03)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        fw0 fw04 = fw02;
        if ((i10 & 3072) == 0) {
            if (yt22.i(fw04)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        ml4 ml42 = ml4;
        if ((i10 & 24576) == 0) {
            if (yt22.g(ml42)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        String str3 = str2;
        if ((i10 & 196608) == 0) {
            if (yt22.g(str3)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i3 & 1, z)) {
            Object[] objArr = new Object[0];
            Object Q = yt22.Q();
            if (Q == ay0.a) {
                Q = new pp5(24);
                yt22.o0(Q);
            }
            aq4 aq4 = (aq4) u55.s(objArr, (sr2) Q, yt22, 48);
            bt3 bt3 = new bt3(7, 0, 121);
            if (((Boolean) aq4.getValue()).booleanValue()) {
                kj6 = g22.M;
            } else {
                kj6 = new Object();
            }
            f(str, vr2, fw03, fw04, ml42, su0.J(8093510, new ns4(aq4, 13), yt22), str3, bt3, kj6, (pq6) null, yt22, 196608 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016), 512);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new dw0(str, vr2, fw0, fw02, ml4, str2, i10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e8  */
    public static final void f(String str, vr2 vr2, gs2 gs2, gs2 gs22, ml4 ml4, gs2 gs23, String str2, bt3 bt3, m78 m78, pq6 pq6, yt2 yt2, int i2, int i3) {
        int i4;
        vr2 vr22;
        gs2 gs24;
        kj6 kj6;
        boolean z;
        pq6 pq62;
        m78 m782;
        yx5 v;
        int i5;
        o96 o96;
        boolean z2;
        boolean z3;
        yd7 t;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ml4 ml42 = ml4;
        String str3 = str2;
        yt2 yt22 = yt2;
        int i15 = i2;
        yt22.g0(-140444109);
        if ((i15 & 6) == 0) {
            if (yt22.g(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i4 = i14 | i15;
        } else {
            String str4 = str;
            i4 = i15;
        }
        if ((i15 & 48) == 0) {
            vr22 = vr2;
            if (yt22.i(vr22)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i4 |= i13;
        } else {
            vr22 = vr2;
        }
        if ((i15 & 384) == 0) {
            gs24 = gs2;
            if (yt22.i(gs24)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i4 |= i12;
        } else {
            gs24 = gs2;
        }
        if ((i15 & 3072) == 0) {
            if (yt22.i(gs22)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i4 |= i11;
        } else {
            gs2 gs25 = gs22;
        }
        if ((i15 & 24576) == 0) {
            if (yt22.g(ml42)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i4 |= i10;
        }
        if ((196608 & i15) == 0) {
            if (yt22.i(gs23)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i4 |= i9;
        } else {
            gs2 gs26 = gs23;
        }
        if ((1572864 & i15) == 0) {
            if (yt22.g(str3)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i4 |= i8;
        }
        if ((12582912 & i15) == 0) {
            if (yt22.g(bt3)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i4 |= i7;
        } else {
            bt3 bt32 = bt3;
        }
        int i16 = i3 & 256;
        if (i16 != 0) {
            i4 |= 100663296;
        } else if ((100663296 & i15) == 0) {
            kj6 = m78;
            if (yt22.g(kj6)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i4 |= i6;
            if ((805306368 & i15) == 0) {
                i4 |= 268435456;
            }
            if ((306783379 & i4) == 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (!yt22.V(i4 & 1, z)) {
                yt22.a0();
                if ((i15 & 1) == 0 || yt22.C()) {
                    if (i16 != 0) {
                        kj6 = g22.M;
                    }
                    o96 o962 = q96.a;
                    lf5 lf5 = new lf5(50.0f);
                    o96 o963 = new o96(lf5, lf5, lf5, lf5);
                    i5 = i4 & -1879048193;
                    o96 = o963;
                } else {
                    yt22.Y();
                    i5 = i4 & -1879048193;
                    o96 = pq6;
                }
                int i17 = i5;
                m78 m783 = kj6;
                yt22.s();
                int i18 = i17 >> 12;
                au0 a2 = zt0.a(wr.c, xb4.K, yt22, 0);
                int hashCode = Long.hashCode(yt22.T);
                vf5 m = yt22.m();
                ml4 E = gw8.E(yt22, ml42);
                ux0.d.getClass();
                vy0 vy0 = tx0.b;
                yt22.i0();
                if (yt22.S) {
                    yt22.l(vy0);
                } else {
                    yt22.r0();
                }
                g75.Q(tx0.f, yt22, a2);
                g75.Q(tx0.e, yt22, m);
                g75.Q(tx0.g, yt22, Integer.valueOf(hashCode));
                g75.O(yt22, tx0.h);
                g75.Q(tx0.d, yt22, E);
                if (str3 == null) {
                    yt22.e0(18531639);
                    t = pe2.r(6, yt22);
                    yt22.r(false);
                    z2 = false;
                    z3 = true;
                } else {
                    yt22.e0(18608240);
                    t37 t37 = ch4.b;
                    z2 = false;
                    z3 = true;
                    yt2 yt23 = yt2;
                    t = pe2.t(0, 0, 0, 0, 0, ((zg4) yt22.k(t37)).a.w, ((zg4) yt22.k(t37)).a.w, 0, 0, yt23, 2147477503);
                    yt22 = yt23;
                    yt22.r(false);
                }
                yd7 yd7 = t;
                int i19 = i17 << 12;
                int i20 = (i18 & 57344) | (458752 & (i17 >> 6));
                m78 m784 = m783;
                pq6 pq63 = o96;
                int i21 = (i17 & 14) | 384 | (i17 & 112) | (3670016 & i19) | ((i17 << 15) & 234881024) | (i19 & 1879048192);
                yt2 yt24 = yt22;
                z85.b(str, vr22, yu6.a, false, false, (tg7) null, gs24, (gs2) null, gs22, gs23, (gs2) null, false, m784, bt3, (zs3) null, false, 0, 0, pq63, yd7, yt24, i21, i20, 0, 2047160);
                yt22 = yt24;
                if (str3 != null) {
                    z4 = z3;
                } else {
                    z4 = z2;
                }
                ie1.d(z4, (ml4) null, (n52) null, (x82) null, (String) null, su0.J(654020865, new gh1(str3, 2), yt22), yt22, 1572870, 30);
                yt22.r(z3);
                m782 = m784;
                pq62 = pq63;
            } else {
                yt22.Y();
                pq62 = pq6;
                m782 = kj6;
            }
            v = yt22.v();
            if (v == null) {
                v.d = new le7(str, vr2, gs2, gs22, ml42, gs23, str3, bt3, m782, pq62, i2, i3);
                return;
            }
            return;
        }
        kj6 = m78;
        if ((805306368 & i15) == 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        if (!yt22.V(i4 & 1, z)) {
        }
        v = yt22.v();
        if (v == null) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x013f  */
    public static final void g(String str, vr2 vr2, gs2 gs2, gs2 gs22, ml4 ml4, bt3 bt3, gs2 gs23, String str2, yt2 yt2, int i2, int i3) {
        int i4;
        vr2 vr22;
        gs2 gs24;
        ml4 ml42;
        int i5;
        bt3 bt32;
        int i6;
        gs2 gs25;
        int i7;
        String str3;
        int i8;
        boolean z;
        String str4;
        gs2 gs26;
        bt3 bt33;
        ml4 ml43;
        yx5 v;
        jl4 jl4;
        bt3 bt34;
        fw0 fw0;
        String str5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        yt2 yt22 = yt2;
        int i17 = i2;
        int i18 = i3;
        str.getClass();
        vr2.getClass();
        gs2.getClass();
        gs22.getClass();
        yt22.g0(1070934551);
        if ((i17 & 6) == 0) {
            if (yt22.g(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i4 = i16 | i17;
        } else {
            String str6 = str;
            i4 = i17;
        }
        if ((i17 & 48) == 0) {
            vr22 = vr2;
            if (yt22.i(vr22)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i4 |= i15;
        } else {
            vr22 = vr2;
        }
        if ((i17 & 384) == 0) {
            gs24 = gs2;
            if (yt22.i(gs24)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i4 |= i14;
        } else {
            gs24 = gs2;
        }
        if ((i17 & 3072) == 0) {
            if (yt22.i(gs22)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i4 |= i13;
        } else {
            gs2 gs27 = gs22;
        }
        int i19 = i18 & 16;
        if (i19 != 0) {
            i4 |= 24576;
        } else if ((i17 & 24576) == 0) {
            ml42 = ml4;
            if (yt22.g(ml42)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i4 |= i12;
            i5 = i18 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i17) == 0) {
                bt32 = bt3;
                if (yt22.g(bt32)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
                i6 = i18 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((1572864 & i17) == 0) {
                    gs25 = gs23;
                    if (yt22.i(gs25)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                    i7 = i18 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((12582912 & i17) == 0) {
                        str3 = str2;
                        if (yt22.g(str3)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i4 |= i9;
                        i8 = i4;
                        if ((i4 & 4793491) != 4793490) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (yt22.V(i8 & 1, z)) {
                            if (i19 != 0) {
                                jl4 = jl4.w;
                            } else {
                                jl4 = ml42;
                            }
                            if (i5 != 0) {
                                bt34 = bt3.e;
                            } else {
                                bt34 = bt32;
                            }
                            if (i6 != 0) {
                                fw0 = bb0.o;
                            } else {
                                fw0 = gs25;
                            }
                            if (i7 != 0) {
                                str5 = null;
                            } else {
                                str5 = str3;
                            }
                            int i20 = i8 >> 3;
                            f(str, vr22, gs24, gs22, jl4, fw0, str5, bt34, (m78) null, (pq6) null, yt22, (i8 & 65534) | (458752 & i20) | (i20 & 3670016) | (29360128 & (i8 << 6)), 768);
                            str4 = str5;
                            bt33 = bt34;
                            gs26 = fw0;
                            ml43 = jl4;
                        } else {
                            yt2.Y();
                            ml43 = ml42;
                            bt33 = bt32;
                            gs26 = gs25;
                            str4 = str3;
                        }
                        v = yt2.v();
                        if (v != null) {
                            v.d = new ke7(str, vr2, gs2, gs22, ml43, bt33, gs26, str4, i17, i18);
                            return;
                        }
                        return;
                    }
                    str3 = str2;
                    i8 = i4;
                    if ((i4 & 4793491) != 4793490) {
                    }
                    if (yt22.V(i8 & 1, z)) {
                    }
                    v = yt2.v();
                    if (v != null) {
                    }
                }
                gs25 = gs23;
                i7 = i18 & 128;
                if (i7 == 0) {
                }
                str3 = str2;
                i8 = i4;
                if ((i4 & 4793491) != 4793490) {
                }
                if (yt22.V(i8 & 1, z)) {
                }
                v = yt2.v();
                if (v != null) {
                }
            }
            bt32 = bt3;
            i6 = i18 & 64;
            if (i6 != 0) {
            }
            gs25 = gs23;
            i7 = i18 & 128;
            if (i7 == 0) {
            }
            str3 = str2;
            i8 = i4;
            if ((i4 & 4793491) != 4793490) {
            }
            if (yt22.V(i8 & 1, z)) {
            }
            v = yt2.v();
            if (v != null) {
            }
        }
        ml42 = ml4;
        i5 = i18 & 32;
        if (i5 == 0) {
        }
        bt32 = bt3;
        i6 = i18 & 64;
        if (i6 != 0) {
        }
        gs25 = gs23;
        i7 = i18 & 128;
        if (i7 == 0) {
        }
        str3 = str2;
        i8 = i4;
        if ((i4 & 4793491) != 4793490) {
        }
        if (yt22.V(i8 & 1, z)) {
        }
        v = yt2.v();
        if (v != null) {
        }
    }

    public static final void h(ArrayList arrayList, List list, Set set, Set set2, yt2 yt2, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        yt2 yt22 = yt2;
        int i8 = i2;
        yt22.g0(-720826424);
        if ((i8 & 6) == 0) {
            if (yt22.i(arrayList)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i8;
        } else {
            i3 = i8;
        }
        if ((i8 & 48) == 0) {
            if (yt22.i(list)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i8 & 384) == 0) {
            if (yt22.i(set)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i8 & 3072) == 0) {
            if (yt22.i(set2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (yt22.V(i3 & 1, z)) {
            aq4 v = u55.v(arrayList, yt22);
            aq4 v2 = u55.v(list, yt22);
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                Object obj = ((cu4) arrayList.get(i9)).b;
                set.add(obj);
                List b1 = dt0.b1(arrayList);
                boolean g2 = yt22.g(v) | yt22.i(obj) | yt22.i(set) | yt22.i(set2) | yt22.g(v2);
                Object Q = yt22.Q();
                if (g2 || Q == ay0.a) {
                    b9 b9Var = new b9(obj, set, set2, v, v2);
                    yt22.o0(b9Var);
                    Q = b9Var;
                }
                t49.f(obj, b1, (vr2) Q, yt22);
            }
        } else {
            yt22.Y();
        }
        yx5 v3 = yt22.v();
        if (v3 != null) {
            v3.d = new m13(arrayList, list, set, set2, i8);
        }
    }

    public static final fp7 i(fp7 fp7) {
        fp7.getClass();
        as3 as3 = fp7.b;
        as3.getClass();
        as3 as32 = ((gs3) as3.I().get(0)).b;
        as32.getClass();
        vq3 J = as32.J();
        J.getClass();
        return new fp7((gq3) J, as32);
    }

    public static final Bundle j(yb5... yb5Arr) {
        Bundle bundle = new Bundle(yb5Arr.length);
        for (yb5 yb5 : yb5Arr) {
            String str = (String) yb5.w;
            Object obj = yb5.x;
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    h.q(pb4.m("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else if (obj instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) obj);
            } else {
                h.q(pb4.m("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                return null;
            }
        }
        return bundle;
    }

    public static ml4 k(ml4 ml4) {
        return ml4.d(new fp0(new j5(20)));
    }

    public static final boolean l(ly5 ly5, float f2, float f3) {
        float f4 = ly5.a;
        if (f2 > ly5.c || f4 > f2) {
            return false;
        }
        float f5 = ly5.b;
        if (f3 > ly5.d || f5 > f3) {
            return false;
        }
        return true;
    }

    public static final ol m(ol olVar) {
        ol c2 = olVar.c();
        int b2 = c2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            c2.e(i2, olVar.a(i2));
        }
        return c2;
    }

    public static final cu4 n(cu4 cu4, List list, Set set, Set set2, yt2 yt2, int i2) {
        yt2.e0(-1239021605);
        aq4 v = u55.v(list, yt2);
        Object obj = cu4.b;
        yt2.c0(-993800456, obj);
        cu4 cu42 = cu4;
        Set set3 = set2;
        cu4 cu43 = new cu4(cu42, su0.J(-1349345695, new uk1(set3, obj, set, v, list, cu42), yt2));
        yt2.r(false);
        yt2.r(false);
        return cu43;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [h61] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        if (r1.k(r10, r0) == r5) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0090, code lost:
        if (r9 != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0094, code lost:
        if ((r7 instanceof java.util.concurrent.CancellationException) != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0096, code lost:
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r4 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009b, code lost:
        r4 = defpackage.rc9.b("Channel was consumed, consumer had failed", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a1, code lost:
        r8.o(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a4, code lost:
        throw r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065 A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071 A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    public static final Object o(fi2 fi2, en0 en0, boolean z, f61 f61) {
        li2 li2;
        int i2;
        Object obj;
        wc0 wc0;
        fi2 fi22;
        wc0 wc02;
        Object a2;
        if (f61 instanceof li2) {
            li2 li22 = (li2) f61;
            int i3 = li22.E;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                li22.E = i3 - Integer.MIN_VALUE;
                li2 = li22;
                Object obj2 = li2.D;
                i2 = li2.E;
                CancellationException cancellationException = null;
                obj = p81.w;
                if (i2 != 0) {
                    o85.q(obj2);
                    if (!(fi2 instanceof th7)) {
                        wc02 = en0.iterator();
                        li2.z = fi2;
                        li2.A = en0;
                        li2.B = wc02;
                        li2.C = z;
                        li2.E = 1;
                        a2 = wc02.a(li2);
                        if (a2 != obj) {
                            Object obj3 = a2;
                            fi22 = fi2;
                            wc0 = wc02;
                            obj2 = obj3;
                            if (!((Boolean) obj2).booleanValue()) {
                                if (z) {
                                }
                            }
                            if (z) {
                            }
                            return vs7.a;
                        }
                        return obj;
                    }
                    throw ((th7) fi2).w;
                } else if (i2 == 1) {
                    z = li2.C;
                    wc0 = li2.B;
                    en0 = li2.A;
                    fi22 = li2.z;
                    o85.q(obj2);
                    if (!((Boolean) obj2).booleanValue()) {
                        Object c2 = wc0.c();
                        li2.z = fi22;
                        li2.A = en0;
                        li2.B = wc0;
                        li2.C = z;
                        li2.E = 2;
                    }
                    if (z) {
                        en0.o((CancellationException) null);
                    }
                    return vs7.a;
                } else if (i2 == 2) {
                    z = li2.C;
                    wc0 = li2.B;
                    en0 = li2.A;
                    fi22 = li2.z;
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wc02 = wc0;
                fi2 = fi22;
                li2.z = fi2;
                li2.A = en0;
                li2.B = wc02;
                li2.C = z;
                li2.E = 1;
                a2 = wc02.a(li2);
                if (a2 != obj) {
                }
                return obj;
            }
        }
        li2 = new h61(f61);
        Object obj22 = li2.D;
        i2 = li2.E;
        CancellationException cancellationException2 = null;
        obj = p81.w;
        if (i2 != 0) {
        }
        wc02 = wc0;
        fi2 = fi22;
        li2.z = fi2;
        li2.A = en0;
        li2.B = wc02;
        li2.C = z;
        li2.E = 1;
        a2 = wc02.a(li2);
        if (a2 != obj) {
        }
        return obj;
    }

    public static final int p(int i2, List list) {
        int i3;
        char c2;
        int i4 = ((jc5) dt0.G0(list)).c;
        if (i2 > ((jc5) dt0.G0(list)).c) {
            zb3.a("Index " + i2 + " should be less or equal than last line's end " + i4);
        }
        int size = list.size() - 1;
        int i5 = 0;
        while (true) {
            if (i5 > size) {
                i3 = -(i5 + 1);
                break;
            }
            i3 = (i5 + size) >>> 1;
            jc5 jc5 = (jc5) list.get(i3);
            if (jc5.b > i2) {
                c2 = 1;
            } else if (jc5.c <= i2) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 >= 0) {
                if (c2 <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            return i3;
        }
        int size2 = list.size();
        String a2 = i84.a(list, (String) null, new tm3(20), 31);
        StringBuilder p = pb4.p("Found paragraph index ", i3, " should be in range [0, ", size2, ").\nDebug info: index=");
        p.append(i2);
        p.append(", paragraphs=[");
        p.append(a2);
        p.append("]");
        zb3.a(p.toString());
        return i3;
    }

    public static final int q(int i2, List list) {
        char c2;
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            jc5 jc5 = (jc5) list.get(i4);
            if (jc5.d > i2) {
                c2 = 1;
            } else if (jc5.e <= i2) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i3 = i4 + 1;
            } else if (c2 <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int r(ArrayList arrayList, float f2) {
        char c2;
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((jc5) dt0.G0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            jc5 jc5 = (jc5) arrayList.get(i3);
            if (jc5.f > f2) {
                c2 = 1;
            } else if (jc5.g <= f2) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i2 = i3 + 1;
            } else if (c2 <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void s(ArrayList arrayList, long j2, vr2 vr2) {
        int p = p(lg7.f(j2), arrayList);
        int size = arrayList.size();
        while (p < size) {
            jc5 jc5 = (jc5) arrayList.get(p);
            if (jc5.b < lg7.e(j2)) {
                if (jc5.b != jc5.c) {
                    vr2.y(jc5);
                }
                p++;
            } else {
                return;
            }
        }
    }

    public static final void t(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static final x83 u() {
        x83 x83 = j;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.BarChart", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        long j2 = jt0.b;
        ky6 ky6 = new ky6(j2);
        be5 f2 = b81.f(6.0f, 20.0f, 6.0f, 20.0f);
        f2.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        f2.n(-7.0f);
        f2.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f2.g(0.0f);
        f2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        f2.n(7.0f);
        f2.d(4.0f, 19.1f, 4.9f, 20.0f, 6.0f, 20.0f);
        f2.c();
        w83.a(w83, f2.a, ky6, 14336);
        ky6 ky62 = new ky6(j2);
        be5 be5 = new be5();
        be5.j(16.0f, 15.0f);
        be5.n(3.0f);
        be5.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        be5.g(0.0f);
        be5.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        be5.n(-3.0f);
        be5.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        be5.g(0.0f);
        be5.d(16.9f, 13.0f, 16.0f, 13.9f, 16.0f, 15.0f);
        be5.c();
        w83.a(w83, be5.a, ky62, 14336);
        ky6 ky63 = new ky6(j2);
        be5 f3 = b81.f(12.0f, 20.0f, 12.0f, 20.0f);
        f3.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        f3.m(6.0f);
        f3.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f3.g(0.0f);
        f3.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        f3.n(12.0f);
        f3.d(10.0f, 19.1f, 10.9f, 20.0f, 12.0f, 20.0f);
        f3.c();
        w83.a(w83, f3.a, ky63, 14336);
        x83 b2 = w83.b();
        j = b2;
        return b2;
    }

    public static final x83 v() {
        x83 x83 = k;
        if (x83 != null) {
            return x83;
        }
        w83 w83 = new w83("Rounded.Done", 24.0f, 24.0f, 24.0f, 24.0f, 0, 0, false, 96);
        int i2 = e38.a;
        ky6 ky6 = new ky6(jt0.b);
        be5 f2 = pb4.f(9.0f, 16.2f, -3.5f, -3.5f);
        f2.e(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0.0f);
        f2.e(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.4f);
        f2.i(4.19f, 4.19f);
        f2.e(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        f2.h(20.3f, 7.7f);
        f2.e(0.39f, -0.39f, 0.39f, -1.01f, 0.0f, -1.4f);
        f2.e(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, 0.0f);
        f2.h(9.0f, 16.2f);
        f2.c();
        w83.a(w83, f2.a, ky6, 14336);
        x83 b2 = w83.b();
        k = b2;
        return b2;
    }

    public static final bo3 w(gu3 gu3) {
        gu3.getClass();
        ou3 ou3 = bo3.c;
        ou3.getClass();
        return (bo3) rj1.I(gu3.s, ou3);
    }

    public static final do3 x(ku3 ku3) {
        ku3.getClass();
        ou3 ou3 = do3.b;
        ou3.getClass();
        return (do3) rj1.I(ku3.f, ou3);
    }

    public static final io3 y(qu3 qu3) {
        qu3.getClass();
        ou3 ou3 = io3.b;
        ou3.getClass();
        return (io3) rj1.I(qu3.l, ou3);
    }

    public static final ap3 z(su3 su3) {
        su3.getClass();
        ou3 ou3 = ap3.g;
        ou3.getClass();
        return (ap3) rj1.I(su3.p, ou3);
    }
}
