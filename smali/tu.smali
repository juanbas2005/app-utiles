.class public final Ltu;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lq77;


# static fields
.field public static final synthetic w:Ltu;

.field public static final x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Ltu;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltu;->w:Ltu;

    .line 7
    .line 8
    const-string v10, "error_code"

    .line 9
    .line 10
    const-string v11, "error_description"

    .line 11
    .line 12
    const-string v1, "access_token"

    .line 13
    .line 14
    const-string v2, "refresh_token"

    .line 15
    .line 16
    const-string v3, "expires_in"

    .line 17
    .line 18
    const-string v4, "expires_at"

    .line 19
    .line 20
    const-string v5, "token_type"

    .line 21
    .line 22
    const-string v6, "type"

    .line 23
    .line 24
    const-string v7, "provider_refresh_token"

    .line 25
    .line 26
    const-string v8, "provider_token"

    .line 27
    .line 28
    const-string v9, "error"

    .line 29
    .line 30
    filled-new-array/range {v1 .. v11}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    const-string v0, "error"

    .line 38
    .line 39
    const-string v1, "error_description"

    .line 40
    .line 41
    const-string v2, "code"

    .line 42
    .line 43
    const-string v3, "error_code"

    .line 44
    .line 45
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    const-string v0, "auth"

    .line 53
    .line 54
    sput-object v0, Ltu;->x:Ljava/lang/String;

    .line 55
    .line 56
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method


# virtual methods
.method public final e(Lj77;Ljava/lang/Object;)Lqe4;
    .locals 0

    .line 1
    check-cast p2, Lwu;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance p0, Lio/github/jan/supabase/auth/a;

    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lio/github/jan/supabase/auth/a;-><init>(Lj77;Lwu;)V

    .line 12
    .line 13
    .line 14
    return-object p0
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

.method public final f(Lvr2;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance p0, Lwu;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lu02;->x:Lxb4;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    sget-object v1, Ly02;->z:Ly02;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lgl0;->e0(ILy02;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iput-wide v0, p0, Lwu;->u:J

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lwu;->v:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Lwu;->w:Z

    .line 22
    .line 23
    iput-boolean v0, p0, Lwu;->x:Z

    .line 24
    .line 25
    sget-object v1, Ltj2;->w:Ltj2;

    .line 26
    .line 27
    iput-object v1, p0, Lwu;->y:Ltj2;

    .line 28
    .line 29
    iput-boolean v0, p0, Lwu;->z:Z

    .line 30
    .line 31
    sget-object v1, Lvu7;->m:Ltd0;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v1, Lme6;->P:Lme6;

    .line 37
    .line 38
    iput-object v1, p0, Lwu;->A:Lme6;

    .line 39
    .line 40
    iput-boolean v0, p0, Lwu;->B:Z

    .line 41
    .line 42
    sget v0, Lsr6;->a:I

    .line 43
    .line 44
    sget-object v0, Lpa2;->a:Ld63;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    sget-object v0, Loa2;->b:Loa2;

    .line 50
    .line 51
    iput-object v0, p0, Lwu;->C:Loa2;

    .line 52
    .line 53
    invoke-interface {p1, p0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    return-object p0
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

.method public final getKey()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Ltu;->x:Ljava/lang/String;

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

.method public final l(Lcy6;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lwu;

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
