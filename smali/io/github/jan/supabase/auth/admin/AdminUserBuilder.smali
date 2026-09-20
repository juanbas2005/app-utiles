.class public abstract Lio/github/jan/supabase/auth/admin/AdminUserBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\t\u00087\u0018\u0000 !2\u00020\u0001:\u0001\"B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ!\u0010\n\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\n\u0010\tR$\u0010\u0008\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R$\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000c\u001a\u0004\u0008\u0011\u0010\u000e\"\u0004\u0008\u0012\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lio/github/jan/supabase/auth/admin/AdminUserBuilder;",
        "",
        "<init>",
        "()V",
        "Lkotlin/Function1;",
        "Lvm3;",
        "Lvs7;",
        "metadata",
        "userMetadata",
        "(Lvr2;)V",
        "appMetadata",
        "Lkotlinx/serialization/json/JsonObject;",
        "Lkotlinx/serialization/json/JsonObject;",
        "getUserMetadata",
        "()Lkotlinx/serialization/json/JsonObject;",
        "setUserMetadata",
        "(Lkotlinx/serialization/json/JsonObject;)V",
        "getAppMetadata",
        "setAppMetadata",
        "",
        "autoConfirm",
        "Z",
        "getAutoConfirm",
        "()Z",
        "setAutoConfirm",
        "(Z)V",
        "",
        "password",
        "Ljava/lang/String;",
        "getPassword",
        "()Ljava/lang/String;",
        "setPassword",
        "(Ljava/lang/String;)V",
        "Companion",
        "z9",
        "auth-kt"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
    with = Lz9;
.end annotation


# static fields
.field public static final Companion:Lz9;

.field private static final descriptor:Lll6;


# instance fields
.field private appMetadata:Lkotlinx/serialization/json/JsonObject;

.field private autoConfirm:Z

.field private password:Ljava/lang/String;

.field private userMetadata:Lkotlinx/serialization/json/JsonObject;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lz9;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->Companion:Lz9;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [Lll6;

    .line 10
    .line 11
    const-string v2, "io.github.jan.supabase.gotrue.admin.UserBuilder"

    .line 12
    .line 13
    invoke-static {v2}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    new-instance v6, Lnq0;

    .line 20
    .line 21
    invoke-direct {v6, v2}, Lnq0;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v6}, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->descriptor$lambda$0(Lnq0;)Lvs7;

    .line 25
    .line 26
    .line 27
    new-instance v1, Lnl6;

    .line 28
    .line 29
    sget-object v3, Ln57;->l:Ln57;

    .line 30
    .line 31
    iget-object v4, v6, Lnq0;->c:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-static {v0}, Lqs;->p1([Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-direct/range {v1 .. v6}, Lnl6;-><init>(Ljava/lang/String;Ln85;ILjava/util/List;Lnq0;)V

    .line 42
    .line 43
    .line 44
    sput-object v1, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->descriptor:Lll6;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    const-string v0, "Blank serial names are prohibited"

    .line 48
    .line 49
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->password:Ljava/lang/String;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public synthetic constructor <init>(Lhl1;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;-><init>()V

    return-void
.end method

.method public static final synthetic access$getDescriptor$cp()Lll6;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->descriptor:Lll6;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private static final descriptor$lambda$0(Lnq0;)Lvs7;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lt47;->b:Lpo5;

    .line 5
    .line 6
    const/16 v1, 0xc

    .line 7
    .line 8
    const-string v2, "password"

    .line 9
    .line 10
    invoke-static {p0, v2, v0, v1}, Lnq0;->b(Lnq0;Ljava/lang/String;Lll6;I)V

    .line 11
    .line 12
    .line 13
    const-string v1, "email"

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    invoke-static {p0, v1, v0, v2}, Lnq0;->b(Lnq0;Ljava/lang/String;Lll6;I)V

    .line 17
    .line 18
    .line 19
    sget-object v1, Lja0;->b:Lpo5;

    .line 20
    .line 21
    const-string v3, "email_confirm"

    .line 22
    .line 23
    invoke-static {p0, v3, v1, v2}, Lnq0;->b(Lnq0;Ljava/lang/String;Lll6;I)V

    .line 24
    .line 25
    .line 26
    const-string v3, "phone"

    .line 27
    .line 28
    invoke-static {p0, v3, v0, v2}, Lnq0;->b(Lnq0;Ljava/lang/String;Lll6;I)V

    .line 29
    .line 30
    .line 31
    const-string v0, "phone_confirm"

    .line 32
    .line 33
    invoke-static {p0, v0, v1, v2}, Lnq0;->b(Lnq0;Ljava/lang/String;Lll6;I)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lkotlinx/serialization/json/JsonObject;->Companion:Lum3;

    .line 37
    .line 38
    invoke-virtual {v0}, Lum3;->serializer()Lzr3;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Lzr3;->getDescriptor()Lll6;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "user_metadata"

    .line 47
    .line 48
    invoke-static {p0, v1, v0, v2}, Lnq0;->b(Lnq0;Ljava/lang/String;Lll6;I)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lvs7;->a:Lvs7;

    .line 52
    .line 53
    return-object p0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method


# virtual methods
.method public final appMetadata(Lvr2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr2;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lvm3;

    .line 5
    .line 6
    invoke-direct {v0}, Lvm3;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lvm3;->a()Lkotlinx/serialization/json/JsonObject;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->appMetadata:Lkotlinx/serialization/json/JsonObject;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final getAppMetadata()Lkotlinx/serialization/json/JsonObject;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->appMetadata:Lkotlinx/serialization/json/JsonObject;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getAutoConfirm()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->autoConfirm:Z

    .line 2
    .line 3
    return p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getPassword()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->password:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getUserMetadata()Lkotlinx/serialization/json/JsonObject;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->userMetadata:Lkotlinx/serialization/json/JsonObject;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final setAppMetadata(Lkotlinx/serialization/json/JsonObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->appMetadata:Lkotlinx/serialization/json/JsonObject;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setAutoConfirm(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->autoConfirm:Z

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setPassword(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->password:Ljava/lang/String;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final setUserMetadata(Lkotlinx/serialization/json/JsonObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->userMetadata:Lkotlinx/serialization/json/JsonObject;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final userMetadata(Lvr2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr2;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lvm3;

    .line 5
    .line 6
    invoke-direct {v0}, Lvm3;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lvm3;->a()Lkotlinx/serialization/json/JsonObject;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lio/github/jan/supabase/auth/admin/AdminUserBuilder;->userMetadata:Lkotlinx/serialization/json/JsonObject;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
