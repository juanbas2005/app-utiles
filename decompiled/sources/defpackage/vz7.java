package defpackage;

import java.util.Map;

/* renamed from: vz7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vz7 extends yz7 {
    public static final vz7 a = new Object();
    public static final az7 b = az7.CONSULTAR_SALDO;
    public static final String c = "Saldo: 0.0 CUP. Datos: 0.0 GB. Voz: 00:00:00. Linea activa hasta 00-00-00 vence 00-00-27.";
    public static final Map d = sf4.V(new yb5("saldo", new k26("Saldo:\\s*([\\d.]+)\\s*CUP")), new yb5("datos", new k26("Datos:\\s*([\\d.]+\\s*(?:GB|MB))(?:\\s*\\+|\\.)")), new yb5("datosLte", new k26("\\+\\s*([\\d.]+\\s*(?:GB|MB))\\s*LTE")), new yb5("voz", new k26("Voz:\\s*(\\d{2}:\\d{2}:\\d{2})")), new yb5("fechaActiva", new k26("activa hasta\\s*([\\d-]+)")), new yb5("fechaVence", new k26("vence\\s*([\\d-]+)")));

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
