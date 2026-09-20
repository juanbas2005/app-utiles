package defpackage;

import android.hardware.Camera;

/* renamed from: zx  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zx implements Camera.AutoFocusCallback {
    public final /* synthetic */ ay a;

    public zx(ay ayVar) {
        this.a = ayVar;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        this.a.e.post(new y0(5, this));
    }
}
