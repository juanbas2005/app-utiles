package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;

/* renamed from: d8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d8 implements rj4 {
    public qj4 A;
    public final int B = R.layout.abc_action_menu_layout;
    public final int C = R.layout.abc_action_menu_item_layout;
    public tj4 D;
    public c8 E;
    public Drawable F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final SparseBooleanArray N = new SparseBooleanArray();
    public a8 O;
    public a8 P;
    public nt2 Q;
    public b8 R;
    public final wv2 S = new wv2(1, this);
    public final Context w;
    public Context x;
    public ti4 y;
    public final LayoutInflater z;

    public d8(Context context) {
        this.w = context;
        this.z = LayoutInflater.from(context);
    }

    public final void a(ti4 ti4, boolean z2) {
        g();
        a8 a8Var = this.P;
        if (a8Var != null && a8Var.b()) {
            a8Var.i.dismiss();
        }
        qj4 qj4 = this.A;
        if (qj4 != null) {
            qj4.a(ti4, z2);
        }
    }

    public final View b(yi4 yi4, View view, ViewGroup viewGroup) {
        sj4 sj4;
        View actionView = yi4.getActionView();
        int i = 0;
        if (actionView == null || yi4.e()) {
            if (view instanceof sj4) {
                sj4 = (sj4) view;
            } else {
                sj4 = (sj4) this.z.inflate(this.C, viewGroup, false);
            }
            sj4.c(yi4);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) sj4;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.D);
            if (this.R == null) {
                this.R = new b8(this);
            }
            actionMenuItemView.setPopupCallback(this.R);
            actionView = (View) sj4;
        }
        if (yi4.C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof f8)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean c(i67 i67) {
        boolean z2;
        if (i67.hasVisibleItems()) {
            i67 i672 = i67;
            while (true) {
                ti4 ti4 = i672.z;
                if (ti4 == this.y) {
                    break;
                }
                i672 = ti4;
            }
            yi4 yi4 = i672.A;
            ViewGroup viewGroup = (ViewGroup) this.D;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof sj4) && ((sj4) childAt).getItemData() == yi4) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                i67.A.getClass();
                int size = i67.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z2 = false;
                        break;
                    }
                    MenuItem item = i67.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                a8 a8Var = new a8(this, this.x, i67, view);
                this.P = a8Var;
                a8Var.g = z2;
                gj4 gj4 = a8Var.i;
                if (gj4 != null) {
                    gj4.o(z2);
                }
                a8 a8Var2 = this.P;
                if (!a8Var2.b()) {
                    if (a8Var2.e != null) {
                        a8Var2.d(0, 0, false, false);
                    } else {
                        h.s("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                }
                qj4 qj4 = this.A;
                if (qj4 != null) {
                    qj4.m(i67);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        d8 d8Var = this;
        ti4 ti4 = d8Var.y;
        if (ti4 != null) {
            arrayList = ti4.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = d8Var.L;
        int i4 = d8Var.K;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) d8Var.D;
        int i5 = 0;
        boolean z6 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= i) {
                break;
            }
            yi4 yi4 = (yi4) arrayList.get(i5);
            int i8 = yi4.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z6 = true;
            }
            if (d8Var.M && yi4.C) {
                i3 = 0;
            }
            i5++;
        }
        if (d8Var.H && (z6 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = d8Var.N;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            yi4 yi42 = (yi4) arrayList.get(i10);
            int i12 = yi42.y;
            if ((i12 & 2) == i2) {
                z3 = z2;
            } else {
                z3 = false;
            }
            int i13 = yi42.b;
            if (z3) {
                View b = d8Var.b(yi42, (View) null, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                yi42.f(z2);
            } else if ((i12 & true) == z2) {
                boolean z7 = sparseBooleanArray.get(i13);
                if ((i9 > 0 || z7) && i4 > 0) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                if (z4) {
                    View b2 = d8Var.b(yi42, (View) null, viewGroup);
                    b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    if (i4 + i11 > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z4 &= z5;
                }
                if (z4 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z7) {
                    sparseBooleanArray.put(i13, false);
                    int i14 = 0;
                    while (i14 < i10) {
                        yi4 yi43 = (yi4) arrayList.get(i14);
                        if (yi43.b == i13) {
                            if ((yi43.x & 32) == 32) {
                                i9++;
                            }
                            yi43.f(false);
                        }
                        i14++;
                    }
                }
                if (z4) {
                    i9--;
                }
                yi42.f(z4);
            } else {
                yi42.f(false);
                i10++;
                i2 = 2;
                d8Var = this;
                z2 = true;
            }
            i10++;
            i2 = 2;
            d8Var = this;
            z2 = true;
        }
        return z2;
    }

    public final boolean e(yi4 yi4) {
        return false;
    }

    public final void f(qj4 qj4) {
        throw null;
    }

    public final boolean g() {
        tj4 tj4;
        nt2 nt2 = this.Q;
        if (nt2 == null || (tj4 = this.D) == null) {
            a8 a8Var = this.O;
            if (a8Var == null) {
                return false;
            }
            if (a8Var.b()) {
                a8Var.i.dismiss();
            }
            return true;
        }
        ((View) tj4).removeCallbacks(nt2);
        this.Q = null;
        return true;
    }

    public final boolean h(yi4 yi4) {
        return false;
    }

    public final void i() {
        tj4 tj4;
        int i;
        yi4 yi4;
        ViewGroup viewGroup = (ViewGroup) this.D;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            ti4 ti4 = this.y;
            if (ti4 != null) {
                ti4.i();
                ArrayList l = this.y.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    yi4 yi42 = (yi4) l.get(i2);
                    if ((yi42.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof sj4) {
                            yi4 = ((sj4) childAt).getItemData();
                        } else {
                            yi4 = null;
                        }
                        View b = b(yi42, childAt, viewGroup);
                        if (yi42 != yi4) {
                            b.setPressed(false);
                            b.jumpDrawablesToCurrentState();
                        }
                        if (b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b);
                            }
                            ((ViewGroup) this.D).addView(b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.E) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.D).requestLayout();
        ti4 ti42 = this.y;
        if (ti42 != null) {
            ti42.i();
            ArrayList arrayList2 = ti42.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zi4 zi4 = ((yi4) arrayList2.get(i3)).A;
            }
        }
        ti4 ti43 = this.y;
        if (ti43 != null) {
            ti43.i();
            arrayList = ti43.j;
        }
        if (this.H && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((yi4) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        c8 c8Var = this.E;
        if (z2) {
            if (c8Var == null) {
                this.E = new c8(this, this.w);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.E.getParent();
            if (viewGroup3 != this.D) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.E);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.D;
                c8 c8Var2 = this.E;
                actionMenuView.getClass();
                f8 j = ActionMenuView.j();
                j.a = true;
                actionMenuView.addView(c8Var2, j);
            }
        } else if (c8Var != null && c8Var.getParent() == (tj4 = this.D)) {
            ((ViewGroup) tj4).removeView(this.E);
        }
        ((ActionMenuView) this.D).setOverflowReserved(this.H);
    }

    public final boolean j() {
        a8 a8Var = this.O;
        if (a8Var == null || !a8Var.b()) {
            return false;
        }
        return true;
    }

    public final void k(Context context, ti4 ti4) {
        this.x = context;
        LayoutInflater.from(context);
        this.y = ti4;
        Resources resources = context.getResources();
        if (!this.I) {
            this.H = true;
        }
        int i = 2;
        this.J = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.L = i;
        int i4 = this.J;
        if (this.H) {
            if (this.E == null) {
                c8 c8Var = new c8(this, this.w);
                this.E = c8Var;
                if (this.G) {
                    c8Var.setImageDrawable(this.F);
                    this.F = null;
                    this.G = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.E.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.E.getMeasuredWidth();
        } else {
            this.E = null;
        }
        this.K = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean l() {
        ti4 ti4;
        if (this.H && !j() && (ti4 = this.y) != null && this.D != null && this.Q == null) {
            ti4.i();
            if (!ti4.j.isEmpty()) {
                nt2 nt2 = new nt2(this, false, new a8(this, this.x, this.y, (View) this.E), 1);
                this.Q = nt2;
                ((View) this.D).post(nt2);
                return true;
            }
        }
        return false;
    }
}
