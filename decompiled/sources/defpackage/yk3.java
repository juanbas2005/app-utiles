package defpackage;

import cu.lestebang.utiletecsa.core.room.data.JetpackDatabase_Impl;

/* renamed from: yk3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yk3 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ JetpackDatabase_Impl x;

    public /* synthetic */ yk3(JetpackDatabase_Impl jetpackDatabase_Impl, int i) {
        this.w = i;
        this.x = jetpackDatabase_Impl;
    }

    public final Object b() {
        int i = this.w;
        JetpackDatabase_Impl jetpackDatabase_Impl = this.x;
        switch (i) {
            case b85.b:
                return new xk3(jetpackDatabase_Impl);
            case 1:
                return new xy7(jetpackDatabase_Impl);
            case 2:
                return new oz7(jetpackDatabase_Impl);
            case 3:
                return new ml7(jetpackDatabase_Impl);
            default:
                return new fr4(jetpackDatabase_Impl);
        }
    }
}
