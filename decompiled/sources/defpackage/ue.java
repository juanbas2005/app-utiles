package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* renamed from: ue  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ue {
    public static final ue a = new Object();

    public final void a(View view, ok5 ok5) {
        PointerIcon pointerIcon;
        Context context = view.getContext();
        if (ok5 instanceof nh) {
            pointerIcon = PointerIcon.getSystemIcon(context, ((nh) ok5).b);
        } else {
            pointerIcon = PointerIcon.getSystemIcon(context, 1000);
        }
        if (!sg3.e(view.getPointerIcon(), pointerIcon)) {
            view.setPointerIcon(pointerIcon);
        }
    }
}
