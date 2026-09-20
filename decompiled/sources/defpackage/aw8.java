package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: aw8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class aw8 extends tw8 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ xt8 D;
    public final /* synthetic */ yw8 E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aw8(yw8 yw8, String str, String str2, boolean z, xt8 xt8) {
        super(yw8, true);
        this.A = str;
        this.B = str2;
        this.C = z;
        this.D = xt8;
        Objects.requireNonNull(yw8);
        this.E = yw8;
    }

    public final void a() {
        cu8 cu8 = this.E.f;
        z65.k(cu8);
        cu8.getUserProperties(this.A, this.B, this.C, this.D);
    }

    public final void b() {
        this.D.z((Bundle) null);
    }
}
