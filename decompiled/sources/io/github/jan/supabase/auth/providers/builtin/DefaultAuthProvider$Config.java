package io.github.jan.supabase.auth.providers.builtin;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0005\u0001\u0003\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"io/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config", "", "", "captchaToken", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lrl6;", "serializationConstructorMarker", "(ILjava/lang/String;Lrl6;)V", "Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;", "self", "Lhy0;", "output", "Lll6;", "serialDesc", "Lvs7;", "write$Self", "(Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;Lhy0;Lll6;)V", "Ljava/lang/String;", "getCaptchaToken", "()Ljava/lang/String;", "setCaptchaToken", "getCaptchaToken$annotations", "()V", "Companion", "cl1", "Lio/github/jan/supabase/auth/providers/builtin/Email$Config;", "Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;", "Lio/github/jan/supabase/auth/providers/builtin/Phone$Config;", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class DefaultAuthProvider$Config {
    /* access modifiers changed from: private */
    public static final nz3 $cachedSerializer$delegate = rg3.y(i44.w, new nf1(6));
    public static final cl1 Companion = new Object();
    private String captchaToken;

    public /* synthetic */ DefaultAuthProvider$Config(int i, String str, rl6 rl6) {
        if ((i & 1) == 0) {
            this.captchaToken = null;
        } else {
            this.captchaToken = str;
        }
    }

    /* access modifiers changed from: private */
    public static final zr3 _init_$_anonymous_() {
        c26 c26 = b26.a;
        ci6 ci6 = new ci6("io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider.Config", c26.b(DefaultAuthProvider$Config.class), new gq3[]{c26.b(Email$Config.class), c26.b(IDToken$Config.class), c26.b(Phone$Config.class)}, new zr3[]{p22.a, k73.a, og5.a});
        List asList = Arrays.asList(new Annotation[0]);
        asList.getClass();
        ci6.b = asList;
        return ci6;
    }

    public static final /* synthetic */ void write$Self(DefaultAuthProvider$Config defaultAuthProvider$Config, hy0 hy0, ll6 ll6) {
        if (hy0.f(ll6) || defaultAuthProvider$Config.captchaToken != null) {
            hy0.A(ll6, 0, xk0.a, defaultAuthProvider$Config.captchaToken);
        }
    }

    public final String getCaptchaToken() {
        return this.captchaToken;
    }

    public final void setCaptchaToken(String str) {
        this.captchaToken = str;
    }

    public /* synthetic */ DefaultAuthProvider$Config(String str, hl1 hl1) {
        this(str);
    }

    private DefaultAuthProvider$Config(String str) {
        this.captchaToken = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultAuthProvider$Config(String str, int i, hl1 hl1) {
        this((i & 1) != 0 ? null : str, (hl1) null);
    }

    @Serializable(with = xk0.class)
    public static /* synthetic */ void getCaptchaToken$annotations() {
    }
}
