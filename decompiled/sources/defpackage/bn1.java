package defpackage;

import android.graphics.Bitmap;

/* renamed from: bn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bn1 {
    public final h81 a;
    public final h81 b;
    public final h81 c;
    public final h81 d;
    public final l05 e = cm7.a;
    public final qm5 f = qm5.y;
    public final Bitmap.Config g;
    public final boolean h;
    public final eh0 i;
    public final eh0 j;
    public final eh0 k;

    public bn1() {
        dn1 dn1 = aw1.a;
        gy2 gy2 = pe4.a.B;
        cm1 cm1 = cm1.y;
        Bitmap.Config config = i.b;
        this.a = gy2;
        this.b = cm1;
        this.c = cm1;
        this.d = cm1;
        this.g = config;
        this.h = true;
        eh0 eh0 = eh0.ENABLED;
        this.i = eh0;
        this.j = eh0;
        this.k = eh0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn1)) {
            return false;
        }
        bn1 bn1 = (bn1) obj;
        if (sg3.e(this.a, bn1.a) && sg3.e(this.b, bn1.b) && sg3.e(this.c, bn1.c) && sg3.e(this.d, bn1.d) && sg3.e(this.e, bn1.e) && this.f == bn1.f && this.g == bn1.g && this.h == bn1.h && this.i == bn1.i && this.j == bn1.j && this.k == bn1.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        this.e.getClass();
        int hashCode4 = l05.class.hashCode();
        int hashCode5 = this.f.hashCode();
        int i2 = hl6.i(hl6.i((this.g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h), 923521, false);
        int hashCode6 = this.j.hashCode();
        return this.k.hashCode() + ((hashCode6 + ((this.i.hashCode() + i2) * 31)) * 31);
    }
}
