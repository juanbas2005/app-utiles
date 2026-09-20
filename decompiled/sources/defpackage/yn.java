package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import cu.lestebang.utiletecsa.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: yn  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class yn extends eq2 implements co {
    public wo W;

    public yn() {
        ((kg5) this.z.y).K("androidx:appcompat", new wn(this));
        m(new xn(this, 0));
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        wo woVar = (wo) r();
        woVar.y();
        ((ViewGroup) woVar.W.findViewById(16908290)).addView(view, layoutParams);
        woVar.I.a(woVar.H.getCallback());
    }

    public final void attachBaseContext(Context context) {
        Configuration configuration;
        wo woVar = (wo) r();
        woVar.k0 = true;
        int i = woVar.o0;
        if (i == -100) {
            i = ko.x;
        }
        int E = woVar.E(context, i);
        if (ko.d(context)) {
            ko.n(context);
        }
        za4 q = wo.q(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(wo.v(context, E, q, (Configuration) null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof d61) {
            try {
                ((d61) context).a(wo.v(context, E, q, (Configuration) null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (wo.F0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    oo.a(configuration3, configuration4, configuration);
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode = configuration.colorMode | (configuration4.colorMode & 3);
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode = configuration.colorMode | (configuration4.colorMode & 12);
                        }
                    }
                    int i26 = configuration3.uiMode & 15;
                    int i27 = configuration4.uiMode & 15;
                    if (i26 != i27) {
                        configuration.uiMode |= i27;
                    }
                    int i28 = configuration3.uiMode & 48;
                    int i29 = configuration4.uiMode & 48;
                    if (i28 != i29) {
                        configuration.uiMode |= i29;
                    }
                    int i30 = configuration3.screenWidthDp;
                    int i31 = configuration4.screenWidthDp;
                    if (i30 != i31) {
                        configuration.screenWidthDp = i31;
                    }
                    int i32 = configuration3.screenHeightDp;
                    int i33 = configuration4.screenHeightDp;
                    if (i32 != i33) {
                        configuration.screenHeightDp = i33;
                    }
                    int i34 = configuration3.smallestScreenWidthDp;
                    int i35 = configuration4.smallestScreenWidthDp;
                    if (i34 != i35) {
                        configuration.smallestScreenWidthDp = i35;
                    }
                    int i36 = configuration3.densityDpi;
                    int i37 = configuration4.densityDpi;
                    if (i36 != i37) {
                        configuration.densityDpi = i37;
                    }
                }
            } else {
                configuration = null;
            }
            Configuration v = wo.v(context, E, q, configuration, true);
            d61 d61 = new d61(context, 2131886697);
            d61.a(v);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = d61.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        dn.k(theme);
                    } else {
                        synchronized (tf4.g) {
                            if (!tf4.i) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", (Class[]) null);
                                    tf4.h = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                tf4.i = true;
                            }
                            Method method = tf4.h;
                            if (method != null) {
                                try {
                                    method.invoke(theme, (Object[]) null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    tf4.h = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = d61;
        }
        super.attachBaseContext(context);
    }

    public final void closeOptionsMenu() {
        s();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        s();
        return super.dispatchKeyEvent(keyEvent);
    }

    public final View findViewById(int i) {
        wo woVar = (wo) r();
        woVar.y();
        return woVar.H.findViewById(i);
    }

    public final MenuInflater getMenuInflater() {
        Context context;
        wo woVar = (wo) r();
        if (woVar.K == null) {
            woVar.C();
            u98 u98 = woVar.J;
            if (u98 != null) {
                context = u98.b();
            } else {
                context = woVar.G;
            }
            woVar.K = new f87(context);
        }
        return woVar.K;
    }

    public final Resources getResources() {
        int i = a38.a;
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        wo woVar = (wo) r();
        if (woVar.J != null) {
            woVar.C();
            woVar.J.getClass();
            woVar.D(0);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        wo woVar = (wo) r();
        if (woVar.b0 && woVar.V) {
            woVar.C();
            u98 u98 = woVar.J;
            if (u98 != null) {
                u98.d(u98.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        yo a = yo.a();
        Context context = woVar.G;
        synchronized (a) {
            t56 t56 = a.a;
            synchronized (t56) {
                vc4 vc4 = (vc4) t56.b.get(context);
                if (vc4 != null) {
                    vc4.a();
                }
            }
        }
        woVar.n0 = new Configuration(woVar.G.getResources().getConfiguration());
        woVar.o(false, false);
    }

    public void onDestroy() {
        super.onDestroy();
        r().f();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent A;
        if (!super.onMenuItemSelected(i, menuItem)) {
            u98 s = s();
            if (menuItem.getItemId() != 16908332 || s == null || (((sj7) s.e).b & 4) == 0 || (A = b96.A(this)) == null) {
                return false;
            }
            if (shouldUpRecreateTask(A)) {
                l07 l07 = new l07(this);
                Intent A2 = b96.A(this);
                if (A2 == null) {
                    A2 = b96.A(this);
                }
                if (A2 != null) {
                    ComponentName component = A2.getComponent();
                    if (component == null) {
                        component = A2.resolveActivity(((Context) l07.y).getPackageManager());
                    }
                    l07.d(component);
                    ((ArrayList) l07.x).add(A2);
                }
                l07.f();
                try {
                    finishAffinity();
                } catch (IllegalStateException unused) {
                    finish();
                }
            } else {
                navigateUpTo(A);
                return true;
            }
        }
        return true;
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((wo) r()).y();
    }

    public final void onPostResume() {
        super.onPostResume();
        wo woVar = (wo) r();
        woVar.C();
        u98 u98 = woVar.J;
        if (u98 != null) {
            u98.u = true;
        }
    }

    public final void onStart() {
        super.onStart();
        ((wo) r()).o(true, false);
    }

    public final void onStop() {
        super.onStop();
        wo woVar = (wo) r();
        woVar.C();
        u98 u98 = woVar.J;
        if (u98 != null) {
            u98.u = false;
            d68 d68 = u98.t;
            if (d68 != null) {
                d68.a();
            }
        }
    }

    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        r().m(charSequence);
    }

    public final void openOptionsMenu() {
        s();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final ko r() {
        if (this.W == null) {
            ol6 ol6 = ko.w;
            this.W = new wo(this, (Window) null, this, this);
        }
        return this.W;
    }

    public final u98 s() {
        wo woVar = (wo) r();
        woVar.C();
        return woVar.J;
    }

    public final void setContentView(int i) {
        n();
        r().j(i);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        ((wo) r()).p0 = i;
    }

    public void setContentView(View view) {
        n();
        r().k(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        r().l(view, layoutParams);
    }

    public final void onContentChanged() {
    }
}
