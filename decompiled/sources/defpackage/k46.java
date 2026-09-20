package defpackage;

import android.view.RenderNode;

/* renamed from: k46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class k46 {
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    public static void d(RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }
}
