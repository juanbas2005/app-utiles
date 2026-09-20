package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: s62  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s62 extends t83 {
    public final Drawable a;
    public final s83 b;
    public final Throwable c;

    public s62(Drawable drawable, s83 s83, Throwable th) {
        this.a = drawable;
        this.b = s83;
        this.c = th;
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
        if (!(obj instanceof s62)) {
            return false;
        }
        s62 s62 = (s62) obj;
        if (!sg3.e(this.a, s62.a) || !sg3.e(this.b, s62.b) || !this.c.equals(s62.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        Drawable drawable = this.a;
        if (drawable != null) {
            i = drawable.hashCode();
        } else {
            i = 0;
        }
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (i * 31)) * 31);
    }
}
