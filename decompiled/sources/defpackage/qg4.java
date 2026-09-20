package defpackage;

import android.content.res.ColorStateList;
import cu.lestebang.utiletecsa.R;

/* renamed from: qg4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qg4 extends gp {
    public static final int[][] C = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList A;
    public boolean B;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.A == null) {
            int z = h49.z(this, R.attr.colorControlActivated);
            int z2 = h49.z(this, R.attr.colorOnSurface);
            int z3 = h49.z(this, R.attr.colorSurface);
            this.A = new ColorStateList(C, new int[]{h49.G(1.0f, z3, z), h49.G(0.54f, z3, z2), h49.G(0.38f, z3, z2), h49.G(0.38f, z3, z2)});
        }
        return this.A;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.B = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList((ColorStateList) null);
        }
    }
}
