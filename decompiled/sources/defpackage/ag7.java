package defpackage;

import java.util.List;

/* renamed from: ag7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ag7 {
    public final vl a;
    public final tg7 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final tp1 g;
    public final ey3 h;
    public final dl2 i;
    public final long j;

    public ag7(vl vlVar, tg7 tg7, List list, int i2, boolean z, int i3, tp1 tp1, ey3 ey3, dl2 dl2, long j2) {
        this.a = vlVar;
        this.b = tg7;
        this.c = list;
        this.d = i2;
        this.e = z;
        this.f = i3;
        this.g = tp1;
        this.h = ey3;
        this.i = dl2;
        this.j = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag7)) {
            return false;
        }
        ag7 ag7 = (ag7) obj;
        if (sg3.e(this.a, ag7.a) && sg3.e(this.b, ag7.b) && sg3.e(this.c, ag7.c) && this.d == ag7.d && this.e == ag7.e && this.f == ag7.f && sg3.e(this.g, ag7.g) && this.h == ag7.h && sg3.e(this.i, ag7.i) && k31.b(this.j, ag7.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int e2 = f21.e(this.f, hl6.i((hl6.j(this.c, pb4.c(this.b, this.a.hashCode() * 31, 31), 31) + this.d) * 31, 31, this.e), 31);
        int hashCode = this.h.hashCode();
        int hashCode2 = this.i.hashCode();
        return Long.hashCode(this.j) + ((hashCode2 + ((hashCode + ((this.g.hashCode() + e2) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        int i2 = this.f;
        if (i2 == 1) {
            str = "Clip";
        } else if (i2 == 2) {
            str = "Ellipsis";
        } else if (i2 == 5) {
            str = "MiddleEllipsis";
        } else if (i2 == 3) {
            str = "Visible";
        } else if (i2 == 4) {
            str = "StartEllipsis";
        } else {
            str = "Invalid";
        }
        String k = k31.k(this.j);
        return "TextLayoutInput(text=" + this.a + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + str + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + k + ")";
    }
}
