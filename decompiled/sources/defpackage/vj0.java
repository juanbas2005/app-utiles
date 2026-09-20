package defpackage;

import android.hardware.Camera;
import android.util.Log;

/* renamed from: vj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class vj0 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ xj0 x;
    public final /* synthetic */ wv2 y;

    public /* synthetic */ vj0(xj0 xj0, wv2 wv2, int i) {
        this.w = i;
        this.x = xj0;
        this.y = wv2;
    }

    public final void run() {
        int i = this.w;
        wv2 wv2 = this.y;
        xj0 xj0 = this.x;
        switch (i) {
            case b85.b:
                if (!xj0.f) {
                    Log.d("xj0", "Camera is closed, not requesting preview");
                    return;
                } else {
                    xj0.a.c(new vj0(xj0, wv2, 1));
                    return;
                }
            default:
                zj0 zj0 = xj0.c;
                Camera camera = zj0.a;
                if (camera != null && zj0.e) {
                    yj0 yj0 = zj0.l;
                    yj0.a = wv2;
                    camera.setOneShotPreviewCallback(yj0);
                    return;
                }
                return;
        }
    }
}
