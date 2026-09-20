package defpackage;

import android.app.RemoteAction;
import android.view.autofill.AutofillManager;
import android.view.textclassifier.TextClassifier;

/* renamed from: pa4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract /* synthetic */ class pa4 {
    public static /* bridge */ /* synthetic */ AutofillManager h(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassifier i(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return AutofillManager.class;
    }

    public static /* bridge */ /* synthetic */ void u(Object obj) {
        RemoteAction remoteAction = (RemoteAction) obj;
    }
}
