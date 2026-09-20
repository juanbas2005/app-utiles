.class public final Lh67;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/List;
.implements Lcr3;


# instance fields
.field public final w:Lyx6;

.field public final x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lyx6;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh67;->w:Lyx6;

    .line 5
    .line 6
    iput p2, p0, Lh67;->x:I

    .line 7
    .line 8
    invoke-static {p1}, Lrj1;->x(Lyx6;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lh67;->y:I

    .line 13
    .line 14
    sub-int/2addr p3, p2

    .line 15
    iput p3, p0, Lh67;->z:I

    .line 16
    .line 17
    return-void
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
.method public final add(ILjava/lang/Object;)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Lh67;->f()V

    .line 28
    iget v0, p0, Lh67;->x:I

    add-int/2addr v0, p1

    iget-object p1, p0, Lh67;->w:Lyx6;

    invoke-virtual {p1, v0, p2}, Lyx6;->add(ILjava/lang/Object;)V

    .line 29
    iget p2, p0, Lh67;->z:I

    add-int/lit8 p2, p2, 0x1

    .line 30
    iput p2, p0, Lh67;->z:I

    .line 31
    invoke-static {p1}, Lrj1;->x(Lyx6;)I

    move-result p1

    iput p1, p0, Lh67;->y:I

    return-void
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh67;->f()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lh67;->x:I

    .line 5
    .line 6
    iget v1, p0, Lh67;->z:I

    .line 7
    .line 8
    add-int/2addr v0, v1

    .line 9
    iget-object v1, p0, Lh67;->w:Lyx6;

    .line 10
    .line 11
    invoke-virtual {v1, v0, p1}, Lyx6;->add(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lh67;->z:I

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    add-int/2addr p1, v0

    .line 18
    iput p1, p0, Lh67;->z:I

    .line 19
    .line 20
    invoke-static {v1}, Lrj1;->x(Lyx6;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lh67;->y:I

    .line 25
    .line 26
    return v0
    .line 27
    .line 28
    .line 29
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh67;->f()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lh67;->x:I

    .line 5
    .line 6
    add-int/2addr p1, v0

    .line 7
    iget-object v0, p0, Lh67;->w:Lyx6;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Lyx6;->addAll(ILjava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget v1, p0, Lh67;->z:I

    .line 16
    .line 17
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    add-int/2addr p2, v1

    .line 22
    iput p2, p0, Lh67;->z:I

    .line 23
    .line 24
    invoke-static {v0}, Lrj1;->x(Lyx6;)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    iput p2, p0, Lh67;->y:I

    .line 29
    .line 30
    :cond_0
    return p1
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

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 31
    iget v0, p0, Lh67;->z:I

    .line 32
    invoke-virtual {p0, v0, p1}, Lh67;->addAll(ILjava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public final clear()V
    .locals 9

    .line 1
    iget v0, p0, Lh67;->z:I

    .line 2
    .line 3
    if-lez v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Lh67;->f()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lh67;->w:Lyx6;

    .line 9
    .line 10
    iget v1, p0, Lh67;->x:I

    .line 11
    .line 12
    iget v2, p0, Lh67;->z:I

    .line 13
    .line 14
    add-int/2addr v2, v1

    .line 15
    :cond_0
    sget-object v3, Lrj1;->D:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v3

    .line 18
    :try_start_0
    iget-object v4, v0, Lyx6;->w:Lk37;

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v4}, Lnx6;->h(Lp37;)Lp37;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lk37;

    .line 28
    .line 29
    iget v5, v4, Lk37;->d:I

    .line 30
    .line 31
    iget-object v4, v4, Lk37;->c:Lo2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    .line 33
    monitor-exit v3

    .line 34
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Lo2;->n()Lhg5;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3, v1, v2}, Ljava/util/AbstractList;->subList(II)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Lhg5;->k()Lo2;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v3, v4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    iget-object v4, v0, Lyx6;->w:Lk37;

    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    sget-object v6, Lnx6;->c:Ljava/lang/Object;

    .line 64
    .line 65
    monitor-enter v6

    .line 66
    :try_start_1
    invoke-static {}, Lnx6;->j()Lix6;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-static {v4, v0, v7}, Lnx6;->w(Lp37;Ln37;Lix6;)Lp37;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, Lk37;

    .line 75
    .line 76
    const/4 v8, 0x1

    .line 77
    invoke-static {v4, v5, v3, v8}, Lrj1;->m(Lk37;ILo2;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    monitor-exit v6

    .line 82
    invoke-static {v7, v0}, Lnx6;->n(Lix6;Ln37;)V

    .line 83
    .line 84
    .line 85
    if-eqz v3, :cond_0

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception p0

    .line 89
    monitor-exit v6

    .line 90
    throw p0

    .line 91
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 92
    iput v0, p0, Lh67;->z:I

    .line 93
    .line 94
    iget-object v0, p0, Lh67;->w:Lyx6;

    .line 95
    .line 96
    invoke-static {v0}, Lrj1;->x(Lyx6;)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iput v0, p0, Lh67;->y:I

    .line 101
    .line 102
    return-void

    .line 103
    :catchall_1
    move-exception p0

    .line 104
    monitor-exit v3

    .line 105
    throw p0

    .line 106
    :cond_2
    return-void
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

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lh67;->indexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
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

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    instance-of v0, p1, Ljava/util/Collection;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0, v0}, Lh67;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_2
    return v1
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

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh67;->w:Lyx6;

    .line 2
    .line 3
    invoke-static {v0}, Lrj1;->x(Lyx6;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, Lh67;->y:I

    .line 8
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

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh67;->f()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lh67;->z:I

    .line 5
    .line 6
    invoke-static {p1, v0}, Lrj1;->l(II)V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lh67;->x:I

    .line 10
    .line 11
    add-int/2addr v0, p1

    .line 12
    iget-object p0, p0, Lh67;->w:Lyx6;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lyx6;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
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

.method public final indexOf(Ljava/lang/Object;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lh67;->f()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lh67;->z:I

    .line 5
    .line 6
    iget v1, p0, Lh67;->x:I

    .line 7
    .line 8
    add-int/2addr v0, v1

    .line 9
    invoke-static {v1, v0}, Lz65;->V(II)Lre3;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lpe3;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    move-object v2, v0

    .line 18
    check-cast v2, Lqe3;

    .line 19
    .line 20
    iget-boolean v2, v2, Lqe3;->y:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    move-object v2, v0

    .line 25
    check-cast v2, Lje3;

    .line 26
    .line 27
    invoke-virtual {v2}, Lje3;->nextInt()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, Lh67;->w:Lyx6;

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Lyx6;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {p1, v3}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    sub-int/2addr v2, v1

    .line 44
    return v2

    .line 45
    :cond_1
    const/4 p0, -0x1

    .line 46
    return p0
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

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget p0, p0, Lh67;->z:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
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

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lh67;->listIterator(I)Ljava/util/ListIterator;

    .line 3
    .line 4
    .line 5
    move-result-object p0

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

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lh67;->f()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lh67;->z:I

    .line 5
    .line 6
    iget v1, p0, Lh67;->x:I

    .line 7
    .line 8
    add-int/2addr v0, v1

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    :goto_0
    if-lt v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v2, p0, Lh67;->w:Lyx6;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Lyx6;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {p1, v2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    sub-int/2addr v0, v1

    .line 26
    return v0

    .line 27
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 p0, -0x1

    .line 31
    return p0
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
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    const/4 v0, 0x0

    .line 19
    invoke-virtual {p0, v0}, Lh67;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    return-object p0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh67;->f()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lf06;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    add-int/lit8 p1, p1, -0x1

    .line 10
    .line 11
    iput p1, v0, Lf06;->w:I

    .line 12
    .line 13
    new-instance p1, Ln76;

    .line 14
    .line 15
    invoke-direct {p1, v0, p0}, Ln76;-><init>(Lf06;Lh67;)V

    .line 16
    .line 17
    .line 18
    return-object p1
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

.method public final remove(I)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh67;->f()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lh67;->x:I

    .line 5
    .line 6
    add-int/2addr v0, p1

    .line 7
    iget-object p1, p0, Lh67;->w:Lyx6;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lyx6;->remove(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, Lh67;->z:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    iput v1, p0, Lh67;->z:I

    .line 18
    .line 19
    invoke-static {p1}, Lrj1;->x(Lyx6;)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iput p1, p0, Lh67;->y:I

    .line 24
    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 26
    invoke-virtual {p0, p1}, Lh67;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 27
    invoke-virtual {p0, p1}, Lh67;->remove(I)Ljava/lang/Object;

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0, v2}, Lh67;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    :cond_1
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_2
    return v1
    .line 28
    .line 29
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Lh67;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh67;->w:Lyx6;

    .line 5
    .line 6
    iget v1, p0, Lh67;->x:I

    .line 7
    .line 8
    iget v2, p0, Lh67;->z:I

    .line 9
    .line 10
    add-int/2addr v2, v1

    .line 11
    invoke-virtual {v0}, Lyx6;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    :cond_0
    sget-object v4, Lrj1;->D:Ljava/lang/Object;

    .line 16
    .line 17
    monitor-enter v4

    .line 18
    :try_start_0
    iget-object v5, v0, Lyx6;->w:Lk37;

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v5}, Lnx6;->h(Lp37;)Lp37;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    check-cast v5, Lk37;

    .line 28
    .line 29
    iget v6, v5, Lk37;->d:I

    .line 30
    .line 31
    iget-object v5, v5, Lk37;->c:Lo2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    .line 33
    monitor-exit v4

    .line 34
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5}, Lo2;->n()Lhg5;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4, v1, v2}, Ljava/util/AbstractList;->subList(II)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-interface {v7, p1}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Lhg5;->k()Lo2;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-static {v4, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    const/4 v7, 0x1

    .line 57
    if-nez v5, :cond_1

    .line 58
    .line 59
    iget-object v5, v0, Lyx6;->w:Lk37;

    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget-object v8, Lnx6;->c:Ljava/lang/Object;

    .line 65
    .line 66
    monitor-enter v8

    .line 67
    :try_start_1
    invoke-static {}, Lnx6;->j()Lix6;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-static {v5, v0, v9}, Lnx6;->w(Lp37;Ln37;Lix6;)Lp37;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    check-cast v5, Lk37;

    .line 76
    .line 77
    invoke-static {v5, v6, v4, v7}, Lrj1;->m(Lk37;ILo2;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    monitor-exit v8

    .line 82
    invoke-static {v9, v0}, Lnx6;->n(Lix6;Ln37;)V

    .line 83
    .line 84
    .line 85
    if-eqz v4, :cond_0

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception p0

    .line 89
    monitor-exit v8

    .line 90
    throw p0

    .line 91
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lyx6;->size()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    sub-int/2addr v3, p1

    .line 96
    if-lez v3, :cond_2

    .line 97
    .line 98
    iget-object p1, p0, Lh67;->w:Lyx6;

    .line 99
    .line 100
    invoke-static {p1}, Lrj1;->x(Lyx6;)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    iput p1, p0, Lh67;->y:I

    .line 105
    .line 106
    iget p1, p0, Lh67;->z:I

    .line 107
    .line 108
    sub-int/2addr p1, v3

    .line 109
    iput p1, p0, Lh67;->z:I

    .line 110
    .line 111
    :cond_2
    if-lez v3, :cond_3

    .line 112
    .line 113
    return v7

    .line 114
    :cond_3
    const/4 p0, 0x0

    .line 115
    return p0

    .line 116
    :catchall_1
    move-exception p0

    .line 117
    monitor-exit v4

    .line 118
    throw p0
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

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lh67;->z:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Lrj1;->l(II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lh67;->f()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lh67;->x:I

    .line 10
    .line 11
    add-int/2addr p1, v0

    .line 12
    iget-object v0, p0, Lh67;->w:Lyx6;

    .line 13
    .line 14
    invoke-virtual {v0, p1, p2}, Lyx6;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0}, Lrj1;->x(Lyx6;)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    iput p2, p0, Lh67;->y:I

    .line 23
    .line 24
    return-object p1
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

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, Lh67;->z:I

    .line 2
    .line 3
    return p0
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

.method public final subList(II)Ljava/util/List;
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    if-gt p1, p2, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lh67;->z:I

    .line 6
    .line 7
    if-gt p2, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "fromIndex or toIndex are out of bounds"

    .line 11
    .line 12
    invoke-static {v0}, Lvm5;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-virtual {p0}, Lh67;->f()V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lh67;

    .line 19
    .line 20
    iget v1, p0, Lh67;->x:I

    .line 21
    .line 22
    add-int/2addr p1, v1

    .line 23
    add-int/2addr p2, v1

    .line 24
    iget-object p0, p0, Lh67;->w:Lyx6;

    .line 25
    .line 26
    invoke-direct {v0, p0, p1, p2}, Lh67;-><init>(Lyx6;II)V

    .line 27
    .line 28
    .line 29
    return-object v0
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

.method public final toArray()[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lrc9;->W0(Ljava/util/Collection;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 6
    invoke-static {p0, p1}, Lrc9;->X0(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
