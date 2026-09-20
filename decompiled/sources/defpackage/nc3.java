package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* renamed from: nc3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nc3 implements oc3 {
    public final InputContentInfo w;

    public nc3(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.w = new InputContentInfo(uri, clipDescription, uri2);
    }

    public final ClipDescription a() {
        return this.w.getDescription();
    }

    public final Uri b() {
        return this.w.getContentUri();
    }

    public final void c() {
        this.w.requestPermission();
    }

    public final Uri d() {
        return this.w.getLinkUri();
    }

    public final Object f() {
        return this.w;
    }

    public nc3(Object obj) {
        this.w = (InputContentInfo) obj;
    }
}
