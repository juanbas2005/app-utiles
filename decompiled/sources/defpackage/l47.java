package defpackage;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* renamed from: l47  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class l47 extends bb0 implements bm3 {
    public final pl3 b0;
    public final ef8 c0;
    public final z1 d0;
    public final z53 e0;
    public int f0 = -1;
    public py2 g0;
    public final wl3 h0;
    public final fm3 i0;

    public l47(pl3 pl3, ef8 ef8, z1 z1Var, ll6 ll6, py2 py2) {
        fm3 fm3;
        pl3.getClass();
        ll6.getClass();
        this.b0 = pl3;
        this.c0 = ef8;
        this.d0 = z1Var;
        this.e0 = pl3.b;
        this.g0 = py2;
        wl3 wl3 = pl3.a;
        this.h0 = wl3;
        if (wl3.e) {
            fm3 = null;
        } else {
            fm3 = new fm3(ll6);
        }
        this.i0 = fm3;
    }

    public final byte A() {
        z1 z1Var = this.d0;
        long l = z1Var.l();
        byte b = (byte) ((int) l);
        if (l == ((long) b)) {
            return b;
        }
        z1.u(z1Var, "Failed to parse byte for input '" + l + '\'', 0, (String) null, 6);
        throw null;
    }

    public final short B() {
        z1 z1Var = this.d0;
        long l = z1Var.l();
        short s = (short) ((int) l);
        if (l == ((long) s)) {
            return s;
        }
        z1.u(z1Var, "Failed to parse short for input '" + l + '\'', 0, (String) null, 6);
        throw null;
    }

    public final float C() {
        z1 z1Var = this.d0;
        String p = z1Var.p();
        try {
            float parseFloat = Float.parseFloat(p);
            if (this.b0.a.h || Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            z1.u(z1Var, ar7.K(Float.valueOf(parseFloat), (String) null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            z1.u(z1Var, pb4.h('\'', "Failed to parse type 'float' for input '", p), 0, (String) null, 6);
            throw null;
        }
    }

    public final double E() {
        z1 z1Var = this.d0;
        String p = z1Var.p();
        try {
            double parseDouble = Double.parseDouble(p);
            if (this.b0.a.h || Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            z1.u(z1Var, ar7.K(Double.valueOf(parseDouble), (String) null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            z1.u(z1Var, pb4.h('\'', "Failed to parse type 'double' for input '", p), 0, (String) null, 6);
            throw null;
        }
    }

    public final z53 a() {
        return this.e0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    public final void b(ll6 ll6) {
        z1 z1Var;
        ll6.getClass();
        int e = ll6.e();
        pl3 pl3 = this.b0;
        if (e != 0 || !rm3.c(pl3, ll6)) {
            z1Var = this.d0;
            if (z1Var.E()) {
                z1Var.k(this.c0.x);
                kb9 kb9 = (kb9) z1Var.z;
                int i = kb9.x;
                int[] iArr = (int[]) kb9.A;
                if (iArr[i] == -2) {
                    iArr[i] = -1;
                    kb9.x = i - 1;
                }
                int i2 = kb9.x;
                if (i2 != -1) {
                    kb9.x = i2 - 1;
                    return;
                }
                return;
            }
            wl3 wl3 = pl3.a;
            ar7.C(z1Var, "");
            throw null;
        }
        do {
        } while (h(ll6) != -1);
        z1Var = this.d0;
        if (z1Var.E()) {
        }
    }

    public final gy0 c(ll6 ll6) {
        ll6.getClass();
        pl3 pl3 = this.b0;
        ef8 l = aa5.l(pl3, ll6);
        z1 z1Var = this.d0;
        kb9 kb9 = (kb9) z1Var.z;
        kb9.getClass();
        int i = kb9.x + 1;
        kb9.x = i;
        if (i == ((Object[]) kb9.z).length) {
            kb9.h();
        }
        ((Object[]) kb9.z)[i] = ll6;
        z1Var.k(l.w);
        if (z1Var.z() != 4) {
            int ordinal = l.ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return new l47(this.b0, l, z1Var, ll6, this.g0);
            } else if (this.c0 == l && pl3.a.e) {
                return this;
            } else {
                return new l47(this.b0, l, z1Var, ll6, this.g0);
            }
        } else {
            z1.u(z1Var, "Unexpected leading comma", 0, (String) null, 6);
            throw null;
        }
    }

    public final boolean e() {
        boolean z;
        boolean z2;
        z1 z1Var = this.d0;
        int C = z1Var.C();
        if (C != z1Var.w().length()) {
            if (z1Var.w().charAt(C) == '\"') {
                C++;
                z = true;
            } else {
                z = false;
            }
            int B = z1Var.B(C);
            if (B >= z1Var.w().length() || B == -1) {
                z1.u(z1Var, "EOF", 0, (String) null, 6);
                throw null;
            }
            int i = B + 1;
            char charAt = z1Var.w().charAt(B) | ' ';
            if (charAt == 'f') {
                z1Var.f(i, "alse");
                z2 = false;
            } else if (charAt == 't') {
                z1Var.f(i, "rue");
                z2 = true;
            } else {
                z1.u(z1Var, "Expected valid boolean literal prefix, but had '" + z1Var.p() + '\'', 0, (String) null, 6);
                throw null;
            }
            if (!z) {
                return z2;
            }
            if (z1Var.x == z1Var.w().length()) {
                z1.u(z1Var, "EOF", 0, (String) null, 6);
                throw null;
            } else if (z1Var.w().charAt(z1Var.x) == '\"') {
                z1Var.x++;
                return z2;
            } else {
                z1.u(z1Var, "Expected closing quotation mark", 0, (String) null, 6);
                throw null;
            }
        } else {
            z1.u(z1Var, "EOF", 0, (String) null, 6);
            throw null;
        }
    }

    public final char f() {
        z1 z1Var = this.d0;
        String p = z1Var.p();
        if (p.length() == 1) {
            return p.charAt(0);
        }
        z1.u(z1Var, pb4.h('\'', "Expected single char, but got '", p), 0, (String) null, 6);
        throw null;
    }

    public final Object g(zr3 zr3) {
        JsonObject jsonObject;
        String str;
        String str2;
        String str3;
        pl3 pl3 = this.b0;
        z1 z1Var = this.d0;
        kb9 kb9 = (kb9) z1Var.z;
        zr3.getClass();
        try {
            if (!(zr3 instanceof q2)) {
                return zr3.deserialize(this);
            }
            wl3 wl3 = pl3.a;
            String f = b35.f(pl3, ((q2) zr3).getDescriptor());
            String y = z1Var.y(f, this.h0.c);
            if (y == null) {
                wl3 wl32 = pl3.a;
                String f2 = b35.f(pl3, ((q2) zr3).getDescriptor());
                JsonElement l = l();
                String a = ((q2) zr3).getDescriptor().a();
                if (!(l instanceof JsonObject)) {
                    StringBuilder sb = new StringBuilder("Expected ");
                    c26 c26 = b26.a;
                    sb.append(c26.b(JsonObject.class).A());
                    sb.append(", but had ");
                    sb.append(c26.b(l.getClass()).A());
                    sb.append(" as the serialized body of ");
                    sb.append(a);
                    String sb2 = sb.toString();
                    String e = kb9.e();
                    if (pl3.a.k) {
                        str3 = ar7.J(-1, l.toString()).toString();
                    } else {
                        str3 = null;
                    }
                    throw new JsonException(ar7.t(-1, sb2, e, (String) null, str3));
                }
                jsonObject = (JsonObject) l;
                JsonElement jsonElement = (JsonElement) jsonObject.get((Object) f2);
                if (jsonElement != null) {
                    JsonPrimitive f3 = em3.f(jsonElement);
                    if (!(f3 instanceof JsonNull)) {
                        str = f3.getContent();
                        return i75.k(pl3, f2, jsonObject, c35.f((q2) zr3, this, str));
                    }
                }
                str = null;
                return i75.k(pl3, f2, jsonObject, c35.f((q2) zr3, this, str));
            }
            zr3 f4 = c35.f((q2) zr3, this, y);
            py2 py2 = new py2();
            py2.x = f;
            this.g0 = py2;
            return f4.deserialize(this);
        } catch (SerializationException e2) {
            String message = e2.getMessage();
            message.getClass();
            String S0 = d57.S0(d57.f1(message, 10), ".");
            String message2 = e2.getMessage();
            message2.getClass();
            String str4 = "";
            int F0 = d57.F0(message2, 10, 0, 6);
            if (F0 != -1) {
                str4 = message2.substring(F0 + 1, message2.length());
            }
            z1.u(z1Var, S0, 0, str4, 2);
            throw null;
        } catch (SerializationException e3) {
            String message3 = e3.getMessage();
            message3.getClass();
            if (pl3.a.k) {
                str2 = ar7.J(-1, jsonObject.toString()).toString();
            } else {
                str2 = null;
            }
            throw new JsonException(ar7.t(-1, message3, (String) null, (String) null, str2));
        } catch (MissingFieldException e4) {
            String message4 = e4.getMessage();
            message4.getClass();
            if (d57.x0(message4, "at path", false)) {
                throw e4;
            }
            throw new MissingFieldException(e4.getMessage() + " at path: " + kb9.e(), e4, e4.w, e4.x);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cc, code lost:
        r12 = r8;
     */
    public final int h(ll6 ll6) {
        int i;
        String str;
        char c;
        boolean z;
        ll6 ll62 = ll6;
        z1 z1Var = this.d0;
        kb9 kb9 = (kb9) z1Var.z;
        ll62.getClass();
        ef8 ef8 = this.c0;
        int ordinal = ef8.ordinal();
        char c2 = ':';
        int i2 = 0;
        pl3 pl3 = this.b0;
        byte b = 1;
        int i3 = -1;
        if (ordinal == 0) {
            boolean E = z1Var.E();
            while (true) {
                boolean e = z1Var.e();
                byte b2 = b;
                fm3 fm3 = this.i0;
                if (e) {
                    boolean z2 = this.h0.c;
                    if (z2) {
                        str = z1Var.q();
                    } else {
                        str = z1Var.g();
                    }
                    z1Var.k(c2);
                    i = rm3.a(ll62, pl3, str);
                    if (i == -3) {
                        if (!rm3.c(pl3, ll62)) {
                            py2 py2 = this.g0;
                            if (py2 == null || !sg3.e(py2.x, str)) {
                                int i4 = kb9.x;
                                int[] iArr = (int[]) kb9.A;
                            } else {
                                py2.x = null;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        byte z3 = z1Var.z();
                        if (z3 == 8 || z3 == 6) {
                            while (true) {
                                byte z4 = z1Var.z();
                                byte b3 = b2;
                                if (z4 == b3) {
                                    if (z2) {
                                        z1Var.p();
                                    } else {
                                        z1Var.g();
                                    }
                                    b2 = b3;
                                } else {
                                    c = 6;
                                    if (z4 == 8 || z4 == 6) {
                                        arrayList.add(Byte.valueOf(z4));
                                    } else if (z4 == 9) {
                                        if (((Number) dt0.G0(arrayList)).byteValue() == 8) {
                                            it0.k0(arrayList);
                                        } else {
                                            z1.u(z1Var, "found ] instead of }", 0, (String) null, 6);
                                            throw null;
                                        }
                                    } else if (z4 == 7) {
                                        if (((Number) dt0.G0(arrayList)).byteValue() == 6) {
                                            it0.k0(arrayList);
                                        } else {
                                            z1.u(z1Var, "found } instead of ]", 0, (String) null, 6);
                                            throw null;
                                        }
                                    } else if (z4 == 10) {
                                        z1.u(z1Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, (String) null, 6);
                                        throw null;
                                    }
                                    z1Var.h();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                    b2 = 1;
                                }
                            }
                        } else {
                            z1Var.p();
                            c = 6;
                        }
                        E = z1Var.E();
                        char c3 = c;
                        c2 = ':';
                        b = 1;
                    } else if (fm3 != null) {
                        m22 m22 = fm3.a;
                        if (i < 64) {
                            m22.w |= 1 << i;
                        } else {
                            int i5 = (i >>> 6) - 1;
                            long[] jArr = (long[]) m22.z;
                            jArr[i5] = jArr[i5] | (1 << (i & 63));
                        }
                    }
                } else if (E) {
                    wl3 wl3 = pl3.a;
                    ar7.C(z1Var, "object");
                    throw null;
                } else if (fm3 != null) {
                    m22 m222 = fm3.a;
                    yv yvVar = (yv) m222.y;
                    ll6 ll63 = (ll6) m222.x;
                    int e2 = ll63.e();
                    while (true) {
                        long j = m222.w;
                        long j2 = -1;
                        if (j != -1) {
                            int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                            m222.w |= 1 << numberOfTrailingZeros;
                            if (((Boolean) yvVar.H(ll63, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                i3 = numberOfTrailingZeros;
                                break;
                            }
                        } else if (e2 > 64) {
                            long[] jArr2 = (long[]) m222.z;
                            int length = jArr2.length;
                            loop3:
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                int i6 = i2 + 1;
                                int i7 = i6 * 64;
                                long j3 = jArr2[i2];
                                while (j3 != j2) {
                                    int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j3);
                                    j3 |= 1 << numberOfTrailingZeros2;
                                    i = numberOfTrailingZeros2 + i7;
                                    if (((Boolean) yvVar.H(ll63, Integer.valueOf(i))).booleanValue()) {
                                        jArr2[i2] = j3;
                                        break loop3;
                                    }
                                    j2 = -1;
                                }
                                jArr2[i2] = j3;
                                i2 = i6;
                                j2 = -1;
                            }
                        }
                    }
                }
            }
            int i42 = kb9.x;
            int[] iArr2 = (int[]) kb9.A;
            if (iArr2[i42] == -2) {
                iArr2[i42] = -1;
                kb9.x = i42 - 1;
            }
            int i8 = kb9.x;
            if (i8 != -1) {
                kb9.x = i8 - 1;
            }
            z1Var.t(d57.K0(0, 6, z1Var.D(0, z1Var.x), str), pb4.h('\'', "Encountered an unknown key '", str), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
            throw null;
        } else if (ordinal != 2) {
            boolean E2 = z1Var.E();
            if (z1Var.e()) {
                int i9 = this.f0;
                if (i9 == -1 || E2) {
                    i3 = i9 + 1;
                    this.f0 = i3;
                } else {
                    z1.u(z1Var, "Expected end of the array or comma", 0, (String) null, 6);
                    throw null;
                }
            } else if (E2) {
                wl3 wl32 = pl3.a;
                ar7.C(z1Var, "array");
                throw null;
            }
        } else {
            int i10 = this.f0;
            if (i10 % 2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z1Var.k(':');
            } else if (i10 != -1) {
                i2 = z1Var.E();
            }
            if (z1Var.e()) {
                if (z) {
                    int i11 = this.f0;
                    int i12 = z1Var.x;
                    if (i11 == -1) {
                        if (i2 != 0) {
                            z1.u(z1Var, "Unexpected leading comma", i12, (String) null, 4);
                            throw null;
                        }
                    } else if (i2 == 0) {
                        z1.u(z1Var, "Expected comma after the key-value pair", i12, (String) null, 4);
                        throw null;
                    }
                }
                i3 = this.f0 + 1;
                this.f0 = i3;
            } else if (i2 != 0) {
                wl3 wl33 = pl3.a;
                ar7.C(z1Var, "object");
                throw null;
            }
        }
        if (ef8 != ef8.MAP) {
            ((int[]) kb9.A)[kb9.x] = i3;
        }
        return i3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [v, java.lang.Object] */
    public final JsonElement l() {
        wl3 wl3 = this.b0.a;
        ? obj = new Object();
        obj.c = this.d0;
        obj.b = wl3.c;
        return obj.j();
    }

    public final int o() {
        z1 z1Var = this.d0;
        long l = z1Var.l();
        int i = (int) l;
        if (l == ((long) i)) {
            return i;
        }
        z1.u(z1Var, "Failed to parse int for input '" + l + '\'', 0, (String) null, 6);
        throw null;
    }

    public final ok1 q(ll6 ll6) {
        ll6.getClass();
        if (n47.a(ll6)) {
            return new cm3(this.d0, this.b0);
        }
        return this;
    }

    public final Object r(ll6 ll6, int i, zr3 zr3, Object obj) {
        boolean z;
        Object obj2;
        kb9 kb9 = (kb9) this.d0.z;
        ll6.getClass();
        zr3.getClass();
        if (this.c0 == ef8.MAP && (i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = kb9.x;
            if (((int[]) kb9.A)[i2] == -2) {
                ((Object[]) kb9.z)[i2] = pe2.G;
            }
        }
        Object g = g(zr3);
        if (z) {
            int i3 = kb9.x;
            if (((int[]) kb9.A)[i3] != -2) {
                int i4 = i3 + 1;
                kb9.x = i4;
                if (i4 == ((Object[]) kb9.z).length) {
                    kb9.h();
                }
            }
            Object[] objArr = (Object[]) kb9.z;
            int i5 = kb9.x;
            if (((wl3) kb9.y).k) {
                obj2 = g;
            } else {
                obj2 = g22.C;
            }
            objArr[i5] = obj2;
            ((int[]) kb9.A)[i5] = -2;
        }
        return g;
    }

    public final String t() {
        boolean z = this.h0.c;
        z1 z1Var = this.d0;
        if (z) {
            return z1Var.q();
        }
        return z1Var.n();
    }

    public final int u(ll6 ll6) {
        ll6.getClass();
        return rm3.b(ll6, this.b0, t(), " at path ".concat(((kb9) this.d0.z).e()));
    }

    public final long v() {
        return this.d0.l();
    }

    public final boolean w() {
        boolean z;
        boolean z2;
        fm3 fm3 = this.i0;
        if (fm3 != null) {
            z = fm3.b;
        } else {
            z = false;
        }
        if (!z) {
            z1 z1Var = this.d0;
            int B = z1Var.B(z1Var.C());
            int length = z1Var.w().length() - B;
            if (length >= 4 && B != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != z1Var.w().charAt(B + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || fd1.t(z1Var.w().charAt(B + 4)) != 0) {
                        z1Var.x = B + 4;
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    public final pl3 y() {
        return this.b0;
    }
}
