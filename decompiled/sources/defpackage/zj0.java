package defpackage;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: zj0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zj0 {
    public static final /* synthetic */ int m = 0;
    public Camera a;
    public Camera.CameraInfo b;
    public ay c;
    public wb d;
    public boolean e;
    public String f;
    public ek0 g = new ek0();
    public ig h;
    public vu6 i;
    public vu6 j;
    public int k = -1;
    public final yj0 l = new yj0(this);

    public zj0(Context context) {
    }

    public final int a() {
        int i2;
        int i3 = this.h.b;
        int i4 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                i4 = 90;
            } else if (i3 == 2) {
                i4 = 180;
            } else if (i3 == 3) {
                i4 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.b;
        if (cameraInfo.facing == 1) {
            i2 = (360 - ((cameraInfo.orientation + i4) % 360)) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i4) + 360) % 360;
        }
        Log.i("zj0", "Camera Display Orientation: " + i2);
        return i2;
    }

    public final void b() {
        if (this.a != null) {
            try {
                int a2 = a();
                this.k = a2;
                this.a.setDisplayOrientation(a2);
            } catch (Exception unused) {
                Log.w("zj0", "Failed to set rotation.");
            }
            try {
                c(false);
            } catch (Exception unused2) {
                try {
                    c(true);
                } catch (Exception unused3) {
                    Log.w("zj0", "Camera rejected even safe-mode parameters! No configuration");
                }
            }
            Camera.Size previewSize = this.a.getParameters().getPreviewSize();
            if (previewSize == null) {
                this.j = this.i;
            } else {
                this.j = new vu6(previewSize.width, previewSize.height);
            }
            this.l.b = this.j;
            return;
        }
        rf2.r("Camera not open");
    }

    public final void c(boolean z) {
        String str;
        boolean z2;
        Camera.Parameters parameters = this.a.getParameters();
        String str2 = this.f;
        if (str2 == null) {
            this.f = parameters.flatten();
        } else {
            parameters.unflatten(str2);
        }
        if (parameters == null) {
            Log.w("zj0", "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        Log.i("zj0", "Initial camera parameters: " + parameters.flatten());
        if (z) {
            Log.w("zj0", "In camera config safe mode -- most settings will not be honored");
        }
        this.g.getClass();
        int i2 = uj0.a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String a2 = uj0.a("focus mode", supportedFocusModes, "auto");
        if (!z && a2 == null) {
            a2 = uj0.a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (a2 != null) {
            if (a2.equals(parameters.getFocusMode())) {
                Log.i("CameraConfiguration", "Focus mode already set to ".concat(a2));
            } else {
                parameters.setFocusMode(a2);
            }
        }
        if (!z) {
            uj0.b(parameters, false);
            this.g.getClass();
            this.g.getClass();
            this.g.getClass();
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new vu6(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size next : supportedPreviewSizes) {
                arrayList.add(new vu6(next.width, next.height));
            }
        }
        int[] iArr = null;
        if (arrayList.size() == 0) {
            this.i = null;
        } else {
            ig igVar = this.h;
            int i3 = this.k;
            if (i3 != -1) {
                if (i3 % 180 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                vu6 vu6 = (vu6) igVar.c;
                if (vu6 == null) {
                    vu6 = null;
                } else if (z2) {
                    vu6 = new vu6(vu6.x, vu6.w);
                }
                io5 io5 = (io5) igVar.d;
                io5.getClass();
                if (vu6 != null) {
                    Collections.sort(arrayList, new ho5(io5, vu6));
                }
                Log.i("io5", "Viewfinder size: " + vu6);
                Log.i("io5", "Preview in order of preference: " + arrayList);
                vu6 vu62 = (vu6) arrayList.get(0);
                this.i = vu62;
                parameters.setPreviewSize(vu62.w, vu62.x);
            } else {
                h.s("Rotation not calculated yet. Call configure() first.");
                return;
            }
        }
        if (Build.DEVICE.equals("glass-1")) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            StringBuilder sb = new StringBuilder("Supported FPS ranges: ");
            if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
                str = "[]";
            } else {
                StringBuilder sb2 = new StringBuilder("[");
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    sb2.append(Arrays.toString(it.next()));
                    if (it.hasNext()) {
                        sb2.append(", ");
                    }
                }
                sb2.append(']');
                str = sb2.toString();
            }
            sb.append(str);
            Log.i("CameraConfiguration", sb.toString());
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int[] next2 = it2.next();
                    int i4 = next2[0];
                    int i5 = next2[1];
                    if (i4 >= 10000 && i5 <= 20000) {
                        iArr = next2;
                        break;
                    }
                }
                if (iArr == null) {
                    Log.i("CameraConfiguration", "No suitable FPS range?");
                } else {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (Arrays.equals(iArr2, iArr)) {
                        Log.i("CameraConfiguration", "FPS range already set to " + Arrays.toString(iArr));
                    } else {
                        Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
            }
        }
        Log.i("zj0", "Final camera parameters: " + parameters.flatten());
        this.a.setParameters(parameters);
    }

    public final void d(boolean z) {
        boolean z2;
        String flashMode;
        Camera camera = this.a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (parameters == null || (flashMode = parameters.getFlashMode()) == null || (!"on".equals(flashMode) && !"torch".equals(flashMode))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z != z2) {
                    ay ayVar = this.c;
                    if (ayVar != null) {
                        ayVar.c();
                    }
                    Camera.Parameters parameters2 = this.a.getParameters();
                    uj0.b(parameters2, z);
                    this.g.getClass();
                    this.a.setParameters(parameters2);
                    ay ayVar2 = this.c;
                    if (ayVar2 != null) {
                        ayVar2.a = false;
                        ayVar2.b();
                    }
                }
            } catch (RuntimeException e2) {
                Log.e("zj0", "Failed to set torch", e2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, wb] */
    public final void e() {
        Camera camera = this.a;
        if (camera != null && !this.e) {
            camera.startPreview();
            this.e = true;
            this.c = new ay(this.a, this.g);
            ek0 ek0 = this.g;
            ? obj = new Object();
            obj.a = this;
            obj.b = new Handler();
            this.d = obj;
            ek0.getClass();
        }
    }
}
