.class public final Lmx0;
.super Lf1;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final c:Lo81;

.field public d:Lgs2;

.field public e:Lad0;

.field public f:Lh27;

.field public g:Z


# direct methods
.method public constructor <init>(Lo81;Lcn5;)V
    .locals 2

    .line 1
    invoke-direct {p0, p2}, Lf1;-><init>(Lyv4;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmx0;->c:Lo81;

    .line 5
    .line 6
    new-instance p1, Lbj;

    .line 7
    .line 8
    const/4 p2, 0x2

    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, p2, v1, v0}, Lbj;-><init>(ILf61;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lmx0;->d:Lgs2;

    .line 15
    .line 16
    return-void
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
.method public final k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lmx0;->e:Lad0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Ljava/util/concurrent/CancellationException;

    .line 6
    .line 7
    const-string v2, "onBack cancelled"

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, v2}, Lad0;->j(Ljava/lang/Throwable;Z)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lmx0;->f:Lh27;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lll3;->o(Ljava/util/concurrent/CancellationException;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    iput-object v1, p0, Lmx0;->e:Lad0;

    .line 25
    .line 26
    iput-object v1, p0, Lmx0;->f:Lh27;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lmx0;->g:Z

    .line 30
    .line 31
    return-void
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

.method public final l()V
    .locals 5

    .line 1
    iget-object v0, p0, Lmx0;->e:Lad0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lmx0;->g:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lmx0;->k()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lmx0;->e:Lad0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iput-boolean v2, p0, Lmx0;->g:Z

    .line 19
    .line 20
    sget-object v0, Lvc0;->w:Lvc0;

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    const/4 v4, -0x2

    .line 24
    invoke-static {v4, v3, v0}, Lrj1;->c(IILvc0;)Lad0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lmx0;->e:Lad0;

    .line 29
    .line 30
    new-instance v0, Ln0;

    .line 31
    .line 32
    const/16 v3, 0x11

    .line 33
    .line 34
    invoke-direct {v0, p0, v1, v3}, Ln0;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 35
    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    iget-object v4, p0, Lmx0;->c:Lo81;

    .line 39
    .line 40
    invoke-static {v4, v1, v1, v0, v3}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lmx0;->f:Lh27;

    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, Lmx0;->e:Lad0;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lad0;->h(Ljava/lang/Throwable;)Z

    .line 51
    .line 52
    .line 53
    :cond_2
    iput-boolean v2, p0, Lmx0;->g:Z

    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final m(Le30;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lmx0;->e:Lad0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lxk6;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
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
.end method

.method public final n()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lmx0;->k()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Lf1;->j()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lmx0;->g:Z

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    const/4 v1, -0x2

    .line 15
    sget-object v2, Lvc0;->w:Lvc0;

    .line 16
    .line 17
    invoke-static {v1, v0, v2}, Lrj1;->c(IILvc0;)Lad0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lmx0;->e:Lad0;

    .line 22
    .line 23
    new-instance v0, Ln0;

    .line 24
    .line 25
    const/16 v1, 0x11

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v0, p0, v2, v1}, Ln0;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    iget-object v3, p0, Lmx0;->c:Lo81;

    .line 33
    .line 34
    invoke-static {v3, v2, v2, v0, v1}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lmx0;->f:Lh27;

    .line 39
    .line 40
    :cond_0
    return-void
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

.method public final s(Z)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-super {p0}, Lf1;->j()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lmx0;->f:Lh27;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lll3;->l()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lmx0;->k()V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lf1;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lg30;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lg30;->e(Z)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lf1;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lf30;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ltv4;->i(Z)V

    .line 34
    .line 35
    .line 36
    return-void
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
