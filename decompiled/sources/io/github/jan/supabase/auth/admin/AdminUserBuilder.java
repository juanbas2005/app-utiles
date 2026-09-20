package io.github.jan.supabase.auth.admin;

import kotlin.Metadata;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b7\u0018\u0000 !2\u00020\u0001:\u0001\"B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\tR$\u0010\b\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lio/github/jan/supabase/auth/admin/AdminUserBuilder;", "", "<init>", "()V", "Lkotlin/Function1;", "Lvm3;", "Lvs7;", "metadata", "userMetadata", "(Lvr2;)V", "appMetadata", "Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonObject;", "getUserMetadata", "()Lkotlinx/serialization/json/JsonObject;", "setUserMetadata", "(Lkotlinx/serialization/json/JsonObject;)V", "getAppMetadata", "setAppMetadata", "", "autoConfirm", "Z", "getAutoConfirm", "()Z", "setAutoConfirm", "(Z)V", "", "password", "Ljava/lang/String;", "getPassword", "()Ljava/lang/String;", "setPassword", "(Ljava/lang/String;)V", "Companion", "z9", "auth-kt"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable(with = z9.class)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class AdminUserBuilder {
    public static final z9 Companion = new Object();
    /* access modifiers changed from: private */
    public static final ll6 descriptor;
    private JsonObject appMetadata;
    private boolean autoConfirm;
    private String password;
    private JsonObject userMetadata;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, z9] */
    static {
        ll6[] ll6Arr = new ll6[0];
        if (!d57.I0("io.github.jan.supabase.gotrue.admin.UserBuilder")) {
            nq0 nq0 = new nq0("io.github.jan.supabase.gotrue.admin.UserBuilder");
            descriptor$lambda$0(nq0);
            descriptor = new nl6("io.github.jan.supabase.gotrue.admin.UserBuilder", n57.l, nq0.c.size(), qs.p1(ll6Arr), nq0);
            return;
        }
        h.q("Blank serial names are prohibited");
    }

    private AdminUserBuilder() {
        this.password = "";
    }

    private static final vs7 descriptor$lambda$0(nq0 nq0) {
        nq0.getClass();
        po5 po5 = t47.b;
        nq0.b(nq0, "password", po5, 12);
        nq0.b(nq0, "email", po5, 4);
        po5 po52 = ja0.b;
        nq0.b(nq0, "email_confirm", po52, 4);
        nq0.b(nq0, "phone", po5, 4);
        nq0.b(nq0, "phone_confirm", po52, 4);
        nq0.b(nq0, "user_metadata", JsonObject.Companion.serializer().getDescriptor(), 4);
        return vs7.a;
    }

    public final void appMetadata(vr2 vr2) {
        vr2.getClass();
        vm3 vm3 = new vm3();
        vr2.y(vm3);
        this.appMetadata = vm3.a();
    }

    public final JsonObject getAppMetadata() {
        return this.appMetadata;
    }

    public final boolean getAutoConfirm() {
        return this.autoConfirm;
    }

    public final String getPassword() {
        return this.password;
    }

    public final JsonObject getUserMetadata() {
        return this.userMetadata;
    }

    public final void setAppMetadata(JsonObject jsonObject) {
        this.appMetadata = jsonObject;
    }

    public final void setAutoConfirm(boolean z) {
        this.autoConfirm = z;
    }

    public final void setPassword(String str) {
        str.getClass();
        this.password = str;
    }

    public final void setUserMetadata(JsonObject jsonObject) {
        this.userMetadata = jsonObject;
    }

    public final void userMetadata(vr2 vr2) {
        vr2.getClass();
        vm3 vm3 = new vm3();
        vr2.y(vm3);
        this.userMetadata = vm3.a();
    }

    public /* synthetic */ AdminUserBuilder(hl1 hl1) {
        this();
    }
}
