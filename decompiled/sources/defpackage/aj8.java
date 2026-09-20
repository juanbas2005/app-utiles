package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: aj8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class aj8 implements k55, c55, x45, y45 {
    public final CountDownLatch w;

    public /* synthetic */ aj8() {
        this.w = new CountDownLatch(1);
    }

    public /* synthetic */ void K(yb9 yb9) {
        this.w.countDown();
    }

    public void f() {
        this.w.countDown();
    }

    public void g(Object obj) {
        this.w.countDown();
    }

    public void j(Exception exc) {
        this.w.countDown();
    }

    public /* synthetic */ aj8(CountDownLatch countDownLatch) {
        this.w = countDownLatch;
    }
}
