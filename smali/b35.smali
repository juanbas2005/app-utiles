.class public abstract Lb35;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final synthetic a:I

.field public static b:Lx83;

.field public static c:Landroid/content/Context;

.field public static final synthetic d:I

.field public static e:Lx83;

.field public static final synthetic f:I


# direct methods
.method public static A(Ljava/util/List;)Lyb9;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lyb9;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string p0, "null tasks are not accepted"

    .line 31
    .line 32
    invoke-static {p0}, Lku4;->j(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_2
    new-instance v0, Lyb9;

    .line 37
    .line 38
    invoke-direct {v0}, Lyb9;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v1, Ltl8;

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-direct {v1, v2, v0}, Ltl8;-><init>(ILyb9;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lyb9;

    .line 65
    .line 66
    sget-object v3, Lyb7;->b:Lgv1;

    .line 67
    .line 68
    invoke-virtual {v2, v3, v1}, Lyb9;->e(Ljava/util/concurrent/Executor;Lk55;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3, v1}, Lyb9;->d(Ljava/util/concurrent/Executor;Lc55;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v3, v1}, Lyb9;->a(Ljava/util/concurrent/Executor;Lx45;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    return-object v0

    .line 79
    :cond_4
    :goto_2
    invoke-static {v0}, Lb35;->l(Ljava/lang/Object;)Lyb9;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
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

.method public static varargs B([Lyb9;)Lyb9;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    if-nez v0, :cond_0

    .line 3
    .line 4
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {p0}, Lb35;->l(Ljava/lang/Object;)Lyb9;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, Lyb7;->a:Liy2;

    .line 16
    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-static {p0}, Lb35;->A(Ljava/util/List;)Lyb9;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, Lrg4;

    .line 31
    .line 32
    const/16 v3, 0x1d

    .line 33
    .line 34
    invoke-direct {v2, v3, p0}, Lrg4;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0, v2}, Lyb9;->g(Ljava/util/concurrent/Executor;Lg61;)Lyb9;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_2
    :goto_0
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 43
    .line 44
    invoke-static {p0}, Lb35;->l(Ljava/lang/Object;)Lyb9;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
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

.method public static final C(JLgs2;Lh61;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lsi7;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1, p3}, Lsi7;-><init>(JLh61;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p2}, Lb35;->y(Lsi7;Lgs2;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance p0, Lkotlinx/coroutines/TimeoutCancellationException;

    .line 18
    .line 19
    const-string p1, "Timed out immediately"

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-direct {p0, p1, p2}, Lkotlinx/coroutines/TimeoutCancellationException;-><init>(Ljava/lang/String;Lel3;)V

    .line 23
    .line 24
    .line 25
    throw p0
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

.method public static final D(JLgs2;Lh61;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lti7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lti7;

    .line 7
    .line 8
    iget v1, v0, Lti7;->B:I

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
    iput v1, v0, Lti7;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lti7;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lh61;-><init>(Lf61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lti7;->A:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lti7;->B:I

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
    iget-object p0, v0, Lti7;->z:Lh06;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-object p3

    .line 41
    :catch_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_2
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v4, 0x0

    .line 53
    .line 54
    cmp-long p3, p0, v4

    .line 55
    .line 56
    if-gtz p3, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    new-instance p3, Lh06;

    .line 60
    .line 61
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    :try_start_1
    iput-object p3, v0, Lti7;->z:Lh06;

    .line 65
    .line 66
    iput v3, v0, Lti7;->B:I

    .line 67
    .line 68
    new-instance v1, Lsi7;

    .line 69
    .line 70
    invoke-direct {v1, p0, p1, v0}, Lsi7;-><init>(JLh61;)V

    .line 71
    .line 72
    .line 73
    iput-object v1, p3, Lh06;->w:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-static {v1, p2}, Lb35;->y(Lsi7;Lgs2;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 79
    sget-object p1, Lp81;->w:Lp81;

    .line 80
    .line 81
    if-ne p0, p1, :cond_4

    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_4
    return-object p0

    .line 85
    :catch_1
    move-exception p1

    .line 86
    move-object p0, p3

    .line 87
    :goto_1
    iget-object p2, p1, Lkotlinx/coroutines/TimeoutCancellationException;->w:Lel3;

    .line 88
    .line 89
    iget-object p0, p0, Lh06;->w:Ljava/lang/Object;

    .line 90
    .line 91
    if-ne p2, p0, :cond_5

    .line 92
    .line 93
    :goto_2
    return-object v2

    .line 94
    :cond_5
    throw p1
.end method

.method public static E(Lyb9;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyb9;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lyb9;->i()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-boolean v0, p0, Lyb9;->d:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 17
    .line 18
    const-string v0, "Task is already canceled"

    .line 19
    .line 20
    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    .line 25
    .line 26
    invoke-virtual {p0}, Lyb9;->h()Ljava/lang/Exception;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    throw v0
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

.method public static F(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lz65;->k(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-static {p0}, Ljb5;->J(Landroid/content/Context;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_0
    const-string p0, "google_app_id"

    .line 19
    .line 20
    const-string v1, "string"

    .line 21
    .line 22
    invoke-virtual {v0, p0, v1, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const/4 p1, 0x0

    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    return-object p0

    .line 35
    :catch_0
    return-object p1
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

.method public static G(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    array-length v1, p2

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_4

    .line 9
    .line 10
    aget-object v2, p1, v1

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    :cond_0
    if-nez p0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    :cond_2
    aget-object p0, p2, v1

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_4
    const/4 p0, 0x0

    .line 32
    return-object p0
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

.method public static H(B)Z
    .locals 1

    .line 1
    const/16 v0, -0x41

    .line 2
    .line 3
    if-le p0, v0, :cond_0

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static final a(Lpl3;Lzr3;Lzr3;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Lzr3;->getDescriptor()Lll6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Lrm3;->d(Lpl3;Lll6;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Luq3;->k(Lll6;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Lzr3;->getDescriptor()Lll6;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p1}, Lll6;->a()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p2}, Lzr3;->getDescriptor()Lll6;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-interface {p2}, Lll6;->a()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iget-object p0, p0, Lpl3;->a:Lwl3;

    .line 41
    .line 42
    iget-object p0, p0, Lwl3;->j:Lfq0;

    .line 43
    .line 44
    sget-object v0, Lfq0;->x:Lfq0;

    .line 45
    .line 46
    if-ne p0, v0, :cond_0

    .line 47
    .line 48
    invoke-static {p1, p2}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    const-string p0, "in ALL_JSON_OBJECTS class discriminator mode"

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const-string p0, "as base class \'"

    .line 58
    .line 59
    const/16 v0, 0x27

    .line 60
    .line 61
    invoke-static {v0, p0, p1}, Lpb4;->h(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :goto_0
    const-string p1, "\' cannot be serialized "

    .line 66
    .line 67
    const-string v0, " because it has property name that conflicts with JSON class discriminator \'"

    .line 68
    .line 69
    const-string v1, "Class \'"

    .line 70
    .line 71
    invoke-static {v1, p2, p1, p0, v0}, Lf21;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-string p1, "\'."

    .line 76
    .line 77
    invoke-static {p0, p3, p1}, Lf21;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    new-instance p1, Lkotlinx/serialization/json/JsonEncodingException;

    .line 82
    .line 83
    const-string p2, "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation."

    .line 84
    .line 85
    invoke-direct {p1, p0, p2}, Lkotlinx/serialization/json/JsonEncodingException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_1
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public static b(Lyb9;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "Must not be called on the main application thread"

    .line 2
    .line 3
    invoke-static {v0}, Lz65;->j(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "GoogleApiHandler"

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string p0, "Must not be called on GoogleApiHandler thread."

    .line 30
    .line 31
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0

    .line 36
    :cond_1
    :goto_0
    const-string v0, "Task must not be null"

    .line 37
    .line 38
    invoke-static {v0, p0}, Lz65;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lyb9;->j()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-static {p0}, Lb35;->E(Lyb9;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    new-instance v0, Laj8;

    .line 53
    .line 54
    invoke-direct {v0}, Laj8;-><init>()V

    .line 55
    .line 56
    .line 57
    sget-object v1, Lyb7;->b:Lgv1;

    .line 58
    .line 59
    invoke-virtual {p0, v1, v0}, Lyb9;->e(Ljava/util/concurrent/Executor;Lk55;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1, v0}, Lyb9;->d(Ljava/util/concurrent/Executor;Lc55;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v1, v0}, Lyb9;->a(Ljava/util/concurrent/Executor;Lx45;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v0, Laj8;->w:Ljava/util/concurrent/CountDownLatch;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 71
    .line 72
    .line 73
    invoke-static {p0}, Lb35;->E(Lyb9;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
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
.end method

.method public static c(Lyb9;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "Must not be called on the main application thread"

    .line 2
    .line 3
    invoke-static {v0}, Lz65;->j(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "GoogleApiHandler"

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string p0, "Must not be called on GoogleApiHandler thread."

    .line 30
    .line 31
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0

    .line 36
    :cond_1
    :goto_0
    const-string v0, "Task must not be null"

    .line 37
    .line 38
    invoke-static {v0, p0}, Lz65;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "TimeUnit must not be null"

    .line 42
    .line 43
    invoke-static {v0, p3}, Lz65;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lyb9;->j()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-static {p0}, Lb35;->E(Lyb9;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_2
    new-instance v0, Laj8;

    .line 58
    .line 59
    invoke-direct {v0}, Laj8;-><init>()V

    .line 60
    .line 61
    .line 62
    sget-object v1, Lyb7;->b:Lgv1;

    .line 63
    .line 64
    invoke-virtual {p0, v1, v0}, Lyb9;->e(Ljava/util/concurrent/Executor;Lk55;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v1, v0}, Lyb9;->d(Ljava/util/concurrent/Executor;Lc55;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v1, v0}, Lyb9;->a(Ljava/util/concurrent/Executor;Lx45;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, v0, Laj8;->w:Ljava/util/concurrent/CountDownLatch;

    .line 74
    .line 75
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    invoke-static {p0}, Lb35;->E(Lyb9;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_3
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    .line 87
    .line 88
    const-string p1, "Timed out waiting for Task"

    .line 89
    .line 90
    invoke-direct {p0, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p0
    .line 94
.end method

.method public static d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lyb9;
    .locals 4

    .line 1
    const-string v0, "Executor must not be null"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lz65;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lyb9;

    .line 7
    .line 8
    invoke-direct {v0}, Lyb9;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lc49;

    .line 12
    .line 13
    const/16 v2, 0xe

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, v0, v3, p1, v2}, Lc49;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-object v0
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

.method public static final e(Ln85;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lql6;

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    instance-of v0, p0, Lno5;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    instance-of p0, p0, Lyk5;

    .line 13
    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "Actual serializer for polymorphic cannot be polymorphic itself"

    .line 18
    .line 19
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    const-string p0, "Primitives cannot be serialized polymorphically with \'type\' parameter. You can use \'JsonBuilder.useArrayPolymorphism\' instead"

    .line 24
    .line 25
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    const-string p0, "Enums cannot be serialized polymorphically with \'type\' parameter. You can use \'JsonBuilder.useArrayPolymorphism\' instead"

    .line 30
    .line 31
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
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

.method public static final f(Lpl3;Lll6;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Lll6;->getAnnotations()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/annotation/Annotation;

    .line 26
    .line 27
    instance-of v1, v0, Lvl3;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    check-cast v0, Lvl3;

    .line 32
    .line 33
    invoke-interface {v0}, Lvl3;->discriminator()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_1
    iget-object p0, p0, Lpl3;->a:Lwl3;

    .line 39
    .line 40
    iget-object p0, p0, Lwl3;->g:Ljava/lang/String;

    .line 41
    .line 42
    return-object p0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static final g(Lll6;Ljava/util/Map;)Lbv4;
    .locals 7

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v4, v1

    .line 24
    check-cast v4, Las3;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, Lll6;->c()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-interface {v4}, Las3;->v()Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eq v5, v6, :cond_1

    .line 41
    .line 42
    move v4, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    sget-object v5, Lwl6;->a:Lz53;

    .line 45
    .line 46
    invoke-static {v5, v4}, Li95;->E(Lz53;Las3;)Lzr3;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    invoke-interface {v4}, Lzr3;->getDescriptor()Lll6;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {p0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    :goto_0
    if-eqz v4, :cond_0

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-interface {p0}, Lll6;->a()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-string p1, "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration."

    .line 68
    .line 69
    const-string v0, "Cannot find KSerializer for ["

    .line 70
    .line 71
    invoke-static {p0, p1, v0}, Lh;->p(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v3

    .line 75
    :cond_3
    move-object v1, v3

    .line 76
    :goto_1
    check-cast v1, Las3;

    .line 77
    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lbv4;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-object p1, v3

    .line 88
    :goto_2
    if-eqz p1, :cond_5

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    move-object p1, v3

    .line 92
    :goto_3
    sget-object v0, Lvr7;->r:Lvr7;

    .line 93
    .line 94
    if-nez p1, :cond_14

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {p0}, Ldh4;->G(Lll6;)Lag3;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    const/16 v1, 0xb

    .line 108
    .line 109
    const/16 v4, 0xa

    .line 110
    .line 111
    const-class v5, Ljava/lang/Enum;

    .line 112
    .line 113
    packed-switch p1, :pswitch_data_0

    .line 114
    .line 115
    .line 116
    :cond_6
    :goto_4
    move-object p1, v0

    .line 117
    goto/16 :goto_7

    .line 118
    .line 119
    :pswitch_0
    invoke-static {p0}, Lr16;->H(Lll6;)Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {v5, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_6

    .line 128
    .line 129
    new-instance p1, Lvf3;

    .line 130
    .line 131
    invoke-direct {p1, p0}, Lvf3;-><init>(Ljava/lang/Class;)V

    .line 132
    .line 133
    .line 134
    goto/16 :goto_7

    .line 135
    .line 136
    :pswitch_1
    invoke-static {p0}, Lr16;->H(Lll6;)Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    const-class p1, Landroid/os/Parcelable;

    .line 141
    .line 142
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_7

    .line 147
    .line 148
    new-instance p1, Lzu4;

    .line 149
    .line 150
    invoke-direct {p1, p0}, Lzu4;-><init>(Ljava/lang/Class;)V

    .line 151
    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_7
    invoke-virtual {v5, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_8

    .line 159
    .line 160
    new-instance p1, Lyu4;

    .line 161
    .line 162
    invoke-direct {p1, p0}, Lyu4;-><init>(Ljava/lang/Class;)V

    .line 163
    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_8
    const-class p1, Ljava/io/Serializable;

    .line 167
    .line 168
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_9

    .line 173
    .line 174
    new-instance p1, Lav4;

    .line 175
    .line 176
    invoke-direct {p1, p0}, Lav4;-><init>(Ljava/lang/Class;)V

    .line 177
    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_9
    move-object p1, v3

    .line 181
    :goto_5
    if-nez p1, :cond_14

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :pswitch_2
    invoke-interface {p0, v2}, Lll6;->h(I)Lll6;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {p1}, Ldh4;->G(Lll6;)Lag3;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    if-eqz p1, :cond_11

    .line 197
    .line 198
    const/4 v5, 0x2

    .line 199
    if-eq p1, v5, :cond_10

    .line 200
    .line 201
    const/4 v5, 0x4

    .line 202
    if-eq p1, v5, :cond_f

    .line 203
    .line 204
    const/4 v5, 0x6

    .line 205
    if-eq p1, v5, :cond_e

    .line 206
    .line 207
    const/16 v5, 0x8

    .line 208
    .line 209
    if-eq p1, v5, :cond_d

    .line 210
    .line 211
    const/16 v5, 0x13

    .line 212
    .line 213
    if-eq p1, v5, :cond_c

    .line 214
    .line 215
    if-eq p1, v4, :cond_b

    .line 216
    .line 217
    if-eq p1, v1, :cond_a

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_a
    sget-object p0, Lpv8;->n:Lzf3;

    .line 221
    .line 222
    :goto_6
    move-object p1, p0

    .line 223
    goto/16 :goto_7

    .line 224
    .line 225
    :cond_b
    sget-object p0, Lbv4;->p:Lfa0;

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_c
    new-instance p1, Luf3;

    .line 229
    .line 230
    invoke-interface {p0, v2}, Lll6;->h(I)Lll6;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    invoke-static {p0}, Lr16;->H(Lll6;)Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-direct {p1, p0}, Luf3;-><init>(Ljava/lang/Class;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_7

    .line 242
    .line 243
    :cond_d
    sget-object p0, Lbv4;->g:Lfa0;

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_e
    sget-object p0, Lbv4;->j:Lfa0;

    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_f
    sget-object p0, Lpv8;->p:Lzf3;

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_10
    sget-object p0, Lbv4;->m:Lfa0;

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_11
    sget-object p0, Lbv4;->d:Lfa0;

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :pswitch_3
    invoke-interface {p0, v2}, Lll6;->h(I)Lll6;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-static {p0}, Ldh4;->G(Lll6;)Lag3;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 267
    .line 268
    .line 269
    move-result p0

    .line 270
    if-eq p0, v4, :cond_13

    .line 271
    .line 272
    if-eq p0, v1, :cond_12

    .line 273
    .line 274
    goto/16 :goto_4

    .line 275
    .line 276
    :cond_12
    sget-object p0, Lpv8;->m:Lzf3;

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_13
    sget-object p0, Lbv4;->o:Lfa0;

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :pswitch_4
    sget-object p0, Lbv4;->f:Lfa0;

    .line 283
    .line 284
    goto :goto_6

    .line 285
    :pswitch_5
    sget-object p0, Lbv4;->i:Lfa0;

    .line 286
    .line 287
    goto :goto_6

    .line 288
    :pswitch_6
    sget-object p0, Lpv8;->o:Lzf3;

    .line 289
    .line 290
    goto :goto_6

    .line 291
    :pswitch_7
    sget-object p0, Lbv4;->l:Lfa0;

    .line 292
    .line 293
    goto :goto_6

    .line 294
    :pswitch_8
    sget-object p0, Lbv4;->c:Lfa0;

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :pswitch_9
    sget-object p0, Lbv4;->n:Lga0;

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :pswitch_a
    sget-object p0, Lpv8;->l:Lvr7;

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :pswitch_b
    sget-object p0, Lpv8;->k:Lvr7;

    .line 304
    .line 305
    goto :goto_6

    .line 306
    :pswitch_c
    sget-object p0, Lbv4;->e:Lga0;

    .line 307
    .line 308
    goto :goto_6

    .line 309
    :pswitch_d
    sget-object p0, Lpv8;->j:Lvr7;

    .line 310
    .line 311
    goto :goto_6

    .line 312
    :pswitch_e
    sget-object p0, Lbv4;->h:Lga0;

    .line 313
    .line 314
    goto :goto_6

    .line 315
    :pswitch_f
    sget-object p0, Lpv8;->i:Lvr7;

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :pswitch_10
    sget-object p0, Lpv8;->h:Lvr7;

    .line 319
    .line 320
    goto :goto_6

    .line 321
    :pswitch_11
    sget-object p0, Lpv8;->g:Lvr7;

    .line 322
    .line 323
    goto :goto_6

    .line 324
    :pswitch_12
    sget-object p0, Lbv4;->k:Lga0;

    .line 325
    .line 326
    goto :goto_6

    .line 327
    :pswitch_13
    sget-object p0, Lpv8;->f:Lvr7;

    .line 328
    .line 329
    goto :goto_6

    .line 330
    :pswitch_14
    sget-object p0, Lbv4;->b:Lga0;

    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_14
    :goto_7
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result p0

    .line 337
    if-eqz p0, :cond_15

    .line 338
    .line 339
    return-object v3

    .line 340
    :cond_15
    return-object p1

    .line 341
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static h(Ljava/io/File;Landroid/content/res/Resources;I)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    invoke-static {p0, p1}, Lb35;->i(Ljava/io/File;Ljava/io/InputStream;)Z

    .line 6
    .line 7
    .line 8
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    :cond_0
    return p0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_0

    .line 17
    :catchall_1
    move-exception p0

    .line 18
    const/4 p1, 0x0

    .line 19
    :goto_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 22
    .line 23
    .line 24
    :catch_1
    :cond_1
    throw p0
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

.method public static i(Ljava/io/File;Ljava/io/InputStream;)Z
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskWrites()Landroid/os/StrictMode$ThreadPolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    .line 8
    .line 9
    invoke-direct {v3, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    .line 12
    const/16 p0, 0x400

    .line 13
    .line 14
    :try_start_1
    new-array p0, p0, [B

    .line 15
    .line 16
    :goto_0
    invoke-virtual {p1, p0}, Ljava/io/InputStream;->read([B)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-eq v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, p0, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    move-object v2, v3

    .line 29
    goto :goto_2

    .line 30
    :catch_0
    move-exception p0

    .line 31
    move-object v2, v3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 34
    .line 35
    .line 36
    :catch_1
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :catchall_1
    move-exception p0

    .line 42
    goto :goto_2

    .line 43
    :catch_2
    move-exception p0

    .line 44
    :goto_1
    :try_start_3
    const-string p1, "TypefaceCompatUtil"

    .line 45
    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v4, "Error copying resource contents to temp file: "

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 68
    .line 69
    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    :try_start_4
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 73
    .line 74
    .line 75
    :catch_3
    :cond_1
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 76
    .line 77
    .line 78
    return v1

    .line 79
    :goto_2
    if-eqz v2, :cond_2

    .line 80
    .line 81
    :try_start_5
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 82
    .line 83
    .line 84
    :catch_4
    :cond_2
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 85
    .line 86
    .line 87
    throw p0
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

.method public static j(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, p1, :cond_1

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    return v1

    .line 15
    :cond_1
    return v0
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

.method public static k(Ljava/lang/Exception;)Lyb9;
    .locals 1

    .line 1
    new-instance v0, Lyb9;

    .line 2
    .line 3
    invoke-direct {v0}, Lyb9;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lyb9;->o(Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    return-object v0
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

.method public static l(Ljava/lang/Object;)Lyb9;
    .locals 1

    .line 1
    new-instance v0, Lyb9;

    .line 2
    .line 3
    invoke-direct {v0}, Lyb9;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lyb9;->m(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-object v0
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

.method public static final m(Lzr3;)I
    .locals 4

    .line 1
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lll6;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Lll6;->e()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    if-ge v2, v1, :cond_0

    .line 23
    .line 24
    mul-int/lit8 v0, v0, 0x1f

    .line 25
    .line 26
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {v3, v2}, Lll6;->f(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    add-int/2addr v0, v3

    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return v0
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

.method public static final n(Lzr3;Ljava/util/Map;)Ljava/util/ArrayList;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lzk5;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Lll6;->e()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    if-ge v3, v0, :cond_3

    .line 24
    .line 25
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-interface {v4, v3}, Lll6;->f(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v5, Lzq4;

    .line 37
    .line 38
    new-instance v6, Lws4;

    .line 39
    .line 40
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-interface {v7, v3}, Lll6;->h(I)Lll6;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-interface {v7}, Lll6;->c()Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-static {v7, p1}, Lb35;->g(Lll6;Ljava/util/Map;)Lbv4;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    if-eqz v9, :cond_2

    .line 60
    .line 61
    iput-object v9, v6, Lws4;->a:Lbv4;

    .line 62
    .line 63
    iput-boolean v8, v6, Lws4;->b:Z

    .line 64
    .line 65
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-interface {v7, v3}, Lll6;->i(I)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_0

    .line 74
    .line 75
    const/4 v7, 0x1

    .line 76
    iput-boolean v7, v6, Lws4;->c:Z

    .line 77
    .line 78
    :cond_0
    iget-object v7, v6, Lws4;->a:Lbv4;

    .line 79
    .line 80
    if-nez v7, :cond_1

    .line 81
    .line 82
    sget-object v7, Lbv4;->n:Lga0;

    .line 83
    .line 84
    :cond_1
    new-instance v8, Lxs4;

    .line 85
    .line 86
    iget-boolean v9, v6, Lws4;->b:Z

    .line 87
    .line 88
    iget-boolean v6, v6, Lws4;->c:Z

    .line 89
    .line 90
    invoke-direct {v8, v7, v9, v6}, Lxs4;-><init>(Lbv4;ZZ)V

    .line 91
    .line 92
    .line 93
    invoke-direct {v5, v4, v8}, Lzq4;-><init>(Ljava/lang/String;Lxs4;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    add-int/lit8 v3, v3, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    invoke-interface {v7}, Lll6;->a()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-interface {p0}, Lzr3;->getDescriptor()Lll6;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-interface {p0}, Lll6;->a()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {v4, v0, p0, p1}, Lb35;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object v1

    .line 126
    :cond_3
    return-object v2

    .line 127
    :cond_4
    const-string p1, "Cannot generate NavArguments for polymorphic serializer "

    .line 128
    .line 129
    const-string v0, ". Arguments can only be generated from concrete classes or objects."

    .line 130
    .line 131
    invoke-static {p0, v0, p1}, Lrf2;->q(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-object v1
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

.method public static final o(Ljava/lang/Object;Ljava/util/LinkedHashMap;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Lb26;->a:Lc26;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Li95;->D(Lgq3;)Lzr3;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lw96;

    .line 19
    .line 20
    invoke-direct {v1, v0, p1}, Lw96;-><init>(Lzr3;Ljava/util/LinkedHashMap;)V

    .line 21
    .line 22
    .line 23
    move-object v2, v0

    .line 24
    check-cast v2, Lzr3;

    .line 25
    .line 26
    invoke-interface {v2, v1, p0}, Lzr3;->serialize(Lj42;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, v1, Lw96;->H:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-static {p0}, Lsf4;->b0(Ljava/util/Map;)Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    new-instance v1, Lam6;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Lam6;-><init>(Lzr3;)V

    .line 38
    .line 39
    .line 40
    new-instance v2, Lgc5;

    .line 41
    .line 42
    const/16 v3, 0x13

    .line 43
    .line 44
    invoke-direct {v2, v3, p0, v1}, Lgc5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Lzr3;->getDescriptor()Lll6;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-interface {p0}, Lll6;->e()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    const/4 v3, 0x0

    .line 56
    :goto_0
    if-ge v3, p0, :cond_1

    .line 57
    .line 58
    invoke-interface {v0}, Lzr3;->getDescriptor()Lll6;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v4, v3}, Lll6;->f(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {p1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Lbv4;

    .line 71
    .line 72
    if-eqz v5, :cond_0

    .line 73
    .line 74
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v2, v6, v4, v5}, Lgc5;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    add-int/lit8 v3, v3, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    const-string p0, "Cannot locate NavType for argument ["

    .line 85
    .line 86
    const/16 p1, 0x5d

    .line 87
    .line 88
    invoke-static {p1, p0, v4}, Lpb4;->h(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, Lku4;->g(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    const/4 p0, 0x0

    .line 96
    return-object p0

    .line 97
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    iget-object p1, v1, Lam6;->x:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p1, Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object p1, v1, Lam6;->z:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p1, Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    iget-object p1, v1, Lam6;->A:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0
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

.method public static final p(Ljava/lang/reflect/Constructor;)[Ljava/lang/reflect/Type;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-eqz v1, :cond_1

    .line 24
    .line 25
    new-instance v0, Lbe5;

    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    invoke-direct {v0, v2}, Lbe5;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lbe5;->a(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Lb35;->q(Ljava/lang/reflect/Constructor;)[Ljava/lang/reflect/Type;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, p0}, Lbe5;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, v0, Lbe5;->a:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, [Ljava/lang/reflect/Type;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_1
    invoke-static {p0}, Lb35;->q(Ljava/lang/reflect/Constructor;)[Ljava/lang/reflect/Type;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
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

.method public static final q(Ljava/lang/reflect/Constructor;)[Ljava/lang/reflect/Type;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    array-length v2, v0

    .line 10
    array-length v1, v1

    .line 11
    if-ne v2, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    invoke-static {p0, v0}, Lqs;->R0(I[Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const/4 v0, 0x0

    .line 39
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 40
    .line 41
    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, [Ljava/lang/reflect/Type;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_0
    return-object v0
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

.method public static final r()Lx83;
    .locals 13

    .line 1
    sget-object v0, Lb35;->b:Lx83;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v1, Lw83;

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const/16 v11, 0x60

    .line 10
    .line 11
    const-string v2, "Filled.Search"

    .line 12
    .line 13
    const/high16 v3, 0x41c00000    # 24.0f

    .line 14
    .line 15
    const/high16 v4, 0x41c00000    # 24.0f

    .line 16
    .line 17
    const/high16 v5, 0x41c00000    # 24.0f

    .line 18
    .line 19
    const/high16 v6, 0x41c00000    # 24.0f

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    invoke-direct/range {v1 .. v11}, Lw83;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 25
    .line 26
    .line 27
    sget v0, Le38;->a:I

    .line 28
    .line 29
    new-instance v0, Lky6;

    .line 30
    .line 31
    sget-wide v2, Ljt0;->b:J

    .line 32
    .line 33
    invoke-direct {v0, v2, v3}, Lky6;-><init>(J)V

    .line 34
    .line 35
    .line 36
    new-instance v4, Lbe5;

    .line 37
    .line 38
    invoke-direct {v4}, Lbe5;-><init>()V

    .line 39
    .line 40
    .line 41
    const/high16 v2, 0x41780000    # 15.5f

    .line 42
    .line 43
    const/high16 v3, 0x41600000    # 14.0f

    .line 44
    .line 45
    invoke-virtual {v4, v2, v3}, Lbe5;->j(FF)V

    .line 46
    .line 47
    .line 48
    const v2, -0x40b5c28f    # -0.79f

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v2}, Lbe5;->g(F)V

    .line 52
    .line 53
    .line 54
    const v2, -0x4170a3d7    # -0.28f

    .line 55
    .line 56
    .line 57
    const v5, -0x4175c28f    # -0.27f

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v2, v5}, Lbe5;->i(FF)V

    .line 61
    .line 62
    .line 63
    const/high16 v9, 0x41800000    # 16.0f

    .line 64
    .line 65
    const/high16 v10, 0x41180000    # 9.5f

    .line 66
    .line 67
    const v5, 0x41768f5c    # 15.41f

    .line 68
    .line 69
    .line 70
    const v6, 0x414970a4    # 12.59f

    .line 71
    .line 72
    .line 73
    const/high16 v7, 0x41800000    # 16.0f

    .line 74
    .line 75
    const v8, 0x4131c28f    # 11.11f

    .line 76
    .line 77
    .line 78
    invoke-virtual/range {v4 .. v10}, Lbe5;->d(FFFFFF)V

    .line 79
    .line 80
    .line 81
    const/high16 v9, 0x41180000    # 9.5f

    .line 82
    .line 83
    const/high16 v10, 0x40400000    # 3.0f

    .line 84
    .line 85
    const/high16 v5, 0x41800000    # 16.0f

    .line 86
    .line 87
    const v6, 0x40bd1eb8    # 5.91f

    .line 88
    .line 89
    .line 90
    const v7, 0x415170a4    # 13.09f

    .line 91
    .line 92
    .line 93
    const/high16 v8, 0x40400000    # 3.0f

    .line 94
    .line 95
    invoke-virtual/range {v4 .. v10}, Lbe5;->d(FFFFFF)V

    .line 96
    .line 97
    .line 98
    const/high16 v2, 0x40400000    # 3.0f

    .line 99
    .line 100
    const v5, 0x40bd1eb8    # 5.91f

    .line 101
    .line 102
    .line 103
    const/high16 v11, 0x41180000    # 9.5f

    .line 104
    .line 105
    invoke-virtual {v4, v2, v5, v2, v11}, Lbe5;->k(FFFF)V

    .line 106
    .line 107
    .line 108
    const/high16 v2, 0x41800000    # 16.0f

    .line 109
    .line 110
    invoke-virtual {v4, v5, v2, v11, v2}, Lbe5;->k(FFFF)V

    .line 111
    .line 112
    .line 113
    const v9, 0x40875c29    # 4.23f

    .line 114
    .line 115
    .line 116
    const v10, -0x40370a3d    # -1.57f

    .line 117
    .line 118
    .line 119
    const v5, 0x3fce147b    # 1.61f

    .line 120
    .line 121
    .line 122
    const/4 v6, 0x0

    .line 123
    const v7, 0x4045c28f    # 3.09f

    .line 124
    .line 125
    .line 126
    const v8, -0x40e8f5c3    # -0.59f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v4 .. v10}, Lbe5;->e(FFFFFF)V

    .line 130
    .line 131
    .line 132
    const v2, 0x3e8a3d71    # 0.27f

    .line 133
    .line 134
    .line 135
    const v5, 0x3e8f5c29    # 0.28f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v2, v5}, Lbe5;->i(FF)V

    .line 139
    .line 140
    .line 141
    const v2, 0x3f4a3d71    # 0.79f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4, v2}, Lbe5;->n(F)V

    .line 145
    .line 146
    .line 147
    const v2, 0x409fae14    # 4.99f

    .line 148
    .line 149
    .line 150
    const/high16 v12, 0x40a00000    # 5.0f

    .line 151
    .line 152
    invoke-virtual {v4, v12, v2}, Lbe5;->i(FF)V

    .line 153
    .line 154
    .line 155
    const v2, 0x41a3eb85    # 20.49f

    .line 156
    .line 157
    .line 158
    const/high16 v5, 0x41980000    # 19.0f

    .line 159
    .line 160
    invoke-virtual {v4, v2, v5}, Lbe5;->h(FF)V

    .line 161
    .line 162
    .line 163
    const v2, -0x3f6051ec    # -4.99f

    .line 164
    .line 165
    .line 166
    const/high16 v5, -0x3f600000    # -5.0f

    .line 167
    .line 168
    invoke-virtual {v4, v2, v5}, Lbe5;->i(FF)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4}, Lbe5;->c()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4, v11, v3}, Lbe5;->j(FF)V

    .line 175
    .line 176
    .line 177
    const/high16 v9, 0x40a00000    # 5.0f

    .line 178
    .line 179
    const/high16 v10, 0x41180000    # 9.5f

    .line 180
    .line 181
    const v5, 0x40e051ec    # 7.01f

    .line 182
    .line 183
    .line 184
    const/high16 v6, 0x41600000    # 14.0f

    .line 185
    .line 186
    const/high16 v7, 0x40a00000    # 5.0f

    .line 187
    .line 188
    const v8, 0x413fd70a    # 11.99f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v4 .. v10}, Lbe5;->d(FFFFFF)V

    .line 192
    .line 193
    .line 194
    const v2, 0x40e051ec    # 7.01f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v2, v12, v11, v12}, Lbe5;->k(FFFF)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v4, v3, v2, v3, v11}, Lbe5;->k(FFFF)V

    .line 201
    .line 202
    .line 203
    const v2, 0x413fd70a    # 11.99f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4, v2, v3, v11, v3}, Lbe5;->k(FFFF)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v4}, Lbe5;->c()V

    .line 210
    .line 211
    .line 212
    iget-object v2, v4, Lbe5;->a:Ljava/util/ArrayList;

    .line 213
    .line 214
    const/16 v3, 0x3800

    .line 215
    .line 216
    invoke-static {v1, v2, v0, v3}, Lw83;->a(Lw83;Ljava/util/List;Lky6;I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Lw83;->b()Lx83;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    sput-object v0, Lb35;->b:Lx83;

    .line 224
    .line 225
    return-object v0
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
.end method

.method public static s(Landroid/content/Context;)Ljava/io/File;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, ".font"

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, "-"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x0

    .line 43
    :goto_0
    const/16 v3, 0x64

    .line 44
    .line 45
    if-ge v2, v3, :cond_2

    .line 46
    .line 47
    new-instance v3, Ljava/io/File;

    .line 48
    .line 49
    new-instance v4, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-direct {v3, p0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    .line 68
    .line 69
    .line 70
    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    if-eqz v4, :cond_1

    .line 72
    .line 73
    return-object v3

    .line 74
    :catch_0
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    return-object v0
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
.end method

.method public static final t(Lh53;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-interface {p0}, Lh53;->a()Ldz2;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p0, p1, p2}, Lin8;->p0(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
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

.method public static u(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lc35;->h(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "proxy_notification_initialized"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const-string v0, "firebase_messaging_notification_delegation_enabled"

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/16 v3, 0x80

    .line 32
    .line 33
    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    goto :goto_0

    .line 56
    :catch_0
    :cond_1
    const/4 v0, 0x1

    .line 57
    :goto_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 58
    .line 59
    const/16 v2, 0x1d

    .line 60
    .line 61
    if-lt v1, v2, :cond_2

    .line 62
    .line 63
    new-instance v1, Lxb7;

    .line 64
    .line 65
    invoke-direct {v1}, Lxb7;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance v2, Lou5;

    .line 69
    .line 70
    invoke-direct {v2, p0, v0, v1}, Lou5;-><init>(Landroid/content/Context;ZLxb7;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Lou5;->run()V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    const/4 p0, 0x0

    .line 78
    invoke-static {p0}, Lb35;->l(Ljava/lang/Object;)Lyb9;

    .line 79
    .line 80
    .line 81
    :goto_1
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
.end method

.method public static final v(Lll6;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lll6;->u()Ln85;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Ln57;->l:Ln57;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Lll6;->j()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Lll6;->e()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const/4 v0, 0x1

    .line 27
    if-ne p0, v0, :cond_0

    .line 28
    .line 29
    return v0

    .line 30
    :cond_0
    const/4 p0, 0x0

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

.method public static w(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    const-string v0, "r"

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/FileInputStream;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    :try_start_2
    invoke-virtual {p1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    .line 38
    .line 39
    const-wide/16 v4, 0x0

    .line 40
    .line 41
    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 42
    .line 43
    .line 44
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 45
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    .line 47
    .line 48
    :try_start_4
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object p1, v0

    .line 54
    goto :goto_1

    .line 55
    :catchall_1
    move-exception v0

    .line 56
    move-object v2, v0

    .line 57
    :try_start_5
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_2
    move-exception v0

    .line 62
    move-object p1, v0

    .line 63
    :try_start_6
    invoke-virtual {v2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 67
    :goto_1
    :try_start_7
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catchall_3
    move-exception v0

    .line 72
    move-object p0, v0

    .line 73
    :try_start_8
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 77
    :catch_0
    :cond_1
    return-object v1
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

.method public static final x(Luu;)V
    .locals 8

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lio/github/jan/supabase/auth/a;

    .line 3
    .line 4
    iget-object v1, v0, Lio/github/jan/supabase/auth/a;->c:Lwu;

    .line 5
    .line 6
    iget-boolean v1, v1, Lwu;->z:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-static {p0}, Lp25;->s(Luu;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v1, Lgp5;->E:Lgp5;

    .line 15
    .line 16
    iget-object v3, v1, Lgp5;->B:Lw54;

    .line 17
    .line 18
    iget-object v5, v0, Lio/github/jan/supabase/auth/a;->h:Lig0;

    .line 19
    .line 20
    sget-object v0, Law1;->a:Ldn1;

    .line 21
    .line 22
    sget-object v0, Lpe4;->a:Lgy2;

    .line 23
    .line 24
    new-instance v2, Lgv;

    .line 25
    .line 26
    const/16 v7, 0xa

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    move-object v4, p0

    .line 30
    invoke-direct/range {v2 .. v7}, Lgv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x2

    .line 34
    invoke-static {v5, v0, v6, v2, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void
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

.method public static final y(Lsi7;Lgs2;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lsg6;->B:Lf61;

    .line 2
    .line 3
    invoke-interface {v0}, Lf61;->r()Le81;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lt49;->M(Le81;)Lso1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p0, Lsi7;->C:J

    .line 12
    .line 13
    iget-object v3, p0, Lb1;->A:Le81;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2, p0, v3}, Lso1;->a(JLsi7;Le81;)Lmw1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lpw1;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lpw1;-><init>(Lmw1;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-static {p0, v0, v1}, Lr16;->W(Lel3;ZLgl3;)Lmw1;

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-static {p0, v0, p0, p1}, Lo55;->t(Lsg6;ZLsg6;Lgs2;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
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

.method public static final z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, " could not find any NavType for argument "

    .line 2
    .line 3
    const-string v1, " of type "

    .line 4
    .line 5
    const-string v2, "Route "

    .line 6
    .line 7
    invoke-static {v2, p2, v0, p0, v1}, Lf21;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string p2, " - typeMap received was "

    .line 12
    .line 13
    invoke-static {p0, p1, p2, p3}, Lf21;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
