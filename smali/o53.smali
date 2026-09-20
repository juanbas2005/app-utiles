.class public final Lo53;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public synthetic A:Ly53;

.field public synthetic B:Ljava/lang/Object;

.field public final synthetic C:Ljava/lang/String;

.field public final synthetic D:Ljava/nio/charset/Charset;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;Lf61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo53;->C:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lo53;->D:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, La97;-><init>(ILf61;)V

    .line 7
    .line 8
    .line 9
    return-void
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
.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lo53;->A:Ly53;

    .line 2
    .line 3
    iget-object v1, p0, Lo53;->B:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lq53;->a:Lcc4;

    .line 9
    .line 10
    iget-object p1, p0, Lo53;->C:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object v2, v0, Ly53;->c:Ldz2;

    .line 15
    .line 16
    const-string v3, "Accept-Charset"

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Lin8;->E0(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object v2, Lq53;->a:Lcc4;

    .line 26
    .line 27
    const-string v4, "Adding Accept-Charset="

    .line 28
    .line 29
    const-string v5, " to "

    .line 30
    .line 31
    invoke-static {v4, p1, v5}, Lb81;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-object v5, v0, Ly53;->a:Lyr7;

    .line 36
    .line 37
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-interface {v2, v4}, Lcc4;->h(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v0, Ly53;->c:Ldz2;

    .line 48
    .line 49
    invoke-virtual {v2, v3, p1}, Lin8;->J(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    instance-of p1, v1, Ljava/lang/String;

    .line 53
    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-static {v0}, Lpv8;->p(Lh53;)Lq51;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    iget-object v2, p1, Lq51;->c:Ljava/lang/String;

    .line 64
    .line 65
    sget-object v3, Lp51;->b:Lq51;

    .line 66
    .line 67
    iget-object v3, v3, Lq51;->c:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v2, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_3

    .line 74
    .line 75
    :goto_1
    const/4 p0, 0x0

    .line 76
    return-object p0

    .line 77
    :cond_3
    check-cast v1, Ljava/lang/String;

    .line 78
    .line 79
    if-nez p1, :cond_4

    .line 80
    .line 81
    sget-object v2, Lp51;->b:Lq51;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    move-object v2, p1

    .line 85
    :goto_2
    if-eqz p1, :cond_5

    .line 86
    .line 87
    invoke-static {p1}, Lt51;->a(Lq51;)Ljava/nio/charset/Charset;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-nez p1, :cond_6

    .line 92
    .line 93
    :cond_5
    iget-object p1, p0, Lo53;->D:Ljava/nio/charset/Charset;

    .line 94
    .line 95
    :cond_6
    sget-object p0, Lq53;->a:Lcc4;

    .line 96
    .line 97
    new-instance v3, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string v4, "Sending request body to "

    .line 100
    .line 101
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, v0, Ly53;->a:Lyr7;

    .line 105
    .line 106
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v0, " as text/plain with charset "

    .line 110
    .line 111
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-interface {p0, v0}, Lcc4;->h(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    new-instance p0, Lvc7;

    .line 125
    .line 126
    sget v0, Lt51;->a:I

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, p1}, Lq51;->c(Ljava/lang/String;)Lq51;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-direct {p0, v1, p1}, Lvc7;-><init>(Ljava/lang/String;Lq51;)V

    .line 146
    .line 147
    .line 148
    return-object p0
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ly53;

    .line 2
    .line 3
    check-cast p3, Lf61;

    .line 4
    .line 5
    new-instance v0, Lo53;

    .line 6
    .line 7
    iget-object v1, p0, Lo53;->C:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lo53;->D:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    invoke-direct {v0, v1, p0, p3}, Lo53;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;Lf61;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lo53;->A:Ly53;

    .line 15
    .line 16
    iput-object p2, v0, Lo53;->B:Ljava/lang/Object;

    .line 17
    .line 18
    sget-object p0, Lvs7;->a:Lvs7;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lo53;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
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
