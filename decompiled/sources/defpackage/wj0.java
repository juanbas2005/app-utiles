package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.SurfaceHolder;
import cu.lestebang.utiletecsa.R;

/* renamed from: wj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wj0 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ xj0 x;

    public /* synthetic */ wj0(xj0 xj0, int i) {
        this.w = i;
        this.x = xj0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: android.hardware.Camera} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.hardware.Camera} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: vu6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: android.hardware.Camera} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.hardware.Camera} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: android.hardware.Camera} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: android.hardware.Camera} */
    /* JADX WARNING: type inference failed for: r5v7, types: [vu6] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void run() {
        boolean z = false;
        Camera camera = null;
        switch (this.w) {
            case b85.b:
                xj0 xj0 = this.x;
                try {
                    Log.d("xj0", "Opening camera");
                    zj0 zj0 = xj0.c;
                    int m = u55.m(zj0.g.a);
                    if (m != -1) {
                        camera = Camera.open(m);
                    }
                    zj0.a = camera;
                    if (camera != null) {
                        int m2 = u55.m(zj0.g.a);
                        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                        zj0.b = cameraInfo;
                        Camera.getCameraInfo(m2, cameraInfo);
                        return;
                    }
                    rf2.r("Failed to open camera");
                    return;
                } catch (Exception e) {
                    Handler handler = xj0.d;
                    if (handler != null) {
                        handler.obtainMessage(R.id.zxing_camera_error, e).sendToTarget();
                    }
                    Log.e("xj0", "Failed to open camera", e);
                    return;
                }
            case 1:
                xj0 xj02 = this.x;
                zj0 zj02 = xj02.c;
                try {
                    Log.d("xj0", "Configuring camera");
                    zj02.b();
                    Handler handler2 = xj02.d;
                    if (handler2 != null) {
                        vu6 vu6 = zj02.j;
                        if (vu6 != null) {
                            int i = zj02.k;
                            if (i != -1) {
                                if (i % 180 != 0) {
                                    z = true;
                                }
                                if (z) {
                                    camera = new vu6(vu6.x, vu6.w);
                                } else {
                                    camera = vu6;
                                }
                            } else {
                                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                            }
                        }
                        handler2.obtainMessage(R.id.zxing_prewiew_size_ready, camera).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    Handler handler3 = xj02.d;
                    if (handler3 != null) {
                        handler3.obtainMessage(R.id.zxing_camera_error, e2).sendToTarget();
                    }
                    Log.e("xj0", "Failed to configure camera", e2);
                    return;
                }
            case 2:
                xj0 xj03 = this.x;
                zj0 zj03 = xj03.c;
                try {
                    Log.d("xj0", "Starting preview");
                    qc3 qc3 = xj03.b;
                    Camera camera2 = zj03.a;
                    SurfaceHolder surfaceHolder = (SurfaceHolder) qc3.x;
                    if (surfaceHolder != null) {
                        camera2.setPreviewDisplay(surfaceHolder);
                    } else {
                        camera2.setPreviewTexture((SurfaceTexture) qc3.y);
                    }
                    zj03.e();
                    return;
                } catch (Exception e3) {
                    Handler handler4 = xj03.d;
                    if (handler4 != null) {
                        handler4.obtainMessage(R.id.zxing_camera_error, e3).sendToTarget();
                    }
                    Log.e("xj0", "Failed to start preview", e3);
                    return;
                }
            default:
                try {
                    Log.d("xj0", "Closing camera");
                    zj0 zj04 = this.x.c;
                    ay ayVar = zj04.c;
                    if (ayVar != null) {
                        ayVar.c();
                        zj04.c = null;
                    }
                    if (zj04.d != null) {
                        zj04.d = null;
                    }
                    Camera camera3 = zj04.a;
                    if (camera3 != null && zj04.e) {
                        camera3.stopPreview();
                        zj04.l.a = null;
                        zj04.e = false;
                    }
                    zj0 zj05 = this.x.c;
                    Camera camera4 = zj05.a;
                    if (camera4 != null) {
                        camera4.release();
                        zj05.a = null;
                    }
                } catch (Exception e4) {
                    Log.e("xj0", "Failed to close camera", e4);
                }
                xj0 xj04 = this.x;
                xj04.g = true;
                xj04.d.sendEmptyMessage(R.id.zxing_camera_closed);
                kb9 kb9 = this.x.a;
                synchronized (kb9.A) {
                    int i2 = kb9.x - 1;
                    kb9.x = i2;
                    if (i2 == 0) {
                        synchronized (kb9.A) {
                            ((HandlerThread) kb9.z).quit();
                            kb9.z = null;
                            kb9.y = null;
                        }
                    }
                }
                return;
        }
    }
}
