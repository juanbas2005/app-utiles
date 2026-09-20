package com.google.android.gms.oss.licenses.v2;

import android.content.res.Resources;
import android.os.Bundle;
import cu.lestebang.utiletecsa.R;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class OssLicensesMenuActivity extends yn {
    public static final /* synthetic */ int X = 0;

    public static final boolean t(OssLicensesMenuActivity ossLicensesMenuActivity, String str) {
        boolean z = false;
        InputStream inputStream = null;
        try {
            Resources resources = ossLicensesMenuActivity.getResources();
            InputStream openRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.license_list)));
            if (openRawResource.available() > 0) {
                z = true;
            }
            try {
                openRawResource.close();
            } catch (IOException unused) {
            }
            return z;
        } catch (Resources.NotFoundException | IOException unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        u98 s;
        super.onCreate(bundle);
        y12.b(this);
        if (getIntent().hasExtra("title")) {
            str = getIntent().getStringExtra("title");
        } else {
            str = null;
        }
        boolean z = false;
        if (!(s() == null || (s = s()) == null || s.p)) {
            s.p = true;
            s.e(false);
        }
        if (t(this, "third_party_licenses") && t(this, "third_party_license_metadata")) {
            z = true;
        }
        sv0.a(this, new fw0(546016281, new dn8(2, str, z), true));
    }
}
