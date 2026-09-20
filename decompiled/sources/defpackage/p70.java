package defpackage;

import android.os.Build;

/* renamed from: p70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class p70 extends p50 {
    public final /* synthetic */ int b;
    public final int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p70(x21 x21, int i) {
        super(x21);
        this.b = i;
        x21.getClass();
        switch (i) {
            case 4:
                super(x21);
                this.c = 9;
                return;
            default:
                this.c = 6;
                return;
        }
    }

    public final boolean c(be8 be8) {
        int i = this.b;
        be8.getClass();
        switch (i) {
            case b85.b:
                return be8.j.c;
            case 1:
                return be8.j.e;
            case 2:
                if (be8.j.a == yy4.x) {
                    return true;
                }
                return false;
            case 3:
                if (be8.j.a == yy4.y) {
                    return true;
                }
                return false;
            default:
                return be8.j.f;
        }
    }

    public final int d() {
        switch (this.b) {
            case b85.b:
                return this.c;
            case 1:
                return this.c;
            case 2:
                return this.c;
            case 3:
                return this.c;
            default:
                return this.c;
        }
    }

    public final boolean e(Object obj) {
        boolean booleanValue;
        switch (this.b) {
            case b85.b:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                vy4 vy4 = (vy4) obj;
                vy4.getClass();
                if (vy4.e || !vy4.a || (Build.VERSION.SDK_INT >= 26 && !vy4.b)) {
                    return true;
                }
                return false;
            case 3:
                vy4 vy42 = (vy4) obj;
                vy42.getClass();
                if (!vy42.a || vy42.c || vy42.e) {
                    return true;
                }
                return false;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p70(q70 q70) {
        super(q70);
        this.b = 1;
        q70.getClass();
        this.c = 5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p70(xy4 xy4, int i) {
        super(xy4);
        this.b = i;
        xy4.getClass();
        switch (i) {
            case 3:
                super(xy4);
                this.c = 7;
                return;
            default:
                this.c = 7;
                return;
        }
    }
}
