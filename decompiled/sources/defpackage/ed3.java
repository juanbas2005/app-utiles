package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* renamed from: ed3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ed3 extends us0 implements Runnable, l45, View.OnAttachStateChangeListener {
    public boolean A;
    public db8 B;
    public final ib8 y;
    public boolean z;

    public ed3(ib8 ib8) {
        super(ib8.t ^ true ? 1 : 0);
        this.y = ib8;
    }

    public final void d(ha8 ha8) {
        this.z = false;
        this.A = false;
        db8 db8 = this.B;
        if (ha8.a.a() > 0 && db8 != null) {
            za8 za8 = db8.a;
            ib8 ib8 = this.y;
            ib8.s.f(i75.o(za8.h(8)));
            ib8.r.f(i75.o(za8.h(8)));
            ib8.b(ib8, db8);
        }
        this.B = null;
    }

    public final void e(ha8 ha8) {
        this.z = true;
        this.A = true;
    }

    public final db8 f(db8 db8, List list) {
        ib8 ib8 = this.y;
        ib8.b(ib8, db8);
        if (ib8.t) {
            return db8.b;
        }
        return db8;
    }

    public final k68 g(ha8 ha8, k68 k68) {
        this.z = false;
        return k68;
    }

    public final db8 i(View view, db8 db8) {
        this.B = db8;
        ib8 ib8 = this.y;
        d28 d28 = ib8.r;
        za8 za8 = db8.a;
        d28.f(i75.o(za8.h(8)));
        if (this.z) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.A) {
            ib8.s.f(i75.o(za8.h(8)));
            ib8.b(ib8, db8);
        }
        if (ib8.t) {
            return db8.b;
        }
        return db8;
    }

    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    public final void run() {
        if (this.z) {
            this.z = false;
            this.A = false;
            db8 db8 = this.B;
            if (db8 != null) {
                ib8 ib8 = this.y;
                ib8.s.f(i75.o(db8.a.h(8)));
                ib8.b(ib8, db8);
                this.B = null;
            }
        }
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
