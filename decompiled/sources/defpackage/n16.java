package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* renamed from: n16  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n16 extends c16 implements ci3 {
    public final l16 a;
    public final Annotation[] b;
    public final String c;
    public final boolean d;

    public n16(l16 l16, Annotation[] annotationArr, String str, boolean z) {
        annotationArr.getClass();
        this.a = l16;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    public final n06 a(up2 up2) {
        up2.getClass();
        return za5.o(this.b, up2);
    }

    public final Collection getAnnotations() {
        return za5.p(this.b);
    }

    public final String toString() {
        String str;
        uq4 uq4;
        StringBuilder sb = new StringBuilder();
        sb.append(n16.class.getName());
        sb.append(": ");
        if (this.d) {
            str = "vararg ";
        } else {
            str = "";
        }
        sb.append(str);
        String str2 = this.c;
        if (str2 != null) {
            uq4 = uq4.d(str2);
        } else {
            uq4 = null;
        }
        sb.append(uq4);
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
