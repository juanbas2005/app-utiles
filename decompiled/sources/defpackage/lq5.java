package defpackage;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llq5;", "Lr58;", "profile"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* renamed from: lq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lq5 extends r58 {
    public final p7 b;
    public final d37 c;
    public final xw5 d;
    public String e;

    public lq5(p7 p7Var) {
        p7Var.getClass();
        this.b = p7Var;
        d37 a = e37.a(new is7(6, new wp5()));
        this.c = a;
        this.d = kl8.N(new qi2(new f70(this, (f61) null, 10), a), new is7(6, new wp5()), u58.a(this));
    }

    public static boolean e(String str) {
        String obj = d57.k1(str).toString();
        obj.getClass();
        int F0 = d57.F0(obj, '@', 0, 6);
        if (F0 != -1) {
            obj = obj.substring(F0 + 1, obj.length());
        }
        if (!obj.equalsIgnoreCase("nauta.cu")) {
            String obj2 = d57.k1(str).toString();
            obj2.getClass();
            int F02 = d57.F0(obj2, '@', 0, 6);
            if (F02 != -1) {
                obj2 = obj2.substring(F02 + 1, obj2.length());
            }
            if (obj2.equalsIgnoreCase("nauta.com.cu")) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void f(rv rvVar) {
        d37 d37;
        Object value;
        rvVar.getClass();
        do {
            d37 = this.c;
            value = d37.getValue();
        } while (!pb4.t(wp5.a((wp5) ((is7) value).a, (u5) null, (a54) null, (b54) null, rvVar, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, false, (Integer) null, 16375), 6, d37, value));
    }

    public final void g(String str) {
        d37 d37;
        Object value;
        wp5 wp5;
        String str2;
        String str3 = str;
        str3.getClass();
        do {
            d37 = this.c;
            value = d37.getValue();
            wp5 = (wp5) ((is7) value).a;
            if (str3.equals(wp5.g.a)) {
                str2 = null;
            } else {
                str2 = "Las contraseñas no coinciden";
            }
        } while (!pb4.t(wp5.a(wp5, (u5) null, (a54) null, (b54) null, (rv) null, (if7) null, (if7) null, (if7) null, new if7(str3, str2), (if7) null, (if7) null, (if7) null, (if7) null, false, (Integer) null, 16255), 6, d37, value));
    }

    public final void h(String str) {
        d37 d37;
        Object value;
        wp5 wp5;
        String str2;
        str.getClass();
        do {
            d37 = this.c;
            value = d37.getValue();
            wp5 = (wp5) ((is7) value).a;
            if (c35.l(str)) {
                str2 = null;
            } else {
                str2 = "Correo no válido";
            }
        } while (!pb4.t(wp5.a(wp5, (u5) null, (a54) null, (b54) null, (rv) null, (if7) null, new if7(str, str2), (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, false, (Integer) null, 16351), 6, d37, value));
    }

    public final void i(String str) {
        d37 d37;
        Object value;
        wp5 wp5;
        String str2;
        str.getClass();
        do {
            d37 = this.c;
            value = d37.getValue();
            wp5 = (wp5) ((is7) value).a;
            if (str.length() >= 3) {
                str2 = null;
            } else {
                str2 = "La contraseña debe tener al menos 3 caracteres";
            }
        } while (!pb4.t(wp5.a(wp5, (u5) null, (a54) null, (b54) null, (rv) null, (if7) null, (if7) null, new if7(str, str2), (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, false, (Integer) null, 16319), 6, d37, value));
    }

    public final void j(String str) {
        d37 d37;
        Object value;
        wp5 wp5;
        String str2;
        str.getClass();
        do {
            d37 = this.c;
            value = d37.getValue();
            wp5 = (wp5) ((is7) value).a;
            if (!d57.I0(str)) {
                str2 = null;
            } else {
                str2 = "Escribe el código";
            }
        } while (!pb4.t(wp5.a(wp5, (u5) null, (a54) null, (b54) null, (rv) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, new if7(str, str2), (if7) null, (if7) null, false, (Integer) null, 15871), 6, d37, value));
    }

    public final boolean k(boolean z) {
        String str;
        String str2;
        String str3;
        Object value;
        wp5 wp5;
        Object value2;
        d37 d37 = this.c;
        wp5 wp52 = (wp5) ((is7) d37.getValue()).a;
        if7 if7 = wp52.f;
        if7 if72 = wp52.g;
        if (e(if7.a)) {
            do {
                value2 = d37.getValue();
            } while (!pb4.t(wp5.a((wp5) ((is7) value2).a, (u5) null, (a54) null, (b54) null, (rv) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, (if7) null, true, (Integer) null, 12287), 6, d37, value2));
            return false;
        }
        String str4 = null;
        if (!z || !d57.I0(wp52.e.a)) {
            str = null;
        } else {
            str = "El nombre no puede estar vacío";
        }
        if (c35.l(wp52.f.a)) {
            str2 = null;
        } else {
            str2 = "Correo no válido";
        }
        if (if72.a.length() >= 3) {
            str3 = null;
        } else {
            str3 = "La contraseña debe tener al menos 3 caracteres";
        }
        if (z && !sg3.e(wp52.h.a, if72.a)) {
            str4 = "Las contraseñas no coinciden";
        }
        do {
            value = d37.getValue();
            wp5 = (wp5) ((is7) value).a;
        } while (!pb4.t(wp5.a(wp5, (u5) null, (a54) null, (b54) null, (rv) null, if7.a(wp5.e, str), if7.a(wp5.f, str2), if7.a(wp5.g, str3), if7.a(wp5.h, str4), (if7) null, (if7) null, (if7) null, (if7) null, false, (Integer) null, 16143), 6, d37, value));
        List<String> E = sg3.E(str, str2, str3, str4);
        if (E.isEmpty()) {
            return true;
        }
        for (String str5 : E) {
            if (str5 != null) {
                return false;
            }
        }
        return true;
    }
}
