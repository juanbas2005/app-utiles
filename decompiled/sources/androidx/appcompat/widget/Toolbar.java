package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class Toolbar extends ViewGroup {
    public dp A;
    public final Drawable B;
    public final CharSequence C;
    public cp D;
    public View E;
    public Context F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public final int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public oa6 P;
    public int Q;
    public int R;
    public final int S;
    public CharSequence T;
    public CharSequence U;
    public ColorStateList V;
    public ColorStateList W;
    public boolean a0;
    public boolean b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final int[] e0;
    public final cf4 f0;
    public ArrayList g0;
    public final ay4 h0;
    public sj7 i0;
    public d8 j0;
    public mj7 k0;
    public boolean l0;
    public OnBackInvokedCallback m0;
    public OnBackInvokedDispatcher n0;
    public boolean o0;
    public final ge p0;
    public ActionMenuView w;
    public gq x;
    public gq y;
    public cp z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.S = 8388627;
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = new int[2];
        this.f0 = new cf4((Runnable) new kj7(this, 1));
        this.g0 = new ArrayList();
        this.h0 = new ay4(13, this);
        this.p0 = new ge(16, (Object) this);
        Context context2 = getContext();
        int[] iArr = qv5.w;
        cf4 w2 = cf4.w(context2, attributeSet, iArr, R.attr.toolbarStyle);
        e58.l(this, context, iArr, attributeSet, (TypedArray) w2.y, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) w2.y;
        this.H = typedArray.getResourceId(28, 0);
        this.I = typedArray.getResourceId(19, 0);
        this.S = typedArray.getInteger(0, 8388627);
        this.J = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.O = dimensionPixelOffset;
        this.N = dimensionPixelOffset;
        this.M = dimensionPixelOffset;
        this.L = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.L = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.M = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.N = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.O = dimensionPixelOffset5;
        }
        this.K = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        oa6 oa6 = this.P;
        oa6.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            oa6.e = dimensionPixelSize;
            oa6.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            oa6.f = dimensionPixelSize2;
            oa6.b = dimensionPixelSize2;
        }
        if (!(dimensionPixelOffset6 == Integer.MIN_VALUE && dimensionPixelOffset7 == Integer.MIN_VALUE)) {
            oa6.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.Q = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.R = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.B = w2.i(4);
        this.C = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.F = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable i2 = w2.i(16);
        if (i2 != null) {
            setNavigationIcon(i2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable i3 = w2.i(11);
        if (i3 != null) {
            setLogo(i3);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(w2.g(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(w2.g(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        w2.A();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new f87(getContext());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, nj7] */
    public static nj7 h() {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.b = 0;
        marginLayoutParams.a = 8388627;
        return marginLayoutParams;
    }

    public static nj7 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof nj7;
        if (z2) {
            nj7 nj7 = (nj7) layoutParams;
            nj7 nj72 = new nj7(nj7);
            nj72.b = 0;
            nj72.b = nj7.b;
            return nj72;
        } else if (z2) {
            nj7 nj73 = new nj7((nj7) layoutParams);
            nj73.b = 0;
            return nj73;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            nj7 nj74 = new nj7((ViewGroup.LayoutParams) marginLayoutParams);
            nj74.b = 0;
            nj74.leftMargin = marginLayoutParams.leftMargin;
            nj74.topMargin = marginLayoutParams.topMargin;
            nj74.rightMargin = marginLayoutParams.rightMargin;
            nj74.bottomMargin = marginLayoutParams.bottomMargin;
            return nj74;
        } else {
            nj7 nj75 = new nj7(layoutParams);
            nj75.b = 0;
            return nj75;
        }
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z2;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (z2) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                nj7 nj7 = (nj7) childAt.getLayoutParams();
                if (nj7.b == 0 && s(childAt)) {
                    int i3 = nj7.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            nj7 nj72 = (nj7) childAt2.getLayoutParams();
            if (nj72.b == 0 && s(childAt2)) {
                int i5 = nj72.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z2) {
        nj7 nj7;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            nj7 = h();
        } else if (!checkLayoutParams(layoutParams)) {
            nj7 = i(layoutParams);
        } else {
            nj7 = (nj7) layoutParams;
        }
        nj7.b = 1;
        if (!z2 || this.E == null) {
            addView(view, nj7);
            return;
        }
        view.setLayoutParams(nj7);
        this.d0.add(view);
    }

    public final void c() {
        if (this.D == null) {
            cp cpVar = new cp(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.D = cpVar;
            cpVar.setImageDrawable(this.B);
            this.D.setContentDescription(this.C);
            nj7 h = h();
            h.a = (this.J & 112) | 8388611;
            h.b = 2;
            this.D.setLayoutParams(h);
            this.D.setOnClickListener(new r7(3, this));
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof nj7)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [oa6, java.lang.Object] */
    public final void d() {
        if (this.P == null) {
            ? obj = new Object();
            obj.a = 0;
            obj.b = 0;
            obj.c = Integer.MIN_VALUE;
            obj.d = Integer.MIN_VALUE;
            obj.e = 0;
            obj.f = 0;
            obj.g = false;
            obj.h = false;
            this.P = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.w;
        if (actionMenuView.L == null) {
            ti4 ti4 = (ti4) actionMenuView.getMenu();
            if (this.k0 == null) {
                this.k0 = new mj7(this);
            }
            this.w.setExpandedActionViewsExclusive(true);
            ti4.b(this.k0, this.F);
            t();
        }
    }

    public final void f() {
        if (this.w == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.w = actionMenuView;
            actionMenuView.setPopupTheme(this.G);
            this.w.setOnMenuItemClickListener(this.h0);
            ActionMenuView actionMenuView2 = this.w;
            br4 br4 = new br4(18, (Object) this);
            actionMenuView2.getClass();
            actionMenuView2.Q = br4;
            nj7 h = h();
            h.a = (this.J & 112) | 8388613;
            this.w.setLayoutParams(h);
            b(this.w, false);
        }
    }

    public final void g() {
        if (this.z == null) {
            this.z = new cp(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            nj7 h = h();
            h.a = (this.J & 112) | 8388611;
            this.z.setLayoutParams(h);
        }
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, nj7] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qv5.b);
        marginLayoutParams.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.b = 0;
        return marginLayoutParams;
    }

    public CharSequence getCollapseContentDescription() {
        cp cpVar = this.D;
        if (cpVar != null) {
            return cpVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        cp cpVar = this.D;
        if (cpVar != null) {
            return cpVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        oa6 oa6 = this.P;
        if (oa6 == null) {
            return 0;
        }
        if (oa6.g) {
            return oa6.a;
        }
        return oa6.b;
    }

    public int getContentInsetEndWithActions() {
        int i = this.R;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        oa6 oa6 = this.P;
        if (oa6 != null) {
            return oa6.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        oa6 oa6 = this.P;
        if (oa6 != null) {
            return oa6.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        oa6 oa6 = this.P;
        if (oa6 == null) {
            return 0;
        }
        if (oa6.g) {
            return oa6.b;
        }
        return oa6.a;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.Q;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        ti4 ti4;
        ActionMenuView actionMenuView = this.w;
        if (actionMenuView == null || (ti4 = actionMenuView.L) == null || !ti4.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.R, 0));
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.Q, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        dp dpVar = this.A;
        if (dpVar != null) {
            return dpVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        dp dpVar = this.A;
        if (dpVar != null) {
            return dpVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.w.getMenu();
    }

    public View getNavButtonView() {
        return this.z;
    }

    public CharSequence getNavigationContentDescription() {
        cp cpVar = this.z;
        if (cpVar != null) {
            return cpVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        cp cpVar = this.z;
        if (cpVar != null) {
            return cpVar.getDrawable();
        }
        return null;
    }

    public d8 getOuterActionMenuPresenter() {
        return this.j0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.w.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.F;
    }

    public int getPopupTheme() {
        return this.G;
    }

    public CharSequence getSubtitle() {
        return this.U;
    }

    public final TextView getSubtitleTextView() {
        return this.y;
    }

    public CharSequence getTitle() {
        return this.T;
    }

    public int getTitleMarginBottom() {
        return this.O;
    }

    public int getTitleMarginEnd() {
        return this.M;
    }

    public int getTitleMarginStart() {
        return this.L;
    }

    public int getTitleMarginTop() {
        return this.N;
    }

    public final TextView getTitleTextView() {
        return this.x;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [sj7, java.lang.Object] */
    public sk1 getWrapper() {
        boolean z2;
        Drawable drawable;
        if (this.i0 == null) {
            ? obj = new Object();
            obj.n = 0;
            obj.a = this;
            obj.h = getTitle();
            obj.i = getSubtitle();
            if (obj.h != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            obj.g = z2;
            obj.f = getNavigationIcon();
            String str = null;
            cf4 w2 = cf4.w(getContext(), (AttributeSet) null, qv5.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) w2.y;
            obj.o = w2.i(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.g = true;
                obj.h = text;
                if ((obj.b & 8) != 0) {
                    setTitle(text);
                    if (obj.g) {
                        e58.n(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.i = text2;
                if ((obj.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable i = w2.i(20);
            if (i != null) {
                obj.e = i;
                obj.c();
            }
            Drawable i2 = w2.i(17);
            if (i2 != null) {
                obj.d = i2;
                obj.c();
            }
            if (obj.f == null && (drawable = obj.o) != null) {
                obj.f = drawable;
                if ((obj.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, this, false);
                View view = obj.c;
                if (!(view == null || (obj.b & 16) == 0)) {
                    removeView(view);
                }
                obj.c = inflate;
                if (!(inflate == null || (obj.b & 16) == 0)) {
                    addView(inflate);
                }
                obj.a(obj.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.P.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.H = resourceId2;
                gq gqVar = this.x;
                if (gqVar != null) {
                    gqVar.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.I = resourceId3;
                gq gqVar2 = this.y;
                if (gqVar2 != null) {
                    gqVar2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            w2.A();
            if (R.string.abc_action_bar_up_description != obj.n) {
                obj.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = obj.n;
                    if (i3 != 0) {
                        str = getContext().getString(i3);
                    }
                    obj.j = str;
                    obj.b();
                }
            }
            obj.j = getNavigationContentDescription();
            setNavigationOnClickListener(new fg4(obj));
            this.i0 = obj;
        }
        return this.i0;
    }

    public final int j(View view, int i) {
        int i2;
        nj7 nj7 = (nj7) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = nj7.a & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.S & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - nj7.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = nj7.topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = nj7.bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final void m() {
        Iterator it = this.g0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f0.y).iterator();
        while (it2.hasNext()) {
            ((kq2) it2.next()).a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.g0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        if (view.getParent() == this || this.d0.contains(view)) {
            return true;
        }
        return false;
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        nj7 nj7 = (nj7) view.getLayoutParams();
        int i3 = nj7.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + nj7.rightMargin + max;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.p0);
        t();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.b0 = false;
        }
        if (!this.b0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.b0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.b0 = false;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0285 A[LOOP:0: B:105:0x0283->B:106:0x0285, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x029d A[LOOP:1: B:108:0x029b->B:109:0x029d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02bd A[LOOP:2: B:111:0x02bb->B:112:0x02bd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0310 A[LOOP:3: B:119:0x030e->B:120:0x0310, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x020e  */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3;
        int i5;
        int i6;
        int i7;
        int max;
        int i8;
        boolean s;
        boolean s2;
        boolean z4;
        int i9;
        int size;
        int i10;
        int i11;
        int size2;
        int i12;
        int size3;
        int i13;
        int i14;
        int i15;
        int size4;
        gq gqVar;
        gq gqVar2;
        boolean z5;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        if (getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i24 = width - paddingRight;
        int[] iArr = this.e0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = e58.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight >= 0) {
            i5 = Math.min(minimumHeight, i4 - i2);
        } else {
            i5 = 0;
        }
        if (s(this.z)) {
            cp cpVar = this.z;
            if (z3) {
                i6 = p(cpVar, i24, i5, iArr);
                i7 = paddingLeft;
                if (s(this.D)) {
                    cp cpVar2 = this.D;
                    if (z3) {
                        i6 = p(cpVar2, i6, i5, iArr);
                    } else {
                        i7 = o(cpVar2, i7, i5, iArr);
                    }
                }
                if (s(this.w)) {
                    ActionMenuView actionMenuView = this.w;
                    if (z3) {
                        i7 = o(actionMenuView, i7, i5, iArr);
                    } else {
                        i6 = p(actionMenuView, i6, i5, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i7);
                iArr[1] = Math.max(0, currentContentInsetRight - (i24 - i6));
                max = Math.max(i7, currentContentInsetLeft);
                int min = Math.min(i6, i24 - currentContentInsetRight);
                if (s(this.E)) {
                    View view = this.E;
                    if (z3) {
                        min = p(view, min, i5, iArr);
                    } else {
                        max = o(view, max, i5, iArr);
                    }
                }
                if (s(this.A)) {
                    dp dpVar = this.A;
                    if (z3) {
                        min = p(dpVar, min, i5, iArr);
                    } else {
                        max = o(dpVar, max, i5, iArr);
                    }
                }
                s = s(this.x);
                s2 = s(this.y);
                if (!s) {
                    nj7 nj7 = (nj7) this.x.getLayoutParams();
                    z4 = z3;
                    i9 = this.x.getMeasuredHeight() + nj7.topMargin + nj7.bottomMargin;
                } else {
                    z4 = z3;
                    i9 = 0;
                }
                if (!s2) {
                    nj7 nj72 = (nj7) this.y.getLayoutParams();
                    i9 = this.y.getMeasuredHeight() + nj72.topMargin + nj72.bottomMargin + i9;
                } else {
                    int i25 = i9;
                }
                if (s || s2) {
                    if (!s) {
                        gqVar = this.x;
                    } else {
                        gqVar = this.y;
                    }
                    if (!s2) {
                        gqVar2 = this.y;
                    } else {
                        gqVar2 = this.x;
                    }
                    nj7 nj73 = (nj7) gqVar.getLayoutParams();
                    nj7 nj74 = (nj7) gqVar2.getLayoutParams();
                    int i26 = i9;
                    if ((!s || this.x.getMeasuredWidth() <= 0) && (!s2 || this.y.getMeasuredWidth() <= 0)) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    i16 = this.S & 112;
                    int i27 = max;
                    if (i16 == 48) {
                        i17 = getPaddingTop() + nj73.topMargin + this.N;
                    } else if (i16 != 80) {
                        int i28 = (((height - paddingTop) - paddingBottom) - i26) / 2;
                        int i29 = nj73.topMargin + this.N;
                        if (i28 < i29) {
                            i28 = i29;
                        } else {
                            int i30 = (((height - paddingBottom) - i26) - i28) - paddingTop;
                            int i31 = nj73.bottomMargin;
                            int i32 = this.O;
                            if (i30 < i31 + i32) {
                                i28 = Math.max(0, i28 - ((nj74.bottomMargin + i32) - i30));
                            }
                        }
                        i17 = paddingTop + i28;
                    } else {
                        i17 = (((height - paddingBottom) - nj74.bottomMargin) - this.O) - i26;
                    }
                    if (z4) {
                        if (z5) {
                            i21 = this.L;
                        } else {
                            i21 = 0;
                        }
                        int i33 = i21 - iArr[1];
                        i8 -= Math.max(0, i33);
                        iArr[1] = Math.max(0, -i33);
                        if (s) {
                            int measuredWidth = i8 - this.x.getMeasuredWidth();
                            int measuredHeight = this.x.getMeasuredHeight() + i17;
                            this.x.layout(measuredWidth, i17, i8, measuredHeight);
                            i22 = measuredWidth - this.M;
                            i17 = measuredHeight + ((nj7) this.x.getLayoutParams()).bottomMargin;
                        } else {
                            i22 = i8;
                        }
                        if (s2) {
                            int i34 = i17 + ((nj7) this.y.getLayoutParams()).topMargin;
                            this.y.layout(i8 - this.y.getMeasuredWidth(), i34, i8, this.y.getMeasuredHeight() + i34);
                            i23 = i8 - this.M;
                        } else {
                            i23 = i8;
                        }
                        if (z5) {
                            i8 = Math.min(i22, i23);
                        }
                        max = i27;
                    } else {
                        if (z5) {
                            i18 = this.L;
                        } else {
                            i18 = 0;
                        }
                        int i35 = i18 - iArr[0];
                        max = Math.max(0, i35) + i27;
                        iArr[0] = Math.max(0, -i35);
                        if (s) {
                            int measuredWidth2 = this.x.getMeasuredWidth() + max;
                            int measuredHeight2 = this.x.getMeasuredHeight() + i17;
                            this.x.layout(max, i17, measuredWidth2, measuredHeight2);
                            i19 = measuredWidth2 + this.M;
                            i17 = measuredHeight2 + ((nj7) this.x.getLayoutParams()).bottomMargin;
                        } else {
                            i19 = max;
                        }
                        if (s2) {
                            int i36 = i17 + ((nj7) this.y.getLayoutParams()).topMargin;
                            int measuredWidth3 = this.y.getMeasuredWidth() + max;
                            this.y.layout(max, i36, measuredWidth3, this.y.getMeasuredHeight() + i36);
                            i20 = measuredWidth3 + this.M;
                        } else {
                            i20 = max;
                        }
                        if (z5) {
                            max = Math.max(i19, i20);
                        }
                    }
                }
                ArrayList arrayList = this.c0;
                a(3, arrayList);
                size = arrayList.size();
                i10 = max;
                for (i11 = 0; i11 < size; i11++) {
                    i10 = o((View) arrayList.get(i11), i10, i5, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i12 = 0; i12 < size2; i12++) {
                    i8 = p((View) arrayList.get(i12), i8, i5, iArr);
                }
                a(1, arrayList);
                int i37 = iArr[0];
                int i38 = iArr[1];
                size3 = arrayList.size();
                int i39 = i37;
                i13 = 0;
                int i40 = 0;
                while (i13 < size3) {
                    View view2 = (View) arrayList.get(i13);
                    nj7 nj75 = (nj7) view2.getLayoutParams();
                    int i41 = i38;
                    int i42 = nj75.leftMargin - i39;
                    int i43 = nj75.rightMargin - i41;
                    int max2 = Math.max(0, i42);
                    int max3 = Math.max(0, i43);
                    int max4 = Math.max(0, -i42);
                    int max5 = Math.max(0, -i43);
                    i40 += view2.getMeasuredWidth() + max2 + max3;
                    i13++;
                    int i44 = max5;
                    i39 = max4;
                    i38 = i44;
                }
                i15 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i40 / 2);
                int i45 = i40 + i15;
                if (i15 >= i10) {
                    if (i45 > i8) {
                        i10 = i15 - (i45 - i8);
                    } else {
                        i10 = i15;
                    }
                }
                size4 = arrayList.size();
                for (i14 = 0; i14 < size4; i14++) {
                    i10 = o((View) arrayList.get(i14), i10, i5, iArr);
                }
                arrayList.clear();
            }
            i7 = o(cpVar, paddingLeft, i5, iArr);
        } else {
            i7 = paddingLeft;
        }
        i6 = i24;
        if (s(this.D)) {
        }
        if (s(this.w)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i7);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - i6));
        max = Math.max(i7, currentContentInsetLeft2);
        int min2 = Math.min(i6, i24 - currentContentInsetRight2);
        if (s(this.E)) {
        }
        if (s(this.A)) {
        }
        s = s(this.x);
        s2 = s(this.y);
        if (!s) {
        }
        if (!s2) {
        }
        if (!s) {
        }
        if (!s2) {
        }
        nj7 nj732 = (nj7) gqVar.getLayoutParams();
        nj7 nj742 = (nj7) gqVar2.getLayoutParams();
        int i262 = i9;
        if (!s || this.x.getMeasuredWidth() <= 0) {
            z5 = false;
            i16 = this.S & 112;
            int i272 = max;
            if (i16 == 48) {
            }
            if (z4) {
            }
            ArrayList arrayList2 = this.c0;
            a(3, arrayList2);
            size = arrayList2.size();
            i10 = max;
            while (i11 < size) {
            }
            a(5, arrayList2);
            size2 = arrayList2.size();
            while (i12 < size2) {
            }
            a(1, arrayList2);
            int i372 = iArr[0];
            int i382 = iArr[1];
            size3 = arrayList2.size();
            int i392 = i372;
            i13 = 0;
            int i402 = 0;
            while (i13 < size3) {
            }
            i15 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i402 / 2);
            int i452 = i402 + i15;
            if (i15 >= i10) {
            }
            size4 = arrayList2.size();
            while (i14 < size4) {
            }
            arrayList2.clear();
        }
        z5 = true;
        i16 = this.S & 112;
        int i2722 = max;
        if (i16 == 48) {
        }
        if (z4) {
        }
        ArrayList arrayList22 = this.c0;
        a(3, arrayList22);
        size = arrayList22.size();
        i10 = max;
        while (i11 < size) {
        }
        a(5, arrayList22);
        size2 = arrayList22.size();
        while (i12 < size2) {
        }
        a(1, arrayList22);
        int i3722 = iArr[0];
        int i3822 = iArr[1];
        size3 = arrayList22.size();
        int i3922 = i3722;
        i13 = 0;
        int i4022 = 0;
        while (i13 < size3) {
        }
        i15 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i4022 / 2);
        int i4522 = i4022 + i15;
        if (i15 >= i10) {
        }
        size4 = arrayList22.size();
        while (i14 < size4) {
        }
        arrayList22.clear();
    }

    public final void onMeasure(int i, int i2) {
        char c;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3 = o68.a;
        int i11 = 0;
        if (getLayoutDirection() == 1) {
            z2 = true;
            c = 0;
        } else {
            c = 1;
            z2 = false;
        }
        if (s(this.z)) {
            r(this.z, i, 0, i2, this.K);
            i5 = k(this.z) + this.z.getMeasuredWidth();
            i4 = Math.max(0, l(this.z) + this.z.getMeasuredHeight());
            i3 = View.combineMeasuredStates(0, this.z.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (s(this.D)) {
            r(this.D, i, 0, i2, this.K);
            i5 = k(this.D) + this.D.getMeasuredWidth();
            i4 = Math.max(i4, l(this.D) + this.D.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.D.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5);
        int max2 = Math.max(0, currentContentInsetStart - i5);
        char c2 = z2;
        int[] iArr = this.e0;
        iArr[c2] = max2;
        if (s(this.w)) {
            r(this.w, i, max, i2, this.K);
            i6 = k(this.w) + this.w.getMeasuredWidth();
            i4 = Math.max(i4, l(this.w) + this.w.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.w.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (s(this.E)) {
            max3 += q(this.E, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.E) + this.E.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.E.getMeasuredState());
        }
        if (s(this.A)) {
            max3 += q(this.A, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.A) + this.A.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.A.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((nj7) childAt.getLayoutParams()).b != 0 || !s(childAt)) {
                i7 = i7;
            } else {
                i7 += q(childAt, i, i7, i2, 0, iArr);
                int max4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
                i4 = max4;
            }
        }
        int i13 = i7;
        int i14 = this.N + this.O;
        int i15 = this.L + this.M;
        if (s(this.x)) {
            q(this.x, i, i13 + i15, i2, i14, iArr);
            int k = k(this.x) + this.x.getMeasuredWidth();
            i9 = l(this.x) + this.x.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i3, this.x.getMeasuredState());
            i10 = k;
        } else {
            i9 = 0;
            i8 = i3;
            i10 = 0;
        }
        if (s(this.y)) {
            i10 = Math.max(i10, q(this.y, i, i13 + i15, i2, i14 + i9, iArr));
            i9 += l(this.y) + this.y.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.y.getMeasuredState());
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + Math.max(i4, i9);
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i13 + i10, getSuggestedMinimumWidth()), i, -16777216 & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.l0) {
            int childCount2 = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i16);
                if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i16++;
            }
            setMeasuredDimension(resolveSizeAndState, i11);
        }
        i11 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ti4 ti4;
        MenuItem findItem;
        if (!(parcelable instanceof pj7)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pj7 pj7 = (pj7) parcelable;
        super.onRestoreInstanceState(pj7.w);
        ActionMenuView actionMenuView = this.w;
        if (actionMenuView != null) {
            ti4 = actionMenuView.L;
        } else {
            ti4 = null;
        }
        int i = pj7.y;
        if (!(i == 0 || this.k0 == null || ti4 == null || (findItem = ti4.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (pj7.z) {
            ge geVar = this.p0;
            removeCallbacks(geVar);
            post(geVar);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        oa6 oa6 = this.P;
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        if (z2 != oa6.g) {
            oa6.g = z2;
            if (!oa6.h) {
                oa6.a = oa6.e;
                oa6.b = oa6.f;
            } else if (z2) {
                int i2 = oa6.d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = oa6.e;
                }
                oa6.a = i2;
                int i3 = oa6.c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = oa6.f;
                }
                oa6.b = i3;
            } else {
                int i4 = oa6.c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = oa6.e;
                }
                oa6.a = i4;
                int i5 = oa6.d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = oa6.f;
                }
                oa6.b = i5;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, x, pj7] */
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        d8 d8Var;
        yi4 yi4;
        ? xVar = new x(super.onSaveInstanceState());
        mj7 mj7 = this.k0;
        if (!(mj7 == null || (yi4 = mj7.x) == null)) {
            xVar.y = yi4.a;
        }
        ActionMenuView actionMenuView = this.w;
        if (actionMenuView == null || (d8Var = actionMenuView.P) == null || !d8Var.j()) {
            z2 = false;
        } else {
            z2 = true;
        }
        xVar.z = z2;
        return xVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a0 = false;
        }
        if (!this.a0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.a0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.a0 = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        nj7 nj7 = (nj7) view.getLayoutParams();
        int i3 = nj7.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + nj7.leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.o0 != z2) {
            this.o0 = z2;
            t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        cp cpVar = this.D;
        if (cpVar != null) {
            cpVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.D.setImageDrawable(drawable);
            return;
        }
        cp cpVar = this.D;
        if (cpVar != null) {
            cpVar.setImageDrawable(this.B);
        }
    }

    public void setCollapsible(boolean z2) {
        this.l0 = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.R) {
            this.R = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.Q) {
            this.Q = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        dp dpVar = this.A;
        if (drawable != null) {
            if (dpVar == null) {
                this.A = new dp(getContext(), (AttributeSet) null, 0);
            }
            if (!n(this.A)) {
                b(this.A, true);
            }
        } else if (dpVar != null && n(dpVar)) {
            removeView(this.A);
            this.d0.remove(this.A);
        }
        dp dpVar2 = this.A;
        if (dpVar2 != null) {
            dpVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.A == null) {
            this.A = new dp(getContext(), (AttributeSet) null, 0);
        }
        dp dpVar = this.A;
        if (dpVar != null) {
            dpVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        cp cpVar = this.z;
        if (cpVar != null) {
            cpVar.setContentDescription(charSequence);
            t35.C(this.z, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.z)) {
                b(this.z, true);
            }
        } else {
            cp cpVar = this.z;
            if (cpVar != null && n(cpVar)) {
                removeView(this.z);
                this.d0.remove(this.z);
            }
        }
        cp cpVar2 = this.z;
        if (cpVar2 != null) {
            cpVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.z.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.w.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.G != i) {
            this.G = i;
            if (i == 0) {
                this.F = getContext();
            } else {
                this.F = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        gq gqVar = this.y;
        if (!isEmpty) {
            if (gqVar == null) {
                Context context = getContext();
                gq gqVar2 = new gq(context, (AttributeSet) null);
                this.y = gqVar2;
                gqVar2.setSingleLine();
                this.y.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.I;
                if (i != 0) {
                    this.y.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.W;
                if (colorStateList != null) {
                    this.y.setTextColor(colorStateList);
                }
            }
            if (!n(this.y)) {
                b(this.y, true);
            }
        } else if (gqVar != null && n(gqVar)) {
            removeView(this.y);
            this.d0.remove(this.y);
        }
        gq gqVar3 = this.y;
        if (gqVar3 != null) {
            gqVar3.setText(charSequence);
        }
        this.U = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.W = colorStateList;
        gq gqVar = this.y;
        if (gqVar != null) {
            gqVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        gq gqVar = this.x;
        if (!isEmpty) {
            if (gqVar == null) {
                Context context = getContext();
                gq gqVar2 = new gq(context, (AttributeSet) null);
                this.x = gqVar2;
                gqVar2.setSingleLine();
                this.x.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.H;
                if (i != 0) {
                    this.x.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.V;
                if (colorStateList != null) {
                    this.x.setTextColor(colorStateList);
                }
            }
            if (!n(this.x)) {
                b(this.x, true);
            }
        } else if (gqVar != null && n(gqVar)) {
            removeView(this.x);
            this.d0.remove(this.x);
        }
        gq gqVar3 = this.x;
        if (gqVar3 != null) {
            gqVar3.setText(charSequence);
        }
        this.T = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.O = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.M = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.L = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.N = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.V = colorStateList;
        gq gqVar = this.x;
        if (gqVar != null) {
            gqVar.setTextColor(colorStateList);
        }
    }

    public final void t() {
        boolean z2;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = lj7.a(this);
            mj7 mj7 = this.k0;
            if (mj7 == null || mj7.x == null || a == null || !isAttachedToWindow() || !this.o0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && this.n0 == null) {
                if (this.m0 == null) {
                    this.m0 = lj7.b(new kj7(this, 0));
                }
                lj7.c(a, this.m0);
                this.n0 = a;
            } else if (!z2 && (onBackInvokedDispatcher = this.n0) != null) {
                lj7.d(onBackInvokedDispatcher, this.m0);
                this.n0 = null;
            }
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(rc9.N(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setOnMenuItemClickListener(oj7 oj7) {
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(rc9.N(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(rc9.N(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
