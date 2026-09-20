package defpackage;

import io.github.jan.supabase.auth.jwt.AMREntry;

/* renamed from: p  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class p implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ AMREntry x;

    public /* synthetic */ p(AMREntry aMREntry, int i) {
        this.w = i;
        this.x = aMREntry;
    }

    public final Object b() {
        int i = this.w;
        AMREntry aMREntry = this.x;
        switch (i) {
            case b85.b:
                return AMREntry._init_$lambda$0(aMREntry);
            default:
                return AMREntry.timestamp_delegate$lambda$0(aMREntry);
        }
    }
}
