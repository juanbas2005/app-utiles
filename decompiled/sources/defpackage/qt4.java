package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: qt4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class qt4 {
    public static final /* synthetic */ int A = 0;
    public final String w;
    public final ao x;
    public eu4 y;
    public final cz6 z = new cz6(0);

    static {
        new LinkedHashMap();
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, ao] */
    public qt4(nx4 nx4) {
        nx4.getClass();
        LinkedHashMap linkedHashMap = ox4.b;
        this.w = tf4.A(nx4.getClass());
        ? obj = new Object();
        obj.b = this;
        obj.c = new ArrayList();
        obj.d = new LinkedHashMap();
        this.x = obj;
    }

    public boolean equals(Object obj) {
        boolean z2;
        boolean z3;
        if (this != obj) {
            if (obj != null && (obj instanceof qt4)) {
                ao aoVar = this.x;
                qt4 qt4 = (qt4) obj;
                cz6 cz6 = qt4.z;
                ao aoVar2 = qt4.x;
                boolean e = sg3.e((ArrayList) aoVar.c, (ArrayList) aoVar2.c);
                cz6 cz62 = this.z;
                if (cz62.f() == cz6.f()) {
                    Iterator it = ((g21) cl6.O(new dz6(cz62))).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = true;
                            break;
                        }
                        int intValue = ((Number) it.next()).intValue();
                        if (!sg3.e(cz62.c(intValue), cz6.c(intValue))) {
                            break;
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (g().size() == qt4.g().size()) {
                    Iterator it2 = ((Iterable) dt0.o0(g().entrySet()).b).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z3 = true;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it2.next();
                        if (qt4.g().containsKey(entry.getKey())) {
                            if (!sg3.e(qt4.g().get(entry.getKey()), entry.getValue())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z3 = false;
                if (aoVar.a != aoVar2.a || !sg3.e((String) aoVar.e, (String) aoVar2.e) || !e || !z2 || !z3) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Bundle f(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.x.d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle j = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((xs4) entry.getValue()).getClass();
            ((String) entry.getKey()).getClass();
        }
        if (bundle != null) {
            j.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                xs4 xs4 = (xs4) entry2.getValue();
                boolean z2 = xs4.d;
                bv4 bv4 = xs4.a;
                if (!z2) {
                    str.getClass();
                    if (xs4.b || !j.containsKey(str) || !z85.t(str, j)) {
                        try {
                            bv4.a(str, j);
                        } catch (IllegalStateException unused) {
                        }
                    } else {
                        rf2.u(b81.q("Wrong argument type for '", str, "' in argument savedState. "), bv4.b(), " expected.");
                        return null;
                    }
                }
            }
        }
        return j;
    }

    public final Map g() {
        return sf4.b0((LinkedHashMap) this.x.d);
    }

    public int hashCode() {
        int i;
        boolean z2;
        int i2;
        ao aoVar = this.x;
        int i3 = aoVar.a * 31;
        String str = (String) aoVar.e;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i3 + i;
        Iterator it = ((ArrayList) aoVar.c).iterator();
        while (it.hasNext()) {
            i4 = (((nt4) it.next()).a.hashCode() + (i4 * 31)) * 961;
        }
        cz6 cz6 = this.z;
        cz6.getClass();
        if (cz6.f() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            for (String str2 : g().keySet()) {
                int h = hl6.h(i4 * 31, 31, str2);
                Object obj = g().get(str2);
                if (obj != null) {
                    i2 = obj.hashCode();
                } else {
                    i2 = 0;
                }
                i4 = h + i2;
            }
            return i4;
        }
        cz6.g(0).getClass();
        ku4.a();
        return 0;
    }

    public pt4 k(cf4 cf4) {
        boolean z2;
        Bundle bundle;
        boolean z3;
        k26 k26;
        xf4 d;
        cf4 cf42 = cf4;
        ao aoVar = this.x;
        LinkedHashMap linkedHashMap = (LinkedHashMap) aoVar.d;
        Uri uri = (Uri) cf42.x;
        ArrayList arrayList = (ArrayList) aoVar.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        pt4 pt4 = null;
        while (it.hasNext()) {
            nt4 nt4 = (nt4) it.next();
            nt4.getClass();
            z97 z97 = nt4.d;
            if (((k26) z97.getValue()) == null) {
                z2 = true;
            } else if (uri == null) {
                z2 = false;
            } else {
                k26 k262 = (k26) z97.getValue();
                k262.getClass();
                z2 = k262.e(uri.toString());
            }
            if (z2) {
                if (uri != null) {
                    bundle = nt4.d(uri, linkedHashMap);
                } else {
                    bundle = null;
                }
                int b = nt4.b(uri);
                String str = (String) cf42.y;
                if (str == null || !str.equals((Object) null)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (bundle == null) {
                    if (z3) {
                        linkedHashMap.getClass();
                        Bundle j = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                        if (!(uri == null || (k26 = (k26) z97.getValue()) == null || (d = k26.d(uri.toString())) == null)) {
                            nt4.e(d, j, linkedHashMap);
                            if (((Boolean) nt4.e.getValue()).booleanValue()) {
                                nt4.f(uri, j, linkedHashMap);
                            }
                        }
                        if (!gl0.a0(linkedHashMap, new lt4(1, j)).isEmpty()) {
                        }
                    }
                }
                pt4 pt42 = new pt4((qt4) aoVar.b, bundle, nt4.l, b, z3);
                if (pt4 == null || pt42.compareTo(pt4) > 0) {
                    pt4 = pt42;
                }
            }
        }
        return pt4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        ao aoVar = this.x;
        aoVar.getClass();
        sb.append(Integer.toHexString(aoVar.a));
        sb.append(")");
        String str = (String) aoVar.e;
        if (str != null && !d57.I0(str)) {
            sb.append(" route=");
            sb.append((String) aoVar.e);
        }
        return sb.toString();
    }
}
