package defpackage;

import io.github.jan.supabase.storage.vectors.index.ListIndexesResponse;

/* renamed from: u74  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class u74 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ ListIndexesResponse x;

    public /* synthetic */ u74(ListIndexesResponse listIndexesResponse, int i) {
        this.w = i;
        this.x = listIndexesResponse;
    }

    public final Object b() {
        int i = this.w;
        ListIndexesResponse listIndexesResponse = this.x;
        switch (i) {
            case b85.b:
                return ListIndexesResponse._init_$lambda$0(listIndexesResponse);
            default:
                return ListIndexesResponse.indexes_delegate$lambda$0(listIndexesResponse);
        }
    }
}
