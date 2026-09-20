package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: mp  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mp implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ mp(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final void onGlobalLayout() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                vp vpVar = (vp) obj;
                if (!vpVar.getInternalPopup().b()) {
                    vpVar.B.o(vpVar.getTextDirection(), vpVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = vpVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 1:
                sp spVar = (sp) obj;
                vp vpVar2 = spVar.c0;
                if (!vpVar2.isAttachedToWindow() || !vpVar2.getGlobalVisibleRect(spVar.a0)) {
                    spVar.dismiss();
                    return;
                }
                spVar.s();
                spVar.g();
                return;
            case 2:
                am0 am0 = (am0) obj;
                ArrayList arrayList = am0.D;
                if (am0.b() && arrayList.size() > 0 && !((zl0) arrayList.get(0)).a.U) {
                    View view = am0.K;
                    if (view == null || !view.isShown()) {
                        am0.dismiss();
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((zl0) it.next()).a.g();
                    }
                    return;
                }
                return;
            default:
                l27 l27 = (l27) obj;
                mj4 mj4 = l27.D;
                if (l27.b() && !mj4.U) {
                    View view2 = l27.I;
                    if (view2 == null || !view2.isShown()) {
                        l27.dismiss();
                        return;
                    } else {
                        mj4.g();
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
