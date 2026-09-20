package defpackage;

import android.content.ClipData;
import android.os.Build;

/* renamed from: sd  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sd implements bs0 {
    public final td a;

    public sd(td tdVar) {
        this.a = tdVar;
    }

    public final void a(as0 as0) {
        td tdVar = this.a;
        if (as0 != null) {
            tdVar.a().setPrimaryClip(as0.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            tdVar.a().clearPrimaryClip();
        } else {
            tdVar.a().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
