package defpackage;

/* renamed from: zo1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class zo1 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Runnable x;
    public final /* synthetic */ ji8 y;

    public /* synthetic */ zo1(Runnable runnable, ji8 ji8, int i) {
        this.w = i;
        this.x = runnable;
        this.y = ji8;
    }

    public final void run() {
        int i = this.w;
        ji8 ji8 = this.y;
        Runnable runnable = this.x;
        switch (i) {
            case b85.b:
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    ((fp1) ji8.x).k(e);
                    throw e;
                }
            case 1:
                try {
                    runnable.run();
                    return;
                } catch (Exception e2) {
                    ((fp1) ji8.x).k(e2);
                    return;
                }
            default:
                fp1 fp1 = (fp1) ji8.x;
                try {
                    runnable.run();
                    fp1.j((Object) null);
                    return;
                } catch (Exception e3) {
                    fp1.k(e3);
                    return;
                }
        }
    }
}
