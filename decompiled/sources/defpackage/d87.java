package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: d87  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class d87 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = {MenuItem.class};
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public d87(cj4 cj4, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = cj4;
        this.b = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.a) {
            case b85.b:
                Object obj = this.b;
                Method method = (Method) this.c;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, new Object[]{menuItem})).booleanValue();
                    }
                    method.invoke(obj, new Object[]{menuItem});
                    return true;
                } catch (Exception e) {
                    rf2.o(e);
                    return false;
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((cj4) this.c).g(menuItem));
        }
    }

    public /* synthetic */ d87() {
    }
}
