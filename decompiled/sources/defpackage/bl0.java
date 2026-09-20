package defpackage;

import android.app.AlertDialog;
import android.os.Handler;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import cu.lestebang.utiletecsa.R;

/* renamed from: bl0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bl0 {
    public static final /* synthetic */ int n = 0;
    public final CaptureActivity a;
    public final DecoratedBarcodeView b;
    public int c = -1;
    public boolean d = false;
    public boolean e = true;
    public String f = "";
    public boolean g = false;
    public final n43 h;
    public final v70 i;
    public final Handler j;
    public boolean k = false;
    public final ns8 l = new ns8(9, (Object) this);
    public boolean m;

    public bl0(CaptureActivity captureActivity, DecoratedBarcodeView decoratedBarcodeView) {
        ck0 ck0 = new ck0(1, this);
        this.m = false;
        this.a = captureActivity;
        this.b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().F.add(ck0);
        this.j = new Handler();
        this.h = new n43(captureActivity, new yk0(this, 0));
        this.i = new v70(captureActivity);
    }

    public final void a() {
        DecoratedBarcodeView decoratedBarcodeView = this.b;
        xj0 xj0 = decoratedBarcodeView.getBarcodeView().w;
        if (xj0 == null || xj0.g) {
            this.a.finish();
        } else {
            this.k = true;
        }
        decoratedBarcodeView.w.g();
        this.h.a();
    }

    public final void b(String str) {
        CaptureActivity captureActivity = this.a;
        if (!captureActivity.isFinishing() && !this.g && !this.k) {
            if (str.isEmpty()) {
                str = captureActivity.getString(R.string.zxing_msg_camera_framework_bug);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(captureActivity);
            builder.setTitle(captureActivity.getString(R.string.zxing_app_name));
            builder.setMessage(str);
            builder.setPositiveButton(R.string.zxing_button_ok, new zk0(this));
            builder.setOnCancelListener(new al0(this));
            builder.show();
        }
    }
}
