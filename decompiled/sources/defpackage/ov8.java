package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: ov8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ov8 extends tw8 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ yw8 D;
    public final /* synthetic */ Object E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ov8(yw8 yw8, String str, String str2, xt8 xt8) {
        super(yw8, true);
        this.B = str;
        this.C = str2;
        this.E = xt8;
        Objects.requireNonNull(yw8);
        this.D = yw8;
    }

    public final void a() {
        switch (this.A) {
            case b85.b:
                cu8 cu8 = this.D.f;
                z65.k(cu8);
                cu8.getConditionalUserProperties(this.B, this.C, (xt8) this.E);
                return;
            default:
                cu8 cu82 = this.D.f;
                z65.k(cu82);
                cu82.setCurrentScreenByScionActivityInfo((jv8) this.E, this.B, this.C, this.w);
                return;
        }
    }

    public void b() {
        switch (this.A) {
            case b85.b:
                ((xt8) this.E).z((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ov8(yw8 yw8, jv8 jv8, String str, String str2) {
        super(yw8, true);
        this.E = jv8;
        this.B = str;
        this.C = str2;
        Objects.requireNonNull(yw8);
        this.D = yw8;
    }
}
