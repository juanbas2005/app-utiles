package defpackage;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: a02  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class a02 {
    public static final Method a;
    public static final Method b;
    public static final Method c;
    public static final boolean d = true;

    static {
        Class<AdapterView> cls = AdapterView.class;
        Class<AbsListView> cls2 = AbsListView.class;
        try {
            Class cls3 = Integer.TYPE;
            Class cls4 = Boolean.TYPE;
            Class cls5 = Float.TYPE;
            Method declaredMethod = cls2.getDeclaredMethod("positionSelector", new Class[]{cls3, View.class, cls4, cls5, cls5});
            a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls3});
            b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = cls.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls3});
            c = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
