.class public final Liz3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljx0;


# instance fields
.field public A:I

.field public final B:Ltp4;

.field public final C:Ltp4;

.field public final D:Lcz3;

.field public final E:Lzy3;

.field public final F:Ltp4;

.field public final G:Lr67;

.field public final H:Ltp4;

.field public final I:Leq4;

.field public J:I

.field public K:I

.field public final L:Ljava/lang/String;

.field public final w:Luy3;

.field public x:Lky0;

.field public y:Ls67;

.field public z:I


# direct methods
.method public constructor <init>(Luy3;Ls67;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Liz3;->w:Luy3;

    .line 5
    .line 6
    iput-object p2, p0, Liz3;->y:Ls67;

    .line 7
    .line 8
    sget-object p1, Lbg6;->a:[J

    .line 9
    .line 10
    new-instance p1, Ltp4;

    .line 11
    .line 12
    invoke-direct {p1}, Ltp4;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Liz3;->B:Ltp4;

    .line 16
    .line 17
    new-instance p1, Ltp4;

    .line 18
    .line 19
    invoke-direct {p1}, Ltp4;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Liz3;->C:Ltp4;

    .line 23
    .line 24
    new-instance p1, Lcz3;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lcz3;-><init>(Liz3;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Liz3;->D:Lcz3;

    .line 30
    .line 31
    new-instance p1, Lzy3;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lzy3;-><init>(Liz3;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Liz3;->E:Lzy3;

    .line 37
    .line 38
    new-instance p1, Ltp4;

    .line 39
    .line 40
    invoke-direct {p1}, Ltp4;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Liz3;->F:Ltp4;

    .line 44
    .line 45
    new-instance p1, Lr67;

    .line 46
    .line 47
    invoke-direct {p1}, Lr67;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Liz3;->G:Lr67;

    .line 51
    .line 52
    new-instance p1, Ltp4;

    .line 53
    .line 54
    invoke-direct {p1}, Ltp4;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Liz3;->H:Ltp4;

    .line 58
    .line 59
    new-instance p1, Leq4;

    .line 60
    .line 61
    const/16 p2, 0x10

    .line 62
    .line 63
    new-array p2, p2, [Ljava/lang/Object;

    .line 64
    .line 65
    invoke-direct {p1, p2}, Leq4;-><init>([Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Liz3;->I:Leq4;

    .line 69
    .line 70
    const-string p1, "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve \'match parent\' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement."

    .line 71
    .line 72
    iput-object p1, p0, Liz3;->L:Ljava/lang/String;

    .line 73
    .line 74
    return-void
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

.method public static final c(Liz3;Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Liz3;->w:Luy3;

    .line 2
    .line 3
    invoke-virtual {p0}, Liz3;->h()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Liz3;->F:Ltp4;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ltp4;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Luy3;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    iget v3, p0, Liz3;->K:I

    .line 18
    .line 19
    if-lez v3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v3, "No pre-composed items to dispose"

    .line 23
    .line 24
    invoke-static {v3}, Lyb3;->b(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {v0}, Luy3;->o()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljp4;

    .line 32
    .line 33
    iget-object v3, v3, Ljp4;->x:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Leq4;

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Leq4;->i(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v0}, Luy3;->o()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ljp4;

    .line 46
    .line 47
    iget-object v4, v4, Ljp4;->x:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v4, Leq4;

    .line 50
    .line 51
    iget v4, v4, Leq4;->y:I

    .line 52
    .line 53
    iget v5, p0, Liz3;->K:I

    .line 54
    .line 55
    sub-int/2addr v4, v5

    .line 56
    if-lt v3, v4, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const-string v4, "Item is not in pre-composed item range"

    .line 60
    .line 61
    invoke-static {v4}, Lyb3;->b(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    iget v4, p0, Liz3;->J:I

    .line 65
    .line 66
    add-int/2addr v4, v2

    .line 67
    iput v4, p0, Liz3;->J:I

    .line 68
    .line 69
    iget v4, p0, Liz3;->K:I

    .line 70
    .line 71
    add-int/lit8 v4, v4, -0x1

    .line 72
    .line 73
    iput v4, p0, Liz3;->K:I

    .line 74
    .line 75
    iget-object v4, p0, Liz3;->B:Ltp4;

    .line 76
    .line 77
    invoke-virtual {v4, v1}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Laz3;

    .line 82
    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    invoke-static {v1}, Liz3;->e(Laz3;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {v0}, Luy3;->o()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Ljp4;

    .line 93
    .line 94
    iget-object v1, v1, Ljp4;->x:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Leq4;

    .line 97
    .line 98
    iget v1, v1, Leq4;->y:I

    .line 99
    .line 100
    iget v4, p0, Liz3;->K:I

    .line 101
    .line 102
    sub-int/2addr v1, v4

    .line 103
    iget v4, p0, Liz3;->J:I

    .line 104
    .line 105
    sub-int/2addr v1, v4

    .line 106
    invoke-virtual {p0, v3, v1}, Liz3;->j(II)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v1}, Liz3;->g(I)V

    .line 110
    .line 111
    .line 112
    :cond_3
    iget-object p0, p0, Liz3;->I:Leq4;

    .line 113
    .line 114
    invoke-virtual {p0, p1}, Leq4;->h(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-eqz p0, :cond_4

    .line 119
    .line 120
    const/4 p0, 0x6

    .line 121
    invoke-static {v0, v2, p0}, Luy3;->Z(Luy3;ZI)V

    .line 122
    .line 123
    .line 124
    :cond_4
    return-void
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

.method public static e(Laz3;)V
    .locals 5

    .line 1
    iget-object v0, p0, Laz3;->f:Lze5;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, v0, Lze5;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    sget-object v2, Lbf5;->x:Lbf5;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lze5;->k:Lu36;

    .line 13
    .line 14
    iget-object v2, v1, Lu36;->d:Lup4;

    .line 15
    .line 16
    invoke-virtual {v2}, Lup4;->h()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, v1, Lu36;->d:Lup4;

    .line 24
    .line 25
    sget-object v4, Lcg6;->a:Lup4;

    .line 26
    .line 27
    new-instance v4, Lup4;

    .line 28
    .line 29
    invoke-direct {v4}, Lup4;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v4, v1, Lu36;->d:Lup4;

    .line 33
    .line 34
    iget-object v4, v1, Lu36;->c:Leq4;

    .line 35
    .line 36
    invoke-virtual {v4}, Leq4;->g()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v2, v3

    .line 41
    :goto_0
    invoke-virtual {v1}, Lu36;->b()V

    .line 42
    .line 43
    .line 44
    iget-object v0, v0, Lze5;->a:Lpy0;

    .line 45
    .line 46
    iput-object v3, v0, Lpy0;->M:Lze5;

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    iget-object v1, v0, Lpy0;->Q:Lu36;

    .line 51
    .line 52
    iput-object v2, v1, Lu36;->k:Lup4;

    .line 53
    .line 54
    const/4 v1, 0x2

    .line 55
    iput v1, v0, Lpy0;->S:I

    .line 56
    .line 57
    :cond_1
    iput-object v3, p0, Laz3;->f:Lze5;

    .line 58
    .line 59
    iget-object v0, p0, Laz3;->c:Lpy0;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0}, Lpy0;->o()V

    .line 64
    .line 65
    .line 66
    :cond_2
    iput-object v3, p0, Laz3;->c:Lpy0;

    .line 67
    .line 68
    :cond_3
    return-void
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method


# virtual methods
.method public final a()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, v0, Liz3;->w:Luy3;

    .line 5
    .line 6
    iput-boolean v1, v2, Luy3;->L:Z

    .line 7
    .line 8
    iget-object v1, v0, Liz3;->B:Ltp4;

    .line 9
    .line 10
    iget-object v3, v1, Ltp4;->c:[Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v4, v1, Ltp4;->a:[J

    .line 13
    .line 14
    array-length v5, v4

    .line 15
    add-int/lit8 v5, v5, -0x2

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    if-ltz v5, :cond_3

    .line 19
    .line 20
    move v7, v6

    .line 21
    :goto_0
    aget-wide v8, v4, v7

    .line 22
    .line 23
    not-long v10, v8

    .line 24
    const/4 v12, 0x7

    .line 25
    shl-long/2addr v10, v12

    .line 26
    and-long/2addr v10, v8

    .line 27
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v10, v12

    .line 33
    cmp-long v10, v10, v12

    .line 34
    .line 35
    if-eqz v10, :cond_2

    .line 36
    .line 37
    sub-int v10, v7, v5

    .line 38
    .line 39
    not-int v10, v10

    .line 40
    ushr-int/lit8 v10, v10, 0x1f

    .line 41
    .line 42
    const/16 v11, 0x8

    .line 43
    .line 44
    rsub-int/lit8 v10, v10, 0x8

    .line 45
    .line 46
    move v12, v6

    .line 47
    :goto_1
    if-ge v12, v10, :cond_1

    .line 48
    .line 49
    const-wide/16 v13, 0xff

    .line 50
    .line 51
    and-long/2addr v13, v8

    .line 52
    const-wide/16 v15, 0x80

    .line 53
    .line 54
    cmp-long v13, v13, v15

    .line 55
    .line 56
    if-gez v13, :cond_0

    .line 57
    .line 58
    shl-int/lit8 v13, v7, 0x3

    .line 59
    .line 60
    add-int/2addr v13, v12

    .line 61
    aget-object v13, v3, v13

    .line 62
    .line 63
    check-cast v13, Laz3;

    .line 64
    .line 65
    iget-object v13, v13, Laz3;->c:Lpy0;

    .line 66
    .line 67
    if-eqz v13, :cond_0

    .line 68
    .line 69
    invoke-virtual {v13}, Lpy0;->o()V

    .line 70
    .line 71
    .line 72
    :cond_0
    shr-long/2addr v8, v11

    .line 73
    add-int/lit8 v12, v12, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    if-ne v10, v11, :cond_3

    .line 77
    .line 78
    :cond_2
    if-eq v7, v5, :cond_3

    .line 79
    .line 80
    add-int/lit8 v7, v7, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-virtual {v2}, Luy3;->T()V

    .line 84
    .line 85
    .line 86
    iput-boolean v6, v2, Luy3;->L:Z

    .line 87
    .line 88
    invoke-virtual {v1}, Ltp4;->a()V

    .line 89
    .line 90
    .line 91
    iget-object v1, v0, Liz3;->C:Ltp4;

    .line 92
    .line 93
    invoke-virtual {v1}, Ltp4;->a()V

    .line 94
    .line 95
    .line 96
    iput v6, v0, Liz3;->K:I

    .line 97
    .line 98
    iput v6, v0, Liz3;->J:I

    .line 99
    .line 100
    iget-object v1, v0, Liz3;->F:Ltp4;

    .line 101
    .line 102
    invoke-virtual {v1}, Ltp4;->a()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Liz3;->h()V

    .line 106
    .line 107
    .line 108
    return-void
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Liz3;->i(Z)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public final d(Laz3;Z)V
    .locals 6

    .line 1
    iget-object v0, p1, Laz3;->f:Lze5;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-static {}, Lj45;->h()Lix6;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Lix6;->e()Lvr2;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v3, v2

    .line 18
    :goto_0
    invoke-static {v1}, Lj45;->j(Lix6;)Lix6;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    :try_start_0
    iget-object p0, p0, Liz3;->w:Luy3;

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    iput-boolean v5, p0, Luy3;->L:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lze5;->c()Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    new-instance p2, Lrf2;

    .line 36
    .line 37
    const/16 v5, 0x15

    .line 38
    .line 39
    invoke-direct {p2, v5}, Lrf2;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p2}, Lze5;->e(Lps6;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    invoke-virtual {v0}, Lze5;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    :try_start_2
    iput-object v2, p1, Laz3;->f:Lze5;

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput-boolean p1, p0, Luy3;->L:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 55
    .line 56
    invoke-static {v1, v4, v3}, Lj45;->m(Lix6;Lix6;Lvr2;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catchall_1
    move-exception p0

    .line 61
    goto :goto_3

    .line 62
    :goto_2
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 63
    :goto_3
    invoke-static {v1, v4, v3}, Lj45;->m(Lix6;Lix6;Lvr2;)V

    .line 64
    .line 65
    .line 66
    throw p0

    .line 67
    :cond_2
    return-void
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

.method public final f(Ljava/lang/Object;)Ln67;
    .locals 1

    .line 1
    iget-object v0, p0, Liz3;->w:Luy3;

    .line 2
    .line 3
    invoke-virtual {v0}, Luy3;->J()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance p0, Lfz3;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v0, Lgz3;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Lgz3;-><init>(Liz3;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
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

.method public final g(I)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Liz3;->J:I

    .line 3
    .line 4
    iget-object v1, p0, Liz3;->w:Luy3;

    .line 5
    .line 6
    invoke-virtual {v1}, Luy3;->o()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v2, v1

    .line 11
    check-cast v2, Ljp4;

    .line 12
    .line 13
    iget-object v3, v2, Ljp4;->x:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Leq4;

    .line 16
    .line 17
    iget v3, v3, Leq4;->y:I

    .line 18
    .line 19
    iget v4, p0, Liz3;->K:I

    .line 20
    .line 21
    sub-int/2addr v3, v4

    .line 22
    const/4 v4, 0x1

    .line 23
    sub-int/2addr v3, v4

    .line 24
    if-gt p1, v3, :cond_7

    .line 25
    .line 26
    iget-object v5, p0, Liz3;->G:Lr67;

    .line 27
    .line 28
    invoke-virtual {v5}, Lr67;->clear()V

    .line 29
    .line 30
    .line 31
    if-gt p1, v3, :cond_0

    .line 32
    .line 33
    move v5, p1

    .line 34
    :goto_0
    invoke-virtual {v2, v5}, Ljp4;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, Luy3;

    .line 39
    .line 40
    iget-object v7, p0, Liz3;->B:Ltp4;

    .line 41
    .line 42
    invoke-virtual {v7, v6}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    check-cast v6, Laz3;

    .line 50
    .line 51
    iget-object v6, v6, Laz3;->a:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v7, p0, Liz3;->G:Lr67;

    .line 54
    .line 55
    iget-object v7, v7, Lr67;->x:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v7, Lmp4;

    .line 58
    .line 59
    invoke-virtual {v7, v6}, Lmp4;->a(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    if-eq v5, v3, :cond_0

    .line 63
    .line 64
    add-int/lit8 v5, v5, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    iget-object v2, p0, Liz3;->y:Ls67;

    .line 68
    .line 69
    iget-object v5, p0, Liz3;->G:Lr67;

    .line 70
    .line 71
    invoke-interface {v2, v5}, Ls67;->a(Lr67;)V

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lj45;->h()Lix6;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-eqz v2, :cond_1

    .line 79
    .line 80
    invoke-virtual {v2}, Lix6;->e()Lvr2;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const/4 v5, 0x0

    .line 86
    :goto_1
    invoke-static {v2}, Lj45;->j(Lix6;)Lix6;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    move v7, v0

    .line 91
    :goto_2
    if-lt v3, p1, :cond_6

    .line 92
    .line 93
    :try_start_0
    move-object v8, v1

    .line 94
    check-cast v8, Ljp4;

    .line 95
    .line 96
    invoke-virtual {v8, v3}, Ljp4;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    check-cast v8, Luy3;

    .line 101
    .line 102
    iget-object v9, p0, Liz3;->B:Ltp4;

    .line 103
    .line 104
    invoke-virtual {v9, v8}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    check-cast v9, Laz3;

    .line 112
    .line 113
    iget-object v10, v9, Laz3;->a:Ljava/lang/Object;

    .line 114
    .line 115
    iget-object v11, p0, Liz3;->G:Lr67;

    .line 116
    .line 117
    iget-object v11, v11, Lr67;->x:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v11, Lmp4;

    .line 120
    .line 121
    invoke-virtual {v11, v10}, Lmp4;->c(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    if-eqz v11, :cond_3

    .line 126
    .line 127
    iget v11, p0, Liz3;->J:I

    .line 128
    .line 129
    add-int/2addr v11, v4

    .line 130
    iput v11, p0, Liz3;->J:I

    .line 131
    .line 132
    iget-object v11, v9, Laz3;->g:Led5;

    .line 133
    .line 134
    invoke-virtual {v11}, Led5;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    check-cast v11, Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 141
    .line 142
    .line 143
    move-result v11

    .line 144
    if-eqz v11, :cond_5

    .line 145
    .line 146
    iget-object v8, v8, Luy3;->b0:Lyy3;

    .line 147
    .line 148
    iget-object v11, v8, Lyy3;->p:Lkh4;

    .line 149
    .line 150
    sget-object v12, Lsy3;->y:Lsy3;

    .line 151
    .line 152
    iput-object v12, v11, Lkh4;->H:Lsy3;

    .line 153
    .line 154
    iget-object v8, v8, Lyy3;->q:Ljd4;

    .line 155
    .line 156
    if-eqz v8, :cond_2

    .line 157
    .line 158
    iput-object v12, v8, Ljd4;->F:Lsy3;

    .line 159
    .line 160
    :cond_2
    invoke-virtual {p0, v9, v0}, Liz3;->l(Laz3;Z)V

    .line 161
    .line 162
    .line 163
    iget-boolean v8, v9, Laz3;->h:Z

    .line 164
    .line 165
    if-eqz v8, :cond_5

    .line 166
    .line 167
    move v7, v4

    .line 168
    goto :goto_3

    .line 169
    :catchall_0
    move-exception p0

    .line 170
    goto :goto_4

    .line 171
    :cond_3
    iget-object v11, p0, Liz3;->w:Luy3;

    .line 172
    .line 173
    iput-boolean v4, v11, Luy3;->L:Z

    .line 174
    .line 175
    iget-object v12, p0, Liz3;->B:Ltp4;

    .line 176
    .line 177
    invoke-virtual {v12, v8}, Ltp4;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    iget-object v8, v9, Laz3;->c:Lpy0;

    .line 181
    .line 182
    if-eqz v8, :cond_4

    .line 183
    .line 184
    invoke-virtual {v8}, Lpy0;->o()V

    .line 185
    .line 186
    .line 187
    :cond_4
    iget-object v8, p0, Liz3;->w:Luy3;

    .line 188
    .line 189
    invoke-virtual {v8, v3, v4}, Luy3;->U(II)V

    .line 190
    .line 191
    .line 192
    iput-boolean v0, v11, Luy3;->L:Z

    .line 193
    .line 194
    :cond_5
    :goto_3
    iget-object v8, p0, Liz3;->C:Ltp4;

    .line 195
    .line 196
    invoke-virtual {v8, v10}, Ltp4;->k(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    .line 198
    .line 199
    add-int/lit8 v3, v3, -0x1

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :goto_4
    invoke-static {v2, v6, v5}, Lj45;->m(Lix6;Lix6;Lvr2;)V

    .line 203
    .line 204
    .line 205
    throw p0

    .line 206
    :cond_6
    invoke-static {v2, v6, v5}, Lj45;->m(Lix6;Lix6;Lvr2;)V

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_7
    move v7, v0

    .line 211
    :goto_5
    if-eqz v7, :cond_9

    .line 212
    .line 213
    sget-object p1, Lnx6;->c:Ljava/lang/Object;

    .line 214
    .line 215
    monitor-enter p1

    .line 216
    :try_start_1
    sget-object v1, Lnx6;->j:Lew2;

    .line 217
    .line 218
    iget-object v1, v1, Lyp4;->h:Lup4;

    .line 219
    .line 220
    if-eqz v1, :cond_8

    .line 221
    .line 222
    invoke-virtual {v1}, Lup4;->h()Z

    .line 223
    .line 224
    .line 225
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 226
    if-ne v1, v4, :cond_8

    .line 227
    .line 228
    move v0, v4

    .line 229
    :cond_8
    monitor-exit p1

    .line 230
    if-eqz v0, :cond_9

    .line 231
    .line 232
    invoke-static {}, Lnx6;->a()V

    .line 233
    .line 234
    .line 235
    goto :goto_6

    .line 236
    :catchall_1
    move-exception p0

    .line 237
    monitor-exit p1

    .line 238
    throw p0

    .line 239
    :cond_9
    :goto_6
    invoke-virtual {p0}, Liz3;->h()V

    .line 240
    .line 241
    .line 242
    return-void
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
.end method

.method public final h()V
    .locals 6

    .line 1
    iget-object v0, p0, Liz3;->w:Luy3;

    .line 2
    .line 3
    invoke-virtual {v0}, Luy3;->o()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljp4;

    .line 8
    .line 9
    iget-object v0, v0, Ljp4;->x:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Leq4;

    .line 12
    .line 13
    iget v0, v0, Leq4;->y:I

    .line 14
    .line 15
    iget-object v1, p0, Liz3;->B:Ltp4;

    .line 16
    .line 17
    iget v1, v1, Ltp4;->e:I

    .line 18
    .line 19
    if-ne v1, v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v3, "Inconsistency between the count of nodes tracked by the state ("

    .line 25
    .line 26
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ") and the children count on the SubcomposeLayout ("

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, "). Are you trying to use the state of the disposed SubcomposeLayout?"

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v1}, Lyb3;->a(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    iget v1, p0, Liz3;->J:I

    .line 53
    .line 54
    sub-int v2, v0, v1

    .line 55
    .line 56
    iget v3, p0, Liz3;->K:I

    .line 57
    .line 58
    sub-int/2addr v2, v3

    .line 59
    if-ltz v2, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const-string v2, ". Reusable children "

    .line 63
    .line 64
    const-string v4, ". Precomposed children "

    .line 65
    .line 66
    const-string v5, "Incorrect state. Total children "

    .line 67
    .line 68
    invoke-static {v5, v0, v2, v1, v4}, Lpb4;->p(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lyb3;->a(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    iget-object v0, p0, Liz3;->F:Ltp4;

    .line 83
    .line 84
    iget v0, v0, Ltp4;->e:I

    .line 85
    .line 86
    iget p0, p0, Liz3;->K:I

    .line 87
    .line 88
    if-ne v0, p0, :cond_2

    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v2, "Incorrect state. Precomposed children "

    .line 94
    .line 95
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p0, ". Map size "

    .line 102
    .line 103
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p0}, Lyb3;->a(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-void
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final i(Z)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Liz3;->K:I

    .line 3
    .line 4
    iget-object v1, p0, Liz3;->F:Ltp4;

    .line 5
    .line 6
    invoke-virtual {v1}, Ltp4;->a()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Liz3;->w:Luy3;

    .line 10
    .line 11
    invoke-virtual {v1}, Luy3;->o()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    move-object v2, v1

    .line 16
    check-cast v2, Ljp4;

    .line 17
    .line 18
    iget-object v2, v2, Ljp4;->x:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Leq4;

    .line 21
    .line 22
    iget v2, v2, Leq4;->y:I

    .line 23
    .line 24
    iget v3, p0, Liz3;->J:I

    .line 25
    .line 26
    if-eq v3, v2, :cond_4

    .line 27
    .line 28
    iput v2, p0, Liz3;->J:I

    .line 29
    .line 30
    invoke-static {}, Lj45;->h()Lix6;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-virtual {v3}, Lix6;->e()Lvr2;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v4, 0x0

    .line 42
    :goto_0
    invoke-static {v3}, Lj45;->j(Lix6;)Lix6;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    :goto_1
    if-ge v0, v2, :cond_3

    .line 47
    .line 48
    :try_start_0
    move-object v6, v1

    .line 49
    check-cast v6, Ljp4;

    .line 50
    .line 51
    invoke-virtual {v6, v0}, Ljp4;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Luy3;

    .line 56
    .line 57
    iget-object v7, p0, Liz3;->B:Ltp4;

    .line 58
    .line 59
    invoke-virtual {v7, v6}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    check-cast v7, Laz3;

    .line 64
    .line 65
    if-eqz v7, :cond_2

    .line 66
    .line 67
    iget-object v8, v7, Laz3;->g:Led5;

    .line 68
    .line 69
    invoke-virtual {v8}, Led5;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    check-cast v8, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_2

    .line 80
    .line 81
    iget-object v6, v6, Luy3;->b0:Lyy3;

    .line 82
    .line 83
    iget-object v8, v6, Lyy3;->p:Lkh4;

    .line 84
    .line 85
    sget-object v9, Lsy3;->y:Lsy3;

    .line 86
    .line 87
    iput-object v9, v8, Lkh4;->H:Lsy3;

    .line 88
    .line 89
    iget-object v6, v6, Lyy3;->q:Ljd4;

    .line 90
    .line 91
    if-eqz v6, :cond_1

    .line 92
    .line 93
    iput-object v9, v6, Ljd4;->F:Lsy3;

    .line 94
    .line 95
    :cond_1
    invoke-virtual {p0, v7, p1}, Liz3;->l(Laz3;Z)V

    .line 96
    .line 97
    .line 98
    sget-object v6, Lm67;->a:Ls63;

    .line 99
    .line 100
    iput-object v6, v7, Laz3;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :catchall_0
    move-exception p0

    .line 104
    goto :goto_3

    .line 105
    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :goto_3
    invoke-static {v3, v5, v4}, Lj45;->m(Lix6;Lix6;Lvr2;)V

    .line 109
    .line 110
    .line 111
    throw p0

    .line 112
    :cond_3
    invoke-static {v3, v5, v4}, Lj45;->m(Lix6;Lix6;Lvr2;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Liz3;->C:Ltp4;

    .line 116
    .line 117
    invoke-virtual {p1}, Ltp4;->a()V

    .line 118
    .line 119
    .line 120
    :cond_4
    invoke-virtual {p0}, Liz3;->h()V

    .line 121
    .line 122
    .line 123
    return-void
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

.method public final j(II)V
    .locals 1

    .line 1
    iget-object p0, p0, Liz3;->w:Luy3;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Luy3;->L:Z

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, v0}, Luy3;->N(III)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Luy3;->L:Z

    .line 11
    .line 12
    return-void
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

.method public final k(Ljava/lang/Object;Lgs2;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Liz3;->w:Luy3;

    .line 2
    .line 3
    invoke-virtual {v0}, Luy3;->J()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p0}, Liz3;->h()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Liz3;->C:Ltp4;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ltp4;->c(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_3

    .line 20
    .line 21
    iget-object v1, p0, Liz3;->H:Ltp4;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ltp4;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Liz3;->F:Ltp4;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Liz3;->n(Ljava/lang/Object;)Luy3;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const/4 v3, 0x1

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Luy3;->o()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ljp4;

    .line 46
    .line 47
    iget-object v4, v4, Ljp4;->x:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v4, Leq4;

    .line 50
    .line 51
    invoke-virtual {v4, v2}, Leq4;->i(Ljava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-virtual {v0}, Luy3;->o()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljp4;

    .line 60
    .line 61
    iget-object v0, v0, Ljp4;->x:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Leq4;

    .line 64
    .line 65
    iget v0, v0, Leq4;->y:I

    .line 66
    .line 67
    invoke-virtual {p0, v4, v0}, Liz3;->j(II)V

    .line 68
    .line 69
    .line 70
    iget v0, p0, Liz3;->K:I

    .line 71
    .line 72
    add-int/2addr v0, v3

    .line 73
    iput v0, p0, Liz3;->K:I

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {v0}, Luy3;->o()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Ljp4;

    .line 81
    .line 82
    iget-object v2, v2, Ljp4;->x:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Leq4;

    .line 85
    .line 86
    iget v2, v2, Leq4;->y:I

    .line 87
    .line 88
    new-instance v4, Luy3;

    .line 89
    .line 90
    const/4 v5, 0x2

    .line 91
    invoke-direct {v4, v5}, Luy3;-><init>(I)V

    .line 92
    .line 93
    .line 94
    iput-boolean v3, v0, Luy3;->L:Z

    .line 95
    .line 96
    invoke-virtual {v0, v2, v4}, Luy3;->B(ILuy3;)V

    .line 97
    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    iput-boolean v2, v0, Luy3;->L:Z

    .line 101
    .line 102
    iget v0, p0, Liz3;->K:I

    .line 103
    .line 104
    add-int/2addr v0, v3

    .line 105
    iput v0, p0, Liz3;->K:I

    .line 106
    .line 107
    move-object v2, v4

    .line 108
    :goto_0
    invoke-virtual {v1, p1, v2}, Ltp4;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    check-cast v2, Luy3;

    .line 112
    .line 113
    invoke-virtual {p0, v2, p1, p3, p2}, Liz3;->m(Luy3;Ljava/lang/Object;ZLgs2;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    :goto_1
    return-void
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
.end method

.method public final l(Laz3;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p1, Laz3;->h:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Laz3;->g:Led5;

    .line 8
    .line 9
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Led5;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-static {v0}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p1, Laz3;->g:Led5;

    .line 22
    .line 23
    :goto_0
    iget-object v0, p1, Laz3;->f:Lze5;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-static {p1}, Liz3;->e(Laz3;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    if-eqz p2, :cond_2

    .line 32
    .line 33
    iget-object p0, p1, Laz3;->c:Lpy0;

    .line 34
    .line 35
    if-eqz p0, :cond_4

    .line 36
    .line 37
    invoke-virtual {p0}, Lpy0;->n()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    iget-object p0, p0, Liz3;->w:Luy3;

    .line 42
    .line 43
    invoke-static {p0}, Lxy3;->a(Luy3;)Lp95;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lje;

    .line 48
    .line 49
    invoke-virtual {p0}, Lje;->getOutOfFrameExecutor()Lf85;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_3

    .line 54
    .line 55
    new-instance p2, Lkh;

    .line 56
    .line 57
    const/16 v0, 0x9

    .line 58
    .line 59
    invoke-direct {p2, v0, p1}, Lkh;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    check-cast p0, Lje;

    .line 63
    .line 64
    invoke-virtual {p0, p2}, Lje;->E(Lsr2;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    iget-boolean p0, p1, Laz3;->h:Z

    .line 69
    .line 70
    if-nez p0, :cond_4

    .line 71
    .line 72
    iget-object p0, p1, Laz3;->c:Lpy0;

    .line 73
    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    invoke-virtual {p0}, Lpy0;->n()V

    .line 77
    .line 78
    .line 79
    :cond_4
    return-void
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

.method public final m(Luy3;Ljava/lang/Object;ZLgs2;)V
    .locals 8

    .line 1
    iget-object v0, p0, Liz3;->B:Ltp4;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Laz3;

    .line 11
    .line 12
    sget-object v3, Lyw0;->a:Lfw0;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p2, v1, Laz3;->a:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v3, v1, Laz3;->b:Lgs2;

    .line 20
    .line 21
    iput-object v2, v1, Laz3;->c:Lpy0;

    .line 22
    .line 23
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-static {p2}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iput-object p2, v1, Laz3;->g:Led5;

    .line 30
    .line 31
    invoke-virtual {v0, p1, v1}, Ltp4;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    check-cast v1, Laz3;

    .line 35
    .line 36
    iget-object p2, v1, Laz3;->b:Lgs2;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    const/4 v3, 0x1

    .line 40
    if-eq p2, p4, :cond_1

    .line 41
    .line 42
    move p2, v3

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move p2, v0

    .line 45
    :goto_0
    iget-object v4, v1, Laz3;->f:Lze5;

    .line 46
    .line 47
    if-eqz v4, :cond_4

    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    invoke-static {v1}, Liz3;->e(Laz3;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    if-eqz p3, :cond_3

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_3
    invoke-virtual {p0, v1, v3}, Liz3;->d(Laz3;Z)V

    .line 59
    .line 60
    .line 61
    :cond_4
    :goto_1
    iget-object v4, v1, Laz3;->c:Lpy0;

    .line 62
    .line 63
    if-eqz v4, :cond_6

    .line 64
    .line 65
    iget-object v5, v4, Lpy0;->z:Ljava/lang/Object;

    .line 66
    .line 67
    monitor-enter v5

    .line 68
    :try_start_0
    iget-object v4, v4, Lpy0;->J:Ltp4;

    .line 69
    .line 70
    iget v4, v4, Ltp4;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    if-lez v4, :cond_5

    .line 73
    .line 74
    move v4, v3

    .line 75
    goto :goto_2

    .line 76
    :cond_5
    move v4, v0

    .line 77
    :goto_2
    monitor-exit v5

    .line 78
    goto :goto_3

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    monitor-exit v5

    .line 81
    throw p0

    .line 82
    :cond_6
    move v4, v3

    .line 83
    :goto_3
    if-nez p2, :cond_8

    .line 84
    .line 85
    if-nez v4, :cond_8

    .line 86
    .line 87
    iget-boolean p2, v1, Laz3;->d:Z

    .line 88
    .line 89
    if-eqz p2, :cond_7

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_7
    :goto_4
    return-void

    .line 93
    :cond_8
    :goto_5
    iput-object p4, v1, Laz3;->b:Lgs2;

    .line 94
    .line 95
    iget-object p2, v1, Laz3;->f:Lze5;

    .line 96
    .line 97
    if-nez p2, :cond_9

    .line 98
    .line 99
    goto :goto_6

    .line 100
    :cond_9
    const-string p2, "new subcompose call while paused composition is still active"

    .line 101
    .line 102
    invoke-static {p2}, Lyb3;->a(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :goto_6
    invoke-static {}, Lj45;->h()Lix6;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    if-eqz p2, :cond_a

    .line 110
    .line 111
    invoke-virtual {p2}, Lix6;->e()Lvr2;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    :cond_a
    invoke-static {p2}, Lj45;->j(Lix6;)Lix6;

    .line 116
    .line 117
    .line 118
    move-result-object p4

    .line 119
    :try_start_1
    iget-object v4, p0, Liz3;->w:Luy3;

    .line 120
    .line 121
    iput-boolean v3, v4, Luy3;->L:Z

    .line 122
    .line 123
    iget-object v5, v1, Laz3;->c:Lpy0;

    .line 124
    .line 125
    iget-object v6, p0, Liz3;->x:Lky0;

    .line 126
    .line 127
    if-eqz v6, :cond_13

    .line 128
    .line 129
    if-eqz v5, :cond_b

    .line 130
    .line 131
    invoke-virtual {v5}, Lpy0;->x()Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_d

    .line 136
    .line 137
    goto :goto_7

    .line 138
    :catchall_1
    move-exception p0

    .line 139
    goto/16 :goto_d

    .line 140
    .line 141
    :cond_b
    :goto_7
    if-eqz p3, :cond_c

    .line 142
    .line 143
    sget-object v5, Lbf8;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 144
    .line 145
    new-instance v5, Lgs7;

    .line 146
    .line 147
    invoke-direct {v5, p1}, Lgs7;-><init>(Luy3;)V

    .line 148
    .line 149
    .line 150
    new-instance p1, Lpy0;

    .line 151
    .line 152
    invoke-direct {p1, v6, v5}, Lpy0;-><init>(Lky0;Lgs7;)V

    .line 153
    .line 154
    .line 155
    :goto_8
    move-object v5, p1

    .line 156
    goto :goto_9

    .line 157
    :cond_c
    sget-object v5, Lbf8;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 158
    .line 159
    new-instance v5, Lgs7;

    .line 160
    .line 161
    invoke-direct {v5, p1}, Lgs7;-><init>(Luy3;)V

    .line 162
    .line 163
    .line 164
    new-instance p1, Lpy0;

    .line 165
    .line 166
    invoke-direct {p1, v6, v5}, Lpy0;-><init>(Lky0;Lgs7;)V

    .line 167
    .line 168
    .line 169
    goto :goto_8

    .line 170
    :cond_d
    :goto_9
    iput-object v5, v1, Laz3;->c:Lpy0;

    .line 171
    .line 172
    iget-object p1, v1, Laz3;->b:Lgs2;

    .line 173
    .line 174
    iget-object p0, p0, Liz3;->w:Luy3;

    .line 175
    .line 176
    invoke-static {p0}, Lxy3;->a(Luy3;)Lp95;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    check-cast p0, Lje;

    .line 181
    .line 182
    invoke-virtual {p0}, Lje;->getOutOfFrameExecutor()Lf85;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    if-eqz p0, :cond_e

    .line 187
    .line 188
    iput-boolean v0, v1, Laz3;->h:Z

    .line 189
    .line 190
    goto :goto_a

    .line 191
    :cond_e
    iput-boolean v3, v1, Laz3;->h:Z

    .line 192
    .line 193
    new-instance p0, Laf;

    .line 194
    .line 195
    const/4 v6, 0x2

    .line 196
    invoke-direct {p0, v6, v1, p1}, Laf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    new-instance p1, Lfw0;

    .line 200
    .line 201
    const v6, 0x5ad8c84e

    .line 202
    .line 203
    .line 204
    invoke-direct {p1, v6, p0, v3}, Lfw0;-><init>(ILjava/lang/Object;Z)V

    .line 205
    .line 206
    .line 207
    :goto_a
    if-eqz p3, :cond_10

    .line 208
    .line 209
    iget-boolean p0, v1, Laz3;->e:Z

    .line 210
    .line 211
    if-eqz p0, :cond_f

    .line 212
    .line 213
    invoke-virtual {v5}, Lpy0;->k()Z

    .line 214
    .line 215
    .line 216
    invoke-virtual {v5}, Lpy0;->t()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5, v3, p1}, Lpy0;->m(ZLgs2;)Lze5;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    iput-object p0, v1, Laz3;->f:Lze5;

    .line 224
    .line 225
    goto :goto_c

    .line 226
    :cond_f
    invoke-virtual {v5}, Lpy0;->k()Z

    .line 227
    .line 228
    .line 229
    move-result p0

    .line 230
    invoke-virtual {v5, p0, p1}, Lpy0;->m(ZLgs2;)Lze5;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    iput-object p0, v1, Laz3;->f:Lze5;

    .line 235
    .line 236
    goto :goto_c

    .line 237
    :cond_10
    iget-boolean p0, v1, Laz3;->e:Z

    .line 238
    .line 239
    if-eqz p0, :cond_12

    .line 240
    .line 241
    invoke-virtual {v5}, Lpy0;->k()Z

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5}, Lpy0;->t()V

    .line 245
    .line 246
    .line 247
    iget-object p0, v5, Lpy0;->R:Lyt2;

    .line 248
    .line 249
    iput v0, p0, Lyt2;->z:I

    .line 250
    .line 251
    iput-boolean v3, p0, Lyt2;->y:Z

    .line 252
    .line 253
    iget-object p3, v5, Lpy0;->w:Lky0;

    .line 254
    .line 255
    invoke-virtual {p3, v5, p1}, Lky0;->a(Lpy0;Lgs2;)V

    .line 256
    .line 257
    .line 258
    iget-boolean p1, p0, Lyt2;->F:Z

    .line 259
    .line 260
    if-nez p1, :cond_11

    .line 261
    .line 262
    iget p1, p0, Lyt2;->z:I

    .line 263
    .line 264
    if-nez p1, :cond_11

    .line 265
    .line 266
    goto :goto_b

    .line 267
    :cond_11
    const-string p1, "Cannot disable reuse from root if it was caused by other groups"

    .line 268
    .line 269
    invoke-static {p1}, Lvm5;->a(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    :goto_b
    const/4 p1, -0x1

    .line 273
    iput p1, p0, Lyt2;->z:I

    .line 274
    .line 275
    iput-boolean v0, p0, Lyt2;->y:Z

    .line 276
    .line 277
    goto :goto_c

    .line 278
    :cond_12
    invoke-virtual {v5, p1}, Lpy0;->C(Lgs2;)V

    .line 279
    .line 280
    .line 281
    :goto_c
    iput-boolean v0, v1, Laz3;->e:Z

    .line 282
    .line 283
    iput-boolean v0, v4, Luy3;->L:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 284
    .line 285
    invoke-static {p2, p4, v2}, Lj45;->m(Lix6;Lix6;Lvr2;)V

    .line 286
    .line 287
    .line 288
    iput-boolean v0, v1, Laz3;->d:Z

    .line 289
    .line 290
    return-void

    .line 291
    :cond_13
    :try_start_2
    const-string p0, "parent composition reference not set"

    .line 292
    .line 293
    invoke-static {p0}, Lyb3;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 294
    .line 295
    .line 296
    new-instance p0, Lkotlin/KotlinNothingValueException;

    .line 297
    .line 298
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 299
    .line 300
    .line 301
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 302
    :goto_d
    invoke-static {p2, p4, v2}, Lj45;->m(Lix6;Lix6;Lvr2;)V

    .line 303
    .line 304
    .line 305
    throw p0
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
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
.end method

.method public final n(Ljava/lang/Object;)Luy3;
    .locals 10

    .line 1
    iget v0, p0, Liz3;->J:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Liz3;->w:Luy3;

    .line 8
    .line 9
    invoke-virtual {v0}, Luy3;->o()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljp4;

    .line 14
    .line 15
    iget-object v1, v0, Ljp4;->x:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Leq4;

    .line 18
    .line 19
    iget v1, v1, Leq4;->y:I

    .line 20
    .line 21
    iget v2, p0, Liz3;->K:I

    .line 22
    .line 23
    sub-int/2addr v1, v2

    .line 24
    iget v2, p0, Liz3;->J:I

    .line 25
    .line 26
    sub-int v2, v1, v2

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    sub-int/2addr v1, v3

    .line 30
    move v4, v1

    .line 31
    :goto_0
    iget-object v5, p0, Liz3;->B:Ltp4;

    .line 32
    .line 33
    const/4 v6, -0x1

    .line 34
    if-lt v4, v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0, v4}, Ljp4;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    check-cast v7, Luy3;

    .line 41
    .line 42
    invoke-virtual {v5, v7}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    check-cast v7, Laz3;

    .line 50
    .line 51
    iget-object v7, v7, Laz3;->a:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-static {v7, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-eqz v7, :cond_1

    .line 58
    .line 59
    move v7, v4

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    add-int/lit8 v4, v4, -0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move v7, v6

    .line 65
    :goto_1
    if-ne v7, v6, :cond_6

    .line 66
    .line 67
    :goto_2
    if-lt v1, v2, :cond_5

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljp4;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Luy3;

    .line 74
    .line 75
    invoke-virtual {v5, v4}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    check-cast v4, Laz3;

    .line 83
    .line 84
    iget-object v8, v4, Laz3;->a:Ljava/lang/Object;

    .line 85
    .line 86
    sget-object v9, Lm67;->a:Ls63;

    .line 87
    .line 88
    if-eq v8, v9, :cond_4

    .line 89
    .line 90
    iget-object v9, p0, Liz3;->y:Ls67;

    .line 91
    .line 92
    invoke-interface {v9, p1, v8}, Ls67;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_3

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    add-int/lit8 v1, v1, -0x1

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    :goto_3
    iput-object p1, v4, Laz3;->a:Ljava/lang/Object;

    .line 103
    .line 104
    move v4, v1

    .line 105
    move v7, v4

    .line 106
    goto :goto_4

    .line 107
    :cond_5
    move v4, v1

    .line 108
    :cond_6
    :goto_4
    if-ne v7, v6, :cond_7

    .line 109
    .line 110
    :goto_5
    const/4 p0, 0x0

    .line 111
    return-object p0

    .line 112
    :cond_7
    if-eq v4, v2, :cond_8

    .line 113
    .line 114
    invoke-virtual {p0, v4, v2}, Liz3;->j(II)V

    .line 115
    .line 116
    .line 117
    :cond_8
    iget p1, p0, Liz3;->J:I

    .line 118
    .line 119
    add-int/2addr p1, v6

    .line 120
    iput p1, p0, Liz3;->J:I

    .line 121
    .line 122
    invoke-virtual {v0, v2}, Ljp4;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, Luy3;

    .line 127
    .line 128
    invoke-virtual {v5, p0}, Ltp4;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    check-cast p1, Laz3;

    .line 136
    .line 137
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-static {v0}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iput-object v0, p1, Laz3;->g:Led5;

    .line 144
    .line 145
    iput-boolean v3, p1, Laz3;->e:Z

    .line 146
    .line 147
    iput-boolean v3, p1, Laz3;->d:Z

    .line 148
    .line 149
    return-object p0
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
