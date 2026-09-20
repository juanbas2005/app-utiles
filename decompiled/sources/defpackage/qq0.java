package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: qq0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qq0 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public qq0(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            j54 j54 = (j54) entry.getValue();
            List list = (List) this.a.get(j54);
            if (list == null) {
                list = new ArrayList();
                this.a.put(j54, list);
            }
            list.add((rq0) entry.getKey());
        }
    }

    public static void a(List list, t54 t54, j54 j54, Object obj) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                rq0 rq0 = (rq0) list.get(size);
                Method method = rq0.b;
                try {
                    int i = rq0.a;
                    if (i == 0) {
                        method.invoke(obj, (Object[]) null);
                    } else if (i == 1) {
                        method.invoke(obj, new Object[]{t54});
                    } else if (i == 2) {
                        method.invoke(obj, new Object[]{t54, j54});
                    }
                    size--;
                } catch (InvocationTargetException e) {
                    ku4.o("Failed to call observer method", e.getCause());
                    return;
                } catch (IllegalAccessException e2) {
                    rf2.o(e2);
                    return;
                }
            }
        }
    }
}
