package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lvs7;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class SidecarCompat$TranslatingCallback implements SidecarInterface.SidecarCallback {
    public final /* synthetic */ ct6 a;

    public SidecarCompat$TranslatingCallback(ct6 ct6) {
        this.a = ct6;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        IBinder iBinder;
        SidecarInterface sidecarInterface;
        Window window;
        WindowManager.LayoutParams attributes;
        sidecarDeviceState.getClass();
        ct6 ct6 = this.a;
        for (Activity activity : this.a.c.values()) {
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                iBinder = null;
            } else {
                iBinder = attributes.token;
            }
            if (!(iBinder == null || (sidecarInterface = ct6.a) == null)) {
                sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinder);
            }
            cf4 cf4 = ct6.e;
            if (cf4 != null) {
                cf4.x(activity, ct6.b.c(sidecarWindowLayoutInfo, sidecarDeviceState));
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        SidecarDeviceState sidecarDeviceState;
        iBinder.getClass();
        sidecarWindowLayoutInfo.getClass();
        Activity activity = (Activity) this.a.c.get(iBinder);
        if (activity == null) {
            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
            return;
        }
        ct6 ct6 = this.a;
        zs6 zs6 = ct6.b;
        SidecarInterface sidecarInterface = ct6.a;
        if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        pb8 c = zs6.c(sidecarWindowLayoutInfo, sidecarDeviceState);
        cf4 cf4 = this.a.e;
        if (cf4 != null) {
            cf4.x(activity, c);
        }
    }
}
