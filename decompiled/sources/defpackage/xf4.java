package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* renamed from: xf4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xf4 {
    public final Matcher a;
    public final CharSequence b;
    public final wf4 c = new wf4(0, this);
    public vf4 d;

    public xf4(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
    }

    public final List a() {
        if (this.d == null) {
            this.d = new vf4(this);
        }
        vf4 vf4 = this.d;
        vf4.getClass();
        return vf4;
    }

    public final re3 b() {
        Matcher matcher = this.a;
        return z65.V(matcher.start(), matcher.end());
    }

    public final xf4 c() {
        int i;
        Matcher matcher = this.a;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        CharSequence charSequence = this.b;
        if (i2 > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return t35.g(matcher2, i2, charSequence);
    }
}
