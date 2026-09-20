package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: e87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e87 {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public final /* synthetic */ f87 E;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public zi4 z;

    public e87(f87 f87, Menu menu) {
        this.E = f87;
        this.a = menu;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2;
        f87 f87 = this.E;
        Context context = f87.c;
        MenuItem enabled = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        boolean z3 = false;
        if (this.r >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        enabled.setCheckable(z2).setTitleCondensed(this.l).setIcon(this.m);
        int i2 = this.v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        if (this.y != null) {
            if (!context.isRestricted()) {
                if (f87.d == null) {
                    f87.d = f87.a(context);
                }
                Object obj = f87.d;
                String str = this.y;
                d87 d87 = new d87();
                d87.b = obj;
                Class<?> cls = obj.getClass();
                try {
                    d87.c = cls.getMethod(str, d87.d);
                    menuItem.setOnMenuItemClickListener(d87);
                } catch (Exception e2) {
                    StringBuilder q2 = b81.q("Couldn't resolve menu item onClick handler ", str, " in class ");
                    q2.append(cls.getName());
                    InflateException inflateException = new InflateException(q2.toString());
                    inflateException.initCause(e2);
                    throw inflateException;
                }
            } else {
                h.s("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof yi4) {
                yi4 yi4 = (yi4) menuItem;
                yi4.x = (yi4.x & -5) | 4;
            } else if (menuItem instanceof cj4) {
                cj4 cj4 = (cj4) menuItem;
                g87 g87 = cj4.c;
                try {
                    if (cj4.d == null) {
                        cj4.d = g87.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    cj4.d.invoke(g87, new Object[]{Boolean.TRUE});
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, f87.e, f87.a));
            z3 = true;
        }
        int i3 = this.w;
        if (i3 > 0) {
            if (!z3) {
                menuItem.setActionView(i3);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        zi4 zi4 = this.z;
        if (zi4 != null) {
            if (menuItem instanceof g87) {
                ((g87) menuItem).a(zi4);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z4 = menuItem instanceof g87;
        if (z4) {
            ((g87) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            an.n(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z4) {
            ((g87) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            an.v(menuItem, charSequence2);
        }
        char c2 = this.n;
        int i4 = this.o;
        if (z4) {
            ((g87) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            an.l(menuItem, c2, i4);
        }
        char c3 = this.p;
        int i5 = this.q;
        if (z4) {
            ((g87) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            an.r(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z4) {
                ((g87) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                an.q(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList == null) {
            return;
        }
        if (z4) {
            ((g87) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            an.p(menuItem, colorStateList);
        }
    }
}
