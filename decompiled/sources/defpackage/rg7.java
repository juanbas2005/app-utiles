package defpackage;

/* renamed from: rg7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rg7 {
    public final String a;
    public String b;
    public boolean c = false;
    public mc5 d = null;

    public rg7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg7)) {
            return false;
        }
        rg7 rg7 = (rg7) obj;
        if (sg3.e(this.a, rg7.a) && sg3.e(this.b, rg7.b) && this.c == rg7.c && sg3.e(this.d, rg7.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = hl6.i(hl6.h(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        mc5 mc5 = this.d;
        if (mc5 == null) {
            i = 0;
        } else {
            i = mc5.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        mc5 mc5 = this.d;
        boolean z = this.c;
        return "TextSubstitution(layoutCache=" + mc5 + ", isShowingSubstitution=" + z + ")";
    }
}
