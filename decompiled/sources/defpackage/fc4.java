package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: fc4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class fc4 {
    public static volatile int a;
    public static final tq4 b = new tq4(1);
    public static final tq4 c = new tq4(0);
    public static volatile tq4 d;
    public static final String[] e = {"2.0"};

    static {
        String str;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            str.equalsIgnoreCase("true");
        }
    }

    public static ArrayList a() {
        ServiceLoader<S> serviceLoader;
        ArrayList arrayList = new ArrayList();
        ClassLoader classLoader = fc4.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        tq4 tq4 = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i = d56.a;
                if (b81.B(2) >= b81.B(d56.b)) {
                    d56.b().println("SLF4J(I): ".concat(str));
                }
                tq4 = (tq4) classLoader.loadClass(property).getConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                d56.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e2);
            } catch (ClassCastException e3) {
                d56.a("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e3);
            }
        }
        if (tq4 != null) {
            arrayList.add(tq4);
            return arrayList;
        }
        if (System.getSecurityManager() == null) {
            serviceLoader = ServiceLoader.load(tq4.class, classLoader);
        } else {
            serviceLoader = (ServiceLoader) AccessController.doPrivileged(new ec4(classLoader));
        }
        Iterator<S> it = serviceLoader.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((tq4) it.next());
            } catch (ServiceConfigurationError e4) {
                d56.b().println("SLF4J(E): ".concat("A service provider failed to instantiate:\n" + e4.getMessage()));
            }
        }
        return arrayList;
    }

    public static cc4 b(String str) {
        tq4 tq4;
        r73 r73;
        if (a == 0) {
            synchronized (fc4.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = a;
        if (i == 1) {
            tq4 = b;
        } else if (i == 2) {
            h.s("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            return null;
        } else if (i == 3) {
            tq4 = d;
        } else if (i == 4) {
            tq4 = c;
        } else {
            h.s("Unreachable code");
            return null;
        }
        switch (tq4.a) {
            case b85.b:
                r73 = (tz2) tq4.b;
                break;
            default:
                r73 = (a77) tq4.b;
                break;
        }
        return r73.f(str);
    }

    public static final void c() {
        Enumeration<URL> enumeration;
        try {
            ArrayList a2 = a();
            g(a2);
            if (!a2.isEmpty()) {
                d = (tq4) a2.get(0);
                d.getClass();
                d.getClass();
                a = 3;
                e(a2);
            } else {
                a = 4;
                d56.c("No SLF4J providers were found.");
                d56.c("Defaulting to no-operation (NOP) logger implementation");
                d56.c("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = fc4.class.getClassLoader();
                    if (classLoader == null) {
                        enumeration = ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class");
                    } else {
                        enumeration = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    }
                    while (enumeration.hasMoreElements()) {
                        linkedHashSet.add(enumeration.nextElement());
                    }
                } catch (IOException e2) {
                    d56.a("Error getting resources from path", e2);
                }
                f(linkedHashSet);
            }
            d();
            if (a == 3) {
                try {
                    switch (d.a) {
                        case b85.b:
                            boolean z = false;
                            for (String startsWith : e) {
                                if ("2.0.99".startsWith(startsWith)) {
                                    z = true;
                                }
                            }
                            if (!z) {
                                d56.c("The requested version " + "2.0.99" + " by your slf4j provider is not compatible with " + Arrays.asList(e).toString());
                                d56.c("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                                return;
                            }
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    d56.a("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e3) {
            a = 2;
            d56.a("Failed to instantiate SLF4J LoggerFactory", e3);
            throw new IllegalStateException("Unexpected initialization failure", e3);
        }
    }

    public static void d() {
        tq4 tq4 = b;
        synchronized (tq4) {
            try {
                ((a77) tq4.b).w = true;
                a77 a77 = (a77) tq4.b;
                a77.getClass();
                Iterator it = new ArrayList(a77.x.values()).iterator();
                while (it.hasNext()) {
                    z67 z67 = (z67) it.next();
                    z67.x = b(z67.w);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((a77) b.b).y;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                b77 b77 = (b77) it2.next();
                if (b77 != null) {
                    z67 z672 = b77.b;
                    String str = z672.w;
                    if (z672.x == null) {
                        h.s("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(z672.x instanceof sq4)) {
                        if (!z672.k()) {
                            d56.c(str);
                        } else if (z672.i(b77.a) && z672.k()) {
                            try {
                                z672.z.invoke(z672.x, new Object[]{b77});
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (b77.b.k()) {
                        d56.c("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        d56.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        d56.c("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(b77.b.x instanceof sq4)) {
                        d56.c("The following set of substitute loggers may have been accessed");
                        d56.c("during the initialization phase. Logging calls during this");
                        d56.c("phase were not honored. However, subsequent logging calls to these");
                        d56.c("loggers will work as normally expected.");
                        d56.c("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        a77 a772 = (a77) b.b;
        a772.x.clear();
        a772.y.clear();
    }

    public static void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            h.s("No providers were found which is impossible after successful initialization.");
        } else if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i = d56.a;
            if (b81.B(2) >= b81.B(d56.b)) {
                d56.b().println("SLF4J(I): ".concat(str));
            }
        } else {
            String str2 = "Connected with provider of type [" + ((tq4) arrayList.get(0)).getClass().getName() + "]";
            int i2 = d56.a;
            if (b81.B(1) >= b81.B(d56.b)) {
                d56.b().println("SLF4J(D): ".concat(str2));
            }
        }
    }

    public static void f(LinkedHashSet linkedHashSet) {
        if (!linkedHashSet.isEmpty()) {
            d56.c("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                d56.c("Ignoring binding found at [" + ((URL) it.next()) + "]");
            }
            d56.c("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
        }
    }

    public static void g(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            d56.c("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d56.c("Found provider [" + ((tq4) it.next()) + "]");
            }
            d56.c("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
