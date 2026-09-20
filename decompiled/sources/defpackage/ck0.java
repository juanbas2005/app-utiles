package defpackage;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import cu.lestebang.utiletecsa.R;
import java.util.Iterator;

/* renamed from: ck0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ck0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ck0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                Iterator it = ((BarcodeView) obj).F.iterator();
                while (it.hasNext()) {
                    ((ck0) it.next()).a();
                }
                return;
            case 1:
                bl0 bl0 = (bl0) obj;
                if (bl0.k) {
                    Log.d("bl0", "Camera closed; finishing activity");
                    bl0.a.finish();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(Exception exc) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                Iterator it = ((BarcodeView) obj).F.iterator();
                while (it.hasNext()) {
                    ((ck0) it.next()).c(exc);
                }
                return;
            case 1:
                bl0 bl0 = (bl0) obj;
                bl0.b(bl0.a.getString(R.string.zxing_msg_camera_framework_bug));
                return;
            default:
                return;
        }
    }

    public final void e() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                Iterator it = ((BarcodeView) obj).F.iterator();
                while (it.hasNext()) {
                    ((ck0) it.next()).e();
                }
                return;
            case 1:
                return;
            default:
                ViewfinderView viewfinderView = (ViewfinderView) obj;
                dk0 dk0 = viewfinderView.E;
                if (dk0 != null) {
                    Rect framingRect = dk0.getFramingRect();
                    vu6 previewSize = viewfinderView.E.getPreviewSize();
                    if (!(framingRect == null || previewSize == null)) {
                        viewfinderView.F = framingRect;
                        viewfinderView.G = previewSize;
                    }
                }
                viewfinderView.invalidate();
                return;
        }
    }

    public final void g() {
        switch (this.a) {
            case b85.b:
                Iterator it = ((BarcodeView) this.b).F.iterator();
                while (it.hasNext()) {
                    ((ck0) it.next()).g();
                }
                return;
            default:
                return;
        }
    }

    public final void j() {
        switch (this.a) {
            case b85.b:
                Iterator it = ((BarcodeView) this.b).F.iterator();
                while (it.hasNext()) {
                    ((ck0) it.next()).j();
                }
                return;
            default:
                return;
        }
    }

    private final void b() {
    }

    private final void f() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void d(Exception exc) {
    }
}
