package defpackage;

import java.util.Objects;

/* renamed from: vv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vv8 extends tw8 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ yw8 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vv8(yw8 yw8, String str, int i) {
        super(yw8, true);
        this.A = i;
        switch (i) {
            case 1:
                this.B = str;
                Objects.requireNonNull(yw8);
                this.C = yw8;
                super(yw8, true);
                return;
            default:
                this.B = str;
                Objects.requireNonNull(yw8);
                this.C = yw8;
                return;
        }
    }

    public final void a() {
        switch (this.A) {
            case b85.b:
                cu8 cu8 = this.C.f;
                z65.k(cu8);
                cu8.beginAdUnitExposure(this.B, this.x);
                return;
            default:
                cu8 cu82 = this.C.f;
                z65.k(cu82);
                cu82.endAdUnitExposure(this.B, this.x);
                return;
        }
    }
}
