.class public final Ld17;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lj77;

.field public final b:Ldv7;

.field public final c:Lh81;


# direct methods
.method public constructor <init>(Lj77;Ldv7;Lh81;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ld17;->a:Lj77;

    .line 11
    .line 12
    iput-object p2, p0, Ld17;->b:Ldv7;

    .line 13
    .line 14
    iput-object p3, p0, Ld17;->c:Lh81;

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

.method public static final a(Ld17;Lh61;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Ld17;->b:Ldv7;

    .line 2
    .line 3
    instance-of v1, p1, Lx07;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lx07;

    .line 9
    .line 10
    iget v2, v1, Lx07;->C:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lx07;->C:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lx07;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, Lx07;-><init>(Ld17;Lh61;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p0, v1, Lx07;->A:Ljava/lang/Object;

    .line 28
    .line 29
    iget p1, v1, Lx07;->C:I

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    const/4 v3, 0x1

    .line 33
    sget-object v4, Lp81;->w:Lp81;

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    if-eq p1, v3, :cond_2

    .line 38
    .line 39
    if-ne p1, v2, :cond_1

    .line 40
    .line 41
    iget-object p1, v1, Lx07;->z:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p0}, Lo85;->q(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object p0, v0

    .line 62
    check-cast p0, Ldy7;

    .line 63
    .line 64
    invoke-virtual {p0}, Ldy7;->d()Ldi2;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    iput v3, v1, Lx07;->C:I

    .line 69
    .line 70
    invoke-static {p0, v1}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v4, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    :goto_1
    check-cast p0, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;

    .line 78
    .line 79
    invoke-virtual {p0}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->getSpotsDeviceId()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-lez p1, :cond_5

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_5
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iput-object p0, v1, Lx07;->z:Ljava/lang/String;

    .line 102
    .line 103
    iput v2, v1, Lx07;->C:I

    .line 104
    .line 105
    check-cast v0, Ldy7;

    .line 106
    .line 107
    invoke-virtual {v0, p0, v1}, Ldy7;->H(Ljava/lang/String;Lh61;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v4, :cond_6

    .line 112
    .line 113
    :goto_2
    return-object v4

    .line 114
    :cond_6
    return-object p0
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

.method public static final b(Ld17;Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;Ljava/lang/String;I)Lo11;
    .locals 20

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;->getConnectionType()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lr11;->valueOf(Ljava/lang/String;)Lr11;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    new-instance v1, Lm66;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object v0, v1

    .line 20
    :goto_0
    nop

    .line 21
    instance-of v1, v0, Lm66;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    move-object v0, v2

    .line 27
    :cond_0
    move-object v6, v0

    .line 28
    check-cast v6, Lr11;

    .line 29
    .line 30
    if-nez v6, :cond_1

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_1
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;->getQuality()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lq07;->valueOf(Ljava/lang/String;)Lq07;

    .line 39
    .line 40
    .line 41
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    goto :goto_1

    .line 43
    :catchall_1
    move-exception v0

    .line 44
    new-instance v1, Lm66;

    .line 45
    .line 46
    invoke-direct {v1, v0}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object v0, v1

    .line 50
    :goto_1
    nop

    .line 51
    instance-of v1, v0, Lm66;

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    move-object v0, v2

    .line 56
    :cond_2
    move-object v7, v0

    .line 57
    check-cast v7, Lq07;

    .line 58
    .line 59
    if-nez v7, :cond_3

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_3
    new-instance v3, Lo11;

    .line 63
    .line 64
    invoke-virtual/range {p1 .. p1}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;->getId()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual/range {p1 .. p1}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;->getNick()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual/range {p1 .. p1}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;->getAddress()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-virtual/range {p1 .. p1}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;->getProvince()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, ""

    .line 81
    .line 82
    if-nez v0, :cond_4

    .line 83
    .line 84
    move-object v9, v1

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    move-object v9, v0

    .line 87
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;->getNote()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-nez v0, :cond_5

    .line 92
    .line 93
    move-object v10, v1

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    move-object v10, v0

    .line 96
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;->getLatitude()Ljava/lang/Double;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    invoke-virtual/range {p1 .. p1}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;->getLongitude()Ljava/lang/Double;

    .line 101
    .line 102
    .line 103
    move-result-object v12

    .line 104
    invoke-virtual/range {p1 .. p1}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;->getCreatedAt()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const/16 v1, 0xa

    .line 109
    .line 110
    invoke-static {v1, v0}, Ld57;->i1(ILjava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    invoke-virtual/range {p1 .. p1}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;->getLikes()J

    .line 115
    .line 116
    .line 117
    move-result-wide v14

    .line 118
    invoke-virtual/range {p1 .. p1}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;->getDislikes()J

    .line 119
    .line 120
    .line 121
    move-result-wide v16

    .line 122
    invoke-virtual/range {p1 .. p1}, Lcu/lestebang/utiletecsa/data/repository/spots/SpotFeedDto;->getDeviceId()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    move-object/from16 v1, p2

    .line 127
    .line 128
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v19

    .line 132
    move/from16 v18, p3

    .line 133
    .line 134
    invoke-direct/range {v3 .. v19}, Lo11;-><init>(Ljava/lang/String;Ljava/lang/String;Lr11;Lq07;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;JJIZ)V

    .line 135
    .line 136
    .line 137
    move-object v2, v3

    .line 138
    :goto_4
    return-object v2
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method


# virtual methods
.method public final c(Ldz4;Lh61;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lt07;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lt07;

    .line 7
    .line 8
    iget v1, v0, Lt07;->B:I

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
    iput v1, v0, Lt07;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lt07;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lt07;-><init>(Ld17;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lt07;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lt07;->B:I

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
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance p2, Lu07;

    .line 49
    .line 50
    invoke-direct {p2, p1, p0, v2}, Lu07;-><init>(Ldz4;Ld17;Lf61;)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Lt07;->B:I

    .line 54
    .line 55
    iget-object p0, p0, Ld17;->c:Lh81;

    .line 56
    .line 57
    invoke-static {p0, p2, v0}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    sget-object p0, Lp81;->w:Lp81;

    .line 62
    .line 63
    if-ne p2, p0, :cond_3

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_3
    :goto_1
    check-cast p2, Lo66;

    .line 67
    .line 68
    iget-object p0, p2, Lo66;->w:Ljava/lang/Object;

    .line 69
    .line 70
    return-object p0
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

.method public final d(Ljava/lang/String;Lh61;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lv07;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lv07;

    .line 7
    .line 8
    iget v1, v0, Lv07;->B:I

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
    iput v1, v0, Lv07;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lv07;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lv07;-><init>(Ld17;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lv07;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lv07;->B:I

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
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p2}, Lo85;->q(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance p2, Lw07;

    .line 49
    .line 50
    invoke-direct {p2, p0, p1, v2}, Lw07;-><init>(Ld17;Ljava/lang/String;Lf61;)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Lv07;->B:I

    .line 54
    .line 55
    iget-object p0, p0, Ld17;->c:Lh81;

    .line 56
    .line 57
    invoke-static {p0, p2, v0}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    sget-object p0, Lp81;->w:Lp81;

    .line 62
    .line 63
    if-ne p2, p0, :cond_3

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_3
    :goto_1
    check-cast p2, Lo66;

    .line 67
    .line 68
    iget-object p0, p2, Lo66;->w:Ljava/lang/Object;

    .line 69
    .line 70
    return-object p0
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

.method public final e(Lh61;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Ly07;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ly07;

    .line 7
    .line 8
    iget v1, v0, Ly07;->B:I

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
    iput v1, v0, Ly07;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ly07;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ly07;-><init>(Ld17;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ly07;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ly07;->B:I

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
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Lng;

    .line 49
    .line 50
    const/16 v1, 0x13

    .line 51
    .line 52
    invoke-direct {p1, p0, v2, v1}, Lng;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 53
    .line 54
    .line 55
    iput v3, v0, Ly07;->B:I

    .line 56
    .line 57
    iget-object p0, p0, Ld17;->c:Lh81;

    .line 58
    .line 59
    invoke-static {p0, p1, v0}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object p0, Lp81;->w:Lp81;

    .line 64
    .line 65
    if-ne p1, p0, :cond_3

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_3
    :goto_1
    check-cast p1, Lo66;

    .line 69
    .line 70
    iget-object p0, p1, Lo66;->w:Ljava/lang/Object;

    .line 71
    .line 72
    return-object p0
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final f(Ljava/lang/String;ZLh61;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lb17;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lb17;

    .line 7
    .line 8
    iget v1, v0, Lb17;->B:I

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
    iput v1, v0, Lb17;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lb17;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lb17;-><init>(Ld17;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lb17;->z:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lb17;->B:I

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
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance p3, Lc17;

    .line 49
    .line 50
    invoke-direct {p3, p0, p1, p2, v2}, Lc17;-><init>(Ld17;Ljava/lang/String;ZLf61;)V

    .line 51
    .line 52
    .line 53
    iput v3, v0, Lb17;->B:I

    .line 54
    .line 55
    iget-object p0, p0, Ld17;->c:Lh81;

    .line 56
    .line 57
    invoke-static {p0, p3, v0}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    sget-object p0, Lp81;->w:Lp81;

    .line 62
    .line 63
    if-ne p3, p0, :cond_3

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_3
    :goto_1
    check-cast p3, Lo66;

    .line 67
    .line 68
    iget-object p0, p3, Lo66;->w:Ljava/lang/Object;

    .line 69
    .line 70
    return-object p0
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
