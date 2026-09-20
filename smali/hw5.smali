.class public final Lhw5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhf0;


# instance fields
.field public final b:Lxc3;

.field public c:Ljs0;

.field public final d:Ltc0;

.field public final e:Lfl3;

.field public final f:Le81;


# direct methods
.method public constructor <init>(Lxc3;Le81;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhw5;->b:Lxc3;

    .line 8
    .line 9
    new-instance p1, Ltc0;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lhw5;->d:Ltc0;

    .line 15
    .line 16
    sget-object p1, Lme6;->E:Lme6;

    .line 17
    .line 18
    invoke-interface {p2, p1}, Le81;->a0(Ld81;)Lc81;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lel3;

    .line 23
    .line 24
    new-instance v0, Lfl3;

    .line 25
    .line 26
    invoke-direct {v0, p1}, Lfl3;-><init>(Lel3;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lhw5;->e:Lfl3;

    .line 30
    .line 31
    invoke-interface {p2, v0}, Le81;->X(Le81;)Le81;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance p2, Lk81;

    .line 36
    .line 37
    const-string v0, "RawSourceChannel"

    .line 38
    .line 39
    invoke-direct {p2, v0}, Lk81;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, p2}, Le81;->X(Le81;)Le81;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lhw5;->f:Le81;

    .line 47
    .line 48
    return-void
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


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lhw5;->c:Ljs0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "Channel was cancelled"

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :cond_1
    invoke-static {v0, p1}, Lrc9;->b(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v2, p0, Lhw5;->e:Lfl3;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Lll3;->o(Ljava/util/concurrent/CancellationException;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lhw5;->b:Lxc3;

    .line 25
    .line 26
    invoke-virtual {v0}, Lxc3;->close()V

    .line 27
    .line 28
    .line 29
    new-instance v0, Ljs0;

    .line 30
    .line 31
    new-instance v2, Ljava/io/IOException;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move-object v1, v3

    .line 41
    :goto_0
    invoke-direct {v2, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v2}, Ljs0;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lhw5;->c:Ljs0;

    .line 48
    .line 49
    return-void
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

.method public final b()Ljava/lang/Throwable;
    .locals 1

    .line 1
    iget-object p0, p0, Lhw5;->c:Ljs0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lis0;->D:Lis0;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljs0;->a(Lvr2;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final d(ILh61;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lgw5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lgw5;

    .line 7
    .line 8
    iget v1, v0, Lgw5;->C:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lgw5;->C:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lgw5;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lgw5;-><init>(Lhw5;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lgw5;->A:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lgw5;->C:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget p1, v0, Lgw5;->z:I

    .line 36
    .line 37
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Lhw5;->c:Ljs0;

    .line 51
    .line 52
    if-eqz p2, :cond_3

    .line 53
    .line 54
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_3
    new-instance p2, Lot;

    .line 58
    .line 59
    const/16 v1, 0x18

    .line 60
    .line 61
    invoke-direct {p2, p0, p1, v2, v1}, Lot;-><init>(Ljava/lang/Object;ILf61;I)V

    .line 62
    .line 63
    .line 64
    iput p1, v0, Lgw5;->z:I

    .line 65
    .line 66
    iput v3, v0, Lgw5;->C:I

    .line 67
    .line 68
    iget-object v1, p0, Lhw5;->f:Le81;

    .line 69
    .line 70
    invoke-static {v1, p2, v0}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    sget-object v0, Lp81;->w:Lp81;

    .line 75
    .line 76
    if-ne p2, v0, :cond_4

    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_4
    :goto_1
    iget-object p0, p0, Lhw5;->d:Ltc0;

    .line 80
    .line 81
    iget-wide v0, p0, Ltc0;->y:J

    .line 82
    .line 83
    int-to-long p0, p1

    .line 84
    cmp-long p0, v0, p0

    .line 85
    .line 86
    if-ltz p0, :cond_5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    const/4 v3, 0x0

    .line 90
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
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

.method public final g()Ltc0;
    .locals 0

    .line 1
    iget-object p0, p0, Lhw5;->d:Ltc0;

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

.method public final h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lhw5;->c:Ljs0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lhw5;->d:Ltc0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ltc0;->x()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
