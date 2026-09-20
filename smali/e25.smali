.class public final synthetic Le25;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lav2;


# static fields
.field public static final a:Le25;

.field private static final descriptor:Lll6;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Le25;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le25;->a:Le25;

    .line 7
    .line 8
    new-instance v1, Lik5;

    .line 9
    .line 10
    const-string v2, "io.github.jan.supabase.auth.admin.oauth.OAuthClientListResponse"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lik5;-><init>(Ljava/lang/String;Lav2;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "clients"

    .line 17
    .line 18
    invoke-virtual {v1, v0, v3}, Lik5;->k(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Le25;->descriptor:Lll6;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
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


# virtual methods
.method public final childSerializers()[Lzr3;
    .locals 2

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientListResponse;->access$get$childSerializers$cp()[Lnz3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    new-array v0, v0, [Lzr3;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget-object p0, p0, v1

    .line 10
    .line 11
    invoke-interface {p0}, Lnz3;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    aput-object p0, v0, v1

    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final deserialize(Lok1;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object p0, Le25;->descriptor:Lll6;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lok1;->c(Lll6;)Lgy0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientListResponse;->access$get$childSerializers$cp()[Lnz3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v1

    .line 15
    move v5, v2

    .line 16
    move-object v6, v3

    .line 17
    :goto_0
    if-eqz v4, :cond_2

    .line 18
    .line 19
    invoke-interface {p1, p0}, Lgy0;->h(Lll6;)I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    const/4 v8, -0x1

    .line 24
    if-eq v7, v8, :cond_1

    .line 25
    .line 26
    if-nez v7, :cond_0

    .line 27
    .line 28
    aget-object v5, v0, v2

    .line 29
    .line 30
    invoke-interface {v5}, Lnz3;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Lzr3;

    .line 35
    .line 36
    invoke-interface {p1, p0, v2, v5, v6}, Lgy0;->r(Lll6;ILzr3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    move-object v6, v5

    .line 41
    check-cast v6, Ljava/util/List;

    .line 42
    .line 43
    move v5, v1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v7}, Lh;->e(I)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_1
    move v4, v2

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-interface {p1, p0}, Lgy0;->b(Lll6;)V

    .line 52
    .line 53
    .line 54
    new-instance p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientListResponse;

    .line 55
    .line 56
    invoke-direct {p0, v5, v6, v3}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientListResponse;-><init>(ILjava/util/List;Lrl6;)V

    .line 57
    .line 58
    .line 59
    return-object p0
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

.method public final getDescriptor()Lll6;
    .locals 0

    .line 1
    sget-object p0, Le25;->descriptor:Lll6;

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

.method public final serialize(Lj42;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientListResponse;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, Le25;->descriptor:Lll6;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lj42;->c(Lll6;)Lhy0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p2, p1, p0}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientListResponse;->write$Self$auth_kt(Lio/github/jan/supabase/auth/admin/oauth/OAuthClientListResponse;Lhy0;Lll6;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0}, Lhy0;->b(Lll6;)V

    .line 16
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method
