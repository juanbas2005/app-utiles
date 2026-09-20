package defpackage;

import com.google.android.material.button.MaterialButton;

/* renamed from: tg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tg4 extends pd8 {
    public final int E;

    public tg4(int i) {
        this.E = i;
    }

    public final void B(fr6 fr6, float f) {
        ug4 ug4 = (ug4) fr6;
        float[] fArr = ug4.X;
        if (fArr != null) {
            int i = this.E;
            if (fArr[i] != f) {
                fArr[i] = f;
                c9 c9Var = ug4.Z;
                if (c9Var != null) {
                    float h = ug4.h();
                    MaterialButton materialButton = (MaterialButton) c9Var.x;
                    int i2 = (int) (h * 0.11f);
                    if (materialButton.T != i2) {
                        materialButton.T = i2;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                ug4.invalidateSelf();
            }
        }
    }

    public final float t(fr6 fr6) {
        float[] fArr = ((ug4) fr6).X;
        if (fArr != null) {
            return fArr[this.E];
        }
        return 0.0f;
    }
}
