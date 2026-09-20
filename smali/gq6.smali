.class public final Lgq6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lnm1;


# instance fields
.field public final synthetic w:Luu;

.field public final synthetic x:Lo81;


# direct methods
.method public constructor <init>(Luu;Lo81;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgq6;->w:Luu;

    .line 5
    .line 6
    iput-object p2, p0, Lgq6;->x:Lo81;

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


# virtual methods
.method public final a(Lt54;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lgq6;->w:Luu;

    .line 2
    .line 3
    move-object v0, p1

    .line 4
    check-cast v0, Lio/github/jan/supabase/auth/a;

    .line 5
    .line 6
    iget-object v1, v0, Lio/github/jan/supabase/auth/a;->n:Lh27;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v1}, Lll3;->l()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    if-ne v1, v2, :cond_1

    .line 16
    .line 17
    iget-object v0, v0, Lio/github/jan/supabase/auth/a;->d:Lcf4;

    .line 18
    .line 19
    iget-object v1, v0, Lcf4;->z:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lms3;

    .line 22
    .line 23
    iget-object v0, v0, Lcf4;->y:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/lang/String;

    .line 26
    .line 27
    sget-object v2, Lub4;->w:Lub4;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lms3;->a(Lub4;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    const-string v3, "Cancelling auto refresh because app is switching to the background"

    .line 37
    .line 38
    invoke-virtual {v1, v2, v0, v4, v3}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    new-instance v0, Lf70;

    .line 42
    .line 43
    const/16 v1, 0xf

    .line 44
    .line 45
    invoke-direct {v0, p1, v4, v1}, Lf70;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x3

    .line 49
    iget-object p0, p0, Lgq6;->x:Lo81;

    .line 50
    .line 51
    invoke-static {p0, v4, v4, v0, p1}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
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

.method public final l(Lt54;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lgq6;->w:Luu;

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lio/github/jan/supabase/auth/a;

    .line 8
    .line 9
    iget-object v1, v0, Lio/github/jan/supabase/auth/a;->n:Lh27;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lll3;->l()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v1, v0, Lio/github/jan/supabase/auth/a;->c:Lwu;

    .line 22
    .line 23
    iget-boolean v1, v1, Lwu;->v:Z

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget-object v0, v0, Lio/github/jan/supabase/auth/a;->d:Lcf4;

    .line 28
    .line 29
    iget-object v1, v0, Lcf4;->z:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lms3;

    .line 32
    .line 33
    iget-object v0, v0, Lcf4;->y:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/String;

    .line 36
    .line 37
    sget-object v2, Lub4;->w:Lub4;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lms3;->a(Lub4;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/4 v4, 0x0

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    const-string v3, "Trying to re-load session from storage..."

    .line 47
    .line 48
    invoke-virtual {v1, v2, v0, v4, v3}, Lms3;->b(Lub4;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    new-instance v0, Lot;

    .line 52
    .line 53
    const/16 v1, 0x1d

    .line 54
    .line 55
    invoke-direct {v0, p1, v4, v1}, Lot;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x3

    .line 59
    iget-object p0, p0, Lgq6;->x:Lo81;

    .line 60
    .line 61
    invoke-static {p0, v4, v4, v0, p1}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_0
    return-void
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
