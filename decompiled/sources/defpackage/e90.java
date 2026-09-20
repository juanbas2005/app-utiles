package defpackage;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* renamed from: e90  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e90 implements DialogInterface.OnClickListener {
    public final WeakReference w;

    public e90(f90 f90) {
        this.w = new WeakReference(f90);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        WeakReference weakReference = this.w;
        if (weakReference.get() != null) {
            ((f90) weakReference.get()).g(true);
        }
    }
}
