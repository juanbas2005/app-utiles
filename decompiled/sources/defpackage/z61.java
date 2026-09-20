package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: z61  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class z61 extends ViewGroup.MarginLayoutParams {
    public w61 a;
    public boolean b = false;
    public final int c = 0;
    public final int d = 0;
    public final int e = -1;
    public final int f = -1;
    public final int g = 0;
    public int h = 0;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public final Rect o = new Rect();

    public z61(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kv5.b);
        this.c = obtainStyledAttributes.getInteger(0, 0);
        this.f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.e = obtainStyledAttributes.getInteger(6, -1);
        this.g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.P;
            w61 w61 = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.P;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.R;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.Q);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    w61 = (w61) constructor.newInstance(new Object[]{context, attributeSet});
                } catch (Exception e2) {
                    ku4.o("Could not inflate Behavior subclass ".concat(string), e2);
                    throw null;
                }
            }
            this.a = w61;
        }
        obtainStyledAttributes.recycle();
        w61 w612 = this.a;
        if (w612 != null) {
            w612.c(this);
        }
    }

    public final boolean a(int i2) {
        if (i2 == 0) {
            return this.m;
        }
        if (i2 != 1) {
            return false;
        }
        return this.n;
    }

    public z61() {
        super(-2, -2);
    }

    public z61(z61 z61) {
        super(z61);
    }

    public z61(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public z61(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
