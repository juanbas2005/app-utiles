package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* renamed from: s98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s98 extends f68 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u98 b;

    public /* synthetic */ s98(u98 u98, int i) {
        this.a = i;
        this.b = u98;
    }

    public final void c() {
        View view;
        int i = this.a;
        u98 u98 = this.b;
        switch (i) {
            case b85.b:
                if (u98.o && (view = u98.g) != null) {
                    view.setTranslationY(0.0f);
                    u98.d.setTranslationY(0.0f);
                }
                u98.d.setVisibility(8);
                u98.d.setTransitioning(false);
                u98.t = null;
                qc3 qc3 = u98.k;
                if (qc3 != null) {
                    qc3.G(u98.j);
                    u98.j = null;
                    u98.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = u98.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = e58.a;
                    actionBarOverlayLayout.requestApplyInsets();
                    return;
                }
                return;
            default:
                u98.t = null;
                u98.d.requestLayout();
                return;
        }
    }
}
