package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: w64  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class w64 {
    public int a = -1;
    public RecyclerView b;
    public xy5 c;
    public boolean d;
    public boolean e;
    public View f;
    public final gz5 g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    /* JADX WARNING: type inference failed for: r1v0, types: [gz5, java.lang.Object] */
    public w64(Context context) {
        ? obj = new Object();
        obj.d = -1;
        obj.f = false;
        obj.g = 0;
        obj.a = 0;
        obj.b = 0;
        obj.c = Integer.MIN_VALUE;
        obj.e = null;
        this.g = obj;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            h.q("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
    }

    public int b(View view, int i2) {
        xy5 xy5 = this.c;
        if (xy5 == null || !xy5.d()) {
            return 0;
        }
        yy5 yy5 = (yy5) view.getLayoutParams();
        return a((view.getLeft() - ((yy5) view.getLayoutParams()).b.left) - yy5.leftMargin, view.getRight() + ((yy5) view.getLayoutParams()).b.right + yy5.rightMargin, xy5.E(), xy5.n - xy5.F(), i2);
    }

    public int c(View view, int i2) {
        xy5 xy5 = this.c;
        if (xy5 == null || !xy5.e()) {
            return 0;
        }
        yy5 yy5 = (yy5) view.getLayoutParams();
        return a((view.getTop() - ((yy5) view.getLayoutParams()).b.top) - yy5.topMargin, view.getBottom() + ((yy5) view.getLayoutParams()).b.bottom + yy5.bottomMargin, xy5.G(), xy5.o - xy5.D(), i2);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int e(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.m) {
            this.n = d(this.l);
            this.m = true;
        }
        return (int) Math.ceil((double) (abs * this.n));
    }

    public PointF f(int i2) {
        xy5 xy5 = this.c;
        if (xy5 instanceof hz5) {
            return ((hz5) xy5).a(i2);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + hz5.class.getCanonicalName());
        return null;
    }

    public final void g(int i2, int i3) {
        PointF f2;
        RecyclerView recyclerView = this.b;
        int i4 = -1;
        if (this.a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f == null && this.c != null && (f2 = f(this.a)) != null) {
            float f3 = f2.x;
            if (!(f3 == 0.0f && f2.y == 0.0f)) {
                recyclerView.X((int) Math.signum(f3), (int) Math.signum(f2.y), (int[]) null);
            }
        }
        boolean z = false;
        this.d = false;
        View view = this.f;
        gz5 gz5 = this.g;
        if (view != null) {
            this.b.getClass();
            lz5 I = RecyclerView.I(view);
            if (I != null) {
                i4 = I.b();
            }
            if (i4 == this.a) {
                View view2 = this.f;
                iz5 iz5 = recyclerView.z0;
                h(view2, gz5);
                gz5.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            iz5 iz52 = recyclerView.z0;
            if (this.b.H.v() == 0) {
                i();
            } else {
                int i5 = this.o;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.o = i6;
                int i7 = this.p;
                int i8 = i7 - i3;
                if (i7 * i8 <= 0) {
                    i8 = 0;
                }
                this.p = i8;
                if (i6 == 0 && i8 == 0) {
                    PointF f4 = f(this.a);
                    if (f4 != null) {
                        float f5 = f4.x;
                        if (!(f5 == 0.0f && f4.y == 0.0f)) {
                            float f6 = f4.y;
                            float sqrt = (float) Math.sqrt((double) ((f6 * f6) + (f5 * f5)));
                            float f7 = f4.x / sqrt;
                            f4.x = f7;
                            float f8 = f4.y / sqrt;
                            f4.y = f8;
                            this.k = f4;
                            this.o = (int) (f7 * 10000.0f);
                            this.p = (int) (f8 * 10000.0f);
                            int e2 = e(10000);
                            gz5.a = (int) (((float) this.o) * 1.2f);
                            gz5.b = (int) (((float) this.p) * 1.2f);
                            gz5.c = (int) (((float) e2) * 1.2f);
                            gz5.e = this.i;
                            gz5.f = true;
                        }
                    }
                    gz5.d = this.a;
                    i();
                }
            }
            if (gz5.d >= 0) {
                z = true;
            }
            gz5.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.w0.a();
            }
        }
    }

    public void h(View view, gz5 gz5) {
        int i2;
        int i3;
        int i4;
        PointF pointF = this.k;
        int i5 = 0;
        if (pointF == null || pointF.x == 0.0f) {
            i2 = 0;
        } else if (i4 > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int b2 = b(view, i2);
        PointF pointF2 = this.k;
        if (!(pointF2 == null || pointF2.y == 0.0f)) {
            i5 = i3 > 0 ? 1 : -1;
        }
        int c2 = c(view, i5);
        int ceil = (int) Math.ceil(((double) e((int) Math.sqrt((double) ((c2 * c2) + (b2 * b2))))) / 0.3356d);
        if (ceil > 0) {
            gz5.a = -b2;
            gz5.b = -c2;
            gz5.c = ceil;
            gz5.e = this.j;
            gz5.f = true;
        }
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.p = 0;
            this.o = 0;
            this.k = null;
            this.b.z0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            xy5 xy5 = this.c;
            if (xy5.e == this) {
                xy5.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
