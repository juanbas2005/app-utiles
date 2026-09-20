package defpackage;

/* renamed from: ou0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ou0 implements h22 {
    public final vl a;
    public final int b;

    public ou0(String str, int i) {
        this(new vl(str), i);
    }

    public final void a(i22 i22) {
        int i;
        int i2 = i22.z;
        vl vlVar = this.a;
        int i3 = -1;
        if (i2 != -1) {
            i22.d(i2, i22.A, vlVar.x);
        } else {
            i22.d(i22.x, i22.y, vlVar.x);
        }
        int i4 = i22.x;
        int i5 = i22.y;
        if (i4 == i5) {
            i3 = i5;
        }
        int i6 = this.b;
        if (i6 > 0) {
            i = (i3 + i6) - 1;
        } else {
            i = (i3 + i6) - vlVar.x.length();
        }
        int p = z65.p(i, 0, ((xs0) i22.B).y());
        i22.f(p, p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou0)) {
            return false;
        }
        ou0 ou0 = (ou0) obj;
        if (sg3.e(this.a.x, ou0.a.x) && this.b == ou0.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.x.hashCode() * 31) + this.b;
    }

    public final String toString() {
        String str = this.a.x;
        return "CommitTextCommand(text='" + str + "', newCursorPosition=" + this.b + ")";
    }

    public ou0(vl vlVar, int i) {
        this.a = vlVar;
        this.b = i;
    }
}
