package io.github.jan.supabase.auth.admin.oauth;

import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\b\u0018\u0000 M2\u00020\u0001:\u0002NOBm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBs\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJv\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0003\u00101\u0012\u0004\b5\u00106\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u00104R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0004\u00101\u0012\u0004\b9\u00106\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u00104R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0005\u00101\u0012\u0004\b<\u00106\u001a\u0004\b:\u0010\u0016\"\u0004\b;\u00104R0\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010=\u0012\u0004\bA\u00106\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010@R0\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\t\u0010=\u0012\u0004\bD\u00106\u001a\u0004\bB\u0010\u001a\"\u0004\bC\u0010@R0\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010=\u0012\u0004\bG\u00106\u001a\u0004\bE\u0010\u001a\"\u0004\bF\u0010@R*\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\r\u0010H\u0012\u0004\bL\u00106\u001a\u0004\bI\u0010\u001e\"\u0004\bJ\u0010K¨\u0006P"}, d2 = {"Lio/github/jan/supabase/auth/admin/oauth/UpdateOAuthClientBuilder;", "", "", "clientName", "clientUri", "logoUri", "", "redirectUris", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientGrantType;", "grantTypes", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;", "responseTypes", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;", "tokenEndpointAuthMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;Lrl6;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;)Lio/github/jan/supabase/auth/admin/oauth/UpdateOAuthClientBuilder;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self$auth_kt", "(Lio/github/jan/supabase/auth/admin/oauth/UpdateOAuthClientBuilder;Lhy0;Lll6;)V", "write$Self", "Ljava/lang/String;", "getClientName", "setClientName", "(Ljava/lang/String;)V", "getClientName$annotations", "()V", "getClientUri", "setClientUri", "getClientUri$annotations", "getLogoUri", "setLogoUri", "getLogoUri$annotations", "Ljava/util/List;", "getRedirectUris", "setRedirectUris", "(Ljava/util/List;)V", "getRedirectUris$annotations", "getGrantTypes", "setGrantTypes", "getGrantTypes$annotations", "getResponseTypes", "setResponseTypes", "getResponseTypes$annotations", "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;", "getTokenEndpointAuthMethod", "setTokenEndpointAuthMethod", "(Lio/github/jan/supabase/auth/admin/oauth/OAuthClientTokenEndpointAuthMethod;)V", "getTokenEndpointAuthMethod$annotations", "Companion", "gu7", "hu7", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class UpdateOAuthClientBuilder {
    /* access modifiers changed from: private */
    public static final nz3[] $childSerializers;
    public static final hu7 Companion = new Object();
    private String clientName;
    private String clientUri;
    private List<? extends OAuthClientGrantType> grantTypes;
    private String logoUri;
    private List<String> redirectUris;
    private List<? extends OAuthClientResponseType> responseTypes;
    private OAuthClientTokenEndpointAuthMethod tokenEndpointAuthMethod;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, hu7] */
    static {
        wi7 wi7 = new wi7(3);
        i44 i44 = i44.w;
        $childSerializers = new nz3[]{null, null, null, rg3.y(i44, wi7), rg3.y(i44, new wi7(4)), rg3.y(i44, new wi7(5)), rg3.y(i44, new wi7(6))};
    }

    public /* synthetic */ UpdateOAuthClientBuilder(int i, String str, String str2, String str3, List list, List list2, List list3, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod, rl6 rl6) {
        if ((i & 1) == 0) {
            this.clientName = null;
        } else {
            this.clientName = str;
        }
        if ((i & 2) == 0) {
            this.clientUri = null;
        } else {
            this.clientUri = str2;
        }
        if ((i & 4) == 0) {
            this.logoUri = null;
        } else {
            this.logoUri = str3;
        }
        if ((i & 8) == 0) {
            this.redirectUris = null;
        } else {
            this.redirectUris = list;
        }
        if ((i & 16) == 0) {
            this.grantTypes = null;
        } else {
            this.grantTypes = list2;
        }
        if ((i & 32) == 0) {
            this.responseTypes = null;
        } else {
            this.responseTypes = list3;
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

    public static /* synthetic */ UpdateOAuthClientBuilder copy$default(UpdateOAuthClientBuilder updateOAuthClientBuilder, String str, String str2, String str3, List<String> list, List<? extends OAuthClientGrantType> list2, List<? extends OAuthClientResponseType> list3, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateOAuthClientBuilder.clientName;
        }
        if ((i & 2) != 0) {
            str2 = updateOAuthClientBuilder.clientUri;
        }
        if ((i & 4) != 0) {
            str3 = updateOAuthClientBuilder.logoUri;
        }
        if ((i & 8) != 0) {
            list = updateOAuthClientBuilder.redirectUris;
        }
        if ((i & 16) != 0) {
            list2 = updateOAuthClientBuilder.grantTypes;
        }
        if ((i & 32) != 0) {
            list3 = updateOAuthClientBuilder.responseTypes;
        }
        if ((i & 64) != 0) {
            oAuthClientTokenEndpointAuthMethod = updateOAuthClientBuilder.tokenEndpointAuthMethod;
        }
        List<? extends OAuthClientResponseType> list4 = list3;
        OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod2 = oAuthClientTokenEndpointAuthMethod;
        List<String> list5 = list;
        List<? extends OAuthClientGrantType> list6 = list2;
        return updateOAuthClientBuilder.copy(str, str2, str3, list5, list6, list4, oAuthClientTokenEndpointAuthMethod2);
    }

    public static final /* synthetic */ void write$Self$auth_kt(UpdateOAuthClientBuilder updateOAuthClientBuilder, hy0 hy0, ll6 ll6) {
        nz3[] nz3Arr = $childSerializers;
        if (hy0.f(ll6) || updateOAuthClientBuilder.clientName != null) {
            hy0.A(ll6, 0, t47.a, updateOAuthClientBuilder.clientName);
        }
        if (hy0.f(ll6) || updateOAuthClientBuilder.clientUri != null) {
            hy0.A(ll6, 1, t47.a, updateOAuthClientBuilder.clientUri);
        }
        if (hy0.f(ll6) || updateOAuthClientBuilder.logoUri != null) {
            hy0.A(ll6, 2, t47.a, updateOAuthClientBuilder.logoUri);
        }
        if (hy0.f(ll6) || updateOAuthClientBuilder.redirectUris != null) {
            hy0.A(ll6, 3, (zr3) nz3Arr[3].getValue(), updateOAuthClientBuilder.redirectUris);
        }
        if (hy0.f(ll6) || updateOAuthClientBuilder.grantTypes != null) {
            hy0.A(ll6, 4, (zr3) nz3Arr[4].getValue(), updateOAuthClientBuilder.grantTypes);
        }
        if (hy0.f(ll6) || updateOAuthClientBuilder.responseTypes != null) {
            hy0.A(ll6, 5, (zr3) nz3Arr[5].getValue(), updateOAuthClientBuilder.responseTypes);
        }
        if (hy0.f(ll6) || updateOAuthClientBuilder.tokenEndpointAuthMethod != null) {
            hy0.A(ll6, 6, (zr3) nz3Arr[6].getValue(), updateOAuthClientBuilder.tokenEndpointAuthMethod);
        }
    }

    public final String component1() {
        return this.clientName;
    }

    public final String component2() {
        return this.clientUri;
    }

    public final String component3() {
        return this.logoUri;
    }

    public final List<String> component4() {
        return this.redirectUris;
    }

    public final List<OAuthClientGrantType> component5() {
        return this.grantTypes;
    }

    public final List<OAuthClientResponseType> component6() {
        return this.responseTypes;
    }

    public final OAuthClientTokenEndpointAuthMethod component7() {
        return this.tokenEndpointAuthMethod;
    }

    public final UpdateOAuthClientBuilder copy(String str, String str2, String str3, List<String> list, List<? extends OAuthClientGrantType> list2, List<? extends OAuthClientResponseType> list3, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod) {
        return new UpdateOAuthClientBuilder(str, str2, str3, list, list2, list3, oAuthClientTokenEndpointAuthMethod);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateOAuthClientBuilder)) {
            return false;
        }
        UpdateOAuthClientBuilder updateOAuthClientBuilder = (UpdateOAuthClientBuilder) obj;
        if (sg3.e(this.clientName, updateOAuthClientBuilder.clientName) && sg3.e(this.clientUri, updateOAuthClientBuilder.clientUri) && sg3.e(this.logoUri, updateOAuthClientBuilder.logoUri) && sg3.e(this.redirectUris, updateOAuthClientBuilder.redirectUris) && sg3.e(this.grantTypes, updateOAuthClientBuilder.grantTypes) && sg3.e(this.responseTypes, updateOAuthClientBuilder.responseTypes) && this.tokenEndpointAuthMethod == updateOAuthClientBuilder.tokenEndpointAuthMethod) {
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

    public final String getLogoUri() {
        return this.logoUri;
    }

    public final List<String> getRedirectUris() {
        return this.redirectUris;
    }

    public final List<OAuthClientResponseType> getResponseTypes() {
        return this.responseTypes;
    }

    public final OAuthClientTokenEndpointAuthMethod getTokenEndpointAuthMethod() {
        return this.tokenEndpointAuthMethod;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = this.clientName;
        int i7 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i8 = i * 31;
        String str2 = this.clientUri;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i9 = (i8 + i2) * 31;
        String str3 = this.logoUri;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i10 = (i9 + i3) * 31;
        List<String> list = this.redirectUris;
        if (list == null) {
            i4 = 0;
        } else {
            i4 = list.hashCode();
        }
        int i11 = (i10 + i4) * 31;
        List<? extends OAuthClientGrantType> list2 = this.grantTypes;
        if (list2 == null) {
            i5 = 0;
        } else {
            i5 = list2.hashCode();
        }
        int i12 = (i11 + i5) * 31;
        List<? extends OAuthClientResponseType> list3 = this.responseTypes;
        if (list3 == null) {
            i6 = 0;
        } else {
            i6 = list3.hashCode();
        }
        int i13 = (i12 + i6) * 31;
        OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod = this.tokenEndpointAuthMethod;
        if (oAuthClientTokenEndpointAuthMethod != null) {
            i7 = oAuthClientTokenEndpointAuthMethod.hashCode();
        }
        return i13 + i7;
    }

    public final void setClientName(String str) {
        this.clientName = str;
    }

    public final void setClientUri(String str) {
        this.clientUri = str;
    }

    public final void setGrantTypes(List<? extends OAuthClientGrantType> list) {
        this.grantTypes = list;
    }

    public final void setLogoUri(String str) {
        this.logoUri = str;
    }

    public final void setRedirectUris(List<String> list) {
        this.redirectUris = list;
    }

    public final void setResponseTypes(List<? extends OAuthClientResponseType> list) {
        this.responseTypes = list;
    }

    public final void setTokenEndpointAuthMethod(OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod) {
        this.tokenEndpointAuthMethod = oAuthClientTokenEndpointAuthMethod;
    }

    public String toString() {
        return "UpdateOAuthClientBuilder(clientName=" + this.clientName + ", clientUri=" + this.clientUri + ", logoUri=" + this.logoUri + ", redirectUris=" + this.redirectUris + ", grantTypes=" + this.grantTypes + ", responseTypes=" + this.responseTypes + ", tokenEndpointAuthMethod=" + this.tokenEndpointAuthMethod + ')';
    }

    public static /* synthetic */ void getClientName$annotations() {
    }

    public static /* synthetic */ void getClientUri$annotations() {
    }

    public static /* synthetic */ void getGrantTypes$annotations() {
    }

    public static /* synthetic */ void getLogoUri$annotations() {
    }

    public static /* synthetic */ void getRedirectUris$annotations() {
    }

    public static /* synthetic */ void getResponseTypes$annotations() {
    }

    public static /* synthetic */ void getTokenEndpointAuthMethod$annotations() {
    }

    public UpdateOAuthClientBuilder() {
        this((String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (OAuthClientTokenEndpointAuthMethod) null, 127, (hl1) null);
    }

    public UpdateOAuthClientBuilder(String str, String str2, String str3, List<String> list, List<? extends OAuthClientGrantType> list2, List<? extends OAuthClientResponseType> list3, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod) {
        this.clientName = str;
        this.clientUri = str2;
        this.logoUri = str3;
        this.redirectUris = list;
        this.grantTypes = list2;
        this.responseTypes = list3;
        this.tokenEndpointAuthMethod = oAuthClientTokenEndpointAuthMethod;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateOAuthClientBuilder(String str, String str2, String str3, List list, List list2, List list3, OAuthClientTokenEndpointAuthMethod oAuthClientTokenEndpointAuthMethod, int i, hl1 hl1) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : oAuthClientTokenEndpointAuthMethod);
    }
}
