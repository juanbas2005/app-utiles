package defpackage;

import java.util.Arrays;

/* renamed from: ly6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ly6 implements Comparable {
    public float A;
    public boolean B = false;
    public final float[] C = new float[9];
    public final float[] D = new float[9];
    public ns[] E = new ns[16];
    public int F = 0;
    public int G = 0;
    public int H;
    public boolean w;
    public int x = -1;
    public int y = -1;
    public int z = 0;

    public ly6(int i) {
        this.H = i;
    }

    public final void a(ns nsVar) {
        int i = 0;
        while (true) {
            int i2 = this.F;
            ns[] nsVarArr = this.E;
            if (i >= i2) {
                if (i2 >= nsVarArr.length) {
                    this.E = (ns[]) Arrays.copyOf(nsVarArr, nsVarArr.length * 2);
                }
                ns[] nsVarArr2 = this.E;
                int i3 = this.F;
                nsVarArr2[i3] = nsVar;
                this.F = i3 + 1;
                return;
            } else if (nsVarArr[i] != nsVar) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void b(ns nsVar) {
        int i = this.F;
        int i2 = 0;
        while (i2 < i) {
            if (this.E[i2] == nsVar) {
                while (i2 < i - 1) {
                    ns[] nsVarArr = this.E;
                    int i3 = i2 + 1;
                    nsVarArr[i2] = nsVarArr[i3];
                    i2 = i3;
                }
                this.F--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.H = 5;
        this.z = 0;
        this.x = -1;
        this.y = -1;
        this.A = 0.0f;
        this.B = false;
        int i = this.F;
        for (int i2 = 0; i2 < i; i2++) {
            this.E[i2] = null;
        }
        this.F = 0;
        this.G = 0;
        this.w = false;
        Arrays.fill(this.D, 0.0f);
    }

    public final int compareTo(Object obj) {
        return this.x - ((ly6) obj).x;
    }

    public final void d(x64 x64, float f) {
        this.A = f;
        this.B = true;
        int i = this.F;
        this.y = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.E[i2].h(x64, this, false);
        }
        this.F = 0;
    }

    public final void e(x64 x64, ns nsVar) {
        int i = this.F;
        for (int i2 = 0; i2 < i; i2++) {
            this.E[i2].i(x64, nsVar, false);
        }
        this.F = 0;
    }

    public final String toString() {
        return "" + this.x;
    }
}
