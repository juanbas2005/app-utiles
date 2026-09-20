package defpackage;

import android.view.autofill.AutofillId;

/* renamed from: ld  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ld implements v10 {
    public final je a;
    public final c20 b;
    public final AutofillId c;

    public ld(je jeVar, c20 c20) {
        AutofillId autofillId;
        this.a = jeVar;
        this.b = c20;
        jeVar.setImportantForAutofill(1);
        a20 e = i75.e(jeVar);
        if (e != null) {
            autofillId = z10.c(e.w);
        } else {
            autofillId = null;
        }
        if (autofillId != null) {
            this.c = autofillId;
            return;
        }
        throw b81.t("Required value was null.");
    }
}
