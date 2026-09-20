package defpackage;

/* renamed from: g64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g64 {
    public static final int b = 66305;
    public final int a;

    public /* synthetic */ g64(int i) {
        this.a = i;
    }

    public static String a(int i) {
        String str;
        String str2;
        int i2 = i & 255;
        String str3 = "Invalid";
        if (i2 == 1) {
            str = "Strategy.Simple";
        } else if (i2 == 2) {
            str = "Strategy.HighQuality";
        } else if (i2 == 3) {
            str = "Strategy.Balanced";
        } else if (i2 == 0) {
            str = "Strategy.Unspecified";
        } else {
            str = str3;
        }
        int i3 = (i >> 8) & 255;
        if (i3 == 1) {
            str2 = "Strictness.None";
        } else if (i3 == 2) {
            str2 = "Strictness.Loose";
        } else if (i3 == 3) {
            str2 = "Strictness.Normal";
        } else if (i3 == 4) {
            str2 = "Strictness.Strict";
        } else if (i3 == 0) {
            str2 = "Strictness.Unspecified";
        } else {
            str2 = str3;
        }
        int i4 = (i >> 16) & 255;
        if (i4 == 1) {
            str3 = "WordBreak.None";
        } else if (i4 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i4 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        return f21.l(f21.o("LineBreak(strategy=", str, ", strictness=", str2, ", wordBreak="), str3, ")");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof g64) && this.a == ((g64) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
