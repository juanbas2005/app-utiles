package io.github.jan.supabase.auth.admin.oauth;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lio/github/jan/supabase/auth/admin/oauth/OAuthClientListResponse;", "", "", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClient;", "clients", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/util/List;Lrl6;)V", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/admin/oauth/OAuthClientListResponse;Lhy0;Lll6;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lio/github/jan/supabase/auth/admin/oauth/OAuthClientListResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getClients", "Companion", "e25", "f25", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class OAuthClientListResponse {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers = {rg3.y(i44.w, new jk4(16))};
    public static final f25 Companion = new Object();
    private final List<OAuthClient> clients;

    public /* synthetic */ OAuthClientListResponse(int i, List list, rl6 rl6) {
        if ((i & 1) == 0) {
            this.clients = a42.w;
        } else {
            this.clients = list;
        }
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_() {
        return new cs(b25.a, 0);
    }

    public static /* synthetic */ OAuthClientListResponse copy$default(OAuthClientListResponse oAuthClientListResponse, List<OAuthClient> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oAuthClientListResponse.clients;
        }
        return oAuthClientListResponse.copy(list);
    }

    public static final /* synthetic */ void write$Self$auth_kt(OAuthClientListResponse oAuthClientListResponse, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        if (hy0.f(ll6) || !sg3.e(oAuthClientListResponse.clients, a42.w)) {
            hy0.o(ll6, 0, (zr3) nz3Arr[0].getValue(), oAuthClientListResponse.clients);
        }
    }

    public final List<OAuthClient> component1() {
        return this.clients;
    }

    public final OAuthClientListResponse copy(List<OAuthClient> list) {
        list.getClass();
        return new OAuthClientListResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OAuthClientListResponse) && sg3.e(this.clients, ((OAuthClientListResponse) obj).clients)) {
            return true;
        }
        return false;
    }

    public final List<OAuthClient> getClients() {
        return this.clients;
    }

    public int hashCode() {
        return this.clients.hashCode();
    }

    public String toString() {
        return "OAuthClientListResponse(clients=" + this.clients + ')';
    }

    public OAuthClientListResponse() {
        this((List) null, 1, (hl1) null);
    }

    public OAuthClientListResponse(List<OAuthClient> list) {
        list.getClass();
        this.clients = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OAuthClientListResponse(List list, int i, hl1 hl1) {
        this((i & 1) != 0 ? a42.w : list);
    }
}
