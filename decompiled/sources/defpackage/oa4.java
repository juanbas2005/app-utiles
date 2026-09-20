package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* renamed from: oa4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class oa4 {
    public static final hu5 a;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        r1 = null;
     */
    static {
        Object obj;
        Object obj2 = null;
        try {
            ClassLoader classLoader = if6.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", (Class[]) null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object invoke = method.invoke((Object) null, (Object[]) null);
                    if (invoke instanceof hu5) {
                        obj = (hu5) invoke;
                    }
                } else if (annotations[i] instanceof fq1) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Throwable th) {
            obj = new m66(th);
        }
        if (!(obj instanceof m66)) {
            obj2 = obj;
        }
        hu5 hu5 = (hu5) obj2;
        if (hu5 == null) {
            hu5 = new hu5(new q83(26));
        }
        a = hu5;
    }
}
