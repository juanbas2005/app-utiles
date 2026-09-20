package defpackage;

import java.util.Map;

/* renamed from: bi3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class bi3 {
    public static final uq4 a = uq4.e("message");
    public static final uq4 b = uq4.e("allowedTargets");
    public static final uq4 c = uq4.e("value");
    public static final Map d = sf4.V(new yb5(m27.t, nn3.c), new yb5(m27.w, nn3.d), new yb5(m27.x, nn3.f));

    public static wl5 a(up2 up2, ci3 ci3, am6 am6) {
        n06 a2;
        up2.getClass();
        ci3.getClass();
        am6.getClass();
        if (up2.equals(m27.m)) {
            up2 up22 = nn3.e;
            up22.getClass();
            n06 a3 = ci3.a(up22);
            if (a3 != null) {
                return new mi3(a3, am6);
            }
        }
        up2 up23 = (up2) d.get(up2);
        if (up23 == null || (a2 = ci3.a(up23)) == null) {
            return null;
        }
        return b(a2, am6, false);
    }

    public static wl5 b(n06 n06, am6 am6, boolean z) {
        n06.getClass();
        am6.getClass();
        gq0 a2 = m06.a(kl8.u(kl8.p(n06.a)));
        up2 up2 = nn3.c;
        up2.getClass();
        if (a2.equals(new gq0(up2.b(), up2.a.g()))) {
            return new rj3(n06, am6);
        }
        up2 up22 = nn3.d;
        up22.getClass();
        if (a2.equals(new gq0(up22.b(), up22.a.g()))) {
            return new qj3(n06, am6);
        }
        up2 up23 = nn3.f;
        up23.getClass();
        if (a2.equals(new gq0(up23.b(), up23.a.g()))) {
            return new ai3(am6, n06, m27.x);
        }
        up2 up24 = nn3.e;
        up24.getClass();
        if (a2.equals(new gq0(up24.b(), up24.a.g()))) {
            return null;
        }
        return new t04(n06, am6, z);
    }
}
