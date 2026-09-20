package defpackage;

import android.util.Log;
import android.view.SurfaceHolder;
import com.journeyapps.barcodescanner.BarcodeView;

/* renamed from: bk0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bk0 implements SurfaceHolder.Callback {
    public final /* synthetic */ BarcodeView a;

    public bk0(BarcodeView barcodeView) {
        this.a = barcodeView;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder == null) {
            int i4 = dk0.V;
            Log.e("dk0", "*** WARNING *** surfaceChanged() gave us a null surface!");
            return;
        }
        vu6 vu6 = new vu6(i2, i3);
        BarcodeView barcodeView = this.a;
        barcodeView.L = vu6;
        barcodeView.e();
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.L = null;
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
