package defpackage;

import io.github.jan.supabase.storage.FileObjectV2;

/* renamed from: cd2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class cd2 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ FileObjectV2 x;

    public /* synthetic */ cd2(FileObjectV2 fileObjectV2, int i) {
        this.w = i;
        this.x = fileObjectV2;
    }

    public final Object b() {
        int i = this.w;
        FileObjectV2 fileObjectV2 = this.x;
        switch (i) {
            case b85.b:
                return FileObjectV2._init_$lambda$0(fileObjectV2);
            default:
                return FileObjectV2.contentType_delegate$lambda$0(fileObjectV2);
        }
    }
}
