package defpackage;

import java.util.List;

/* renamed from: hs4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hs4 {
    public final boolean a;
    public final String b;
    public final String c;
    public final List d;
    public final Long e;
    public final i98 f;

    /* JADX WARNING: Illegal instructions before constructor call */
    public /* synthetic */ hs4(boolean z, String str, String str2, List list, Long l, int i) {
        this(r1, r2, r3, (i & 8) != 0 ? a42.w : list, (i & 16) != 0 ? null : l, (i98) null);
        String str3;
        String str4;
        boolean z2 = (i & 1) != 0 ? false : z;
        if ((i & 2) != 0) {
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i & 4) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
    }

    public static hs4 a(hs4 hs4, i98 i98) {
        boolean z = hs4.a;
        String str = hs4.b;
        String str2 = hs4.c;
        List list = hs4.d;
        Long l = hs4.e;
        hs4.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        return new hs4(z, str, str2, list, l, i98);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs4)) {
            return false;
        }
        hs4 hs4 = (hs4) obj;
        if (this.a == hs4.a && sg3.e(this.b, hs4.b) && sg3.e(this.c, hs4.c) && sg3.e(this.d, hs4.d) && sg3.e(this.e, hs4.e) && sg3.e(this.f, hs4.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int j = hl6.j(this.d, hl6.h(hl6.h(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
        int i2 = 0;
        Long l = this.e;
        if (l == null) {
            i = 0;
        } else {
            i = l.hashCode();
        }
        int i3 = (j + i) * 31;
        i98 i98 = this.f;
        if (i98 != null) {
            i2 = i98.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "NautaScreenData(isLoggedIn=" + this.a + ", sessionUser=" + this.b + ", availableTime=" + this.c + ", savedAccounts=" + this.d + ", scheduledLogoutAt=" + this.e + ", wifiDetails=" + this.f + ")";
    }

    public hs4(boolean z, String str, String str2, List list, Long l, i98 i98) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = l;
        this.f = i98;
    }
}
