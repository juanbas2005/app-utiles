package com.google.android.gms.oss.licenses;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import cu.lestebang.utiletecsa.R;
import java.io.IOException;
import java.io.InputStream;

@Deprecated
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class OssLicensesMenuActivity extends yn {
    public static String Z;
    public boolean X;
    public k68 Y;

    public static boolean t(OssLicensesMenuActivity ossLicensesMenuActivity, String str) {
        InputStream inputStream = null;
        boolean z = false;
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
        boolean z;
        super.onCreate(bundle);
        this.Y = k68.m(this);
        if (qi8.a) {
            y12.b(this);
            o55.s(getWindow(), true);
        }
        setContentView((int) R.layout.libraries_social_licenses_license_menu_activity);
        if (!t(this, "third_party_licenses") || !t(this, "third_party_license_metadata")) {
            z = false;
        } else {
            z = true;
        }
        this.X = z;
        if (Z == null) {
            Intent intent = getIntent();
            if (intent.hasExtra("title")) {
                Z = intent.getStringExtra("title");
                Log.w("OssLicensesMenuActivity", "The intent based title is deprecated. Use OssLicensesMenuActivity.setActivityTitle(title) instead.");
            }
        }
        String str = Z;
        if (str != null) {
            setTitle(str);
        }
        if (s() != null) {
            u98 s = s();
            s.getClass();
            sj7 sj7 = (sj7) s.e;
            int i = sj7.b;
            s.h = true;
            sj7.a((i & -5) | 4);
        }
        String t = this.Y.t(getPackageName());
        s47 q = k68.q(this, t);
        String str2 = q.b;
        Resources resources = q.a;
        if (this.X) {
            if (bundle == null) {
                k68.m(this);
                int identifier = resources.getIdentifier("license_fragment_container", "id", str2);
                if (((q89) p().D(identifier)) == null) {
                    q89 q89 = new q89();
                    if (t != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("license_activity_package_name", t);
                        q89.O(bundle2);
                    }
                    rq2 p = p();
                    p.getClass();
                    q30 q30 = new q30(p);
                    q30.f(identifier, q89, (String) null, 1);
                    if (!q30.g) {
                        q30.q.B(q30, false);
                    } else {
                        h.s("This transaction is already being added to the back stack");
                    }
                }
            }
        } else if (bundle == null) {
            k68.m(this);
            int identifier2 = resources.getIdentifier("license_fragment_container", "id", str2);
            if (((ys8) p().D(identifier2)) == null) {
                ys8 ys8 = new ys8();
                rq2 p2 = p();
                p2.getClass();
                q30 q302 = new q30(p2);
                q302.f(identifier2, ys8, (String) null, 1);
                if (!q302.g) {
                    q302.q.B(q302, false);
                } else {
                    h.s("This transaction is already being added to the back stack");
                }
            }
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
