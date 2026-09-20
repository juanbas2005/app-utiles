package defpackage;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import cu.lestebang.utiletecsa.R;

/* renamed from: yj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yj0 implements Camera.PreviewCallback {
    public wv2 a;
    public vu6 b;
    public final /* synthetic */ zj0 c;

    public yj0(zj0 zj0) {
        this.c = zj0;
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        vu6 vu6 = this.b;
        wv2 wv2 = this.a;
        if (vu6 == null || wv2 == null) {
            Log.d("zj0", "Got preview callback, but no handler or resolution available");
            if (wv2 != null) {
                new Exception("No resolution available");
                wv2.o();
            }
        } else if (bArr != null) {
            try {
                byte[] bArr2 = bArr;
                ry6 ry6 = new ry6(bArr2, vu6.w, vu6.x, camera.getParameters().getPreviewFormat(), this.c.k);
                if (this.c.b.facing == 1) {
                    ry6.e = true;
                }
                synchronized (((nz0) wv2.x).h) {
                    nz0 nz0 = (nz0) wv2.x;
                    if (nz0.a) {
                        ((Handler) nz0.d).obtainMessage(R.id.zxing_decode, ry6).sendToTarget();
                    }
                }
            } catch (RuntimeException e) {
                Log.e("zj0", "Camera preview failed", e);
                wv2.o();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("No preview data received");
        }
    }
}
