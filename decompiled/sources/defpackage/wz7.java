package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: wz7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wz7 extends yz7 {
    public static final wz7 a = new Object();
    public static final az7 b = az7.CONSULTAR_SALDO_NACIONAL;
    public static final String c = "Ud ha alcanzado el monto de recarga permitido de 0 CUP. Puede recargar posterior al dia 00-00-00";
    public static final Map d;

    /* JADX WARNING: type inference failed for: r0v0, types: [wz7, java.lang.Object] */
    static {
        Map singletonMap = Collections.singletonMap("fechaNacional", new k26("posterior al dia\\s*([\\d-]+)"));
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
