package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: m44  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class m44 extends z65 {
    public final /* synthetic */ int c;
    public final SideSheetBehavior d;

    public /* synthetic */ m44(SideSheetBehavior sideSheetBehavior, int i) {
        this.c = i;
        this.d = sideSheetBehavior;
    }

    public final int A(View view) {
        int i = this.c;
        SideSheetBehavior sideSheetBehavior = this.d;
        switch (i) {
            case b85.b:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    public final int B(CoordinatorLayout coordinatorLayout) {
        switch (this.c) {
            case b85.b:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    public final int D() {
        switch (this.c) {
            case b85.b:
                return 1;
            default:
                return 0;
        }
    }

    public final boolean G(float f) {
        switch (this.c) {
            case b85.b:
                if (f > 0.0f) {
                    return true;
                }
                return false;
            default:
                if (f < 0.0f) {
                    return true;
                }
                return false;
        }
    }

    public final boolean H(View view) {
        switch (this.c) {
            case b85.b:
                if (view.getRight() < (v() - w()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (v() + this.d.m) / 2) {
                    return true;
                }
                return false;
        }
    }

    public final boolean I(float f, float f2) {
        switch (this.c) {
            case b85.b:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f) {
                    return false;
                }
                return true;
            default:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f) {
                    return false;
                }
                return true;
        }
    }

    public final boolean P(View view, float f) {
        int i = this.c;
        SideSheetBehavior sideSheetBehavior = this.d;
        switch (i) {
            case b85.b:
                if (Math.abs((f * sideSheetBehavior.k) + ((float) view.getLeft())) > 0.5f) {
                    return true;
                }
                return false;
            default:
                if (Math.abs((f * sideSheetBehavior.k) + ((float) view.getRight())) > 0.5f) {
                    return true;
                }
                return false;
        }
    }

    public final void W(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.c;
        SideSheetBehavior sideSheetBehavior = this.d;
        switch (i3) {
            case b85.b:
                if (i <= sideSheetBehavior.m) {
                    marginLayoutParams.leftMargin = i2;
                    return;
                }
                return;
            default:
                int i4 = sideSheetBehavior.m;
                if (i <= i4) {
                    marginLayoutParams.rightMargin = i4 - i;
                    return;
                }
                return;
        }
    }

    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.c) {
            case b85.b:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final float d(int i) {
        switch (this.c) {
            case b85.b:
                float w = (float) w();
                return (((float) i) - w) / (((float) v()) - w);
            default:
                float f = (float) this.d.m;
                return (f - ((float) i)) / (f - ((float) v()));
        }
    }

    public final int v() {
        int i = this.c;
        SideSheetBehavior sideSheetBehavior = this.d;
        switch (i) {
            case b85.b:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    public final int w() {
        int i = this.c;
        SideSheetBehavior sideSheetBehavior = this.d;
        switch (i) {
            case b85.b:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    public final int x() {
        int i = this.c;
        SideSheetBehavior sideSheetBehavior = this.d;
        switch (i) {
            case b85.b:
                return sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    public final int y() {
        switch (this.c) {
            case b85.b:
                return -this.d.l;
            default:
                return v();
        }
    }
}
