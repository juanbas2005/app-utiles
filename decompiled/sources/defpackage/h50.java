package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import cu.lestebang.utiletecsa.R;
import java.util.List;

/* renamed from: h50  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h50 implements Handler.Callback {
    public final /* synthetic */ int w;
    public final /* synthetic */ BarcodeView x;

    public /* synthetic */ h50(BarcodeView barcodeView, int i) {
        this.w = i;
        this.x = barcodeView;
    }

    public final boolean handleMessage(Message message) {
        boolean z;
        jz0 jz0;
        ig igVar;
        Message message2 = message;
        switch (this.w) {
            case b85.b:
                BarcodeView barcodeView = this.x;
                int i = message2.what;
                if (i == R.id.zxing_decode_succeeded) {
                    f50 f50 = (f50) message2.obj;
                    if (!(f50 == null || (jz0 = barcodeView.a0) == null || barcodeView.W == 1)) {
                        ns8 ns8 = (ns8) jz0.x;
                        ((bl0) ns8.x).b.w.g();
                        v70 v70 = ((bl0) ns8.x).i;
                        synchronized (v70) {
                            if (v70.x) {
                                v70.e();
                            }
                        }
                        ((bl0) ns8.x).j.post(new ga(7, (Object) ns8, (Object) f50));
                        if (barcodeView.W == 2) {
                            barcodeView.W = 1;
                            barcodeView.a0 = null;
                            barcodeView.i();
                            return true;
                        }
                    }
                } else if (i != R.id.zxing_decode_failed) {
                    if (i != R.id.zxing_possible_result_points) {
                        return false;
                    }
                    List<r66> list = (List) message2.obj;
                    jz0 jz02 = barcodeView.a0;
                    if (jz02 != null) {
                        z = true;
                        if (barcodeView.W != 1) {
                            for (r66 r66 : list) {
                                ViewfinderView viewfinderView = ((DecoratedBarcodeView) jz02.y).x;
                                if (viewfinderView.C.size() < 20) {
                                    viewfinderView.C.add(r66);
                                }
                            }
                        }
                        return z;
                    }
                }
                z = true;
                return z;
            default:
                BarcodeView barcodeView2 = this.x;
                ck0 ck0 = barcodeView2.U;
                int i2 = message2.what;
                if (i2 == R.id.zxing_prewiew_size_ready) {
                    vu6 vu6 = (vu6) message2.obj;
                    barcodeView2.J = vu6;
                    vu6 vu62 = barcodeView2.I;
                    if (vu62 != null) {
                        if (vu6 == null || (igVar = barcodeView2.G) == null) {
                            barcodeView2.N = null;
                            barcodeView2.M = null;
                            barcodeView2.K = null;
                            h.s("containerSize or previewSize is not set yet");
                        } else {
                            int i3 = vu6.w;
                            int i4 = vu6.x;
                            int i5 = vu62.w;
                            int i6 = vu62.x;
                            Rect b = ((io5) igVar.d).b(vu6, (vu6) igVar.c);
                            if (b.width() > 0 && b.height() > 0) {
                                barcodeView2.K = b;
                                Rect rect = new Rect(0, 0, i5, i6);
                                Rect rect2 = barcodeView2.K;
                                Rect rect3 = new Rect(rect);
                                rect3.intersect(rect2);
                                if (barcodeView2.O != null) {
                                    rect3.inset(Math.max(0, (rect3.width() - barcodeView2.O.w) / 2), Math.max(0, (rect3.height() - barcodeView2.O.x) / 2));
                                } else {
                                    int min = (int) Math.min(((double) rect3.width()) * barcodeView2.P, ((double) rect3.height()) * barcodeView2.P);
                                    rect3.inset(min, min);
                                    if (rect3.height() > rect3.width()) {
                                        rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                                    }
                                }
                                barcodeView2.M = rect3;
                                Rect rect4 = new Rect(barcodeView2.M);
                                Rect rect5 = barcodeView2.K;
                                rect4.offset(-rect5.left, -rect5.top);
                                Rect rect6 = new Rect((rect4.left * i3) / barcodeView2.K.width(), (rect4.top * i4) / barcodeView2.K.height(), (rect4.right * i3) / barcodeView2.K.width(), (rect4.bottom * i4) / barcodeView2.K.height());
                                barcodeView2.N = rect6;
                                if (rect6.width() <= 0 || barcodeView2.N.height() <= 0) {
                                    barcodeView2.N = null;
                                    barcodeView2.M = null;
                                    Log.w("dk0", "Preview frame is too small");
                                } else {
                                    ck0.e();
                                }
                            }
                            barcodeView2.requestLayout();
                            barcodeView2.e();
                        }
                    }
                    return true;
                } else if (i2 == R.id.zxing_camera_error) {
                    Exception exc = (Exception) message2.obj;
                    if (barcodeView2.w != null) {
                        barcodeView2.g();
                        ck0.c(exc);
                    }
                } else if (i2 == R.id.zxing_camera_closed) {
                    ck0.a();
                }
                return false;
        }
    }
}
