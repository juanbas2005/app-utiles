.class public final enum Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;
.super Ljava/lang/Enum;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "h25",
        "CODE",
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
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lu52;

.field private static final synthetic $VALUES:[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;

.field private static final $cachedSerializer$delegate:Lnz3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnz3;"
        }
    .end annotation
.end field

.field public static final enum CODE:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;

.field public static final Companion:Lh25;


# direct methods
.method private static final synthetic $values()[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;->CODE:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;

    .line 2
    .line 3
    filled-new-array {v0}, [Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;

    .line 2
    .line 3
    const-string v1, "CODE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;->CODE:Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;

    .line 10
    .line 11
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;->$values()[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;->$VALUES:[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;

    .line 16
    .line 17
    invoke-static {v0}, Lhj8;->t([Ljava/lang/Enum;)Lw52;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;->$ENTRIES:Lu52;

    .line 22
    .line 23
    new-instance v0, Lh25;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;->Companion:Lh25;

    .line 29
    .line 30
    new-instance v0, Ljk4;

    .line 31
    .line 32
    const/16 v1, 0x12

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljk4;-><init>(I)V

    .line 35
    .line 36
    .line 37
    sget-object v1, Li44;->w:Li44;

    .line 38
    .line 39
    invoke-static {v1, v0}, Lrg3;->y(Li44;Lsr2;)Lnz3;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;->$cachedSerializer$delegate:Lnz3;

    .line 44
    .line 45
    return-void
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

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
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

.method private static final synthetic _init_$_anonymous_()Lzr3;
    .locals 4

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;->values()[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "code"

    .line 6
    .line 7
    filled-new-array {v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    filled-new-array {v2}, [[Ljava/lang/annotation/Annotation;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "io.github.jan.supabase.auth.admin.oauth.OAuthClientResponseType"

    .line 17
    .line 18
    invoke-static {v3, v0, v1, v2}, Lkl8;->i(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)La62;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
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

.method public static synthetic a()Lzr3;
    .locals 1

    .line 1
    invoke-static {}, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;->_init_$_anonymous_()Lzr3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lnz3;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;->$cachedSerializer$delegate:Lnz3;

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

.method public static getEntries()Lu52;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lu52;"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;->$ENTRIES:Lu52;

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

.method public static valueOf(Ljava/lang/String;)Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;
    .locals 1

    .line 1
    const-class v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;

    .line 8
    .line 9
    return-object p0
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

.method public static values()[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;
    .locals 1

    .line 1
    sget-object v0, Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;->$VALUES:[Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/github/jan/supabase/auth/admin/oauth/OAuthClientResponseType;

    .line 8
    .line 9
    return-object v0
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
