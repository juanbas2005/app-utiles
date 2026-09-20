package defpackage;

import java.util.Map;

/* renamed from: uz7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uz7 extends yz7 {
    public static final uz7 a = new Object();
    public static final az7 b = az7.CONSULTAR_MINUTOS;
    public static final String c = "Usted dispone de 00:00:00 MIN NAC validos por 0 dias";
    public static final Map d = sf4.V(new yb5("voz", new k26("dispone de\\s*(\\d{2,3}:\\d{2}:\\d{2}|\\d+)\\s*MIN")), new yb5("vozDias", new k26("validos por\\s*(\\d+)\\s*dias")));

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
