.class public final Lc33;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ltu6;


# instance fields
.field public final w:Ltp2;

.field public x:Z

.field public final synthetic y:Lh33;


# direct methods
.method public constructor <init>(Lh33;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc33;->y:Lh33;

    .line 5
    .line 6
    new-instance v0, Ltp2;

    .line 7
    .line 8
    iget-object p1, p1, Lh33;->c:Lwr0;

    .line 9
    .line 10
    iget-object p1, p1, Lwr0;->z:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lyw5;

    .line 13
    .line 14
    iget-object p1, p1, Lyw5;->w:Ltu6;

    .line 15
    .line 16
    invoke-interface {p1}, Ltu6;->g()Lri7;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Ltp2;-><init>(Lri7;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lc33;->w:Ltp2;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lc33;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lc33;->x:Z

    .line 10
    .line 11
    iget-object v0, p0, Lc33;->y:Lh33;

    .line 12
    .line 13
    iget-object v0, v0, Lh33;->c:Lwr0;

    .line 14
    .line 15
    iget-object v0, v0, Lwr0;->z:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lyw5;

    .line 18
    .line 19
    const-string v1, "0\r\n\r\n"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lyw5;->N(Ljava/lang/String;)Ldd0;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lc33;->w:Ltp2;

    .line 25
    .line 26
    iget-object v1, v0, Ltp2;->e:Lri7;

    .line 27
    .line 28
    sget-object v2, Lri7;->d:Lqi7;

    .line 29
    .line 30
    iput-object v2, v0, Ltp2;->e:Lri7;

    .line 31
    .line 32
    invoke-virtual {v1}, Lri7;->a()Lri7;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lri7;->b()Lri7;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lc33;->y:Lh33;

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    iput v1, v0, Lh33;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    monitor-exit p0

    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    throw v0
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

.method public final declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lc33;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lc33;->y:Lh33;

    .line 9
    .line 10
    iget-object v0, v0, Lh33;->c:Lwr0;

    .line 11
    .line 12
    iget-object v0, v0, Lwr0;->z:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lyw5;

    .line 15
    .line 16
    invoke-virtual {v0}, Lyw5;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    throw v0
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

.method public final g()Lri7;
    .locals 0

    .line 1
    iget-object p0, p0, Lc33;->w:Ltp2;

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

.method public final g0(JLsc0;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lc33;->x:Z

    .line 2
    .line 3
    const-string v1, "closed"

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v0, p1, v2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p0, p0, Lc33;->y:Lh33;

    .line 15
    .line 16
    iget-object p0, p0, Lh33;->c:Lwr0;

    .line 17
    .line 18
    iget-object p0, p0, Lwr0;->z:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lyw5;

    .line 21
    .line 22
    iget-boolean v0, p0, Lyw5;->y:Z

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lyw5;->x:Lsc0;

    .line 27
    .line 28
    invoke-virtual {v0, p1, p2}, Lsc0;->h0(J)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lyw5;->a()Ldd0;

    .line 32
    .line 33
    .line 34
    const-string v0, "\r\n"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lyw5;->N(Ljava/lang/String;)Ldd0;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, p2, p3}, Lyw5;->g0(JLsc0;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lyw5;->N(Ljava/lang/String;)Ldd0;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-static {v1}, Lh;->s(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-static {v1}, Lh;->s(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void
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
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method
