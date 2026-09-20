package defpackage;

import java.util.ArrayList;

/* renamed from: ns  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ns {
    public ly6 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public final bs d;
    public boolean e = false;

    public ns(wr0 wr0) {
        this.d = new bs(this, wr0);
    }

    public final void a(x64 x64, int i) {
        ly6 j = x64.j(i);
        bs bsVar = this.d;
        bsVar.g(j, 1.0f);
        bsVar.g(x64.j(i), -1.0f);
    }

    public final void b(ly6 ly6, ly6 ly62, ly6 ly63, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        bs bsVar = this.d;
        if (!z) {
            bsVar.g(ly6, -1.0f);
            bsVar.g(ly62, 1.0f);
            bsVar.g(ly63, 1.0f);
            return;
        }
        bsVar.g(ly6, 1.0f);
        bsVar.g(ly62, -1.0f);
        bsVar.g(ly63, -1.0f);
    }

    public final void c(ly6 ly6, ly6 ly62, ly6 ly63, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        bs bsVar = this.d;
        if (!z) {
            bsVar.g(ly6, -1.0f);
            bsVar.g(ly62, 1.0f);
            bsVar.g(ly63, -1.0f);
            return;
        }
        bsVar.g(ly6, 1.0f);
        bsVar.g(ly62, -1.0f);
        bsVar.g(ly63, 1.0f);
    }

    public ly6 d(boolean[] zArr) {
        return f(zArr, (ly6) null);
    }

    public boolean e() {
        if (this.a == null && this.b == 0.0f && this.d.d() == 0) {
            return true;
        }
        return false;
    }

    public final ly6 f(boolean[] zArr, ly6 ly6) {
        int i;
        bs bsVar = this.d;
        int d2 = bsVar.d();
        ly6 ly62 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < d2; i2++) {
            float f2 = bsVar.f(i2);
            if (f2 < 0.0f) {
                ly6 e2 = bsVar.e(i2);
                if ((zArr == null || !zArr[e2.x]) && e2 != ly6 && (((i = e2.H) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    ly62 = e2;
                }
            }
        }
        return ly62;
    }

    public final void g(ly6 ly6) {
        ly6 ly62 = this.a;
        bs bsVar = this.d;
        if (ly62 != null) {
            bsVar.g(ly62, -1.0f);
            this.a.y = -1;
            this.a = null;
        }
        float h = bsVar.h(ly6, true) * -1.0f;
        this.a = ly6;
        if (h != 1.0f) {
            this.b /= h;
            int i = bsVar.h;
            int i2 = 0;
            while (i != -1 && i2 < bsVar.a) {
                float[] fArr = bsVar.g;
                fArr[i] = fArr[i] / h;
                i = bsVar.f[i];
                i2++;
            }
        }
    }

    public final void h(x64 x64, ly6 ly6, boolean z) {
        if (ly6.B) {
            bs bsVar = this.d;
            float c2 = bsVar.c(ly6);
            this.b = (ly6.A * c2) + this.b;
            bsVar.h(ly6, z);
            if (z) {
                ly6.b(this);
            }
            if (bsVar.d() == 0) {
                this.e = true;
                x64.a = true;
            }
        }
    }

    public void i(x64 x64, ns nsVar, boolean z) {
        bs bsVar = this.d;
        bsVar.getClass();
        float c2 = bsVar.c(nsVar.a);
        bsVar.h(nsVar.a, z);
        bs bsVar2 = nsVar.d;
        int d2 = bsVar2.d();
        for (int i = 0; i < d2; i++) {
            ly6 e2 = bsVar2.e(i);
            bsVar.a(e2, bsVar2.c(e2) * c2, z);
        }
        this.b = (nsVar.b * c2) + this.b;
        if (z) {
            nsVar.a.b(this);
        }
        if (this.a != null && bsVar.d() == 0) {
            this.e = true;
            x64.a = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        r7 = r10.f(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    public String toString() {
        String str;
        boolean z;
        String str2;
        float f;
        int i;
        String str3;
        if (this.a == null) {
            str = "0";
        } else {
            str = "" + this.a;
        }
        String concat = str.concat(" = ");
        int i2 = 0;
        if (this.b != 0.0f) {
            StringBuilder o = b81.o(concat);
            o.append(this.b);
            concat = o.toString();
            z = true;
        } else {
            z = false;
        }
        bs bsVar = this.d;
        int d2 = bsVar.d();
        while (i2 < d2) {
            ly6 e2 = bsVar.e(i2);
            if (!(e2 == null || f == 0.0f)) {
                String ly6 = e2.toString();
                if (!z) {
                    if (f < 0.0f) {
                        str2 = str2.concat("- ");
                    }
                    if (f == 1.0f) {
                        str3 = str2.concat(ly6);
                    } else {
                        str3 = str2 + f + " " + ly6;
                    }
                    z = true;
                } else if (i > 0) {
                    str2 = str2.concat(" + ");
                    if (f == 1.0f) {
                    }
                    z = true;
                } else {
                    str2 = str2.concat(" - ");
                }
                f *= -1.0f;
                if (f == 1.0f) {
                }
                z = true;
            }
            i2++;
        }
        if (!z) {
            return str2.concat("0.0");
        }
        return str2;
    }
}
