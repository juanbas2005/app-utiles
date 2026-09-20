.class public final Lh02;
.super Lvb5;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final A:Lpq6;

.field public final B:Lqc3;


# direct methods
.method public constructor <init>(Lpq6;Lkq6;Lqc3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lvb5;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh02;->A:Lpq6;

    .line 5
    .line 6
    iput-object p3, p0, Lh02;->B:Lqc3;

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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final d(F)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final e(Llt0;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final i()J
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
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

.method public final j(Lwy3;)V
    .locals 12

    .line 1
    iget-object v1, p0, Lh02;->B:Lqc3;

    .line 2
    .line 3
    iget-object p0, p0, Lh02;->A:Lpq6;

    .line 4
    .line 5
    iget-object v0, p1, Lwy3;->w:Ltk0;

    .line 6
    .line 7
    invoke-interface {v0}, Lhz1;->e()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-virtual {p1}, Lwy3;->getLayoutDirection()Ley3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    monitor-enter v1

    .line 16
    :try_start_0
    iget-object v4, v1, Lqc3;->y:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Lli;

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    new-instance v5, Lli;

    .line 23
    .line 24
    sget-object v6, Lgr8;->h:Lm23;

    .line 25
    .line 26
    sget-object v9, Ley3;->w:Ley3;

    .line 27
    .line 28
    const/high16 v10, 0x3f800000    # 1.0f

    .line 29
    .line 30
    const/4 v11, 0x0

    .line 31
    const-wide/16 v7, 0x0

    .line 32
    .line 33
    invoke-direct/range {v5 .. v11}, Lli;-><init>(Lpq6;JLey3;FLkq6;)V

    .line 34
    .line 35
    .line 36
    iput-object v5, v1, Lqc3;->y:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v4, v5

    .line 39
    :cond_0
    iput-object p0, v4, Lli;->a:Lpq6;

    .line 40
    .line 41
    iput-wide v2, v4, Lli;->b:J

    .line 42
    .line 43
    iput-object v0, v4, Lli;->c:Ley3;

    .line 44
    .line 45
    iget-object p0, p1, Lwy3;->w:Ltk0;

    .line 46
    .line 47
    invoke-virtual {p0}, Ltk0;->b()F

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    iput p0, v4, Lli;->d:F

    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p0, v0

    .line 57
    monitor-exit v1

    .line 58
    throw p0
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
