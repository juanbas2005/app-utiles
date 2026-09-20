.class public final Lmz0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Lnz0;


# direct methods
.method public constructor <init>(Lnz0;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmz0;->y:Lnz0;

    .line 5
    .line 6
    iput p2, p0, Lmz0;->w:I

    .line 7
    .line 8
    iput-wide p3, p0, Lmz0;->x:J

    .line 9
    .line 10
    return-void
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
.method public final run()V
    .locals 8

    .line 1
    iget-object v1, p0, Lmz0;->y:Lnz0;

    .line 2
    .line 3
    iget v0, p0, Lmz0;->w:I

    .line 4
    .line 5
    iget-wide v4, p0, Lmz0;->x:J

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    add-int/lit8 v6, v0, -0x1

    .line 9
    .line 10
    rsub-int/lit8 p0, v6, 0x3

    .line 11
    .line 12
    :try_start_0
    iget-object v0, v1, Lnz0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lwz0;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lwz0;->c(I)Lyb9;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object p0, v1, Lnz0;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lqz0;

    .line 23
    .line 24
    invoke-virtual {p0}, Lqz0;->b()Lyb9;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    filled-new-array {v2, v3}, [Lyb9;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lb35;->B([Lyb9;)Lyb9;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iget-object v0, v1, Lnz0;->g:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v7, v0

    .line 39
    check-cast v7, Ljava/util/concurrent/ScheduledExecutorService;

    .line 40
    .line 41
    new-instance v0, Llz0;

    .line 42
    .line 43
    invoke-direct/range {v0 .. v6}, Llz0;-><init>(Lnz0;Lyb9;Lyb9;JI)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v7, v0}, Lyb9;->g(Ljava/util/concurrent/Executor;Lg61;)Lyb9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    monitor-exit v1

    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    move-object p0, v0

    .line 53
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p0
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
