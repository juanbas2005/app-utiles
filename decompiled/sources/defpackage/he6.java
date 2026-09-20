package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: he6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class he6 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ie6 x;

    public /* synthetic */ he6(ie6 ie6, int i) {
        this.w = i;
        this.x = ie6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        if (java.lang.reflect.Modifier.isPublic(r9.getModifiers()) != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009c, code lost:
        if (r0.getReturnType().equals(r9) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0113, code lost:
        if (r9.getReturnType().equals(r0) != false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0160, code lost:
        if (r1.equals(r9) != false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e3, code lost:
        if (java.lang.reflect.Modifier.isPublic(r9.getModifiers()) != false) goto L_0x01e7;
     */
    public final Object b() {
        int i = this.w;
        Class cls = Integer.TYPE;
        boolean z = true;
        Class<?> cls2 = null;
        boolean z2 = false;
        ie6 ie6 = this.x;
        switch (i) {
            case b85.b:
                Class<?> loadClass = ie6.c.a.loadClass("androidx.window.extensions.WindowExtensions");
                loadClass.getClass();
                Method method = loadClass.getMethod("getWindowLayoutComponent", (Class[]) null);
                Class<?> loadClass2 = ie6.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass2.getClass();
                method.getClass();
                if (!Modifier.isPublic(method.getModifiers()) || !method.getReturnType().equals(loadClass2)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Class<?> loadClass3 = ie6.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                loadClass3.getClass();
                Method method2 = loadClass3.getMethod("getBounds", (Class[]) null);
                Method method3 = loadClass3.getMethod("getType", (Class[]) null);
                Method method4 = loadClass3.getMethod("getState", (Class[]) null);
                method2.getClass();
                c26 c26 = b26.a;
                if (method2.getReturnType().equals(kl8.u(c26.b(Rect.class))) && Modifier.isPublic(method2.getModifiers())) {
                    method3.getClass();
                    if (method3.getReturnType().equals(kl8.u(c26.b(cls))) && Modifier.isPublic(method3.getModifiers())) {
                        method4.getClass();
                        if (method4.getReturnType().equals(kl8.u(c26.b(cls)))) {
                            break;
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
                ClassLoader classLoader = ie6.a;
                Class<?> loadClass4 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                loadClass4.getClass();
                Method method5 = loadClass4.getMethod("getDisplayFoldFeatures", (Class[]) null);
                Type genericReturnType = method5.getGenericReturnType();
                genericReturnType.getClass();
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                type.getClass();
                Class cls3 = (Class) type;
                if (Modifier.isPublic(method5.getModifiers())) {
                    if (method5.getReturnType().equals(List.class)) {
                        Class<?> loadClass5 = classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                        loadClass5.getClass();
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 3:
                Class<?> loadClass6 = ie6.a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                loadClass6.getClass();
                Method method6 = loadClass6.getMethod("getType", (Class[]) null);
                Method method7 = loadClass6.getMethod("hasProperty", new Class[]{cls});
                Method method8 = loadClass6.getMethod("hasProperties", new Class[]{int[].class});
                method6.getClass();
                if (Modifier.isPublic(method6.getModifiers())) {
                    cls.getClass();
                    if (method6.getReturnType().equals(cls)) {
                        method7.getClass();
                        if (Modifier.isPublic(method7.getModifiers())) {
                            Class cls4 = Boolean.TYPE;
                            cls4.getClass();
                            if (method7.getReturnType().equals(cls4)) {
                                method8.getClass();
                                if (Modifier.isPublic(method8.getModifiers())) {
                                    break;
                                }
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 4:
                ClassLoader classLoader2 = ie6.a;
                Class<?> loadClass7 = classLoader2.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                loadClass7.getClass();
                Method method9 = loadClass7.getMethod("getSupportedWindowFeatures", (Class[]) null);
                method9.getClass();
                if (Modifier.isPublic(method9.getModifiers())) {
                    Class<?> loadClass8 = classLoader2.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                    loadClass8.getClass();
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 5:
                try {
                    Class<?> loadClass9 = ((ClassLoader) ie6.b.x).loadClass("java.util.function.Consumer");
                    loadClass9.getClass();
                    cls2 = loadClass9;
                } catch (ClassNotFoundException unused) {
                }
                if (cls2 != null) {
                    Class<?> loadClass10 = ie6.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    loadClass10.getClass();
                    Method method10 = loadClass10.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, cls2});
                    Method method11 = loadClass10.getMethod("removeWindowLayoutInfoListener", new Class[]{cls2});
                    method10.getClass();
                    if (Modifier.isPublic(method10.getModifiers())) {
                        method11.getClass();
                        break;
                    }
                    z = false;
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            default:
                return Boolean.valueOf(ie6.d(ie6));
        }
    }
}
