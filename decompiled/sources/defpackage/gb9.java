package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* renamed from: gb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class gb9 implements dt {
    public final /* synthetic */ int a;
    public final /* synthetic */ o00 b;

    public /* synthetic */ gb9(o00 o00, int i) {
        this.a = i;
        this.b = o00;
    }

    public final ListenableFuture apply(Object obj) {
        ListenableFuture listenableFuture;
        int i = this.a;
        o00 o00 = this.b;
        switch (i) {
            case b85.b:
                synchronized (o00.i) {
                    listenableFuture = (ListenableFuture) o00.k;
                }
                return listenableFuture;
            case 1:
                Void voidR = (Void) obj;
                return pt2.d(o00.l((Uri) pt2.b((ListenableFuture) o00.c)));
            case 2:
                o00.m((Uri) pt2.b((ListenableFuture) o00.c), obj);
                return f93.x;
            default:
                Uri uri = (Uri) obj;
                Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    ka9 ka9 = (ka9) o00.f;
                    ia9 b2 = ka9.b(build);
                    if (b2.a.b(b2.d)) {
                        ia9 b3 = ka9.b(build);
                        ia9 b4 = ka9.b(uri);
                        za9 za9 = b3.a;
                        if (za9 == b4.a) {
                            za9.f(b3.d, b4.d);
                        } else {
                            throw new IOException("Cannot rename file across backends");
                        }
                    }
                    return f93.x;
                } catch (IOException e) {
                    return pt2.c(e);
                }
        }
    }
}
