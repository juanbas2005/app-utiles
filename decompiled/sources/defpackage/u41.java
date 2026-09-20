package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* renamed from: u41  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class u41 implements t41, w41 {
    public Uri A;
    public Bundle B;
    public final /* synthetic */ int w = 0;
    public ClipData x;
    public int y;
    public int z;

    public u41(u41 u41) {
        ClipData clipData = u41.x;
        clipData.getClass();
        this.x = clipData;
        int i = u41.y;
        if (i < 0) {
            Locale locale = Locale.US;
            h.q("source is out of range of [0, 5] (too low)");
            throw null;
        } else if (i <= 5) {
            this.y = i;
            int i2 = u41.z;
            if ((i2 & 1) == i2) {
                this.z = i2;
                this.A = u41.A;
                this.B = u41.B;
                return;
            }
            String hexString = Integer.toHexString(i2);
            String hexString2 = Integer.toHexString(1);
            throw new IllegalArgumentException("Requested flags 0x" + hexString + ", but only 0x" + hexString2 + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            h.q("source is out of range of [0, 5] (too high)");
            throw null;
        }
    }

    public ClipData b() {
        return this.x;
    }

    public x41 build() {
        return new x41(new u41(this));
    }

    public int e() {
        return this.y;
    }

    public void f(Uri uri) {
        this.A = uri;
    }

    public void g(int i) {
        this.z = i;
    }

    public int h() {
        return this.z;
    }

    public ContentInfo i() {
        return null;
    }

    public void setExtras(Bundle bundle) {
        this.B = bundle;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        switch (this.w) {
            case 1:
                Uri uri = this.A;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.x.getDescription());
                sb.append(", source=");
                int i = this.y;
                if (i == 0) {
                    str = "SOURCE_APP";
                } else if (i == 1) {
                    str = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    str = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    str = "SOURCE_DRAG_AND_DROP";
                } else if (i == 4) {
                    str = "SOURCE_AUTOFILL";
                } else if (i != 5) {
                    str = String.valueOf(i);
                } else {
                    str = "SOURCE_PROCESS_TEXT";
                }
                sb.append(str);
                sb.append(", flags=");
                int i2 = this.z;
                if ((i2 & 1) != 0) {
                    str2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    str2 = String.valueOf(i2);
                }
                sb.append(str2);
                String str4 = "";
                if (uri == null) {
                    str3 = str4;
                } else {
                    str3 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str3);
                if (this.B != null) {
                    str4 = ", hasExtras";
                }
                return f21.l(sb, str4, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u41() {
    }
}
