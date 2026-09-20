package defpackage;

import com.google.protobuf.b;
import com.google.protobuf.d;
import com.google.protobuf.e;
import com.google.protobuf.f;
import com.google.protobuf.g;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: au5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class au5 {
    public static final au5 c = new au5();
    public final ns8 a = new ns8(1);
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final og6 a(Class cls) {
        boolean z;
        og6 og6;
        Class cls2;
        Charset charset = rf3.a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.b;
            og6 og62 = (og6) concurrentHashMap.get(cls);
            if (og62 != null) {
                return og62;
            }
            ns8 ns8 = this.a;
            ns8.getClass();
            Class cls3 = f.a;
            Class<b> cls4 = b.class;
            if (cls4.isAssignableFrom(cls) || (cls2 = f.a) == null || cls2.isAssignableFrom(cls)) {
                dw5 a2 = ((ue4) ns8.x).a(cls);
                if ((a2.d & 2) == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (cls4.isAssignableFrom(cls)) {
                        og6 = new e(f.c, ca2.a, a2.a);
                    } else {
                        g gVar = f.b;
                        aa2 aa2 = ca2.b;
                        if (aa2 != null) {
                            og6 = new e(gVar, aa2, a2.a);
                        } else {
                            h.s("Protobuf runtime is not correctly loaded.");
                            return null;
                        }
                    }
                } else if (cls4.isAssignableFrom(cls)) {
                    if (b81.B(a2.a()) != 1) {
                        og6 = d.q(a2, hz4.b, r74.b, f.c, ca2.a, mf4.b);
                    } else {
                        og6 = d.q(a2, hz4.b, r74.b, f.c, (aa2) null, mf4.b);
                    }
                } else if (b81.B(a2.a()) != 1) {
                    String str = "Protobuf runtime is not correctly loaded.";
                    fz4 fz4 = hz4.a;
                    p74 p74 = r74.a;
                    g gVar2 = f.b;
                    aa2 aa22 = ca2.b;
                    if (aa22 != null) {
                        og6 = d.q(a2, fz4, p74, gVar2, aa22, mf4.a);
                    } else {
                        h.s(str);
                        return null;
                    }
                } else {
                    og6 = d.q(a2, hz4.a, r74.a, f.b, (aa2) null, mf4.a);
                }
                og6 og63 = (og6) concurrentHashMap.putIfAbsent(cls, og6);
                if (og63 != null) {
                    return og63;
                }
                return og6;
            }
            h.q("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        ku4.j("messageType");
        return null;
    }
}
