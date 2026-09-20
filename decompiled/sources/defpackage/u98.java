package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import cu.lestebang.utiletecsa.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: u98  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u98 implements u7 {
    public static final DecelerateInterpolator A = new DecelerateInterpolator();
    public static final AccelerateInterpolator z = new AccelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public sk1 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public t98 i;
    public t98 j;
    public qc3 k;
    public boolean l;
    public final ArrayList m = new ArrayList();
    public int n = 0;
    public boolean o = true;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s = true;
    public d68 t;
    public boolean u;
    public boolean v;
    public final s98 w = new s98(this, 0);
    public final s98 x = new s98(this, 1);
    public final rg4 y = new rg4(14, (Object) this);

    public u98(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (!z2) {
            this.g = decorView.findViewById(16908290);
        }
    }

    public final void a(boolean z2) {
        c68 c68;
        c68 c682;
        long j2;
        boolean z3 = this.r;
        if (z2) {
            if (!z3) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                e(false);
            }
        } else if (z3) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            e(false);
        }
        boolean isLaidOut = this.d.isLaidOut();
        sk1 sk1 = this.e;
        if (isLaidOut) {
            if (z2) {
                sj7 sj7 = (sj7) sk1;
                c68 = e58.a(sj7.a);
                c68.a(0.0f);
                c68.c(100);
                c68.d(new rj7(sj7, 4));
                c682 = this.f.i(200, 0);
            } else {
                sj7 sj72 = (sj7) sk1;
                c68 a2 = e58.a(sj72.a);
                a2.a(1.0f);
                a2.c(200);
                a2.d(new rj7(sj72, 0));
                c68 c683 = a2;
                c68 = this.f.i(100, 8);
                c682 = c683;
            }
            d68 d68 = new d68();
            ArrayList arrayList = d68.a;
            arrayList.add(c68);
            View view = (View) c68.a.get();
            if (view != null) {
                j2 = view.animate().getDuration();
            } else {
                j2 = 0;
            }
            View view2 = (View) c682.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j2);
            }
            arrayList.add(c682);
            d68.b();
        } else if (z2) {
            ((sj7) sk1).a.setVisibility(4);
            this.f.setVisibility(0);
        } else {
            ((sj7) sk1).a.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    public final Context b() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.b = new ContextThemeWrapper(this.a, i2);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    public final void c(View view) {
        sk1 sk1;
        boolean z2;
        String str;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof sk1) {
            sk1 = (sk1) findViewById;
        } else if (findViewById instanceof Toolbar) {
            sk1 = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.e = sk1;
        this.f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.d = actionBarContainer;
        sk1 sk12 = this.e;
        if (sk12 == null || this.f == null || actionBarContainer == null) {
            h.s(u98.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((sj7) sk12).a.getContext();
        this.a = context;
        if ((((sj7) this.e).b & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.h = true;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        d(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes((AttributeSet) null, qv5.a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2.C) {
                this.v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                h.s("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = e58.a;
            actionBarContainer2.setElevation((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void d(boolean z2) {
        if (!z2) {
            ((sj7) this.e).getClass();
            this.d.setTabContainer((ai6) null);
        } else {
            this.d.setTabContainer((ai6) null);
            ((sj7) this.e).getClass();
        }
        ((sj7) this.e).getClass();
        ((sj7) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void e(boolean z2) {
        boolean z3;
        boolean z4 = this.p;
        boolean z5 = this.q;
        if (!this.r && (z4 || z5)) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z6 = this.s;
        j02 j02 = null;
        rg4 rg4 = this.y;
        View view = this.g;
        if (z3) {
            if (!z6) {
                this.s = true;
                d68 d68 = this.t;
                if (d68 != null) {
                    d68.a();
                }
                this.d.setVisibility(0);
                int i2 = this.n;
                s98 s98 = this.x;
                if (i2 != 0 || (!this.u && !z2)) {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.o && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    s98.c();
                } else {
                    this.d.setTranslationY(0.0f);
                    float f2 = (float) (-this.d.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.d.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.d.setTranslationY(f2);
                    d68 d682 = new d68();
                    c68 a2 = e58.a(this.d);
                    a2.e(0.0f);
                    View view2 = (View) a2.a.get();
                    if (view2 != null) {
                        if (rg4 != null) {
                            j02 = new j02(rg4, view2);
                        }
                        view2.animate().setUpdateListener(j02);
                    }
                    boolean z7 = d682.e;
                    ArrayList arrayList = d682.a;
                    if (!z7) {
                        arrayList.add(a2);
                    }
                    if (this.o && view != null) {
                        view.setTranslationY(f2);
                        c68 a3 = e58.a(view);
                        a3.e(0.0f);
                        if (!d682.e) {
                            arrayList.add(a3);
                        }
                    }
                    boolean z8 = d682.e;
                    if (!z8) {
                        d682.c = A;
                    }
                    if (!z8) {
                        d682.b = 250;
                    }
                    if (!z8) {
                        d682.d = s98;
                    }
                    this.t = d682;
                    d682.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = e58.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        } else if (z6) {
            this.s = false;
            d68 d683 = this.t;
            if (d683 != null) {
                d683.a();
            }
            int i3 = this.n;
            s98 s982 = this.w;
            if (i3 != 0 || (!this.u && !z2)) {
                s982.c();
                return;
            }
            this.d.setAlpha(1.0f);
            this.d.setTransitioning(true);
            d68 d684 = new d68();
            float f3 = (float) (-this.d.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            c68 a4 = e58.a(this.d);
            a4.e(f3);
            View view3 = (View) a4.a.get();
            if (view3 != null) {
                if (rg4 != null) {
                    j02 = new j02(rg4, view3);
                }
                view3.animate().setUpdateListener(j02);
            }
            boolean z9 = d684.e;
            ArrayList arrayList2 = d684.a;
            if (!z9) {
                arrayList2.add(a4);
            }
            if (this.o && view != null) {
                c68 a5 = e58.a(view);
                a5.e(f3);
                if (!d684.e) {
                    arrayList2.add(a5);
                }
            }
            boolean z10 = d684.e;
            if (!z10) {
                d684.c = z;
            }
            if (!z10) {
                d684.b = 250;
            }
            if (!z10) {
                d684.d = s982;
            }
            this.t = d684;
            d684.b();
        }
    }

    public u98(Dialog dialog) {
        new ArrayList();
        c(dialog.getWindow().getDecorView());
    }
}
