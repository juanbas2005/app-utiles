package defpackage;

/* renamed from: hf7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hf7 {
    public static final kg5 d = new kg5(12, new of6(13), new ha7(10));
    public final vl a;
    public final long b;
    public final lg7 c;

    public hf7(vl vlVar, long j, lg7 lg7) {
        lg7 lg72;
        this.a = vlVar;
        this.b = i95.j(j, vlVar.x.length());
        if (lg7 != null) {
            lg72 = new lg7(i95.j(lg7.a, vlVar.x.length()));
        } else {
            lg72 = null;
        }
        this.c = lg72;
    }

    public static hf7 a(hf7 hf7, vl vlVar, long j, int i) {
        lg7 lg7;
        if ((i & 1) != 0) {
            vlVar = hf7.a;
        }
        if ((i & 2) != 0) {
            j = hf7.b;
        }
        if ((i & 4) != 0) {
            lg7 = hf7.c;
        } else {
            lg7 = null;
        }
        hf7.getClass();
        return new hf7(vlVar, j, lg7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf7)) {
            return false;
        }
        hf7 hf7 = (hf7) obj;
        if (!lg7.b(this.b, hf7.b) || !sg3.e(this.c, hf7.c) || !sg3.e(this.a, hf7.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = lg7.c;
        int b2 = pb4.b(this.a.hashCode() * 31, 31, this.b);
        lg7 lg7 = this.c;
        if (lg7 != null) {
            i = Long.hashCode(lg7.a);
        } else {
            i = 0;
        }
        return b2 + i;
    }

    public final String toString() {
        String h = lg7.h(this.b);
        return "TextFieldValue(text='" + this.a + "', selection=" + h + ", composition=" + this.c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public hf7(int i, long j, String str) {
        this(new vl((i & 1) != 0 ? "" : str), (i & 2) != 0 ? lg7.b : j, (lg7) null);
    }
}
