package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* renamed from: ak0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ak0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ dk0 a;

    public ak0(dk0 dk0) {
        this.a = dk0;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        vu6 vu6 = new vu6(i, i2);
        dk0 dk0 = this.a;
        dk0.L = vu6;
        dk0.e();
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
