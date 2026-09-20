package defpackage;

/* renamed from: i50  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class i50 extends k21 {
    public int D;
    public int E;
    public j50 F;

    public boolean getAllowsGoneWidget() {
        return this.F.s0;
    }

    public int getMargin() {
        return this.F.t0;
    }

    public int getType() {
        return this.D;
    }

    public final void h(g31 g31, boolean z) {
        int i = this.D;
        this.E = i;
        if (z) {
            if (i == 5) {
                this.E = 1;
            } else if (i == 6) {
                this.E = 0;
            }
        } else if (i == 5) {
            this.E = 0;
        } else if (i == 6) {
            this.E = 1;
        }
        if (g31 instanceof j50) {
            ((j50) g31).r0 = this.E;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.F.s0 = z;
    }

    public void setDpMargin(int i) {
        this.F.t0 = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.F.t0 = i;
    }

    public void setType(int i) {
        this.D = i;
    }
}
