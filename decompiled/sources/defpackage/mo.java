package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* renamed from: mo  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mo extends f68 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                ((lo) obj).x.Q.setVisibility(0);
                return;
            case 1:
                wo woVar = (wo) obj;
                woVar.Q.setVisibility(0);
                if (woVar.Q.getParent() instanceof View) {
                    WeakHashMap weakHashMap = e58.a;
                    ((View) woVar.Q.getParent()).requestApplyInsets();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                wo woVar = ((lo) obj).x;
                woVar.Q.setAlpha(1.0f);
                woVar.T.d((e68) null);
                woVar.T = null;
                return;
            case 1:
                wo woVar2 = (wo) obj;
                woVar2.Q.setAlpha(1.0f);
                woVar2.T.d((e68) null);
                woVar2.T = null;
                return;
            default:
                wo woVar3 = (wo) ((qc3) obj).y;
                woVar3.Q.setVisibility(8);
                PopupWindow popupWindow = woVar3.R;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (woVar3.Q.getParent() instanceof View) {
                    WeakHashMap weakHashMap = e58.a;
                    ((View) woVar3.Q.getParent()).requestApplyInsets();
                }
                woVar3.Q.e();
                woVar3.T.d((e68) null);
                woVar3.T = null;
                ViewGroup viewGroup = woVar3.W;
                WeakHashMap weakHashMap2 = e58.a;
                viewGroup.requestApplyInsets();
                return;
        }
    }
}
