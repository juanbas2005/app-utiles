package defpackage;

import android.graphics.Rect;
import java.util.List;

/* renamed from: qa8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class qa8 {
    public final db8 a;
    public ad3[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public qa8(db8 db8) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = db8;
        c(db8);
    }

    public final void a() {
        ad3[] ad3Arr = this.b;
        if (ad3Arr != null) {
            ad3 ad3 = ad3Arr[0];
            ad3 ad32 = ad3Arr[1];
            db8 db8 = this.a;
            if (ad32 == null) {
                ad32 = db8.a.h(2);
            }
            if (ad3 == null) {
                ad3 = db8.a.h(1);
            }
            h(ad3.a(ad3, ad32));
            ad3 ad33 = this.b[z65.F(16)];
            if (ad33 != null) {
                g(ad33);
            }
            ad3 ad34 = this.b[z65.F(32)];
            if (ad34 != null) {
                e(ad34);
            }
            ad3 ad35 = this.b[z65.F(64)];
            if (ad35 != null) {
                i(ad35);
            }
        }
    }

    public abstract db8 b();

    public void c(db8 db8) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e = db8.a.e(i);
            int F = z65.F(i);
            this.c[F] = (Rect[]) e.toArray(new Rect[e.size()]);
            if (i != 8) {
                List<Rect> f = db8.a.f(i);
                this.d[F] = (Rect[]) f.toArray(new Rect[f.size()]);
            }
        }
    }

    public void d(int i, ad3 ad3) {
        if (this.b == null) {
            this.b = new ad3[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[z65.F(i2)] = ad3;
            }
        }
    }

    public abstract void f(ad3 ad3);

    public abstract void h(ad3 ad3);

    public qa8() {
        this(new db8());
    }

    public void e(ad3 ad3) {
    }

    public void g(ad3 ad3) {
    }

    public void i(ad3 ad3) {
    }
}
