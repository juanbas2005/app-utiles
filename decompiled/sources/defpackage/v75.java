package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;

/* renamed from: v75  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v75 {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final uu6 d;
    public final wf6 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final bz2 j;
    public final hb7 k;
    public final vc5 l;
    public final eh0 m;
    public final eh0 n;
    public final eh0 o;

    public v75(Context context, Bitmap.Config config, ColorSpace colorSpace, uu6 uu6, wf6 wf6, boolean z, boolean z2, boolean z3, String str, bz2 bz2, hb7 hb7, vc5 vc5, eh0 eh0, eh0 eh02, eh0 eh03) {
        this.a = context;
        this.b = config;
        this.c = colorSpace;
        this.d = uu6;
        this.e = wf6;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str;
        this.j = bz2;
        this.k = hb7;
        this.l = vc5;
        this.m = eh0;
        this.n = eh02;
        this.o = eh03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v75)) {
            return false;
        }
        v75 v75 = (v75) obj;
        if (!sg3.e(this.a, v75.a) || this.b != v75.b) {
            return false;
        }
        if ((Build.VERSION.SDK_INT < 26 || sg3.e(this.c, v75.c)) && sg3.e(this.d, v75.d) && this.e == v75.e && this.f == v75.f && this.g == v75.g && this.h == v75.h && sg3.e(this.i, v75.i) && sg3.e(this.j, v75.j) && sg3.e(this.k, v75.k) && sg3.e(this.l, v75.l) && this.m == v75.m && this.n == v75.n && this.o == v75.o) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.c;
        int i3 = 0;
        if (colorSpace != null) {
            i2 = colorSpace.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = hl6.i(hl6.i(hl6.i((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + i2) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        if (str != null) {
            i3 = str.hashCode();
        }
        int hashCode2 = this.k.a.hashCode();
        int hashCode3 = this.l.w.hashCode();
        int hashCode4 = this.m.hashCode();
        return this.o.hashCode() + ((this.n.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((((i4 + i3) * 31) + Arrays.hashCode(this.j.w)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
