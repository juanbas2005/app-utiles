package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: yp  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yp implements Runnable {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ int x;
    public final /* synthetic */ View y;
    public final /* synthetic */ Object z;

    public yp(TextView textView, Typeface typeface, int i) {
        this.y = textView;
        this.z = typeface;
        this.x = i;
    }

    public final void run() {
        int i = this.w;
        int i2 = this.x;
        View view = this.y;
        Object obj = this.z;
        switch (i) {
            case b85.b:
                ((TextView) view).setTypeface((Typeface) obj, i2);
                return;
            default:
                ((BottomSheetBehavior) obj).E(view, i2, false);
                return;
        }
    }

    public yp(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.z = bottomSheetBehavior;
        this.y = view;
        this.x = i;
    }
}
