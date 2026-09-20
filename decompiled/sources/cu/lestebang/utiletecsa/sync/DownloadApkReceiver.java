package cu.lestebang.utiletecsa.sync;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import cu.lestebang.utiletecsa.R;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/sync/DownloadApkReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "sync"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class DownloadApkReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (sg3.e(intent.getAction(), "cu.lestebang.utiletecsa.sync.action.DOWNLOAD_APK")) {
            DownloadManager.Request destinationInExternalPublicDir = new DownloadManager.Request(Uri.parse("https://apputiles.com/assets/UtilEs.apk")).setTitle(context.getString(R.string.app_update_download_title)).setDescription(context.getString(R.string.app_update_download_description)).setMimeType("application/vnd.android.package-archive").setNotificationVisibility(1).setAllowedOverMetered(true).setAllowedOverRoaming(true).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "UtilEs.apk");
            try {
                DownloadManager downloadManager = (DownloadManager) context.getSystemService(DownloadManager.class);
                if (downloadManager != null) {
                    downloadManager.enqueue(destinationInExternalPublicDir);
                }
            } catch (Exception unused) {
                yh7.a.getClass();
                hr2.A(new Object[0]);
            }
        }
    }
}
