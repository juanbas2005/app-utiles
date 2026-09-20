package io.github.jan.supabase.auth.admin.oauth;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\b\u0018\u0000 L2\u00020\u0001:\u0002MNBi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBs\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJr\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0003\u00101\u0012\u0004\b5\u00106\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u00104R.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0005\u00107\u0012\u0004\b;\u00106\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010:R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0006\u00101\u0012\u0004\b>\u00106\u001a\u0004\b<\u0010\u0016\"\u0004\b=\u00104R0\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\b\u00107\u0012\u0004\bA\u00106\u001a\u0004\b?\u0010\u0018\"\u0004\b@\u0010:R0\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\n\u00107\u0012\u0004\bD\u00106\u001a\u0004\bB\u0010\u0018\"\u0004\bC\u0010:R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u00101\u001a\u0004\bE\u0010\u0016\"\u0004\bF\u00104R*\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\r\u0010G\u0012\u0004\bK\u00106\u001a\u0004\bH\u0010\u001e\"\u0004\bI\u0010J¨\u0006O"}, d2 = {"Lio/github/jan/supabase/auth/admin/oauth/CreateOAuthClientBuilder;", "", "", "clientName", "", "redirectUris", "clientUri", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientGrantType;", "grantTypes", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;", "responseTypes", "scope", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;", "tokenEndpointAuthMethod", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lrl6;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;)Lio/github/jan/supabase/auth/admin/oauth/CreateOAuthClientBuilder;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/admin/oauth/CreateOAuthClientBuilder;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getClientName", "setClientName", "(Ljava/lang/String;)V", "getClientName$annotations", "()V", "Ljava/util/List;", "getRedirectUris", "setRedirectUris", "(Ljava/util/List;)V", "getRedirectUris$annotations", "getClientUri", "setClientUri", "getClientUri$annotations", "getGrantTypes", "setGrantTypes", "getGrantTypes$annotations", "getResponseTypes", "setResponseTypes", "getResponseTypes$annotations", "getScope", "setScope", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;", "getTokenEndpointAuthMethod", "setTokenEndpointAuthMethod", "(Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;)V", "getTokenEndpointAuthMethod$annotations", "Companion", "cb1", "db1", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class CreateOAuthClientBuilder {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers;
    public static final db1 Companion = new Object();
    private String clientName;
    private String clientUri;
    private List<? extends OAuthClientGrantType> grantTypes;
    private List<String> redirectUris;
    private List<? extends OAuthClientResponseType> responseTypes;
    private String scope;
    private OAuthClientTokenEndpointAuthMethod tokenEndpointAuthMethod;

    /* JADX WARNING: type inference failed for: r0v0, types: [db1, java.lang.Object] */
    static {
        o oVar = new o(25);
        i44 i44 = i44.w;
        $childSerializers = new nz3[]{null, rg3.y(i44, oVar), null, rg3.y(i44, new o(26)), rg3.y(i44, new o(27)), null, rg3.y(i44, new o(28))};
    }

    public /* synthetic */ CreateOAuthClientBuilder(int i, String str, List list, String str2, List list2, List list3, String str3, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod, rl6 rl6) {
        this.clientName = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.redirectUris = a42.w;
        } else {
            this.redirectUris = list;
        }
        if ((i & 4) == 0) {
            this.clientUri = null;
        } else {
            this.clientUri = str2;
        }
        if ((i & 8) == 0) {
            this.grantTypes = null;
        } else {
            this.grantTypes = list2;
        }
        if ((i & 16) == 0) {
            this.responseTypes = null;
        } else {
            this.responseTypes = list3;
        }
        if ((i & 32) == 0) {
            this.scope = null;
        } else {
            this.scope = str3;
        }
        if ((i & 64) == 0) {
            this.tokenEndpointAuthMethod = null;
        } else {
            this.tokenEndpointAuthMethod = oAuthClientTokenEndpointAuthMethod;
        }
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_() {
        return new cs(t47.a, 0);
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_$0() {
        return new cs(OAuthClientGrantType.Companion.serializer(), 0);
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ zr3 _childSerializers$_anonymous_$1() {
        return new cs(OAuthClientResponseType.Companion.serializer(), 0);
    }

    public static /* synthetic */ CreateOAuthClientBuilder copy$default(CreateOAuthClientBuilder createOAuthClientBuilder, String str, List<String> list, String str2, List<? extends OAuthClientGrantType> list2, List<? extends OAuthClientResponseType> list3, String str3, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createOAuthClientBuilder.clientName;
        }
        if ((i & 2) != 0) {
            list = createOAuthClientBuilder.redirectUris;
        }
        if ((i & 4) != 0) {
            str2 = createOAuthClientBuilder.clientUri;
        }
        if ((i & 8) != 0) {
            list2 = createOAuthClientBuilder.grantTypes;
        }
        if ((i & 16) != 0) {
            list3 = createOAuthClientBuilder.responseTypes;
        }
        if ((i & 32) != 0) {
            str3 = createOAuthClientBuilder.scope;
        }
        if ((i & 64) != 0) {
            oAuthClientTokenEndpointAuthMethod = createOAuthClientBuilder.tokenEndpointAuthMethod;
        }
        String str4 = str3;
        OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod2 = oAuthClientTokenEndpointAuthMethod;
        List<? extends OAuthClientGrantType> list4 = list2;
        List<? extends OAuthClientResponseType> list5 = list3;
        return createOAuthClientBuilder.copy(str, list, str2, list4, list5, str4, oAuthClientTokenEndpointAuthMethod2);
    }

    public static final /* synthetic */ void write$Self$auth_kt(CreateOAuthClientBuilder createOAuthClientBuilder, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        if (hy0.f(ll6) || !sg3.e(createOAuthClientBuilder.clientName, "")) {
            hy0.x(ll6, 0, createOAuthClientBuilder.clientName);
        }
        if (hy0.f(ll6) || !sg3.e(createOAuthClientBuilder.redirectUris, a42.w)) {
            hy0.o(ll6, 1, (zr3) nz3Arr[1].getValue(), createOAuthClientBuilder.redirectUris);
        }
        if (hy0.f(ll6) || createOAuthClientBuilder.clientUri != null) {
            hy0.A(ll6, 2, t47.a, createOAuthClientBuilder.clientUri);
        }
        if (hy0.f(ll6) || createOAuthClientBuilder.grantTypes != null) {
            hy0.A(ll6, 3, (zr3) nz3Arr[3].getValue(), createOAuthClientBuilder.grantTypes);
        }
        if (hy0.f(ll6) || createOAuthClientBuilder.responseTypes != null) {
            hy0.A(ll6, 4, (zr3) nz3Arr[4].getValue(), createOAuthClientBuilder.responseTypes);
        }
        if (hy0.f(ll6) || createOAuthClientBuilder.scope != null) {
            hy0.A(ll6, 5, t47.a, createOAuthClientBuilder.scope);
        }
        if (hy0.f(ll6) || createOAuthClientBuilder.tokenEndpointAuthMethod != null) {
            hy0.A(ll6, 6, (zr3) nz3Arr[6].getValue(), createOAuthClientBuilder.tokenEndpointAuthMethod);
        }
    }

    public final String component1() {
        return this.clientName;
    }

    public final List<String> component2() {
        return this.redirectUris;
    }

    public final String component3() {
        return this.clientUri;
    }

    public final List<OAuthClientGrantType> component4() {
        return this.grantTypes;
    }

    public final List<OAuthClientResponseType> component5() {
        return this.responseTypes;
    }

    public final String component6() {
        return this.scope;
    }

    public final OAuthClientTokenEndpointAuthMethod component7() {
        return this.tokenEndpointAuthMethod;
    }

    public final CreateOAuthClientBuilder copy(String str, List<String> list, String str2, List<? extends OAuthClientGrantType> list2, List<? extends OAuthClientResponseType> list3, String str3, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod) {
        str.getClass();
        list.getClass();
        return new CreateOAuthClientBuilder(str, list, str2, list2, list3, str3, oAuthClientTokenEndpointAuthMethod);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOAuthClientBuilder)) {
            return false;
        }
        CreateOAuthClientBuilder createOAuthClientBuilder = (CreateOAuthClientBuilder) obj;
        if (sg3.e(this.clientName, createOAuthClientBuilder.clientName) && sg3.e(this.redirectUris, createOAuthClientBuilder.redirectUris) && sg3.e(this.clientUri, createOAuthClientBuilder.clientUri) && sg3.e(this.grantTypes, createOAuthClientBuilder.grantTypes) && sg3.e(this.responseTypes, createOAuthClientBuilder.responseTypes) && sg3.e(this.scope, createOAuthClientBuilder.scope) && this.tokenEndpointAuthMethod == createOAuthClientBuilder.tokenEndpointAuthMethod) {
            return true;
        }
        return false;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final String getClientUri() {
        return this.clientUri;
    }

    public final List<OAuthClientGrantType> getGrantTypes() {
        return this.grantTypes;
    }

    public final List<String> getRedirectUris() {
        return this.redirectUris;
    }

    public final List<OAuthClientResponseType> getResponseTypes() {
        return this.responseTypes;
    }

    public final String getScope() {
        return this.scope;
    }

    public final OAuthClientTokenEndpointAuthMethod getTokenEndpointAuthMethod() {
        return this.tokenEndpointAuthMethod;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int j = hl6.j(this.redirectUris, this.clientName.hashCode() * 31, 31);
        String str = this.clientUri;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (j + i) * 31;
        List<? extends OAuthClientGrantType> list = this.grantTypes;
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.hashCode();
        }
        int i7 = (i6 + i2) * 31;
        List<? extends OAuthClientResponseType> list2 = this.responseTypes;
        if (list2 == null) {
            i3 = 0;
        } else {
            i3 = list2.hashCode();
        }
        int i8 = (i7 + i3) * 31;
        String str2 = this.scope;
        if (str2 == null) {
            i4 = 0;
        } else {
            i4 = str2.hashCode();
        }
        int i9 = (i8 + i4) * 31;
        OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod = this.tokenEndpointAuthMethod;
        if (oAuthClientTokenEndpointAuthMethod != null) {
            i5 = oAuthClientTokenEndpointAuthMethod.hashCode();
        }
        return i9 + i5;
    }

    public final void setClientName(String str) {
        str.getClass();
        this.clientName = str;
    }

    public final void setClientUri(String str) {
        this.clientUri = str;
    }

    public final void setGrantTypes(List<? extends OAuthClientGrantType> list) {
        this.grantTypes = list;
    }

    public final void setRedirectUris(List<String> list) {
        list.getClass();
        this.redirectUris = list;
    }

    public final void setResponseTypes(List<? extends OAuthClientResponseType> list) {
        this.responseTypes = list;
    }

    public final void setScope(String str) {
        this.scope = str;
    }

    public final void setTokenEndpointAuthMethod(OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod) {
        this.tokenEndpointAuthMethod = oAuthClientTokenEndpointAuthMethod;
    }

    public String toString() {
        return "CreateOAuthClientBuilder(clientName=" + this.clientName + ", redirectUris=" + this.redirectUris + ", clientUri=" + this.clientUri + ", grantTypes=" + this.grantTypes + ", responseTypes=" + this.responseTypes + ", scope=" + this.scope + ", tokenEndpointAuthMethod=" + this.tokenEndpointAuthMethod + ')';
    }

    public static /* synthetic */ void getClientName$annotations() {
    }

    public static /* synthetic */ void getClientUri$annotations() {
    }

    public static /* synthetic */ void getGrantTypes$annotations() {
    }

    public static /* synthetic */ void getRedirectUris$annotations() {
    }

    public static /* synthetic */ void getResponseTypes$annotations() {
    }

    public static /* synthetic */ void getTokenEndpointAuthMethod$annotations() {
    }

    public CreateOAuthClientBuilder() {
        this((String) null, (List) null, (String) null, (List) null, (List) null, (String) null, (OAuthClientTokenEndpointAuthMethod) null, 127, (hl1) null);
    }

    public CreateOAuthClientBuilder(String str, List<String> list, String str2, List<? extends OAuthClientGrantType> list2, List<? extends OAuthClientResponseType> list3, String str3, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod) {
        str.getClass();
        list.getClass();
        this.clientName = str;
        this.redirectUris = list;
        this.clientUri = str2;
        this.grantTypes = list2;
        this.responseTypes = list3;
        this.scope = str3;
        this.tokenEndpointAuthMethod = oAuthClientTokenEndpointAuthMethod;
    }

    public /* synthetic */ CreateOAuthClientBuilder(String str, List list, String str2, List list2, List list3, String str3, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod, int i, hl1 hl1) {
        OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod2;
        String str4;
        List list4;
        List list5;
        String str5;
        List list6;
        String str6;
        CreateOAuthClientBuilder createOAuthClientBuilder;
        str = (i & 1) != 0 ? "" : str;
        list = (i & 2) != 0 ? a42.w : list;
        str2 = (i & 4) != 0 ? null : str2;
        list2 = (i & 8) != 0 ? null : list2;
        list3 = (i & 16) != 0 ? null : list3;
        str3 = (i & 32) != 0 ? null : str3;
        if ((i & 64) != 0) {
            oAuthClientTokenEndpointAuthMethod2 = null;
            list4 = list3;
            str4 = str3;
            str5 = str2;
            list5 = list2;
            str6 = str;
            list6 = list;
            createOAuthClientBuilder = this;
        } else {
            oAuthClientTokenEndpointAuthMethod2 = oAuthClientTokenEndpointAuthMethod;
            str4 = str3;
            list5 = list2;
            list4 = list3;
            list6 = list;
            str5 = str2;
            createOAuthClientBuilder = this;
            str6 = str;
        }
        new CreateOAuthClientBuilder(str6, list6, str5, list5, list4, str4, oAuthClientTokenEndpointAuthMethod2);
    }
}
