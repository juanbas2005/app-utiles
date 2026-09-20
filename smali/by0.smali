.class public final Lby0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lyt2;

.field public b:Lbn0;

.field public c:Z

.field public final d:Lxe3;

.field public e:Z

.field public f:I

.field public g:I

.field public final h:Ljava/util/ArrayList;

.field public i:I

.field public j:I

.field public k:I

.field public l:I


# direct methods
.method public constructor <init>(Lyt2;Lbn0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lby0;->a:Lyt2;

    .line 5
    .line 6
    iput-object p2, p0, Lby0;->b:Lbn0;

    .line 7
    .line 8
    new-instance p1, Lxe3;

    .line 9
    .line 10
    invoke-direct {p1}, Lxe3;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lby0;->d:Lxe3;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lby0;->e:Z

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lby0;->h:Ljava/util/ArrayList;

    .line 24
    .line 25
    const/4 p1, -0x1

    .line 26
    iput p1, p0, Lby0;->i:I

    .line 27
    .line 28
    iput p1, p0, Lby0;->j:I

    .line 29
    .line 30
    iput p1, p0, Lby0;->k:I

    .line 31
    .line 32
    return-void
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
.method public final a()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lby0;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lby0;->h:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    add-int/lit8 p0, p0, -0x1

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget v0, p0, Lby0;->g:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    iput v0, p0, Lby0;->g:I

    .line 27
    .line 28
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

.method public final b()V
    .locals 6

    .line 1
    iget v0, p0, Lby0;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iget-object v2, p0, Lby0;->b:Lbn0;

    .line 7
    .line 8
    iget-object v2, v2, Lbn0;->u:Lj75;

    .line 9
    .line 10
    sget-object v3, Ld75;->d:Ld75;

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Lj75;->s(Lvg2;)V

    .line 13
    .line 14
    .line 15
    iget-object v3, v2, Lj75;->i:[I

    .line 16
    .line 17
    iget v4, v2, Lj75;->j:I

    .line 18
    .line 19
    iget-object v5, v2, Lj75;->g:[Lvg2;

    .line 20
    .line 21
    iget v2, v2, Lj75;->h:I

    .line 22
    .line 23
    add-int/lit8 v2, v2, -0x1

    .line 24
    .line 25
    aget-object v2, v5, v2

    .line 26
    .line 27
    iget v2, v2, Lvg2;->b:I

    .line 28
    .line 29
    sub-int/2addr v4, v2

    .line 30
    aput v0, v3, v4

    .line 31
    .line 32
    iput v1, p0, Lby0;->g:I

    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Lby0;->h:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_3

    .line 41
    .line 42
    iget-object p0, p0, Lby0;->b:Lbn0;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    new-array v3, v2, [Ljava/lang/Object;

    .line 49
    .line 50
    move v4, v1

    .line 51
    :goto_0
    if-ge v4, v2, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    aput-object v5, v3, v4

    .line 58
    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    iget-object p0, p0, Lbn0;->u:Lj75;

    .line 69
    .line 70
    sget-object v2, Lc65;->d:Lc65;

    .line 71
    .line 72
    invoke-virtual {p0, v2}, Lj75;->s(Lvg2;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0, v1, v3}, Li75;->l(Lj75;ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 79
    .line 80
    .line 81
    :cond_3
    return-void
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final c()V
    .locals 8

    .line 1
    iget v0, p0, Lby0;->l:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, Lby0;->i:I

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-ltz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lby0;->b()V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lby0;->b:Lbn0;

    .line 14
    .line 15
    iget-object v3, v3, Lbn0;->u:Lj75;

    .line 16
    .line 17
    sget-object v4, Ls65;->d:Ls65;

    .line 18
    .line 19
    invoke-virtual {v3, v4}, Lj75;->s(Lvg2;)V

    .line 20
    .line 21
    .line 22
    iget v4, v3, Lj75;->j:I

    .line 23
    .line 24
    iget-object v5, v3, Lj75;->g:[Lvg2;

    .line 25
    .line 26
    iget v6, v3, Lj75;->h:I

    .line 27
    .line 28
    add-int/lit8 v6, v6, -0x1

    .line 29
    .line 30
    aget-object v5, v5, v6

    .line 31
    .line 32
    iget v5, v5, Lvg2;->b:I

    .line 33
    .line 34
    sub-int/2addr v4, v5

    .line 35
    iget-object v3, v3, Lj75;->i:[I

    .line 36
    .line 37
    aput v1, v3, v4

    .line 38
    .line 39
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    aput v0, v3, v4

    .line 42
    .line 43
    iput v2, p0, Lby0;->i:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget v1, p0, Lby0;->k:I

    .line 47
    .line 48
    iget v3, p0, Lby0;->j:I

    .line 49
    .line 50
    invoke-virtual {p0}, Lby0;->b()V

    .line 51
    .line 52
    .line 53
    iget-object v4, p0, Lby0;->b:Lbn0;

    .line 54
    .line 55
    iget-object v4, v4, Lbn0;->u:Lj75;

    .line 56
    .line 57
    sget-object v5, Ln65;->d:Ln65;

    .line 58
    .line 59
    invoke-virtual {v4, v5}, Lj75;->s(Lvg2;)V

    .line 60
    .line 61
    .line 62
    iget v5, v4, Lj75;->j:I

    .line 63
    .line 64
    iget-object v6, v4, Lj75;->g:[Lvg2;

    .line 65
    .line 66
    iget v7, v4, Lj75;->h:I

    .line 67
    .line 68
    add-int/lit8 v7, v7, -0x1

    .line 69
    .line 70
    aget-object v6, v6, v7

    .line 71
    .line 72
    iget v6, v6, Lvg2;->b:I

    .line 73
    .line 74
    sub-int/2addr v5, v6

    .line 75
    iget-object v4, v4, Lj75;->i:[I

    .line 76
    .line 77
    add-int/lit8 v6, v5, 0x1

    .line 78
    .line 79
    aput v1, v4, v6

    .line 80
    .line 81
    aput v3, v4, v5

    .line 82
    .line 83
    add-int/lit8 v5, v5, 0x2

    .line 84
    .line 85
    aput v0, v4, v5

    .line 86
    .line 87
    iput v2, p0, Lby0;->j:I

    .line 88
    .line 89
    iput v2, p0, Lby0;->k:I

    .line 90
    .line 91
    :goto_0
    const/4 v0, 0x0

    .line 92
    iput v0, p0, Lby0;->l:I

    .line 93
    .line 94
    :cond_1
    return-void
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final d(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lby0;->a:Lyt2;

    .line 2
    .line 3
    iget-object v0, v0, Lyt2;->G:Lfv6;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget p1, v0, Lfv6;->i:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget p1, v0, Lfv6;->g:I

    .line 11
    .line 12
    :goto_0
    iget v0, p0, Lby0;->f:I

    .line 13
    .line 14
    sub-int v0, p1, v0

    .line 15
    .line 16
    if-ltz v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const-string v1, "Tried to seek backward"

    .line 20
    .line 21
    invoke-static {v1}, Ley0;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :goto_1
    if-lez v0, :cond_2

    .line 25
    .line 26
    iget-object v1, p0, Lby0;->b:Lbn0;

    .line 27
    .line 28
    iget-object v1, v1, Lbn0;->u:Lj75;

    .line 29
    .line 30
    sget-object v2, Lv55;->d:Lv55;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Lj75;->s(Lvg2;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, v1, Lj75;->i:[I

    .line 36
    .line 37
    iget v3, v1, Lj75;->j:I

    .line 38
    .line 39
    iget-object v4, v1, Lj75;->g:[Lvg2;

    .line 40
    .line 41
    iget v1, v1, Lj75;->h:I

    .line 42
    .line 43
    add-int/lit8 v1, v1, -0x1

    .line 44
    .line 45
    aget-object v1, v4, v1

    .line 46
    .line 47
    iget v1, v1, Lvg2;->b:I

    .line 48
    .line 49
    sub-int/2addr v3, v1

    .line 50
    aput v0, v2, v3

    .line 51
    .line 52
    iput p1, p0, Lby0;->f:I

    .line 53
    .line 54
    :cond_2
    return-void
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

.method public final e()V
    .locals 7

    .line 1
    iget-object v0, p0, Lby0;->a:Lyt2;

    .line 2
    .line 3
    iget-object v0, v0, Lyt2;->G:Lfv6;

    .line 4
    .line 5
    iget v1, v0, Lfv6;->c:I

    .line 6
    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    iget v1, v0, Lfv6;->i:I

    .line 10
    .line 11
    const/4 v2, -0x2

    .line 12
    iget-object v3, p0, Lby0;->d:Lxe3;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Lxe3;->a(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eq v2, v1, :cond_1

    .line 19
    .line 20
    iget-boolean v2, p0, Lby0;->c:Z

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x1

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    iget-boolean v2, p0, Lby0;->e:Z

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0, v4}, Lby0;->d(Z)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lby0;->b:Lbn0;

    .line 34
    .line 35
    iget-object v2, v2, Lbn0;->u:Lj75;

    .line 36
    .line 37
    sget-object v6, Li65;->d:Li65;

    .line 38
    .line 39
    invoke-virtual {v2, v6}, Lj75;->s(Lvg2;)V

    .line 40
    .line 41
    .line 42
    iput-boolean v5, p0, Lby0;->c:Z

    .line 43
    .line 44
    :cond_0
    if-lez v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lfv6;->a(I)Lst2;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v3, v1}, Lxe3;->c(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v4}, Lby0;->d(Z)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lby0;->b:Lbn0;

    .line 57
    .line 58
    iget-object v1, v1, Lbn0;->u:Lj75;

    .line 59
    .line 60
    sget-object v2, Lh65;->d:Lh65;

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Lj75;->s(Lvg2;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v4, v0}, Li75;->l(Lj75;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iput-boolean v5, p0, Lby0;->c:Z

    .line 69
    .line 70
    :cond_1
    return-void
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

.method public final f(II)V
    .locals 2

    .line 1
    if-lez p2, :cond_3

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    if-nez v0, :cond_1

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "Invalid remove index "

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Ley0;->a(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget v0, p0, Lby0;->i:I

    .line 28
    .line 29
    if-ne v0, p1, :cond_2

    .line 30
    .line 31
    iget p1, p0, Lby0;->l:I

    .line 32
    .line 33
    add-int/2addr p1, p2

    .line 34
    iput p1, p0, Lby0;->l:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    invoke-virtual {p0}, Lby0;->c()V

    .line 38
    .line 39
    .line 40
    iput p1, p0, Lby0;->i:I

    .line 41
    .line 42
    iput p2, p0, Lby0;->l:I

    .line 43
    .line 44
    :cond_3
    return-void
    .line 45
    .line 46
    .line 47
.end method
