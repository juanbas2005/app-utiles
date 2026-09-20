package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: k26  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k26 implements Serializable {
    public final Pattern w;

    public k26(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((l26) it.next()).w;
        }
        Pattern compile = Pattern.compile("<li\\b[^>]*>(.*?)</li>", (i & 2) != 0 ? i | 64 : i);
        compile.getClass();
        this.w = compile;
    }

    public static xf4 a(k26 k26, String str) {
        k26.getClass();
        str.getClass();
        Matcher matcher = k26.w.matcher(str);
        matcher.getClass();
        return t35.g(matcher, 0, str);
    }

    public static cv2 b(k26 k26, CharSequence charSequence) {
        k26.getClass();
        charSequence.getClass();
        if (charSequence.length() >= 0) {
            return new cv2((sr2) new qm3(20, (Object) k26, (Object) charSequence), (vr2) j26.D);
        }
        ku4.d(charSequence.length(), pb4.o(0, "Start index out of bounds: ", ", input length: "));
        return null;
    }

    public final xf4 c(int i, String str) {
        str.getClass();
        Matcher region = this.w.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new xf4(region, str);
        }
        return null;
    }

    public final xf4 d(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.w.matcher(charSequence);
        matcher.getClass();
        if (!matcher.matches()) {
            return null;
        }
        return new xf4(matcher, charSequence);
    }

    public final boolean e(CharSequence charSequence) {
        charSequence.getClass();
        return this.w.matcher(charSequence).matches();
    }

    public final String f(String str, vr2 vr2) {
        str.getClass();
        Matcher matcher = this.w.matcher(str);
        matcher.getClass();
        int i = 0;
        xf4 g = t35.g(matcher, 0, str);
        if (g == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(str, i, g.b().w);
            sb.append((CharSequence) vr2.y(g));
            i = g.b().x + 1;
            g = g.c();
            if (i >= length) {
                break;
            }
        } while (g != null);
        if (i < length) {
            sb.append(str, i, length);
        }
        return sb.toString();
    }

    public final String g(String str, String str2) {
        str.getClass();
        String replaceAll = this.w.matcher(str).replaceAll(str2);
        replaceAll.getClass();
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.w.toString();
        pattern.getClass();
        return pattern;
    }

    public k26(String str, int i) {
        str.getClass();
        Pattern compile = Pattern.compile(str, 66);
        compile.getClass();
        this.w = compile;
    }

    public k26(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.w = compile;
    }
}
