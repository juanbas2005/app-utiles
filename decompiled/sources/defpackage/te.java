package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* renamed from: te  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class te {
    public static final te a = new Object();

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        re reVar = re.a;
        ViewTranslationCallback unused = re.a;
        view.setViewTranslationCallback(reVar);
    }
}
