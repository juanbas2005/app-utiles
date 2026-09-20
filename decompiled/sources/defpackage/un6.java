package defpackage;

/* renamed from: un6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class un6 implements h22 {
    public final vl a;
    public final int b;

    public un6(String str, int i) {
        this.a = new vl(str);
        this.b = i;
    }

    public final void a(i22 i22) {
        int i;
        int i2 = i22.z;
        vl vlVar = this.a;
        int i3 = -1;
        if (i2 != -1) {
            int i4 = i22.A;
            String str = vlVar.x;
            String str2 = vlVar.x;
            i22.d(i2, i4, str);
            if (str2.length() > 0) {
                i22.e(i2, str2.length() + i2);
            }
        } else {
            int i5 = i22.x;
            int i6 = i22.y;
            String str3 = vlVar.x;
            String str4 = vlVar.x;
            i22.d(i5, i6, str3);
            if (str4.length() > 0) {
                i22.e(i5, str4.length() + i5);
            }
        }
        int i7 = i22.x;
        int i8 = i22.y;
        if (i7 == i8) {
            i3 = i8;
        }
        int i9 = this.b;
        if (i9 > 0) {
            i = (i3 + i9) - 1;
        } else {
            i = (i3 + i9) - vlVar.x.length();
        }
        int p = z65.p(i, 0, ((xs0) i22.B).y());
        i22.f(p, p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un6)) {
            return false;
        }
        un6 un6 = (un6) obj;
        if (sg3.e(this.a.x, un6.a.x) && this.b == un6.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.x.hashCode() * 31) + this.b;
    }

    public final String toString() {
        String str = this.a.x;
        return "SetComposingTextCommand(text='" + str + "', newCursorPosition=" + this.b + ")";
    }
}
