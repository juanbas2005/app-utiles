package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.function.IntConsumer;

/* renamed from: in  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class in implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    public /* synthetic */ in(int i, int i2, Object obj) {
        this.w = i2;
        this.y = obj;
        this.x = i;
    }

    public final void run() {
        int i = this.w;
        int i2 = this.x;
        Object obj = this.y;
        switch (i) {
            case b85.b:
                ((IntConsumer) obj).accept(i2);
                return;
            case 1:
                ((b85) obj).o(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, i2, false);
                    return;
                }
                return;
        }
    }
}
