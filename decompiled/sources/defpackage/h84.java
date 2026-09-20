package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: h84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class h84 implements qs6 {
    public static final Method W;
    public static final Method X;
    public int A = -2;
    public int B;
    public int C;
    public final int D = 1002;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H = 0;
    public final int I = Integer.MAX_VALUE;
    public e84 J;
    public View K;
    public AdapterView.OnItemClickListener L;
    public AdapterView.OnItemSelectedListener M;
    public final d84 N = new d84(this, 1);
    public final g84 O = new g84(0, this);
    public final f84 P = new f84(this);
    public final d84 Q = new d84(this, 0);
    public final Handler R;
    public final Rect S = new Rect();
    public Rect T;
    public boolean U;
    public final fp V;
    public final Context w;
    public ListAdapter x;
    public e02 y;
    public final int z = -2;

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                W = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                X = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [android.widget.PopupWindow, fp] */
    public h84(Context context, AttributeSet attributeSet, int i, int i2) {
        Drawable drawable;
        int resourceId;
        this.w = context;
        this.R = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qv5.o, i, 0);
        this.B = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.C = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.E = true;
        }
        obtainStyledAttributes.recycle();
        ? popupWindow = new PopupWindow(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, qv5.s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes2.getDrawable(0);
        } else {
            drawable = rc9.N(context, resourceId);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.V = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public e02 a(Context context, boolean z2) {
        return new e02(context, z2);
    }

    public final boolean b() {
        return this.V.isShowing();
    }

    public final int c() {
        return this.B;
    }

    public final void dismiss() {
        fp fpVar = this.V;
        fpVar.dismiss();
        fpVar.setContentView((View) null);
        this.y = null;
        this.R.removeCallbacks(this.N);
    }

    public final void e(int i) {
        this.B = i;
    }

    public final void g() {
        int i;
        boolean z2;
        int i2;
        boolean z3;
        e02 e02;
        int i3;
        int i4;
        int i5;
        int i6;
        e02 e022 = this.y;
        Context context = this.w;
        fp fpVar = this.V;
        if (e022 == null) {
            e02 a = a(context, !this.U);
            this.y = a;
            a.setAdapter(this.x);
            this.y.setOnItemClickListener(this.L);
            this.y.setFocusable(true);
            this.y.setFocusableInTouchMode(true);
            this.y.setOnItemSelectedListener(new a84(this));
            this.y.setOnScrollListener(this.P);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.M;
            if (onItemSelectedListener != null) {
                this.y.setOnItemSelectedListener(onItemSelectedListener);
            }
            fpVar.setContentView(this.y);
        } else {
            ViewGroup viewGroup = (ViewGroup) fpVar.getContentView();
        }
        Drawable background = fpVar.getBackground();
        Rect rect = this.S;
        int i7 = 0;
        if (background != null) {
            background.getPadding(rect);
            int i8 = rect.top;
            i = rect.bottom + i8;
            if (!this.E) {
                this.C = -i8;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (fpVar.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        int a2 = b84.a(fpVar, this.K, this.C, z2);
        int i9 = this.z;
        if (i9 == -1) {
            i2 = a2 + i;
        } else {
            int i10 = this.A;
            if (i10 == -2) {
                i5 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            } else if (i10 != -1) {
                i5 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            } else {
                i5 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            }
            int a3 = this.y.a(i5, a2);
            if (a3 > 0) {
                i6 = this.y.getPaddingBottom() + this.y.getPaddingTop() + i;
            } else {
                i6 = 0;
            }
            i2 = a3 + i6;
        }
        if (fpVar.getInputMethodMode() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        fpVar.setWindowLayoutType(this.D);
        if (!fpVar.isShowing()) {
            int i11 = this.A;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.K.getWidth();
            }
            if (i9 == -1) {
                i9 = -1;
            } else if (i9 == -2) {
                i9 = i2;
            }
            fpVar.setWidth(i11);
            fpVar.setHeight(i9);
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = W;
                if (method != null) {
                    try {
                        method.invoke(fpVar, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    }
                }
            } else {
                c84.b(fpVar, true);
            }
            fpVar.setOutsideTouchable(true);
            fpVar.setTouchInterceptor(this.O);
            if (this.G) {
                fpVar.setOverlapAnchor(this.F);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method2 = X;
                if (method2 != null) {
                    try {
                        method2.invoke(fpVar, new Object[]{this.T});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                c84.a(fpVar, this.T);
            }
            fpVar.showAsDropDown(this.K, this.B, this.C, this.H);
            this.y.setSelection(-1);
            if ((!this.U || this.y.isInTouchMode()) && (e02 = this.y) != null) {
                e02.setListSelectionHidden(true);
                e02.requestLayout();
            }
            if (!this.U) {
                this.R.post(this.Q);
            }
        } else if (this.K.isAttachedToWindow()) {
            int i12 = this.A;
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = this.K.getWidth();
            }
            if (i9 == -1) {
                if (z3) {
                    i9 = i2;
                } else {
                    i9 = -1;
                }
                int i13 = this.A;
                if (z3) {
                    if (i13 == -1) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    fpVar.setWidth(i4);
                    fpVar.setHeight(0);
                } else {
                    if (i13 == -1) {
                        i7 = -1;
                    }
                    fpVar.setWidth(i7);
                    fpVar.setHeight(-1);
                }
            } else if (i9 == -2) {
                i9 = i2;
            }
            fpVar.setOutsideTouchable(true);
            int i14 = i12;
            View view = this.K;
            int i15 = this.B;
            int i16 = this.C;
            if (i14 < 0) {
                i3 = -1;
            } else {
                i3 = i14;
            }
            if (i9 < 0) {
                i9 = -1;
            }
            fpVar.update(view, i15, i16, i3, i9);
        }
    }

    public final Drawable h() {
        return this.V.getBackground();
    }

    public final e02 j() {
        return this.y;
    }

    public final void k(Drawable drawable) {
        this.V.setBackgroundDrawable(drawable);
    }

    public final void m(int i) {
        this.C = i;
        this.E = true;
    }

    public final int p() {
        if (!this.E) {
            return 0;
        }
        return this.C;
    }

    public void q(ListAdapter listAdapter) {
        e84 e84 = this.J;
        if (e84 == null) {
            this.J = new e84(this);
        } else {
            ListAdapter listAdapter2 = this.x;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(e84);
            }
        }
        this.x = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.J);
        }
        e02 e02 = this.y;
        if (e02 != null) {
            e02.setAdapter(this.x);
        }
    }

    public final void r(int i) {
        Drawable background = this.V.getBackground();
        if (background != null) {
            Rect rect = this.S;
            background.getPadding(rect);
            this.A = rect.left + rect.right + i;
            return;
        }
        this.A = i;
    }
}
