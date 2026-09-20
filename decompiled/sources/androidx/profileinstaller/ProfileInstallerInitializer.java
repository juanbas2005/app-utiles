package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ProfileInstallerInitializer implements sb3 {
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new cl(this, context.getApplicationContext()));
        return new n63(6);
    }
}
