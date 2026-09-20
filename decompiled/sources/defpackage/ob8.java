package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ob8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ob8 extends us0 implements Runnable, l45, View.OnAttachStateChangeListener {
    public static final Integer[] E = {8, 64, 4, 1, 128, 16, 2, 32};
    public db8 A;
    public final ed5 B = u55.p((Object) null);
    public final yo4 C = new yo4(8);
    public final yo4 D = new yo4(8);
    public boolean y;
    public int z;

    public ob8() {
        super(1);
    }

    public final db8 F() {
        return (db8) this.B.getValue();
    }

    public final aq4 G(int i) {
        yo4 yo4 = this.C;
        aq4 aq4 = (aq4) yo4.b(i);
        if (aq4 != null) {
            return aq4;
        }
        ed5 p = u55.p((Object) null);
        yo4.i(i, p);
        return p;
    }

    public final aq4 H(int i) {
        yo4 yo4 = this.D;
        aq4 aq4 = (aq4) yo4.b(i);
        if (aq4 != null) {
            return aq4;
        }
        ed5 p = u55.p((Object) null);
        yo4.i(i, p);
        return p;
    }

    public final void I(db8 db8) {
        ad3 ad3;
        boolean z2 = false;
        if (F() == null) {
            ad3 ad32 = ad3.e;
            Integer[] numArr = E;
            int i = 0;
            while (i < 8) {
                int intValue = numArr[i].intValue();
                if (intValue == 8) {
                    ad3 = db8.a.h(intValue);
                } else {
                    ad3 = db8.a.i(intValue);
                }
                if (sg3.e(ad3, ad32)) {
                    i++;
                }
            }
            return;
        }
        this.B.setValue(db8);
        synchronized (nx6.c) {
            up4 up4 = nx6.j.h;
            if (up4 != null && up4.h()) {
                z2 = true;
            }
        }
        if (z2) {
            nx6.a();
        }
    }

    public final void d(ha8 ha8) {
        boolean z2 = false;
        this.y = false;
        int c = ha8.a.c();
        G(c).setValue((Object) null);
        H(c).setValue((Object) null);
        this.z = (~c) & this.z;
        this.A = null;
        synchronized (nx6.c) {
            up4 up4 = nx6.j.h;
            if (up4 != null && up4.h()) {
                z2 = true;
            }
        }
        if (z2) {
            nx6.a();
        }
    }

    public final void e(ha8 ha8) {
        this.y = true;
    }

    public final db8 f(db8 db8, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ha8 ha8 = (ha8) list.get(i);
            int c = ha8.a.c();
            if ((this.z & c) != 0) {
                G(c).setValue(ha8);
            }
        }
        I(db8);
        return db8;
    }

    public final k68 g(ha8 ha8, k68 k68) {
        db8 db8 = this.A;
        boolean z2 = false;
        this.y = false;
        ad3 ad3 = null;
        this.A = null;
        if (ha8.a.a() > 0 && db8 != null) {
            int c = ha8.a.c();
            db8 F = F();
            if (F != null) {
                ad3 = F.a.h(c);
            }
            ad3 h = db8.a.h(c);
            if (!sg3.e(h, ad3) && ad3 != null) {
                this.z |= c;
                G(c).setValue(ha8);
                H(c).setValue(new nb8(ad3, h));
                synchronized (nx6.c) {
                    up4 up4 = nx6.j.h;
                    if (up4 != null && up4.h()) {
                        z2 = true;
                    }
                }
                if (z2) {
                    nx6.a();
                    return k68;
                }
            }
        }
        return k68;
    }

    public final db8 i(View view, db8 db8) {
        if (this.y) {
            this.A = db8;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return db8;
            }
        } else if (this.z == 0) {
            I(db8);
        }
        return db8;
    }

    public final void onViewAttachedToWindow(View view) {
        View view2;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = e58.a;
        w48.c(view, this);
        e58.o(view, this);
    }

    public final void onViewDetachedFromWindow(View view) {
        View view2;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = e58.a;
        w48.c(view, (l45) null);
        e58.o(view, (us0) null);
    }

    public final void run() {
        if (this.y) {
            this.z = 0;
            this.y = false;
            db8 db8 = this.A;
            if (db8 != null) {
                I(db8);
                this.A = null;
            }
        }
    }
}
