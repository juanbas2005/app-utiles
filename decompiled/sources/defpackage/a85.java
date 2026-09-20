package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: a85  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class a85 extends t22 {
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a85(xy5 xy5, int i) {
        super(xy5);
        this.d = i;
    }

    public final int d(View view) {
        int right;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case b85.b /*0*/:
                ((xy5) obj).getClass();
                right = view.getRight() + ((yy5) view.getLayoutParams()).b.right;
                i = ((yy5) view.getLayoutParams()).rightMargin;
                break;
            default:
                ((xy5) obj).getClass();
                right = view.getBottom() + ((yy5) view.getLayoutParams()).b.bottom;
                i = ((yy5) view.getLayoutParams()).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int e(View view) {
        int A;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case b85.b /*0*/:
                yy5 yy5 = (yy5) view.getLayoutParams();
                ((xy5) obj).getClass();
                A = xy5.A(view) + yy5.leftMargin;
                i = yy5.rightMargin;
                break;
            default:
                yy5 yy52 = (yy5) view.getLayoutParams();
                ((xy5) obj).getClass();
                A = xy5.z(view) + yy52.topMargin;
                i = yy52.bottomMargin;
                break;
        }
        return A + i;
    }

    public final int f(View view) {
        int z;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case b85.b /*0*/:
                yy5 yy5 = (yy5) view.getLayoutParams();
                ((xy5) obj).getClass();
                z = xy5.z(view) + yy5.topMargin;
                i = yy5.bottomMargin;
                break;
            default:
                yy5 yy52 = (yy5) view.getLayoutParams();
                ((xy5) obj).getClass();
                z = xy5.A(view) + yy52.leftMargin;
                i = yy52.rightMargin;
                break;
        }
        return z + i;
    }

    public final int g(View view) {
        int left;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case b85.b /*0*/:
                ((xy5) obj).getClass();
                left = view.getLeft() - ((yy5) view.getLayoutParams()).b.left;
                i = ((yy5) view.getLayoutParams()).leftMargin;
                break;
            default:
                ((xy5) obj).getClass();
                left = view.getTop() - ((yy5) view.getLayoutParams()).b.top;
                i = ((yy5) view.getLayoutParams()).topMargin;
                break;
        }
        return left - i;
    }

    public final int h() {
        switch (this.d) {
            case b85.b /*0*/:
                return ((xy5) this.b).n;
            default:
                return ((xy5) this.b).o;
        }
    }

    public final int i() {
        int i;
        int F;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case b85.b /*0*/:
                xy5 xy5 = (xy5) obj;
                i = xy5.n;
                F = xy5.F();
                break;
            default:
                xy5 xy52 = (xy5) obj;
                i = xy52.o;
                F = xy52.D();
                break;
        }
        return i - F;
    }

    public final int j() {
        switch (this.d) {
            case b85.b /*0*/:
                return ((xy5) this.b).F();
            default:
                return ((xy5) this.b).D();
        }
    }

    public final int k() {
        switch (this.d) {
            case b85.b /*0*/:
                return ((xy5) this.b).l;
            default:
                return ((xy5) this.b).m;
        }
    }

    public final int l() {
        switch (this.d) {
            case b85.b /*0*/:
                return ((xy5) this.b).m;
            default:
                return ((xy5) this.b).l;
        }
    }

    public final int m() {
        switch (this.d) {
            case b85.b /*0*/:
                return ((xy5) this.b).E();
            default:
                return ((xy5) this.b).G();
        }
    }

    public final int n() {
        int E;
        int F;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case b85.b /*0*/:
                xy5 xy5 = (xy5) obj;
                E = xy5.n - xy5.E();
                F = xy5.F();
                break;
            default:
                xy5 xy52 = (xy5) obj;
                E = xy52.o - xy52.G();
                F = xy52.D();
                break;
        }
        return E - F;
    }

    public final int o(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case b85.b /*0*/:
                Rect rect = (Rect) obj;
                ((xy5) obj2).K(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((xy5) obj2).K(view, rect2);
                return rect2.bottom;
        }
    }

    public final int p(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case b85.b /*0*/:
                Rect rect = (Rect) obj;
                ((xy5) obj2).K(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((xy5) obj2).K(view, rect2);
                return rect2.top;
        }
    }

    public final void q(int i) {
        switch (this.d) {
            case b85.b /*0*/:
                ((xy5) this.b).O(i);
                return;
            default:
                ((xy5) this.b).P(i);
                return;
        }
    }
}
