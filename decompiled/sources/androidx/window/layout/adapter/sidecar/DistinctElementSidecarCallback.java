package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public final Object a = new Object();
    public SidecarDeviceState b;
    public final WeakHashMap c = new WeakHashMap();
    public final zs6 d;
    public final SidecarInterface.SidecarCallback e;

    public DistinctElementSidecarCallback(zs6 zs6, SidecarInterface.SidecarCallback sidecarCallback) {
        this.d = zs6;
        this.e = sidecarCallback;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (defpackage.ys6.b(r2) == defpackage.ys6.b(r4)) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        return;
     */
    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState != null) {
            synchronized (this.a) {
                try {
                    zs6 zs6 = this.d;
                    SidecarDeviceState sidecarDeviceState2 = this.b;
                    zs6.getClass();
                    if (!sg3.e(sidecarDeviceState2, sidecarDeviceState)) {
                        if (sidecarDeviceState2 == null) {
                        }
                        this.b = sidecarDeviceState;
                        this.e.onDeviceStateChanged(sidecarDeviceState);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean z;
        synchronized (this.a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.c.get(iBinder);
                this.d.getClass();
                if (sg3.e(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    z = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null) {
                        if (sidecarWindowLayoutInfo != null) {
                            z = zs6.b(ys6.c(sidecarWindowLayoutInfo2), ys6.c(sidecarWindowLayoutInfo));
                        }
                    }
                    z = false;
                }
                if (!z) {
                    this.c.put(iBinder, sidecarWindowLayoutInfo);
                    this.e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
