package defpackage;

/* renamed from: c53  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class c53 {
    public final wn0 a;
    public int b;
    public int c;
    public fz2 d = ((fz2) d53.b.s());

    public c53(wn0 wn0) {
        wn0.getClass();
        this.a = wn0;
    }

    public final un0 a(String str) {
        if (this.b == 0) {
            return null;
        }
        int i = ko0.a;
        int abs = Math.abs(ko0.a(str, 0, str.length()));
        int i2 = this.c;
        while (true) {
            int i3 = abs % i2;
            int i4 = i3 * 6;
            if (this.d.a(i4) == -1) {
                return null;
            }
            if (b(i4, str)) {
                return (un0) this.a.subSequence(this.d.a(i4 + 3), this.d.a(i4 + 4));
            }
            abs = i3 + 1;
            i2 = this.c;
        }
    }

    public final boolean b(int i, CharSequence charSequence) {
        int a2 = this.d.a(i + 1);
        int a3 = this.d.a(i + 2);
        int i2 = ko0.a;
        wn0 wn0 = this.a;
        wn0.getClass();
        if (a3 - a2 != charSequence.length()) {
            return false;
        }
        for (int i3 = a2; i3 < a3; i3++) {
            int charAt = wn0.charAt(i3);
            if (65 <= charAt && charAt < 91) {
                charAt += 32;
            }
            int charAt2 = charSequence.charAt(i3 - a2);
            if (65 <= charAt2 && charAt2 < 91) {
                charAt2 += 32;
            }
            if (charAt != charAt2) {
                return false;
            }
        }
        return true;
    }

    public final void c(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = this.b;
        int i7 = this.c;
        if (((double) i6) >= ((double) i7) * 0.75d) {
            fz2 fz2 = this.d;
            this.b = 0;
            this.c = (i7 * 2) | 128;
            fz2 fz22 = (fz2) d53.b.s();
            int size = (fz2.a.size() * 2) | 1;
            for (int i8 = 0; i8 < size; i8++) {
                fz22.a.add(d53.a.s());
            }
            this.d = fz22;
            bl6 y = t75.y(new ez2(fz2, (f61) null));
            while (y.hasNext()) {
                int intValue = ((Number) y.next()).intValue();
                c(fz2.a(intValue + 1), fz2.a(intValue + 2), fz2.a(intValue + 3), fz2.a(intValue + 4));
            }
            d53.b.e0(fz2);
            if (i6 != this.b) {
                h.q("Failed requirement.");
                return;
            }
        }
        wn0 wn0 = this.a;
        int abs = Math.abs(ko0.a(wn0, i, i2));
        CharSequence subSequence = wn0.subSequence(i, i2);
        int i9 = abs % this.c;
        int i10 = -1;
        while (true) {
            i5 = i9 * 6;
            if (this.d.a(i5) == -1) {
                break;
            }
            if (b(i5, subSequence)) {
                i10 = i9;
            }
            i9 = (i9 + 1) % this.c;
        }
        this.d.b(i5, abs);
        this.d.b(i5 + 1, i);
        this.d.b(i5 + 2, i2);
        this.d.b(i5 + 3, i3);
        this.d.b(i5 + 4, i4);
        this.d.b(i5 + 5, -1);
        if (i10 != -1) {
            this.d.b((i10 * 6) + 5, i9);
        }
        this.b++;
    }

    public final void d() {
        this.b = 0;
        this.c = 0;
        me0 me0 = d53.b;
        me0.e0(this.d);
        this.d = (fz2) me0.s();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        me0 me0 = d53.a;
        fz2 fz2 = this.d;
        fz2.getClass();
        bl6 y = t75.y(new ez2(fz2, (f61) null));
        while (y.hasNext()) {
            int intValue = ((Number) y.next()).intValue();
            sb.append("");
            int a2 = this.d.a(intValue + 1);
            int a3 = this.d.a(intValue + 2);
            wn0 wn0 = this.a;
            sb.append(wn0.subSequence(a2, a3));
            sb.append(" => ");
            sb.append((un0) wn0.subSequence(this.d.a(intValue + 3), this.d.a(intValue + 4)));
            sb.append("\n");
        }
        return sb.toString();
    }
}
