.class public final Ljg5;
.super Li2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public A:Lqn7;

.field public B:I

.field public final y:Lhg5;

.field public z:I


# direct methods
.method public constructor <init>(Lhg5;I)V
    .locals 1

    .line 1
    iget v0, p1, Lhg5;->D:I

    .line 2
    .line 3
    invoke-direct {p0, p2, v0}, Li2;-><init>(II)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ljg5;->y:Lhg5;

    .line 7
    .line 8
    invoke-virtual {p1}, Lhg5;->n()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Ljg5;->z:I

    .line 13
    .line 14
    const/4 p1, -0x1

    .line 15
    iput p1, p0, Ljg5;->B:I

    .line 16
    .line 17
    invoke-virtual {p0}, Ljg5;->b()V

    .line 18
    .line 19
    .line 20
    return-void
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


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget v0, p0, Ljg5;->z:I

    .line 2
    .line 3
    iget-object p0, p0, Ljg5;->y:Lhg5;

    .line 4
    .line 5
    invoke-virtual {p0}, Lhg5;->n()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final add(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljg5;->a()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Li2;->w:I

    .line 5
    .line 6
    iget-object v1, p0, Ljg5;->y:Lhg5;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p1}, Lhg5;->add(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget p1, p0, Li2;->w:I

    .line 12
    .line 13
    add-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    iput p1, p0, Li2;->w:I

    .line 16
    .line 17
    invoke-virtual {v1}, Lhg5;->f()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, Li2;->x:I

    .line 22
    .line 23
    invoke-virtual {v1}, Lhg5;->n()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, Ljg5;->z:I

    .line 28
    .line 29
    const/4 p1, -0x1

    .line 30
    iput p1, p0, Ljg5;->B:I

    .line 31
    .line 32
    invoke-virtual {p0}, Ljg5;->b()V

    .line 33
    .line 34
    .line 35
    return-void
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
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Ljg5;->y:Lhg5;

    .line 2
    .line 3
    iget-object v1, v0, Lhg5;->B:[Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Ljg5;->A:Lqn7;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget v2, v0, Lhg5;->D:I

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    sub-int/2addr v2, v3

    .line 15
    and-int/lit8 v2, v2, -0x20

    .line 16
    .line 17
    iget v4, p0, Li2;->w:I

    .line 18
    .line 19
    if-le v4, v2, :cond_1

    .line 20
    .line 21
    move v4, v2

    .line 22
    :cond_1
    iget v0, v0, Lhg5;->z:I

    .line 23
    .line 24
    div-int/lit8 v0, v0, 0x5

    .line 25
    .line 26
    add-int/2addr v0, v3

    .line 27
    iget-object v5, p0, Ljg5;->A:Lqn7;

    .line 28
    .line 29
    if-nez v5, :cond_2

    .line 30
    .line 31
    new-instance v3, Lqn7;

    .line 32
    .line 33
    invoke-direct {v3, v1, v4, v2, v0}, Lqn7;-><init>([Ljava/lang/Object;III)V

    .line 34
    .line 35
    .line 36
    iput-object v3, p0, Ljg5;->A:Lqn7;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    iput v4, v5, Li2;->w:I

    .line 40
    .line 41
    iput v2, v5, Li2;->x:I

    .line 42
    .line 43
    iput v0, v5, Lqn7;->y:I

    .line 44
    .line 45
    iget-object p0, v5, Lqn7;->z:[Ljava/lang/Object;

    .line 46
    .line 47
    array-length p0, p0

    .line 48
    if-ge p0, v0, :cond_3

    .line 49
    .line 50
    new-array p0, v0, [Ljava/lang/Object;

    .line 51
    .line 52
    iput-object p0, v5, Lqn7;->z:[Ljava/lang/Object;

    .line 53
    .line 54
    :cond_3
    iget-object p0, v5, Lqn7;->z:[Ljava/lang/Object;

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    aput-object v1, p0, v0

    .line 58
    .line 59
    if-ne v4, v2, :cond_4

    .line 60
    .line 61
    move v0, v3

    .line 62
    :cond_4
    iput-boolean v0, v5, Lqn7;->A:Z

    .line 63
    .line 64
    sub-int/2addr v4, v0

    .line 65
    invoke-virtual {v5, v4, v3}, Lqn7;->b(II)V

    .line 66
    .line 67
    .line 68
    return-void
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

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljg5;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li2;->hasNext()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget v0, p0, Li2;->w:I

    .line 11
    .line 12
    iput v0, p0, Ljg5;->B:I

    .line 13
    .line 14
    iget-object v1, p0, Ljg5;->A:Lqn7;

    .line 15
    .line 16
    iget-object v2, p0, Ljg5;->y:Lhg5;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-object v1, v2, Lhg5;->C:[Ljava/lang/Object;

    .line 21
    .line 22
    add-int/lit8 v2, v0, 0x1

    .line 23
    .line 24
    iput v2, p0, Li2;->w:I

    .line 25
    .line 26
    aget-object p0, v1, v0

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-virtual {v1}, Li2;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget v0, p0, Li2;->w:I

    .line 36
    .line 37
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    iput v0, p0, Li2;->w:I

    .line 40
    .line 41
    invoke-virtual {v1}, Lqn7;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_1
    iget-object v0, v2, Lhg5;->C:[Ljava/lang/Object;

    .line 47
    .line 48
    iget v2, p0, Li2;->w:I

    .line 49
    .line 50
    add-int/lit8 v3, v2, 0x1

    .line 51
    .line 52
    iput v3, p0, Li2;->w:I

    .line 53
    .line 54
    iget p0, v1, Li2;->x:I

    .line 55
    .line 56
    sub-int/2addr v2, p0

    .line 57
    aget-object p0, v0, v2

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_2
    invoke-static {}, Lrf2;->c()V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return-object p0
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

.method public final previous()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljg5;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li2;->hasPrevious()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget v0, p0, Li2;->w:I

    .line 11
    .line 12
    add-int/lit8 v1, v0, -0x1

    .line 13
    .line 14
    iput v1, p0, Ljg5;->B:I

    .line 15
    .line 16
    iget-object v1, p0, Ljg5;->A:Lqn7;

    .line 17
    .line 18
    iget-object v2, p0, Ljg5;->y:Lhg5;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    iget-object v1, v2, Lhg5;->C:[Ljava/lang/Object;

    .line 23
    .line 24
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    iput v0, p0, Li2;->w:I

    .line 27
    .line 28
    aget-object p0, v1, v0

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    iget v3, v1, Li2;->x:I

    .line 32
    .line 33
    if-le v0, v3, :cond_1

    .line 34
    .line 35
    iget-object v1, v2, Lhg5;->C:[Ljava/lang/Object;

    .line 36
    .line 37
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    iput v0, p0, Li2;->w:I

    .line 40
    .line 41
    sub-int/2addr v0, v3

    .line 42
    aget-object p0, v1, v0

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 46
    .line 47
    iput v0, p0, Li2;->w:I

    .line 48
    .line 49
    invoke-virtual {v1}, Lqn7;->previous()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_2
    invoke-static {}, Lrf2;->c()V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final remove()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljg5;->a()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ljg5;->B:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    iget-object v2, p0, Ljg5;->y:Lhg5;

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Lhg5;->g(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget v0, p0, Ljg5;->B:I

    .line 15
    .line 16
    iget v3, p0, Li2;->w:I

    .line 17
    .line 18
    if-ge v0, v3, :cond_0

    .line 19
    .line 20
    iput v0, p0, Li2;->w:I

    .line 21
    .line 22
    :cond_0
    invoke-virtual {v2}, Lhg5;->f()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput v0, p0, Li2;->x:I

    .line 27
    .line 28
    invoke-virtual {v2}, Lhg5;->n()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput v0, p0, Ljg5;->z:I

    .line 33
    .line 34
    iput v1, p0, Ljg5;->B:I

    .line 35
    .line 36
    invoke-virtual {p0}, Ljg5;->b()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 43
    .line 44
    .line 45
    throw p0
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

.method public final set(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljg5;->a()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ljg5;->B:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Ljg5;->y:Lhg5;

    .line 10
    .line 11
    invoke-virtual {v1, v0, p1}, Lhg5;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lhg5;->n()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, Ljg5;->z:I

    .line 19
    .line 20
    invoke-virtual {p0}, Ljg5;->b()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 27
    .line 28
    .line 29
    throw p0
.end method
