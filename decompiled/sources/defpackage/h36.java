package defpackage;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* renamed from: h36  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class h36 {
    public static final k26 a = new k26("Usted ha recibido ([\\d.]+) CUP del numero (\\d+)[.,]\\s*Saldo principal (\\S+) CUP, linea activa hasta ([^,]+), vence (.+)");
    public static final k26 b = new k26("Usted ha transferido ([\\d.]+) CUP al numero (\\d+)[.,]\\s*Saldo principal (\\S+) CUP, linea activa hasta ([^,]+), vence (.+)");
    public static final k26 c = new k26("[Hh]a comprado\\s+(?:un plan(?:\\s+de)?\\s+)?(.+)");
    public static final k26 d = new k26("Importe:\\s*([\\d.,]+)");
    public static final k26 e = new k26("Importe Pagado:\\s*([\\d.,]+)");
    public static final k26 f = new k26("Se desconto\\s+([\\d.,]+)");

    public static final String a(double d2) {
        return String.format("%.2f CUP", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
    }

    public static final String b(long j) {
        String format = new SimpleDateFormat("d/M/yyyy h:mm a", Locale.getDefault()).format(new Date(j));
        format.getClass();
        return format;
    }
}
