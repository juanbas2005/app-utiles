package defpackage;

/* renamed from: sl  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sl {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public sl(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final ul a(int i) {
        boolean z;
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (i != Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            zb3.b("Item.end should be set first");
        }
        return new ul(this.b, i, this.a, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl)) {
            return false;
        }
        sl slVar = (sl) obj;
        if (sg3.e(this.a, slVar.a) && this.b == slVar.b && this.c == slVar.c && sg3.e(this.d, slVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return this.d.hashCode() + f21.e(this.c, f21.e(this.b, i * 31, 31), 31);
    }

    public final String toString() {
        int i = this.c;
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + i + ", tag=" + this.d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl(rl rlVar, int i, int i2, int i3) {
        this(i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (Object) rlVar, "");
    }
}
