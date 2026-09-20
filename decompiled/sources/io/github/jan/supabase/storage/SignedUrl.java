package io.github.jan.supabase.storage;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 '2\u00020\u0001:\u0002()B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lio/github/jan/supabase/storage/SignedUrl;", "", "", "error", "signedURL", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$storage_kt", "(Lio/github/jan/supabase/storage/SignedUrl;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/storage/SignedUrl;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError", "getSignedURL", "getPath", "Companion", "wt6", "xt6", "storage-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class SignedUrl {
    public static final xt6 Companion = new Object();
    private final String error;
    private final String path;
    private final String signedURL;

    public /* synthetic */ SignedUrl(int i, String str, String str2, String str3, rl6 rl6) {
        if (6 == (i & 6)) {
            if ((i & 1) == 0) {
                this.error = null;
            } else {
                this.error = str;
            }
            this.signedURL = str2;
            this.path = str3;
            return;
        }
        wn6.x(i, 6, wt6.a.getDescriptor());
        throw null;
    }

    public static /* synthetic */ SignedUrl copy$default(SignedUrl signedUrl, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signedUrl.error;
        }
        if ((i & 2) != 0) {
            str2 = signedUrl.signedURL;
        }
        if ((i & 4) != 0) {
            str3 = signedUrl.path;
        }
        return signedUrl.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$storage_kt(SignedUrl signedUrl, hy0 hy0, ll6 ll6) {
        if (hy0.f(ll6) || signedUrl.error != null) {
            hy0.A(ll6, 0, t47.a, signedUrl.error);
        }
        hy0.x(ll6, 1, signedUrl.signedURL);
        hy0.x(ll6, 2, signedUrl.path);
    }

    public final String component1() {
        return this.error;
    }

    public final String component2() {
        return this.signedURL;
    }

    public final String component3() {
        return this.path;
    }

    public final SignedUrl copy(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        return new SignedUrl(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignedUrl)) {
            return false;
        }
        SignedUrl signedUrl = (SignedUrl) obj;
        if (sg3.e(this.error, signedUrl.error) && sg3.e(this.signedURL, signedUrl.signedURL) && sg3.e(this.path, signedUrl.path)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSignedURL() {
        return this.signedURL;
    }

    public int hashCode() {
        int i;
        String str = this.error;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return this.path.hashCode() + hl6.h(i * 31, 31, this.signedURL);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SignedUrl(error=");
        sb.append(this.error);
        sb.append(", signedURL=");
        sb.append(this.signedURL);
        sb.append(", path=");
        return hl6.o(sb, this.path, ')');
    }

    public SignedUrl(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.error = str;
        this.signedURL = str2;
        this.path = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignedUrl(String str, String str2, String str3, int i, hl1 hl1) {
        this((i & 1) != 0 ? null : str, str2, str3);
    }
}
