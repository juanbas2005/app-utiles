package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;

/* renamed from: fd6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fd6 extends gd6 {
    public final Path f;
    public final /* synthetic */ kd6 g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fd6(kd6 kd6, Path path, float f2) {
        super(kd6, f2, 0.0f);
        this.g = kd6;
        this.f = path;
    }

    public final void K(String str) {
        String str2;
        kd6 kd6 = this.g;
        Canvas canvas = (Canvas) kd6.x;
        if (kd6.N0()) {
            id6 id6 = (id6) kd6.z;
            if (id6.b) {
                str2 = str;
                canvas.drawTextOnPath(str2, this.f, this.c, this.d, id6.d);
            } else {
                str2 = str;
            }
            id6 id62 = (id6) kd6.z;
            if (id62.c) {
                canvas.drawTextOnPath(str2, this.f, this.c, this.d, id62.e);
            }
        } else {
            str2 = str;
        }
        this.c = ((id6) kd6.z).d.measureText(str2) + this.c;
    }
}
