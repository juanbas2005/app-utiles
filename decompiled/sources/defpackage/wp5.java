package defpackage;

/* renamed from: wp5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wp5 {
    public final u5 a;
    public final a54 b;
    public final b54 c;
    public final rv d;
    public final if7 e;
    public final if7 f;
    public final if7 g;
    public final if7 h;
    public final if7 i;
    public final if7 j;
    public final if7 k;
    public final if7 l;
    public final boolean m;
    public final Integer n;

    public /* synthetic */ wp5() {
        this((u5) null, new a54(g54.x, "", 0), new b54(200, 100, 0, mv1.x, ""), rv.w, new if7(new String(), (String) null), new if7(new String(), (String) null), new if7(new String(), (String) null), new if7(new String(), (String) null), new if7(new String(), (String) null), new if7(new String(), (String) null), new if7(new String(), (String) null), new if7(new String(), (String) null), false, (Integer) null);
    }

    public static wp5 a(wp5 wp5, u5 u5Var, a54 a54, b54 b54, rv rvVar, if7 if7, if7 if72, if7 if73, if7 if74, if7 if75, if7 if76, if7 if77, if7 if78, boolean z, Integer num, int i2) {
        u5 u5Var2;
        a54 a542;
        b54 b542;
        rv rvVar2;
        if7 if79;
        if7 if710;
        if7 if711;
        if7 if712;
        if7 if713;
        if7 if714;
        if7 if715;
        if7 if716;
        boolean z2;
        Integer num2;
        int i3 = i2;
        if ((i3 & 1) != 0) {
            u5Var2 = wp5.a;
        } else {
            u5Var2 = u5Var;
        }
        if ((i3 & 2) != 0) {
            a542 = wp5.b;
        } else {
            a542 = a54;
        }
        if ((i3 & 4) != 0) {
            b542 = wp5.c;
        } else {
            b542 = b54;
        }
        if ((i3 & 8) != 0) {
            rvVar2 = wp5.d;
        } else {
            rvVar2 = rvVar;
        }
        if ((i3 & 16) != 0) {
            if79 = wp5.e;
        } else {
            if79 = if7;
        }
        if ((i3 & 32) != 0) {
            if710 = wp5.f;
        } else {
            if710 = if72;
        }
        if ((i3 & 64) != 0) {
            if711 = wp5.g;
        } else {
            if711 = if73;
        }
        if ((i3 & 128) != 0) {
            if712 = wp5.h;
        } else {
            if712 = if74;
        }
        if ((i3 & 256) != 0) {
            if713 = wp5.i;
        } else {
            if713 = if75;
        }
        if ((i3 & 512) != 0) {
            if714 = wp5.j;
        } else {
            if714 = if76;
        }
        if ((i3 & 1024) != 0) {
            if715 = wp5.k;
        } else {
            if715 = if77;
        }
        if ((i3 & 2048) != 0) {
            if716 = wp5.l;
        } else {
            if716 = if78;
        }
        if ((i3 & 4096) != 0) {
            z2 = wp5.m;
        } else {
            z2 = z;
        }
        if ((i3 & 8192) != 0) {
            num2 = wp5.n;
        } else {
            num2 = num;
        }
        wp5.getClass();
        a542.getClass();
        b542.getClass();
        rvVar2.getClass();
        if79.getClass();
        if710.getClass();
        if711.getClass();
        if712.getClass();
        if713.getClass();
        if714.getClass();
        if715.getClass();
        if716.getClass();
        return new wp5(u5Var2, a542, b542, rvVar2, if79, if710, if711, if712, if713, if714, if715, if716, z2, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp5)) {
            return false;
        }
        wp5 wp5 = (wp5) obj;
        if (sg3.e(this.a, wp5.a) && sg3.e(this.b, wp5.b) && sg3.e(this.c, wp5.c) && this.d == wp5.d && sg3.e(this.e, wp5.e) && sg3.e(this.f, wp5.f) && sg3.e(this.g, wp5.g) && sg3.e(this.h, wp5.h) && sg3.e(this.i, wp5.i) && sg3.e(this.j, wp5.j) && sg3.e(this.k, wp5.k) && sg3.e(this.l, wp5.l) && this.m == wp5.m && sg3.e(this.n, wp5.n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3 = 0;
        u5 u5Var = this.a;
        if (u5Var == null) {
            i2 = 0;
        } else {
            i2 = u5Var.hashCode();
        }
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        int hashCode6 = this.g.hashCode();
        int hashCode7 = this.h.hashCode();
        int hashCode8 = this.i.hashCode();
        int hashCode9 = this.j.hashCode();
        int i4 = hl6.i((this.l.hashCode() + ((this.k.hashCode() + ((hashCode9 + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (i2 * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.m);
        Integer num = this.n;
        if (num != null) {
            i3 = num.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        return "ProfileScreenData(account=" + this.a + ", license=" + this.b + ", pricing=" + this.c + ", authMode=" + this.d + ", name=" + this.e + ", email=" + this.f + ", password=" + this.g + ", confirmPassword=" + this.h + ", invitationCode=" + this.i + ", verificationCode=" + this.j + ", transferId=" + this.k + ", couponCode=" + this.l + ", showNautaEmailDialog=" + this.m + ", invitationCount=" + this.n + ")";
    }

    public wp5(u5 u5Var, a54 a54, b54 b54, rv rvVar, if7 if7, if7 if72, if7 if73, if7 if74, if7 if75, if7 if76, if7 if77, if7 if78, boolean z, Integer num) {
        this.a = u5Var;
        this.b = a54;
        this.c = b54;
        this.d = rvVar;
        this.e = if7;
        this.f = if72;
        this.g = if73;
        this.h = if74;
        this.i = if75;
        this.j = if76;
        this.k = if77;
        this.l = if78;
        this.m = z;
        this.n = num;
    }
}
