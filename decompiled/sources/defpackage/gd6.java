package defpackage;

import android.graphics.Canvas;

/* renamed from: gd6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class gd6 extends z65 {
    public float c;
    public float d;
    public final /* synthetic */ kd6 e;

    public gd6(kd6 kd6, float f, float f2) {
        this.e = kd6;
        this.c = f;
        this.d = f2;
    }

    public void K(String str) {
        kd6 kd6 = this.e;
        Canvas canvas = (Canvas) kd6.x;
        if (kd6.N0()) {
            id6 id6 = (id6) kd6.z;
            if (id6.b) {
                canvas.drawText(str, this.c, this.d, id6.d);
            }
            id6 id62 = (id6) kd6.z;
            if (id62.c) {
                canvas.drawText(str, this.c, this.d, id62.e);
            }
        }
        this.c = ((id6) kd6.z).d.measureText(str) + this.c;
    }
}
