package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* renamed from: c58  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class c58 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static x41 b(View view, x41 x41) {
        ContentInfo i = x41.a.i();
        Objects.requireNonNull(i);
        ContentInfo performReceiveContent = view.performReceiveContent(i);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == i) {
            return x41;
        }
        return new x41(new wv2(performReceiveContent));
    }
}
