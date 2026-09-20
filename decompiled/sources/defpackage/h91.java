package defpackage;

import java.util.Objects;

/* renamed from: h91  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h91 {
    public final ge1 a;
    public final wr0 b;

    public h91(ge1 ge1, md2 md2) {
        this.a = ge1;
        this.b = new wr0(md2);
    }

    public final void a(String str) {
        wr0 wr0 = this.b;
        synchronized (wr0) {
            if (!Objects.equals((String) wr0.y, str)) {
                wr0.V((md2) wr0.x, str, (String) wr0.z);
                wr0.y = str;
            }
        }
    }
}
