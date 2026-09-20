package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import cu.lestebang.utiletecsa.R;

/* renamed from: la4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class la4 {
    public static final yy0 a = new yy0((sr2) new q83(24));

    public static w45 a(yt2 yt2) {
        w45 w45;
        w45 w452 = (w45) yt2.k(a);
        w45 w453 = null;
        if (w452 == null) {
            yt2.e0(1208426157);
            View view = (View) yt2.k(ye.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    w452 = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof w45) {
                    w45 = (w45) tag;
                } else {
                    w45 = null;
                }
                if (w45 != null) {
                    w452 = w45;
                    break;
                }
                ViewParent k = z85.k(view);
                if (k instanceof View) {
                    view = (View) k;
                } else {
                    view = null;
                }
            }
        } else {
            yt2.e0(1208423708);
        }
        yt2.r(false);
        if (w452 == null) {
            yt2.e0(1208428160);
            Context context = (Context) yt2.k(ye.b);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof w45) {
                    w453 = context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            w45 w454 = w453;
            yt2.r(false);
            return w454;
        }
        yt2.e0(1208423789);
        yt2.r(false);
        return w452;
    }
}
