package defpackage;

import java.util.Map;

/* renamed from: tz7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tz7 extends yz7 {
    public static final tz7 a = new Object();
    public static final az7 b = az7.CONSULTAR_SMS;
    public static final String c = "Usted dispone de 00 SMS validos por 0 dias";
    public static final Map d = sf4.V(new yb5("sms", new k26("dispone de\\s*(\\d+)\\s*SMS")), new yb5("smsDias", new k26("validos por\\s*(\\d+)\\s*dias")));

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
