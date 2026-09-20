package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: vp2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vp2 {
    public static final uq4 e = uq4.g("<root>");
    public final String a;
    public transient up2 b;
    public transient vp2 c;
    public transient uq4 d;

    static {
        Pattern.compile("\\.").getClass();
    }

    public vp2(up2 up2, String str) {
        str.getClass();
        this.a = str;
        this.b = up2;
    }

    public static final List f(vp2 vp2) {
        if (vp2.c()) {
            return new ArrayList();
        }
        List f = f(vp2.e());
        f.add(vp2.g());
        return f;
    }

    public final vp2 a(uq4 uq4) {
        String str;
        uq4.getClass();
        if (c()) {
            str = uq4.b();
        } else {
            str = this.a + '.' + uq4.b();
        }
        str.getClass();
        return new vp2(str, this, uq4);
    }

    public final void b() {
        String str = this.a;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char charAt = str.charAt(length);
            if (charAt == '.' && !z) {
                break;
            }
            if (charAt == '`') {
                z = !z;
            } else if (charAt == '\\') {
                length--;
            }
            length--;
        }
        if (length >= 0) {
            this.d = uq4.d(str.substring(length + 1));
            this.c = new vp2(str.substring(0, length));
            return;
        }
        this.d = uq4.d(str);
        this.c = up2.c.a;
    }

    public final boolean c() {
        if (this.a.length() == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.b != null || d57.F0(this.a, '<', 0, 6) < 0) {
            return true;
        }
        return false;
    }

    public final vp2 e() {
        vp2 vp2 = this.c;
        if (vp2 != null) {
            return vp2;
        }
        if (!c()) {
            b();
            vp2 vp22 = this.c;
            vp22.getClass();
            return vp22;
        }
        h.s("root");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp2)) {
            return false;
        }
        if (!sg3.e(this.a, ((vp2) obj).a)) {
            return false;
        }
        return true;
    }

    public final uq4 g() {
        uq4 uq4 = this.d;
        if (uq4 != null) {
            return uq4;
        }
        if (!c()) {
            b();
            uq4 uq42 = this.d;
            uq42.getClass();
            return uq42;
        }
        h.s("root");
        return null;
    }

    public final boolean h(uq4 uq4) {
        uq4.getClass();
        if (!c()) {
            String str = this.a;
            int F0 = d57.F0(str, '.', 0, 6);
            if (F0 == -1) {
                F0 = str.length();
            }
            int i = F0;
            String b2 = uq4.b();
            b2.getClass();
            if (i != b2.length() || !k57.p0(0, 0, i, this.a, b2, false)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final up2 i() {
        up2 up2 = this.b;
        if (up2 != null) {
            return up2;
        }
        up2 up22 = new up2(this);
        this.b = up22;
        return up22;
    }

    public final String toString() {
        if (!c()) {
            return this.a;
        }
        String b2 = e.b();
        b2.getClass();
        return b2;
    }

    public vp2(String str) {
        this.a = str;
    }

    public vp2(String str, vp2 vp2, uq4 uq4) {
        this.a = str;
        this.c = vp2;
        this.d = uq4;
    }
}
