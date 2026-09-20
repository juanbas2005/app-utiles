.class public final Lf73;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/io/Serializable;

.field public e:Ljava/io/Serializable;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Lf73;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string p1, ""

    .line 10
    .line 11
    iput-object p1, p0, Lf73;->d:Ljava/io/Serializable;

    .line 12
    .line 13
    iput-object p1, p0, Lf73;->e:Ljava/io/Serializable;

    .line 14
    .line 15
    const/4 v0, -0x1

    .line 16
    iput v0, p0, Lf73;->b:I

    .line 17
    .line 18
    filled-new-array {p1}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Lsg3;->I([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lf73;->h:Ljava/lang/Object;

    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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

.method public constructor <init>(Lrq6;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf73;->a:I

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    invoke-virtual {p0}, Lf73;->e()V

    .line 35
    sget-object v0, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-virtual {p0, v0, p1}, Lf73;->b([ILrq6;)V

    return-void
.end method

.method public static g(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gt v1, v2, :cond_3

    .line 12
    .line 13
    const/16 v2, 0x26

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-static {p0, v2, v1, v3}, Ld57;->F0(Ljava/lang/CharSequence;CII)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :cond_0
    const/16 v5, 0x3d

    .line 28
    .line 29
    invoke-static {p0, v5, v1, v3}, Ld57;->F0(Ljava/lang/CharSequence;CII)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eq v3, v4, :cond_2

    .line 34
    .line 35
    if-le v3, v2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :goto_2
    add-int/lit8 v1, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    return-object v0
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lf73;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lf73;->i:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lf73;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const/16 v2, 0x5b

    .line 23
    .line 24
    const-string v3, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~"

    .line 25
    .line 26
    invoke-static {v1, v1, v2, p1, v3}, Lie1;->v(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lf73;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    invoke-static {v1, v1, v2, p2, v3}, Lie1;->v(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    :goto_0
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    return-void
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

.method public b([ILrq6;)V
    .locals 5

    .line 1
    iget v0, p0, Lf73;->b:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    array-length v1, p1

    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    :cond_0
    iput-object p2, p0, Lf73;->c:Ljava/lang/Object;

    .line 9
    .line 10
    :cond_1
    iget-object v1, p0, Lf73;->d:Ljava/io/Serializable;

    .line 11
    .line 12
    check-cast v1, [[I

    .line 13
    .line 14
    array-length v2, v1

    .line 15
    if-lt v0, v2, :cond_2

    .line 16
    .line 17
    add-int/lit8 v2, v0, 0xa

    .line 18
    .line 19
    new-array v3, v2, [[I

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static {v1, v4, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    iput-object v3, p0, Lf73;->d:Ljava/io/Serializable;

    .line 26
    .line 27
    new-array v1, v2, [Lrq6;

    .line 28
    .line 29
    iget-object v2, p0, Lf73;->e:Ljava/io/Serializable;

    .line 30
    .line 31
    check-cast v2, [Lrq6;

    .line 32
    .line 33
    invoke-static {v2, v4, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lf73;->e:Ljava/io/Serializable;

    .line 37
    .line 38
    :cond_2
    iget-object v0, p0, Lf73;->d:Ljava/io/Serializable;

    .line 39
    .line 40
    check-cast v0, [[I

    .line 41
    .line 42
    iget v1, p0, Lf73;->b:I

    .line 43
    .line 44
    aput-object p1, v0, v1

    .line 45
    .line 46
    iget-object p1, p0, Lf73;->e:Ljava/io/Serializable;

    .line 47
    .line 48
    check-cast p1, [Lrq6;

    .line 49
    .line 50
    aput-object p2, p1, v1

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    iput v1, p0, Lf73;->b:I

    .line 55
    .line 56
    return-void
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

.method public c()Lg73;
    .locals 12

    .line 1
    iget-object v0, p0, Lf73;->c:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, Ljava/lang/String;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz v2, :cond_6

    .line 8
    .line 9
    iget-object v1, p0, Lf73;->d:Ljava/io/Serializable;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x7

    .line 15
    invoke-static {v3, v3, v4, v1}, Lie1;->T(IIILjava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v5, p0, Lf73;->e:Ljava/io/Serializable;

    .line 20
    .line 21
    check-cast v5, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v3, v3, v4, v5}, Lie1;->T(IIILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-object v6, p0, Lf73;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v6, :cond_5

    .line 32
    .line 33
    move v7, v4

    .line 34
    move-object v4, v5

    .line 35
    move-object v5, v6

    .line 36
    invoke-virtual {p0}, Lf73;->d()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    iget-object v8, p0, Lf73;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v8, Ljava/util/ArrayList;

    .line 43
    .line 44
    new-instance v9, Ljava/util/ArrayList;

    .line 45
    .line 46
    const/16 v10, 0xa

    .line 47
    .line 48
    invoke-static {v8, v10}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v11

    .line 63
    if-eqz v11, :cond_0

    .line 64
    .line 65
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    check-cast v11, Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v3, v3, v7, v11}, Lie1;->T(IIILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    iget-object v8, p0, Lf73;->i:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v8, Ljava/util/ArrayList;

    .line 82
    .line 83
    if-eqz v8, :cond_2

    .line 84
    .line 85
    new-instance v9, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-static {v8, v10}, Let0;->e0(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-eqz v10, :cond_3

    .line 103
    .line 104
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    check-cast v10, Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v10, :cond_1

    .line 111
    .line 112
    const/4 v11, 0x3

    .line 113
    invoke-static {v3, v3, v11, v10}, Lie1;->T(IIILjava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    goto :goto_2

    .line 118
    :cond_1
    move-object v10, v0

    .line 119
    :goto_2
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    move-object v9, v0

    .line 124
    :cond_3
    iget-object v8, p0, Lf73;->g:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v8, Ljava/lang/String;

    .line 127
    .line 128
    if-eqz v8, :cond_4

    .line 129
    .line 130
    invoke-static {v3, v3, v7, v8}, Lie1;->T(IIILjava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :cond_4
    move-object v8, v0

    .line 135
    invoke-virtual {p0}, Lf73;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    move-object v3, v1

    .line 140
    new-instance v1, Lg73;

    .line 141
    .line 142
    move-object v7, v9

    .line 143
    move-object v9, p0

    .line 144
    invoke-direct/range {v1 .. v9}, Lg73;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return-object v1

    .line 148
    :cond_5
    const-string p0, "host == null"

    .line 149
    .line 150
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-object v0

    .line 154
    :cond_6
    const-string p0, "scheme == null"

    .line 155
    .line 156
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    return-object v0
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

.method public d()I
    .locals 2

    .line 1
    iget v0, p0, Lf73;->b:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object p0, p0, Lf73;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v0, "http"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x50

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string v0, "https"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x1bb

    .line 34
    .line 35
    :cond_2
    :goto_0
    return v1
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

.method public e()V
    .locals 2

    .line 1
    new-instance v0, Lrq6;

    .line 2
    .line 3
    invoke-direct {v0}, Lrq6;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lf73;->c:Ljava/lang/Object;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    new-array v1, v0, [[I

    .line 11
    .line 12
    iput-object v1, p0, Lf73;->d:Ljava/io/Serializable;

    .line 13
    .line 14
    new-array v0, v0, [Lrq6;

    .line 15
    .line 16
    iput-object v0, p0, Lf73;->e:Ljava/io/Serializable;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public f(Lg73;Ljava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Lf73;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v4, Ldg8;->a:[B

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-static {v5, v4, v2}, Ldg8;->h(IILjava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-static {v4, v6, v2}, Ldg8;->i(IILjava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    sub-int v7, v6, v4

    .line 34
    .line 35
    const/16 v8, 0x30

    .line 36
    .line 37
    const/16 v9, 0x5b

    .line 38
    .line 39
    const/16 v10, 0x3a

    .line 40
    .line 41
    const/4 v11, -0x1

    .line 42
    const/4 v12, 0x2

    .line 43
    if-ge v7, v12, :cond_1

    .line 44
    .line 45
    :cond_0
    :goto_0
    move v7, v11

    .line 46
    goto :goto_3

    .line 47
    :cond_1
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const/16 v13, 0x61

    .line 52
    .line 53
    invoke-static {v7, v13}, Lsg3;->k(II)I

    .line 54
    .line 55
    .line 56
    move-result v14

    .line 57
    const/16 v15, 0x41

    .line 58
    .line 59
    if-ltz v14, :cond_2

    .line 60
    .line 61
    const/16 v14, 0x7a

    .line 62
    .line 63
    invoke-static {v7, v14}, Lsg3;->k(II)I

    .line 64
    .line 65
    .line 66
    move-result v14

    .line 67
    if-lez v14, :cond_3

    .line 68
    .line 69
    :cond_2
    invoke-static {v7, v15}, Lsg3;->k(II)I

    .line 70
    .line 71
    .line 72
    move-result v14

    .line 73
    if-ltz v14, :cond_0

    .line 74
    .line 75
    const/16 v14, 0x5a

    .line 76
    .line 77
    invoke-static {v7, v14}, Lsg3;->k(II)I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-lez v7, :cond_3

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    add-int/lit8 v7, v4, 0x1

    .line 85
    .line 86
    :goto_1
    if-ge v7, v6, :cond_0

    .line 87
    .line 88
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    if-gt v13, v14, :cond_4

    .line 93
    .line 94
    const/16 v13, 0x7b

    .line 95
    .line 96
    if-ge v14, v13, :cond_4

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    if-gt v15, v14, :cond_5

    .line 100
    .line 101
    if-ge v14, v9, :cond_5

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    if-gt v8, v14, :cond_6

    .line 105
    .line 106
    if-ge v14, v10, :cond_6

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_6
    const/16 v13, 0x2b

    .line 110
    .line 111
    if-eq v14, v13, :cond_8

    .line 112
    .line 113
    const/16 v13, 0x2d

    .line 114
    .line 115
    if-eq v14, v13, :cond_8

    .line 116
    .line 117
    const/16 v13, 0x2e

    .line 118
    .line 119
    if-ne v14, v13, :cond_7

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_7
    if-ne v14, v10, :cond_0

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_8
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 126
    .line 127
    const/16 v13, 0x61

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :goto_3
    const-string v13, "http"

    .line 131
    .line 132
    const-string v14, "https"

    .line 133
    .line 134
    const/4 v15, 0x1

    .line 135
    if-eq v7, v11, :cond_b

    .line 136
    .line 137
    const-string v8, "https:"

    .line 138
    .line 139
    invoke-static {v4, v2, v8, v15}, Lk57;->t0(ILjava/lang/String;Ljava/lang/String;Z)Z

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    if-eqz v8, :cond_9

    .line 144
    .line 145
    iput-object v14, v0, Lf73;->c:Ljava/lang/Object;

    .line 146
    .line 147
    add-int/lit8 v4, v4, 0x6

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_9
    const-string v8, "http:"

    .line 151
    .line 152
    invoke-static {v4, v2, v8, v15}, Lk57;->t0(ILjava/lang/String;Ljava/lang/String;Z)Z

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    if-eqz v8, :cond_a

    .line 157
    .line 158
    iput-object v13, v0, Lf73;->c:Ljava/lang/Object;

    .line 159
    .line 160
    add-int/lit8 v4, v4, 0x5

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 164
    .line 165
    invoke-virtual {v2, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    new-instance v2, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    const-string v3, "Expected URL scheme \'http\' or \'https\' but was \'"

    .line 172
    .line 173
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const/16 v1, 0x27

    .line 180
    .line 181
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v0

    .line 192
    :cond_b
    if-eqz v1, :cond_30

    .line 193
    .line 194
    iget-object v7, v1, Lg73;->a:Ljava/lang/String;

    .line 195
    .line 196
    iput-object v7, v0, Lf73;->c:Ljava/lang/Object;

    .line 197
    .line 198
    :goto_4
    move v7, v4

    .line 199
    move v8, v5

    .line 200
    move/from16 v16, v15

    .line 201
    .line 202
    :goto_5
    const/16 v15, 0x5c

    .line 203
    .line 204
    const/16 v9, 0x2f

    .line 205
    .line 206
    if-ge v7, v6, :cond_d

    .line 207
    .line 208
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    if-eq v10, v9, :cond_c

    .line 213
    .line 214
    if-eq v10, v15, :cond_c

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_c
    add-int/lit8 v8, v8, 0x1

    .line 218
    .line 219
    add-int/lit8 v7, v7, 0x1

    .line 220
    .line 221
    const/16 v9, 0x5b

    .line 222
    .line 223
    const/16 v10, 0x3a

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_d
    :goto_6
    const-string v10, " \"\'<>#"

    .line 227
    .line 228
    const-string v7, ""

    .line 229
    .line 230
    const/16 v15, 0x23

    .line 231
    .line 232
    if-ge v8, v12, :cond_11

    .line 233
    .line 234
    if-eqz v1, :cond_11

    .line 235
    .line 236
    iget-object v12, v1, Lg73;->a:Ljava/lang/String;

    .line 237
    .line 238
    iget-object v9, v0, Lf73;->c:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v9, Ljava/lang/String;

    .line 241
    .line 242
    invoke-static {v12, v9}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v9

    .line 246
    if-nez v9, :cond_e

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_e
    invoke-virtual {v1}, Lg73;->e()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    iput-object v8, v0, Lf73;->d:Ljava/io/Serializable;

    .line 254
    .line 255
    invoke-virtual {v1}, Lg73;->a()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    iput-object v8, v0, Lf73;->e:Ljava/io/Serializable;

    .line 260
    .line 261
    iget-object v8, v1, Lg73;->d:Ljava/lang/String;

    .line 262
    .line 263
    iput-object v8, v0, Lf73;->f:Ljava/lang/Object;

    .line 264
    .line 265
    iget v8, v1, Lg73;->e:I

    .line 266
    .line 267
    iput v8, v0, Lf73;->b:I

    .line 268
    .line 269
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Lg73;->c()Ljava/util/ArrayList;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 277
    .line 278
    .line 279
    if-eq v4, v6, :cond_f

    .line 280
    .line 281
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 282
    .line 283
    .line 284
    move-result v8

    .line 285
    if-ne v8, v15, :cond_21

    .line 286
    .line 287
    :cond_f
    invoke-virtual {v1}, Lg73;->d()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    if-eqz v1, :cond_10

    .line 292
    .line 293
    const/16 v8, 0x53

    .line 294
    .line 295
    invoke-static {v5, v5, v8, v1, v10}, Lie1;->v(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-static {v1}, Lf73;->g(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    goto :goto_7

    .line 304
    :cond_10
    const/4 v1, 0x0

    .line 305
    :goto_7
    iput-object v1, v0, Lf73;->i:Ljava/lang/Object;

    .line 306
    .line 307
    goto/16 :goto_12

    .line 308
    .line 309
    :cond_11
    :goto_8
    add-int/2addr v4, v8

    .line 310
    move v1, v5

    .line 311
    move v8, v1

    .line 312
    :goto_9
    const-string v9, "@/\\?#"

    .line 313
    .line 314
    invoke-static {v4, v6, v2, v9}, Ldg8;->c(IILjava/lang/String;Ljava/lang/String;)I

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    if-eq v9, v6, :cond_12

    .line 319
    .line 320
    invoke-virtual {v2, v9}, Ljava/lang/String;->charAt(I)C

    .line 321
    .line 322
    .line 323
    move-result v12

    .line 324
    goto :goto_a

    .line 325
    :cond_12
    move v12, v11

    .line 326
    :goto_a
    if-eq v12, v11, :cond_17

    .line 327
    .line 328
    if-eq v12, v15, :cond_17

    .line 329
    .line 330
    const/16 v5, 0x2f

    .line 331
    .line 332
    if-eq v12, v5, :cond_17

    .line 333
    .line 334
    const/16 v5, 0x5c

    .line 335
    .line 336
    if-eq v12, v5, :cond_17

    .line 337
    .line 338
    const/16 v5, 0x3f

    .line 339
    .line 340
    if-eq v12, v5, :cond_17

    .line 341
    .line 342
    const/16 v5, 0x40

    .line 343
    .line 344
    if-eq v12, v5, :cond_13

    .line 345
    .line 346
    const/4 v5, 0x0

    .line 347
    goto :goto_9

    .line 348
    :cond_13
    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    .line 349
    .line 350
    const-string v12, "%40"

    .line 351
    .line 352
    if-nez v1, :cond_16

    .line 353
    .line 354
    const/16 v15, 0x3a

    .line 355
    .line 356
    invoke-static {v2, v15, v4, v9}, Ldg8;->d(Ljava/lang/String;CII)I

    .line 357
    .line 358
    .line 359
    move-result v11

    .line 360
    const/16 v15, 0x70

    .line 361
    .line 362
    invoke-static {v4, v11, v15, v2, v5}, Lie1;->v(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    if-eqz v8, :cond_14

    .line 367
    .line 368
    new-instance v8, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 371
    .line 372
    .line 373
    iget-object v15, v0, Lf73;->d:Ljava/io/Serializable;

    .line 374
    .line 375
    check-cast v15, Ljava/lang/String;

    .line 376
    .line 377
    invoke-static {v8, v15, v12, v4}, Lf21;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    :cond_14
    iput-object v4, v0, Lf73;->d:Ljava/io/Serializable;

    .line 382
    .line 383
    if-eq v11, v9, :cond_15

    .line 384
    .line 385
    add-int/lit8 v11, v11, 0x1

    .line 386
    .line 387
    const/16 v15, 0x70

    .line 388
    .line 389
    invoke-static {v11, v9, v15, v2, v5}, Lie1;->v(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    iput-object v1, v0, Lf73;->e:Ljava/io/Serializable;

    .line 394
    .line 395
    move/from16 v1, v16

    .line 396
    .line 397
    goto :goto_b

    .line 398
    :cond_15
    const/16 v15, 0x70

    .line 399
    .line 400
    :goto_b
    move/from16 v8, v16

    .line 401
    .line 402
    goto :goto_c

    .line 403
    :cond_16
    const/16 v15, 0x70

    .line 404
    .line 405
    new-instance v11, Ljava/lang/StringBuilder;

    .line 406
    .line 407
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 408
    .line 409
    .line 410
    iget-object v15, v0, Lf73;->e:Ljava/io/Serializable;

    .line 411
    .line 412
    check-cast v15, Ljava/lang/String;

    .line 413
    .line 414
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    const/16 v15, 0x70

    .line 421
    .line 422
    invoke-static {v4, v9, v15, v2, v5}, Lie1;->v(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v4

    .line 426
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    iput-object v4, v0, Lf73;->e:Ljava/io/Serializable;

    .line 434
    .line 435
    :goto_c
    add-int/lit8 v4, v9, 0x1

    .line 436
    .line 437
    const/4 v5, 0x0

    .line 438
    const/4 v11, -0x1

    .line 439
    const/16 v15, 0x23

    .line 440
    .line 441
    goto/16 :goto_9

    .line 442
    .line 443
    :cond_17
    move v1, v4

    .line 444
    :goto_d
    if-ge v1, v9, :cond_1a

    .line 445
    .line 446
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    const/16 v15, 0x3a

    .line 451
    .line 452
    if-eq v5, v15, :cond_1b

    .line 453
    .line 454
    const/16 v8, 0x5b

    .line 455
    .line 456
    if-eq v5, v8, :cond_18

    .line 457
    .line 458
    goto :goto_e

    .line 459
    :cond_18
    add-int/lit8 v1, v1, 0x1

    .line 460
    .line 461
    if-ge v1, v9, :cond_19

    .line 462
    .line 463
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 464
    .line 465
    .line 466
    move-result v5

    .line 467
    const/16 v11, 0x5d

    .line 468
    .line 469
    if-ne v5, v11, :cond_18

    .line 470
    .line 471
    :cond_19
    :goto_e
    add-int/lit8 v1, v1, 0x1

    .line 472
    .line 473
    goto :goto_d

    .line 474
    :cond_1a
    move v1, v9

    .line 475
    :cond_1b
    add-int/lit8 v5, v1, 0x1

    .line 476
    .line 477
    const/4 v8, 0x4

    .line 478
    const/16 v11, 0x22

    .line 479
    .line 480
    if-ge v5, v9, :cond_1e

    .line 481
    .line 482
    invoke-static {v4, v1, v8, v2}, Lie1;->T(IIILjava/lang/String;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v8

    .line 486
    invoke-static {v8}, Lbg8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v8

    .line 490
    iput-object v8, v0, Lf73;->f:Ljava/lang/Object;

    .line 491
    .line 492
    const/16 v8, 0x78

    .line 493
    .line 494
    :try_start_0
    invoke-static {v5, v9, v8, v2, v7}, Lie1;->v(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v8

    .line 498
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 499
    .line 500
    .line 501
    move-result v8
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 502
    move/from16 v12, v16

    .line 503
    .line 504
    if-gt v12, v8, :cond_1c

    .line 505
    .line 506
    const/high16 v12, 0x10000

    .line 507
    .line 508
    if-ge v8, v12, :cond_1c

    .line 509
    .line 510
    goto :goto_f

    .line 511
    :catch_0
    :cond_1c
    const/4 v8, -0x1

    .line 512
    :goto_f
    iput v8, v0, Lf73;->b:I

    .line 513
    .line 514
    const/4 v12, -0x1

    .line 515
    if-eq v8, v12, :cond_1d

    .line 516
    .line 517
    goto :goto_11

    .line 518
    :cond_1d
    const-string v0, "Invalid URL port: \""

    .line 519
    .line 520
    invoke-virtual {v2, v5, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    invoke-static {v11, v1, v0}, Lrf2;->f(ILjava/lang/Object;Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    return-void

    .line 528
    :cond_1e
    const/4 v12, -0x1

    .line 529
    invoke-static {v4, v1, v8, v2}, Lie1;->T(IIILjava/lang/String;)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    invoke-static {v5}, Lbg8;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    iput-object v5, v0, Lf73;->f:Ljava/lang/Object;

    .line 538
    .line 539
    iget-object v5, v0, Lf73;->c:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v5, Ljava/lang/String;

    .line 542
    .line 543
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v5, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v8

    .line 550
    if-eqz v8, :cond_1f

    .line 551
    .line 552
    const/16 v5, 0x50

    .line 553
    .line 554
    goto :goto_10

    .line 555
    :cond_1f
    invoke-virtual {v5, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 556
    .line 557
    .line 558
    move-result v5

    .line 559
    if-eqz v5, :cond_20

    .line 560
    .line 561
    const/16 v5, 0x1bb

    .line 562
    .line 563
    goto :goto_10

    .line 564
    :cond_20
    move v5, v12

    .line 565
    :goto_10
    iput v5, v0, Lf73;->b:I

    .line 566
    .line 567
    :goto_11
    iget-object v5, v0, Lf73;->f:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast v5, Ljava/lang/String;

    .line 570
    .line 571
    if-eqz v5, :cond_2f

    .line 572
    .line 573
    move v4, v9

    .line 574
    :cond_21
    :goto_12
    const-string v1, "?#"

    .line 575
    .line 576
    invoke-static {v4, v6, v2, v1}, Ldg8;->c(IILjava/lang/String;Ljava/lang/String;)I

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    if-ne v4, v1, :cond_22

    .line 581
    .line 582
    goto/16 :goto_18

    .line 583
    .line 584
    :cond_22
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 585
    .line 586
    .line 587
    move-result v5

    .line 588
    const/16 v8, 0x2f

    .line 589
    .line 590
    if-eq v5, v8, :cond_23

    .line 591
    .line 592
    const/16 v8, 0x5c

    .line 593
    .line 594
    if-eq v5, v8, :cond_23

    .line 595
    .line 596
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 597
    .line 598
    .line 599
    move-result v5

    .line 600
    const/16 v16, 0x1

    .line 601
    .line 602
    add-int/lit8 v5, v5, -0x1

    .line 603
    .line 604
    invoke-virtual {v3, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    goto :goto_13

    .line 608
    :cond_23
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    add-int/lit8 v4, v4, 0x1

    .line 615
    .line 616
    :goto_13
    if-ge v4, v1, :cond_2c

    .line 617
    .line 618
    const-string v5, "/\\"

    .line 619
    .line 620
    invoke-static {v4, v1, v2, v5}, Ldg8;->c(IILjava/lang/String;Ljava/lang/String;)I

    .line 621
    .line 622
    .line 623
    move-result v5

    .line 624
    if-ge v5, v1, :cond_24

    .line 625
    .line 626
    const/4 v12, 0x1

    .line 627
    goto :goto_14

    .line 628
    :cond_24
    const/4 v12, 0x0

    .line 629
    :goto_14
    const-string v8, " \"<>^`{}|/\\?#"

    .line 630
    .line 631
    const/16 v15, 0x70

    .line 632
    .line 633
    invoke-static {v4, v5, v15, v2, v8}, Lie1;->v(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v4

    .line 637
    const-string v8, "."

    .line 638
    .line 639
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v8

    .line 643
    if-nez v8, :cond_2a

    .line 644
    .line 645
    const-string v8, "%2e"

    .line 646
    .line 647
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 648
    .line 649
    .line 650
    move-result v8

    .line 651
    if-eqz v8, :cond_25

    .line 652
    .line 653
    goto :goto_17

    .line 654
    :cond_25
    const-string v8, ".."

    .line 655
    .line 656
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    move-result v8

    .line 660
    if-nez v8, :cond_28

    .line 661
    .line 662
    const-string v8, "%2e."

    .line 663
    .line 664
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 665
    .line 666
    .line 667
    move-result v8

    .line 668
    if-nez v8, :cond_28

    .line 669
    .line 670
    const-string v8, ".%2e"

    .line 671
    .line 672
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 673
    .line 674
    .line 675
    move-result v8

    .line 676
    if-nez v8, :cond_28

    .line 677
    .line 678
    const-string v8, "%2e%2e"

    .line 679
    .line 680
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 681
    .line 682
    .line 683
    move-result v8

    .line 684
    if-eqz v8, :cond_26

    .line 685
    .line 686
    goto :goto_16

    .line 687
    :cond_26
    const/4 v8, 0x1

    .line 688
    invoke-static {v8, v3}, Lb81;->k(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v9

    .line 692
    check-cast v9, Ljava/lang/CharSequence;

    .line 693
    .line 694
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 695
    .line 696
    .line 697
    move-result v9

    .line 698
    if-nez v9, :cond_27

    .line 699
    .line 700
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 701
    .line 702
    .line 703
    move-result v9

    .line 704
    sub-int/2addr v9, v8

    .line 705
    invoke-virtual {v3, v9, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    goto :goto_15

    .line 709
    :cond_27
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    :goto_15
    if-eqz v12, :cond_2a

    .line 713
    .line 714
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    goto :goto_17

    .line 718
    :cond_28
    :goto_16
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 719
    .line 720
    .line 721
    move-result v4

    .line 722
    const/16 v16, 0x1

    .line 723
    .line 724
    add-int/lit8 v4, v4, -0x1

    .line 725
    .line 726
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v4

    .line 730
    check-cast v4, Ljava/lang/String;

    .line 731
    .line 732
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 733
    .line 734
    .line 735
    move-result v4

    .line 736
    if-nez v4, :cond_29

    .line 737
    .line 738
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 739
    .line 740
    .line 741
    move-result v4

    .line 742
    if-nez v4, :cond_29

    .line 743
    .line 744
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 745
    .line 746
    .line 747
    move-result v4

    .line 748
    add-int/lit8 v4, v4, -0x1

    .line 749
    .line 750
    invoke-virtual {v3, v4, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    goto :goto_17

    .line 754
    :cond_29
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    :cond_2a
    :goto_17
    if-eqz v12, :cond_2b

    .line 758
    .line 759
    add-int/lit8 v4, v5, 0x1

    .line 760
    .line 761
    goto/16 :goto_13

    .line 762
    .line 763
    :cond_2b
    move v4, v5

    .line 764
    goto/16 :goto_13

    .line 765
    .line 766
    :cond_2c
    :goto_18
    if-ge v1, v6, :cond_2d

    .line 767
    .line 768
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 769
    .line 770
    .line 771
    move-result v3

    .line 772
    const/16 v5, 0x3f

    .line 773
    .line 774
    if-ne v3, v5, :cond_2d

    .line 775
    .line 776
    const/16 v3, 0x23

    .line 777
    .line 778
    invoke-static {v2, v3, v1, v6}, Ldg8;->d(Ljava/lang/String;CII)I

    .line 779
    .line 780
    .line 781
    move-result v4

    .line 782
    add-int/lit8 v1, v1, 0x1

    .line 783
    .line 784
    const/16 v3, 0x50

    .line 785
    .line 786
    invoke-static {v1, v4, v3, v2, v10}, Lie1;->v(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v1

    .line 790
    invoke-static {v1}, Lf73;->g(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    iput-object v1, v0, Lf73;->i:Ljava/lang/Object;

    .line 795
    .line 796
    move v1, v4

    .line 797
    :cond_2d
    if-ge v1, v6, :cond_2e

    .line 798
    .line 799
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 800
    .line 801
    .line 802
    move-result v3

    .line 803
    const/16 v4, 0x23

    .line 804
    .line 805
    if-ne v3, v4, :cond_2e

    .line 806
    .line 807
    const/16 v16, 0x1

    .line 808
    .line 809
    add-int/lit8 v1, v1, 0x1

    .line 810
    .line 811
    const/16 v3, 0x30

    .line 812
    .line 813
    invoke-static {v1, v6, v3, v2, v7}, Lie1;->v(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    iput-object v1, v0, Lf73;->g:Ljava/lang/Object;

    .line 818
    .line 819
    :cond_2e
    return-void

    .line 820
    :cond_2f
    const-string v0, "Invalid URL host: \""

    .line 821
    .line 822
    invoke-virtual {v2, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    invoke-static {v11, v1, v0}, Lrf2;->f(ILjava/lang/Object;Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    return-void

    .line 830
    :cond_30
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 831
    .line 832
    .line 833
    move-result v0

    .line 834
    const/4 v1, 0x6

    .line 835
    if-le v0, v1, :cond_31

    .line 836
    .line 837
    invoke-static {v1, v2}, Ld57;->i1(ILjava/lang/String;)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    const-string v1, "..."

    .line 842
    .line 843
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    goto :goto_19

    .line 848
    :cond_31
    move-object v0, v2

    .line 849
    :goto_19
    const-string v1, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    .line 850
    .line 851
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    invoke-static {v0}, Lh;->q(Ljava/lang/String;)V

    .line 856
    .line 857
    .line 858
    return-void
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
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lf73;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lf73;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "://"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v1, "//"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v1, p0, Lf73;->d:Ljava/io/Serializable;

    .line 37
    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/16 v2, 0x3a

    .line 45
    .line 46
    if-lez v1, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v1, p0, Lf73;->e:Ljava/io/Serializable;

    .line 50
    .line 51
    check-cast v1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-lez v1, :cond_3

    .line 58
    .line 59
    :goto_1
    iget-object v1, p0, Lf73;->d:Ljava/io/Serializable;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lf73;->e:Ljava/io/Serializable;

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-lez v1, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, Lf73;->e:Ljava/io/Serializable;

    .line 80
    .line 81
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    :cond_2
    const/16 v1, 0x40

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    :cond_3
    iget-object v1, p0, Lf73;->f:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, Ljava/lang/String;

    .line 94
    .line 95
    if-eqz v1, :cond_5

    .line 96
    .line 97
    invoke-static {v1, v2}, Ld57;->y0(Ljava/lang/CharSequence;C)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    const/16 v1, 0x5b

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lf73;->f:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const/16 v1, 0x5d

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    iget-object v1, p0, Lf73;->f:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    :cond_5
    :goto_2
    iget v1, p0, Lf73;->b:I

    .line 129
    .line 130
    const/4 v3, -0x1

    .line 131
    if-ne v1, v3, :cond_6

    .line 132
    .line 133
    iget-object v1, p0, Lf73;->c:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, Ljava/lang/String;

    .line 136
    .line 137
    if-eqz v1, :cond_a

    .line 138
    .line 139
    :cond_6
    invoke-virtual {p0}, Lf73;->d()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    iget-object v4, p0, Lf73;->c:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v4, Ljava/lang/String;

    .line 146
    .line 147
    if-eqz v4, :cond_9

    .line 148
    .line 149
    const-string v5, "http"

    .line 150
    .line 151
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_7

    .line 156
    .line 157
    const/16 v3, 0x50

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    const-string v5, "https"

    .line 161
    .line 162
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_8

    .line 167
    .line 168
    const/16 v3, 0x1bb

    .line 169
    .line 170
    :cond_8
    :goto_3
    if-eq v1, v3, :cond_a

    .line 171
    .line 172
    :cond_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    :cond_a
    iget-object v1, p0, Lf73;->h:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v1, Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    const/4 v3, 0x0

    .line 187
    :goto_4
    if-ge v3, v2, :cond_b

    .line 188
    .line 189
    const/16 v4, 0x2f

    .line 190
    .line 191
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    check-cast v4, Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    add-int/lit8 v3, v3, 0x1

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_b
    iget-object v1, p0, Lf73;->i:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v1, Ljava/util/ArrayList;

    .line 209
    .line 210
    if-eqz v1, :cond_c

    .line 211
    .line 212
    const/16 v1, 0x3f

    .line 213
    .line 214
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    iget-object v1, p0, Lf73;->i:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v1, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v1}, Lhr2;->k(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 225
    .line 226
    .line 227
    :cond_c
    iget-object v1, p0, Lf73;->g:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v1, Ljava/lang/String;

    .line 230
    .line 231
    if-eqz v1, :cond_d

    .line 232
    .line 233
    const/16 v1, 0x23

    .line 234
    .line 235
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    iget-object p0, p0, Lf73;->g:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p0, Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    :cond_d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    return-object p0

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
