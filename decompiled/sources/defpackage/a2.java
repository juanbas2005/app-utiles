package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: a2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class a2 implements bm3, ok1, gy0 {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final pl3 c;
    public final String d;
    public final wl3 e;

    public a2(pl3 pl3, String str) {
        this.c = pl3;
        this.d = str;
        this.e = pl3.a;
    }

    public final byte A() {
        return I(U());
    }

    public final short B() {
        return P(U());
    }

    public final float C() {
        return L(U());
    }

    public final long D(ll6 ll6, int i) {
        ll6.getClass();
        return O(S(ll6, i));
    }

    public final double E() {
        return K(U());
    }

    public abstract JsonElement F(String str);

    public final JsonElement G() {
        JsonElement F;
        String str = (String) dt0.H0(this.a);
        if (str == null || (F = F(str)) == null) {
            return T();
        }
        return F;
    }

    public final boolean H(Object obj) {
        Boolean bool;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        JsonElement F = F(str2);
        if (!(F instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            c26 c26 = b26.a;
            sb.append(c26.b(JsonPrimitive.class).A());
            sb.append(", but had ");
            sb.append(c26.b(F.getClass()).A());
            sb.append(" as the serialized body of boolean");
            String sb2 = sb.toString();
            String W = W(str2);
            if (this.c.a.k) {
                str = ar7.J(-1, F.toString()).toString();
            } else {
                str = null;
            }
            throw new JsonException(ar7.t(-1, sb2, W, (String) null, str));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) F;
        try {
            ub3 ub3 = em3.a;
            String content = jsonPrimitive.getContent();
            String[] strArr = r47.a;
            content.getClass();
            if (content.equalsIgnoreCase("true")) {
                bool = Boolean.TRUE;
            } else if (content.equalsIgnoreCase("false")) {
                bool = Boolean.FALSE;
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            X(jsonPrimitive, "boolean", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "boolean", str2);
            throw null;
        }
    }

    public final byte I(Object obj) {
        Byte b2;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        JsonElement F = F(str2);
        if (!(F instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            c26 c26 = b26.a;
            sb.append(c26.b(JsonPrimitive.class).A());
            sb.append(", but had ");
            sb.append(c26.b(F.getClass()).A());
            sb.append(" as the serialized body of byte");
            String sb2 = sb.toString();
            String W = W(str2);
            if (this.c.a.k) {
                str = ar7.J(-1, F.toString()).toString();
            } else {
                str = null;
            }
            throw new JsonException(ar7.t(-1, sb2, W, (String) null, str));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) F;
        try {
            long g = em3.g(jsonPrimitive);
            if (-128 > g || g > 127) {
                b2 = null;
            } else {
                b2 = Byte.valueOf((byte) ((int) g));
            }
            if (b2 != null) {
                return b2.byteValue();
            }
            X(jsonPrimitive, "byte", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "byte", str2);
            throw null;
        }
    }

    public final char J(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        JsonElement F = F(str2);
        if (!(F instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            c26 c26 = b26.a;
            sb.append(c26.b(JsonPrimitive.class).A());
            sb.append(", but had ");
            sb.append(c26.b(F.getClass()).A());
            sb.append(" as the serialized body of char");
            String sb2 = sb.toString();
            String W = W(str2);
            if (this.c.a.k) {
                str = ar7.J(-1, F.toString()).toString();
            } else {
                str = null;
            }
            throw new JsonException(ar7.t(-1, sb2, W, (String) null, str));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) F;
        try {
            String content = jsonPrimitive.getContent();
            content.getClass();
            int length = content.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            } else if (length == 1) {
                return content.charAt(0);
            } else {
                throw new IllegalArgumentException("Char sequence has more than one element.");
            }
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "char", str2);
            throw null;
        }
    }

    public final double K(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        str3.getClass();
        JsonElement F = F(str3);
        boolean z = F instanceof JsonPrimitive;
        pl3 pl3 = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            c26 c26 = b26.a;
            sb.append(c26.b(JsonPrimitive.class).A());
            sb.append(", but had ");
            sb.append(c26.b(F.getClass()).A());
            sb.append(" as the serialized body of double");
            String sb2 = sb.toString();
            String W = W(str3);
            if (pl3.a.k) {
                str2 = ar7.J(-1, F.toString()).toString();
            } else {
                str2 = null;
            }
            throw new JsonException(ar7.t(-1, sb2, W, (String) null, str2));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) F;
        try {
            ub3 ub3 = em3.a;
            double parseDouble = Double.parseDouble(jsonPrimitive.getContent());
            if (pl3.a.h || Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            String K = ar7.K(Double.valueOf(parseDouble), str3);
            if (pl3.a.k) {
                str = ar7.J(-1, G().toString()).toString();
            } else {
                str = null;
            }
            throw new JsonException(ar7.t(-1, K, (String) null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", str));
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "double", str3);
            throw null;
        }
    }

    public final float L(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        str3.getClass();
        JsonElement F = F(str3);
        boolean z = F instanceof JsonPrimitive;
        pl3 pl3 = this.c;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            c26 c26 = b26.a;
            sb.append(c26.b(JsonPrimitive.class).A());
            sb.append(", but had ");
            sb.append(c26.b(F.getClass()).A());
            sb.append(" as the serialized body of float");
            String sb2 = sb.toString();
            String W = W(str3);
            if (pl3.a.k) {
                str2 = ar7.J(-1, F.toString()).toString();
            } else {
                str2 = null;
            }
            throw new JsonException(ar7.t(-1, sb2, W, (String) null, str2));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) F;
        try {
            ub3 ub3 = em3.a;
            float parseFloat = Float.parseFloat(jsonPrimitive.getContent());
            if (pl3.a.h || Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            String K = ar7.K(Float.valueOf(parseFloat), str3);
            if (pl3.a.k) {
                str = ar7.J(-1, G().toString()).toString();
            } else {
                str = null;
            }
            throw new JsonException(ar7.t(-1, K, (String) null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", str));
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "float", str3);
            throw null;
        }
    }

    public final ok1 M(Object obj, ll6 ll6) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        ll6.getClass();
        if (n47.a(ll6)) {
            JsonElement F = F(str2);
            String a2 = ll6.a();
            boolean z = F instanceof JsonPrimitive;
            pl3 pl3 = this.c;
            if (z) {
                return new cm3(j45.c(pl3, ((JsonPrimitive) F).getContent()), pl3);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            c26 c26 = b26.a;
            sb.append(c26.b(JsonPrimitive.class).A());
            sb.append(", but had ");
            sb.append(c26.b(F.getClass()).A());
            String l = f21.l(sb, " as the serialized body of ", a2);
            String W = W(str2);
            if (pl3.a.k) {
                str = ar7.J(-1, F.toString()).toString();
            } else {
                str = null;
            }
            throw new JsonException(ar7.t(-1, l, W, (String) null, str));
        }
        this.a.add(str2);
        return this;
    }

    public final int N(Object obj) {
        Integer num;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        JsonElement F = F(str2);
        if (!(F instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            c26 c26 = b26.a;
            sb.append(c26.b(JsonPrimitive.class).A());
            sb.append(", but had ");
            sb.append(c26.b(F.getClass()).A());
            sb.append(" as the serialized body of int");
            String sb2 = sb.toString();
            String W = W(str2);
            if (this.c.a.k) {
                str = ar7.J(-1, F.toString()).toString();
            } else {
                str = null;
            }
            throw new JsonException(ar7.t(-1, sb2, W, (String) null, str));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) F;
        try {
            long g = em3.g(jsonPrimitive);
            if (-2147483648L > g || g > 2147483647L) {
                num = null;
            } else {
                num = Integer.valueOf((int) g);
            }
            if (num != null) {
                return num.intValue();
            }
            X(jsonPrimitive, "int", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "int", str2);
            throw null;
        }
    }

    public final long O(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        JsonElement F = F(str2);
        if (!(F instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            c26 c26 = b26.a;
            sb.append(c26.b(JsonPrimitive.class).A());
            sb.append(", but had ");
            sb.append(c26.b(F.getClass()).A());
            sb.append(" as the serialized body of long");
            String sb2 = sb.toString();
            String W = W(str2);
            if (this.c.a.k) {
                str = ar7.J(-1, F.toString()).toString();
            } else {
                str = null;
            }
            throw new JsonException(ar7.t(-1, sb2, W, (String) null, str));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) F;
        try {
            return em3.g(jsonPrimitive);
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "long", str2);
            throw null;
        }
    }

    public final short P(Object obj) {
        Short sh;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        JsonElement F = F(str2);
        if (!(F instanceof JsonPrimitive)) {
            StringBuilder sb = new StringBuilder("Expected ");
            c26 c26 = b26.a;
            sb.append(c26.b(JsonPrimitive.class).A());
            sb.append(", but had ");
            sb.append(c26.b(F.getClass()).A());
            sb.append(" as the serialized body of short");
            String sb2 = sb.toString();
            String W = W(str2);
            if (this.c.a.k) {
                str = ar7.J(-1, F.toString()).toString();
            } else {
                str = null;
            }
            throw new JsonException(ar7.t(-1, sb2, W, (String) null, str));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) F;
        try {
            long g = em3.g(jsonPrimitive);
            if (-32768 > g || g > 32767) {
                sh = null;
            } else {
                sh = Short.valueOf((short) ((int) g));
            }
            if (sh != null) {
                return sh.shortValue();
            }
            X(jsonPrimitive, "short", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(jsonPrimitive, "short", str2);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        JsonElement F = F(str2);
        boolean z = F instanceof JsonPrimitive;
        pl3 pl3 = this.c;
        String str3 = null;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            c26 c26 = b26.a;
            sb.append(c26.b(JsonPrimitive.class).A());
            sb.append(", but had ");
            sb.append(c26.b(F.getClass()).A());
            sb.append(" as the serialized body of string");
            String sb2 = sb.toString();
            String W = W(str2);
            if (pl3.a.k) {
                str = ar7.J(-1, F.toString()).toString();
            } else {
                str = null;
            }
            throw new JsonException(ar7.t(-1, sb2, W, (String) null, str));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) F;
        if (!(jsonPrimitive instanceof nm3)) {
            String h = f21.h("Expected string value for a non-null key '", str2, "', got null literal instead");
            String W2 = W(str2);
            if (pl3.a.k) {
                str3 = ar7.J(-1, G().toString()).toString();
            }
            throw new JsonException(ar7.t(-1, h, W2, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", str3));
        }
        nm3 nm3 = (nm3) jsonPrimitive;
        if (nm3.w || pl3.a.c) {
            return nm3.y;
        }
        String h2 = f21.h("String literal for value of key '", str2, "' should be quoted");
        String W3 = W(str2);
        if (pl3.a.k) {
            str3 = ar7.J(-1, G().toString()).toString();
        }
        throw new JsonException(ar7.t(-1, h2, W3, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", str3));
    }

    public String R(ll6 ll6, int i) {
        ll6.getClass();
        return ll6.f(i);
    }

    public final String S(ll6 ll6, int i) {
        ll6.getClass();
        String R = R(ll6, i);
        R.getClass();
        String str = (String) dt0.H0(this.a);
        return R;
    }

    public abstract JsonElement T();

    public final Object U() {
        ArrayList arrayList = this.a;
        Object remove = arrayList.remove(sg3.x(arrayList));
        this.b = true;
        return remove;
    }

    public final String V() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return "$";
        }
        return dt0.E0(arrayList, ".", "$.", (String) null, (vr2) null, 60);
    }

    public final String W(String str) {
        str.getClass();
        return V() + '.' + str;
    }

    public final void X(JsonPrimitive jsonPrimitive, String str, String str2) {
        String str3;
        String str4;
        if (k57.u0(str, "i", false)) {
            str3 = "an ";
        } else {
            str3 = "a ";
        }
        String str5 = "Failed to parse literal '" + jsonPrimitive + "' as " + str3.concat(str) + " value";
        String W = W(str2);
        if (this.c.a.k) {
            str4 = ar7.J(-1, G().toString()).toString();
        } else {
            str4 = null;
        }
        throw new JsonException(ar7.t(-1, str5, W, (String) null, str4));
    }

    public final z53 a() {
        return this.c.b;
    }

    public void b(ll6 ll6) {
        ll6.getClass();
    }

    public gy0 c(ll6 ll6) {
        String str;
        String str2;
        String str3;
        String str4;
        ll6.getClass();
        JsonElement G = G();
        n85 u = ll6.u();
        boolean e2 = sg3.e(u, n57.m);
        Class<JsonArray> cls = JsonArray.class;
        pl3 pl3 = this.c;
        if (e2 || (u instanceof yk5)) {
            String a2 = ll6.a();
            if (G instanceof JsonArray) {
                return new fn3(pl3, (JsonArray) G);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            c26 c26 = b26.a;
            sb.append(c26.b(cls).A());
            sb.append(", but had ");
            sb.append(c26.b(G.getClass()).A());
            String l = f21.l(sb, " as the serialized body of ", a2);
            String V = V();
            if (pl3.a.k) {
                str = ar7.J(-1, G.toString()).toString();
            } else {
                str = null;
            }
            throw new JsonException(ar7.t(-1, l, V, (String) null, str));
        }
        Class<JsonObject> cls2 = JsonObject.class;
        if (sg3.e(u, n57.n)) {
            ll6 e3 = aa5.e(ll6.h(0), pl3.b);
            n85 u2 = e3.u();
            if ((u2 instanceof no5) || sg3.e(u2, ql6.l)) {
                String a3 = ll6.a();
                if (G instanceof JsonObject) {
                    return new gn3(pl3, (JsonObject) G);
                }
                StringBuilder sb2 = new StringBuilder("Expected ");
                c26 c262 = b26.a;
                sb2.append(c262.b(cls2).A());
                sb2.append(", but had ");
                sb2.append(c262.b(G.getClass()).A());
                String l2 = f21.l(sb2, " as the serialized body of ", a3);
                String V2 = V();
                if (pl3.a.k) {
                    str3 = ar7.J(-1, G.toString()).toString();
                } else {
                    str3 = null;
                }
                throw new JsonException(ar7.t(-1, l2, V2, (String) null, str3));
            } else if (pl3.a.d) {
                String a4 = ll6.a();
                if (G instanceof JsonArray) {
                    return new fn3(pl3, (JsonArray) G);
                }
                StringBuilder sb3 = new StringBuilder("Expected ");
                c26 c263 = b26.a;
                sb3.append(c263.b(cls).A());
                sb3.append(", but had ");
                sb3.append(c263.b(G.getClass()).A());
                String l3 = f21.l(sb3, " as the serialized body of ", a4);
                String V3 = V();
                if (pl3.a.k) {
                    str4 = ar7.J(-1, G.toString()).toString();
                } else {
                    str4 = null;
                }
                throw new JsonException(ar7.t(-1, l3, V3, (String) null, str4));
            } else {
                throw ar7.c(e3);
            }
        } else {
            String a5 = ll6.a();
            if (G instanceof JsonObject) {
                return new en3(pl3, (JsonObject) G, this.d, 8);
            }
            StringBuilder sb4 = new StringBuilder("Expected ");
            c26 c264 = b26.a;
            sb4.append(c264.b(cls2).A());
            sb4.append(", but had ");
            sb4.append(c264.b(G.getClass()).A());
            String l4 = f21.l(sb4, " as the serialized body of ", a5);
            String V4 = V();
            if (pl3.a.k) {
                str2 = ar7.J(-1, G.toString()).toString();
            } else {
                str2 = null;
            }
            throw new JsonException(ar7.t(-1, l4, V4, (String) null, str2));
        }
    }

    public final ok1 d(lo5 lo5, int i) {
        lo5.getClass();
        return M(S(lo5, i), lo5.h(i));
    }

    public final boolean e() {
        return H(U());
    }

    public final char f() {
        return J(U());
    }

    public final Object g(zr3 zr3) {
        String str;
        String str2;
        String str3;
        zr3.getClass();
        if (!(zr3 instanceof q2)) {
            return zr3.deserialize(this);
        }
        pl3 pl3 = this.c;
        wl3 wl3 = pl3.a;
        q2 q2Var = (q2) zr3;
        String f = b35.f(pl3, q2Var.getDescriptor());
        JsonElement G = G();
        String a2 = q2Var.getDescriptor().a();
        if (!(G instanceof JsonObject)) {
            StringBuilder sb = new StringBuilder("Expected ");
            c26 c26 = b26.a;
            sb.append(c26.b(JsonObject.class).A());
            sb.append(", but had ");
            sb.append(c26.b(G.getClass()).A());
            String l = f21.l(sb, " as the serialized body of ", a2);
            String V = V();
            if (pl3.a.k) {
                str3 = ar7.J(-1, G.toString()).toString();
            } else {
                str3 = null;
            }
            throw new JsonException(ar7.t(-1, l, V, (String) null, str3));
        }
        JsonObject jsonObject = (JsonObject) G;
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) f);
        if (jsonElement != null) {
            JsonPrimitive f2 = em3.f(jsonElement);
            if (!(f2 instanceof JsonNull)) {
                str = f2.getContent();
                return i75.k(pl3, f, jsonObject, c35.f((q2) zr3, this, str));
            }
        }
        str = null;
        try {
            return i75.k(pl3, f, jsonObject, c35.f((q2) zr3, this, str));
        } catch (SerializationException e2) {
            String message = e2.getMessage();
            message.getClass();
            if (pl3.a.k) {
                str2 = ar7.J(-1, jsonObject.toString()).toString();
            } else {
                str2 = null;
            }
            throw new JsonException(ar7.t(-1, message, (String) null, (String) null, str2));
        }
    }

    public final double i(lo5 lo5, int i) {
        lo5.getClass();
        return K(S(lo5, i));
    }

    public final char j(lo5 lo5, int i) {
        lo5.getClass();
        return J(S(lo5, i));
    }

    public final float k(lo5 lo5, int i) {
        lo5.getClass();
        return L(S(lo5, i));
    }

    public final JsonElement l() {
        return G();
    }

    public final byte m(lo5 lo5, int i) {
        lo5.getClass();
        return I(S(lo5, i));
    }

    public final String n(ll6 ll6, int i) {
        ll6.getClass();
        return Q(S(ll6, i));
    }

    public final int o() {
        return N(U());
    }

    public final short p(lo5 lo5, int i) {
        lo5.getClass();
        return P(S(lo5, i));
    }

    public final ok1 q(ll6 ll6) {
        ll6.getClass();
        if (dt0.H0(this.a) != null) {
            return M(U(), ll6);
        }
        return new zm3(this.c, T(), this.d).q(ll6);
    }

    public final Object r(ll6 ll6, int i, zr3 zr3, Object obj) {
        ll6.getClass();
        zr3.getClass();
        this.a.add(S(ll6, i));
        zr3.getClass();
        Object g = g(zr3);
        if (!this.b) {
            U();
        }
        this.b = false;
        return g;
    }

    public final int s(ll6 ll6, int i) {
        ll6.getClass();
        return N(S(ll6, i));
    }

    public final String t() {
        return Q(U());
    }

    public final int u(ll6 ll6) {
        String str;
        ll6.getClass();
        String str2 = (String) U();
        str2.getClass();
        JsonElement F = F(str2);
        String a2 = ll6.a();
        boolean z = F instanceof JsonPrimitive;
        pl3 pl3 = this.c;
        if (z) {
            return rm3.b(ll6, pl3, ((JsonPrimitive) F).getContent(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        c26 c26 = b26.a;
        sb.append(c26.b(JsonPrimitive.class).A());
        sb.append(", but had ");
        sb.append(c26.b(F.getClass()).A());
        String l = f21.l(sb, " as the serialized body of ", a2);
        String W = W(str2);
        if (pl3.a.k) {
            str = ar7.J(-1, F.toString()).toString();
        } else {
            str = null;
        }
        throw new JsonException(ar7.t(-1, l, W, (String) null, str));
    }

    public final long v() {
        return O(U());
    }

    public boolean w() {
        return !(G() instanceof JsonNull);
    }

    public final Object x(ll6 ll6, int i, zr3 zr3, Object obj) {
        Object obj2;
        ll6.getClass();
        zr3.getClass();
        this.a.add(S(ll6, i));
        if (zr3.getDescriptor().c() || w()) {
            obj2 = g(zr3);
        } else {
            obj2 = null;
        }
        if (!this.b) {
            U();
        }
        this.b = false;
        return obj2;
    }

    public final pl3 y() {
        return this.c;
    }

    public final boolean z(ll6 ll6, int i) {
        ll6.getClass();
        return H(S(ll6, i));
    }
}
