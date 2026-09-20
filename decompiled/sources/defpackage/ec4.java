package defpackage;

import java.security.PrivilegedAction;
import java.util.ServiceLoader;

/* renamed from: ec4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ec4 implements PrivilegedAction {
    public final /* synthetic */ ClassLoader a;

    public /* synthetic */ ec4(ClassLoader classLoader) {
        this.a = classLoader;
    }

    public final Object run() {
        return ServiceLoader.load(tq4.class, this.a);
    }
}
