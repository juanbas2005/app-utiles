package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: f07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class f07 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int w;
    public final /* synthetic */ View x;
    public final /* synthetic */ kg5 y;

    public /* synthetic */ f07(kg5 kg5, View view, int i) {
        this.w = i;
        this.y = kg5;
        this.x = view;
    }

    public final boolean onPreDraw() {
        int i = this.w;
        View view = this.x;
        kg5 kg5 = this.y;
        switch (i) {
            case b85.b:
                if (((i07) kg5.y).a()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            default:
                if (((i07) ((h07) kg5).y).a()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
        }
    }
}
