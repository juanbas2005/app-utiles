package defpackage;

import android.util.Log;
import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: v  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v implements e68 {
    public int a;
    public boolean b;
    public Object c;

    public v(fu6 fu6, int i, boolean z) {
        this.c = fu6;
        this.a = i;
        this.b = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    public static final Object d(v vVar, xk1 xk1, q50 q50) {
        jn3 jn3;
        int i;
        byte b2;
        v vVar2;
        LinkedHashMap linkedHashMap;
        xk1 xk12;
        z1 z1Var;
        String str;
        z1 z1Var2 = (z1) vVar.c;
        if (q50 instanceof jn3) {
            jn3 = (jn3) q50;
            int i2 = jn3.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jn3.G = i2 - Integer.MIN_VALUE;
                Object obj = jn3.E;
                i = jn3.G;
                int i3 = 0;
                if (i != 0) {
                    o85.q(obj);
                    byte j = z1Var2.j((byte) 6);
                    if (z1Var2.z() != 4) {
                        linkedHashMap = new LinkedHashMap();
                        xk12 = xk1;
                        b2 = j;
                    } else {
                        z1.u(z1Var2, "Unexpected leading comma", 0, (String) null, 6);
                        throw null;
                    }
                } else if (i == 1) {
                    int i4 = jn3.D;
                    String str2 = jn3.C;
                    linkedHashMap = jn3.B;
                    vVar2 = jn3.A;
                    xk12 = jn3.z;
                    o85.q(obj);
                    linkedHashMap.put(str2, (JsonElement) obj);
                    b2 = ((z1) vVar2.c).h();
                    if (b2 != 4) {
                        if (b2 != 7) {
                            z1.u((z1) vVar2.c, "Expected end of the object or comma", 0, (String) null, 6);
                            throw null;
                        }
                        z1 z1Var3 = (z1) vVar2.c;
                        if (b2 != 6) {
                            z1Var3.j((byte) 7);
                        } else if (b2 == 4) {
                            ar7.C(z1Var3, "object");
                            throw null;
                        }
                        return new JsonObject(linkedHashMap);
                    }
                    i3 = i4;
                    vVar = vVar2;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1Var = (z1) vVar.c;
                if (!z1Var.e()) {
                    if (vVar.b) {
                        str = z1Var.p();
                    } else {
                        str = z1Var.n();
                    }
                    z1Var.j((byte) 5);
                    jn3.z = xk12;
                    jn3.A = vVar;
                    jn3.B = linkedHashMap;
                    jn3.C = str;
                    jn3.D = i3;
                    jn3.G = 1;
                    xk12.getClass();
                    xk12.x = jn3;
                    return p81.w;
                }
                vVar2 = vVar;
                z1 z1Var32 = (z1) vVar2.c;
                if (b2 != 6) {
                }
                return new JsonObject(linkedHashMap);
            }
        }
        jn3 = new jn3(vVar, q50);
        Object obj2 = jn3.E;
        i = jn3.G;
        int i32 = 0;
        if (i != 0) {
        }
        z1Var = (z1) vVar.c;
        if (!z1Var.e()) {
        }
    }

    public static int e(ArrayList arrayList, int i, jc6 jc6) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        hc6 hc6 = jc6.b;
        if (obj != hc6) {
            return -1;
        }
        for (lc6 lc6 : hc6.a()) {
            if (lc6 == jc6) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList g(mg0 mg0) {
        ArrayList arrayList = new ArrayList();
        while (!mg0.v()) {
            String str = (String) mg0.d;
            String str2 = null;
            if (!mg0.v()) {
                int i = mg0.b;
                char charAt = str.charAt(i);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    mg0.b = i;
                } else {
                    int g = mg0.g();
                    while (true) {
                        if ((g < 65 || g > 90) && (g < 97 || g > 122)) {
                            str2 = str.substring(i, mg0.b);
                        } else {
                            g = mg0.g();
                        }
                    }
                    str2 = str.substring(i, mg0.b);
                }
            }
            if (str2 != null) {
                try {
                    arrayList.add(ng0.valueOf(str2));
                } catch (IllegalArgumentException unused) {
                }
                if (!mg0.T()) {
                    break;
                }
            } else {
                break;
            }
        }
        return arrayList;
    }

    public static boolean m(xg0 xg0, int i, ArrayList arrayList, int i2, jc6 jc6) {
        yg0 yg0 = (yg0) xg0.a.get(i);
        if (!p(yg0, jc6)) {
            return false;
        }
        int i3 = yg0.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!o(xg0, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        } else if (i3 == 2) {
            return o(xg0, i - 1, arrayList, i2);
        } else {
            int e = e(arrayList, i2, jc6);
            if (e <= 0) {
                return false;
            }
            return m(xg0, i - 1, arrayList, i2, (jc6) jc6.b.a().get(e - 1));
        }
    }

    public static boolean n(xg0 xg0, jc6 jc6) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        hc6 hc6 = jc6.b;
        while (true) {
            i = 0;
            if (hc6 == null) {
                break;
            }
            arrayList.add(0, hc6);
            hc6 = ((lc6) hc6).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = xg0.a;
        if (arrayList2 == null) {
            i2 = 0;
        } else {
            i2 = arrayList2.size();
        }
        ArrayList arrayList3 = xg0.a;
        if (i2 == 1) {
            return p((yg0) arrayList3.get(0), jc6);
        }
        if (arrayList3 != null) {
            i = arrayList3.size();
        }
        return m(xg0, i - 1, arrayList, size, jc6);
    }

    public static boolean o(xg0 xg0, int i, ArrayList arrayList, int i2) {
        yg0 yg0 = (yg0) xg0.a.get(i);
        jc6 jc6 = (jc6) arrayList.get(i2);
        if (!p(yg0, jc6)) {
            return false;
        }
        int i3 = yg0.a;
        if (i3 == 1) {
            if (i == 0) {
                return true;
            }
            while (i2 > 0) {
                i2--;
                if (o(xg0, i - 1, arrayList, i2)) {
                }
            }
            return false;
            return true;
        } else if (i3 == 2) {
            return o(xg0, i - 1, arrayList, i2 - 1);
        } else {
            int e = e(arrayList, i2, jc6);
            if (e <= 0) {
                return false;
            }
            return m(xg0, i - 1, arrayList, i2, (jc6) jc6.b.a().get(e - 1));
        }
    }

    public static boolean p(yg0 yg0, jc6 jc6) {
        ArrayList arrayList;
        String str = yg0.b;
        if (str != null && !str.equals(jc6.o().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList arrayList2 = yg0.c;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                lg0 lg0 = (lg0) it.next();
                String str2 = lg0.a;
                String str3 = lg0.c;
                if (!str2.equals("id")) {
                    if (!str2.equals("class") || (arrayList = jc6.g) == null || !arrayList.contains(str3)) {
                        return false;
                    }
                } else if (!str3.equals(jc6.c)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = yg0.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (!((og0) it2.next()).a(jc6)) {
                return false;
            }
        }
        return true;
    }

    public void a() {
        this.b = true;
    }

    public void b() {
        v.super.setVisibility(0);
        this.b = false;
    }

    public void c() {
        if (!this.b) {
            ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
            actionBarContextView.B = null;
            v.super.setVisibility(this.a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        r10.b = true;
        r11.b(i(r12));
        r10.b = false;
     */
    public void f(wg0 wg0, mg0 mg0) {
        int intValue;
        char charAt;
        int i0;
        String k0 = mg0.k0();
        mg0.U();
        if (k0 != null) {
            int i = 0;
            if (!this.b && k0.equals("media")) {
                ArrayList g = g(mg0);
                if (mg0.s('{')) {
                    mg0.U();
                    ng0 ng0 = (ng0) this.c;
                    Iterator it = g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i(mg0);
                            break;
                        }
                        ng0 ng02 = (ng0) it.next();
                        if (ng02 != ng0.w) {
                            if (ng02 == ng0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (!mg0.v() && !mg0.s('}')) {
                        throw new Exception("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new Exception("Invalid @media rule: missing rule set");
                }
            } else if (this.b || !k0.equals("import")) {
                Log.w("CSSParser", "Ignoring @" + k0 + " rule");
                while (!mg0.v() && ((intValue = mg0.I().intValue()) != 59 || i != 0)) {
                    if (intValue != 123) {
                        if (intValue == 125 && i > 0 && i - 1 == 0) {
                            break;
                        }
                    } else {
                        i++;
                    }
                }
            } else {
                String str = null;
                if (!mg0.v()) {
                    int i2 = mg0.b;
                    if (mg0.t("url(")) {
                        mg0.U();
                        String j0 = mg0.j0();
                        if (j0 == null) {
                            String str2 = (String) mg0.d;
                            StringBuilder sb = new StringBuilder();
                            while (!mg0.v() && (charAt = str2.charAt(mg0.b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !xs0.F(charAt) && !Character.isISOControl(charAt)) {
                                mg0.b++;
                                if (charAt == '\\') {
                                    if (!mg0.v()) {
                                        int i3 = mg0.b;
                                        mg0.b = i3 + 1;
                                        charAt = str2.charAt(i3);
                                        if (!(charAt == 10 || charAt == 13 || charAt == 12)) {
                                            int i02 = mg0.i0(charAt);
                                            if (i02 != -1) {
                                                for (int i4 = 1; i4 <= 5 && !mg0.v() && (i0 = mg0.i0(str2.charAt(mg0.b))) != -1; i4++) {
                                                    mg0.b++;
                                                    i02 = (i02 * 16) + i0;
                                                }
                                                sb.append((char) i02);
                                            }
                                        }
                                    }
                                }
                                sb.append((char) charAt);
                            }
                            if (sb.length() == 0) {
                                j0 = null;
                            } else {
                                j0 = sb.toString();
                            }
                        }
                        if (j0 == null) {
                            mg0.b = i2;
                        } else {
                            mg0.U();
                            if (mg0.v() || mg0.t(")")) {
                                str = j0;
                            } else {
                                mg0.b = i2;
                            }
                        }
                    }
                }
                if (str == null) {
                    str = mg0.j0();
                }
                if (str != null) {
                    mg0.U();
                    g(mg0);
                    if (!mg0.v() && !mg0.s(';')) {
                        throw new Exception("Invalid @media rule: expected '}' at end of rule set");
                    }
                } else {
                    throw new Exception("Invalid @import rule: expected string or url()");
                }
            }
            mg0.U();
            return;
        }
        throw new Exception("Invalid '@' rule");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, vg0] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    public boolean h(wg0 wg0, mg0 mg0) {
        ArrayList l0 = mg0.l0();
        if (l0 == null || l0.isEmpty()) {
            return false;
        }
        if (mg0.s('{')) {
            mg0.U();
            dc6 dc6 = new dc6();
            do {
                String k0 = mg0.k0();
                mg0.U();
                if (!mg0.s(':')) {
                    mg0.U();
                    String str = (String) mg0.d;
                    String str2 = null;
                    if (!mg0.v()) {
                        int i = mg0.b;
                        int charAt = str.charAt(i);
                        int i2 = i;
                        while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && charAt != 10 && charAt != 13) {
                            if (!xs0.F(charAt)) {
                                i2 = mg0.b + 1;
                            }
                            charAt = mg0.g();
                        }
                        if (mg0.b > i) {
                            str2 = str.substring(i, i2);
                        } else {
                            mg0.b = i;
                        }
                    }
                    if (str2 != null) {
                        mg0.U();
                        if (mg0.s('!')) {
                            mg0.U();
                            if (mg0.t("important")) {
                                mg0.U();
                            } else {
                                throw new Exception("Malformed rule set: found unexpected '!'");
                            }
                        }
                        mg0.s(';');
                        td6.C(dc6, k0, str2);
                        mg0.U();
                        if (mg0.v() || mg0.s('}')) {
                            mg0.U();
                            Iterator it = l0.iterator();
                        }
                        String k02 = mg0.k0();
                        mg0.U();
                        if (!mg0.s(':')) {
                            throw new Exception("Expected ':'");
                        }
                    } else {
                        throw new Exception("Expected property value");
                    }
                }
            } while (mg0.s('}'));
            mg0.U();
            Iterator it2 = l0.iterator();
            while (it2.hasNext()) {
                int i3 = this.a;
                ? obj = new Object();
                obj.a = (xg0) it2.next();
                obj.b = dc6;
                obj.c = i3;
                wg0.a(obj);
            }
            return true;
        }
        throw new Exception("Malformed rule block: expected '{'");
    }

    public wg0 i(mg0 mg0) {
        wg0 wg0 = new wg0();
        while (!mg0.v()) {
            try {
                if (!mg0.t("<!--")) {
                    if (!mg0.t("-->")) {
                        if (!mg0.s('@')) {
                            if (!h(wg0, mg0)) {
                                break;
                            }
                        } else {
                            f(wg0, mg0);
                        }
                    }
                }
            } catch (kg0 e) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
                return wg0;
            }
        }
        return wg0;
    }

    /* JADX WARNING: type inference failed for: r1v14, types: [f61, java.lang.Object, xk1] */
    public JsonElement j() {
        JsonElement jsonElement;
        String str;
        Object obj;
        z1 z1Var = (z1) this.c;
        byte z = z1Var.z();
        if (z == 1) {
            return l(true);
        }
        if (z == 0) {
            return l(false);
        }
        if (z == 6) {
            int i = this.a + 1;
            this.a = i;
            if (i == 200) {
                in3 in3 = new in3(this, (f61) null);
                ? obj2 = new Object();
                obj2.w = in3;
                obj2.x = obj2;
                p81 p81 = uq3.b;
                obj2.y = p81;
                while (true) {
                    obj = obj2.y;
                    f61 f61 = obj2.x;
                    if (f61 == null) {
                        break;
                    } else if (sg3.e(p81, obj)) {
                        try {
                            in3 in32 = obj2.w;
                            mp7.Q(3, in32);
                            in3 in33 = new in3(in32.A, f61);
                            in33.z = obj2;
                            Object s = in33.s(vs7.a);
                            if (s != p81.w) {
                                f61.f(s);
                            }
                        } catch (Throwable th) {
                            f61.f(new m66(th));
                        }
                    } else {
                        obj2.y = p81;
                        f61.f(obj);
                    }
                }
                o85.q(obj);
                jsonElement = (JsonElement) obj;
            } else {
                byte j = z1Var.j((byte) 6);
                if (z1Var.z() != 4) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        if (!z1Var.e()) {
                            break;
                        }
                        if (this.b) {
                            str = z1Var.p();
                        } else {
                            str = z1Var.n();
                        }
                        z1Var.j((byte) 5);
                        linkedHashMap.put(str, j());
                        j = z1Var.h();
                        if (j != 4) {
                            if (j != 7) {
                                z1.u(z1Var, "Expected end of the object or comma", 0, (String) null, 6);
                                throw null;
                            }
                        }
                    }
                    if (j == 6) {
                        z1Var.j((byte) 7);
                    } else if (j == 4) {
                        ar7.C(z1Var, "object");
                        throw null;
                    }
                    jsonElement = new JsonObject(linkedHashMap);
                } else {
                    z1.u(z1Var, "Unexpected leading comma", 0, (String) null, 6);
                    throw null;
                }
            }
            this.a--;
            return jsonElement;
        } else if (z == 8) {
            return k();
        } else {
            z1.u(z1Var, "Cannot read Json element because of unexpected ".concat(fd1.a0(z)), 0, (String) null, 6);
            throw null;
        }
    }

    public JsonArray k() {
        boolean z;
        z1 z1Var = (z1) this.c;
        byte h = z1Var.h();
        if (z1Var.z() != 4) {
            ArrayList arrayList = new ArrayList();
            while (z1Var.e()) {
                arrayList.add(j());
                h = z1Var.h();
                if (h != 4) {
                    if (h == 9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i = z1Var.x;
                    if (!z) {
                        z1.u(z1Var, "Expected end of the array or comma", i, (String) null, 4);
                        throw null;
                    }
                }
            }
            if (h == 8) {
                z1Var.j((byte) 9);
            } else if (h == 4) {
                ar7.C(z1Var, "array");
                throw null;
            }
            return new JsonArray(arrayList);
        }
        z1.u(z1Var, "Unexpected leading comma", 0, (String) null, 6);
        throw null;
    }

    public JsonPrimitive l(boolean z) {
        String str;
        z1 z1Var = (z1) this.c;
        if (this.b || !z) {
            str = z1Var.p();
        } else {
            str = z1Var.n();
        }
        if (z || !sg3.e(str, "null")) {
            return new nm3(str, z, (ll6) null);
        }
        return JsonNull.INSTANCE;
    }
}
