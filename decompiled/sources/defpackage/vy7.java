package defpackage;

import java.util.UUID;

/* renamed from: vy7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vy7 {
    public final String a;
    public final String b;
    public final String c;
    public final uy7 d;
    public final String e;

    public vy7(String str, String str2, String str3, uy7 uy7, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        uy7.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uy7;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy7)) {
            return false;
        }
        vy7 vy7 = (vy7) obj;
        if (sg3.e(this.a, vy7.a) && sg3.e(this.b, vy7.b) && sg3.e(this.c, vy7.c) && this.d == vy7.d && sg3.e(this.e, vy7.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int h = hl6.h(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        return this.e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        StringBuilder o = f21.o("UssdCode(id=", this.a, ", name=", this.b, ", code=");
        o.append(this.c);
        o.append(", category=");
        o.append(this.d);
        o.append(", description=");
        return f21.l(o, this.e, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ vy7(String str, String str2, uy7 uy7, String str3) {
        this(r2, str, str2, uy7, str3);
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
    }
}
