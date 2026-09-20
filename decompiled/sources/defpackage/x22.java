package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* renamed from: x22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class x22 implements nm1 {
    public final /* synthetic */ in8 w;

    public x22(EmojiCompatInitializer emojiCompatInitializer, in8 in8) {
        this.w = in8;
    }

    public final void v(t54 t54) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = dz0.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new z22(0), 500);
        this.w.M0(this);
    }
}
