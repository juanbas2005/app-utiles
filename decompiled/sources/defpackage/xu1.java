package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: xu1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xu1 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ xu1(int i) {
        this.a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r3 = (defpackage.p58) r3;
     */
    public final void getOutline(View view, Outline outline) {
        p58 p58;
        Outline outline2;
        switch (this.a) {
            case b85.b:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                if ((view instanceof p58) && (outline2 = p58.A) != null) {
                    outline.set(outline2);
                    float f = p58.G;
                    if (f != 0.0f || p58.H != 0.0f) {
                        outline.offset((int) f, (int) p58.H);
                        return;
                    }
                    return;
                }
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}
