package defpackage;

import io.github.jan.supabase.auth.a;
import io.github.jan.supabase.auth.user.UserSession;

/* renamed from: cv  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class cv extends h61 {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ a C;
    public int D;
    public UserSession z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cv(a aVar, h61 h61) {
        super(h61);
        this.C = aVar;
    }

    public final Object s(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return a.l(this.C, (UserSession) null, false, this);
    }
}
