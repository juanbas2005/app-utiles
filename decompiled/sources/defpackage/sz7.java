package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: sz7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sz7 extends yz7 {
    public static final sz7 a = new Object();
    public static final az7 b = az7.PLAN_AMIGO;
    public static final String c = "Usted tiene activado el Plan Amigos.";
    public static final Map d;

    /* JADX WARNING: type inference failed for: r0v0, types: [sz7, java.lang.Object] */
    static {
        Map singletonMap = Collections.singletonMap("amigoStatus", new k26("Usted ((?:no )?tiene activado el Plan Amigos)"));
        singletonMap.getClass();
        d = singletonMap;
    }

    public final Map a() {
        return d;
    }

    public final String b() {
        return c;
    }

    public final az7 c() {
        return b;
    }
}
