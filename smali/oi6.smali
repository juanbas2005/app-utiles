.class public final Loi6;
.super Lin8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final O:Lkl;

.field public static final P:Lkl;


# instance fields
.field public A:Lmm7;

.field public B:J

.field public final C:Lhx4;

.field public D:Lcy6;

.field public final E:Lad5;

.field public F:Lkk0;

.field public final G:Lqq4;

.field public final H:Lnq4;

.field public I:J

.field public final J:Llp4;

.field public K:Lhi6;

.field public final L:Lgi6;

.field public M:F

.field public final N:Lgi6;

.field public final x:Led5;

.field public final y:Led5;

.field public z:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkl;-><init>(F)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Loi6;->O:Lkl;

    .line 8
    .line 9
    new-instance v0, Lkl;

    .line 10
    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lkl;-><init>(F)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Loi6;->P:Lkl;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lin8;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Loi6;->x:Led5;

    .line 11
    .line 12
    invoke-static {p1}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Loi6;->y:Led5;

    .line 17
    .line 18
    iput-object p1, p0, Loi6;->z:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance p1, Lhx4;

    .line 21
    .line 22
    const/16 v0, 0x14

    .line 23
    .line 24
    invoke-direct {p1, v0, p0}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Loi6;->C:Lhx4;

    .line 28
    .line 29
    new-instance p1, Lad5;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, v0}, Lad5;-><init>(F)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Loi6;->E:Lad5;

    .line 36
    .line 37
    new-instance p1, Lqq4;

    .line 38
    .line 39
    invoke-direct {p1}, Lqq4;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Loi6;->G:Lqq4;

    .line 43
    .line 44
    new-instance p1, Lnq4;

    .line 45
    .line 46
    invoke-direct {p1}, Lnq4;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Loi6;->H:Lnq4;

    .line 50
    .line 51
    const-wide/high16 v0, -0x8000000000000000L

    .line 52
    .line 53
    iput-wide v0, p0, Loi6;->I:J

    .line 54
    .line 55
    new-instance p1, Llp4;

    .line 56
    .line 57
    invoke-direct {p1}, Llp4;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Loi6;->J:Llp4;

    .line 61
    .line 62
    new-instance p1, Lgi6;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-direct {p1, p0, v0}, Lgi6;-><init>(Loi6;I)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Loi6;->L:Lgi6;

    .line 69
    .line 70
    new-instance p1, Lgi6;

    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    invoke-direct {p1, p0, v0}, Lgi6;-><init>(Loi6;I)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Loi6;->N:Lgi6;

    .line 77
    .line 78
    return-void
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

.method public static final d1(Loi6;)V
    .locals 10

    .line 1
    iget-object v0, p0, Loi6;->E:Lad5;

    .line 2
    .line 3
    iget-object v1, p0, Loi6;->A:Lmm7;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v2, p0, Loi6;->K:Lhi6;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v2, :cond_4

    .line 12
    .line 13
    iget-wide v4, p0, Loi6;->B:J

    .line 14
    .line 15
    const-wide/16 v6, 0x0

    .line 16
    .line 17
    cmp-long v2, v4, v6

    .line 18
    .line 19
    if-lez v2, :cond_3

    .line 20
    .line 21
    invoke-virtual {v0}, Lad5;->d()F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/high16 v4, 0x3f800000    # 1.0f

    .line 26
    .line 27
    cmpg-float v2, v2, v4

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v2, p0, Loi6;->y:Led5;

    .line 33
    .line 34
    invoke-virtual {v2}, Led5;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v4, p0, Loi6;->x:Led5;

    .line 39
    .line 40
    invoke-virtual {v4}, Led5;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-static {v2, v4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    new-instance v2, Lhi6;

    .line 52
    .line 53
    invoke-direct {v2}, Lhi6;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lad5;->d()F

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iput v4, v2, Lhi6;->d:F

    .line 61
    .line 62
    iget-wide v4, p0, Loi6;->B:J

    .line 63
    .line 64
    iput-wide v4, v2, Lhi6;->g:J

    .line 65
    .line 66
    long-to-double v4, v4

    .line 67
    invoke-virtual {v0}, Lad5;->d()F

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    float-to-double v6, v6

    .line 72
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 73
    .line 74
    sub-double/2addr v8, v6

    .line 75
    mul-double/2addr v8, v4

    .line 76
    invoke-static {v8, v9}, Ldh4;->D(D)J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    iput-wide v4, v2, Lhi6;->h:J

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    invoke-virtual {v0}, Lad5;->d()F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iget-object v5, v2, Lhi6;->e:Lkl;

    .line 88
    .line 89
    invoke-virtual {v5, v4, v0}, Lkl;->e(IF)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    :goto_0
    move-object v2, v3

    .line 94
    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    .line 95
    .line 96
    iget-wide v4, p0, Loi6;->B:J

    .line 97
    .line 98
    iput-wide v4, v2, Lhi6;->g:J

    .line 99
    .line 100
    iget-object v0, p0, Loi6;->J:Llp4;

    .line 101
    .line 102
    invoke-virtual {v0, v2}, Llp4;->a(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v2}, Lmm7;->n(Lhi6;)V

    .line 106
    .line 107
    .line 108
    :cond_5
    iput-object v3, p0, Loi6;->K:Lhi6;

    .line 109
    .line 110
    return-void
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

.method public static final e1(Loi6;Lh61;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Loi6;->J:Llp4;

    .line 2
    .line 3
    instance-of v1, p1, Lji6;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lji6;

    .line 9
    .line 10
    iget v2, v1, Lji6;->B:I

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
    iput v2, v1, Lji6;->B:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lji6;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, Lji6;-><init>(Loi6;Lh61;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Lh61;->x:Le81;

    .line 28
    .line 29
    iget-object v2, v1, Lji6;->z:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v1, Lji6;->B:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    const-wide/high16 v6, -0x8000000000000000L

    .line 36
    .line 37
    sget-object v8, Lvs7;->a:Lvs7;

    .line 38
    .line 39
    sget-object v9, Lp81;->w:Lp81;

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    if-eq v3, v5, :cond_2

    .line 44
    .line 45
    if-ne v3, v4, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_2
    :goto_1
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Llp4;->h()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    iget-object v2, p0, Loi6;->K:Lhi6;

    .line 69
    .line 70
    if-nez v2, :cond_4

    .line 71
    .line 72
    return-object v8

    .line 73
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Li95;->p(Le81;)F

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    const/4 v3, 0x0

    .line 81
    cmpg-float v2, v2, v3

    .line 82
    .line 83
    if-nez v2, :cond_5

    .line 84
    .line 85
    invoke-virtual {p0}, Loi6;->j1()V

    .line 86
    .line 87
    .line 88
    iput-wide v6, p0, Loi6;->I:J

    .line 89
    .line 90
    return-object v8

    .line 91
    :cond_5
    iget-wide v2, p0, Loi6;->I:J

    .line 92
    .line 93
    cmp-long v2, v2, v6

    .line 94
    .line 95
    if-nez v2, :cond_6

    .line 96
    .line 97
    iget-object v2, p0, Loi6;->L:Lgi6;

    .line 98
    .line 99
    iput v5, v1, Lji6;->B:I

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {p1}, Lpd8;->s(Le81;)Lgj;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1, v2, v1}, Lgj;->a(Lvr2;Lf61;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v9, :cond_6

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    :goto_2
    invoke-virtual {v0}, Llp4;->i()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_8

    .line 120
    .line 121
    iget-object p1, p0, Loi6;->K:Lhi6;

    .line 122
    .line 123
    if-eqz p1, :cond_7

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_7
    iput-wide v6, p0, Loi6;->I:J

    .line 127
    .line 128
    return-object v8

    .line 129
    :cond_8
    :goto_3
    iput v4, v1, Lji6;->B:I

    .line 130
    .line 131
    invoke-virtual {p0, v1}, Loi6;->h1(Lh61;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-ne p1, v9, :cond_6

    .line 136
    .line 137
    :goto_4
    return-object v9
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

.method public static final f1(Loi6;Lh61;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Loi6;->G:Lqq4;

    .line 2
    .line 3
    instance-of v1, p1, Lmi6;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lmi6;

    .line 9
    .line 10
    iget v2, v1, Lmi6;->C:I

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
    iput v2, v1, Lmi6;->C:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lmi6;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, Lmi6;-><init>(Loi6;Lh61;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Lmi6;->A:Ljava/lang/Object;

    .line 28
    .line 29
    iget v2, v1, Lmi6;->C:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    sget-object v6, Lp81;->w:Lp81;

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget-object v0, v1, Lmi6;->z:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    iget-object v2, v1, Lmi6;->z:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object p1, v2

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Loi6;->x:Led5;

    .line 65
    .line 66
    invoke-virtual {p1}, Led5;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, v1, Lmi6;->z:Ljava/lang/Object;

    .line 71
    .line 72
    iput v5, v1, Lmi6;->C:I

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lqq4;->a(Lf61;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-ne v2, v6, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    :goto_1
    iput-object p1, v1, Lmi6;->z:Ljava/lang/Object;

    .line 82
    .line 83
    iput v4, v1, Lmi6;->C:I

    .line 84
    .line 85
    new-instance v2, Lkk0;

    .line 86
    .line 87
    invoke-static {v1}, Lrc9;->a0(Lf61;)Lf61;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-direct {v2, v5, v1}, Lkk0;-><init>(ILf61;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Lkk0;->v()V

    .line 95
    .line 96
    .line 97
    iput-object v2, p0, Loi6;->F:Lkk0;

    .line 98
    .line 99
    invoke-virtual {v0, v3}, Lqq4;->k(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Lkk0;->t()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-ne v0, v6, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v6

    .line 109
    :cond_5
    move-object v7, v0

    .line 110
    move-object v0, p1

    .line 111
    move-object p1, v7

    .line 112
    :goto_3
    invoke-static {p1, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_6

    .line 117
    .line 118
    sget-object p0, Lvs7;->a:Lvs7;

    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_6
    const-wide/high16 v0, -0x8000000000000000L

    .line 122
    .line 123
    iput-wide v0, p0, Loi6;->I:J

    .line 124
    .line 125
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 126
    .line 127
    const-string p1, "targetState while waiting for composition"

    .line 128
    .line 129
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p0
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

.method public static final g1(Loi6;Lh61;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Loi6;->G:Lqq4;

    .line 2
    .line 3
    instance-of v1, p1, Lni6;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lni6;

    .line 9
    .line 10
    iget v2, v1, Lni6;->C:I

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
    iput v2, v1, Lni6;->C:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lni6;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, Lni6;-><init>(Loi6;Lh61;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Lni6;->A:Ljava/lang/Object;

    .line 28
    .line 29
    iget v2, v1, Lni6;->C:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    sget-object v6, Lp81;->w:Lp81;

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget-object v0, v1, Lni6;->z:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    iget-object v2, v1, Lni6;->z:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object p1, v2

    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Loi6;->x:Led5;

    .line 65
    .line 66
    invoke-virtual {p1}, Led5;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, v1, Lni6;->z:Ljava/lang/Object;

    .line 71
    .line 72
    iput v5, v1, Lni6;->C:I

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lqq4;->a(Lf61;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-ne v2, v6, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    :goto_1
    iget-object v2, p0, Loi6;->z:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {p1, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_5

    .line 88
    .line 89
    invoke-virtual {v0, v3}, Lqq4;->k(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    iput-object p1, v1, Lni6;->z:Ljava/lang/Object;

    .line 94
    .line 95
    iput v4, v1, Lni6;->C:I

    .line 96
    .line 97
    new-instance v2, Lkk0;

    .line 98
    .line 99
    invoke-static {v1}, Lrc9;->a0(Lf61;)Lf61;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-direct {v2, v5, v1}, Lkk0;-><init>(ILf61;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Lkk0;->v()V

    .line 107
    .line 108
    .line 109
    iput-object v2, p0, Loi6;->F:Lkk0;

    .line 110
    .line 111
    invoke-virtual {v0, v3}, Lqq4;->k(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Lkk0;->t()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-ne v0, v6, :cond_6

    .line 119
    .line 120
    :goto_2
    return-object v6

    .line 121
    :cond_6
    move-object v7, v0

    .line 122
    move-object v0, p1

    .line 123
    move-object p1, v7

    .line 124
    :goto_3
    invoke-static {p1, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_7

    .line 129
    .line 130
    :goto_4
    sget-object p0, Lvs7;->a:Lvs7;

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_7
    const-wide/high16 v1, -0x8000000000000000L

    .line 134
    .line 135
    iput-wide v1, p0, Loi6;->I:J

    .line 136
    .line 137
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 138
    .line 139
    new-instance v1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v2, "snapTo() was canceled because state was changed to "

    .line 142
    .line 143
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string p1, " instead of "

    .line 150
    .line 151
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p0
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public static i1(Loi6;Ljava/lang/Object;La97;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v3, p0, Loi6;->A:Lmm7;

    .line 2
    .line 3
    if-nez v3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v6, p0, Loi6;->H:Lnq4;

    .line 7
    .line 8
    new-instance v0, Lii6;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    move-object v1, p0

    .line 13
    move-object v2, p1

    .line 14
    invoke-direct/range {v0 .. v5}, Lii6;-><init>(Loi6;Ljava/lang/Object;Lmm7;Lf61;I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v6, v0, p2}, Lnq4;->a(Lnq4;Lvr2;Lf61;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, Lp81;->w:Lp81;

    .line 22
    .line 23
    if-ne p0, p1, :cond_1

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    :goto_0
    sget-object p0, Lvs7;->a:Lvs7;

    .line 27
    .line 28
    return-object p0
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

.method public static k1(Lhi6;J)V
    .locals 8

    .line 1
    iget-wide v0, p0, Lhi6;->a:J

    .line 2
    .line 3
    add-long v3, v0, p1

    .line 4
    .line 5
    iput-wide v3, p0, Lhi6;->a:J

    .line 6
    .line 7
    iget-wide p1, p0, Lhi6;->h:J

    .line 8
    .line 9
    cmp-long v0, v3, p1

    .line 10
    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    if-ltz v0, :cond_0

    .line 14
    .line 15
    iput v1, p0, Lhi6;->d:F

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v2, p0, Lhi6;->b:Lp38;

    .line 19
    .line 20
    iget-object v5, p0, Lhi6;->e:Lkl;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lhi6;->f:Lkl;

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    sget-object p1, Loi6;->O:Lkl;

    .line 30
    .line 31
    :cond_1
    move-object v7, p1

    .line 32
    sget-object v6, Loi6;->P:Lkl;

    .line 33
    .line 34
    invoke-interface/range {v2 .. v7}, Lm38;->t(JLol;Lol;Lol;)Lol;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lkl;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lkl;->a(I)F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-static {p1, p2, v1}, Lz65;->o(FFF)F

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iput p1, p0, Lhi6;->d:F

    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    invoke-virtual {v5, v0}, Lkl;->a(I)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    long-to-float v2, v3

    .line 57
    long-to-float p1, p1

    .line 58
    div-float/2addr v2, p1

    .line 59
    sub-float p1, v1, v2

    .line 60
    .line 61
    mul-float/2addr p1, v0

    .line 62
    mul-float/2addr v2, v1

    .line 63
    add-float/2addr v2, p1

    .line 64
    iput v2, p0, Lhi6;->d:F

    .line 65
    .line 66
    return-void
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
.method public final H0()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Loi6;->y:Led5;

    .line 2
    .line 3
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

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

.method public final J0()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Loi6;->x:Led5;

    .line 2
    .line 3
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

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

.method public final O0(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Loi6;->y:Led5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Led5;->setValue(Ljava/lang/Object;)V

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

.method public final P0(Lmm7;)V
    .locals 3

    .line 1
    iget-object v0, p0, Loi6;->A:Lmm7;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Loi6;->A:Lmm7;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "An instance of SeekableTransitionState has been used in different Transitions. Previous instance: "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, ", new instance: "

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lxm5;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    iput-object p1, p0, Loi6;->A:Lmm7;

    .line 40
    .line 41
    return-void
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

.method public final Q0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Loi6;->A:Lmm7;

    .line 3
    .line 4
    iget-object v0, p0, Loi6;->D:Lcy6;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lcy6;->b(Loi6;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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

.method public final h1(Lh61;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-interface {p1}, Lf61;->r()Le81;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Li95;->p(Le81;)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpg-float v1, v0, v1

    .line 11
    .line 12
    sget-object v2, Lvs7;->a:Lvs7;

    .line 13
    .line 14
    if-gtz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Loi6;->j1()V

    .line 17
    .line 18
    .line 19
    return-object v2

    .line 20
    :cond_0
    iput v0, p0, Loi6;->M:F

    .line 21
    .line 22
    invoke-interface {p1}, Lf61;->r()Le81;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lpd8;->s(Le81;)Lgj;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object p0, p0, Loi6;->N:Lgi6;

    .line 31
    .line 32
    invoke-virtual {v0, p0, p1}, Lgj;->a(Lvr2;Lf61;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object p1, Lp81;->w:Lp81;

    .line 37
    .line 38
    if-ne p0, p1, :cond_1

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    return-object v2
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

.method public final j1()V
    .locals 1

    .line 1
    iget-object v0, p0, Loi6;->A:Lmm7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lmm7;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Loi6;->J:Llp4;

    .line 9
    .line 10
    invoke-virtual {v0}, Llp4;->d()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Loi6;->K:Lhi6;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Loi6;->K:Lhi6;

    .line 19
    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Loi6;->n1(F)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Loi6;->m1()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
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

.method public final l1(FLjava/lang/Object;La97;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, v0, p1

    .line 3
    .line 4
    if-gtz v0, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    cmpg-float v0, p1, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v1, "Expecting fraction between 0 and 1. Got "

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lxm5;->a(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v5, p0, Loi6;->A:Lmm7;

    .line 31
    .line 32
    if-nez v5, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v0, p0, Loi6;->x:Led5;

    .line 36
    .line 37
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    new-instance v1, Lli6;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    move-object v4, p0

    .line 45
    move v6, p1

    .line 46
    move-object v2, p2

    .line 47
    invoke-direct/range {v1 .. v7}, Lli6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Loi6;Lmm7;FLf61;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, v4, Loi6;->H:Lnq4;

    .line 51
    .line 52
    invoke-static {p0, v1, p3}, Lnq4;->a(Lnq4;Lvr2;Lf61;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    sget-object p1, Lp81;->w:Lp81;

    .line 57
    .line 58
    if-ne p0, p1, :cond_2

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_2
    :goto_1
    sget-object p0, Lvs7;->a:Lvs7;

    .line 62
    .line 63
    return-object p0
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

.method public final m1()V
    .locals 5

    .line 1
    iget-object v0, p0, Loi6;->A:Lmm7;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, Loi6;->E:Lad5;

    .line 7
    .line 8
    invoke-virtual {p0}, Lad5;->d()F

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    float-to-double v1, p0

    .line 13
    invoke-virtual {v0}, Lmm7;->g()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    long-to-double v3, v3

    .line 18
    mul-double/2addr v1, v3

    .line 19
    invoke-static {v1, v2}, Ldh4;->D(D)J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    invoke-virtual {v0, v1, v2}, Lmm7;->m(J)V

    .line 24
    .line 25
    .line 26
    return-void
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

.method public final n1(F)V
    .locals 0

    .line 1
    iget-object p0, p0, Loi6;->E:Lad5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lad5;->e(F)V

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

.method public final o1(Lcy6;)V
    .locals 2

    .line 1
    iget-object v0, p0, Loi6;->D:Lcy6;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Loi6;->D:Lcy6;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Lcy6;->b(Loi6;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Loi6;->D:Lcy6;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, v0, Lcy6;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lc9;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Lc9;->h()V

    .line 27
    .line 28
    .line 29
    :cond_1
    iput-object p1, p0, Loi6;->D:Lcy6;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Lcy6;->f()V

    .line 34
    .line 35
    .line 36
    :cond_2
    iget-object p1, p0, Loi6;->D:Lcy6;

    .line 37
    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    sget-object v0, Lrc9;->p:Lha7;

    .line 41
    .line 42
    iget-object v1, p0, Loi6;->C:Lhx4;

    .line 43
    .line 44
    invoke-virtual {p1, p0, v0, v1}, Lcy6;->e(Ljava/lang/Object;Lvr2;Lsr2;)V

    .line 45
    .line 46
    .line 47
    :cond_3
    return-void
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

.method public final p1(Ljava/lang/Object;La97;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v3, p0, Loi6;->A:Lmm7;

    .line 2
    .line 3
    if-nez v3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Loi6;->y:Led5;

    .line 7
    .line 8
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Loi6;->x:Led5;

    .line 19
    .line 20
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    new-instance v0, Lii6;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    move-object v1, p0

    .line 36
    move-object v2, p1

    .line 37
    invoke-direct/range {v0 .. v5}, Lii6;-><init>(Loi6;Ljava/lang/Object;Lmm7;Lf61;I)V

    .line 38
    .line 39
    .line 40
    iget-object p0, v1, Loi6;->H:Lnq4;

    .line 41
    .line 42
    invoke-static {p0, v0, p2}, Lnq4;->a(Lnq4;Lvr2;Lf61;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object p1, Lp81;->w:Lp81;

    .line 47
    .line 48
    if-ne p0, p1, :cond_2

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    :goto_0
    sget-object p0, Lvs7;->a:Lvs7;

    .line 52
    .line 53
    return-object p0
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
