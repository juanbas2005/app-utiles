package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: y22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class y22 extends sg3 {
    public final /* synthetic */ sg3 v;
    public final /* synthetic */ ThreadPoolExecutor w;

    public y22(sg3 sg3, ThreadPoolExecutor threadPoolExecutor) {
        this.v = sg3;
        this.w = threadPoolExecutor;
    }

    public final void J(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.w;
        try {
            this.v.J(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void L(am6 am6) {
        ThreadPoolExecutor threadPoolExecutor = this.w;
        try {
            this.v.L(am6);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
