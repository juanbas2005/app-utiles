package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* renamed from: sz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sz2 extends r16 {
    public final /* synthetic */ int e0;

    public /* synthetic */ sz2(int i) {
        this.e0 = i;
    }

    public final int S(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.e0) {
            case b85.b:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    public final int T() {
        switch (this.e0) {
            case b85.b:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    public final ViewPropertyAnimator U(View view, int i) {
        switch (this.e0) {
            case b85.b:
                return view.animate().translationY((float) i);
            case 1:
                return view.animate().translationX((float) (-i));
            default:
                return view.animate().translationX((float) i);
        }
    }
}
