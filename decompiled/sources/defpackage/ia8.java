package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: ia8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ia8 extends qa8 {
    public static Field g = null;
    public static boolean h = false;
    public static Constructor i = null;
    public static boolean j = false;
    public WindowInsets e;
    public ad3 f;

    public ia8() {
        this.e = j();
    }

    private static WindowInsets j() {
        Class<WindowInsets> cls = WindowInsets.class;
        if (!h) {
            try {
                g = cls.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!j) {
            try {
                i = cls.getConstructor(new Class[]{Rect.class});
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    public db8 b() {
        a();
        db8 g2 = db8.g((View) null, this.e);
        ad3[] ad3Arr = this.b;
        za8 za8 = g2.a;
        za8.v(ad3Arr);
        za8.x(this.f);
        za8.u((ew1) null);
        za8.z(this.c);
        za8.A(this.d);
        return g2;
    }

    public void f(ad3 ad3) {
        this.f = ad3;
    }

    public void h(ad3 ad3) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(ad3.a, ad3.b, ad3.c, ad3.d);
        }
    }

    public ia8(db8 db8) {
        super(db8);
        this.e = db8.f();
    }
}
