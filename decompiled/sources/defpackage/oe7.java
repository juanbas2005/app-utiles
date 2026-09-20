package defpackage;

import java.util.List;

/* renamed from: oe7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class oe7 {
    public final vl a;
    public final long b;
    public final bg7 c;
    public final v35 d;
    public final kg7 e;
    public long f;
    public final vl g;
    public final hf7 h;
    public final cg7 i;

    public oe7(hf7 hf7, v35 v35, cg7 cg7, kg7 kg7) {
        bg7 bg7;
        vl vlVar = hf7.a;
        long j = hf7.b;
        if (cg7 != null) {
            bg7 = cg7.a;
        } else {
            bg7 = null;
        }
        this.a = vlVar;
        this.b = j;
        this.c = bg7;
        this.d = v35;
        this.e = kg7;
        this.f = j;
        this.g = vlVar;
        this.h = hf7;
        this.i = cg7;
    }

    public final List a(vr2 vr2) {
        if (lg7.c(this.f)) {
            h22 h22 = (h22) vr2.y(this);
            if (h22 != null) {
                return sg3.D(h22);
            }
            return null;
        }
        return sg3.E(new ou0("", 0), new vn6(lg7.f(this.f), lg7.f(this.f)));
    }

    public final Integer b() {
        bg7 bg7 = this.c;
        if (bg7 == null) {
            return null;
        }
        pn4 pn4 = bg7.b;
        int e2 = lg7.e(this.f);
        v35 v35 = this.d;
        return Integer.valueOf(v35.h(pn4.c(pn4.d(v35.p(e2)), true)));
    }

    public final Integer c() {
        bg7 bg7 = this.c;
        if (bg7 == null) {
            return null;
        }
        int f2 = lg7.f(this.f);
        v35 v35 = this.d;
        return Integer.valueOf(v35.h(bg7.g(bg7.b.d(v35.p(f2)))));
    }

    public final Integer d() {
        int length;
        bg7 bg7 = this.c;
        if (bg7 == null) {
            return null;
        }
        int r = r();
        while (true) {
            vl vlVar = this.a;
            if (r < vlVar.x.length()) {
                int length2 = this.g.x.length() - 1;
                if (r <= length2) {
                    length2 = r;
                }
                long j = bg7.j(length2);
                int i2 = lg7.c;
                int i3 = (int) (j & 4294967295L);
                if (i3 > r) {
                    length = this.d.h(i3);
                    break;
                }
                r++;
            } else {
                length = vlVar.x.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i2;
        bg7 bg7 = this.c;
        if (bg7 == null) {
            return null;
        }
        int r = r();
        while (true) {
            if (r <= 0) {
                i2 = 0;
                break;
            }
            int length = this.g.x.length() - 1;
            if (r <= length) {
                length = r;
            }
            long j = bg7.j(length);
            int i3 = lg7.c;
            int i4 = (int) (j >> 32);
            if (i4 < r) {
                i2 = this.d.h(i4);
                break;
            }
            r--;
        }
        return Integer.valueOf(i2);
    }

    public final boolean f() {
        p56 p56;
        bg7 bg7 = this.c;
        if (bg7 != null) {
            p56 = bg7.h(r());
        } else {
            p56 = null;
        }
        if (p56 != p56.x) {
            return true;
        }
        return false;
    }

    public final int g(bg7 bg7, int i2) {
        int r = r();
        kg7 kg7 = this.e;
        if (kg7.a == null) {
            kg7.a = Float.valueOf(bg7.c(r).a);
        }
        pn4 pn4 = bg7.b;
        int d2 = pn4.d(r) + i2;
        if (d2 < 0) {
            return 0;
        }
        if (d2 >= pn4.f) {
            return this.g.x.length();
        }
        float b2 = pn4.b(d2) - 1.0f;
        Float f2 = kg7.a;
        f2.getClass();
        float floatValue = f2.floatValue();
        if ((f() && floatValue >= bg7.f(d2)) || (!f() && floatValue <= bg7.e(d2))) {
            return pn4.c(d2, true);
        }
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2.floatValue());
        return this.d.h(pn4.g((((long) Float.floatToRawIntBits(b2)) & 4294967295L) | (floatToRawIntBits << 32)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r9 == null) goto L_0x0013;
     */
    public final int h(cg7 cg7, int i2) {
        ly5 ly5;
        dy3 dy3 = cg7.b;
        bg7 bg7 = cg7.a;
        if (dy3 != null) {
            dy3 dy32 = cg7.c;
            if (dy32 != null) {
                ly5 = dy32.Q(dy3, true);
            } else {
                ly5 = null;
            }
        }
        ly5 = ly5.e;
        long j = this.h.b;
        int i3 = lg7.c;
        v35 v35 = this.d;
        ly5 c2 = bg7.c(v35.p((int) (j & 4294967295L)));
        float f2 = c2.a;
        long floatToRawIntBits = ((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (ly5.c() & 4294967295L)) * ((float) i2)) + c2.b)) & 4294967295L;
        return v35.h(bg7.b.g(floatToRawIntBits | (((long) Float.floatToRawIntBits(f2)) << 32)));
    }

    public final void i() {
        kg7 kg7 = this.e;
        kg7.a = null;
        vl vlVar = this.g;
        if (vlVar.x.length() <= 0) {
            return;
        }
        if (f()) {
            k();
            return;
        }
        kg7.a = null;
        if (vlVar.x.length() > 0) {
            String str = vlVar.x;
            long j = this.f;
            int i2 = lg7.c;
            int p = t35.p((int) (j & 4294967295L), str);
            if (p != -1) {
                q(p, p);
            }
        }
    }

    public final void j() {
        this.e.a = null;
        vl vlVar = this.g;
        String str = vlVar.x;
        String str2 = vlVar.x;
        if (str.length() > 0) {
            int e2 = i35.e(lg7.e(this.f), str2);
            if (e2 == lg7.e(this.f) && e2 != str2.length()) {
                e2 = i35.e(e2 + 1, str2);
            }
            q(e2, e2);
        }
    }

    public final void k() {
        this.e.a = null;
        vl vlVar = this.g;
        if (vlVar.x.length() > 0) {
            String str = vlVar.x;
            long j = this.f;
            int i2 = lg7.c;
            int q = t35.q((int) (j & 4294967295L), str);
            if (q != -1) {
                q(q, q);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        vl vlVar = this.g;
        String str = vlVar.x;
        String str2 = vlVar.x;
        if (str.length() > 0) {
            int f2 = i35.f(lg7.f(this.f), str2);
            if (f2 == lg7.f(this.f) && f2 != 0) {
                f2 = i35.f(f2 - 1, str2);
            }
            q(f2, f2);
        }
    }

    public final void m() {
        kg7 kg7 = this.e;
        kg7.a = null;
        vl vlVar = this.g;
        if (vlVar.x.length() <= 0) {
            return;
        }
        if (f()) {
            kg7.a = null;
            if (vlVar.x.length() > 0) {
                String str = vlVar.x;
                long j = this.f;
                int i2 = lg7.c;
                int p = t35.p((int) (j & 4294967295L), str);
                if (p != -1) {
                    q(p, p);
                    return;
                }
                return;
            }
            return;
        }
        k();
    }

    public final void n() {
        Integer b2;
        this.e.a = null;
        if (this.g.x.length() > 0 && (b2 = b()) != null) {
            int intValue = b2.intValue();
            q(intValue, intValue);
        }
    }

    public final void o() {
        Integer c2;
        this.e.a = null;
        if (this.g.x.length() > 0 && (c2 = c()) != null) {
            int intValue = c2.intValue();
            q(intValue, intValue);
        }
    }

    public final void p() {
        if (this.g.x.length() > 0) {
            int i2 = lg7.c;
            this.f = i95.a((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i2, int i3) {
        this.f = i95.a(i2, i3);
    }

    public final int r() {
        long j = this.f;
        int i2 = lg7.c;
        return this.d.p((int) (j & 4294967295L));
    }
}
