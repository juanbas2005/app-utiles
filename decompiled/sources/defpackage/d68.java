package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: d68  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d68 {
    public final ArrayList a = new ArrayList();
    public long b = -1;
    public Interpolator c;
    public e68 d;
    public boolean e;
    public final rj7 f = new rj7(this);

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((c68) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (!this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                c68 c68 = (c68) it.next();
                long j = this.b;
                if (j >= 0) {
                    c68.c(j);
                }
                Interpolator interpolator = this.c;
                if (!(interpolator == null || (view = (View) c68.a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.d != null) {
                    c68.d(this.f);
                }
                View view2 = (View) c68.a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.e = true;
        }
    }
}
