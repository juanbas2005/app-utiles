package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* renamed from: yq5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class yq5 {
    public static final k26 d = new k26("mipromocion-contenido-movil\"\\s*>\\s*<img\\s+src=\"([^\"]+)\"");
    public static final k26 e = new k26("mipromocion-contenido\"\\s*>\\s*<img\\s+src=\"([^\"]+)\"");
    public static final k26 f = new k26("href=\"([^\"]+)\"[^>]*class=\"btn comprar-mv\"");
    public static final k26 g = new k26("/sites/default/files/promocion/[^\"'()<>\\s]+\\.svg");
    public final h81 a;
    public final z97 b = new z97(new pp5(1));
    public volatile ArrayList c;

    public yq5(h81 h81) {
        this.a = h81;
    }

    public static final String a(yq5 yq5, String str) {
        if (k57.u0(str, "http", false)) {
            return str;
        }
        return b81.n(d57.l1("https://www.etecsa.cu/", '/'), str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    public final Object b(h61 h61) {
        vq5 vq5;
        int i;
        if (h61 instanceof vq5) {
            vq5 = (vq5) h61;
            int i2 = vq5.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vq5.B = i2 - Integer.MIN_VALUE;
                Object obj = vq5.z;
                p81 p81 = p81.w;
                i = vq5.B;
                if (i != 0) {
                    o85.q(obj);
                    ArrayList arrayList = this.c;
                    if (arrayList != null) {
                        return arrayList;
                    }
                    h81 h81 = this.a;
                    f70 f70 = new f70(this, (f61) null, 11);
                    vq5.B = 1;
                    Object e0 = ar7.e0(h81, f70, vq5);
                    if (e0 == p81) {
                        return p81;
                    }
                    return e0;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        return new m66(e3);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        vq5 = new vq5(this, h61);
        Object obj2 = vq5.z;
        p81 p812 = p81.w;
        i = vq5.B;
        if (i != 0) {
        }
    }
}
