package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: wo  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wo extends ko implements ri4, LayoutInflater.Factory2 {
    public static final zt6 D0 = new zt6(0);
    public static final int[] E0 = {16842836};
    public static final boolean F0 = (!"robolectric".equals(Build.FINGERPRINT));
    public oq A0;
    public OnBackInvokedDispatcher B0;
    public OnBackInvokedCallback C0;
    public final Object F;
    public final Context G;
    public Window H;
    public ro I;
    public u98 J;
    public f87 K;
    public CharSequence L;
    public ActionBarOverlayLayout M;
    public f96 N;
    public wv2 O;
    public h8 P;
    public ActionBarContextView Q;
    public PopupWindow R;
    public lo S;
    public c68 T = null;
    public final boolean U = true;
    public boolean V;
    public ViewGroup W;
    public TextView X;
    public View Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public vo[] h0;
    public vo i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public Configuration n0;
    public final int o0 = -100;
    public int p0;
    public int q0;
    public boolean r0;
    public so s0;
    public so t0;
    public boolean u0;
    public int v0;
    public final lo w0 = new lo(this, 0);
    public boolean x0;
    public Rect y0;
    public Rect z0;

    public wo(Context context, Window window, co coVar, Object obj) {
        yn ynVar = null;
        this.G = context;
        this.F = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof yn)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        ynVar = (yn) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (ynVar != null) {
                this.o0 = ((wo) ynVar.r()).o0;
            }
        }
        if (this.o0 == -100) {
            String name = this.F.getClass().getName();
            zt6 zt6 = D0;
            Integer num = (Integer) zt6.get(name);
            if (num != null) {
                this.o0 = num.intValue();
                zt6.remove(this.F.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        yo.d();
    }

    public static za4 q(Context context) {
        za4 za4;
        za4 za42;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (za4 = ko.y) == null) {
            return null;
        }
        ab4 ab4 = za4.a;
        za4 b = oo.b(context.getApplicationContext().getResources().getConfiguration());
        if (za4.b()) {
            za42 = za4.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                if (i >= b.a.a.size() + ab4.a.size()) {
                    break;
                }
                if (i < ab4.a.size()) {
                    locale = ab4.a.get(i);
                } else {
                    locale = b.a.a.get(i - ab4.a.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            za42 = new za4(new ab4(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (za42.b()) {
            return b;
        }
        return za42;
    }

    public static Configuration v(Context context, int i, za4 za4, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i == 2) {
            i2 = 32;
        } else if (z) {
            i2 = 0;
        } else {
            i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        if (za4 != null) {
            oo.d(configuration2, za4);
        }
        return configuration2;
    }

    public final f1 A(Context context) {
        if (this.s0 == null) {
            if (cf4.A == null) {
                Context applicationContext = context.getApplicationContext();
                cf4.A = new cf4(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.s0 = new so(this, cf4.A);
        }
        return this.s0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: vo[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: vo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: vo[]} */
    /* JADX WARNING: type inference failed for: r4v2, types: [vo, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final vo B(int i) {
        vo[] voVarArr = this.h0;
        if (voVarArr == null || voVarArr.length <= i) {
            vo[] voVarArr2 = new vo[(i + 1)];
            if (voVarArr != null) {
                System.arraycopy(voVarArr, 0, voVarArr2, 0, voVarArr.length);
            }
            this.h0 = voVarArr2;
            voVarArr = voVarArr2;
        }
        vo voVar = voVarArr[i];
        if (voVar != 0) {
            return voVar;
        }
        ? obj = new Object();
        obj.a = i;
        obj.n = false;
        voVarArr[i] = obj;
        return obj;
    }

    public final void C() {
        int i;
        y();
        if (this.b0 && this.J == null) {
            Object obj = this.F;
            if (obj instanceof Activity) {
                this.J = new u98((Activity) obj, this.c0);
            } else if (obj instanceof Dialog) {
                this.J = new u98((Dialog) obj);
            }
            u98 u98 = this.J;
            if (u98 != null) {
                boolean z = this.x0;
                if (!u98.h) {
                    if (z) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    sj7 sj7 = (sj7) u98.e;
                    int i2 = sj7.b;
                    u98.h = true;
                    sj7.a((i & 4) | (i2 & -5));
                }
            }
        }
    }

    public final void D(int i) {
        this.v0 = (1 << i) | this.v0;
        if (!this.u0) {
            View decorView = this.H.getDecorView();
            WeakHashMap weakHashMap = e58.a;
            decorView.postOnAnimation(this.w0);
            this.u0 = true;
        }
    }

    public final int E(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (!(i == 1 || i == 2)) {
                        if (i == 3) {
                            if (this.t0 == null) {
                                this.t0 = new so(this, context);
                            }
                            return this.t0.f();
                        }
                        h.s("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        return 0;
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return A(context).f();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean F() {
        sk1 sk1;
        mj7 mj7;
        yi4 yi4;
        boolean z = this.j0;
        this.j0 = false;
        vo B = B(0);
        if (!B.m) {
            h8 h8Var = this.P;
            if (h8Var != null) {
                h8Var.b();
                return true;
            }
            C();
            u98 u98 = this.J;
            if (u98 == null || (sk1 = u98.e) == null || (mj7 = ((sj7) sk1).a.k0) == null || mj7.x == null) {
                return false;
            }
            mj7 mj72 = ((sj7) sk1).a.k0;
            if (mj72 == null) {
                yi4 = null;
            } else {
                yi4 = mj72.x;
            }
            if (yi4 != null) {
                yi4.collapseActionView();
            }
        } else if (!z) {
            u(B, true);
            return true;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0156, code lost:
        if (r2 != null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0176, code lost:
        if (r2.B.getCount() > 0) goto L_0x0178;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    public final void G(vo voVar, KeyEvent keyEvent) {
        int i;
        Context context;
        ViewGroup.LayoutParams layoutParams;
        vo voVar2 = voVar;
        boolean z = voVar2.m;
        int i2 = voVar2.a;
        if (!z && !this.m0) {
            Context context2 = this.G;
            if (i2 != 0 || (context2.getResources().getConfiguration().screenLayout & 15) != 4) {
                Window.Callback callback = this.H.getCallback();
                if (callback == null || callback.onMenuOpened(i2, voVar2.h)) {
                    WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                    if (windowManager != null && I(voVar, keyEvent)) {
                        uo uoVar = voVar2.e;
                        if (uoVar == null || voVar2.n) {
                            if (uoVar == null) {
                                C();
                                u98 u98 = this.J;
                                if (u98 != null) {
                                    context = u98.b();
                                } else {
                                    context = null;
                                }
                                if (context != null) {
                                    context2 = context;
                                }
                                TypedValue typedValue = new TypedValue();
                                Resources.Theme newTheme = context2.getResources().newTheme();
                                newTheme.setTo(context2.getTheme());
                                newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
                                int i3 = typedValue.resourceId;
                                if (i3 != 0) {
                                    newTheme.applyStyle(i3, true);
                                }
                                newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
                                int i4 = typedValue.resourceId;
                                if (i4 != 0) {
                                    newTheme.applyStyle(i4, true);
                                } else {
                                    newTheme.applyStyle(2131886685, true);
                                }
                                d61 d61 = new d61(context2, 0);
                                d61.getTheme().setTo(newTheme);
                                voVar2.j = d61;
                                TypedArray obtainStyledAttributes = d61.obtainStyledAttributes(qv5.j);
                                voVar2.b = obtainStyledAttributes.getResourceId(86, 0);
                                voVar2.d = obtainStyledAttributes.getResourceId(1, 0);
                                obtainStyledAttributes.recycle();
                                voVar2.e = new uo(this, voVar2.j);
                                voVar2.c = 81;
                            } else if (voVar2.n && uoVar.getChildCount() > 0) {
                                voVar2.e.removeAllViews();
                            }
                            View view = voVar2.g;
                            if (view != null) {
                                voVar2.f = view;
                            } else {
                                if (voVar2.h != null) {
                                    if (this.O == null) {
                                        this.O = new wv2(3, this);
                                    }
                                    wv2 wv2 = this.O;
                                    if (voVar2.i == null) {
                                        z74 z74 = new z74(voVar2.j);
                                        voVar2.i = z74;
                                        z74.A = wv2;
                                        ti4 ti4 = voVar2.h;
                                        ti4.b(z74, ti4.a);
                                    }
                                    z74 z742 = voVar2.i;
                                    uo uoVar2 = voVar2.e;
                                    if (z742.z == null) {
                                        z742.z = (ExpandedMenuView) z742.x.inflate(R.layout.abc_expanded_menu_layout, uoVar2, false);
                                        if (z742.B == null) {
                                            z742.B = new y74(z742);
                                        }
                                        z742.z.setAdapter(z742.B);
                                        z742.z.setOnItemClickListener(z742);
                                    }
                                    ExpandedMenuView expandedMenuView = z742.z;
                                    voVar2.f = expandedMenuView;
                                }
                                voVar2.n = true;
                                return;
                            }
                            if (voVar2.f != null) {
                                if (voVar2.g == null) {
                                    z74 z743 = voVar2.i;
                                    if (z743.B == null) {
                                        z743.B = new y74(z743);
                                    }
                                }
                                ViewGroup.LayoutParams layoutParams2 = voVar2.f.getLayoutParams();
                                if (layoutParams2 == null) {
                                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                                }
                                voVar2.e.setBackgroundResource(voVar2.b);
                                ViewParent parent = voVar2.f.getParent();
                                if (parent instanceof ViewGroup) {
                                    ((ViewGroup) parent).removeView(voVar2.f);
                                }
                                voVar2.e.addView(voVar2.f, layoutParams2);
                                if (!voVar2.f.hasFocus()) {
                                    voVar2.f.requestFocus();
                                }
                            }
                            voVar2.n = true;
                            return;
                        }
                        View view2 = voVar2.g;
                        if (!(view2 == null || (layoutParams = view2.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            voVar2.l = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                            layoutParams3.gravity = voVar2.c;
                            layoutParams3.windowAnimations = voVar2.d;
                            windowManager.addView(voVar2.e, layoutParams3);
                            voVar2.m = true;
                            if (i2 != 0) {
                                K();
                                return;
                            }
                            return;
                        }
                        i = -2;
                        voVar2.l = false;
                        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                        layoutParams32.gravity = voVar2.c;
                        layoutParams32.windowAnimations = voVar2.d;
                        windowManager.addView(voVar2.e, layoutParams32);
                        voVar2.m = true;
                        if (i2 != 0) {
                        }
                    }
                } else {
                    u(voVar2, true);
                }
            }
        }
    }

    public final boolean H(vo voVar, int i, KeyEvent keyEvent) {
        ti4 ti4;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((voVar.k || I(voVar, keyEvent)) && (ti4 = voVar.h) != null) {
            return ti4.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cb, code lost:
        if (r13.h == null) goto L_0x010d;
     */
    public final boolean I(vo voVar, KeyEvent keyEvent) {
        boolean z;
        int i;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        Resources.Theme theme;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.m0) {
            boolean z3 = voVar.k;
            int i2 = voVar.a;
            if (z3) {
                return true;
            }
            vo voVar2 = this.i0;
            if (!(voVar2 == null || voVar2 == voVar)) {
                u(voVar2, false);
            }
            Window.Callback callback = this.H.getCallback();
            if (callback != null) {
                voVar.g = callback.onCreatePanelView(i2);
            }
            if (i2 == 0 || i2 == 108) {
                z = true;
            } else {
                z = false;
            }
            if (z && (actionBarOverlayLayout4 = this.M) != null) {
                actionBarOverlayLayout4.k();
                ((sj7) actionBarOverlayLayout4.A).l = true;
            }
            if (voVar.g == null) {
                ti4 ti4 = voVar.h;
                if (ti4 == null || voVar.o) {
                    if (ti4 == null) {
                        Context context = this.G;
                        if ((i2 == 0 || i2 == 108) && this.M != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                                theme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (theme == null) {
                                    theme = context.getResources().newTheme();
                                    theme.setTo(theme2);
                                }
                                theme.applyStyle(typedValue.resourceId, true);
                            }
                            if (theme != null) {
                                d61 d61 = new d61(context, 0);
                                d61.getTheme().setTo(theme);
                                context = d61;
                            }
                        }
                        ti4 ti42 = new ti4(context);
                        ti42.e = this;
                        ti4 ti43 = voVar.h;
                        if (ti42 != ti43) {
                            if (ti43 != null) {
                                ti43.r(voVar.i);
                            }
                            voVar.h = ti42;
                            z74 z74 = voVar.i;
                            if (z74 != null) {
                                ti42.b(z74, ti42.a);
                            }
                        }
                    }
                    if (z && (actionBarOverlayLayout3 = this.M) != null) {
                        if (this.N == null) {
                            this.N = new f96(5, (Object) this);
                        }
                        actionBarOverlayLayout3.l(voVar.h, this.N);
                    }
                    voVar.h.w();
                    if (!callback.onCreatePanelMenu(i2, voVar.h)) {
                        ti4 ti44 = voVar.h;
                        if (ti44 != null) {
                            if (ti44 != null) {
                                ti44.r(voVar.i);
                            }
                            voVar.h = null;
                        }
                        if (z && (actionBarOverlayLayout2 = this.M) != null) {
                            actionBarOverlayLayout2.l((Menu) null, this.N);
                        }
                    } else {
                        voVar.o = false;
                    }
                }
                voVar.h.w();
                Bundle bundle = voVar.p;
                if (bundle != null) {
                    voVar.h.s(bundle);
                    voVar.p = null;
                }
                if (!callback.onPreparePanel(0, voVar.g, voVar.h)) {
                    if (z && (actionBarOverlayLayout = this.M) != null) {
                        actionBarOverlayLayout.l((Menu) null, this.N);
                    }
                    voVar.h.v();
                    return false;
                }
                if (keyEvent != null) {
                    i = keyEvent.getDeviceId();
                } else {
                    i = -1;
                }
                if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                voVar.h.setQwertyMode(z2);
                voVar.h.v();
            }
            voVar.k = true;
            voVar.l = false;
            this.i0 = voVar;
            return true;
        }
        return false;
    }

    public final void J() {
        if (this.V) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.B0 != null && (B(0).m || this.P != null)) {
                z = true;
            }
            if (z && this.C0 == null) {
                this.C0 = qo.b(this.B0, this);
            } else if (!z && (onBackInvokedCallback = this.C0) != null) {
                qo.c(this.B0, onBackInvokedCallback);
                this.C0 = null;
            }
        }
    }

    public final void c() {
        LayoutInflater from = LayoutInflater.from(this.G);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof wo)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void e() {
        String str;
        this.k0 = true;
        o(false, true);
        z();
        Object obj = this.F;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                str = b96.C(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                u98 u98 = this.J;
                if (u98 == null) {
                    this.x0 = true;
                } else if (!u98.h) {
                    sj7 sj7 = (sj7) u98.e;
                    int i = sj7.b;
                    u98.h = true;
                    sj7.a((i & -5) | 4);
                }
            }
            synchronized (ko.D) {
                ko.h(this);
                ko.C.add(new WeakReference(this));
            }
        }
        this.n0 = new Configuration(this.G.getResources().getConfiguration());
        this.l0 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    public final void f() {
        so soVar;
        so soVar2;
        if (this.F instanceof Activity) {
            synchronized (ko.D) {
                ko.h(this);
            }
        }
        if (this.u0) {
            this.H.getDecorView().removeCallbacks(this.w0);
        }
        this.m0 = true;
        if (this.o0 != -100) {
            Object obj = this.F;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                D0.put(this.F.getClass().getName(), Integer.valueOf(this.o0));
                soVar = this.s0;
                if (soVar != null) {
                    soVar.c();
                }
                soVar2 = this.t0;
                if (soVar2 == null) {
                    soVar2.c();
                    return;
                }
                return;
            }
        }
        D0.remove(this.F.getClass().getName());
        soVar = this.s0;
        if (soVar != null) {
        }
        soVar2 = this.t0;
        if (soVar2 == null) {
        }
    }

    public final boolean g(ti4 ti4, MenuItem menuItem) {
        int i;
        vo voVar;
        Window.Callback callback = this.H.getCallback();
        if (callback != null && !this.m0) {
            ti4 k = ti4.k();
            vo[] voVarArr = this.h0;
            if (voVarArr != null) {
                i = voVarArr.length;
            } else {
                i = 0;
            }
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    voVar = voVarArr[i2];
                    if (voVar != null && voVar.h == k) {
                        break;
                    }
                    i2++;
                } else {
                    voVar = null;
                    break;
                }
            }
            if (voVar != null) {
                return callback.onMenuItemSelected(voVar.a, menuItem);
            }
        }
        return false;
    }

    public final boolean i(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f0 && i == 108) {
            return false;
        }
        if (this.b0 && i == 1) {
            this.b0 = false;
        }
        if (i == 1) {
            J();
            this.f0 = true;
            return true;
        } else if (i == 2) {
            J();
            this.Z = true;
            return true;
        } else if (i == 5) {
            J();
            this.a0 = true;
            return true;
        } else if (i == 10) {
            J();
            this.d0 = true;
            return true;
        } else if (i == 108) {
            J();
            this.b0 = true;
            return true;
        } else if (i != 109) {
            return this.H.requestFeature(i);
        } else {
            J();
            this.c0 = true;
            return true;
        }
    }

    public final void j(int i) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.W.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.G).inflate(i, viewGroup);
        this.I.a(this.H.getCallback());
    }

    public final void k(View view) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.W.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.I.a(this.H.getCallback());
    }

    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.W.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.I.a(this.H.getCallback());
    }

    public final void m(CharSequence charSequence) {
        this.L = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.M;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        u98 u98 = this.J;
        if (u98 != null) {
            sj7 sj7 = (sj7) u98.e;
            if (!sj7.g) {
                Toolbar toolbar = sj7.a;
                sj7.h = charSequence;
                if ((sj7.b & 8) != 0) {
                    toolbar.setTitle(charSequence);
                    if (sj7.g) {
                        e58.n(toolbar.getRootView(), charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = this.X;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fa A[ADDED_TO_REGION] */
    public final boolean o(boolean z, boolean z2) {
        za4 za4;
        int i;
        Configuration configuration;
        int i2;
        int i3;
        za4 za42;
        int i4;
        boolean z3;
        Object obj;
        Object obj2;
        Activity activity;
        int i5;
        boolean z4 = false;
        if (this.m0) {
            return false;
        }
        int i6 = this.o0;
        if (i6 == -100) {
            i6 = ko.x;
        }
        Context context = this.G;
        int E = E(context, i6);
        int i7 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        if (i7 < 33) {
            za4 = q(context);
        } else {
            za4 = null;
        }
        if (!z2 && za4 != null) {
            za4 = oo.b(context.getResources().getConfiguration());
        }
        Configuration v = v(context, E, za4, (Configuration) null, false);
        boolean z5 = this.r0;
        boolean z6 = true;
        Object obj3 = this.F;
        if (!z5 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.n0;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                i2 = configuration.uiMode & 48;
                i3 = v.uiMode & 48;
                za4 b = oo.b(configuration);
                if (za4 != null) {
                    za42 = null;
                } else {
                    za42 = oo.b(v);
                }
                if (i2 == i3) {
                    i4 = 512;
                } else {
                    i4 = 0;
                }
                if (za42 != null && !b.equals(za42)) {
                    i4 |= 8196;
                }
                if (((~i) & i4) != 0 && z && this.k0 && ((F0 || this.l0) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 31 && (i4 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(v.getLayoutDirection());
                        }
                        if (i8 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new y0(1, activity));
                        }
                        z3 = true;
                        if (!z3 || i4 == 0) {
                            z6 = z3;
                        } else {
                            if ((i4 & i) == i4) {
                                z4 = true;
                            }
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & -49) | i3;
                            if (za42 != null) {
                                oo.d(configuration2, za42);
                            }
                            resources.updateConfiguration(configuration2, (DisplayMetrics) null);
                            int i9 = Build.VERSION.SDK_INT;
                            if (i9 < 26 && i9 < 28) {
                                if (!n85.j) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        n85.i = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                                    }
                                    n85.j = true;
                                }
                                Field field = n85.i;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e2) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!n85.d) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                n85.c = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e3) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                                            }
                                            n85.d = true;
                                        }
                                        Field field2 = n85.c;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e4) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                                            }
                                            if (obj2 != null) {
                                                if (!n85.f) {
                                                    try {
                                                        n85.e = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e5) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e5);
                                                    }
                                                    n85.f = true;
                                                }
                                                Class cls = n85.e;
                                                if (cls != null) {
                                                    if (!n85.h) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            n85.g = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e6) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e6);
                                                        }
                                                        n85.h = true;
                                                    }
                                                    Field field3 = n85.g;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e7) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e7);
                                                        }
                                                        if (longSparseArray != null) {
                                                            longSparseArray.clear();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        if (obj2 != null) {
                                        }
                                    }
                                }
                            }
                            int i10 = this.p0;
                            if (i10 != 0) {
                                context.setTheme(i10);
                                context.getTheme().applyStyle(this.p0, true);
                            }
                            if (z4 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof t54) {
                                    if (((t54) activity2).k().G0().compareTo(k54.y) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.l0 && !this.m0) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (za42 != null) {
                            oo.c(oo.b(context.getResources().getConfiguration()));
                        }
                        if (i6 == 0) {
                            A(context).r();
                        } else {
                            so soVar = this.s0;
                            if (soVar != null) {
                                soVar.c();
                            }
                        }
                        so soVar2 = this.t0;
                        if (i6 == 3) {
                            if (soVar2 == null) {
                                this.t0 = new so(this, context);
                            }
                            this.t0.r();
                        } else if (soVar2 != null) {
                            soVar2.c();
                        }
                        return z6;
                    }
                }
                z3 = false;
                if (!z3) {
                }
                z6 = z3;
                if (za42 != null) {
                }
                if (i6 == 0) {
                }
                so soVar22 = this.t0;
                if (i6 == 3) {
                }
                return z6;
            }
            if (i7 >= 29) {
                i5 = 269221888;
            } else {
                i5 = 786432;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i5);
                if (activityInfo != null) {
                    this.q0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e8) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e8);
                this.q0 = 0;
            }
        }
        this.r0 = true;
        i = this.q0;
        configuration = this.n0;
        if (configuration == null) {
        }
        i2 = configuration.uiMode & 48;
        i3 = v.uiMode & 48;
        za4 b2 = oo.b(configuration);
        if (za4 != null) {
        }
        if (i2 == i3) {
        }
        i4 |= 8196;
        activity = (Activity) obj3;
        if (!activity.isChild()) {
        }
        z3 = false;
        if (!z3) {
        }
        z6 = z3;
        if (za42 != null) {
        }
        if (i6 == 0) {
        }
        so soVar222 = this.t0;
        if (i6 == 3) {
        }
        return z6;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010e, code lost:
        if (r10.equals("ImageButton") == false) goto L_0x0096;
     */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Context context2;
        View view2;
        View view3 = null;
        if (this.A0 == null) {
            int[] iArr = qv5.j;
            Context context3 = this.G;
            TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.A0 = new oq();
            } else {
                try {
                    this.A0 = (oq) context3.getClassLoader().loadClass(string).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.A0 = new oq();
                }
            }
        }
        oq oqVar = this.A0;
        int i = a38.a;
        oqVar.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, qv5.x, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        if (resourceId == 0 || ((context instanceof d61) && ((d61) context).a == resourceId)) {
            context2 = context;
        } else {
            context2 = new d61(context, resourceId);
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 8;
                    break;
                }
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 9;
                    break;
                }
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 10;
                    break;
                }
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 12;
                    break;
                }
            case 2001146706:
                if (str.equals("Button")) {
                    c = 13;
                    break;
                }
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case b85.b:
                view2 = new hp(context2, attributeSet);
                break;
            case 1:
                view2 = new fo(context2, attributeSet);
                break;
            case 2:
                view2 = new ep(context2, attributeSet);
                break;
            case 3:
                view2 = oqVar.e(context2, attributeSet);
                break;
            case 4:
                view2 = new cp(context2, attributeSet, R.attr.imageButtonStyle);
                break;
            case 5:
                view2 = new jp(context2, attributeSet);
                break;
            case 6:
                view2 = new vp(context2, attributeSet);
                break;
            case 7:
                view2 = oqVar.d(context2, attributeSet);
                break;
            case 8:
                view2 = new mq(context2, attributeSet);
                break;
            case 9:
                view2 = new dp(context2, attributeSet, 0);
                break;
            case 10:
                view2 = oqVar.a(context2, attributeSet);
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                view2 = oqVar.c(context2, attributeSet);
                break;
            case 12:
                view2 = new ap(context2, attributeSet);
                break;
            case ry4.PERF_SESSIONS_FIELD_NUMBER:
                view2 = oqVar.b(context2, attributeSet);
                break;
            default:
                view2 = null;
                break;
        }
        if (view2 == null && context != context2) {
            Object[] objArr = oqVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue((String) null, "class");
            }
            try {
                objArr[0] = context2;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = oq.g;
                        if (i2 < 3) {
                            View f = oqVar.f(context2, str, strArr[i2]);
                            if (f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view3 = f;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View f2 = oqVar.f(context2, str, (String) null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view3 = f2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                objArr[0] = null;
                objArr[1] = null;
                throw th3;
            }
            view2 = view3;
        }
        if (view2 != null) {
            Context context4 = view2.getContext();
            if ((context4 instanceof ContextWrapper) && view2.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context4.obtainStyledAttributes(attributeSet, oq.c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    view2.setOnClickListener(new nq(view2, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, oq.d);
                Class<Boolean> cls = Boolean.class;
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = e58.a;
                    new s48(R.id.tag_accessibility_heading, cls, 0, 28, 2).g(view2, Boolean.valueOf(z));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = context2.obtainStyledAttributes(attributeSet, oq.e);
                if (obtainStyledAttributes5.hasValue(0)) {
                    e58.n(view2, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = context2.obtainStyledAttributes(attributeSet, oq.f);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = e58.a;
                    new s48(R.id.tag_screen_reader_focusable, cls, 0, 28, 0).g(view2, Boolean.valueOf(z2));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return view2;
    }

    public final void p(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.H == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof ro)) {
                ro roVar = new ro(this, callback);
                this.I = roVar;
                window.setCallback(roVar);
                Context context = this.G;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, E0);
                if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                    drawable = null;
                } else {
                    yo a = yo.a();
                    synchronized (a) {
                        drawable = a.a.d(context, resourceId, true);
                    }
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.H = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.B0) == null) {
                    Object obj = this.F;
                    if (!(onBackInvokedDispatcher == null || (onBackInvokedCallback = this.C0) == null)) {
                        qo.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.C0 = null;
                    }
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.B0 = qo.a(activity);
                            K();
                            return;
                        }
                    }
                    this.B0 = null;
                    K();
                    return;
                }
                return;
            }
            h.s("AppCompat has already installed itself into the Window");
            return;
        }
        h.s("AppCompat has already installed itself into the Window");
    }

    /* JADX INFO: finally extract failed */
    public final void r(int i, vo voVar, ti4 ti4) {
        if (ti4 == null) {
            if (voVar == null && i >= 0) {
                vo[] voVarArr = this.h0;
                if (i < voVarArr.length) {
                    voVar = voVarArr[i];
                }
            }
            if (voVar != null) {
                ti4 = voVar.h;
            }
        }
        if ((voVar == null || voVar.m) && !this.m0) {
            ro roVar = this.I;
            Window.Callback callback = this.H.getCallback();
            roVar.getClass();
            try {
                roVar.z = true;
                callback.onPanelClosed(i, ti4);
                roVar.z = false;
            } catch (Throwable th) {
                roVar.z = false;
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r6.j() != false) goto L_0x0046;
     */
    public final void s(ti4 ti4) {
        ActionMenuView actionMenuView;
        d8 d8Var;
        d8 d8Var2;
        d8 d8Var3;
        ActionBarOverlayLayout actionBarOverlayLayout = this.M;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((sj7) actionBarOverlayLayout.A).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.w) != null && actionMenuView.O) {
                if (ViewConfiguration.get(this.G).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.M;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((sj7) actionBarOverlayLayout2.A).a.w;
                    if (actionMenuView2 != null) {
                        d8 d8Var4 = actionMenuView2.P;
                        if (d8Var4 != null) {
                            if (d8Var4.Q == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.H.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.M;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((sj7) actionBarOverlayLayout3.A).a.w;
                if (actionMenuView3 != null && (d8Var2 = actionMenuView3.P) != null && d8Var2.j()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.M;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((sj7) actionBarOverlayLayout4.A).a.w;
                    if (!(actionMenuView4 == null || (d8Var3 = actionMenuView4.P) == null)) {
                        boolean g = d8Var3.g();
                    }
                    if (!this.m0) {
                        callback.onPanelClosed(108, B(0).h);
                        return;
                    }
                    return;
                } else if (callback != null && !this.m0) {
                    if (this.u0 && (1 & this.v0) != 0) {
                        View decorView = this.H.getDecorView();
                        lo loVar = this.w0;
                        decorView.removeCallbacks(loVar);
                        loVar.run();
                    }
                    vo B = B(0);
                    ti4 ti42 = B.h;
                    if (ti42 != null && !B.o && callback.onPreparePanel(0, B.g, ti42)) {
                        callback.onMenuOpened(108, B.h);
                        ActionBarOverlayLayout actionBarOverlayLayout5 = this.M;
                        actionBarOverlayLayout5.k();
                        ActionMenuView actionMenuView5 = ((sj7) actionBarOverlayLayout5.A).a.w;
                        if (actionMenuView5 != null && (d8Var = actionMenuView5.P) != null) {
                            d8Var.l();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        vo B2 = B(0);
        B2.n = true;
        u(B2, false);
        G(B2, (KeyEvent) null);
    }

    public final void t(ti4 ti4) {
        d8 d8Var;
        if (!this.g0) {
            this.g0 = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.M;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((sj7) actionBarOverlayLayout.A).a.w;
            if (!(actionMenuView == null || (d8Var = actionMenuView.P) == null)) {
                d8Var.g();
                a8 a8Var = d8Var.P;
                if (a8Var != null && a8Var.b()) {
                    a8Var.i.dismiss();
                }
            }
            Window.Callback callback = this.H.getCallback();
            if (callback != null && !this.m0) {
                callback.onPanelClosed(108, ti4);
            }
            this.g0 = false;
        }
    }

    public final void u(vo voVar, boolean z) {
        uo uoVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        d8 d8Var;
        if (z && voVar.a == 0 && (actionBarOverlayLayout = this.M) != null) {
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((sj7) actionBarOverlayLayout.A).a.w;
            if (!(actionMenuView == null || (d8Var = actionMenuView.P) == null || !d8Var.j())) {
                t(voVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.G.getSystemService("window");
        if (!(windowManager == null || !voVar.m || (uoVar = voVar.e) == null)) {
            windowManager.removeView(uoVar);
            if (z) {
                r(voVar.a, voVar, (ti4) null);
            }
        }
        voVar.k = false;
        voVar.l = false;
        voVar.m = false;
        voVar.f = null;
        voVar.n = true;
        if (this.i0 == voVar) {
            this.i0 = null;
        }
        if (voVar.a == 0) {
            K();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r4 != false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d6, code lost:
        if (r6.g() != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00fa, code lost:
        if (r6.l() != false) goto L_0x011b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0125  */
    public final boolean w(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        ActionMenuView actionMenuView;
        d8 d8Var;
        View decorView;
        Object obj = this.F;
        boolean z3 = true;
        if ((!(obj instanceof rs3) && !(obj instanceof ra)) || (decorView = this.H.getDecorView()) == null || !h03.h(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                ro roVar = this.I;
                Window.Callback callback = this.H.getCallback();
                roVar.getClass();
                try {
                    roVar.y = true;
                    boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    roVar.y = false;
                } catch (Throwable th) {
                    roVar.y = false;
                    throw th;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    if ((keyEvent.getFlags() & 128) == 0) {
                        z3 = false;
                    }
                    this.j0 = z3;
                    return false;
                } else if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        vo B = B(0);
                        if (!B.m) {
                            I(B, keyEvent);
                            return true;
                        }
                    }
                }
            } else if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.P == null) {
                        vo B2 = B(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.M;
                        Context context = this.G;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((sj7) actionBarOverlayLayout.A).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.w) != null && actionMenuView.O && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.M;
                                actionBarOverlayLayout2.k();
                                ActionMenuView actionMenuView2 = ((sj7) actionBarOverlayLayout2.A).a.w;
                                if (actionMenuView2 == null || (d8Var = actionMenuView2.P) == null || !d8Var.j()) {
                                    if (!this.m0 && I(B2, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = this.M;
                                        actionBarOverlayLayout3.k();
                                        ActionMenuView actionMenuView3 = ((sj7) actionBarOverlayLayout3.A).a.w;
                                        if (actionMenuView3 != null) {
                                            d8 d8Var2 = actionMenuView3.P;
                                            if (d8Var2 != null) {
                                            }
                                        }
                                    }
                                    z = false;
                                    if (z) {
                                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.M;
                                    actionBarOverlayLayout4.k();
                                    ActionMenuView actionMenuView4 = ((sj7) actionBarOverlayLayout4.A).a.w;
                                    if (actionMenuView4 != null) {
                                        d8 d8Var3 = actionMenuView4.P;
                                        if (d8Var3 != null) {
                                        }
                                    }
                                    z = false;
                                    if (z) {
                                    }
                                }
                            }
                        }
                        boolean z4 = B2.m;
                        if (z4 || B2.l) {
                            u(B2, true);
                            z = z4;
                            if (z) {
                            }
                        } else {
                            if (B2.k) {
                                if (B2.o) {
                                    B2.k = false;
                                    z2 = I(B2, keyEvent);
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    G(B2, keyEvent);
                                    z = true;
                                    if (z) {
                                    }
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            } else if (F()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void x(int i) {
        vo B = B(i);
        if (B.h != null) {
            Bundle bundle = new Bundle();
            B.h.t(bundle);
            if (bundle.size() > 0) {
                B.p = bundle;
            }
            B.h.w();
            B.h.clear();
        }
        B.o = true;
        B.n = true;
        if ((i == 108 || i == 0) && this.M != null) {
            vo B2 = B(0);
            B2.k = false;
            I(B2, (KeyEvent) null);
        }
    }

    public final void y() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.V) {
            Context context2 = this.G;
            int[] iArr = qv5.j;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    i(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    i(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    i(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    i(10);
                }
                this.e0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                z();
                this.H.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (this.f0) {
                    viewGroup = this.d0 ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.e0) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.c0 = false;
                    this.b0 = false;
                } else if (this.b0) {
                    TypedValue typedValue = new TypedValue();
                    context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new d61(context2, typedValue.resourceId);
                    } else {
                        context = context2;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(R.id.decor_content_parent);
                    this.M = actionBarOverlayLayout;
                    actionBarOverlayLayout.setWindowCallback(this.H.getCallback());
                    if (this.c0) {
                        this.M.j(109);
                    }
                    if (this.Z) {
                        this.M.j(2);
                    }
                    if (this.a0) {
                        this.M.j(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    ji8 ji8 = new ji8(4, (Object) this);
                    WeakHashMap weakHashMap = e58.a;
                    w48.c(viewGroup, ji8);
                    if (this.M == null) {
                        this.X = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    boolean z = o68.a;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", (Class[]) null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, (Object[]) null);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (IllegalAccessException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.H.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.H.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new ns8(3, (Object) this));
                    this.W = viewGroup;
                    Object obj = this.F;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.L;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = this.M;
                        if (actionBarOverlayLayout2 != null) {
                            actionBarOverlayLayout2.setWindowTitle(charSequence);
                        } else {
                            u98 u98 = this.J;
                            if (u98 != null) {
                                sj7 sj7 = (sj7) u98.e;
                                if (!sj7.g) {
                                    Toolbar toolbar = sj7.a;
                                    sj7.h = charSequence;
                                    if ((sj7.b & 8) != 0) {
                                        toolbar.setTitle(charSequence);
                                        if (sj7.g) {
                                            e58.n(toolbar.getRootView(), charSequence);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.X;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.W.findViewById(16908290);
                    View decorView = this.H.getDecorView();
                    contentFrameLayout2.C.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.V = true;
                    vo B = B(0);
                    if (!this.m0 && B.h == null) {
                        D(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.b0 + ", windowActionBarOverlay: " + this.c0 + ", android:windowIsFloating: " + this.e0 + ", windowActionModeOverlay: " + this.d0 + ", windowNoTitle: " + this.f0 + " }");
            }
            obtainStyledAttributes.recycle();
            h.s("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void z() {
        if (this.H == null) {
            Object obj = this.F;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.H == null) {
            h.s("We have not been given a Window");
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
