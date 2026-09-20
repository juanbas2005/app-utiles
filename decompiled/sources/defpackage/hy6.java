package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: hy6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class hy6 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ View x;

    public /* synthetic */ hy6(View view, int i) {
        this.w = i;
        this.x = view;
    }

    public final void run() {
        int i = this.w;
        View view = this.x;
        switch (i) {
            case b85.b:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }
}
