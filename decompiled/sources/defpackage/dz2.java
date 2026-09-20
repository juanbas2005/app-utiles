package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: dz2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dz2 extends in8 implements wc5 {
    public final /* synthetic */ int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dz2(int i) {
        super(8);
        this.x = i;
    }

    public void R0(String str) {
        switch (this.x) {
            case b85.b:
                str.getClass();
                List list = b53.a;
                int i = 0;
                int i2 = 0;
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i3 = i2 + 1;
                    if (sg3.k(charAt, 32) <= 0 || d57.y0("\"(),/:;<=>?@[\\]{}", charAt)) {
                        StringBuilder q = b81.q("Header name '", str, "' contains illegal character '");
                        q.append(str.charAt(i2));
                        q.append("' (code ");
                        throw new IllegalArgumentException(f21.j(q, str.charAt(i2) & 255, ')'));
                    }
                    i++;
                    i2 = i3;
                }
                return;
            default:
                super.R0(str);
                return;
        }
    }

    public void S0(String str) {
        switch (this.x) {
            case b85.b:
                str.getClass();
                List list = b53.a;
                int i = 0;
                int i2 = 0;
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i3 = i2 + 1;
                    if (sg3.k(charAt, 32) >= 0 || charAt == 9) {
                        i++;
                        i2 = i3;
                    } else {
                        StringBuilder q = b81.q("Header value '", str, "' contains illegal character '");
                        q.append(str.charAt(i2));
                        q.append("' (code ");
                        throw new IllegalArgumentException(f21.j(q, str.charAt(i2) & 255, ')'));
                    }
                }
                return;
            default:
                super.S0(str);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [b57, gz2] */
    public gz2 d1() {
        Map map = (Map) this.w;
        map.getClass();
        return new b57(map, true);
    }
}
