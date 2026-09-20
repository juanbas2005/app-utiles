package defpackage;

import androidx.work.impl.WorkDatabase_Impl;

/* renamed from: fd8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class fd8 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ WorkDatabase_Impl x;

    public /* synthetic */ fd8(WorkDatabase_Impl workDatabase_Impl, int i) {
        this.w = i;
        this.x = workDatabase_Impl;
    }

    public final Object b() {
        int i = this.w;
        WorkDatabase_Impl workDatabase_Impl = this.x;
        switch (i) {
            case b85.b:
                return new fe8(workDatabase_Impl);
            case 1:
                return new cq1(workDatabase_Impl);
            case 2:
                return new he8(workDatabase_Impl);
            case 3:
                return new ja7(workDatabase_Impl);
            case 4:
                return new td8(workDatabase_Impl);
            case 5:
                return new ud8(workDatabase_Impl);
            default:
                return new en5(workDatabase_Impl);
        }
    }
}
