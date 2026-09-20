package defpackage;

import java.util.ArrayList;

/* renamed from: rm7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class rm7 extends qm7 {
    public final /* synthetic */ js a;
    public final /* synthetic */ sm7 b;

    public rm7(sm7 sm7, js jsVar) {
        this.b = sm7;
        this.a = jsVar;
    }

    public final void a(km7 km7) {
        ((ArrayList) this.a.get(this.b.x)).remove(km7);
        km7.z(this);
    }
}
