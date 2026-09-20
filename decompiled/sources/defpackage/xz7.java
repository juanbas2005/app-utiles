package defpackage;

import java.util.Map;

/* renamed from: xz7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xz7 extends yz7 {
    public static final xz7 a = new Object();
    public static final az7 b = az7.CONSULTAR_DATOS;
    public static final String c = "Tarifa: No activa. Datos: 0.0 GB validos 0 dias.";
    public static final Map d = sf4.V(new yb5("tarifa", new k26("Tarifa:\\s*([^.]+)\\.")), new yb5("datos", new k26("Datos:\\s*([\\d.]+\\s*(?:GB|MB))\\s+validos")), new yb5("datosDias", new k26("Datos:[^:]*?validos\\s+(\\d+)\\s*dias")), new yb5("paquetes", new k26("Paquetes:\\s*([\\d.]+\\s*(?:MB|GB))")), new yb5("paquetesLte", new k26("Paquetes:[^+]+\\+\\s*([\\d.]+\\s*(?:MB|GB))\\s*LTE")), new yb5("paquetesDias", new k26("Paquetes:[^:]*?validos\\s+(\\d+)\\s*dias")), new yb5("diaria", new k26("Diaria:\\s*([\\d.]+\\s*(?:MB|GB))")), new yb5("todus", new k26("toDus:\\s*([\\d.]+\\s*(?:MB|GB))")), new yb5("toDusDias", new k26("toDus:\\s*[\\d.]+\\s*(?:MB|GB)\\s+validos\\s+(\\d+)\\s*dias")));

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
