.class public final Ly81;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhf0;


# instance fields
.field public final b:Lhf0;

.field public final c:Ltc0;

.field public d:J

.field public e:J


# direct methods
.method public constructor <init>(Lhf0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ly81;->b:Lhf0;

    .line 8
    .line 9
    new-instance p1, Ltc0;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ly81;->c:Ltc0;

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
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ly81;->b:Lhf0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lhf0;->a(Ljava/lang/Throwable;)V

    .line 4
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

.method public final b()Ljava/lang/Throwable;
    .locals 0

    .line 1
    iget-object p0, p0, Ly81;->b:Lhf0;

    .line 2
    .line 3
    invoke-interface {p0}, Lhf0;->b()Ljava/lang/Throwable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
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

.method public final c()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ly81;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly81;->b:Lhf0;

    .line 5
    .line 6
    invoke-interface {v0}, Lhf0;->g()Ltc0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Ly81;->c:Ltc0;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ltc0;->u(Lfw5;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget-wide v2, p0, Ly81;->d:J

    .line 17
    .line 18
    add-long/2addr v2, v0

    .line 19
    iput-wide v2, p0, Ly81;->d:J

    .line 20
    .line 21
    return-void
.end method

.method public final d(ILh61;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lx81;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lx81;

    .line 7
    .line 8
    iget v1, v0, Lx81;->B:I

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
    iput v1, v0, Lx81;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lx81;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lx81;-><init>(Ly81;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lx81;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lx81;->B:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ly81;->c()V

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, Ly81;->c:Ltc0;

    .line 52
    .line 53
    iget-wide v3, p2, Ltc0;->y:J

    .line 54
    .line 55
    int-to-long v5, p1

    .line 56
    cmp-long p2, v3, v5

    .line 57
    .line 58
    if-ltz p2, :cond_3

    .line 59
    .line 60
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    iput v2, v0, Lx81;->B:I

    .line 64
    .line 65
    iget-object p2, p0, Ly81;->b:Lhf0;

    .line 66
    .line 67
    invoke-interface {p2, p1, v0}, Lhf0;->d(ILh61;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    sget-object p1, Lp81;->w:Lp81;

    .line 72
    .line 73
    if-ne p2, p1, :cond_4

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_5

    .line 83
    .line 84
    invoke-virtual {p0}, Ly81;->c()V

    .line 85
    .line 86
    .line 87
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_5
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 91
    .line 92
    return-object p0
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

.method public final e()V
    .locals 6

    .line 1
    iget-wide v0, p0, Ly81;->e:J

    .line 2
    .line 3
    iget-wide v2, p0, Ly81;->d:J

    .line 4
    .line 5
    iget-object v4, p0, Ly81;->c:Ltc0;

    .line 6
    .line 7
    iget-wide v4, v4, Ltc0;->y:J

    .line 8
    .line 9
    sub-long/2addr v2, v4

    .line 10
    add-long/2addr v2, v0

    .line 11
    iput-wide v2, p0, Ly81;->e:J

    .line 12
    .line 13
    iput-wide v4, p0, Ly81;->d:J

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final g()Ltc0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly81;->c()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ly81;->c:Ltc0;

    .line 5
    .line 6
    return-object p0
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
    iget-object v0, p0, Ly81;->c:Ltc0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltc0;->x()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ly81;->b:Lhf0;

    .line 10
    .line 11
    invoke-interface {p0}, Lhf0;->h()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
    .line 21
.end method
