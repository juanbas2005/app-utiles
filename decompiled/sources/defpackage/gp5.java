package defpackage;

import android.os.Handler;

/* renamed from: gp5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gp5 implements t54 {
    public static final gp5 E = new gp5();
    public Handler A;
    public final w54 B = new w54(this, true);
    public final y0 C = new y0(19, this);
    public final wv2 D = new wv2(28, this);
    public int w;
    public int x;
    public boolean y = true;
    public boolean z = true;

    public final void a() {
        int i = this.x + 1;
        this.x = i;
        if (i != 1) {
            return;
        }
        if (this.y) {
            this.B.f1(j54.ON_RESUME);
            this.y = false;
            return;
        }
        Handler handler = this.A;
        handler.getClass();
        handler.removeCallbacks(this.C);
    }

    public final in8 k() {
        return this.B;
    }
}
