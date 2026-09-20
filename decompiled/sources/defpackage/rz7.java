package defpackage;

import java.util.Map;

/* renamed from: rz7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rz7 extends yz7 {
    public static final rz7 a = new Object();
    public static final az7 b = az7.CONSULTAR_BONO;
    public static final String c = "Datos.cu 0 MB vence 00-00-27.";
    public static final Map d = sf4.V(new yb5("bonoIlimitado", new k26("ilimitados:?\\s*(.+?)\\s+vence")), new yb5("bonoIlimitadoVence", new k26("ilimitados:?[^.]*?vence\\s+([\\d-]+)")), new yb5("bonoDatosCu", new k26("Datos\\.cu\\s+([\\d.]+\\s*MB)")), new yb5("bonoDatosCuVence", new k26("Datos\\.cu\\s+[\\d.]+\\s*MB\\s+vence\\s+([\\d-]+)")), new yb5("bonoLte", new k26("LTE\\s+([\\d.]+\\s*MB)")), new yb5("bonoLteVence", new k26("LTE\\s+[\\d.]+\\s*MB\\s+vence\\s+([\\d-]+)")), new yb5("bonoCash", new k26("\\$([\\d.]+)")), new yb5("bonoCashVence", new k26("\\$[\\d.]+\\s+vence\\s+([\\d-]+)")));

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
