package defpackage;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* renamed from: vw2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class vw2 {
    public static /* synthetic */ LinearGradient b(float f, float f2, float f3, float f4, long[] jArr, float[] fArr, Shader.TileMode tileMode) {
        return new LinearGradient(f, f2, f3, f4, jArr, fArr, tileMode);
    }

    public static /* synthetic */ RadialGradient c(float f, float f2, float f3, long[] jArr, float[] fArr, Shader.TileMode tileMode) {
        return new RadialGradient(f, f2, f3, jArr, fArr, tileMode);
    }

    public static /* synthetic */ RenderNode e() {
        return new RenderNode("graphicsLayer");
    }
}
