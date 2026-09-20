package defpackage;

import android.view.View;

/* renamed from: i22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i22 implements l45 {
    public int A;
    public final Object B;
    public final /* synthetic */ int w = 1;
    public int x;
    public int y;
    public int z;

    public i22(vl vlVar, long j) {
        String str = vlVar.x;
        xs0 xs0 = new xs0(2);
        xs0.d = str;
        xs0.b = -1;
        xs0.c = -1;
        this.B = xs0;
        this.x = lg7.f(j);
        this.y = lg7.e(j);
        this.z = -1;
        this.A = -1;
        int f = lg7.f(j);
        int e = lg7.e(j);
        if (f < 0 || f > str.length()) {
            h.l(b81.l(f, str.length(), "start (", ") offset is outside of text region "));
            throw null;
        } else if (e < 0 || e > str.length()) {
            h.l(b81.l(e, str.length(), "end (", ") offset is outside of text region "));
            throw null;
        } else if (f > e) {
            h.q(b81.l(f, e, "Do not set reversed range: ", " > "));
            throw null;
        }
    }

    public void a(int i, int i2) {
        long a = i95.a(i, i2);
        ((xs0) this.B).S(i, i2, "");
        long x2 = h03.x(i95.a(this.x, this.y), a);
        h(lg7.f(x2));
        g(lg7.e(x2));
        int i3 = this.z;
        if (i3 != -1) {
            long x3 = h03.x(i95.a(i3, this.A), a);
            if (lg7.c(x3)) {
                this.z = -1;
                this.A = -1;
                return;
            }
            this.z = lg7.f(x3);
            this.A = lg7.e(x3);
        }
    }

    public char b(int i) {
        xs0 xs0 = (xs0) this.B;
        tt2 tt2 = (tt2) xs0.e;
        if (tt2 == null) {
            return ((String) xs0.d).charAt(i);
        }
        if (i < xs0.b) {
            return ((String) xs0.d).charAt(i);
        }
        int d = tt2.b - tt2.d();
        int i2 = xs0.b;
        if (i >= d + i2) {
            return ((String) xs0.d).charAt(i - ((d - xs0.c) + i2));
        }
        int i3 = i - i2;
        int i4 = tt2.c;
        char[] cArr = (char[]) tt2.e;
        if (i3 < i4) {
            return cArr[i3];
        }
        return cArr[(i3 - i4) + tt2.d];
    }

    public lg7 c() {
        int i = this.z;
        if (i != -1) {
            return new lg7(i95.a(i, this.A));
        }
        return null;
    }

    public void d(int i, int i2, String str) {
        xs0 xs0 = (xs0) this.B;
        if (i < 0 || i > xs0.y()) {
            h.l(b81.l(i, xs0.y(), "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > xs0.y()) {
            h.l(b81.l(i2, xs0.y(), "end (", ") offset is outside of text region "));
        } else if (i <= i2) {
            xs0.S(i, i2, str);
            h(str.length() + i);
            g(str.length() + i);
            this.z = -1;
            this.A = -1;
        } else {
            h.q(b81.l(i, i2, "Do not set reversed range: ", " > "));
        }
    }

    public void e(int i, int i2) {
        xs0 xs0 = (xs0) this.B;
        if (i < 0 || i > xs0.y()) {
            h.l(b81.l(i, xs0.y(), "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > xs0.y()) {
            h.l(b81.l(i2, xs0.y(), "end (", ") offset is outside of text region "));
        } else if (i < i2) {
            this.z = i;
            this.A = i2;
        } else {
            h.q(b81.l(i, i2, "Do not set reversed or empty range: ", " > "));
        }
    }

    public void f(int i, int i2) {
        xs0 xs0 = (xs0) this.B;
        if (i < 0 || i > xs0.y()) {
            h.l(b81.l(i, xs0.y(), "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > xs0.y()) {
            h.l(b81.l(i2, xs0.y(), "end (", ") offset is outside of text region "));
        } else if (i <= i2) {
            h(i);
            g(i2);
        } else {
            h.q(b81.l(i, i2, "Do not set reversed range: ", " > "));
        }
    }

    public void g(int i) {
        boolean z2;
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            zb3.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.y = i;
    }

    public void h(int i) {
        boolean z2;
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            zb3.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.x = i;
    }

    public db8 i(View view, db8 db8) {
        View view2 = (View) this.B;
        ad3 h = db8.a.h(519);
        int i = this.x;
        if (i >= 0) {
            view2.getLayoutParams().height = i + h.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.y + h.a, this.z + h.b, this.A + h.c, view2.getPaddingBottom());
        return db8;
    }

    public String toString() {
        switch (this.w) {
            case b85.b:
                return ((xs0) this.B).toString();
            default:
                return super.toString();
        }
    }

    public i22(View view, int i, int i2, int i3, int i4) {
        this.x = i;
        this.B = view;
        this.y = i2;
        this.z = i3;
        this.A = i4;
    }
}
