package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* renamed from: t68  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class t68 extends za5 {
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = true;

    public void G(View view, int i, int i2, int i3, int i4) {
        if (f) {
            try {
                r68.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    public void H(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            if (!za5.c) {
                try {
                    Field declaredField = View.class.getDeclaredField("mViewFlags");
                    za5.b = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                    Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
                }
                za5.c = true;
            }
            Field field = za5.b;
            if (field != null) {
                try {
                    za5.b.setInt(view, (field.getInt(view) & -13) | i);
                } catch (IllegalAccessException unused2) {
                }
            }
        } else if (g) {
            try {
                s68.a(view, i);
            } catch (NoSuchMethodError unused3) {
                g = false;
            }
        }
    }

    public void I(View view, Matrix matrix) {
        if (d) {
            try {
                q68.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void J(ViewGroup viewGroup, Matrix matrix) {
        if (e) {
            try {
                q68.c(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }
}
