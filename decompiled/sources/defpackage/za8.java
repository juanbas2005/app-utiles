package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: za8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class za8 {
    public static final db8 b;
    public final db8 a;

    static {
        qa8 qa8;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            qa8 = new pa8();
        } else if (i >= 35) {
            qa8 = new oa8();
        } else if (i >= 34) {
            qa8 = new na8();
        } else if (i >= 31) {
            qa8 = new ma8();
        } else if (i >= 30) {
            qa8 = new la8();
        } else if (i >= 29) {
            qa8 = new ka8();
        } else {
            qa8 = new ia8();
        }
        b = qa8.b().a.a().a.b().a.c();
    }

    public za8(db8 db8) {
        this.a = db8;
    }

    public db8 a() {
        return this.a;
    }

    public db8 b() {
        return this.a;
    }

    public db8 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za8)) {
            return false;
        }
        za8 za8 = (za8) obj;
        if (s() != za8.s() || r() != za8.r() || !Objects.equals(m(), za8.m()) || !Objects.equals(k(), za8.k()) || !Objects.equals(g(), za8.g())) {
            return false;
        }
        return true;
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public bw1 g() {
        return null;
    }

    public ad3 h(int i) {
        return ad3.e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g()});
    }

    public ad3 i(int i) {
        if ((i & 8) == 0) {
            return ad3.e;
        }
        h.q("Unable to query the maximum insets for IME");
        return null;
    }

    public ad3 j() {
        return m();
    }

    public ad3 k() {
        return ad3.e;
    }

    public ad3 l() {
        return m();
    }

    public ad3 m() {
        return ad3.e;
    }

    public ad3 n() {
        return m();
    }

    public db8 q(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t(int i) {
        return true;
    }

    public void p() {
    }

    public void A(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void o(View view) {
    }

    public void u(ew1 ew1) {
    }

    public void v(ad3[] ad3Arr) {
    }

    public void w(db8 db8) {
    }

    public void x(ad3 ad3) {
    }

    public void y(int i) {
    }

    public void z(Rect[][] rectArr) {
    }
}
