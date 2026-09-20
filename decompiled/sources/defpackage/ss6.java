package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: ss6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ss6 implements t5 {
    public final /* synthetic */ SideSheetBehavior w;
    public final /* synthetic */ int x;

    public /* synthetic */ ss6(SideSheetBehavior sideSheetBehavior, int i) {
        this.w = sideSheetBehavior;
        this.x = i;
    }

    public final boolean a(View view) {
        String str;
        int i = this.x;
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            if (i == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            throw new IllegalArgumentException(f21.l(sb, str, " should not be set externally."));
        }
        SideSheetBehavior sideSheetBehavior = this.w;
        WeakReference weakReference = sideSheetBehavior.p;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.r(i);
            return true;
        }
        View view2 = (View) sideSheetBehavior.p.get();
        in inVar = new in(i, 2, sideSheetBehavior);
        ViewParent parent = view2.getParent();
        if (parent == null || !parent.isLayoutRequested() || !view2.isAttachedToWindow()) {
            inVar.run();
            return true;
        }
        view2.post(inVar);
        return true;
    }
}
