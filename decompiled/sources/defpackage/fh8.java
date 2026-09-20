package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: fh8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fh8 extends lh8 {
    public final /* synthetic */ Intent w;
    public final /* synthetic */ GoogleApiActivity x;

    public fh8(Intent intent, GoogleApiActivity googleApiActivity) {
        this.w = intent;
        this.x = googleApiActivity;
    }

    public final void a() {
        Intent intent = this.w;
        if (intent != null) {
            this.x.startActivityForResult(intent, 2);
        }
    }
}
