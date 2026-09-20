package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: mv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mv8 extends tw8 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Bundle D;
    public final /* synthetic */ yw8 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mv8(yw8 yw8, String str, String str2, Bundle bundle, int i) {
        super(yw8, true);
        this.A = i;
        switch (i) {
            case 1:
                this.B = str;
                this.C = str2;
                this.D = bundle;
                Objects.requireNonNull(yw8);
                this.E = yw8;
                super(yw8, true);
                return;
            default:
                this.B = str;
                this.C = str2;
                this.D = bundle;
                Objects.requireNonNull(yw8);
                this.E = yw8;
                return;
        }
    }

    public final void a() {
        switch (this.A) {
            case b85.b:
                cu8 cu8 = this.E.f;
                z65.k(cu8);
                cu8.clearConditionalUserProperty(this.B, this.C, this.D);
                return;
            default:
                long j = this.w;
                long j2 = this.x;
                cu8 cu82 = this.E.f;
                z65.k(cu82);
                cu82.logEventWithElapsedTime(this.B, this.C, this.D, true, true, j, j2);
                return;
        }
    }
}
