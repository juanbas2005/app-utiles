package defpackage;

import android.media.MediaPlayer;
import android.util.Log;

/* renamed from: u70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class u70 implements MediaPlayer.OnErrorListener {
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.w("v70", "Failed to beep " + i + ", " + i2);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }
}
