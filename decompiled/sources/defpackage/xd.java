package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: xd  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xd extends ll4 implements vb0, dk6, us3, my3, ln7 {
    public mb8 K;
    public final z0 L = new z0(1, this);
    public final pb M = new pb(1, this);
    public final /* synthetic */ je N;

    public xd(je jeVar) {
        this.N = jeVar;
    }

    public final boolean B(KeyEvent keyEvent) {
        bk2 bk2;
        int i;
        int[] iArr = fk2.a;
        long x = rd3.x(keyEvent);
        int i2 = 2;
        if (os3.a(x, os3.b)) {
            bk2 = new bk2(2);
        } else if (os3.a(x, os3.c)) {
            bk2 = new bk2(1);
        } else if (os3.a(x, os3.p)) {
            if (keyEvent.isShiftPressed()) {
                i = 2;
            } else {
                i = 1;
            }
            bk2 = new bk2(i);
        } else if (os3.a(x, os3.g)) {
            bk2 = new bk2(4);
        } else if (os3.a(x, os3.f)) {
            bk2 = new bk2(3);
        } else if (os3.a(x, os3.d) || os3.a(x, os3.C)) {
            bk2 = new bk2(5);
        } else if (os3.a(x, os3.e) || os3.a(x, os3.D)) {
            bk2 = new bk2(6);
        } else if (os3.a(x, os3.h) || os3.a(x, os3.r) || os3.a(x, os3.E)) {
            bk2 = new bk2(7);
        } else if (os3.a(x, os3.a) || os3.a(x, os3.u)) {
            bk2 = new bk2(8);
        } else {
            bk2 = null;
        }
        boolean z = false;
        if (bk2 != null) {
            int i3 = bk2.a;
            if (rd3.A(keyEvent) == 2) {
                je jeVar = this.N;
                ((lk2) jeVar.getFocusOwner()).g();
                Boolean f = ((lk2) jeVar.getFocusOwner()).f(i3, jeVar.getEmbeddedViewFocusRect(), new pb(2, bk2));
                if (f == null) {
                    return true;
                }
                if (f.booleanValue()) {
                    gs2 playNavigationSoundEffect$ui = jeVar.getPlayNavigationSoundEffect$ui();
                    if (keyEvent.getRepeatCount() > 0) {
                        z = true;
                    }
                    playNavigationSoundEffect$ui.H(bk2, Boolean.valueOf(z));
                    return true;
                } else if (i3 != 1 && i3 != 2) {
                    return false;
                } else {
                    Integer b = fk2.b(i3);
                    if (b != null) {
                        i2 = b.intValue();
                    }
                    FocusFinder instance = FocusFinder.getInstance();
                    View rootView = jeVar.getRootView();
                    rootView.getClass();
                    View findNextFocus = instance.findNextFocus((ViewGroup) rootView, jeVar.getView(), i2);
                    if (findNextFocus == null || findNextFocus.equals(jeVar)) {
                        return ((lk2) jeVar.getFocusOwner()).i(i3);
                    }
                }
            }
        }
        return false;
    }

    public final Object H(xz4 xz4, ae aeVar, h61 h61) {
        ly5 ly5;
        long R = xz4.R(0);
        ly5 ly52 = (ly5) aeVar.b();
        if (ly52 != null) {
            ly5 = ly52.i(R);
        } else {
            ly5 = null;
        }
        if (ly5 != null) {
            this.N.requestRectangleOnScreen(new Rect((int) ly5.a, (int) ly5.b, (int) ly5.c, (int) ly5.d), false);
        }
        return vs7.a;
    }

    public final mh4 c(oh4 oh4, gh4 gh4, long j) {
        eh5 y = gh4.y(j);
        int i = y.w;
        int i2 = y.x;
        wd wdVar = new wd(y, 0);
        return oh4.E(i, i2, this.M, this.L, b42.w, wdVar);
    }

    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    public final Object m() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    public final void D0(ok6 ok6) {
    }
}
