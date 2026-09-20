package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: f77  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f77 extends t83 {
    public final Drawable a;
    public final s83 b;
    public final pe1 c;
    public final mi4 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public f77(Drawable drawable, s83 s83, pe1 pe1, mi4 mi4, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = s83;
        this.c = pe1;
        this.d = mi4;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    public final Drawable a() {
        return this.a;
    }

    public final s83 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f77)) {
            return false;
        }
        f77 f77 = (f77) obj;
        if (!sg3.e(this.a, f77.a) || !sg3.e(this.b, f77.b) || this.c != f77.c || !sg3.e(this.d, f77.d) || !sg3.e(this.e, f77.e) || this.f != f77.f || this.g != f77.g) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i2 = 0;
        mi4 mi4 = this.d;
        if (mi4 != null) {
            i = mi4.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str = this.e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return Boolean.hashCode(this.g) + hl6.i((i3 + i2) * 31, 31, this.f);
    }
}
