package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

/* renamed from: cl  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class cl implements Choreographer.FrameCallback {
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ Object x;

    public /* synthetic */ cl(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.x = context;
    }

    public final void doFrame(long j) {
        Handler handler;
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                ((Runnable) obj).run();
                return;
            default:
                Context context = (Context) obj;
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = Handler.createAsync(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new ho(context, 2), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
                return;
        }
    }

    public /* synthetic */ cl(Runnable runnable) {
        this.x = runnable;
    }
}
