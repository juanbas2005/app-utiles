package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: zv8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zv8 extends tw8 {
    public final /* synthetic */ int A;
    public final /* synthetic */ xt8 B;
    public final /* synthetic */ yw8 C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zv8(yw8 yw8, xt8 xt8, int i) {
        super(yw8, true);
        this.A = i;
        switch (i) {
            case 1:
                this.B = xt8;
                Objects.requireNonNull(yw8);
                this.C = yw8;
                super(yw8, true);
                return;
            case 2:
                this.B = xt8;
                Objects.requireNonNull(yw8);
                this.C = yw8;
                super(yw8, true);
                return;
            default:
                this.B = xt8;
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
                cu8.getGmpAppId(this.B);
                return;
            case 1:
                cu8 cu82 = this.C.f;
                z65.k(cu82);
                cu82.getCachedAppInstanceId(this.B);
                return;
            case 2:
                cu8 cu83 = this.C.f;
                z65.k(cu83);
                cu83.generateEventId(this.B);
                return;
            case 3:
                cu8 cu84 = this.C.f;
                z65.k(cu84);
                cu84.getCurrentScreenName(this.B);
                return;
            default:
                cu8 cu85 = this.C.f;
                z65.k(cu85);
                cu85.getCurrentScreenClass(this.B);
                return;
        }
    }

    public final void b() {
        int i = this.A;
        xt8 xt8 = this.B;
        switch (i) {
            case b85.b:
                xt8.z((Bundle) null);
                return;
            case 1:
                xt8.z((Bundle) null);
                return;
            case 2:
                xt8.z((Bundle) null);
                return;
            case 3:
                xt8.z((Bundle) null);
                return;
            default:
                xt8.z((Bundle) null);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zv8(yw8 yw8, xt8 xt8, int i, boolean z) {
        super(yw8, true);
        this.A = i;
        this.B = xt8;
        this.C = yw8;
    }
}
