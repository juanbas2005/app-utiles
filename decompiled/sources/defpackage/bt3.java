package defpackage;

/* renamed from: bt3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bt3 {
    public static final bt3 e = new bt3(0, 0, 127);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bt3(int i, int i2, int i3) {
        this(-1, (i3 & 2) != 0 ? null : Boolean.FALSE, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? -1 : i2);
    }

    public static bt3 a(int i) {
        bt3 bt3 = e;
        return new bt3(bt3.a, bt3.b, i, bt3.d);
    }

    public final c93 b(boolean z) {
        int i;
        boolean z2;
        int i2;
        int i3 = this.a;
        at3 at3 = new at3(i3);
        b93 b93 = null;
        if (i3 == -1) {
            at3 = null;
        }
        if (at3 != null) {
            i = at3.a;
        } else {
            i = 0;
        }
        int i4 = i;
        int i5 = 1;
        Boolean bool = this.b;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        int i6 = this.c;
        ct3 ct3 = new ct3(i6);
        if (i6 == 0) {
            ct3 = null;
        }
        if (ct3 != null) {
            i2 = ct3.a;
        } else {
            i2 = 1;
        }
        int i7 = this.d;
        b93 b932 = new b93(i7);
        if (i7 != -1) {
            b93 = b932;
        }
        if (b93 != null) {
            i5 = b93.a;
        }
        return new c93(z, i4, z2, i2, i5, ya4.y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (defpackage.bt3) r3;
     */
    public final boolean equals(Object obj) {
        bt3 bt3;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bt3) && this.a == bt3.a && sg3.e(this.b, bt3.b) && this.c == bt3.c && this.d == bt3.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        return f21.e(this.d, f21.e(this.c, (hashCode + i) * 31, 31), 29791);
    }

    public final String toString() {
        String a2 = at3.a(this.a);
        String a3 = ct3.a(this.c);
        String a4 = b93.a(this.d);
        StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=");
        sb.append(a2);
        sb.append(", autoCorrectEnabled=");
        sb.append(this.b);
        sb.append(", keyboardType=");
        return pb4.n(sb, a3, ", imeAction=", a4, ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)");
    }

    public bt3(int i, Boolean bool, int i2, int i3) {
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
    }
}
