package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: ie6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ie6 {
    public final ClassLoader a;
    public final ns8 b;
    public final y06 c;

    public ie6(ClassLoader classLoader, ns8 ns8) {
        this.a = classLoader;
        this.b = ns8;
        this.c = new y06(classLoader);
    }

    public static final boolean d(ie6 ie6) {
        Class<?> loadClass = ie6.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        loadClass.getClass();
        Method method = loadClass.getMethod("addWindowLayoutInfoListener", new Class[]{Context.class, Consumer.class});
        Method method2 = loadClass.getMethod("removeWindowLayoutInfoListener", new Class[]{Consumer.class});
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        method2.getClass();
        if (Modifier.isPublic(method2.getModifiers())) {
            return true;
        }
        return false;
    }

    public final WindowLayoutComponent a() {
        int a2;
        y06 y06 = this.c;
        y06.getClass();
        boolean z = false;
        try {
            y06.a.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (a35.o(new hx4(14, y06), "WindowExtensionsProvider#getWindowExtensions is not valid") && a35.o(new he6(this, 0), "WindowExtensions#getWindowLayoutComponent is not valid") && a35.o(new he6(this, 1), "FoldingFeature class is not valid") && (a2 = ma2.a()) >= 1) {
                if (a2 == 1) {
                    z = b();
                } else if (a2 < 5) {
                    z = c();
                } else if (c() && a35.o(new he6(this, 3), "DisplayFoldFeature is not valid") && a35.o(new he6(this, 2), "SupportedWindowFeatures is not valid") && a35.o(new he6(this, 4), "WindowLayoutComponent#getSupportedWindowFeatures is not valid")) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return a35.o(new he6(this, 5), "WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid");
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        if (a35.o(new he6(this, 6), "WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid")) {
            return true;
        }
        return false;
    }
}
