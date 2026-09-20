package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* renamed from: u15  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class u15 extends t15 {
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        jy5 jy5 = this.b;
        if (jy5 != null) {
            return jy5.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
