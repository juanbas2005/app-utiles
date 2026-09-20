package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* renamed from: lc3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lc3 extends InputConnectionWrapper {
    public final /* synthetic */ c9 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lc3(InputConnection inputConnection, c9 c9Var) {
        super(inputConnection, false);
        this.a = c9Var;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        f96 f96 = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            f96 = new f96(23, (Object) new nc3(inputContentInfo));
        }
        if (this.a.j(f96, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
