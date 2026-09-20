package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;

/* renamed from: m20  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class m20 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ Context y;

    public /* synthetic */ m20(Context context, String str, int i) {
        this.w = i;
        this.y = context;
        this.x = str;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        String str = this.x;
        Context context = this.y;
        switch (i) {
            case b85.b:
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", str);
                try {
                    context.startActivity(Intent.createChooser(intent, (CharSequence) null));
                } catch (Throwable unused) {
                }
                return vs7;
            case 1:
                try {
                    context.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(str))).addFlags(268435456));
                } catch (Throwable unused2) {
                }
                fi0.b.post(new ka(2));
                return vs7;
            case 2:
                try {
                    context.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse("smsto:".concat(str))).addFlags(268435456));
                } catch (Throwable unused3) {
                }
                fi0.b.post(new ka(2));
                return vs7;
            case 3:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", str);
                context.startActivity(Intent.createChooser(intent2, (CharSequence) null));
                return vs7;
            default:
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
        }
    }

    public /* synthetic */ m20(String str, Context context, int i) {
        this.w = i;
        this.x = str;
        this.y = context;
    }
}
