package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: kv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class kv8 extends tw8 {
    public final /* synthetic */ int A;
    public final /* synthetic */ yw8 B;
    public final /* synthetic */ Object C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kv8(yw8 yw8, Bundle bundle) {
        super(yw8, true);
        this.A = 1;
        this.C = bundle;
        Objects.requireNonNull(yw8);
        this.B = yw8;
    }

    public final void a() {
        switch (this.A) {
            case b85.b:
                cu8 cu8 = this.B.f;
                z65.k(cu8);
                cu8.setUserProperty("fcm", "_ln", new z25(this.C), true, this.w);
                return;
            case 1:
                cu8 cu82 = this.B.f;
                z65.k(cu82);
                cu82.setConditionalUserProperty((Bundle) this.C, this.w);
                return;
            case 2:
                cu8 cu83 = this.B.f;
                z65.k(cu83);
                cu83.retrieveAndUploadBatches(new xv8(this, (c49) this.C));
                return;
            case 3:
                cu8 cu84 = this.B.f;
                z65.k(cu84);
                cu84.logHealthData(5, "Error with data collection. Data lost.", new z25((Exception) this.C), new z25((Object) null), new z25((Object) null));
                return;
            default:
                cu8 cu85 = this.B.f;
                z65.k(cu85);
                cu85.registerOnMeasurementEventListener((ww8) this.C);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv8(yw8 yw8, Object obj, int i) {
        super(yw8, true);
        this.A = i;
        this.C = obj;
        this.B = yw8;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kv8(yw8 yw8, Exception exc) {
        super(yw8, false);
        this.A = 3;
        this.C = exc;
        this.B = yw8;
    }
}
