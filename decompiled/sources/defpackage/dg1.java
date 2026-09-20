package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: dg1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dg1 {
    public final re3 a;
    public final kg1 b;
    public final vf1 c;
    public final String d;
    public final String e;

    public dg1(re3 re3, kg1 kg1, vf1 vf1, rg1 rg1, String str, String str2, String str3) {
        this.a = re3;
        this.b = kg1;
        this.c = vf1;
        this.d = str;
        this.e = str2;
    }

    public final String a(th0 th0, Locale locale) {
        if (th0 == null) {
            String upperCase = this.c.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Object[] copyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.d, Arrays.copyOf(copyOf, copyOf.length));
        }
        int i = th0.w;
        re3 re3 = this.a;
        if (!re3.f(i)) {
            Object[] copyOf2 = Arrays.copyOf(new Object[]{uh0.a(re3.w, locale), uh0.a(re3.x, locale)}, 2);
            return String.format(this.e, Arrays.copyOf(copyOf2, copyOf2.length));
        }
        this.b.getClass();
        return "";
    }
}
