package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;

/* renamed from: k96  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k96 extends OrientationEventListener {
    public final /* synthetic */ kb9 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k96(kb9 kb9, Context context) {
        super(context, 3);
        this.a = kb9;
    }

    public final void onOrientationChanged(int i) {
        int rotation;
        kb9 kb9 = this.a;
        WindowManager windowManager = (WindowManager) kb9.y;
        ns8 ns8 = (ns8) kb9.A;
        if (windowManager != null && ns8 != null && (rotation = windowManager.getDefaultDisplay().getRotation()) != kb9.x) {
            kb9.x = rotation;
            ((BarcodeView) ns8.x).y.postDelayed(new y0(7, ns8), 250);
        }
    }
}
