package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* renamed from: bg7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bg7 {
    public final ag7 a;
    public final pn4 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public bg7(ag7 ag7, pn4 pn4, long j) {
        float f2;
        this.a = ag7;
        this.b = pn4;
        this.c = j;
        ArrayList arrayList = pn4.h;
        float f3 = 0.0f;
        if (arrayList.isEmpty()) {
            f2 = 0.0f;
        } else {
            f2 = ((jc5) arrayList.get(0)).a.d.d(0);
        }
        this.d = f2;
        if (!arrayList.isEmpty()) {
            jc5 jc5 = (jc5) dt0.G0(arrayList);
            zf7 zf7 = jc5.a.d;
            f3 = zf7.d(zf7.g - 1) + jc5.f;
        }
        this.e = f3;
        this.f = pn4.g;
    }

    public final p56 a(int i) {
        int i2;
        pn4 pn4 = this.b;
        pn4.l(i);
        int length = ((vl) pn4.a.x).x.length();
        ArrayList arrayList = pn4.h;
        if (i == length) {
            i2 = sg3.x(arrayList);
        } else {
            i2 = tf4.p(i, arrayList);
        }
        jc5 jc5 = (jc5) arrayList.get(i2);
        zg zgVar = jc5.a;
        if (zgVar.d.f.isRtlCharAt(jc5.d(i))) {
            return p56.x;
        }
        return p56.w;
    }

    public final ly5 b(int i) {
        boolean z;
        float f2;
        float f3;
        float j;
        float j2;
        pn4 pn4 = this.b;
        pn4.k(i);
        ArrayList arrayList = pn4.h;
        jc5 jc5 = (jc5) arrayList.get(tf4.p(i, arrayList));
        zg zgVar = jc5.a;
        int d2 = jc5.d(i);
        CharSequence charSequence = zgVar.e;
        if (d2 < 0 || d2 >= charSequence.length()) {
            zb3.a("offset(" + d2 + ") is out of bounds [0," + charSequence.length() + ")");
        }
        zf7 zf7 = zgVar.d;
        int g = zf7.g(d2);
        float i2 = zf7.i(g);
        float e2 = zf7.e(g);
        Layout layout = zf7.f;
        if (layout.getParagraphDirection(g) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(d2);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                j = zf7.k(d2, false);
                j2 = zf7.k(d2 + 1, true);
            } else if (isRtlCharAt) {
                j = zf7.j(d2, false);
                j2 = zf7.j(d2 + 1, true);
            } else {
                f3 = zf7.k(d2, false);
                f2 = zf7.k(d2 + 1, true);
            }
            float f4 = j;
            f3 = j2;
            f2 = f4;
        } else {
            f3 = zf7.j(d2, false);
            f2 = zf7.j(d2 + 1, true);
        }
        RectF rectF = new RectF(f3, i2, f2, e2);
        return jc5.a(new ly5(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final ly5 c(int i) {
        int i2;
        pn4 pn4 = this.b;
        pn4.l(i);
        int length = ((vl) pn4.a.x).x.length();
        ArrayList arrayList = pn4.h;
        if (i == length) {
            i2 = sg3.x(arrayList);
        } else {
            i2 = tf4.p(i, arrayList);
        }
        jc5 jc5 = (jc5) arrayList.get(i2);
        zg zgVar = jc5.a;
        int d2 = jc5.d(i);
        CharSequence charSequence = zgVar.e;
        zf7 zf7 = zgVar.d;
        if (d2 < 0 || d2 > charSequence.length()) {
            int length2 = charSequence.length();
            zb3.a("offset(" + d2 + ") is out of bounds [0," + length2 + "]");
        }
        float j = zf7.j(d2, false);
        int g = zf7.g(d2);
        return jc5.a(new ly5(j, zf7.i(g), j, zf7.e(g)));
    }

    public final boolean d() {
        long j = this.c;
        pn4 pn4 = this.b;
        if (((float) ((int) (j >> 32))) >= pn4.d && !pn4.c && ((float) ((int) (j & 4294967295L))) >= pn4.e) {
            return false;
        }
        return true;
    }

    public final float e(int i) {
        float f2;
        pn4 pn4 = this.b;
        pn4.m(i);
        ArrayList arrayList = pn4.h;
        jc5 jc5 = (jc5) arrayList.get(tf4.q(i, arrayList));
        zg zgVar = jc5.a;
        int i2 = i - jc5.d;
        zf7 zf7 = zgVar.d;
        float lineLeft = zf7.f.getLineLeft(i2);
        if (i2 == zf7.g - 1) {
            f2 = zf7.j;
        } else {
            f2 = 0.0f;
        }
        return lineLeft + f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bg7) {
            bg7 bg7 = (bg7) obj;
            if (sg3.e(this.a, bg7.a) && this.b == bg7.b && we3.a(this.c, bg7.c) && this.d == bg7.d && this.e == bg7.e && sg3.e(this.f, bg7.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        float f2;
        pn4 pn4 = this.b;
        pn4.m(i);
        ArrayList arrayList = pn4.h;
        jc5 jc5 = (jc5) arrayList.get(tf4.q(i, arrayList));
        zg zgVar = jc5.a;
        int i2 = i - jc5.d;
        zf7 zf7 = zgVar.d;
        float lineRight = zf7.f.getLineRight(i2);
        if (i2 == zf7.g - 1) {
            f2 = zf7.k;
        } else {
            f2 = 0.0f;
        }
        return lineRight + f2;
    }

    public final int g(int i) {
        pn4 pn4 = this.b;
        pn4.m(i);
        ArrayList arrayList = pn4.h;
        jc5 jc5 = (jc5) arrayList.get(tf4.q(i, arrayList));
        return jc5.a.d.f.getLineStart(i - jc5.d) + jc5.b;
    }

    public final p56 h(int i) {
        int i2;
        pn4 pn4 = this.b;
        pn4.l(i);
        int length = ((vl) pn4.a.x).x.length();
        ArrayList arrayList = pn4.h;
        if (i == length) {
            i2 = sg3.x(arrayList);
        } else {
            i2 = tf4.p(i, arrayList);
        }
        jc5 jc5 = (jc5) arrayList.get(i2);
        zg zgVar = jc5.a;
        int d2 = jc5.d(i);
        zf7 zf7 = zgVar.d;
        if (zf7.f.getParagraphDirection(zf7.g(d2)) == 1) {
            return p56.w;
        }
        return p56.x;
    }

    public final int hashCode() {
        return this.f.hashCode() + f21.d(this.e, f21.d(this.d, pb4.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final eh i(int i, int i2) {
        pn4 pn4 = this.b;
        vl vlVar = (vl) pn4.a.x;
        if (i < 0 || i > i2 || i2 > vlVar.x.length()) {
            int length = vlVar.x.length();
            StringBuilder p = pb4.p("Start(", i, ") or End(", i2, ") is out of range [0..");
            p.append(length);
            p.append("), or start > end!");
            zb3.a(p.toString());
        }
        if (i == i2) {
            return gh.a();
        }
        eh a2 = gh.a();
        tf4.s(pn4.h, i95.a(i, i2), new gd3(a2, i, i2, 3));
        return a2;
    }

    public final long j(int i) {
        int i2;
        int i3;
        int i4;
        int H;
        pn4 pn4 = this.b;
        pn4.l(i);
        int length = ((vl) pn4.a.x).x.length();
        ArrayList arrayList = pn4.h;
        if (i == length) {
            i2 = sg3.x(arrayList);
        } else {
            i2 = tf4.p(i, arrayList);
        }
        jc5 jc5 = (jc5) arrayList.get(i2);
        zg zgVar = jc5.a;
        int d2 = jc5.d(i);
        xs0 l = zgVar.d.l();
        if (l.E(l.Q(d2))) {
            l.h(d2);
            i3 = d2;
            while (i3 != -1 && (!l.E(i3) || l.A(i3))) {
                i3 = l.Q(i3);
            }
        } else {
            l.h(d2);
            if (l.D(d2)) {
                if (!l.B(d2) || l.z(d2)) {
                    i3 = l.Q(d2);
                } else {
                    i3 = d2;
                }
            } else if (l.z(d2)) {
                i3 = l.Q(d2);
            } else {
                i3 = -1;
            }
        }
        if (i3 == -1) {
            i3 = d2;
        }
        if (l.A(l.H(d2))) {
            l.h(d2);
            i4 = d2;
            while (i4 != -1 && (l.E(i4) || !l.A(i4))) {
                i4 = l.H(i4);
            }
        } else {
            l.h(d2);
            if (l.z(d2)) {
                if (!l.B(d2) || l.D(d2)) {
                    H = l.H(d2);
                } else {
                    i4 = d2;
                }
            } else if (l.D(d2)) {
                H = l.H(d2);
            } else {
                i4 = -1;
            }
            i4 = H;
        }
        if (i4 != -1) {
            d2 = i4;
        }
        return jc5.b(false, i95.a(i3, d2));
    }

    public final String toString() {
        String b2 = we3.b(this.c);
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + b2 + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
