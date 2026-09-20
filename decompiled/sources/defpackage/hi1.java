package defpackage;

import android.os.Build;
import java.util.Locale;

/* renamed from: hi1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hi1 {
    public final re3 a;
    public final Locale b;
    public final vh0 c;
    public final ed5 d;
    public final ed5 e;
    public final ed5 f;
    public final ed5 g;

    public hi1(Long l, Long l2, re3 re3, int i, kg1 kg1, Locale locale) {
        vh0 vh0;
        yh0 yh0;
        this.a = re3;
        this.b = locale;
        if (Build.VERSION.SDK_INT >= 26) {
            vh0 = new xh0(locale);
        } else {
            vh0 = new p44(locale);
        }
        this.c = vh0;
        this.d = u55.p(kg1);
        if (l2 != null) {
            yh0 = vh0.f(l2.longValue());
            if (!re3.f(yh0.a)) {
                yh0 = vh0.g(vh0.h());
            }
        } else {
            yh0 = vh0.g(vh0.h());
        }
        this.e = u55.p(yh0);
        th0 th0 = null;
        if (l != null) {
            th0 b2 = this.c.b(l.longValue());
            if (re3.f(b2.w)) {
                th0 = b2;
            }
        }
        this.f = u55.p(th0);
        this.g = u55.p(new cw1(i));
    }

    public final int a() {
        return ((cw1) this.g.getValue()).a;
    }

    public final Long b() {
        th0 th0 = (th0) this.f.getValue();
        if (th0 != null) {
            return Long.valueOf(th0.z);
        }
        return null;
    }
}
