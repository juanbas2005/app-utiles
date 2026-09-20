package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: nq  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nq implements View.OnClickListener {
    public final View w;
    public final String x;
    public Method y;
    public Context z;

    public nq(View view, String str) {
        this.w = view;
        this.x = str;
    }

    public final void onClick(View view) {
        String str;
        Method method;
        if (this.y == null) {
            View view2 = this.w;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.x;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, new Class[]{View.class})) != null) {
                            this.y = method;
                            this.z = context;
                            break;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder q = b81.q("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    q.append(view2.getClass());
                    q.append(str);
                    throw new IllegalStateException(q.toString());
                }
            }
        }
        try {
            this.y.invoke(this.z, new Object[]{view});
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
