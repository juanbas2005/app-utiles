package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.List;

/* renamed from: s83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s83 {
    public final bn1 A;
    public final Context a;
    public final Object b;
    public final tb7 c;
    public final Bitmap.Config d;
    public final qm5 e;
    public final mk1 f;
    public final List g;
    public final cm7 h;
    public final bz2 i;
    public final hb7 j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final eh0 o;
    public final eh0 p;
    public final eh0 q;
    public final h81 r;
    public final h81 s;
    public final h81 t;
    public final h81 u;
    public final in8 v;
    public final av6 w;
    public final wf6 x;
    public final vc5 y;
    public final po1 z;

    public s83(Context context, Object obj, tb7 tb7, Bitmap.Config config, qm5 qm5, mk1 mk1, List list, cm7 cm7, bz2 bz2, hb7 hb7, boolean z2, boolean z3, boolean z4, boolean z5, eh0 eh0, eh0 eh02, eh0 eh03, h81 h81, h81 h812, h81 h813, h81 h814, in8 in8, av6 av6, wf6 wf6, vc5 vc5, po1 po1, bn1 bn1) {
        this.a = context;
        this.b = obj;
        this.c = tb7;
        this.d = config;
        this.e = qm5;
        this.f = mk1;
        this.g = list;
        this.h = cm7;
        this.i = bz2;
        this.j = hb7;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = eh0;
        this.p = eh02;
        this.q = eh03;
        this.r = h81;
        this.s = h812;
        this.t = h813;
        this.u = h814;
        this.v = in8;
        this.w = av6;
        this.x = wf6;
        this.y = vc5;
        this.z = po1;
        this.A = bn1;
    }

    public static r83 a(s83 s83) {
        Context context = s83.a;
        s83.getClass();
        return new r83(s83, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s83)) {
            return false;
        }
        s83 s83 = (s83) obj;
        if (!sg3.e(this.a, s83.a) || !this.b.equals(s83.b) || !sg3.e(this.c, s83.c) || this.d != s83.d || this.e != s83.e || !sg3.e(this.f, s83.f) || !sg3.e(this.g, s83.g) || !sg3.e(this.h, s83.h) || !sg3.e(this.i, s83.i) || !this.j.equals(s83.j) || this.k != s83.k || this.l != s83.l || this.m != s83.m || this.n != s83.n || this.o != s83.o || this.p != s83.p || this.q != s83.q || !sg3.e(this.r, s83.r) || !sg3.e(this.s, s83.s) || !sg3.e(this.t, s83.t) || !sg3.e(this.u, s83.u) || !sg3.e(this.v, s83.v) || !this.w.equals(s83.w) || this.x != s83.x || !this.y.equals(s83.y) || !this.z.equals(s83.z) || !sg3.e(this.A, s83.A)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i3 = 0;
        tb7 tb7 = this.c;
        if (tb7 != null) {
            i2 = tb7.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((hashCode + i2) * 923521)) * 961)) * 961;
        mk1 mk1 = this.f;
        if (mk1 != null) {
            i3 = mk1.hashCode();
        }
        int i4 = hl6.i(hl6.i(hl6.i(hl6.i((this.j.a.hashCode() + ((((this.h.hashCode() + hl6.j(this.g, (hashCode2 + i3) * 31, 31)) * 31) + Arrays.hashCode(this.i.w)) * 31)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        int hashCode3 = this.p.hashCode();
        int hashCode4 = this.q.hashCode();
        int hashCode5 = this.r.hashCode();
        int hashCode6 = this.s.hashCode();
        int hashCode7 = this.t.hashCode();
        int hashCode8 = this.u.hashCode();
        int hashCode9 = this.v.hashCode();
        int hashCode10 = this.w.hashCode();
        int hashCode11 = this.x.hashCode();
        int hashCode12 = this.y.w.hashCode();
        return this.A.hashCode() + ((this.z.hashCode() + ((hashCode12 + ((hashCode11 + ((hashCode10 + ((hashCode9 + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((this.o.hashCode() + i4) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * -1807454463)) * 31);
    }
}
