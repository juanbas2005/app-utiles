package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* renamed from: mc3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class mc3 extends InputConnectionWrapper {
    public final /* synthetic */ c9 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mc3(InputConnection inputConnection, c9 c9Var) {
        super(inputConnection, false);
        this.a = c9Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0082  */
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z;
        String str2;
        ResultReceiver resultReceiver;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        c9 c9Var = this.a;
        boolean z2 = false;
        if (bundle != null) {
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z = true;
            }
            if (z) {
                str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            } else {
                str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(str2);
                if (z) {
                    str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                } else {
                    str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                }
                try {
                    Uri uri = (Uri) bundle.getParcelable(str3);
                    if (z) {
                        str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                    } else {
                        str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                    }
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
                    if (z) {
                        str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                    } else {
                        str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                    }
                    Uri uri2 = (Uri) bundle.getParcelable(str5);
                    if (z) {
                        str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                    } else {
                        str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                    }
                    int i = bundle.getInt(str6);
                    if (z) {
                        str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                    } else {
                        str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                    }
                    Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
                    if (!(uri == null || clipDescription == null)) {
                        z2 = c9Var.j(new f96(uri, clipDescription, uri2), i, bundle2);
                    }
                    if (resultReceiver != null) {
                        resultReceiver.send(z2 ? 1 : 0, (Bundle) null);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (resultReceiver != null) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
                if (resultReceiver != null) {
                    resultReceiver.send(0, (Bundle) null);
                }
                throw th;
            }
        }
        if (z2) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
