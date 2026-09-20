package defpackage;

import android.view.View;

/* renamed from: z02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z02 extends pd8 {
    public final /* synthetic */ int E;

    public /* synthetic */ z02(int i) {
        this.E = i;
    }

    public final void B(fr6 fr6, float f) {
        switch (this.E) {
            case b85.b:
                ((View) fr6).setAlpha(f);
                return;
            case 1:
                ((View) fr6).setScaleX(f);
                return;
            case 2:
                ((View) fr6).setScaleY(f);
                return;
            case 3:
                ((View) fr6).setRotation(f);
                return;
            case 4:
                ((View) fr6).setRotationX(f);
                return;
            default:
                ((View) fr6).setRotationY(f);
                return;
        }
    }

    public final float t(fr6 fr6) {
        switch (this.E) {
            case b85.b:
                return ((View) fr6).getAlpha();
            case 1:
                return ((View) fr6).getScaleX();
            case 2:
                return ((View) fr6).getScaleY();
            case 3:
                return ((View) fr6).getRotation();
            case 4:
                return ((View) fr6).getRotationX();
            default:
                return ((View) fr6).getRotationY();
        }
    }
}
