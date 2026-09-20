package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import cu.lestebang.utiletecsa.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: am0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class am0 extends gj4 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final boolean A;
    public final Handler B;
    public final ArrayList C = new ArrayList();
    public final ArrayList D = new ArrayList();
    public final mp E = new mp(2, this);
    public final fg F;
    public final f96 G;
    public int H;
    public int I;
    public View J;
    public View K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public qj4 S;
    public ViewTreeObserver T;
    public PopupWindow.OnDismissListener U;
    public boolean V;
    public final Context x;
    public final int y;
    public final int z;

    public am0(Context context, View view, int i, boolean z2) {
        int i2 = 1;
        this.F = new fg(1, this);
        this.G = new f96(10, (Object) this);
        this.H = 0;
        this.I = 0;
        this.x = context;
        this.J = view;
        this.z = i;
        this.A = z2;
        this.Q = false;
        this.L = view.getLayoutDirection() == 1 ? 0 : i2;
        Resources resources = context.getResources();
        this.y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.B = new Handler();
    }

    public final void a(ti4 ti4, boolean z2) {
        int i;
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (ti4 == ((zl0) arrayList.get(i2)).b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < arrayList.size()) {
                ((zl0) arrayList.get(i3)).b.c(false);
            }
            zl0 zl0 = (zl0) arrayList.remove(i2);
            ti4 ti42 = zl0.b;
            mj4 mj4 = zl0.a;
            fp fpVar = mj4.V;
            ti42.r(this);
            if (this.V) {
                jj4.b(fpVar, (Transition) null);
                fpVar.setAnimationStyle(0);
            }
            mj4.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.L = ((zl0) arrayList.get(size2 - 1)).c;
            } else {
                if (this.J.getLayoutDirection() == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                this.L = i;
            }
            if (size2 == 0) {
                dismiss();
                qj4 qj4 = this.S;
                if (qj4 != null) {
                    qj4.a(ti4, true);
                }
                ViewTreeObserver viewTreeObserver = this.T;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.T.removeGlobalOnLayoutListener(this.E);
                    }
                    this.T = null;
                }
                this.K.removeOnAttachStateChangeListener(this.F);
                this.U.onDismiss();
            } else if (z2) {
                ((zl0) arrayList.get(0)).b.c(false);
            }
        }
    }

    public final boolean b() {
        ArrayList arrayList = this.D;
        if (arrayList.size() <= 0 || !((zl0) arrayList.get(0)).a.V.isShowing()) {
            return false;
        }
        return true;
    }

    public final boolean c(i67 i67) {
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            zl0 zl0 = (zl0) it.next();
            if (i67 == zl0.b) {
                zl0.a.y.requestFocus();
                return true;
            }
        }
        if (!i67.hasVisibleItems()) {
            return false;
        }
        l(i67);
        qj4 qj4 = this.S;
        if (qj4 != null) {
            qj4.m(i67);
        }
        return true;
    }

    public final boolean d() {
        return false;
    }

    public final void dismiss() {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        if (size > 0) {
            zl0[] zl0Arr = (zl0[]) arrayList.toArray(new zl0[size]);
            for (int i = size - 1; i >= 0; i--) {
                zl0 zl0 = zl0Arr[i];
                if (zl0.a.V.isShowing()) {
                    zl0.a.dismiss();
                }
            }
        }
    }

    public final void f(qj4 qj4) {
        this.S = qj4;
    }

    public final void g() {
        boolean z2;
        if (!b()) {
            ArrayList arrayList = this.C;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                u((ti4) it.next());
            }
            arrayList.clear();
            View view = this.J;
            this.K = view;
            if (view != null) {
                if (this.T == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.T = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.E);
                }
                this.K.addOnAttachStateChangeListener(this.F);
            }
        }
    }

    public final void i() {
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((zl0) it.next()).a.y.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((qi4) adapter).notifyDataSetChanged();
        }
    }

    public final e02 j() {
        ArrayList arrayList = this.D;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((zl0) b81.k(1, arrayList)).a.y;
    }

    public final void l(ti4 ti4) {
        ti4.b(this, this.x);
        if (b()) {
            u(ti4);
        } else {
            this.C.add(ti4);
        }
    }

    public final void n(View view) {
        if (this.J != view) {
            this.J = view;
            this.I = Gravity.getAbsoluteGravity(this.H, view.getLayoutDirection());
        }
    }

    public final void o(boolean z2) {
        this.Q = z2;
    }

    public final void onDismiss() {
        zl0 zl0;
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                zl0 = null;
                break;
            }
            zl0 = (zl0) arrayList.get(i);
            if (!zl0.a.V.isShowing()) {
                break;
            }
            i++;
        }
        if (zl0 != null) {
            zl0.b.c(false);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i) {
        if (this.H != i) {
            this.H = i;
            this.I = Gravity.getAbsoluteGravity(i, this.J.getLayoutDirection());
        }
    }

    public final void q(int i) {
        this.M = true;
        this.O = i;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.U = onDismissListener;
    }

    public final void s(boolean z2) {
        this.R = z2;
    }

    public final void t(int i) {
        this.N = true;
        this.P = i;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [h84, mj4] */
    /* JADX WARNING: type inference failed for: r17v0 */
    /* JADX WARNING: type inference failed for: r17v4 */
    /* JADX WARNING: type inference failed for: r17v6 */
    /* JADX WARNING: type inference failed for: r17v7 */
    /* JADX WARNING: type inference failed for: r17v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void u(ti4 ti4) {
        ? r17;
        zl0 zl0;
        View view;
        Rect rect;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        MenuItem menuItem;
        int i5;
        qi4 qi4;
        int firstVisiblePosition;
        boolean z3;
        ti4 ti42 = ti4;
        Context context = this.x;
        LayoutInflater from = LayoutInflater.from(context);
        qi4 qi42 = new qi4(ti42, from, this.A, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.Q) {
            qi42.c = true;
        } else if (b()) {
            int size = ti42.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    z3 = false;
                    break;
                }
                MenuItem item = ti42.getItem(i6);
                if (item.isVisible() && item.getIcon() != null) {
                    z3 = true;
                    break;
                }
                i6++;
            }
            qi42.c = z3;
        }
        int m = gj4.m(qi42, context, this.y);
        ? h84 = new h84(context, (AttributeSet) null, this.z, 0);
        h84.Y = this.G;
        h84.L = this;
        fp fpVar = h84.V;
        fpVar.setOnDismissListener(this);
        h84.K = this.J;
        h84.H = this.I;
        h84.U = true;
        fpVar.setFocusable(true);
        fpVar.setInputMethodMode(2);
        h84.q(qi42);
        h84.r(m);
        h84.H = this.I;
        ArrayList arrayList = this.D;
        if (arrayList.size() > 0) {
            zl0 = (zl0) b81.k(1, arrayList);
            ti4 ti43 = zl0.b;
            int size2 = ti43.f.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = ti43.getItem(i7);
                if (menuItem.hasSubMenu() && ti42 == menuItem.getSubMenu()) {
                    break;
                }
                i7++;
            }
            if (menuItem == null) {
                r17 = 0;
                view = null;
            } else {
                e02 e02 = zl0.a.y;
                ListAdapter adapter = e02.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i5 = headerViewListAdapter.getHeadersCount();
                    qi4 = (qi4) headerViewListAdapter.getWrappedAdapter();
                } else {
                    qi4 = (qi4) adapter;
                    i5 = 0;
                }
                int count = qi4.getCount();
                int i8 = 0;
                boolean z4 = false;
                while (true) {
                    if (i8 >= count) {
                        i8 = -1;
                        break;
                    } else if (menuItem == qi4.getItem(i8)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i8 != -1 && (firstVisiblePosition = (i8 + i5) - e02.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < e02.getChildCount()) {
                    view = e02.getChildAt(firstVisiblePosition);
                    r17 = z4;
                } else {
                    view = null;
                    r17 = z4;
                }
            }
        } else {
            r17 = 0;
            view = null;
            zl0 = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = mj4.Z;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[r17] = Boolean.FALSE;
                        method.invoke(fpVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                kj4.a(fpVar, r17);
            }
            jj4.a(fpVar, (Transition) null);
            e02 e022 = ((zl0) arrayList.get(arrayList.size() - 1)).a.y;
            int[] iArr = new int[2];
            e022.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.K.getWindowVisibleDisplayFrame(rect2);
            if (this.L == 1) {
                if (e022.getWidth() + iArr[0] + m > rect2.right) {
                    i = 0;
                }
                i = 1;
            } else {
                if (iArr[0] - m >= 0) {
                    i = 0;
                }
                i = 1;
            }
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.L = i;
            if (Build.VERSION.SDK_INT >= 26) {
                h84.K = view;
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.J.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.I & 7) == 5) {
                    iArr2[0] = this.J.getWidth() + iArr2[0];
                    iArr3[0] = view.getWidth() + iArr3[0];
                }
                i3 = iArr3[1] - iArr2[1];
                i2 = iArr3[0] - iArr2[0];
            }
            if ((this.I & 5) == 5) {
                if (z2) {
                    i4 = i2 + m;
                    h84.B = i4;
                    h84.G = true;
                    h84.F = true;
                    h84.m(i3);
                } else {
                    m = view.getWidth();
                }
            } else if (z2) {
                i4 = i2 + view.getWidth();
                h84.B = i4;
                h84.G = true;
                h84.F = true;
                h84.m(i3);
            }
            i4 = i2 - m;
            h84.B = i4;
            h84.G = true;
            h84.F = true;
            h84.m(i3);
        } else {
            if (this.M) {
                h84.B = this.O;
            }
            if (this.N) {
                h84.m(this.P);
            }
            Rect rect3 = this.w;
            if (rect3 != null) {
                rect = new Rect(rect3);
            } else {
                rect = null;
            }
            h84.T = rect;
        }
        arrayList.add(new zl0(h84, ti42, this.L));
        h84.g();
        e02 e023 = h84.y;
        e023.setOnKeyListener(this);
        if (zl0 == null && this.R && ti42.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, e023, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(ti42.m);
            e023.addHeaderView(frameLayout, (Object) null, false);
            h84.g();
        }
    }
}
