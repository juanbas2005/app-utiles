package defpackage;

import android.app.Activity;

/* renamed from: xw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xw8 extends tw8 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Activity B;
    public final /* synthetic */ zb2 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xw8(zb2 zb2, Activity activity, int i) {
        super((yw8) zb2.x, true);
        this.A = i;
        switch (i) {
            case 1:
                this.B = activity;
                this.C = zb2;
                super((yw8) zb2.x, true);
                return;
            case 2:
                this.B = activity;
                this.C = zb2;
                super((yw8) zb2.x, true);
                return;
            case 3:
                this.B = activity;
                this.C = zb2;
                super((yw8) zb2.x, true);
                return;
            case 4:
                this.B = activity;
                this.C = zb2;
                super((yw8) zb2.x, true);
                return;
            default:
                this.B = activity;
                this.C = zb2;
                return;
        }
    }

    public final void a() {
        switch (this.A) {
            case b85.b:
                cu8 cu8 = ((yw8) this.C.x).f;
                z65.k(cu8);
                cu8.onActivityStartedByScionActivityInfo(jv8.f(this.B), this.x);
                return;
            case 1:
                cu8 cu82 = ((yw8) this.C.x).f;
                z65.k(cu82);
                cu82.onActivityResumedByScionActivityInfo(jv8.f(this.B), this.x);
                return;
            case 2:
                cu8 cu83 = ((yw8) this.C.x).f;
                z65.k(cu83);
                cu83.onActivityPausedByScionActivityInfo(jv8.f(this.B), this.x);
                return;
            case 3:
                cu8 cu84 = ((yw8) this.C.x).f;
                z65.k(cu84);
                cu84.onActivityStoppedByScionActivityInfo(jv8.f(this.B), this.x);
                return;
            default:
                cu8 cu85 = ((yw8) this.C.x).f;
                z65.k(cu85);
                cu85.onActivityDestroyedByScionActivityInfo(jv8.f(this.B), this.x);
                return;
        }
    }
}
