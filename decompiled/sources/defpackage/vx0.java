package defpackage;

import android.content.Context;

/* renamed from: vx0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vx0 extends a1 {
    public final ed5 F = u55.p((Object) null);
    public boolean G;

    public vx0(Context context) {
        super(context);
    }

    public final void a(int i, yt2 yt2) {
        int i2;
        boolean z;
        yt2.g0(420213850);
        if (yt2.i(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (yt2.V(i3 & 1, z)) {
            gs2 gs2 = (gs2) this.F.getValue();
            if (gs2 == null) {
                yt2.e0(-1238823553);
            } else {
                yt2.e0(98585282);
                gs2.H(yt2, 0);
            }
            yt2.r(false);
        } else {
            yt2.Y();
        }
        yx5 v = yt2.v();
        if (v != null) {
            v.d = new z0(this, i, 4);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return vx0.class.getName();
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.G;
    }

    public final void setContent(gs2 gs2) {
        this.G = true;
        this.F.setValue(gs2);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
