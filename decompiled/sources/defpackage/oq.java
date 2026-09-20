package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import cu.lestebang.utiletecsa.R;
import java.lang.reflect.Constructor;

/* renamed from: oq  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class oq {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {16843375};
    public static final int[] d = {16844160};
    public static final int[] e = {16844156};
    public static final int[] f = {16844148};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final zt6 h = new zt6(0);
    public final Object[] a = new Object[2];

    public zn a(Context context, AttributeSet attributeSet) {
        return new zn(context, attributeSet);
    }

    public bo b(Context context, AttributeSet attributeSet) {
        return new bo(context, attributeSet, R.attr.buttonStyle);
    }

    public eo c(Context context, AttributeSet attributeSet) {
        return new eo(context, attributeSet, R.attr.checkboxStyle);
    }

    public gp d(Context context, AttributeSet attributeSet) {
        return new gp(context, attributeSet);
    }

    public gq e(Context context, AttributeSet attributeSet) {
        return new gq(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        zt6 zt6 = h;
        Constructor<? extends U> constructor = (Constructor) zt6.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            zt6.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
